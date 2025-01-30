//package com.newage.fx.finance.service.impl;
//
//
//
//import com.newage.fx.finance.domain.entity.WebReport;
//import com.newage.fx.finance.domain.repository.WebReportRepository;
//import com.newage.fx.finance.service.WebReportService;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Date;
//
//@Service
//public class WebReportServiceImpl implements WebReportService {
//
//    private final WebReportRepository webReportRepository;
//
//    public WebReportServiceImpl(WebReportRepository webReportRepository) {
//        this.webReportRepository = webReportRepository;
//    }
//
//    @Transactional
//    @Override
//    public void scheduleWebReport(WebReportRequestDTO requestDTO) {
//        // Check if a WebReport already exists for the provided email
//        WebReport existingReport = webReportRepository.findByEmail(requestDTO.getSEmail()).orElse(null);
//
//        // If the WebReport with the provided email exists, update it; otherwise, create a new one
//        WebReport webReport;
//        if (existingReport != null) {
//            // Update the existing report preferences
//            webReport = existingReport;
//            webReport.setReportId(requestDTO.getSreport_id());
//            webReport.setPresetName(requestDTO.getSpreset_name());
//            webReport.setSlNo(requestDTO.getSl_no());
////            webReport.setLinkType(requestDTO.getLink_type());
//            webReport.setDaily(requestDTO.getSDaily());
//            webReport.setWeekly(requestDTO.getSWeekly());
//            webReport.setMonthly(requestDTO.getSMonthly());
////            webReport.setType(requestDTO.getStype());
//            webReport.setReportName(requestDTO.getSreport_name());
//
//            // Handle shipment statuses (List)
//            if (requestDTO.getShipment_status() != null && !requestDTO.getShipment_status().isEmpty()) {
//                webReport.setShipmentStatus(String.join(",", requestDTO.getShipment_status()));
//            }
//
//            // Optionally update run date or other fields if necessary
//            webReport.setRunDate(new Date());  // Updating the run date for existing report
//        } else {
//            // Create a new WebReport if it doesn't exist
//            webReport = new WebReport();
//            webReport.setEmail(requestDTO.getSEmail());  // Set the provided email
//            webReport.setReportId(requestDTO.getSreport_id());
//            webReport.setPresetName(requestDTO.getSpreset_name());
//            webReport.setSlNo(requestDTO.getSl_no());
////            webReport.setLinkType(requestDTO.getLink_type());
//            webReport.setDaily(requestDTO.getSDaily());
//            webReport.setWeekly(requestDTO.getSWeekly());
//            webReport.setMonthly(requestDTO.getSMonthly());
////            webReport.setType(requestDTO.getStype());
//            webReport.setReportName(requestDTO.getSreport_name());
//
//            // Handle shipment statuses (List)
//            if (requestDTO.getShipment_status() != null && !requestDTO.getShipment_status().isEmpty()) {
//                webReport.setShipmentStatus(String.join(",", requestDTO.getShipment_status()));
//            }
//
//            // Set the run date for a new report
//            webReport.setRunDate(new Date());  // Set the current date for the new report
//        }
//
//        // Save the WebReport (either updated or new)
//        webReportRepository.save(webReport);
//    }
//}
//
////
////import com.newage.fx.finance.application.dto.request.WebReportRequestDTO;
////import com.newage.fx.finance.domain.entity.QWebReport;
////import com.newage.fx.finance.domain.entity.WebReport;
////import com.newage.fx.finance.domain.repository.WebReportRepository;
////import com.newage.fx.finance.service.WebReportService;
////import com.querydsl.core.types.ExpressionUtils;
////import com.querydsl.core.types.Predicate;
////import lombok.extern.log4j.Log4j2;
////import org.apache.commons.lang3.time.DateUtils;
////import org.springframework.data.domain.Page;
////import org.springframework.data.domain.Pageable;
////import org.springframework.stereotype.Service;
////import org.springframework.transaction.annotation.Transactional;
////
////import java.time.LocalDateTime;
////import java.time.ZoneId;
////import java.util.ArrayList;
////import java.util.Date;
////import java.util.List;
////
////@Log4j2
////@Service
////public class WebReportServiceImpl implements WebReportService {
////
////    private final WebReportRepository webReportRepository;
////
////    public WebReportServiceImpl(WebReportRepository webReportRepository) {
////        this.webReportRepository = webReportRepository;
////    }
////
////    @Transactional
////    @Override
////    public Page<WebReport> getWebReports(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
////                                         Integer dateFilter, String reportName, String email, List<String> reportStatus,
////                                         boolean includeAdditionalInfo) {
////
////        log.info("Method getWebReports called");
////
////        QWebReport webReport = QWebReport.webReport;
////        LocalDateTime now = LocalDateTime.now();
////        LocalDateTime midnight = now.toLocalDate().atStartOfDay();
////        Date startOfDay = Date.from(midnight.atZone(ZoneId.systemDefault()).toInstant());
////        Date endOfDay = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
////        Date filterStartDate = null;
////        Date filterEndDate = null;
////
////        boolean dateFilterApplied = false;
////        if (dateFilter != null) {
////            dateFilterApplied = true;
////            switch (dateFilter) {
////                case 1:
////                    filterStartDate = DateUtils.addDays(startOfDay, 0);
////                    filterEndDate = DateUtils.addDays(endOfDay, 1);
////                    break;
////                case 7:
////                    filterStartDate = DateUtils.addDays(startOfDay, -7);
////                    filterEndDate = DateUtils.addDays(endOfDay, 0);
////                    break;
////                case 30:
////                    filterStartDate = DateUtils.addDays(startOfDay, -30);
////                    filterEndDate = DateUtils.addDays(endOfDay, 0);
////                    break;
////                case 90:
////                    filterStartDate = DateUtils.addDays(startOfDay, -90);
////                    filterEndDate = DateUtils.addDays(endOfDay, 0);
////                    break;
////                case 180:
////                    filterStartDate = DateUtils.addDays(startOfDay, -180);
////                    filterEndDate = DateUtils.addDays(endOfDay, 0);
////                    break;
////                default:
////                    break;
////            }
////        }
////
////        if (fromDate != null && toDate != null) {
////            dateFilterApplied = true;
////            filterStartDate = DateUtils.addDays(fromDate, 0);
////            filterEndDate = DateUtils.addDays(toDate, 1);
////        }
////
////        log.info("dateFilter " + dateFilter);
////        log.info("filterStartDate----" + filterStartDate);
////        log.info("filterEndDate----" + filterEndDate);
////
////        List<Predicate> predicates = new ArrayList<>();
////        predicates.add(predicate);
////
////        // Apply reportName filter if provided
////        if (reportName != null && !reportName.isEmpty()) {
////            predicates.add(webReport.reportName.containsIgnoreCase(reportName));
////        }
////
////        // Apply email filter if provided
////        if (email != null && !email.isEmpty()) {
////            predicates.add(webReport.email.containsIgnoreCase(email));
////        }
////
////        // Apply reportStatus filter if provided
////        if (reportStatus != null && !reportStatus.isEmpty()) {
////            predicates.add(webReport.status.in(reportStatus));
////        }
////
////        // Apply date filters if necessary
////        if (dateFilterApplied) {
////            predicates.add(webReport.runDate.between(filterStartDate, filterEndDate));
////        }
////
////        // Include additional info if specified
////        if (includeAdditionalInfo) {
////            predicates.add(webReport.filterAddon.eq("true"));
////        }
////
////        // Combine all the predicates
////        Predicate finalPredicate = ExpressionUtils.allOf(predicates);
////
////        // Query the database
////        return webReportRepository.findAll(finalPredicate, pageRequest);
////    }
////
////    @Override
////    public Page<WebReport> getWebReports(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, Integer dateFilter, Long customerId, String reportName, String jobId, String serviceType, List<String> reportStatus, Boolean includeDetails, boolean includeAdditionalInfo) {
////        return null;
////    }
////
////    @Override
////    public WebReport scheduleWebReport(WebReportRequestDTO requestDTO) {
////        return null;
////    }
////}
