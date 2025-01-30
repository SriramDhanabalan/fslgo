package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.ShipmentPostgressRequestDTO;
import com.newage.fx.finance.application.dto.response.*;
import com.newage.fx.finance.domain.entity.*;
import com.newage.fx.finance.domain.enums.ShipmentStatus;
import com.newage.fx.finance.service.MasterHeaderService;
import com.newage.fx.finance.service.WorkFlowService;
import com.newage.fx.finance.service.client.MasterDataServiceClient;
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
    private WorkFlowService workFlowService;
    @Autowired
    private ShipmentPostgresWorkFlowMapper shipmentWorkFlowMapper;
    @Autowired
    private MasterHeaderService masterHeaderService;
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MMM-yy");

    @Override
    public ShipmentsHeaderResponseDTO convertEntityToResponseDTO(ShipmentHeader shipmentHeader) {
        ShipmentsHeaderResponseDTO shipmentHeaderResponseDTO = new ShipmentsHeaderResponseDTO();
        shipmentHeaderResponseDTO.setId(shipmentHeader.getShipmentUid());


        if (shipmentHeader.getShipmentDate() != null) {
            String formattedBookingDate = formatDate(shipmentHeader.getShipmentDate(), outputFormatter);
            shipmentHeaderResponseDTO.setBooked_on(formattedBookingDate);
        }

        shipmentHeaderResponseDTO.setMode(shipmentHeader.getServiceType());
        shipmentHeaderResponseDTO.setTos(shipmentHeader.getTosName());
        shipmentHeaderResponseDTO.setOrigin(shipmentHeader.getOriginName());
        shipmentHeaderResponseDTO.setDestination(shipmentHeader.getDestinationName());


        if (shipmentHeader.getAddlDetail() != null) {
            shipmentHeaderResponseDTO.setHbl_number(shipmentHeader.getAddlDetail().getTransportDocumentNo());
            shipmentHeaderResponseDTO.setOrder_no(shipmentHeader.getAddlDetail().getPoNumber());
            shipmentHeaderResponseDTO.setShipper_ref_no(shipmentHeader.getAddlDetail().getShipperRefNo());


            if (shipmentHeader.getAddlDetail().getEta() != null) {
                String formattedEta = formatDate(shipmentHeader.getAddlDetail().getEta(), outputFormatter);

                shipmentHeaderResponseDTO.setEtaAta(formattedEta);
            }
            if (shipmentHeader.getAddlDetail().getEtd() != null) {
                String formattedEtd = formatDate(shipmentHeader.getAddlDetail().getEtd(), outputFormatter);
                shipmentHeaderResponseDTO.setEtdAtd(formattedEtd);
            }
        }
        if (shipmentHeader.getPartyDetail() != null) {
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

//        public DocumentDTO convertEntityToResponseDTO(AttachmentDetail documentEntity) {) {
        if (shipmentHeader.getShipmentUid() != null) {
            System.out.println( "shipmentHeader.getShipmentUid() --------------------" + shipmentHeader.getShipmentUid());
            System.out.println( "shipmentHeader.getid() --------------------" + shipmentHeader.getId());
            List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
            if (!masterHeaders.isEmpty()) {

                MasterHeader masterHeader = masterHeaders.get(0);
                if (masterHeader != null) {

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
        }
        populateShipmentStatus(shipmentHeader, shipmentHeaderResponseDTO);

        List<MilestoneDTO> milestones = new ArrayList<>();

        MilestoneDTO bookedMilestone = new MilestoneDTO();
        bookedMilestone.setMilestone("Booked");
        if (shipmentHeader.getCreatedDate() != null) {
            bookedMilestone.setDate(formatDate(shipmentHeader.getCreatedDate(), outputFormatter));
            bookedMilestone.setStatus("COMPLETED");
            bookedMilestone.setMilestonestatus("REACHED");
            bookedMilestone.setIs_updated("");
            bookedMilestone.setUpdated_message("");
        } else {
            bookedMilestone.setDate(null);
            bookedMilestone.setStatus("in process");
            bookedMilestone.setMilestonestatus(null);
            bookedMilestone.setIs_updated("");
            bookedMilestone.setUpdated_message("");
        }
        milestones.add(bookedMilestone);

        MilestoneDTO cargoreadyMilestone = new MilestoneDTO();
        cargoreadyMilestone.setMilestone("Cargo Ready");
        if (shipmentHeader.getAddlDetail().getCargoReadyDate() != null) {
            cargoreadyMilestone.setDate(formatDate(shipmentHeader.getAddlDetail().getCargoReadyDate(), outputFormatter));
            cargoreadyMilestone.setStatus("COMPLETED");
            cargoreadyMilestone.setMilestonestatus("REACHED");
            cargoreadyMilestone.setIs_updated("");
            cargoreadyMilestone.setUpdated_message("");
        } else {

            cargoreadyMilestone.setDate(null);
            cargoreadyMilestone.setStatus("in process");
            cargoreadyMilestone.setMilestonestatus(null);
            cargoreadyMilestone.setIs_updated("");
            cargoreadyMilestone.setUpdated_message("");
        }
        milestones.add(cargoreadyMilestone);

        MilestoneDTO depatureMilestone = new MilestoneDTO();
        depatureMilestone.setMilestone("Depature");
        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                depatureMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                depatureMilestone.setStatus("COMPLETED");
                depatureMilestone.setMilestonestatus("REACHED");
                depatureMilestone.setIs_updated("");
                depatureMilestone.setUpdated_message("");
            }
        } else {
            depatureMilestone.setDate(null);
            depatureMilestone.setStatus("in process");
            depatureMilestone.setMilestonestatus(null);
            depatureMilestone.setIs_updated("");
            depatureMilestone.setUpdated_message("");
        }
        milestones.add(depatureMilestone);

        MilestoneDTO arrivalMilestone = new MilestoneDTO();
        arrivalMilestone.setMilestone("Arrival");
//        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                arrivalMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                arrivalMilestone.setStatus("COMPLETED");
                arrivalMilestone.setMilestonestatus("REACHED");
                arrivalMilestone.setIs_updated("");
                arrivalMilestone.setUpdated_message("");

            }
        } else {
            arrivalMilestone.setDate(null);
            arrivalMilestone.setStatus("in process");
            arrivalMilestone.setMilestonestatus(null);
            arrivalMilestone.setIs_updated("");
            arrivalMilestone.setUpdated_message("");
        }
        milestones.add(arrivalMilestone);


        MilestoneDTO depaturebMilestone = new MilestoneDTO();
        depaturebMilestone.setMilestone("Depature");
