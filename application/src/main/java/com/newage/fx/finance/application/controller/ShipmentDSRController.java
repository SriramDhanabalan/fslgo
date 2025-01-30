package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.ShipmentPostgresDSRMapper;
import com.newage.fx.finance.application.dto.response.CombinedResponseDTO;
import com.newage.fx.finance.application.dto.response.ResponseDTO;
import com.newage.fx.finance.application.dto.response.ShipmentDSRResponseDTO;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.entity.WebUserColumn;
import com.newage.fx.finance.domain.enums.ImportExport;
import com.newage.fx.finance.domain.enums.ShipmentStatus;
import com.newage.fx.finance.domain.enums.ShipmentType;
import com.newage.fx.finance.domain.enums.YesNo;
import com.newage.fx.finance.domain.repository.UserMasterRepository;
import com.newage.fx.finance.service.ShipmentDSRPostgresService;
import com.newage.fx.finance.service.WebUserColumnService;
import com.newage.fx.finance.service.impl.UserMasterServiceImpl;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@Log4j2
@RequestMapping(value = "/api")
public class ShipmentDSRController {

    @Autowired
    private ShipmentDSRPostgresService shipmentDSRPostgresService;

    @Autowired
    private UserMasterRepository userRepository;

    @Autowired
    private ShipmentPostgresDSRMapper shipmentPostgresDSRMapper;

    @Autowired
    private UserMasterServiceImpl userMasterService;

    @Autowired
    private WebUserColumnService webUserColumnService;

