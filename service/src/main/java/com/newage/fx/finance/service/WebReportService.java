package com.newage.fx.finance.service;


import com.newage.fx.finance.domain.entity.WebReport;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface WebReportService {

    @Transactional
    Page<WebReport> getWebReports(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
                                  Integer dateFilter, String reportName, String email, List<String> reportStatus,
                                  boolean includeAdditionalInfo);

    Page<WebReport> getWebReports(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
                                  Integer dateFilter, Long customerId, String reportName, String jobId,
                                  String serviceType, List<String> reportStatus, Boolean includeDetails,
                                  boolean includeAdditionalInfo);}

//    WebReport scheduleWebReport(WebReportRequestDTO requestDTO);}
