package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.ContainerPack;
import com.newage.fx.finance.domain.entity.QSailingScheduleHeaderDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleHeaderDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleVesselDetails;
import com.newage.fx.finance.domain.enums.DateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleDateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import com.newage.fx.finance.domain.repository.SailingScheduleNewRepository;
import com.newage.fx.finance.service.SailingScheduleVesselService;
import com.newage.fx.finance.service.exception.ServiceException;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Log4j2
@Service
@Transactional
public class SailingScheduleVesselServiceImpl implements SailingScheduleVesselService {

    private final SailingScheduleNewRepository testRepository;


    public SailingScheduleVesselServiceImpl(  SailingScheduleNewRepository testRepository) {
       // this.sailingScheduleVesselRepository = sailingScheduleVesselRepository;
       // this.sailingScheduleRepository = sailingScheduleRepository;
        this.testRepository = testRepository;
    }





    @Override
    public SailingScheduleVesselDetails createSailingSchedule(SailingScheduleVesselDetails sailingScheduleVesselDetails) {
        return null;
    }

    @Override
    public SailingScheduleVesselDetails getSailingScheduleById(Long id) {
        return null;
    }

    @Override
    public SailingScheduleHeaderDetails createNewSailingSchedule(SailingScheduleHeaderDetails sailingScheduleHeaderDetails) {
        return null;
    }

//    @Override
//    public Page<SailingScheduleHeaderDetails> getAllNewSailingSchedule(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, DateFilter dateFilter, SailingScheduleDateFilter sailingScheduleDateFilter, List<SailingScheduleStatus> sailingScheduleStatus, Long groupCompanyId) {
//        return null;
//    }









    @Override
    public Page <SailingScheduleHeaderDetails> getAllNewSailingSchedule(Predicate predicate, Pageable pageRequest,
                                                                        Date fromDate, Date toDate,
                                                                        DateFilter dateFilter, SailingScheduleDateFilter sailingScheduleDateFilter, List<SailingScheduleStatus> sailingScheduleStatus, Long groupCompanyId) {

        QSailingScheduleHeaderDetails sailingSchedule = QSailingScheduleHeaderDetails.sailingScheduleHeaderDetails;
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime midnight = now.toLocalDate().atStartOfDay();
        /*ZoneId zoneId = ZoneId.systemDefault();
        Date d2 = Date.from(midnight.atZone(zoneId).toInstant());*/
        Date d2 = Date.from(midnight.atZone(ZoneId.of("Asia/Kolkata")).toInstant());
        Date dt1 = null;
        Date dt2 = null;

        boolean isdatefilter = false;
        if (dateFilter != null) {
            isdatefilter = true;
            if (dateFilter == DateFilter.TODAY) {
                dt1 = DateUtils.addDays(d2, 0);
                dt2 = DateUtils.addDays(d2, 1);
            } else if (dateFilter == DateFilter.LAST_7_DAYS) {
                dt1 = DateUtils.addDays(d2, -7);
                dt2 = DateUtils.addDays(d2, 0);
            } else if (dateFilter == DateFilter.LAST_15_DAYS) {
                dt1 = DateUtils.addDays(d2, -15);
                dt2 = DateUtils.addDays(d2, 0);
            } else if (dateFilter == DateFilter.LAST_30_DAYS) {
                dt1 = DateUtils.addDays(d2, -30);
                dt2 = DateUtils.addDays(d2, 0);
            }
        }
//        if (fromDate != null && toDate == null && sailingScheduleDateFilter == null) {
//            throw new ServiceException(ServiceErrors.PLEASE_PROVIDE_THE_TO_DATE_AND_SELECT_VALUE_FROM_FILTER.CODE,
//                    ServiceErrors.PLEASE_PROVIDE_THE_TO_DATE_AND_SELECT_VALUE_FROM_FILTER.KEY);
//        } else if (fromDate != null && toDate != null && sailingScheduleDateFilter == null) {
//            throw new ServiceException(ServiceErrors.PLEASE_SELECT_CONTRACT_DATE_FILTER.CODE,
//                    ServiceErrors.PLEASE_SELECT_CONTRACT_DATE_FILTER.KEY);
//        }else if (fromDate != null && toDate == null && sailingScheduleDateFilter != null) {
//            throw new ServiceException(ServiceErrors.PLEASE_PROVIDE_THE_TO_DATE_AND_SELECT_VALUE_FROM_FILTER.CODE,
//                    ServiceErrors.PLEASE_PROVIDE_THE_TO_DATE_AND_SELECT_VALUE_FROM_FILTER.KEY);
//        }
        if (fromDate != null && toDate != null) {
            isdatefilter = true;
            dt1 = DateUtils.addDays(fromDate, 0);
            dt2 = DateUtils.addDays(toDate, 0);
//            if (dt2.before(dt1)) {
//                throw new ServiceException(ServiceErrors.TO_DATE_SHOULD_BE_GREATER_THAN_FROM_DATE.CODE,
//                        ServiceErrors.TO_DATE_SHOULD_BE_GREATER_THAN_FROM_DATE.KEY);
//            }
        }
        log.info("dateFilter  " + dateFilter);
        log.info("dt1----" + dt1);
        log.info("dt2----" + dt2);

        Predicate predicate1 = null;
        if (isdatefilter && sailingScheduleStatus != null && sailingScheduleStatus != null) {
            log.info("isdatefilter----" + isdatefilter);
            if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.loadPortCutoffDate)) {
                predicate1 = sailingSchedule.loadPortCutoffDate.between(dt1, dt2).and(sailingSchedule.status.in(sailingScheduleStatus));
            } else if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.eta)) {
                predicate1 = sailingSchedule.eta.between(dt1, dt2).and(sailingSchedule.status.in(sailingScheduleStatus));
            } else if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.etd)) {
                predicate1 = sailingSchedule.etd.between(dt1, dt2).and(sailingSchedule.status.in(sailingScheduleStatus));
            }
            Collection<Predicate> predicates = new ArrayList();
            log.info("predicate1  " + predicate1);
            predicates.add(predicate);
            predicates.add(predicate1);
            if (groupCompanyId != null) {
                predicates.add(sailingSchedule.groupCompanyId.eq(groupCompanyId));
            }
            log.info("predicates  " + predicates);
            Predicate predicateAll = ExpressionUtils.allOf(predicates);
            return testRepository.findAll(predicateAll, pageRequest);
        } else if (sailingScheduleStatus == null && isdatefilter && sailingScheduleDateFilter != null) {
            log.info("isdatefilter----" + isdatefilter);
            if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.loadPortCutoffDate)) {
                predicate1 = sailingSchedule.loadPortCutoffDate.between(dt1, dt2);
            } else if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.eta)) {
                predicate1 = sailingSchedule.eta.between(dt1, dt2);
            } else if (sailingScheduleDateFilter.equals(SailingScheduleDateFilter.etd)) {
                predicate1 = sailingSchedule.etd.between(dt1, dt2);
            }
            Collection<Predicate> predicates = new ArrayList();
            log.info("predicate1  " + predicate1);
            predicates.add(predicate);
            predicates.add(predicate1);
            if (groupCompanyId != null) {
                predicates.add(sailingSchedule.groupCompanyId.eq(groupCompanyId));
            }
            log.info("predicates  " + predicates);
            Predicate predicateAll = ExpressionUtils.allOf(predicates);
            return testRepository.findAll(predicateAll, pageRequest);
        } else if (sailingScheduleStatus != null) {
            predicate1 = sailingSchedule.status.in(sailingScheduleStatus);
            Collection<Predicate> predicates = new ArrayList();
            log.info("predicate1  " + predicate1);
            predicates.add(predicate);
            predicates.add(predicate1);
            if (groupCompanyId != null) {
                predicates.add(sailingSchedule.groupCompanyId.eq(groupCompanyId));
            }
            log.info("predicates  " + predicates);
            Predicate predicateAll = ExpressionUtils.allOf(predicates);
            log.info("predicateAll  " + predicateAll);
            return testRepository.findAll(predicateAll, pageRequest);
        } else {
            Collection<Predicate> predicates = new ArrayList();
            predicates.add(predicate);
            if (groupCompanyId != null) {
                predicates.add(sailingSchedule.groupCompanyId.eq(groupCompanyId));
            }
            log.info("predicates  " + predicates);
            Predicate predicateAll = ExpressionUtils.allOf(predicates);
            log.info("predicateAll  " + predicateAll);
            return testRepository.findAll(predicateAll, pageRequest);
        }
    }

