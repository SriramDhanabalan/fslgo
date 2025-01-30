package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.Freight;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EnquiryChargeResponseNewDTO {
    private Long id;
    private Long groupCompanyId;
    private Long companyId;
    private Long branchId;

    private Long slNo;
    Double noOfUnit;
    Double roe;
    Double minAmount;
    Double amountPerUnit;
    Double amount;
    Double currencyAmount;
    Double minCostAmount;
    Double costPerUnit;
    Double costAmount;
    Double costCurrencyAmount;
    private VendorDTO vendorDTO;
    private ChargeDTO chargeDTO;
    private CurrencyDTO currencyDTO;
    private CurrencyDTO convertedCurrencyDTO;
    private MeasurementDTO measurementDTO;
    private UnitDTO unitDTO;
    private Long version;
    private Freight term;
    private Double costRoe;
    private BillToCustomerDTO billToCustomerDTO;
    private List<MultiCarrierResponseDTO> multiCarrierResponseDTO;


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
    public static class MeasurementDTO {
        private Long id;
        private String name;
        private String unit1;
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

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class BillToCustomerDTO {
        private Long id;
        private String name;
        private String code;
    }













}
