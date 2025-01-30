package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.ContainerPack;
import com.newage.fx.finance.domain.entity.SailingScheduleHeaderDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleVesselDetails;
import com.newage.fx.finance.domain.enums.DateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleDateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

public interface SailingScheduleVesselService {
   SailingScheduleVesselDetails createSailingSchedule(SailingScheduleVesselDetails sailingScheduleVesselDetails);
    SailingScheduleVesselDetails getSailingScheduleById(Long id);
    SailingScheduleHeaderDetails createNewSailingSchedule(SailingScheduleHeaderDetails sailingScheduleHeaderDetails);

    Page<SailingScheduleHeaderDetails> getAllNewSailingSchedule(Predicate predicate, Pageable pageRequest, Date fromDate, Date toDate, DateFilter dateFilter, SailingScheduleDateFilter sailingScheduleDateFilter, List<SailingScheduleStatus> sailingScheduleStatus, Long groupCompanyId);
//    ContainerPack getContainerPack();


}
