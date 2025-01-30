package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.EnquirySpotQuotationRequestDTO;
import com.newage.fx.finance.application.dto.request.EnquirySpotQuotationResponseDTO;
import com.newage.fx.finance.domain.entity.*;
import com.newage.fx.finance.service.client.MasterDataServiceClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class EnquirySpotQuotationMapper implements DTOMapper<EnquiryHeader, EnquirySpotQuotationRequestDTO, EnquirySpotQuotationResponseDTO> {
    @Autowired
    MasterDataServiceClient masterDataServiceClient;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public EnquirySpotQuotationResponseDTO convertEntityToResponseDTO(EnquiryHeader spotQuotation) {
        EnquirySpotQuotationResponseDTO spotQuotationResponseDTO = new EnquirySpotQuotationResponseDTO();
        spotQuotationResponseDTO.setOriginName(spotQuotation.getServiceDetail().getOriginName());
        spotQuotationResponseDTO.setDestinationName(spotQuotation.getServiceDetail().getDestinationName());
        spotQuotationResponseDTO.setTosId(spotQuotation.getServiceDetail().getTosId());
        //spotQuotationResponseDTO.setLoad(spotQuotation.getLoad());
        spotQuotationResponseDTO.setGrossWeightKg(spotQuotation.getCargoDetail().getGrossWeightKg());
        spotQuotationResponseDTO.setVolumeInCbm(spotQuotation.getCargoDetail().getVolumeInCbm());
        //spotQuotationResponseDTO.setRate(spotQuotation.getAttachmentDetail().getCallEntryHeader().getCompetitorList().getRate());

        List<EnquiryChargeDetailsNew> enquiryChargeDetails = spotQuotation.getEnquiryChargeDetail();
        if (enquiryChargeDetails != null && !enquiryChargeDetails.isEmpty()) {

            double totalCurrencyAmount = 0.0;
            for (EnquiryChargeDetailsNew chargeDetail : enquiryChargeDetails) {
                Double currencyAmount = chargeDetail.getCurrencyAmount();
                if (currencyAmount != null) {
                    totalCurrencyAmount += currencyAmount;
                }
            }
            spotQuotationResponseDTO.setCurrencyAmount(totalCurrencyAmount);

        }
        List<EnquiryChargeDetailsNew> enquiryChargeDetail = spotQuotation.getEnquiryChargeDetail();
        if (enquiryChargeDetail != null && !enquiryChargeDetail.isEmpty()) {
            double totalQuotationAmount = 0.0;
            for (EnquiryChargeDetailsNew chargeDetail : enquiryChargeDetail) {
                Double quotationAmount = chargeDetail.getCostAmount();
                if (quotationAmount != null) {
                    totalQuotationAmount += quotationAmount;
                }

            }
            spotQuotationResponseDTO.setCostAmount(totalQuotationAmount);
            return spotQuotationResponseDTO;
        }
        spotQuotationResponseDTO.setStatus(spotQuotation.getStatus());
        //spotQuotationResponseDTO.setQuotation_link(spotQuotation.getQuotation_link());

        return spotQuotationResponseDTO;
    }

    @Override
    public EnquiryHeader convertCreateRequestToEntity(EnquirySpotQuotationRequestDTO enquirySpotQuotationRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(EnquirySpotQuotationRequestDTO enquirySpotQuotationRequestDTO, EnquiryHeader enquiryHeader) {

    }

    @Override
    public Page<EnquirySpotQuotationResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<EnquiryHeader> enquiryHeaders) {
        List<EnquirySpotQuotationResponseDTO> dtos = new ArrayList<>();
        enquiryHeaders.forEach(e -> dtos.add(convertEntityToResponseDTO(e)));
        return new PageImpl<>(dtos, pageRequest, enquiryHeaders.getTotalElements());

    }


}