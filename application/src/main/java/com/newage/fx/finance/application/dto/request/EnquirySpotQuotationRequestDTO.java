package com.newage.fx.finance.application.dto.request;


import com.newage.fx.finance.domain.entity.EnquiryHeader;
import com.newage.fx.finance.domain.entity.QuoteType;

import java.util.Date;
import java.util.List;

public class EnquirySpotQuotationRequestDTO {
    private Long id;
    private Long groupCompanyId;
    private Long companyId;
    private Long branchId;
    private Long currencyId;
    private Date validUpTo;
    private QuoteType quoteType;
    private Double quoteAmount;
    private Double buyAmount;
    private List<EnquiryHeader> enquiryHeaders;
    private List<EnquiryChargeRequestNewDTO> enquiryChargeRequestNewDTOS;
    private List<EnquiryChargeRequestNewDTO> multiCarrierRequestDTOS;
    private List<SpotQuotationTermsAndConditionGeneralRequestDTO> generalNotes;
    private List<SpotQuotationTermsAndConditionServiceRequestDTO> serviceNotes;
    private EnquiryHeader enquiryDetail;








}
