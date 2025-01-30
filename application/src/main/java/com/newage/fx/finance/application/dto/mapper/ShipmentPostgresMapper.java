package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.ShipmentPostgressRequestDTO;
import com.newage.fx.finance.application.dto.response.ShipmentsHeaderResponseDTO;
import com.newage.fx.finance.domain.entity.EventDetail;
import com.newage.fx.finance.domain.entity.MasterHeader;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.entity.ShipmentServiceDetail;
import com.newage.fx.finance.domain.enums.ShipmentStatus;
import com.newage.fx.finance.service.MasterHeaderService;
import com.newage.fx.finance.service.client.MasterDataServiceClient;
import com.newage.fx.finance.service.client.dto.response.ClientResponseDTO;
import com.newage.fx.finance.service.client.dto.response.CountryResponseDTO;
import com.newage.fx.finance.service.client.dto.response.PortResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class ShipmentPostgresMapper implements DTOMapper<ShipmentHeader, ShipmentPostgressRequestDTO, ShipmentsHeaderResponseDTO>{

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MasterDataServiceClient masterDataServiceClient;
    @Autowired
    private MasterHeaderService masterHeaderService;
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yy");

    @Override
    public ShipmentsHeaderResponseDTO convertEntityToResponseDTO(ShipmentHeader shipmentHeader) {
        ShipmentsHeaderResponseDTO shipmentHeaderResponseDTO = new ShipmentsHeaderResponseDTO();
        shipmentHeaderResponseDTO.setId(shipmentHeader.getShipmentUid());


        if(shipmentHeader.getShipmentDate()!=null) {
            String formattedBookingDate = formatDate(shipmentHeader.getShipmentDate(), outputFormatter);
            shipmentHeaderResponseDTO.setBooked_on(formattedBookingDate);
        }

        shipmentHeaderResponseDTO.setMode(shipmentHeader.getServiceType());
        shipmentHeaderResponseDTO.setTos(shipmentHeader.getTosName());
        shipmentHeaderResponseDTO.setOrigin(shipmentHeader.getOriginName());
        shipmentHeaderResponseDTO.setDestination(shipmentHeader.getDestinationName());

        if(shipmentHeader.getAddlDetail()!=null){
            shipmentHeaderResponseDTO.setHbl_number(shipmentHeader.getAddlDetail().getTransportDocumentNo());
            shipmentHeaderResponseDTO.setOrder_no(shipmentHeader.getAddlDetail().getPoNumber());
            shipmentHeaderResponseDTO.setShipper_ref_no(shipmentHeader.getAddlDetail().getShipperRefNo());


            if(shipmentHeader.getAddlDetail().getEta()!=null) {
                String formattedEta = formatDate(shipmentHeader.getAddlDetail().getEta(), outputFormatter);

                shipmentHeaderResponseDTO.setEtaAta(formattedEta);
            }
            if(shipmentHeader.getAddlDetail().getEtd()!=null) {
                String formattedEtd = formatDate(shipmentHeader.getAddlDetail().getEtd(), outputFormatter);
                shipmentHeaderResponseDTO.setEtdAtd(formattedEtd);
            }
        }
        if(shipmentHeader.getPartyDetail()!=null)
        {
            shipmentHeaderResponseDTO.setShipper_name(shipmentHeader.getPartyDetail().getShipperName());
            shipmentHeaderResponseDTO.setConsignee_name(shipmentHeader.getPartyDetail().getConsigneeName());
        }
//        if(shipmentHeader.getOriginId()!=null)
//        {
//            PortResponseDTO origin = masterDataServiceClient.getPortById(shipmentHeader.getOriginId()).getResult();
//            shipmentHeaderResponseDTO.setOriginCountryCode(origin.getCountryCode());
//
//        }
//        if(shipmentHeader.getDestinationId()!=null)
//        {
//            PortResponseDTO destination = masterDataServiceClient.getPortById(shipmentHeader.getDestinationId()).getResult();
//            shipmentHeaderResponseDTO.setDestinationCountryCode(destination.getCountryCode());
//
//        }

        List<MasterHeader> masterHeaders =masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {

                MasterHeader masterHeader = masterHeaders.get(0);
                if(masterHeader!=null){

                    if (masterHeader.getAta() != null) {
                        String formattedAta = formatDate(masterHeader.getAta(), outputFormatter);
                        shipmentHeaderResponseDTO.setEta_ata(formattedAta);
                    }
                    if (masterHeader.getAtd() != null) {
                        String formattedAtd = formatDate(masterHeader.getAtd(), outputFormatter);
                        shipmentHeaderResponseDTO.setEtd_atd(formattedAtd);
                    }
        }
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
            if (masterHeader.getEta() != null) {
                shipmentHeaderResponseDTO.setEstimated_arrival(dateFormat.format(masterHeader.getEta()));
            }
            if (masterHeader.getEtd() != null) {
                shipmentHeaderResponseDTO.setEstimated_departure(dateFormat.format(masterHeader.getEtd()));
            }
            if (masterHeader.getAta() != null) {
                shipmentHeaderResponseDTO.setActuval_arrival(dateFormat.format(masterHeader.getAta()));
            }

            if (masterHeader.getAtd() != null) {
                shipmentHeaderResponseDTO.setActual_departure(dateFormat.format(masterHeader.getAtd()));
            }
        }
        populateShipmentStatus(shipmentHeader, shipmentHeaderResponseDTO);

        return shipmentHeaderResponseDTO;
    }
    private String formatDate(Date date, DateTimeFormatter formatter) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(formatter);
    }
    private void populateShipmentStatus(ShipmentHeader shipmentHeader, ShipmentsHeaderResponseDTO responseDTO) {
        Date currentDate = new Date();
        Date ata = null, atd = null;


        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader != null) {
                ata = masterHeader.getAta();
                atd = masterHeader.getAtd();
            }
        }


        responseDTO.setStatus("In Transit");
        if (shipmentHeader.getStatus() != null && ShipmentStatus.Cancelled.equals(shipmentHeader.getStatus())) {
            responseDTO.setStatus("Cancelled");
            return;
        }

        if (shipmentHeader.getShipmentServices() != null && !shipmentHeader.getShipmentServices().isEmpty()) {
            ShipmentServiceDetail firstService = shipmentHeader.getShipmentServices().get(0);
            ShipmentStatus serviceStatus = firstService.getServiceStatus();
            Date eta = shipmentHeader.getAddlDetail() != null ? shipmentHeader.getAddlDetail().getEta() : null;

            if ((ShipmentStatus.Booked.equals(serviceStatus) || ShipmentStatus.Received.equals(serviceStatus)) &&
                    (eta == null || eta.after(currentDate))) {
                responseDTO.setStatus(("Booked"));
            }
        }


        String tos = shipmentHeader.getTosName();
        if (tos != null) {
            Optional<EventDetail> deliveryDateOpt = shipmentHeader.getEventDetail().stream()
                    .filter(e -> "Delivery Date".equals(e.getEventName()))
                    .findAny();

            if (("Delivered Duty Paid".equals(tos) || "Delivered at Place".equals(tos)) &&
                    deliveryDateOpt.isPresent() && deliveryDateOpt.get().getEventDate().before(currentDate)) {
                responseDTO.setStatus("Delivered");
            } else if (("Cost Insurance and Freight".equals(tos) || "Cost and Freight".equals(tos)) &&
                    shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getDoDate() != null &&
                    shipmentHeader.getAddlDetail().getDoDate().before(currentDate)) {
                responseDTO.setStatus("Delivered");
            } else if (("Free on Board".equals(tos) || "Ex Works".equals(tos) || "Free Carrier".equals(tos)) &&
                    ((ata != null && ata.before(currentDate)) ||
                            (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
                                    shipmentHeader.getAddlDetail().getEta().before(currentDate)))) {
                Optional<EventDetail> fddOpt = shipmentHeader.getEventDetail().stream()
                        .filter(e -> "FDD".equals(e.getEventCode()))
                        .findAny();
                if (fddOpt.isPresent()) {
                    responseDTO.setStatus("Delivered");
                }
            }
        }
        if ((ata != null && ata.before(currentDate)) ||
                (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
                        shipmentHeader.getAddlDetail().getEta().before(currentDate))) {
            responseDTO.setStatus("Arrived");
        }
    }

    @Override
    public ShipmentHeader convertCreateRequestToEntity(ShipmentPostgressRequestDTO shipmentPostgressRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(ShipmentPostgressRequestDTO shipmentPostgressRequestDTO, ShipmentHeader shipmentHeader) {

    }

    @Override
    public Page<ShipmentsHeaderResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<ShipmentHeader> shipmentHeaders) {
        List<ShipmentsHeaderResponseDTO> dtos = new ArrayList<>();
        shipmentHeaders.forEach(e -> dtos.add(convertEntityToResponseDTO(e)));
        return new PageImpl<>(dtos, pageRequest, shipmentHeaders.getTotalElements());
    }
}
