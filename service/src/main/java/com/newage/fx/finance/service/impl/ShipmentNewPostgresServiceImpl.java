package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.QShipmentHeader;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.enums.*;
import com.newage.fx.finance.domain.repository.ShipmentNewPostgresRepository;
import com.newage.fx.finance.service.ShipmentNewPostgresService;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Log4j2
@Service
public class ShipmentNewPostgresServiceImpl implements ShipmentNewPostgresService {

    private final ShipmentNewPostgresRepository shipmentNewPostgresRepository;

    public ShipmentNewPostgresServiceImpl(ShipmentNewPostgresRepository shipmentNewPostgresRepository) {
        this.shipmentNewPostgresRepository = shipmentNewPostgresRepository;
    }


        @Transactional
        @Override
        public Page<ShipmentHeader> getAllShipments(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, Integer dateFilter,
                                                   // Long branchId,
                                                   // String customerCode,
                                                    long nxtCustomerId,
                                                    String jobId, String serviceName, com.newage.fx.finance.domain.enums.Service  service, ImportExport tradeCode, YesNo coLoad, YesNo direct,
                                                    List<ShipmentStatus> serviceStatus, Boolean CSDashboard, String hawbOrHbl, YesNo isServiceJob, boolean followupList, ShipmentType shipmentType, YesNo isTransit) {
            log.info("Method getAllShipments called");
            QShipmentHeader shipment = QShipmentHeader.shipmentHeader;
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime midnight = now.toLocalDate().atStartOfDay();
            Date d1 = Date.from(midnight.atZone(ZoneId.systemDefault()).toInstant());
            Date d2 = Date.from(now.atZone(ZoneId.systemDefault()).toInstant());
            Date dt1 = null;
            Date dt2 = null;

            boolean isdatefilter = false;
            if (dateFilter!=null) {
                isdatefilter = true;
                if (dateFilter == DateFilter.TODAY.getDays()) {
                    dt1 = DateUtils.addDays(d1, 0);
                    dt2 = DateUtils.addDays(d2, 1);
                } else if (dateFilter == DateFilter.LAST_7_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -7);
                    dt2 = DateUtils.addDays(d2, 0);
                } else if (dateFilter == DateFilter.LAST_15_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -15);
                    dt2 = DateUtils.addDays(d2, 0);
                } else if (dateFilter == DateFilter.LAST_30_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -30);
                    dt2 = DateUtils.addDays(d2, 0);
                }else if (dateFilter == DateFilter.LAST_60_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -60);
                    dt2 = DateUtils.addDays(d2, 0);
                }else if (dateFilter == DateFilter.LAST_90_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -90);
                    dt2 = DateUtils.addDays(d2, 0);
                }else if (dateFilter == DateFilter.LAST_180_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -180);
                    dt2 = DateUtils.addDays(d2, 0);
                } else if (dateFilter == DateFilter.LAST_365_DAYS.getDays()) {
                    dt1 = DateUtils.addDays(d1, -365);
                    dt2 = DateUtils.addDays(d2, 0);
                }
            }
            if (fromDate != null && toDate != null) {
                isdatefilter = true;
                dt1 = DateUtils.addDays(fromDate, 0);
                dt2 = DateUtils.addDays(toDate, 1);
            }
            log.info("dateFilter  " + dateFilter);
            log.info("dt1----" + dt1);
            log.info("dt2----" + dt2);

            Collection<Predicate> predicates = new ArrayList();
            predicates.add(predicate);
            if (direct != null) {
                predicates.add(shipment.direct.eq(direct));
            }
            if (isdatefilter) {
                predicates.add(shipment.shipmentServices.any().shipmentDate.between(dt1, dt2));
            }
            if (jobId != null) {
                predicates.add(shipment.shipmentServices.any().jobId.containsIgnoreCase(jobId).or(shipment.shipmentUid.containsIgnoreCase(jobId)));
            }
            if (hawbOrHbl != null) {
                predicates.add(shipment.addlDetail.transportDocumentNo.containsIgnoreCase(hawbOrHbl).
                        or(shipment.transportDocumentAir.documentNo.containsIgnoreCase(hawbOrHbl).
                                or(shipment.transportDocumentAir.documentNo.containsIgnoreCase(hawbOrHbl))));
            }
            if (serviceName != null) {
                predicates.add(shipment.shipmentServices.any().serviceName.containsIgnoreCase(serviceName));
            }

//            if (branchId != null) {
//                predicates.add(shipment.shipmentServices.any().branchId.eq(branchId));
//            }
//            if (customerCode != null) {
//                predicates.add(shipment.webUserDetail.customerCode.eq(customerCode));
//            }
//
            if (nxtCustomerId!=-1) {
                predicates.add(
                                        (shipment.partyDetail.consigneeId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.shipperId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.notifyOneId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.notifyTwoId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.forwarderId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.originAgentId.eq(nxtCustomerId))
                                        .or(shipment.partyDetail.destinationAgentId.eq(nxtCustomerId)));


            }
            if (serviceStatus != null) {
                predicates.add(shipment.shipmentServices.any().serviceStatus.in(serviceStatus));
            }
            if (tradeCode != null) {
                predicates.add(shipment.shipmentServices.any().tradeCode.eq(tradeCode));
            }
            if (coLoad != null) {
                predicates.add(shipment.shipmentServices.any().serviceAddlDetail.coLoad.eq(coLoad));
            }
            if (CSDashboard != null && CSDashboard) {
                predicates.add(shipment.shipmentServices.any().serviceStatus.notIn(ShipmentStatus.Cancelled));
                predicates.add(shipment.signOff.any().isChecked.eq(YesNo.No));
            }
            if (isServiceJob!=null){
                predicates.add(shipment.addlDetail.isServiceJob.eq(isServiceJob));
            }
            if (isTransit!=null){
                predicates.add(shipment.shipmentServices.any().otherTrade.eq(OtherTrade.Transit));
            }
            if (followupList){
                predicates.add(shipment.pickUpDeliveryDetail.plannedPickupDate.isNotNull());
            }
            if(service!=null){
                predicates.add(shipment.serviceType.eq(service));
            }
            if(shipmentType!=null){
                if(ShipmentType.ServiceShipment.equals(shipmentType)){
                    predicates.add(shipment.addlDetail.isServiceJob.eq(YesNo.Yes));
                }else if(ShipmentType.CourierShipment.equals(shipmentType)){
                    predicates.add(shipment.addlDetail.isCourierShipment.eq(YesNo.Yes));
                }else{
                    predicates.add(shipment.addlDetail.isServiceJob.eq(YesNo.No)
                            .and(shipment.addlDetail.isCourierShipment.eq(YesNo.No)));
                }
            }
            if(shipmentType==null && (isServiceJob==null||YesNo.No.equals(isServiceJob))){
                predicates.add(shipment.addlDetail.isServiceJob.ne(YesNo.Yes)
                        .and(shipment.addlDetail.isCourierShipment.ne(YesNo.Yes)));
            }

            Predicate predicateAll = ExpressionUtils.allOf(predicates);
            return shipmentNewPostgresRepository.findAll(predicateAll, pageRequest);
        }
    }
