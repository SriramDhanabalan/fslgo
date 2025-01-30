package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.coa.CoaControl;
import com.newage.fx.finance.domain.repository.CoaControlRepository;
import com.newage.fx.finance.service.ChartOfAccountsService;
import com.querydsl.core.types.Predicate;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Service
@Transactional
public class ChartOfAccountsServiceImpl implements ChartOfAccountsService {

    private final CoaControlRepository coaControlRepository;

    @Autowired
    public ChartOfAccountsServiceImpl(CoaControlRepository coaControlRepository) {
        this.coaControlRepository = coaControlRepository;
    }

    @Override
    public Page<CoaControl> getAllCoaControl(Predicate predicate, Pageable pageRequest) {
        return coaControlRepository.findAll(predicate, pageRequest);
    }
    @Override
    public CoaControl createCoaControl(CoaControl coaControl) {
        return coaControlRepository.save(coaControl);
    }

    @Override
    public CoaControl updateCoaControl(CoaControl coaControl) {
        return coaControlRepository.save(coaControl);
    }

    @Override
    public CoaControl getCoaById(Long id) {
        return coaControlRepository.findById(id).get();
    }

    @Override
    public List<CoaControl> getCoaControlLike(Long headerId,Long groupId,Long subGroupId){
        return  coaControlRepository.findByCoaHeaderIdAndCoaGroupIdAndCoaSubGroupId(headerId,groupId,subGroupId);
    }

}
