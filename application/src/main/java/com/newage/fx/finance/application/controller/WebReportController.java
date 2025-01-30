//package com.newage.fx.finance.application.controller;
//
//
//import com.newage.fx.finance.application.dto.request.WebReportRequestDTO;
//import com.newage.fx.finance.application.dto.response.ResponseDTO;
//import com.newage.fx.finance.service.WebReportService;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Log4j2
//@RequestMapping(value = "/api")
//public class WebReportController {
//
//    @Autowired
//    private WebReportService webReportService;
//
//    @PostMapping(value = "/schedule-web-report", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<ResponseDTO> scheduleWebReport(@RequestBody WebReportRequestDTO requestDTO) {
//        // Log information
//        System.out.println("Called /api/schedule-web-report to schedule Web Report");
//
//        // Call service method to schedule the WebReport
//        webReportService.scheduleWebReport(requestDTO);
//
//        // Return success response
//        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, "Web Report scheduled successfully.", null );
//        System.out.println("/api/schedule-web-report completed successfully");
//
//        return ResponseEntity.ok(response);
//    }
//    }
//
////    @GetMapping(value = "/get-web-reports", produces = MediaType.APPLICATION_JSON_VALUE)
////    public ResponseEntity<ResponseDTO> getAllWebReports(@QuerydslPredicate(root = WebReport.class) Predicate predicate,
////                                                        @PageableDefault(sort = {"userId"}, direction = Sort.Direction.DESC, size = 20)
////                                                        @Parameter(hidden = true) Pageable pageRequest,
////                                                        @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate,
////                                                        @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
////                                                        @RequestParam(required = false) String status,
////                                                        @RequestParam(required = false) String reportType) {
////        log.info("Called /api/get-web-reports method to get all web reports");
////
////        Page<WebReport> webReportPage = webReportService.getAllWebReports(predicate, pageRequest, fromDate, toDate, status, reportType);
////        Page<WebReportResponseDTO> result = webReportServiceImpl.convertEntityPageToResponsePage(pageRequest, webReportPage);
////
////        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
////        log.info("/api/get-web-reports method completed successfully");
////
////        return ResponseEntity.ok(response);
////    }
//
