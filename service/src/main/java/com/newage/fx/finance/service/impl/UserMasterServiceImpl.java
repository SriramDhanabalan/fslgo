package com.newage.fx.finance.service.impl;


import com.newage.fx.finance.domain.entity.UserMaster;
import com.newage.fx.finance.domain.repository.UserMasterRepository;
import com.newage.fx.finance.domain.util.UserPrincipal;
import com.newage.fx.finance.service.UserMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMasterServiceImpl implements UserDetailsService, UserMasterService {

    @Autowired
    private UserMasterRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        UserMaster user = userRepository.findByUserId(userId);
        if(user==null){
            System.out.println("User not found");
            throw new UsernameNotFoundException("User Not Found");
        }

        return new UserPrincipal(user);
    }


    @Override
    public UserMaster findById(Long registrationNo) {
        return userRepository.findById(registrationNo).orElse(null);
    }

    @Override
    public List<UserMaster> findAll() {
        return userRepository.findAll();
    }
}
