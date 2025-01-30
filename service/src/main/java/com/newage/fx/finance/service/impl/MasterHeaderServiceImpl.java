package com.newage.fx.finance.service.impl;



import com.newage.fx.finance.domain.entity.MasterHeader;
import com.newage.fx.finance.domain.repository.MasterServiceLinkDetailRepository;
import com.newage.fx.finance.service.MasterHeaderService;
import com.querydsl.core.types.ExpressionUtils;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.DateTimeExpression;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;


@Log4j2
@Service
@Transactional
public class MasterHeaderServiceImpl implements MasterHeaderService {

    private final MasterServiceLinkDetailRepository shipmentLinkingRepository;

    public MasterHeaderServiceImpl(MasterServiceLinkDetailRepository shipmentLinkingRepository) {
        this.shipmentLinkingRepository = shipmentLinkingRepository;
    }


    @Override
    public List<MasterHeader> getMasterByShipmentUid(String shipmentUid) {
        return shipmentLinkingRepository.findLinkedMasterByShipmentUid(shipmentUid);
    }
}
