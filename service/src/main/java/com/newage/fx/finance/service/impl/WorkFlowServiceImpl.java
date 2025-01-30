package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.WorkFlowMasterScreen;
import com.newage.fx.finance.domain.repository.WorkFlowMasterScreenRepository;
import com.newage.fx.finance.service.WorkFlowService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Log4j2
@Service
@Transactional
public class WorkFlowServiceImpl implements WorkFlowService {


    private final WorkFlowMasterScreenRepository workFlowMasterScreenRepository;

    public WorkFlowServiceImpl(WorkFlowMasterScreenRepository workFlowMasterScreenRepository) {
        this.workFlowMasterScreenRepository = workFlowMasterScreenRepository;
    }

    @Override
    public WorkFlowMasterScreen getFilteredScreenWorkFlow(String screen, String productName, Long tosId) {

        if (productName != null && tosId != null) {
            return workFlowMasterScreenRepository.findByScreenNameAndProductNameAndTos(screen, productName, tosId);
        } else {
            return workFlowMasterScreenRepository.findByScreenName(screen);
        }
    }
}