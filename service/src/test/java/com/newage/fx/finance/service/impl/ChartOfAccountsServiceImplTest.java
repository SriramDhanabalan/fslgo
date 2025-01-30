/*
package com.newage.fx.finance.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class ChartOfAccountsServiceImplTest {

    @InjectMocks
    ChartOfAccountsServiceImpl chartOfAccountsServiceImpl;

    @Mock
    private ChartOfAccountsRepository chartOfAccountsRepository;

    @BeforeEach
    public void beforeEach() {

        ChartAccountsView chartAccount = new ChartAccountsView();
        chartAccount.setGlAccountId(1L);

        List<ChartAccountsView> chartOfAccounts = new ArrayList<>();
        chartOfAccounts.add(chartAccount);

        lenient().when(chartOfAccountsRepository.getChartByAccountId(1L)).thenReturn(chartOfAccounts);
    }

    @Test
    public void getChartByAccountId() {

        Long accountId = 1L;

        List<ChartAccountsView> chartOfAccounts = chartOfAccountsServiceImpl.getChartByAccountId(accountId);
        Assertions.assertEquals(1, chartOfAccounts.size());
    }
}
*/
