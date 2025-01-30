package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.TaxChargeServieMappingDetails;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TaxMasterService {

    TaxMaster getTaxMasterById(Long id);

    Page<TaxMaster> getAllTaxMaster(Predicate predicate, Pageable pageRequest);

    TaxMaster createTaxMaster(TaxMaster taxMaster);

    TaxMaster updateTaxMaster(TaxMaster taxMaster);

    TaxChargeServieMappingDetails getTaxMasterBychargeservice(Long chargeId, Long serviceId);

}
