package com.newage.fx.finance.service;



import com.newage.fx.finance.domain.entity.*;
import com.newage.fx.finance.domain.enums.DateFilter;
import com.newage.fx.finance.domain.enums.ImportExport;
import com.newage.fx.finance.domain.enums.ShipmentMasterStatus;
import com.newage.fx.finance.domain.enums.TransportMode;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface MasterHeaderService {

    List<MasterHeader> getMasterByShipmentUid(String shipmentUid);
}
