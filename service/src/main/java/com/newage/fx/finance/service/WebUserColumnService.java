package com.newage.fx.finance.service;


import com.newage.fx.finance.domain.entity.WebUserColumn;
import org.springframework.transaction.annotation.Transactional;

public interface WebUserColumnService {
//    @Transactional
    WebUserColumn saveOrUpdateUserPreferences(Long serialno, String selectcolumn);

    @Transactional(readOnly = true)
    WebUserColumn getUserPreferences(Long slNo);

//    @Transactional(readOnly = true)
//    WebUserColumn getUserPreferences(Long slNo);
}