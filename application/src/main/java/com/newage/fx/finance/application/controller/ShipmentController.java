package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.ShipmentPostgresMapper;
import com.newage.fx.finance.application.dto.response.ShipmentResponseDTO;
import com.newage.fx.finance.application.dto.response.ShipmentsHeaderResponseDTO;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.entity.UserMaster;
import com.newage.fx.finance.domain.enums.*;
import com.newage.fx.finance.domain.repository.UserMasterRepository;
import com.newage.fx.finance.service.ShipmentNewPostgresService;
import com.newage.fx.finance.service.impl.UserMasterServiceImpl;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
@RestController
@Log4j2
@RequestMapping(value = "/api")
public class ShipmentController {

    @Autowired
    private ShipmentNewPostgresService shipmentNewPostgresService;
    @Autowired
    private UserMasterRepository userRepository;
    @Autowired
    private ShipmentPostgresMapper shipmentPostgresMapper;
    @Autowired
    private UserMasterServiceImpl userMasterService;

    @GetMapping(value = "/booking_list",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ShipmentResponseDTO> getAllShipments(@QuerydslPredicate(root = ShipmentHeader.class) Predicate predicate,
                                                               @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20)
                                                               @Parameter(hidden = true) Pageable pageRequest,
                                                               @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
                                                               @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
                                                               @RequestParam(required = false) Integer filter_days,
                                                               @RequestHeader(required = false) Long branchId,
                                                               @RequestParam(value ="shipmentServices.jobId",required = false) String jobId,
                                                               @RequestParam(value ="shipmentServices.serviceName",required = false) String serviceName,
                                                               @RequestParam(value ="shipmentServices.tradeCode",required = false) ImportExport tradeCode,
                                                               @RequestParam(value ="shipmentServices.serviceAddlDetail.coLoad",required = false) YesNo coLoad,
                                                               @RequestParam(value ="direct",required = false) YesNo direct,
                                                               @RequestParam(required = false) Boolean CSDashboard,
                                                               @RequestParam(required = false) String hawbOrHbl,
                                                               @RequestParam(value ="shipmentServices.serviceStatus",required = false) List<ShipmentStatus> serviceStatus, Principal principal) {
        log.info("Called /api/v1/sales/new-shipments method getAllShipments");
        UserMaster user = userRepository.findByUserId(principal.getName());
        //    String customerCode = user.getWebUserDetails().get(0).getCustomerCode();
        long nxtCustomerId=user.getWebUserDetails().get(0).getNxtCustomerId();

        Page<ShipmentHeader> shipmentPage = shipmentNewPostgresService.getAllShipments(predicate, pageRequest,fromDate,toDate,filter_days,
                //   branchId,
                //  customerCode,
                nxtCustomerId,
                jobId,serviceName,null,tradeCode,coLoad,direct,serviceStatus, CSDashboard,hawbOrHbl,null,false, ShipmentType.Shipment,null);
        //  shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getBranchId().equals(branchId)).collect(Collectors.toList())));
        if (serviceStatus != null && !serviceStatus.isEmpty()) {
            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> serviceStatus.contains(p.getServiceStatus())).collect(Collectors.toList())));
        }
        if (tradeCode != null) {
            shipmentPage.forEach(e -> e.setShipmentServices(e.getShipmentServices().stream().filter(p -> p.getTradeCode().equals(tradeCode)).collect(Collectors.toList())));
        }

        shipmentPage = new PageImpl<>(shipmentPage.getContent().stream().filter(header -> header.getShipmentServices() != null && !header.getShipmentServices().isEmpty()).collect(Collectors.toList()), shipmentPage.getPageable(), shipmentPage.getTotalElements());
        Page<ShipmentsHeaderResponseDTO> result = shipmentPostgresMapper.convertEntityPageToResponsePage(pageRequest, shipmentPage);

        Map<String, Long> statusCounts = result.getContent().stream()
                .collect(Collectors.groupingBy(ShipmentsHeaderResponseDTO::getStatus, Collectors.counting()));

        Map<String, String> formattedCounts = new HashMap<>();
        if (statusCounts.containsKey("Booked")) {
            formattedCounts.put("booked", String.valueOf(statusCounts.get("Booked")));
        }
        if (statusCounts.containsKey("Delivered")) {
            formattedCounts.put("delivered", String.valueOf(statusCounts.get("Delivered")));
        }
        if (statusCounts.containsKey("Arrived")) {
            formattedCounts.put("arrived", String.valueOf(statusCounts.get("Arrived")));
        }
        if (statusCounts.containsKey("In Transit")) {
            formattedCounts.put("in_transit", String.valueOf(statusCounts.get("In Transit")));
        }
        if (statusCounts.containsKey("Cancelled")) {
            formattedCounts.put("cancelled", String.valueOf(statusCounts.get("Cancelled")));
        }

        formattedCounts.put("all", String.valueOf(result.getContent().size()));


        ShipmentResponseDTO response = new ShipmentResponseDTO(HttpStatus.OK.value(), "Success", String.valueOf(result.getContent().size()), List.of(formattedCounts), result.getContent(),null);
        log.info("/api/v1/sales/new-shipments method getAllShipments completed successfully");
        return ResponseEntity.ok(response);
    }

}
