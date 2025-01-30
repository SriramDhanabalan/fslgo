package com.newage.fx.finance.service.impl;

import com.newage.fx.finance.domain.entity.EnquiryHeader;
import com.newage.fx.finance.domain.repository.EnquirySpotQuotationRepositoryNew;
import com.newage.fx.finance.service.EnquirySpotQuotationService;
import com.querydsl.core.types.Predicate;
import lombok.Generated;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Service
@Transactional
public class EnquirySpotQuotationServiceImpl implements EnquirySpotQuotationService {

    @Generated
    private final EnquirySpotQuotationRepositoryNew enquirySpotQuotationRepository;


    public EnquirySpotQuotationServiceImpl(EnquirySpotQuotationRepositoryNew enquirySpotQuotationRepository) {
        this.enquirySpotQuotationRepository = enquirySpotQuotationRepository;
    }


    @Override
    public Page<EnquiryHeader> createQuote(Predicate predicate, Pageable pageRequest, Date filter_month) {
        return enquirySpotQuotationRepository.findAll(predicate, pageRequest);


    }


}