//        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                depaturebMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                depaturebMilestone.setStatus("COMPLETED");
                depaturebMilestone.setMilestonestatus("REACHED");
                depaturebMilestone.setIs_updated("");
                depaturebMilestone.setUpdated_message("");
            }
        } else {
            depaturebMilestone.setDate(null);
            depaturebMilestone.setStatus("in process");
            depaturebMilestone.setMilestonestatus(null);
            depaturebMilestone.setIs_updated("");
            depaturebMilestone.setUpdated_message("");
        }
        milestones.add(depaturebMilestone);

        MilestoneDTO arrivalbMilestone = new MilestoneDTO();
        arrivalbMilestone.setMilestone("Arrival");
//        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                arrivalbMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                arrivalbMilestone.setStatus("COMPLETED");
                arrivalbMilestone.setMilestonestatus("REACHED");
                arrivalbMilestone.setIs_updated("");
                arrivalbMilestone.setUpdated_message("");

            }
        } else {
            arrivalbMilestone.setDate(null);
            arrivalbMilestone.setStatus("in process");
            arrivalbMilestone.setMilestonestatus(null);
            arrivalbMilestone.setIs_updated("");
            arrivalbMilestone.setUpdated_message("");
        }
        milestones.add(arrivalbMilestone);

        MilestoneDTO doissuedlMilestone = new MilestoneDTO();
        doissuedlMilestone.setMilestone("Do Issued");
        if (shipmentHeader.getAddlDetail().getDoDate() != null) {
            doissuedlMilestone.setDate(formatDate(shipmentHeader.getAddlDetail().getDoDate(), outputFormatter));
            doissuedlMilestone.setStatus("COMPLETED");
            doissuedlMilestone.setMilestonestatus("REACHED");
            doissuedlMilestone.setIs_updated("");
            doissuedlMilestone.setUpdated_message("");
        } else {
            doissuedlMilestone.setDate(null);
            doissuedlMilestone.setStatus("in process");
            doissuedlMilestone.setMilestonestatus(null);
            doissuedlMilestone.setIs_updated("");
            doissuedlMilestone.setUpdated_message("");
        }
        milestones.add(doissuedlMilestone);


        shipmentHeaderResponseDTO.setMilestone(milestones);


        return shipmentHeaderResponseDTO;

    }



    public BookingResponseDTO convertEntityToDTO(ShipmentHeader shipmentHeader) {

        BookingResponseDTO responseDTO = new BookingResponseDTO();
        List<DocumentDTO> documents = new ArrayList<DocumentDTO>();
        List<MilestoneDTO> milestones = new ArrayList<>();


        for (AttachmentDetail attachmentDetail : shipmentHeader.getAttachmentDetail()) {
            if (attachmentDetail != null) {
                DocumentDTO documentDTO = new DocumentDTO();
                documentDTO.setDocument_type(attachmentDetail.getDocumentTypeName());
                documentDTO.setId(attachmentDetail.getId().toString()); // Assuming ID is Long
                documentDTO.setFile_name(attachmentDetail.getDocumentName());
                documentDTO.setDocument_name(attachmentDetail.getDocumentName());
                documentDTO.setDocument_date(attachmentDetail.getCreatedDate().toString()); // Format as needed
                documentDTO.setLink(attachmentDetail.getDocumentRefNo());
                documents.add(documentDTO);
            }
        }
        responseDTO.setDocuments(documents);


        List<CustomerCodeDTO> customerCodeDTOList = new ArrayList<>();

        CustomerCodeDTO customerCodeDTO = new CustomerCodeDTO();
        customerCodeDTO.setBooking_id(shipmentHeader.getShipmentUid());
        customerCodeDTO.setHbl_number(shipmentHeader.getAddlDetail().getTransportDocumentNo());
        customerCodeDTO.setLabel("estimated quotation");
        customerCodeDTO.setCurrency("");
        customerCodeDTO.setOrigin(shipmentHeader.getOriginName());
        customerCodeDTO.setDestination(shipmentHeader.getDestinationName());
        customerCodeDTO.setLabel_1("");
        customerCodeDTO.setTransit_time("");
        customerCodeDTO.setSailing_date("");
        customerCodeDTO.setSailing_id("");
        customerCodeDTO.setRate_is_valid_till("");
        customerCodeDTO.setProduct(shipmentHeader.getShipmentType().toString());
        customerCodeDTO.setNew_tab_2("booking summary");
        customerCodeDTO.setHeading_1("cargo details");
        customerCodeDTO.setTotal_weight(shipmentHeader.getCargoDetail().getGrossWeightKgs().toString());
        customerCodeDTO.setTotal_volume(shipmentHeader.getCargoDetail().getVolumeInCbm().toString());
        customerCodeDTO.setValue("$");
        customerCodeDTO.setPackage_type("BOX(s)");
        customerCodeDTO.setNo_of_units(shipmentHeader.getCargoDetail().getNoOfPieces().toString());
        customerCodeDTO.setStackable_cargo(shipmentHeader.getCargoDetail().getStackable().toString());
        customerCodeDTO.setHeading_2("shipment details");
        customerCodeDTO.setCommodity_name(shipmentHeader.getCargoDetail().getCommodityName());
//        customerCodeDTO.setCargo_ready_date(shipmentHeader.getAddlDetail().getCargoReadyDate().toString());
        customerCodeDTO.setHs_code("");
        customerCodeDTO.setNo_of_containers(shipmentHeader.getContainerDetail().toString());
        customerCodeDTO.setCo_emission("0");
        customerCodeDTO.setHeading_3("billing party");
        customerCodeDTO.setShipper_name(shipmentHeader.getPartyDetail().getShipperName());
        customerCodeDTO.setConsignee_name(shipmentHeader.getPartyDetail().getConsigneeName());
        customerCodeDTO.setBilling_party_name("Fsl Worldwide Co. Ltd. Wll. [Kuwait]");
//        customerCodeDTO.setNotify_name(shipmentHeader.getTransportDocumentOcean().getNotifyParty());
//        customerCodeDTO.setContainer_no(shipmentHeader.getTransportDocumentOcean().getHblContainerDetails());
        customerCodeDTO.setActual_seal("MP0302247");
//        customerCodeDTO.setAddress(shipmentHeader.getTransportDocumentOcean().getNotifyPartyAddress());
        customerCodeDTO.setEmail("");
        customerCodeDTO.setMobile("");
        customerCodeDTO.setHeader_4("documents");
        customerCodeDTO.setPicking_list("filename.pdf");
        customerCodeDTO.setOther("filename.pdf");
        customerCodeDTO.setCommercial_invoice("filename.pdf");
        customerCodeDTO.setCargo_image("filename.pdf");
        customerCodeDTO.setHeader_5("services included");
        customerCodeDTO.setPincode("");
        customerCodeDTO.setHeader_6("special requirements");
        customerCodeDTO.setText("need to have at least 3 layer wrapping on the box.");
        customerCodeDTO.setNew_tab_3("quotedetails");
        customerCodeDTO.setReference_id("#");
        customerCodeDTO.setOrigin_charges("$");
        customerCodeDTO.setInternational_changes("$");
        customerCodeDTO.setDestination_charges("$");
        customerCodeDTO.setTotal_amount("$");
        customerCodeDTO.setNewtab_4("documents");
        customerCodeDTO.setDocument_type("invoice");
        customerCodeDTO.setId_reference_number(shipmentHeader.getAddlDetail().getTransportDocumentNo());
        customerCodeDTO.setLast_update(shipmentHeader.getLastModifiedDate().toString());
        customerCodeDTO.setAction("download");
        customerCodeDTO.setCargo_type("General Cargo");
        customerCodeDTO.setSpl_requirements("");
        customerCodeDTO.setIs_import_clearance("");
        customerCodeDTO.setIs_export_clearance("");
        customerCodeDTO.setCargo_pickup("");
        customerCodeDTO.setCargo_insurance("No");
        customerCodeDTO.setDoor_delivery("No");
        customerCodeDTO.setNewtab_5("track");

        customerCodeDTOList.add(customerCodeDTO);


        responseDTO.setCustomercode(customerCodeDTOList);

// Handle "Booked" milestone
        MilestoneDTO bookedMilestone = new MilestoneDTO();
        bookedMilestone.setMilestone("Booked");
        if (shipmentHeader.getCreatedDate() != null) {
            bookedMilestone.setDate(formatDate(shipmentHeader.getCreatedDate(), outputFormatter));
            bookedMilestone.setStatus("COMPLETED");
            bookedMilestone.setMilestonestatus("REACHED");
            bookedMilestone.setIs_updated("");
            bookedMilestone.setUpdated_message("");
        } else {
            bookedMilestone.setDate(null);
            bookedMilestone.setStatus("in process");
            bookedMilestone.setMilestonestatus(null);
            bookedMilestone.setIs_updated("");
            bookedMilestone.setUpdated_message("");
        }
        milestones.add(bookedMilestone);

// Handle "Picked up" milestone
        MilestoneDTO cargoreadyMilestone = new MilestoneDTO();
        cargoreadyMilestone.setMilestone("Cargo Ready");
        if (shipmentHeader.getAddlDetail().getCargoReadyDate() != null) {
            cargoreadyMilestone.setDate(formatDate(shipmentHeader.getAddlDetail().getCargoReadyDate(), outputFormatter));
            cargoreadyMilestone.setStatus("COMPLETED");
            cargoreadyMilestone.setMilestonestatus("REACHED");
            cargoreadyMilestone.setIs_updated("");
            cargoreadyMilestone.setUpdated_message("");
        } else {

            cargoreadyMilestone.setDate(null);
            cargoreadyMilestone.setStatus("in process");
            cargoreadyMilestone.setMilestonestatus(null);
            cargoreadyMilestone.setIs_updated("");
            cargoreadyMilestone.setUpdated_message("");
        }
        milestones.add(cargoreadyMilestone);

        MilestoneDTO pickedUpMilestone = new MilestoneDTO();
        pickedUpMilestone.setMilestone("Picked up");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            pickedUpMilestone.setDate(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            pickedUpMilestone.setStatus("COMPLETED");
            pickedUpMilestone.setMilestonestatus("REACHED");
            pickedUpMilestone.setIs_updated("");
            pickedUpMilestone.setUpdated_message("");
        } else {

            pickedUpMilestone.setDate(null);
            pickedUpMilestone.setStatus("in process");
            pickedUpMilestone.setMilestonestatus(null);
            pickedUpMilestone.setIs_updated("");
            pickedUpMilestone.setUpdated_message("");
        }
        milestones.add(pickedUpMilestone);

        MilestoneDTO cargorecivedMilestone = new MilestoneDTO();
        cargorecivedMilestone.setMilestone("Cargo Received");
        if (shipmentHeader.getPickUpDeliveryDetail().getPlannedDeliveryDate() != null) {
            cargorecivedMilestone.setDate(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            cargorecivedMilestone.setStatus("COMPLETED");
            cargorecivedMilestone.setMilestonestatus("REACHED");
            cargorecivedMilestone.setIs_updated("");
            cargorecivedMilestone.setUpdated_message("");
        } else {
            cargorecivedMilestone.setDate(null);
            cargorecivedMilestone.setStatus("in process");
            cargorecivedMilestone.setMilestonestatus(null);
            cargorecivedMilestone.setIs_updated("");
            cargorecivedMilestone.setUpdated_message("");
        }
        milestones.add(cargorecivedMilestone);

        //transit
        MilestoneDTO depatureMilestone = new MilestoneDTO();
        depatureMilestone.setMilestone("Depature");
        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                depatureMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                depatureMilestone.setStatus("COMPLETED");
                depatureMilestone.setMilestonestatus("REACHED");
                depatureMilestone.setIs_updated("");
                depatureMilestone.setUpdated_message("");
            }
        } else {
            depatureMilestone.setDate(null);
            depatureMilestone.setStatus("in process");
            depatureMilestone.setMilestonestatus(null);
            depatureMilestone.setIs_updated("");
            depatureMilestone.setUpdated_message("");
        }
        milestones.add(depatureMilestone);

        MilestoneDTO arrivalMilestone = new MilestoneDTO();
        arrivalMilestone.setMilestone("Arrival");
