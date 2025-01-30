package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.enums.*;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface ShipmentDSRPostgresService {


    Page<ShipmentHeader> getAllShipments(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
                                         Integer dateFilter,
                                         //   Long branchId,
                                         //  String customerCode,
                                         long nxtCustomerId,

                                         String jobId, String serviceName, Service service,
                                         ImportExport tradeCode, YesNo coLoad, YesNo direct, List<ShipmentStatus> serviceStatus,
                                         Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob, boolean followupList,
                                         ShipmentType shipmentType, YesNo isTransit);

    Page<ShipmentHeader> getAllShipments(Predicate predicate, Pageable pageRequest, Object o, Object o1, Object o2, Long slNo, Object o3, Object o4, Object o5, Object o6, Object o7, Object o8, Object o9, Object o10, Object o11, Object o12, Object o13);


//    @Transactional
//    Page<ShipmentHeader> getAllDSRShipments(
//            Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, DateFilter dateFilter,
//            long nxtCustomerId, String jobId, String serviceName,
//            Service service, ImportExport tradeCode,
//            YesNo coLoad, YesNo direct, List<ShipmentStatus> serviceStatus,
//            Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob, boolean followupList,
//            ShipmentType shipmentType, YesNo isTransit,
//            Long forwarderId, ServiceType businessType, Integer noOfPieces,
//            Double grossWeightKgs, Double volumeInCbm, String shipperRefNo,
//            String lcNumber, Date lcExpiryDate, Date doDate, String doNumber);
//
//    Page<ShipmentHeader> getAllShipments(
//            Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate,
//            DateFilter dateFilter,
//            long nxtCustomerId,
//            String jobId, String serviceName, Service service,
//            ImportExport tradeCode, YesNo coLoad, YesNo direct,
//            List<ShipmentStatus> serviceStatus,
//            Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob,
//            boolean followupList, ShipmentType shipmentType, YesNo isTransit,
//            Long forwarderId,
//            ServiceType businessType,
//            Integer noOfPieces,
//            Double grossWeightKgs,
//            Double volumeInCbm,
//            String shipperRefNo,
//            String lcNumber,
//            Date lcExpiryDate,
//            Date doDate,
//            String doNumber
//    );
//
//    Page<ShipmentHeader> getAllShipments(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, DateFilter dateFilter, long nxtCustomerId, String jobId, String serviceName, Service service, ImportExport tradeCode, YesNo coLoad, YesNo direct, List<ShipmentStatus> serviceStatus, Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob, boolean followupList, ShipmentType shipmentType, YesNo isTransit);
//}
}