package com.newage.fx.finance.service;


import com.newage.fx.finance.domain.entity.EnquiryHeader;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Date;

public interface EnquirySpotQuotationService
{

    Page <EnquiryHeader> createQuote(Predicate predicate, Pageable pageRequest, Date filter_month);

}
