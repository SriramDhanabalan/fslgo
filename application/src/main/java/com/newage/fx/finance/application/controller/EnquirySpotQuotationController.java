package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.EnquirySpotQuotationMapper;
import com.newage.fx.finance.application.dto.request.EnquirySpotQuotationResponseDTO;
import com.newage.fx.finance.application.dto.response.ResponseDTO;
import com.newage.fx.finance.domain.entity.EnquiryHeader;
import com.newage.fx.finance.domain.entity.EnquirySpotQuotation;
import com.newage.fx.finance.domain.entity.EnquirySpotQuotationNew;
import com.newage.fx.finance.service.EnquirySpotQuotationService;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
@Log4j2
@RequestMapping(value = "/api/quotationsNew")
public class EnquirySpotQuotationController {

    @Autowired
    EnquirySpotQuotationService enquirySpotQuotationService;
    @Autowired
    EnquirySpotQuotationMapper enquirySpotQuotationMapper;

    @PostMapping(value = "/quote_list")
    public ResponseEntity<ResponseDTO> createQuote(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date filter_month, @QuerydslPredicate(root = EnquiryHeader.class) Predicate predicate,
                                                   @PageableDefault(sort = {"id"}, direction = Sort.Direction.DESC, size = 20) @Parameter(hidden = true) Pageable pageRequest) {
        Page<EnquiryHeader> quotationPage = enquirySpotQuotationService.createQuote(predicate, pageRequest, filter_month);
        Page<EnquirySpotQuotationResponseDTO> result = enquirySpotQuotationMapper.convertEntityPageToResponsePage(pageRequest, quotationPage);
        ResponseDTO responseDTO = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(responseDTO);
    }


}
