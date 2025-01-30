package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.WorkFlowMasterScreen;

public interface WorkFlowService {
    WorkFlowMasterScreen getFilteredScreenWorkFlow(String screen, String productName, Long tosId);
}