//        List<MasterHeader> masterHeaders = masterHeaderService.getMasterByShipmentUid(shipmentHeader.getShipmentUid());
        if (!masterHeaders.isEmpty()) {
            MasterHeader masterHeader = masterHeaders.get(0);
            if (masterHeader.getEta() != null) {
                arrivalMilestone.setDate(formatDate(masterHeader.getEta(), outputFormatter));
                arrivalMilestone.setStatus("COMPLETED");
                arrivalMilestone.setMilestonestatus("REACHED");
                arrivalMilestone.setIs_updated("");
                arrivalMilestone.setUpdated_message("");

            }
        } else {
            arrivalMilestone.setDate(null);
            arrivalMilestone.setStatus("in process");
            arrivalMilestone.setMilestonestatus(null);
            arrivalMilestone.setIs_updated("");
            arrivalMilestone.setUpdated_message("");
        }
        milestones.add(arrivalMilestone);

        MilestoneDTO doissuedlMilestone = new MilestoneDTO();
        doissuedlMilestone.setMilestone("Do Issued");
        if (shipmentHeader.getAddlDetail().getDoDate() != null) {
            doissuedlMilestone.setDate(formatDate(shipmentHeader.getAddlDetail().getDoDate(), outputFormatter));
            doissuedlMilestone.setStatus("COMPLETED");
            doissuedlMilestone.setMilestonestatus("REACHED");
            doissuedlMilestone.setIs_updated("");
            doissuedlMilestone.setUpdated_message("");
        } else {
            doissuedlMilestone.setDate(null);
            doissuedlMilestone.setStatus("in process");
            doissuedlMilestone.setMilestonestatus(null);
            doissuedlMilestone.setIs_updated("");
            doissuedlMilestone.setUpdated_message("");
        }
        milestones.add(doissuedlMilestone);


        responseDTO.setMilestones(milestones);


        List<MilestoneOriginDTO> milestonesorg = new ArrayList<>();
        MilestoneOriginDTO bookedoMilestone = new MilestoneOriginDTO();
        bookedoMilestone.setHeader_text("Booked");
        if (shipmentHeader.getCreatedDate() != null) {
            bookedoMilestone.setRemarks_date(formatDate(shipmentHeader.getCreatedDate(), outputFormatter));
            bookedoMilestone.setDescription("Your shipment was booked on");
            bookedoMilestone.setShipment_type("0");
            bookedoMilestone.setMilestone_status("COMPLETED");
        } else {
            bookedoMilestone.setHeader_text("Booked");
            bookedoMilestone.setRemarks_date(null);
            bookedoMilestone.setDescription("");
            bookedoMilestone.setShipment_type("0");
            bookedoMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(bookedoMilestone);

        MilestoneOriginDTO cargoreadyoMilestone = new MilestoneOriginDTO();
        cargoreadyoMilestone.setHeader_text("CargoReady");
        if (shipmentHeader.getAddlDetail().getCargoReadyDate() != null) {
            cargoreadyoMilestone.setRemarks_date(formatDate(shipmentHeader.getAddlDetail().getCargoReadyDate(), outputFormatter));
            cargoreadyoMilestone.setDescription("Your cargo was ready on");
            cargoreadyoMilestone.setShipment_type("0");
            cargoreadyoMilestone.setMilestone_status("COMPLETED");
        } else {
            cargoreadyoMilestone.setHeader_text("CargoReady");
            cargoreadyoMilestone.setRemarks_date(null);
            cargoreadyoMilestone.setDescription("");
            cargoreadyoMilestone.setShipment_type("0");
            cargoreadyoMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(cargoreadyoMilestone);


        MilestoneOriginDTO plannedpickupoMilestone = new MilestoneOriginDTO();
        plannedpickupoMilestone.setHeader_text("Planned Pickup");
        if (shipmentHeader.getPickUpDeliveryDetail().getPlannedDeliveryDate() != null) {
            plannedpickupoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getPlannedDeliveryDate(), outputFormatter));
            plannedpickupoMilestone.setDescription("IN PROGRESS");
            plannedpickupoMilestone.setShipment_type("0");
            plannedpickupoMilestone.setMilestone_status("COMPLETED");
        } else {
            plannedpickupoMilestone.setHeader_text("planned pickup");
            plannedpickupoMilestone.setRemarks_date(null);
            plannedpickupoMilestone.setDescription("");
            plannedpickupoMilestone.setShipment_type("0");
            plannedpickupoMilestone.setMilestone_status("in process");

        }
        milestonesorg.add(plannedpickupoMilestone);

        MilestoneOriginDTO actualpickupoMilestone = new MilestoneOriginDTO();
        actualpickupoMilestone.setHeader_text("Actual Pickup");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            actualpickupoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            actualpickupoMilestone.setDescription("IN PROGRESS");
            actualpickupoMilestone.setShipment_type("0");
            actualpickupoMilestone.setMilestone_status("COMPLETED");
        } else {
            actualpickupoMilestone.setHeader_text("planned pickup");
            actualpickupoMilestone.setRemarks_date(null);
            actualpickupoMilestone.setDescription("");
            actualpickupoMilestone.setShipment_type("0");
            actualpickupoMilestone.setMilestone_status("In Process");
        }
        milestonesorg.add(actualpickupoMilestone);