//    @Override
//    public   ContainerPack getContainerPack() {
//
//        return testRepository.
//    }

//    @Autowired
//    private MasterDataServiceClient masterDataServiceClient;
//
//    private final SailingScheduleRepository sailingScheduleRepository;
//    private  final SailingScheduleVesselRepository sailingScheduleVesselRepository;
//    private   final SailingScheduleNewRepository testRepository;
//
//    public SailingScheduleVesselServiceImpl(SailingScheduleVesselRepository sailingScheduleVesselRepository, SailingScheduleRepository sailingScheduleRepository, SailingScheduleNewRepository testRepository) {
//        this.sailingScheduleVesselRepository = sailingScheduleVesselRepository;
//        this.sailingScheduleRepository = sailingScheduleRepository;
//        this. testRepository = testRepository;
//    }
//
//
//    @Override
//    public  SailingScheduleVesselDetails createSailingSchedule(SailingScheduleVesselDetails sailingScheduleVesselDetails) {
//        return sailingScheduleVesselRepository.save(sailingScheduleVesselDetails);
//    }
//
//
//
//
//
//
//    @Override
//    public  SailingScheduleVesselDetails getSailingScheduleById(Long id) {
//     return sailingScheduleVesselRepository.findById(id).orElseThrow(() -> new ServiceException(ServiceErrors.SAILING_SCHEDULE_ID_NOT_FOUND.CODE,
//             ServiceErrors.SAILING_SCHEDULE_ID_NOT_FOUND.KEY));
//    }
//
//    @Override
//    public SailingScheduleHeaderDetails createNewSailingSchedule(SailingScheduleHeaderDetails sailingScheduleHeaderDetails) {
//        return null;
//    }
}