    @GetMapping(value = "/getdsr", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getAllShipments(@QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
                                                       @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
                                                       @Parameter(hidden = true) Pageable pageRequest,
                                                       @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
                                                       @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
                                                       @RequestParam(required = false) Integer filter_days,
                                                       @RequestHeader(required = false) Long branchId,
                                                       @RequestParam(required = false) Long Sl_no,
                                                       @RequestParam(value = "shipmentServices.jobId", required = false) String jobId,
                                                       @RequestParam(value = "shipmentServices.serviceName", required = false) String serviceName,
                                                       @RequestParam(value = "shipmentServices.tradeCode", required = false) ImportExport tradeCode,
                                                       @RequestParam(value = "shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
                                                       @RequestParam(value = "direct", required = false) YesNo direct,
                                                       @RequestParam(required = false) Boolean CSDashboard,
                                                       @RequestParam(required = false) String hawbOrHbl,
                                                       @RequestParam(value = "shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus, Principal principal) {
        log.info("Called /api/v1/sales/new-shipments method getAllShipments");

        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest, fromDate, toDate, filter_days,
                Sl_no, jobId, serviceName, null, tradeCode, coLoad, direct, serviceStatus, CSDashboard, hawbOrHbl, null, false, ShipmentType.Shipment, null);
        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        log.info("/api/v1/sales/new-shipments method getAllShipments completed successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "user-preferences", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getDSRByColumn(
            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
            @Parameter(hidden = true) Pageable pageRequest,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
            @RequestParam(required = false) Integer filter_days,
            @RequestHeader(required = false) Long branchId,
            @RequestParam(required = false) Long Sl_no,
            @RequestParam(value = "shipmentServices.jobId", required = false) String jobId,
            @RequestParam(value = "shipmentServices.serviceName", required = false) String serviceName,
            @RequestParam(value = "shipmentServices.tradeCode", required = false) ImportExport tradeCode,
            @RequestParam(value = "shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
            @RequestParam(value = "direct", required = false) YesNo direct,
            @RequestParam(required = false) Boolean CSDashboard,
            @RequestParam(required = false) String hawbOrHbl,
            @RequestParam(value = "shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus,
            Principal principal) {

        log.info("Called /api/getdsrbycolumn");

        // First verify if the Sl_no exists and get column preferences
        WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
        if (userPreferences == null || userPreferences.getColumnPreferencesList() == null) {
            ResponseDTO errorResponse = new ResponseDTO(
                    HttpStatus.BAD_REQUEST.value(),
                    Boolean.FALSE,
                    "No column preferences found for the given serial number",
                    null
            );
            return ResponseEntity.badRequest().body(errorResponse);
        }

        // Get all shipments first
        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(
                predicate, pageRequest, fromDate, toDate, filter_days, Sl_no,
                jobId, serviceName, null, tradeCode, coLoad, direct,
                serviceStatus, CSDashboard, hawbOrHbl, null, false,
                ShipmentType.Shipment, null
        );

        // Convert to DTOs with filtered columns
        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePageWithColumnFilter(
                pageRequest,
                shipmentPage,
                userPreferences.getColumnPreferencesList()
        );

        ResponseDTO response = new ResponseDTO(
                HttpStatus.OK.value(),
                Boolean.TRUE,
                result,
                null
        );

        log.info("/api/getdsrbycolumn completed successfully");
        return ResponseEntity.ok(response);
    }


//    @GetMapping(value = "/combined-dsr", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResponseDTO> getCombinedDSR(
//            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
//            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20) Pageable pageRequest,
//            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
//            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
//            @RequestParam(required = false) Integer filter_days,
//            @RequestHeader(required = false) Long branchId,
//            @RequestParam(required = false) Long Sl_no,
//            @RequestParam(value = "shipmentServices.jobId", required = false) String jobId,
//            @RequestParam(value = "shipmentServices.serviceName", required = false) String serviceName,
//            @RequestParam(value = "shipmentServices.tradeCode", required = false) ImportExport tradeCode,
//            @RequestParam(value = "shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
//            @RequestParam(value = "direct", required = false) YesNo direct,
//            @RequestParam(required = false) Boolean CSDashboard,
//            @RequestParam(required = false) String hawbOrHbl,
//            @RequestParam(value = "shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus,
//            Principal principal) {
//
//        log.info("Called /api/combined-dsr method");
//
//        // Fetch shipment data
//        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest, fromDate, toDate, filter_days,
//                Sl_no, jobId, serviceName, null, tradeCode, coLoad, direct, serviceStatus, CSDashboard, hawbOrHbl, null, false, ShipmentType.Shipment, null);
//        Page<ShipmentDSRResponseDTO> shipmentResult = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
//
//        // Fetch user preferences
//        WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
//          List <String> column = null;
//        if (userPreferences != null && userPreferences.getColumnPreferencesList() != null) {
//            column = userPreferences.getColumnPreferencesList();
//        }
//
//        CombinedResponseDTO combinedResponse = new CombinedResponseDTO();
//        combinedResponse.setColumn(column);
//        combinedResponse.setShipmentData(shipmentResult);
//
//
//        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, combinedResponse, null);
//        log.info("/api/combined-dsr method completed successfully");
//        return ResponseEntity.ok(response);
//    }

    @GetMapping(value = "/combined-dsr", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getCombinedDSR(
            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20) Pageable pageRequest,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
            @RequestParam(required = false) Integer filter_days,
            @RequestHeader(required = false) Long branchId,
            @RequestParam(required = false) Long Sl_no,
            @RequestParam(value = "shipmentServices.jobId", required = false) String jobId,
            @RequestParam(value = "shipmentServices.serviceName", required = false) String serviceName,
            @RequestParam(value = "shipmentServices.tradeCode", required = false) ImportExport tradeCode,
            @RequestParam(value = "shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
            @RequestParam(value = "direct", required = false) YesNo direct,
            @RequestParam(required = false) Boolean CSDashboard,
            @RequestParam(required = false) String hawbOrHbl,
            @RequestParam(value = "shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus,
            Principal principal) {

        log.info("Called /api/combined-dsr method");
        // Fetch shipment data
        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest, fromDate, toDate, filter_days,
                Sl_no, jobId, serviceName, null, tradeCode, coLoad, direct, serviceStatus, CSDashboard, hawbOrHbl, null, false, ShipmentType.Shipment, null);
        Page<ShipmentDSRResponseDTO> shipmentResult = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
        // Fetch user preferences
        WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
        List<String> column = null;
        if (userPreferences != null && userPreferences.getColumnPreferencesList() != null) {
            column = userPreferences.getColumnPreferencesList();
        }

        // Create the response structure
        // responseData.put("Token", ""); // Set your token if needed
        // Convert shipmentResult to the desired format
        List<Map<String, Object>> dataList = shipmentResult.getContent().stream()
                .map(shipment -> {
                    Map<String, Object> shipmentData = new HashMap<>();
                    shipmentData.put("SERVICE", shipment.getSERVICE());
                    shipmentData.put("ORDER NO", shipment.getORDER_NO());
                    shipmentData.put("STATUS", shipment.getSTATUS());
                    shipmentData.put("BOOKING NO", shipment.getBOOKING_NO());
                    shipmentData.put("BOOKING DATE", shipment.getBOOKING_DATE());
                    shipmentData.put("ORIGIN", shipment.getORIGIN());
                    shipmentData.put("POL", shipment.getPOL());
                    shipmentData.put("POD", shipment.getPOD());
                    shipmentData.put("FINAL DESTINATION", shipment.getFINAL_DESTINATION());
                    shipmentData.put("CARGO READY DATE", shipment.getCARGO_READY_DATE());
                    shipmentData.put("PICKUP DATE", shipment.getPICKUP_DATE());
                    shipmentData.put("CARGO RECEIVED DATE", shipment.getCARGO_READY_DATE());
                    shipmentData.put("ETD ORIGIN", shipment.getETD_ORIGIN());
                    shipmentData.put("CONNECTION ETA", shipment.getCONNECTION_ETA());
                    shipmentData.put("CONNECTION ETD", shipment.getCONNECTION_ETD());
                    shipmentData.put("ETA DESTINATION", shipment.getETA_DESTINATION());
                    shipmentData.put("HOUSE NO", shipment.getHOUSE_NO());
                    shipmentData.put("TERMS", shipment.getTERMS());
                    shipmentData.put("VESSEL CARRIER", shipment.getVESSEL_CARRIER());
                    shipmentData.put("SHIPPER NAME", shipment.getSHIPPER_NAME());
                    shipmentData.put("CONSIGNEE NAME", shipment.getCONSIGNEE_NAME());
                    shipmentData.put("BILLING PARTY", shipment.getBILLING_PARTY());
                    shipmentData.put("IMPORT EXPORT", shipment.getIMPORT_EXPORT());
                    shipmentData.put("PCS", shipment.getPCS());
                    shipmentData.put("WEIGHT", shipment.getWEIGHT());
                    shipmentData.put("VOLUME", shipment.getVOLUME());
                    shipmentData.put("SHIPPER INVOICE NO", shipment.getSHIPPER_INVOICE_NO());
                    shipmentData.put("CONTAINER NO", shipment.getCONTAINER_NO());
                    shipmentData.put("CONTAINER DETAILS", shipment.getCONTAINER_DETAILS());
                    shipmentData.put("CAN DATE", shipment.getCAN_DATE());
                    shipmentData.put("DO NUMBER", shipment.getDO_NUMBER());
                    shipmentData.put("DO DATE", shipment.getDO_DATE());
                    shipmentData.put("SHIPPER REFERENCE NUMBER", shipment.getSHIPPER_INVOICE_NO());
                    shipmentData.put("IGM/GIGM NO", shipment.getIGM_GIGM_NO());
                    shipmentData.put("IGM/GIGM DATE", shipment.getIGM_GIGM_DATE());
                    shipmentData.put("LIGM NO", shipment.getLIGM_NO());
                    shipmentData.put("LIGM DATE", shipment.getLIGM_DATE());
                    shipmentData.put("HBL/HAWB RELEASED DATE", shipment.getHBL_HAWB_RELEASED_DATE());
                    shipmentData.put("PRE ALERT DATE", shipment.getPRE_ALERT_DATE());
                    shipmentData.put("FRT INVOICE NO", shipment.getFRT_INVOICE_NO());
                    shipmentData.put("FRT INVOICE DATE", shipment.getFRT_INVOICE_DATE());
                    shipmentData.put("SHIPPER INVOICE VALUE", shipment.getSHIPPER_INVOICE_VALUE());
                    shipmentData.put("CARRIER BOOKING NO", shipment.getCARRIER_BOOKING_NO());
                    shipmentData.put("CARRIER BOOKING DATE", shipment.getCARRIER_BOOKING_DATE());
                    shipmentData.put("DIRECT BL", shipment.getDIRECT_BL());
                    shipmentData.put("BRAND", shipment.getBRAND());
                    shipmentData.put("DIVISION", shipment.getDIVISION());
                    shipmentData.put("CHA", shipment.getCHA());
                    shipmentData.put("CONCEPT NAME", shipment.getCONCEPT_NAME());
                    shipmentData.put("SHIPMENT INTENDED DATE", shipment.getSHIPMENT_INTENDED_DATE());
                    shipmentData.put("NAC NAME", shipment.getNAC_NAME());
                    shipmentData.put("CHECKLIST ADVISED", shipment.getCHECKLIST_ADVISED());
                    shipmentData.put("CHECKLIST APPROVED", shipment.getCHECKLIST_APPROVED());
                    shipmentData.put("DUTY ADVISED", shipment.getDUTY_ADVISED());
                    shipmentData.put("DUTY SUBMITTED", shipment.getDUTY_SUBMITTED());
                    shipmentData.put("BOND SENT TO CUSTOMER", shipment.getBOND_SENT_TO_CUSTOMER());
                    shipmentData.put("BOND RECVD FROM CUSTOMER", shipment.getBOND_RECVD_FROM_CUSTOMER());
                    shipmentData.put("BOND DATE", shipment.getBOND_DATE());
                    shipmentData.put("LICENCE NO", shipment.getLICENCE_NO());
                    shipmentData.put("LICENCE DATE", shipment.getLICENCE_DATE());
                    shipmentData.put("REMARKS LATEST UPDATE", shipment.getREMARKS_LATEST_UPDATE());
                    shipmentData.put("SUBJOB UID", shipment.getSUBJOB_UID());
                    shipmentData.put("SLA STATUS", shipment.getSLA_STATUS());
                    return shipmentData;
                })
                .collect(Collectors.toList());

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("Message", "SUCCESS");
        responseData.put("columns", column != null ? column : Collections.emptyList());
        responseData.put("data", dataList);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, responseData, null);
        log.info("/api/combined-dsr method completed successfully");
        return ResponseEntity.ok(response);
    }

}
//@RestController
//@Log4j2
//@RequestMapping(value = "/api")
//public class ShipmentDSRController {
//
//    @Autowired
//    private ShipmentDSRPostgresService shipmentDSRPostgresService;
//
//    @Autowired
//    private UserMasterRepository userRepository;
//
//    @Autowired
//    private ShipmentPostgresDSRMapper shipmentPostgresDSRMapper;
//
//    @Autowired
//    private UserMasterServiceImpl userMasterService;
//
//    @Autowired
//    private WebUserColumnService webUserColumnService;
//
//    @GetMapping(value = "/getdsr",produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResponseDTO> getAllShipments(@QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
//                                                       @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
//                                                       @Parameter(hidden = true) Pageable pageRequest,
//                                                       @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
//                                                       @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
//                                                       @RequestParam(required = false) Integer filter_days,
//                                                       @RequestHeader(required = false) Long branchId,
//                                                       @RequestParam(required = false) Long Sl_no,
//                                                       @RequestParam(value ="shipmentServices.jobId",required = false) String jobId,
//                                                       @RequestParam(value ="shipmentServices.serviceName",required = false) String serviceName,
//                                                       @RequestParam(value ="shipmentServices.tradeCode",required = false) ImportExport tradeCode,
//                                                       @RequestParam(value ="shipmentServices.serviceAddlDetail.coLoad",required = false) YesNo coLoad,
//                                                       @RequestParam(value ="direct",required = false) YesNo direct,
//                                                       @RequestParam(required = false) Boolean CSDashboard,
//                                                       @RequestParam(required = false) String hawbOrHbl,
//                                                       @RequestParam(value ="shipmentServices.serviceStatus",required = false) List<ShipmentStatus> serviceStatus, Principal principal) {
//        log.info("Called /api/v1/sales/new-shipments method getAllShipments");
/// /        UserMaster user = userRepository.findByUserId(principal.getName());
/// ///             String customerCode = user.getWebUserDetails().get(0).getCustomerCode();
/// ///            long nxtCustomerId=user.getWebUserDetails().get(0).getNxtCustomerId();
/// /        long slNo=user.getWebUserDetails().get(0).getSlNo();
//
//
//        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest,fromDate,toDate,filter_days,
//                //   branchId,
//                //  customerCode,
/// /                nxtCustomerId,
//                Sl_no,
//                jobId,serviceName,null,tradeCode,coLoad,direct,serviceStatus, CSDashboard,hawbOrHbl,null,false, ShipmentType.Shipment,null);
//        //  shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getBranchId().equals(branchId)).collect(Collectors.toList())));
/// /        if (serviceStatus != null && !serviceStatus.isEmpty()) {
/// /            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> serviceStatus.contains(p.getServiceStatus())).collect(Collectors.toList())));
/// /        }
/// /        if (tradeCode != null) {
/// /            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getTradeCode().equals(tradeCode)).collect(Collectors.toList())));
/// /        }
//        //filter empty services
/// /        shipmentPage = new PageImpl<>(shipmentPage.getContent().stream().filter(header -> header.getShipmentServices() != null && !header.getShipmentServices().isEmpty()).collect(Collectors.toList()), shipmentPage.getPageable(), shipmentPage.getTotalElements());
//        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
//        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
//        log.info("/api/v1/sales/new-shipments method getAllShipments completed successfully");
//        return ResponseEntity.ok(response);
//    }
//
//
//
//
//    private static final Map<String, String> COLUMN_NAME_MAPPING = new HashMap<>();
//
//        static {
//            // Initialize the COLUMN_NAME_MAPPING in the static block
//            COLUMN_NAME_MAPPING.put("ORDER NO", "orderNo");
//            COLUMN_NAME_MAPPING.put("STATUS", "status");
//            COLUMN_NAME_MAPPING.put("BOOKING NO", "bookingNo");
//            COLUMN_NAME_MAPPING.put("BOOKING DATE", "bookingDate");
//            COLUMN_NAME_MAPPING.put("POL", "pol");
//            COLUMN_NAME_MAPPING.put("POD", "pod");
//            COLUMN_NAME_MAPPING.put("FINAL DESTINATION", "finalDestination");
//            COLUMN_NAME_MAPPING.put("CARGO READY DATE", "cargoReadyDate");
//            COLUMN_NAME_MAPPING.put("PICKUP DATE", "pickupDate");
//            COLUMN_NAME_MAPPING.put("CARGO RECEIVED DATE", "cargoReceivedDate");
//            COLUMN_NAME_MAPPING.put("ETD ORIGIN", "etdOrigin");
//            COLUMN_NAME_MAPPING.put("CONNECTION ETA", "connectionEta");
//            COLUMN_NAME_MAPPING.put("CONNECTION ETD", "connectionEtd");
//            COLUMN_NAME_MAPPING.put("ETA DESTINATION", "etaDestination");
//            COLUMN_NAME_MAPPING.put("HOUSE NO", "houseNo");
//            COLUMN_NAME_MAPPING.put("TERMS", "terms");
//            COLUMN_NAME_MAPPING.put("VESSEL CARRIER", "vesselCarrier");
//            COLUMN_NAME_MAPPING.put("SHIPPER NAME", "shipperName");
//            COLUMN_NAME_MAPPING.put("CONSIGNEE NAME", "consigneeName");
//            COLUMN_NAME_MAPPING.put("BILLING PARTY", "billingParty");
//            COLUMN_NAME_MAPPING.put("IMPORT EXPORT", "importExport");
//            COLUMN_NAME_MAPPING.put("PCS", "pices");
//            COLUMN_NAME_MAPPING.put("WEIGHT", "weight");
//            COLUMN_NAME_MAPPING.put("VOLUME", "volume");
//            COLUMN_NAME_MAPPING.put("SHIPPER INVOICE NO", "shipperInvoiceNo");
//            COLUMN_NAME_MAPPING.put("CONTAINER NO", "containerNo");
//            COLUMN_NAME_MAPPING.put("CONTAINER DETAILS", "containerDetails");
//            COLUMN_NAME_MAPPING.put("CAN DATE", "canDate");
//            COLUMN_NAME_MAPPING.put("DO NUMBER", "doNumber");
//            COLUMN_NAME_MAPPING.put("DO DATE", "doDate");
//            COLUMN_NAME_MAPPING.put("SHIPPER REFERENCE NUMBER", "shipperReferenceNumber");
//            COLUMN_NAME_MAPPING.put("IGM/GIGM NO", "igmGigNo");
//            COLUMN_NAME_MAPPING.put("IGM/GIGM DATE", "igmGigDate");
//            COLUMN_NAME_MAPPING.put("LIGM NO", "ligmNo");
//            COLUMN_NAME_MAPPING.put("LIGM DATE", "ligmDate");
//            COLUMN_NAME_MAPPING.put("HBL/HAWB RELEASED DATE", "hblHawbReleasedDate");
//            COLUMN_NAME_MAPPING.put("PRE ALERT DATE", "preAlertDate");
//            COLUMN_NAME_MAPPING.put("FRT INVOICE NO", "frtInvoiceNo");
//            COLUMN_NAME_MAPPING.put("FRT INVOICE DATE", "frtInvoiceDate");
//            COLUMN_NAME_MAPPING.put("SHIPPER INVOICE VALUE", "shipperInvoiceValue");
//            COLUMN_NAME_MAPPING.put("CARRIER BOOKING NO", "carrierBookingNo");
//            COLUMN_NAME_MAPPING.put("CARRIER BOOKING DATE", "carrierBookingDate");
//            COLUMN_NAME_MAPPING.put("DIRECT BL", "directBl");
//            COLUMN_NAME_MAPPING.put("BRAND", "brand");
//            COLUMN_NAME_MAPPING.put("DIVISION", "division");
//            COLUMN_NAME_MAPPING.put("CHA", "cha");
//            COLUMN_NAME_MAPPING.put("CONCEPT NAME", "conceptName");
//            COLUMN_NAME_MAPPING.put("SHIPMENT INTENDED DATE", "shipmentIntendedDate");
//            COLUMN_NAME_MAPPING.put("NAC NAME", "nacName");
//            COLUMN_NAME_MAPPING.put("CHECKLIST ADVISED", "checklistAdvised");
//            COLUMN_NAME_MAPPING.put("CHECKLIST APPROVED", "checklistApproved");
//            COLUMN_NAME_MAPPING.put("DUTY ADVISED", "dutyAdvised");
//            COLUMN_NAME_MAPPING.put("DUTY SUBMITTED", "dutySubmitted");
//            COLUMN_NAME_MAPPING.put("BOND SENT TO CUSTOMER", "bondSentToCustomer");
//            COLUMN_NAME_MAPPING.put("BOND RECVD FROM CUSTOMER", "bondReceivedFromCustomer");
//            COLUMN_NAME_MAPPING.put("BOND DATE", "bondDate");
//            COLUMN_NAME_MAPPING.put("LICENCE NO", "licenceNo");
//            COLUMN_NAME_MAPPING.put("LICENCE DATE", "licenceDate");
//            COLUMN_NAME_MAPPING.put("REMARKS LATEST UPDATE", "remarksLatestUpdate");
//            COLUMN_NAME_MAPPING.put("SUBJOB UID", "subjobUid");
//            COLUMN_NAME_MAPPING.put("SLA STATUS", "slaStatus");
//        }
//
//        @GetMapping(value = "/getdsrbycolumn", produces = MediaType.APPLICATION_JSON_VALUE)
//        public ResponseEntity<ResponseDTO> getDsrByColumn(@RequestParam Long Sl_no,
//                                                          @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
//                                                          @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20) Pageable pageRequest) {
//            log.info("Method getDsrByColumn called for Sl_no: {}", Sl_no);
//
//            // Fetch user preferences by serial number
//            WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
//            if (userPreferences == null) {
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                        .body(new ResponseDTO(HttpStatus.BAD_REQUEST.value(), false, "Invalid serial number.", null));
//            }
//
//            // Ensure that column preferences list is not null or empty
//            List<String> selectedColumns = userPreferences.getColumnPreferencesList();
//            if (selectedColumns == null || selectedColumns.isEmpty()) {
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                        .body(new ResponseDTO(HttpStatus.BAD_REQUEST.value(), false, "No columns selected.", null));
//            }
//
//            // Get the shipments based on the provided serial number
//            Page<ShipmentHeader> shipments = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest, null, null, null, Sl_no, null, null, null, null, null, null, null, null, null, null, null);
//            if (shipments == null) {
//                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                        .body(new ResponseDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), false, "No shipments found.", null));
//            }
//
//            // Convert the shipments page to a filtered response page
//            Page<ShipmentDSRResponseDTO> filteredResponse = shipmentPostgresDSRMapper.convertEntityPageToFilteredResponsePage(pageRequest, shipments, selectedColumns, COLUMN_NAME_MAPPING);
//
//            log.info("Method getDsrByColumn completed successfully for Sl_no: {}", Sl_no);
//            return ResponseEntity.ok(new ResponseDTO(HttpStatus.OK.value(), true, filteredResponse, null));
//        }
//
//        public Page<ShipmentDSRResponseDTO> convertEntityPageToFilteredResponsePage(Pageable pageRequest, Page<ShipmentHeader> shipments, List<String> selectedColumns, Map<String, String> columnNameMapping) {
//            List<ShipmentDSRResponseDTO> responseList = new ArrayList<>();
//
//            // Loop through each shipment and map the selected columns to the response DTO
//            for (ShipmentHeader shipment : shipments) {
//                ShipmentDSRResponseDTO responseDTO = new ShipmentDSRResponseDTO();
//
//                // Loop through the selected columns from user preferences
//                for (String column : selectedColumns) {
//                    String actualColumnName = columnNameMapping.get(column.toUpperCase());
//
//                    if (actualColumnName != null) {
//                        // Use reflection to get the field value from ShipmentHeader based on the column name
//                        try {
//                            Field field = ShipmentHeader.class.getDeclaredField(actualColumnName);
//                            field.setAccessible(true);
//                            Object value = field.get(shipment);
//
//                            // Set the value in the response DTO
//                            Field responseField = ShipmentDSRResponseDTO.class.getDeclaredField(actualColumnName);
//                            responseField.setAccessible(true);
//                            responseField.set(responseDTO, value);
//
//                        } catch (NoSuchFieldException | IllegalAccessException e) {
//                            log.error("Error setting field value", e);
//                        }
//                    }
//                }
//
//                responseList.add(responseDTO);
//            }
//
//            return new PageImpl<>(responseList, pageRequest, shipments.getTotalElements());
//        }