//nxt
        MilestoneOriginDTO cargorecivedoMilestone = new MilestoneOriginDTO();
        cargorecivedoMilestone.setHeader_text("Cargo received");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            cargorecivedoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            cargorecivedoMilestone.setDescription("Your shipment was received on");
            cargorecivedoMilestone.setShipment_type("0");
            cargorecivedoMilestone.setMilestone_status("COMPLETED");
        } else {
            cargorecivedoMilestone.setHeader_text("Cargo Received");
            cargorecivedoMilestone.setRemarks_date(null);
            cargorecivedoMilestone.setDescription("");
            cargorecivedoMilestone.setShipment_type("0");
            cargorecivedoMilestone.setMilestone_status("In process");
        }
        milestonesorg.add(cargorecivedoMilestone);

        //master
        MilestoneOriginDTO exportclearanceoMilestone = new MilestoneOriginDTO();
        exportclearanceoMilestone.setHeader_text("Export Clearance Date");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            exportclearanceoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            exportclearanceoMilestone.setDescription("Customs clearance was completed on");
            exportclearanceoMilestone.setShipment_type("0");
            exportclearanceoMilestone.setMilestone_status("COMPLETED");
        } else {
            exportclearanceoMilestone.setHeader_text("Export Clearance Date");
            exportclearanceoMilestone.setRemarks_date(null);
            exportclearanceoMilestone.setDescription("");
            exportclearanceoMilestone.setShipment_type("0");
            exportclearanceoMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(exportclearanceoMilestone);

//master
        MilestoneOriginDTO containerstuffingoMilestone = new MilestoneOriginDTO();
        containerstuffingoMilestone.setHeader_text("Container Stuffing Date");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            containerstuffingoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            containerstuffingoMilestone.setDescription("Container stuffed on");
            containerstuffingoMilestone.setShipment_type("O");
            containerstuffingoMilestone.setMilestone_status("COMPLETED");
        } else {
            containerstuffingoMilestone.setHeader_text("Container Stuffing Date");
            containerstuffingoMilestone.setRemarks_date(null);
            containerstuffingoMilestone.setDescription("");
            containerstuffingoMilestone.setShipment_type("O");
            containerstuffingoMilestone.setMilestone_status("In process");
        }
        milestonesorg.add(containerstuffingoMilestone);

        MilestoneOriginDTO drafthbloMilestone = new MilestoneOriginDTO();
        drafthbloMilestone.setHeader_text("Draft HBL Issued");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            drafthbloMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            drafthbloMilestone.setDescription("The Draft B/L was issued for your shipment on ");
            drafthbloMilestone.setShipment_type("O");
            drafthbloMilestone.setMilestone_status("COMPLETED");
        } else {
            drafthbloMilestone.setHeader_text("Draft HBL Issued");
            drafthbloMilestone.setRemarks_date(null);
            drafthbloMilestone.setDescription("");
            drafthbloMilestone.setShipment_type("O");
            drafthbloMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(drafthbloMilestone);

        MilestoneOriginDTO bloMilestone = new MilestoneOriginDTO();
        bloMilestone.setHeader_text("BL Released");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            bloMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            bloMilestone.setDescription("The Bill of Lading was released for your shipment on ");
            bloMilestone.setShipment_type("0");
            bloMilestone.setMilestone_status("COMPLETED");
        } else {
            bloMilestone.setHeader_text("BL release");
            bloMilestone.setRemarks_date(null);
            bloMilestone.setDescription("");
            bloMilestone.setShipment_type("0");
            bloMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(bloMilestone);

        MilestoneOriginDTO prealertoMilestone = new MilestoneOriginDTO();
        prealertoMilestone.setHeader_text("Pre Alert");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            prealertoMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            prealertoMilestone.setDescription("A pre-alert was issued for your shipment on ");
            prealertoMilestone.setShipment_type("0");
            prealertoMilestone.setMilestone_status("COMPLETED");
        } else {
            prealertoMilestone.setHeader_text("Pre Alert");
            prealertoMilestone.setRemarks_date(null);
            prealertoMilestone.setDescription("");
            prealertoMilestone.setShipment_type("0");
            prealertoMilestone.setMilestone_status("in process");
        }
        milestonesorg.add(prealertoMilestone);

        responseDTO.setMilestone_origin(milestonesorg);

        List<MilestoneTransitDTO> milestonetra = new ArrayList<>();

        MilestoneTransitDTO shipdepaMilestone = new MilestoneTransitDTO();
        shipdepaMilestone.setHeader_text("Shipment Depature");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            shipdepaMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            shipdepaMilestone.setDescription("Shipment Depature");
            shipdepaMilestone.setShipment_type("T");
            shipdepaMilestone.setMilestone_status("COMPLETED");
        } else {
            shipdepaMilestone.setHeader_text("Shipment Depature");
            shipdepaMilestone.setRemarks_date(null);
            shipdepaMilestone.setDescription("");
            shipdepaMilestone.setShipment_type("T");
            shipdepaMilestone.setMilestone_status("in process");
        }
        milestonetra.add(shipdepaMilestone);

        MilestoneTransitDTO shiparvaMilestone = new MilestoneTransitDTO();
        shiparvaMilestone.setHeader_text("Shipment Arrival");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            shiparvaMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            shiparvaMilestone.setDescription("Shipment Arrival");
            shiparvaMilestone.setShipment_type("T");
            shiparvaMilestone.setMilestone_status("COMPLETED");
        } else {
            shiparvaMilestone.setHeader_text("Shipment Arrival");
            shiparvaMilestone.setRemarks_date(null);
            shiparvaMilestone.setDescription("");
            shiparvaMilestone.setShipment_type("T");
            shiparvaMilestone.setMilestone_status("in process");

        }
        milestonetra.add(shiparvaMilestone);

        MilestoneTransitDTO shipdepbMilestone = new MilestoneTransitDTO();
        shipdepbMilestone.setHeader_text("Shipment Depature");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            shipdepbMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            shipdepbMilestone.setDescription("Shipment Depature");
            shipdepbMilestone.setShipment_type("T");
            shipdepbMilestone.setMilestone_status("COMPLETED");
        } else {
            shipdepbMilestone.setHeader_text("Shipment Depature");
            shipdepbMilestone.setRemarks_date(null);
            shipdepbMilestone.setDescription("");
            shipdepbMilestone.setShipment_type("T");
            shipdepbMilestone.setMilestone_status("in process");
        }
        milestonetra.add(shipdepbMilestone);

        MilestoneTransitDTO shiparvbMilestone = new MilestoneTransitDTO();
        shiparvbMilestone.setHeader_text("Shipment Arrival");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            shiparvbMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            shiparvbMilestone.setDescription("Shipment Arrival");
            shiparvbMilestone.setShipment_type("T");
            shiparvbMilestone.setMilestone_status("COMPLETED");
        } else {
            shiparvbMilestone.setHeader_text("Shipment Arrival");
            shiparvbMilestone.setRemarks_date(null);
            shiparvbMilestone.setDescription("");
            shiparvbMilestone.setShipment_type("T");
            shiparvbMilestone.setMilestone_status("in process");
        }
        milestonetra.add(shiparvbMilestone);

        responseDTO.setMilestone_transit(milestonetra);

        List<MilestoneDestinationDTO> milestonesdes = new ArrayList<>();

        MilestoneDestinationDTO canissuedMilestone = new MilestoneDestinationDTO();
        canissuedMilestone.setHeader_text("CAN Issued");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            canissuedMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            canissuedMilestone.setDescription("The cargo arrival notice was issued for your shipment on");
            canissuedMilestone.setShipment_type("D");
            canissuedMilestone.setMilestone_status("COMPLETED");
        } else {
            canissuedMilestone.setHeader_text("CAN Issue");
            canissuedMilestone.setRemarks_date(null);
            canissuedMilestone.setDescription("");
            canissuedMilestone.setShipment_type("D");
            canissuedMilestone.setMilestone_status("in process");
        }
        milestonesdes.add(canissuedMilestone);

        //master
        MilestoneDestinationDTO containerdestuffdMilestone = new MilestoneDestinationDTO();
        containerdestuffdMilestone.setHeader_text("Container Destuffing Date");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            containerdestuffdMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            containerdestuffdMilestone.setDescription("Your cargo was unloaded from the container on");
            containerdestuffdMilestone.setShipment_type("D");
            containerdestuffdMilestone.setMilestone_status("COMPLETED");
        } else {
            containerdestuffdMilestone.setHeader_text("Container Destuffing Date");
            containerdestuffdMilestone.setRemarks_date(null);
            containerdestuffdMilestone.setDescription("");
            containerdestuffdMilestone.setShipment_type("D");
            containerdestuffdMilestone.setMilestone_status("in process");
        }
        milestonesdes.add(containerdestuffdMilestone);

        MilestoneDestinationDTO importcleardMilestone = new MilestoneDestinationDTO();
        importcleardMilestone.setHeader_text("Import Clearance Date");
        if (shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate() != null) {
            importcleardMilestone.setRemarks_date(formatDate(shipmentHeader.getPickUpDeliveryDetail().getActualDeliveryDate(), outputFormatter));
            importcleardMilestone.setDescription("");
            importcleardMilestone.setShipment_type("D");
            importcleardMilestone.setMilestone_status("COMPLETED");
        } else {
            importcleardMilestone.setHeader_text("Import Clearance Date");
            importcleardMilestone.setRemarks_date(null);
            importcleardMilestone.setDescription("");
            importcleardMilestone.setShipment_type("D");
            importcleardMilestone.setMilestone_status("in process");
        }
        milestonesdes.add(importcleardMilestone);

        MilestoneDestinationDTO doissuedMilestone = new MilestoneDestinationDTO();
        doissuedMilestone.setHeader_text("DO Issued Date");
        if (shipmentHeader.getAddlDetail().getDoDate() != null) {
            doissuedMilestone.setRemarks_date(formatDate(shipmentHeader.getAddlDetail().getDoDate(), outputFormatter));
            doissuedMilestone.setDescription("The Delivery Order was issued for your shipment on");
            doissuedMilestone.setShipment_type("D");
            doissuedMilestone.setMilestone_status("COMPLETED");
        } else {
            doissuedMilestone.setHeader_text("DO Issued Date");
            doissuedMilestone.setRemarks_date(null);
            doissuedMilestone.setDescription("");
            doissuedMilestone.setShipment_type("D");
            doissuedMilestone.setMilestone_status("in process");
        }
        milestonesdes.add(doissuedMilestone);

        responseDTO.setMilestone_destination(milestonesdes);

        return responseDTO;
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