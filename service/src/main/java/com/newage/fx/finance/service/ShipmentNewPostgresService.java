package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.enums.*;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface ShipmentNewPostgresService {

    Page<ShipmentHeader> getAllShipments(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
                                         Integer dateFilter,
                                      //   Long branchId,
                                       //  String customerCode,
                                         long nxtCustomerId,
                                         String jobId, String serviceName, Service service,
                                         ImportExport tradeCode, YesNo coLoad, YesNo direct, List<ShipmentStatus> serviceStatus,
                                         Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob, boolean followupList,
                                         ShipmentType shipmentType, YesNo isTransit);


    ShipmentHeader getShipmentById(long id);
}