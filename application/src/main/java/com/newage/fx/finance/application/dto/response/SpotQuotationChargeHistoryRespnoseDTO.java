package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.QuoteProcess;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class SpotQuotationChargeHistoryRespnoseDTO {
    private Long id;
    private Long groupCompanyId;
    private Long companyId;
    private Long branchId;
    private String noOfUnit;
    private String roe;
    private Double minAmount;
    private String sellPerUnit;
    private Double currencyAmount;
    private Double minCostAmount;
    private String costPerUnit;
    private Double costAmount;
    private Date validUpTo;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private QuoteProcess process;
    private EnquiryChargeResponseNewDTO.VendorDTO vendorDTO;
    private EnquiryChargeResponseNewDTO.ChargeDTO chargeDTO;
    private EnquiryChargeResponseNewDTO.CurrencyDTO currencyDTO;
    private EnquiryChargeResponseNewDTO.CurrencyDTO convertedCurrencyDTO;
    private EnquiryChargeResponseNewDTO.UnitDTO unitDTO;
    private Long version;


    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ChargeDTO {
        private Long id;
        private String name;
        private String code;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CurrencyDTO {
        private Long id;
        private String name;
        private String code;
    }

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UnitDTO {
        private Long id;
        private String unitName;
        private String unitCode;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VendorDTO {
        private Long id;
        private String name;
        private CustomerResponseDTO.GradeMasterDTO grade;
    }




}
