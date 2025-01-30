package com.newage.fx.finance.service;

import com.newage.fx.finance.domain.entity.UserMaster;

import java.util.List;

public interface UserMasterService {
    public UserMaster findById(Long registrationNo);
    public List<UserMaster> findAll();

}
