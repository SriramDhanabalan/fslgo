package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.UserMasterRequestDTO;
import com.newage.fx.finance.application.dto.response.UserMasterResponseDTO;
import com.newage.fx.finance.application.dto.response.WebUserDetailResponseDTO;
import com.newage.fx.finance.domain.entity.UserMaster;
import com.newage.fx.finance.domain.entity.WebUserDetail;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMasterMapper implements DTOMapper<UserMaster, UserMasterRequestDTO, UserMasterResponseDTO>  {
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public UserMasterResponseDTO convertEntityToResponseDTO(UserMaster userMaster) {

        UserMasterResponseDTO userMasterResponseDTO = modelMapper.map(userMaster,UserMasterResponseDTO.class);


        if (!CollectionUtils.isEmpty(userMaster.getWebUserDetails())) {
            List<WebUserDetailResponseDTO> responseDTOList = new ArrayList<>();
            for (WebUserDetail webUserDetail : userMaster.getWebUserDetails()) {
                WebUserDetailResponseDTO webUserDetailResponseDTO = modelMapper.map(webUserDetail, WebUserDetailResponseDTO.class);
                webUserDetailResponseDTO.setRegistrationNo(webUserDetail.getUserMaster().getRegistrationNo());
                responseDTOList.add(webUserDetailResponseDTO);
            }
            userMasterResponseDTO.setWebUserDetails(responseDTOList);
        }

        return userMasterResponseDTO;
    }

    @Override
    public UserMaster convertCreateRequestToEntity(UserMasterRequestDTO userMasterRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(UserMasterRequestDTO userMasterRequestDTO, UserMaster userMaster) {

    }

    @Override
    public Page<UserMasterResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<UserMaster> userMasters) {
        return null;
    }

}
