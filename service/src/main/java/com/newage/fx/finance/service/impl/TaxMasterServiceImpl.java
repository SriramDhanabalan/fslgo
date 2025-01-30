package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.TaxChargeServieMappingDetails;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.newage.fx.finance.domain.repository.TaxChargeServiceRepository;
import com.newage.fx.finance.domain.repository.TaxMasterRepository;
import com.newage.fx.finance.service.TaxMasterService;
import com.newage.fx.finance.service.exception.ServiceErrors;
import com.newage.fx.finance.service.exception.ServiceException;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class TaxMasterServiceImpl implements TaxMasterService {

    private final TaxMasterRepository taxMasterRepository;

    private final TaxChargeServiceRepository taxChargeServiceRepository;

    public TaxMasterServiceImpl(TaxMasterRepository taxMasterRepository, TaxChargeServiceRepository taxChargeServiceRepository){
        this.taxMasterRepository = taxMasterRepository;
        this.taxChargeServiceRepository = taxChargeServiceRepository;
    }
    @Override
    public TaxMaster getTaxMasterById(Long id) {
        return taxMasterRepository.findById(id).
                orElseThrow(() -> new ServiceException(ServiceErrors.VESSEL_ID_NOT_FOUND.CODE, ServiceErrors.VESSEL_ID_NOT_FOUND.KEY));
    }

    @Override
    public Page<TaxMaster> getAllTaxMaster(Predicate predicate, Pageable pageRequest) {
        return taxMasterRepository.findAll(predicate, pageRequest);
    }

    @Override
    public TaxMaster createTaxMaster(TaxMaster taxMaster) {
        return taxMasterRepository.save(taxMaster);
    }

    @Override
    public TaxMaster updateTaxMaster(TaxMaster taxMaster) {
        taxMaster = taxMasterRepository.save(taxMaster);
        return taxMaster;
    }
    @Override
    public TaxChargeServieMappingDetails getTaxMasterBychargeservice(Long chargeId, Long serviecId){
        return taxChargeServiceRepository.findByChargeIdAndServiceId(chargeId,serviecId);
    }
}
