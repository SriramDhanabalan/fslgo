package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.ShipmentDSRRequestDTO;
import com.newage.fx.finance.application.dto.response.ShipmentDSRResponseDTO;
import com.newage.fx.finance.domain.entity.*;
import com.newage.fx.finance.domain.enums.ShipmentStatus;
import com.newage.fx.finance.service.MasterHeaderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Component
public class ShipmentPostgresDSRMapper implements DTOMapper<ShipmentHeader, ShipmentDSRRequestDTO, ShipmentDSRResponseDTO> {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private MasterHeaderService masterHeaderService;
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yy");

    // Keep existing methods unchanged
    @Override
    public ShipmentDSRResponseDTO convertEntityToResponseDTO(ShipmentHeader shipmentHeader) {
        // Existing implementation remains unchanged

//        ShipmentDSRResponseDTO shipmentDSRResponseDTO = new ShipmentDSRResponseDTO();
//        shipmentDSRResponseDTO.setSERVICE(shipmentHeader.getServiceType());
//        shipmentDSRResponseDTO.setORDER_NO(shipmentHeader.getAddlDetail().getPoNumber());
//        shipmentDSRResponseDTO.setBOOKING_NO(shipmentHeader.getShipmentUid());
//        shipmentDSRResponseDTO.setBOOKING_DATE(formatDate(shipmentHeader.getShipmentDate(), outputFormatter));
//        shipmentDSRResponseDTO.setORIGIN(shipmentHeader.getOriginName());
//        shipmentDSRResponseDTO.setPOL(shipmentHeader.getOriginName());
//        shipmentDSRResponseDTO.setPOD(shipmentHeader.getDestinationName());
//        shipmentDSRResponseDTO.setHOUSE_NO(shipmentHeader.getAddlDetail().getTransportDocumentNo());
//        shipmentDSRResponseDTO.setFINAL_DESTINATION(shipmentHeader.getDestinationName());
//        shipmentDSRResponseDTO.setPICKUP_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualPickupDate());
//        shipmentDSRResponseDTO.setCARGO_RECEIVED_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate());
//        shipmentDSRResponseDTO.setTERMS(shipmentHeader.getTosName());
//        shipmentDSRResponseDTO.setSHIPPER_NAME(shipmentHeader.getPartyDetail().getShipperName());
//        shipmentDSRResponseDTO.setCONSIGNEE_NAME(shipmentHeader.getPartyDetail().getConsigneeName());
//        shipmentDSRResponseDTO.setBILLING_PARTY(shipmentHeader.getPartyDetail().getForwarderId());
//        shipmentDSRResponseDTO.setIMPORT_EXPORT(shipmentHeader.getServiceType());
//
//        shipmentDSRResponseDTO.setSHIPPER_REFERENCE_NUMBER(shipmentHeader.getAddlDetail().getShipperRefNo());
//        shipmentDSRResponseDTO.setCARRIER_BOOKING_NO(shipmentHeader.getAddlDetail().getCarrierBookingNo());
//        shipmentDSRResponseDTO.setLICENCE_NO(shipmentHeader.getAddlDetail().getLcNumber());
//        shipmentDSRResponseDTO.setLICENCE_DATE(shipmentHeader.getAddlDetail().getLcExpiryDate());
//        shipmentDSRResponseDTO.setSUBJOB_UID(shipmentHeader.getShipmentUid());
//        shipmentDSRResponseDTO.setDO_DATE(shipmentHeader.getAddlDetail().getDoDate());
//        shipmentDSRResponseDTO.setDO_NUMBER(shipmentHeader.getAddlDetail().getDoNumber());

        ShipmentDSRResponseDTO shipmentDSRResponseDTO = new ShipmentDSRResponseDTO();

        if (shipmentHeader.getServiceType() != null) {
            shipmentDSRResponseDTO.setSERVICE(shipmentHeader.getServiceType());
        } else {
            shipmentDSRResponseDTO.setSERVICE(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getPoNumber() != null) {
            shipmentDSRResponseDTO.setORDER_NO(shipmentHeader.getAddlDetail().getPoNumber());
        } else {
            shipmentDSRResponseDTO.setORDER_NO(null);
        }

        if (shipmentHeader.getShipmentUid() != null) {
            shipmentDSRResponseDTO.setBOOKING_NO(shipmentHeader.getShipmentUid());
        } else {
            shipmentDSRResponseDTO.setBOOKING_NO(null);
        }

        if (shipmentHeader.getShipmentDate() != null) {
            shipmentDSRResponseDTO.setBOOKING_DATE(formatDate(shipmentHeader.getShipmentDate(), outputFormatter));
        } else {
            shipmentDSRResponseDTO.setBOOKING_DATE(null);
        }

        if (shipmentHeader.getOriginName() != null) {
            shipmentDSRResponseDTO.setORIGIN(shipmentHeader.getOriginName());
        } else {
            shipmentDSRResponseDTO.setORIGIN(null);
        }

        if (shipmentHeader.getOriginName() != null) {
            shipmentDSRResponseDTO.setPOL(shipmentHeader.getOriginName());
        } else {
            shipmentDSRResponseDTO.setPOL(null);
        }

        if (shipmentHeader.getDestinationName() != null) {
            shipmentDSRResponseDTO.setPOD(shipmentHeader.getDestinationName());
        } else {
            shipmentDSRResponseDTO.setPOD(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getTransportDocumentNo() != null) {
            shipmentDSRResponseDTO.setHOUSE_NO(shipmentHeader.getAddlDetail().getTransportDocumentNo());
        } else {
            shipmentDSRResponseDTO.setHOUSE_NO(null);
        }

        if (shipmentHeader.getDestinationName() != null) {
            shipmentDSRResponseDTO.setFINAL_DESTINATION(shipmentHeader.getDestinationName());
        } else {
            shipmentDSRResponseDTO.setFINAL_DESTINATION(null);
        }

        if (shipmentHeader.getPickUpDeliveryDetail() != null && shipmentHeader.getPickUpDeliveryDetail().getActualPickupDate() != null) {
            shipmentDSRResponseDTO.setPICKUP_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualPickupDate());
        } else {
            shipmentDSRResponseDTO.setPICKUP_DATE(null);
        }

        if (shipmentHeader.getPickUpDeliveryDetail() != null && shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            shipmentDSRResponseDTO.setCARGO_RECEIVED_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate());
        } else {
            shipmentDSRResponseDTO.setCARGO_RECEIVED_DATE(null);
        }

        if (shipmentHeader.getTosName() != null) {
            shipmentDSRResponseDTO.setTERMS(shipmentHeader.getTosName());
        } else {
            shipmentDSRResponseDTO.setTERMS(null);
        }

        if (shipmentHeader.getPartyDetail() != null && shipmentHeader.getPartyDetail().getShipperName() != null) {
            shipmentDSRResponseDTO.setSHIPPER_NAME(shipmentHeader.getPartyDetail().getShipperName());
        } else {
            shipmentDSRResponseDTO.setSHIPPER_NAME(null);
        }

        if (shipmentHeader.getPartyDetail() != null && shipmentHeader.getPartyDetail().getConsigneeName() != null) {
            shipmentDSRResponseDTO.setCONSIGNEE_NAME(shipmentHeader.getPartyDetail().getConsigneeName());
        } else {
            shipmentDSRResponseDTO.setCONSIGNEE_NAME(null);
        }

        if (shipmentHeader.getPartyDetail() != null && shipmentHeader.getPartyDetail().getForwarderId() != null) {
            shipmentDSRResponseDTO.setBILLING_PARTY(shipmentHeader.getPartyDetail().getForwarderId());
        } else {
            shipmentDSRResponseDTO.setBILLING_PARTY(null);
        }

        if (shipmentHeader.getServiceType() != null) {
            shipmentDSRResponseDTO.setIMPORT_EXPORT(shipmentHeader.getServiceType());
        } else {
            shipmentDSRResponseDTO.setIMPORT_EXPORT(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getCarrierBookingNo() != null) {
            shipmentDSRResponseDTO.setCARRIER_BOOKING_NO(shipmentHeader.getAddlDetail().getCarrierBookingNo());
        } else {
            shipmentDSRResponseDTO.setCARRIER_BOOKING_NO(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getLcNumber() != null) {
            shipmentDSRResponseDTO.setLICENCE_NO(shipmentHeader.getAddlDetail().getLcNumber());
        } else {
            shipmentDSRResponseDTO.setLICENCE_NO(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getLcExpiryDate() != null) {
            shipmentDSRResponseDTO.setLICENCE_DATE(shipmentHeader.getAddlDetail().getLcExpiryDate());
        } else {
            shipmentDSRResponseDTO.setLICENCE_DATE(null);
        }

        if (shipmentHeader.getShipmentUid() != null) {
            shipmentDSRResponseDTO.setSUBJOB_UID(shipmentHeader.getShipmentUid());
        } else {
            shipmentDSRResponseDTO.setSUBJOB_UID(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getDoDate() != null) {
            shipmentDSRResponseDTO.setDO_DATE(shipmentHeader.getAddlDetail().getDoDate());
        } else {
            shipmentDSRResponseDTO.setDO_DATE(null);
        }

        if (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getDoNumber() != null) {
            shipmentDSRResponseDTO.setDO_NUMBER(shipmentHeader.getAddlDetail().getDoNumber());
        } else {
            shipmentDSRResponseDTO.setDO_NUMBER(null);
        }
        List<ShipmentRoutingDetail> routingDetails = shipmentHeader.getShipmentRoutingDetails();
        if (routingDetails != null && !routingDetails.isEmpty()) {
            shipmentDSRResponseDTO.setCONNECTION_ETA(routingDetails.get(0).getEta());
            shipmentDSRResponseDTO.setCONNECTION_ETD(routingDetails.get(0).getEtd());
        }

        if(shipmentHeader.getAddlDetail().getEta()!=null) {
            String formattedEta = formatDate(shipmentHeader.getAddlDetail().getEta(), outputFormatter);
            shipmentDSRResponseDTO.setETD_ORIGIN(formattedEta);
        }
        if(shipmentHeader.getAddlDetail().getEtd()!=null) {
            String formattedEtd = formatDate(shipmentHeader.getAddlDetail().getEtd(), outputFormatter);
            shipmentDSRResponseDTO.setETD_ORIGIN(formattedEtd);
        }

        populateShipmentStatus(shipmentHeader, shipmentDSRResponseDTO);

        return shipmentDSRResponseDTO;
    }

    // Add new methods for column filtering
    
    public Page<ShipmentDSRResponseDTO> convertEntityPageToResponsePageWithColumnFilter(
            Pageable pageRequest,
            Page<ShipmentHeader> shipmentHeaders,
            List<String> allowedColumns) {

        List<ShipmentDSRResponseDTO> dtos = new ArrayList<>();
        shipmentHeaders.forEach(e -> dtos.add(convertEntityToResponseDTOWithColumnFilter(e, allowedColumns)));
        return new PageImpl<>(dtos, pageRequest, shipmentHeaders.getTotalElements());
    }

    private ShipmentDSRResponseDTO convertEntityToResponseDTOWithColumnFilter(
            ShipmentHeader shipmentHeader,
            List<String> allowedColumns) {

        ShipmentDSRResponseDTO dto = new ShipmentDSRResponseDTO();

        // Map fields based on allowed columns
        for (String column : allowedColumns) {
            switch (column.toLowerCase()) {
                case "service":
                    dto.setSERVICE(shipmentHeader.getServiceType());
                    break;
                case "orderno":
                    dto.setORDER_NO(shipmentHeader.getAddlDetail().getPoNumber());
                    break;
                case "bookingno":
                    dto.setBOOKING_NO(shipmentHeader.getShipmentUid());
                    break;
                case "bookingdate":
                    if (shipmentHeader.getShipmentDate() != null) {
                        dto.setBOOKING_DATE(formatDate(shipmentHeader.getShipmentDate(), outputFormatter));
                    }
                    break;
                case "origin":
                    dto.setORIGIN(shipmentHeader.getOriginName());
                    break;
                case "pol":
                    dto.setPOL(shipmentHeader.getOriginName());
                    break;
                case "pod":
                    dto.setPOD(shipmentHeader.getDestinationName());
                    break;
                case "houseno":
                    dto.setHOUSE_NO(shipmentHeader.getAddlDetail().getTransportDocumentNo());
                    break;
                case "finaldestination":
                    dto.setFINAL_DESTINATION(shipmentHeader.getDestinationName());
                    break;
                case "pickupdate":
                    dto.setPICKUP_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualPickupDate());
                    break;
                case "cargoreceiveddate":
                    dto.setCARGO_RECEIVED_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate());
                    break;
                case "terms":
                    dto.setTERMS(shipmentHeader.getTosName());
                    break;
                case "shippername":
                    dto.setSHIPPER_NAME(shipmentHeader.getPartyDetail().getShipperName());
                    break;
                case "consigneename":
                    dto.setCONSIGNEE_NAME(shipmentHeader.getPartyDetail().getConsigneeName());
                    break;
                case "billingparty":
                    dto.setBILLING_PARTY(shipmentHeader.getPartyDetail().getForwarderId());
                    break;
                case "importexport":
                    dto.setIMPORT_EXPORT(shipmentHeader.getServiceType());
                    break;
                case "shipperreferencenumber":
                    dto.setSHIPPER_REFERENCE_NUMBER(shipmentHeader.getAddlDetail().getShipperRefNo());
                    break;
                case "carrierbookingno":
                    dto.setCARRIER_BOOKING_NO(shipmentHeader.getAddlDetail().getCarrierBookingNo());
                    break;
                case "licenceno":
                    dto.setLICENCE_NO(shipmentHeader.getAddlDetail().getLcNumber());
                    break;
                case "licencedate":
                    dto.setLICENCE_DATE(shipmentHeader.getAddlDetail().getLcExpiryDate());
                    break;
                case "subjobuid":
                    dto.setSUBJOB_UID(shipmentHeader.getShipmentUid());
                    break;
                case "dodate":
                    dto.setDO_DATE(shipmentHeader.getAddlDetail().getDoDate());
                    break;
                case "donumber":
                    dto.setDO_NUMBER(shipmentHeader.getAddlDetail().getDoNumber());
                    break;
                case "connectioneta":
                case "connectionetd":
                    if (shipmentHeader.getShipmentRoutingDetails() != null &&
                            !shipmentHeader.getShipmentRoutingDetails().isEmpty()) {
                        if (column.equalsIgnoreCase("connectioneta")) {
                            dto.setCONNECTION_ETA(shipmentHeader.getShipmentRoutingDetails().get(0).getEta());
                        } else {
                            dto.setCONNECTION_ETD(shipmentHeader.getShipmentRoutingDetails().get(0).getEtd());
                        }
                    }
                    break;
                case "etdorigin":
                    if (shipmentHeader.getAddlDetail().getEtd() != null) {
                        dto.setETD_ORIGIN(formatDate(shipmentHeader.getAddlDetail().getEtd(), outputFormatter));
                    }
                    break;
                case "etadestination":
                    if (shipmentHeader.getAddlDetail().getEta() != null) {
                        dto.setETA_DESTINATION(formatDate(shipmentHeader.getAddlDetail().getEta(), outputFormatter));
                    }
                    break;
            }
        }

        // Always populate status regardless of column selection
        populateShipmentStatus(shipmentHeader, dto);

        return dto;
    }

    // Keep existing helper methods unchanged
    private String formatDate(Date date, DateTimeFormatter formatter) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(formatter);
    }

    private void populateShipmentStatus(ShipmentHeader shipmentHeader, ShipmentDSRResponseDTO responseDTO) {
        // Existing implementation remains unchanged
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

        responseDTO.setSTATUS("In Transit");
        if (shipmentHeader.getStatus() != null && ShipmentStatus.Cancelled.equals(shipmentHeader.getStatus())) {
            responseDTO.setSTATUS("Cancelled");
            return;
        }

        if (shipmentHeader.getShipmentServices() != null && !shipmentHeader.getShipmentServices().isEmpty()) {
            ShipmentServiceDetail firstService = shipmentHeader.getShipmentServices().get(0);
            ShipmentStatus serviceStatus = firstService.getServiceStatus();
            Date eta = shipmentHeader.getAddlDetail() != null ? shipmentHeader.getAddlDetail().getEta() : null;

            if ((ShipmentStatus.Booked.equals(serviceStatus) || ShipmentStatus.Received.equals(serviceStatus)) &&
                    (eta == null || eta.after(currentDate))) {
                responseDTO.setSTATUS(("Booked"));
            }
        }

        String tos = shipmentHeader.getTosName();
        if (tos != null) {
            Optional<EventDetail> deliveryDateOpt = shipmentHeader.getEventDetail().stream()
                    .filter(e -> "Delivery Date".equals(e.getEventName()))
                    .findAny();

            if (("Delivered Duty Paid".equals(tos) || "Delivered at Place".equals(tos)) &&
                    deliveryDateOpt.isPresent() && deliveryDateOpt.get().getEventDate().before(currentDate)) {
                responseDTO.setSTATUS("Delivered");
            } else if (("Cost Insurance and Freight".equals(tos) || "Cost and Freight".equals(tos)) &&
                    shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getDoDate() != null &&
                    shipmentHeader.getAddlDetail().getDoDate().before(currentDate)) {
                responseDTO.setSTATUS("Delivered");
            } else if (("Free on Board".equals(tos) || "Ex Works".equals(tos) || "Free Carrier".equals(tos)) &&
                    ((ata != null && ata.before(currentDate)) ||
                            (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
                                    shipmentHeader.getAddlDetail().getEta().before(currentDate)))) {
                Optional<EventDetail> fddOpt = shipmentHeader.getEventDetail().stream()
                        .filter(e -> "FDD".equals(e.getEventCode()))
                        .findAny();
                if (fddOpt.isPresent()) {
                    responseDTO.setSTATUS("Delivered");
                }
            }
        }
        if ((ata != null && ata.before(currentDate)) ||
                (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
                        shipmentHeader.getAddlDetail().getEta().before(currentDate))) {
            responseDTO.setSTATUS("Arrived");
        }
    }

    // Keep existing interface implementations unchanged
    @Override
    public ShipmentHeader convertCreateRequestToEntity(ShipmentDSRRequestDTO shipmentDSRRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(ShipmentDSRRequestDTO shipmentDSRRequestDTO, ShipmentHeader shipmentHeader) {
    }

    @Override
    public Page<ShipmentDSRResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<ShipmentHeader> shipmentHeaders) {
        List<ShipmentDSRResponseDTO> dtos = new ArrayList<>();
        shipmentHeaders.forEach(e -> dtos.add(convertEntityToResponseDTO(e)));
        return new PageImpl<>(dtos, pageRequest, shipmentHeaders.getTotalElements());
    }


}
//
//
//import com.newage.fx.finance.application.dto.request.ShipmentDSRRequestDTO;
//import com.newage.fx.finance.application.dto.response.ShipmentDSRResponseDTO;
//import com.newage.fx.finance.domain.entity.*;
//import com.newage.fx.finance.domain.enums.ShipmentStatus;
//import com.newage.fx.finance.service.MasterHeaderService;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//public class ShipmentPostgresDSRMapper implements DTOMapper<ShipmentHeader, ShipmentDSRRequestDTO, ShipmentDSRResponseDTO> {
//
//    @Autowired
//    private ModelMapper modelMapper;
//    @Autowired
//    private MasterHeaderService masterHeaderService;
//    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yy");
//    @Override
//    public ShipmentDSRResponseDTO convertEntityToResponseDTO(ShipmentHeader shipmentHeader) {
//        ShipmentDSRResponseDTO shipmentDSRResponseDTO = new ShipmentDSRResponseDTO();
//
//        shipmentDSRResponseDTO.setSERVICE(shipmentHeader.getServiceType());
//
//        shipmentDSRResponseDTO.setORDER_NO(shipmentHeader.getAddlDetail().getPoNumber());
//        shipmentDSRResponseDTO.setBOOKING_NO(shipmentHeader.getShipmentUid());
//
//        String formattedBookingDate = formatDate(shipmentHeader.getShipmentDate(), outputFormatter);
//        shipmentDSRResponseDTO.setBOOKING_DATE(formattedBookingDate);
//
//        shipmentDSRResponseDTO.setORIGIN(shipmentHeader.getOriginName());
//        shipmentDSRResponseDTO.setPOL(shipmentHeader.getOriginName());
//        shipmentDSRResponseDTO.setPOD(shipmentHeader.getDestinationName());
//        shipmentDSRResponseDTO.setHOUSE_NO(shipmentHeader.getAddlDetail().getTransportDocumentNo());
//        shipmentDSRResponseDTO.setFINAL_DESTINATION(shipmentHeader.getDestinationName());
//        shipmentDSRResponseDTO.setPICKUP_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualPickupDate());
//        shipmentDSRResponseDTO.setCARGO_RECEIVED_DATE(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate());
//        shipmentDSRResponseDTO.setTERMS(shipmentHeader.getTosName());
//        shipmentDSRResponseDTO.setSHIPPER_NAME(shipmentHeader.getPartyDetail().getShipperName());
//        shipmentDSRResponseDTO.setCONSIGNEE_NAME(shipmentHeader.getPartyDetail().getConsigneeName());
//        shipmentDSRResponseDTO.setBILLING_PARTY(shipmentHeader.getPartyDetail().getForwarderId());
//        shipmentDSRResponseDTO.setIMPORT_EXPORT(shipmentHeader.getServiceType());
////        shipmentDSRResponseDTO.setPices(shipmentHeader.getCargoDetail().getNoOfPieces());
////        shipmentDSRResponseDTO.setWeight(shipmentHeader.getCargoDetail().getGrossWeightKgs());
////        shipmentDSRResponseDTO.setVolume(shipmentHeader.getCargoDetail().getVolumeInCbm());
//
//        shipmentDSRResponseDTO.setSHIPPER_REFERENCE_NUMBER(shipmentHeader.getAddlDetail().getShipperRefNo());
//        shipmentDSRResponseDTO.setCARRIER_BOOKING_NO(shipmentHeader.getAddlDetail().getCarrierBookingNo());
//        shipmentDSRResponseDTO.setLICENCE_NO(shipmentHeader.getAddlDetail().getLcNumber());
//        shipmentDSRResponseDTO.setLICENCE_DATE(shipmentHeader.getAddlDetail().getLcExpiryDate());
//        shipmentDSRResponseDTO.setSUBJOB_UID(shipmentHeader.getShipmentUid());
//        shipmentDSRResponseDTO.setDO_DATE(shipmentHeader.getAddlDetail().getDoDate());
//        shipmentDSRResponseDTO.setDO_NUMBER(shipmentHeader.getAddlDetail().getDoNumber());
//
////        shipmentDSRResponseDTO.setConnectionEta(shipmentHeader.getShipmentRoutingDetails().get(0).getEta());
////        shipmentDSRResponseDTO.setConnectionEtd(shipmentHeader.getShipmentRoutingDetails().get(0).getEtd());
//        List<ShipmentRoutingDetail> routingDetails = shipmentHeader.getShipmentRoutingDetails();
//        if (routingDetails != null && !routingDetails.isEmpty()) {
//            shipmentDSRResponseDTO.setCONNECTION_ETA(routingDetails.get(0).getEta());
//            shipmentDSRResponseDTO.setCONNECTION_ETD(routingDetails.get(0).getEtd());
//        }
////        shipmentDSRResponseDTO.setEtdOrigin(shipmentHeader.getAddlDetail().getEtd());
////        shipmentDSRResponseDTO.setEtaDestination(shipmentHeader.getAddlDetail().getEtd());
//        if(shipmentHeader.getAddlDetail().getEta()!=null) {
//            String formattedEta = formatDate(shipmentHeader.getAddlDetail().getEta(), outputFormatter);
//
//            shipmentDSRResponseDTO.setETD_ORIGIN(formattedEta);
//        }
//        if(shipmentHeader.getAddlDetail().getEtd()!=null) {
//            String formattedEtd = formatDate(shipmentHeader.getAddlDetail().getEtd(), outputFormatter);
//            shipmentDSRResponseDTO.setETD_ORIGIN(formattedEtd);
//        }
//        populateShipmentStatus(shipmentHeader, shipmentDSRResponseDTO);
//
//        return shipmentDSRResponseDTO;
//    }
//    private String formatDate(Date date, DateTimeFormatter formatter) {
//        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(formatter);
//    }
//    private void populateShipmentStatus(ShipmentHeader shipmentHeader, ShipmentDSRResponseDTO responseDTO) {
//        Date currentDate = new Date();
//        Date ata = null, atd = null;
//
//
//        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
//        if (!masterHeaders.isEmpty()) {
//            MasterHeader masterHeader = masterHeaders.get(0);
//            if (masterHeader != null) {
//                ata = masterHeader.getAta();
//                atd = masterHeader.getAtd();
//            }
//        }
//
//
//        responseDTO.setSTATUS("In Transit");
//        if (shipmentHeader.getStatus() != null && ShipmentStatus.Cancelled.equals(shipmentHeader.getStatus())) {
//            responseDTO.setSTATUS("Cancelled");
//            return;
//        }
//
//        if (shipmentHeader.getShipmentServices() != null && !shipmentHeader.getShipmentServices().isEmpty()) {
//            ShipmentServiceDetail firstService = shipmentHeader.getShipmentServices().get(0);
//            ShipmentStatus serviceStatus = firstService.getServiceStatus();
//            Date eta = shipmentHeader.getAddlDetail() != null ? shipmentHeader.getAddlDetail().getEta() : null;
//
//            if ((ShipmentStatus.Booked.equals(serviceStatus) || ShipmentStatus.Received.equals(serviceStatus)) &&
//                    (eta == null || eta.after(currentDate))) {
//                responseDTO.setSTATUS(("Booked"));
//            }
//        }
//
//
//        String tos = shipmentHeader.getTosName();
//        if (tos != null) {
//            Optional<EventDetail> deliveryDateOpt = shipmentHeader.getEventDetail().stream()
//                    .filter(e -> "Delivery Date".equals(e.getEventName()))
//                    .findAny();
//
//            if (("Delivered Duty Paid".equals(tos) || "Delivered at Place".equals(tos)) &&
//                    deliveryDateOpt.isPresent() && deliveryDateOpt.get().getEventDate().before(currentDate)) {
//                responseDTO.setSTATUS("Delivered");
//            } else if (("Cost Insurance and Freight".equals(tos) || "Cost and Freight".equals(tos)) &&
//                    shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getDoDate() != null &&
//                    shipmentHeader.getAddlDetail().getDoDate().before(currentDate)) {
//                responseDTO.setSTATUS("Delivered");
//            } else if (("Free on Board".equals(tos) || "Ex Works".equals(tos) || "Free Carrier".equals(tos)) &&
//                    ((ata != null && ata.before(currentDate)) ||
//                            (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
//                                    shipmentHeader.getAddlDetail().getEta().before(currentDate)))) {
//                Optional<EventDetail> fddOpt = shipmentHeader.getEventDetail().stream()
//                        .filter(e -> "FDD".equals(e.getEventCode()))
//                        .findAny();
//                if (fddOpt.isPresent()) {
//                    responseDTO.setSTATUS("Delivered");
//                }
//            }
//        }
//        if ((ata != null && ata.before(currentDate)) ||
//                (shipmentHeader.getAddlDetail() != null && shipmentHeader.getAddlDetail().getEta() != null &&
//                        shipmentHeader.getAddlDetail().getEta().before(currentDate))) {
//            responseDTO.setSTATUS("Arrived");
//        }
//    }
//
//    @Override
//    public ShipmentHeader convertCreateRequestToEntity(ShipmentDSRRequestDTO shipmentDSRRequestDTO) {
//        return null;
//    }
//
//    @Override
//    public void convertUpdateRequestToEntity(ShipmentDSRRequestDTO shipmentDSRRequestDTO, ShipmentHeader shipmentHeader) {
//
//    }
//
//
//    @Override
//    public Page<ShipmentDSRResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<ShipmentHeader> shipmentHeaders) {
//        List<ShipmentDSRResponseDTO> dtos = new ArrayList<>();
//        shipmentHeaders.forEach(e -> dtos.add(convertEntityToResponseDTO(e)));
//        return new PageImpl<>(dtos, pageRequest, shipmentHeaders.getTotalElements());
//    }
//}
