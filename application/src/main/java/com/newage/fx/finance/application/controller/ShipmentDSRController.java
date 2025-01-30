package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.ShipmentPostgresDSRMapper;
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
import java.util.Date;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*", maxAge = 3600)
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
                                                       @RequestParam(value ="shipmentServices.jobId", required = false) String jobId,
                                                       @RequestParam(value ="shipmentServices.serviceName", required = false) String serviceName,
                                                       @RequestParam(value ="shipmentServices.tradeCode", required = false) ImportExport tradeCode,
                                                       @RequestParam(value ="shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
                                                       @RequestParam(value ="direct", required = false) YesNo direct,
                                                       @RequestParam(required = false) Boolean CSDashboard,
                                                       @RequestParam(required = false) String hawbOrHbl,
                                                       @RequestParam(value ="shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus, Principal principal) {
        log.info("Called /api/v1/sales/new-shipments method getAllShipments");

        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest, fromDate, toDate, filter_days,
                Sl_no, jobId, serviceName, null, tradeCode, coLoad, direct, serviceStatus, CSDashboard, hawbOrHbl, null, false, ShipmentType.Shipment, null);
        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        log.info("/api/v1/sales/new-shipments method getAllShipments completed successfully");
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/getdsrbycolumn", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getDSRByColumn(
            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
            @Parameter(hidden = true) Pageable pageRequest,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
            @RequestParam(required = false) Integer filter_days,
            @RequestHeader(required = false) Long branchId,
            @RequestParam(required = false) Long Sl_no,
            @RequestParam(value ="shipmentServices.jobId",required = false) String jobId,
            @RequestParam(value ="shipmentServices.serviceName",required = false) String serviceName,
            @RequestParam(value ="shipmentServices.tradeCode",required = false) ImportExport tradeCode,
            @RequestParam(value ="shipmentServices.serviceAddlDetail.coLoad",required = false) YesNo coLoad,
            @RequestParam(value ="direct",required = false) YesNo direct,
            @RequestParam(required = false) Boolean CSDashboard,
            @RequestParam(required = false) String hawbOrHbl,
            @RequestParam(value ="shipmentServices.serviceStatus",required = false) List<ShipmentStatus> serviceStatus,
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
    @GetMapping(value = "/getCombinedShipments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getCombinedShipments(
            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
            @Parameter(hidden = true) Pageable pageRequest,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
            @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
            @RequestParam(required = false) Integer filter_days,
            @RequestHeader(required = false) Long branchId,
            @RequestParam(required = false) Long Sl_no,
            @RequestParam(value ="shipmentServices.jobId", required = false) String jobId,
            @RequestParam(value ="shipmentServices.serviceName", required = false) String serviceName,
            @RequestParam(value ="shipmentServices.tradeCode", required = false) ImportExport tradeCode,
            @RequestParam(value ="shipmentServices.serviceAddlDetail.coLoad", required = false) YesNo coLoad,
            @RequestParam(value ="direct", required = false) YesNo direct,
            @RequestParam(required = false) Boolean CSDashboard,
            @RequestParam(required = false) String hawbOrHbl,
            @RequestParam(value ="shipmentServices.serviceStatus", required = false) List<ShipmentStatus> serviceStatus,
            @RequestParam(required = false) String operation, // Distinguishing parameter
            Principal principal) {

        log.info("Called /api/getCombinedShipments with operation: {}", operation);

        if ("getAllShipments".equalsIgnoreCase(operation)) {
            return getAllShipments(predicate, pageRequest, fromDate, toDate, filter_days, branchId, Sl_no, jobId, serviceName, tradeCode, coLoad, direct, CSDashboard, hawbOrHbl, serviceStatus, principal);
        } else if ("getDSRByColumn".equalsIgnoreCase(operation)) {
            return getDSRByColumn(predicate, pageRequest, fromDate, toDate, filter_days, branchId, Sl_no, jobId, serviceName, tradeCode, coLoad, direct, CSDashboard, hawbOrHbl, serviceStatus, principal);
        } else {
            return ResponseEntity.badRequest().body(new ResponseDTO(HttpStatus.BAD_REQUEST.value(), Boolean.FALSE, "Invalid operation specified", null));
        }
    }


//    @GetMapping(value = "/getdsrcombined", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<CombinedDSRResponseDTO> getAllShipments(
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
//        log.info("Called /getdsrcombined method getAllShipments with Sl_no: {}", Sl_no);
//
//        try {
//            // Retrieve shipments
//            Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(
//                    predicate, pageRequest, fromDate, toDate, filter_days, Sl_no,
//                    jobId, serviceName, null, tradeCode, coLoad, direct,
//                    serviceStatus, CSDashboard, hawbOrHbl, null, false,
//                    ShipmentType.Shipment, null
//            );
//
//            // Map to DTOs
//            Page<ShipmentDSRResponseDTO> results = shipmentPostgresDSRMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);
//
//            // Retrieve user preferences for columns
//            WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
//            log.debug("User preferences retrieved: {}", userPreferences);
//
//            // If no user preferences found, return all data with null for columns
//            List<String> columnPreferences = (userPreferences != null && userPreferences.getColumnPreferencesList() != null)
//                    ? userPreferences.getColumnPreferencesList()
//                    : null;
//
//            // Convert to DTOs with or without column filter
//            Page<ShipmentDSRResponseDTO> filteredResults = (columnPreferences != null)
//                    ? shipmentPostgresDSRMapper.convertEntityPageToResponsePageWithColumnFilter(pageRequest, shipmentPage, columnPreferences)
//                    : results;  // If no columns, return the full data
//
//            // Create the CombinedDSRResponseDTO
//            CombinedDSRResponseDTO response = CombinedDSRResponseDTO.builder()
//                    .token("success")
//                    .message("Request processed successfully")
//                    .columns(columnPreferences)  // Set columns to null if not found
//                    .data(filteredResults.getContent())  // Get content of filtered results
//                    .build();
//
//            log.info("/getdsrcombined completed successfully with Sl_no: {}", Sl_no);
//            return ResponseEntity.ok(response);
//
//        } catch (Exception e) {
//            log.error("Error occurred while processing /getdsrcombined", e);
//
//            // Return a generic error response in case of unexpected exceptions
//            CombinedDSRResponseDTO errorResponse = CombinedDSRResponseDTO.builder()
//                    .token("error")
//                    .message("An error occurred while processing the request")
//                    .columns(null)  // Set columns to null on error
//                    .data(List.of()) // Empty data on error
//                    .build();
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
//        }
//    }



//
//    @GetMapping(value = "/getdsrcombined", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResponseDTO> getCombinedDSR(
//            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
//            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
//            @Parameter(hidden = true) Pageable pageRequest,
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
//        log.info("Called /api/getdsrcombined");
//
//        // First verify if the Sl_no exists and get column preferences
//        WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
//        if (userPreferences == null || userPreferences.getColumnPreferencesList() == null) {
//            ResponseDTO errorResponse = new ResponseDTO(
//                    HttpStatus.BAD_REQUEST.value(),
//                    Boolean.FALSE,
//                    "No column preferences found for the given serial number",
//                    null
//            );
//            return ResponseEntity.badRequest().body(errorResponse);
//        }
//
//        // Get all shipments first
//        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(
//                predicate, pageRequest, fromDate, toDate, filter_days, Sl_no,
//                jobId, serviceName, null, tradeCode, coLoad, direct,
//                serviceStatus, CSDashboard, hawbOrHbl, null, false,
//                ShipmentType.Shipment, null
//        );
//
//        // Convert to DTOs with filtered columns
//        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePageWithColumnFilter(
//                pageRequest,
//                shipmentPage,
//                userPreferences.getColumnPreferencesList()
//        );
//
//        // Create a combined response object
//        Map<String, Object> combinedResponse = new LinkedHashMap<>();
//        combinedResponse.put("Message", "SUCCESS");
//        combinedResponse.put("columns", userPreferences.getColumnPreferencesList()); // Columns first
//        combinedResponse.put("data", result.getContent()); // Data second
//        combinedResponse.put("Token", ""); // Token last
//
//        ResponseDTO response = new ResponseDTO(
//                HttpStatus.OK.value(),
//                Boolean.TRUE,
//                combinedResponse,
//                null
//        );
//
//        log.info("/api/getdsrcombined completed successfully");
//        return ResponseEntity.ok(response);
//    }

//    @GetMapping(value = "/getdsrcombined", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResponseDTO> getCombinedDSR(
//            @QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
//            @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
//            @Parameter(hidden = true) Pageable pageRequest,
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
//        log.info("Called /api/getdsrcombined");
//
//        // First verify if the Sl_no exists and get column preferences
//        WebUserColumn userPreferences = webUserColumnService.getUserPreferences(Sl_no);
//        if (userPreferences == null || userPreferences.getColumnPreferencesList() == null) {
//            ResponseDTO errorResponse = new ResponseDTO(
//                    HttpStatus.BAD_REQUEST.value(),
//                    Boolean.FALSE,
//                    "No column preferences found for the given serial number",
//                    null
//            );
//            return ResponseEntity.badRequest().body(errorResponse);
//        }
//
//        // Get all shipments first
//        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(
//                predicate, pageRequest, fromDate, toDate, filter_days, Sl_no,
//                jobId, serviceName, null, tradeCode, coLoad, direct,
//                serviceStatus, CSDashboard, hawbOrHbl, null, false,
//                ShipmentType.Shipment, null
//        );
//
//        // Convert to DTOs with filtered columns
//        Page<ShipmentDSRResponseDTO> result = shipmentPostgresDSRMapper.convertEntityPageToResponsePageWithColumnFilter(
//                pageRequest,
//                shipmentPage,
//                userPreferences.getColumnPreferencesList()
//        );
//
//        // Create a combined response object
//        Map<String, Object> combinedResponse = new HashMap<>();
//        combinedResponse.put("Token", ""); // You can set the token if needed
//        combinedResponse.put("Message", "SUCCESS");
//        combinedResponse.put("columns", userPreferences.getColumnPreferencesList());
//        combinedResponse.put("data", result.getContent());
//
//        ResponseDTO response = new ResponseDTO(
//                HttpStatus.OK.value(),
//                Boolean.TRUE,
//                combinedResponse,
//                null
//        );
//
//        log.info("/api/getdsrcombined completed successfully");
//        return ResponseEntity.ok(response);
//    }

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
////        UserMaster user = userRepository.findByUserId(principal.getName());
//////             String customerCode = user.getWebUserDetails().get(0).getCustomerCode();
//////            long nxtCustomerId=user.getWebUserDetails().get(0).getNxtCustomerId();
////        long slNo=user.getWebUserDetails().get(0).getSlNo();
//
//
//        Page<ShipmentHeader> shipmentPage = shipmentDSRPostgresService.getAllShipments(predicate, pageRequest,fromDate,toDate,filter_days,
//                //   branchId,
//                //  customerCode,
////                nxtCustomerId,
//                Sl_no,
//                jobId,serviceName,null,tradeCode,coLoad,direct,serviceStatus, CSDashboard,hawbOrHbl,null,false, ShipmentType.Shipment,null);
//        //  shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getBranchId().equals(branchId)).collect(Collectors.toList())));
////        if (serviceStatus != null && !serviceStatus.isEmpty()) {
////            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> serviceStatus.contains(p.getServiceStatus())).collect(Collectors.toList())));
////        }
////        if (tradeCode != null) {
////            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getTradeCode().equals(tradeCode)).collect(Collectors.toList())));
////        }
//        //filter empty services
////        shipmentPage = new PageImpl<>(shipmentPage.getContent().stream().filter(header -> header.getShipmentServices() != null && !header.getShipmentServices().isEmpty()).collect(Collectors.toList()), shipmentPage.getPageable(), shipmentPage.getTotalElements());
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


