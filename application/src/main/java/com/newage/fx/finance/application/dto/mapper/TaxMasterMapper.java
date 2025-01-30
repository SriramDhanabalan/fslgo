package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.TaxChargeServiceMappingRequestDTO;
import com.newage.fx.finance.application.dto.request.TaxEntityMappingRequestDTO;
import com.newage.fx.finance.application.dto.request.TaxMasterRequestDTO;
import com.newage.fx.finance.application.dto.request.TaxPercentageRequestDTO;
import com.newage.fx.finance.application.dto.response.TaxMasterResponse;
import com.newage.fx.finance.application.dto.response.TaxPercentageResponseDTO;
import com.newage.fx.finance.domain.entity.TaxChargeServieMappingDetails;
import com.newage.fx.finance.domain.entity.TaxEntityMappingDetail;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.newage.fx.finance.domain.entity.TaxPercentageDetail;
import com.newage.fx.finance.service.client.dto.response.TaxChargeServiceMappingResponseDTO;
import com.newage.fx.finance.service.client.dto.response.TaxEntityMappingResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaxMasterMapper implements DTOMapper<TaxMaster, TaxMasterRequestDTO, TaxMasterResponse> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public TaxMasterResponse convertEntityToResponseDTO(TaxMaster taxMaster) {

        TaxMasterResponse taxMasterResponse = modelMapper.map(taxMaster, TaxMasterResponse.class);



        if (!CollectionUtils.isEmpty(taxMaster.getTaxPercentageDetails())) {
            List<TaxPercentageResponseDTO> responseDTOList = new ArrayList<>();
            for (TaxPercentageDetail percentageDetail : taxMaster.getTaxPercentageDetails()) {
                TaxPercentageResponseDTO taxPercentageResponseDTO = modelMapper.map(percentageDetail, TaxPercentageResponseDTO.class);
                taxPercentageResponseDTO.setTaxId(percentageDetail.getTaxMaster().getId());
                responseDTOList.add(taxPercentageResponseDTO);
            }
            taxMasterResponse.setTaxPercentageDetails(responseDTOList);
        }
        if (!CollectionUtils.isEmpty(taxMaster.getTaxEntityMappingDetails())) {
            List<TaxEntityMappingResponseDTO> responseDTOList = new ArrayList<>();
            for (TaxEntityMappingDetail mappingDetail : taxMaster.getTaxEntityMappingDetails()) {
                TaxEntityMappingResponseDTO mappingResponseDTO = modelMapper.map(mappingDetail, TaxEntityMappingResponseDTO.class);
                responseDTOList.add(mappingResponseDTO);
            }
            taxMasterResponse.setTaxEntityMappingDetails(responseDTOList);
        }
        if (!CollectionUtils.isEmpty(taxMaster.getTaxChargeServiceMapping())) {
            List<TaxChargeServiceMappingResponseDTO> responseDTOList = new ArrayList<>();
            for (TaxChargeServieMappingDetails chargeServieMappingDetails : taxMaster.getTaxChargeServiceMapping()) {
                TaxChargeServiceMappingResponseDTO chargeServiceMappingResponseDTO = modelMapper.map(chargeServieMappingDetails, TaxChargeServiceMappingResponseDTO.class);
                chargeServiceMappingResponseDTO.setTaxId(taxMaster.getId());
                responseDTOList.add(chargeServiceMappingResponseDTO);
            }
            taxMasterResponse.setTaxChargeServiceMapping(responseDTOList);
        }

        return taxMasterResponse;
    }

    @Override
    public TaxMaster convertCreateRequestToEntity(TaxMasterRequestDTO taxMasterRequestDTO) {
        TaxMaster taxMaster = modelMapper.map(taxMasterRequestDTO, TaxMaster.class);


        if (!CollectionUtils.isEmpty(taxMaster.getTaxPercentageDetails())) {
            List<TaxPercentageDetail> percentageDetailList = new ArrayList<>();
            for (TaxPercentageRequestDTO percentageRequestDTO : taxMasterRequestDTO.getTaxPercentageDetails()) {
                TaxPercentageDetail percentageDetail = modelMapper.map(percentageRequestDTO, TaxPercentageDetail.class);
                percentageDetail.setId(null);
                percentageDetail.setTaxMaster(taxMaster);
                percentageDetailList.add(percentageDetail);
            }
            taxMaster.setTaxPercentageDetails(percentageDetailList);
        }

        if (!CollectionUtils.isEmpty(taxMaster.getTaxEntityMappingDetails())) {
            List<TaxEntityMappingDetail> entityMappingDetailList = new ArrayList<>();
            for (TaxEntityMappingRequestDTO entityMappingRequestDTO : taxMasterRequestDTO.getTaxEntityMappingDetails()) {
                TaxEntityMappingDetail entityMappingDetail = modelMapper.map(entityMappingRequestDTO, TaxEntityMappingDetail.class);
                entityMappingDetail.setId(null);
                entityMappingDetail.setTaxMaster(taxMaster);
                entityMappingDetailList.add(entityMappingDetail);
            }
            taxMaster.setTaxEntityMappingDetails(entityMappingDetailList);
        }

        if (!CollectionUtils.isEmpty(taxMaster.getTaxChargeServiceMapping())) {
            List<TaxChargeServieMappingDetails> chargeServieMappingDetailsList = new ArrayList<>();
            for (TaxChargeServiceMappingRequestDTO chargeServiceMappingRequestDTO : taxMasterRequestDTO.getTaxChargeServiceMapping()) {
                TaxChargeServieMappingDetails chargeServieMappingDetails = modelMapper.map(chargeServiceMappingRequestDTO, TaxChargeServieMappingDetails.class);
                chargeServieMappingDetails.setId(null);
                chargeServieMappingDetails.setTaxMaster(taxMaster);
                chargeServieMappingDetailsList.add(chargeServieMappingDetails);
            }
            taxMaster.setTaxChargeServiceMapping(chargeServieMappingDetailsList);
        }


        return taxMaster;
    }

    @Override
    public void convertUpdateRequestToEntity(TaxMasterRequestDTO taxMasterRequestDTO, TaxMaster taxMaster) {
        modelMapper.map(taxMasterRequestDTO, taxMaster);
    }


    @Override
    public Page<TaxMasterResponse> convertEntityPageToResponsePage(Pageable pageRequest, Page<TaxMaster> taxMasters) {
        List<TaxMasterResponse> dtos =new ArrayList<>();
        taxMasters.forEach(e->dtos.add(convertEntityToResponseDTO(e)));
        return new PageImpl<>(dtos, pageRequest, taxMasters.getTotalElements());
    }


    public TaxChargeServiceMappingResponseDTO convertTaxChargeServiceMappingEntityToResponseDTO(TaxChargeServieMappingDetails taxChargeServieMappingDetails) {

        TaxChargeServiceMappingResponseDTO chargeServiceMappingResponseDTO = modelMapper.map(taxChargeServieMappingDetails, TaxChargeServiceMappingResponseDTO.class);
        taxChargeServieMappingDetails.setTaxMaster(taxChargeServieMappingDetails.getTaxMaster());
        chargeServiceMappingResponseDTO.setTaxId(taxChargeServieMappingDetails.getTaxMaster().getId());
         return  chargeServiceMappingResponseDTO;
    }
}
