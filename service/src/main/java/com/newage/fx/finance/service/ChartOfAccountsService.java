package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.coa.CoaControl;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ChartOfAccountsService {

    //New
    Page<CoaControl> getAllCoaControl(Predicate predicate, Pageable pageRequest);

    CoaControl createCoaControl(CoaControl coaControl);

    CoaControl updateCoaControl(CoaControl coaControl);

    CoaControl getCoaById(Long id);

    public List<CoaControl> getCoaControlLike(Long headerId,Long groupId,Long subGroupId);

}
