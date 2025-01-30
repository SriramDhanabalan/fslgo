package com.newage.fx.finance.application.dto.response;

import lombok.Generated;

public class EnquiryChargeResponseDTO {

    private Long id;
    private Double noOfUnit;
    private Double roe;
    private Double minAmount;
    private Double amountPerUnit;
    private Double amount;
    private Double currencyAmount;
    private Double minCostAmount;
    private Double costPerUnit;
    private Double costAmount;
    private Double costCurrencyAmount;
    private VendorDTO vendorDTO;
    private ChargeDTO chargeDTO;
    private CurrencyDTO currencyDTO;
    private CurrencyDTO convertedCurrencyDTO;
    private MeasurementDTO measurementDTO;
    private UnitDTO unitDTO;
    private Long version;

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setNoOfUnit(final Double noOfUnit) {
        this.noOfUnit = noOfUnit;
    }

    @Generated
    public void setRoe(final Double roe) {
        this.roe = roe;
    }

    @Generated
    public void setMinAmount(final Double minAmount) {
        this.minAmount = minAmount;
    }

    @Generated
    public void setAmountPerUnit(final Double amountPerUnit) {
        this.amountPerUnit = amountPerUnit;
    }

    @Generated
    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    @Generated
    public void setCurrencyAmount(final Double currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    @Generated
    public void setMinCostAmount(final Double minCostAmount) {
        this.minCostAmount = minCostAmount;
    }

    @Generated
    public void setCostPerUnit(final Double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    @Generated
    public void setCostAmount(final Double costAmount) {
        this.costAmount = costAmount;
    }

    @Generated
    public void setCostCurrencyAmount(final Double costCurrencyAmount) {
        this.costCurrencyAmount = costCurrencyAmount;
    }

    @Generated
    public void setVendorDTO(final VendorDTO vendorDTO) {
        this.vendorDTO = vendorDTO;
    }

    @Generated
    public void setChargeDTO(final ChargeDTO chargeDTO) {
        this.chargeDTO = chargeDTO;
    }

    @Generated
    public void setCurrencyDTO(final CurrencyDTO currencyDTO) {
        this.currencyDTO = currencyDTO;
    }

    @Generated
    public void setConvertedCurrencyDTO(final CurrencyDTO convertedCurrencyDTO) {
        this.convertedCurrencyDTO = convertedCurrencyDTO;
    }

    @Generated
    public void setMeasurementDTO(final MeasurementDTO measurementDTO) {
        this.measurementDTO = measurementDTO;
    }

    @Generated
    public void setUnitDTO(final UnitDTO unitDTO) {
        this.unitDTO = unitDTO;
    }

    @Generated
    public void setVersion(final Long version) {
        this.version = version;
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Double getNoOfUnit() {
        return this.noOfUnit;
    }

    @Generated
    public Double getRoe() {
        return this.roe;
    }

    @Generated
    public Double getMinAmount() {
        return this.minAmount;
    }

    @Generated
    public Double getAmountPerUnit() {
        return this.amountPerUnit;
    }

    @Generated
    public Double getAmount() {
        return this.amount;
    }

    @Generated
    public Double getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Generated
    public Double getMinCostAmount() {
        return this.minCostAmount;
    }

    @Generated
    public Double getCostPerUnit() {
        return this.costPerUnit;
    }

    @Generated
    public Double getCostAmount() {
        return this.costAmount;
    }

    @Generated
    public Double getCostCurrencyAmount() {
        return this.costCurrencyAmount;
    }

    @Generated
    public VendorDTO getVendorDTO() {
        return this.vendorDTO;
    }

    @Generated
    public ChargeDTO getChargeDTO() {
        return this.chargeDTO;
    }

    @Generated
    public CurrencyDTO getCurrencyDTO() {
        return this.currencyDTO;
    }

    @Generated
    public CurrencyDTO getConvertedCurrencyDTO() {
        return this.convertedCurrencyDTO;
    }

    @Generated
    public MeasurementDTO getMeasurementDTO() {
        return this.measurementDTO;
    }

    @Generated
    public UnitDTO getUnitDTO() {
        return this.unitDTO;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Generated
    public EnquiryChargeResponseDTO(final Long id, final Double noOfUnit, final Double roe, final Double minAmount, final Double amountPerUnit, final Double amount, final Double currencyAmount, final Double minCostAmount, final Double costPerUnit, final Double costAmount, final Double costCurrencyAmount, final VendorDTO vendorDTO, final ChargeDTO chargeDTO, final CurrencyDTO currencyDTO, final CurrencyDTO convertedCurrencyDTO, final MeasurementDTO measurementDTO, final UnitDTO unitDTO, final Long version) {
        this.id = id;
        this.noOfUnit = noOfUnit;
        this.roe = roe;
        this.minAmount = minAmount;
        this.amountPerUnit = amountPerUnit;
        this.amount = amount;
        this.currencyAmount = currencyAmount;
        this.minCostAmount = minCostAmount;
        this.costPerUnit = costPerUnit;
        this.costAmount = costAmount;
        this.costCurrencyAmount = costCurrencyAmount;
        this.vendorDTO = vendorDTO;
        this.chargeDTO = chargeDTO;
        this.currencyDTO = currencyDTO;
        this.convertedCurrencyDTO = convertedCurrencyDTO;
        this.measurementDTO = measurementDTO;
        this.unitDTO = unitDTO;
        this.version = version;
    }

    @Generated
    public EnquiryChargeResponseDTO() {
    }

    public static class ChargeDTO {
        private Long id;
        private String name;
        private String code;

        @Generated
        public void setId(final Long id) {
            this.id = id;
        }

        @Generated
        public void setName(final String name) {
            this.name = name;
        }

        @Generated
        public void setCode(final String code) {
            this.code = code;
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getCode() {
            return this.code;
        }

        @Generated
        public ChargeDTO(final Long id, final String name, final String code) {
            this.id = id;
            this.name = name;
            this.code = code;
        }

        @Generated
        public ChargeDTO() {
        }
    }

    public static class CurrencyDTO {
        private Long id;
        private String name;
        private String code;

        @Generated
        public void setId(final Long id) {
            this.id = id;
        }

        @Generated
        public void setName(final String name) {
            this.name = name;
        }

        @Generated
        public void setCode(final String code) {
            this.code = code;
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getCode() {
            return this.code;
        }

        @Generated
        public CurrencyDTO(final Long id, final String name, final String code) {
            this.id = id;
            this.name = name;
            this.code = code;
        }

        @Generated
        public CurrencyDTO() {
        }
    }

    public static class MeasurementDTO {
        private Long id;
        private String name;
        private String unit1;

        @Generated
        public void setId(final Long id) {
            this.id = id;
        }

        @Generated
        public void setName(final String name) {
            this.name = name;
        }

        @Generated
        public void setUnit1(final String unit1) {
            this.unit1 = unit1;
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public String getUnit1() {
            return this.unit1;
        }

        @Generated
        public MeasurementDTO(final Long id, final String name, final String unit1) {
            this.id = id;
            this.name = name;
            this.unit1 = unit1;
        }

        @Generated
        public MeasurementDTO() {
        }
    }

    public static class UnitDTO {
        private Long id;
        private String unitName;
        private String unitCode;

        @Generated
        public void setId(final Long id) {
            this.id = id;
        }

        @Generated
        public void setUnitName(final String unitName) {
            this.unitName = unitName;
        }

        @Generated
        public void setUnitCode(final String unitCode) {
            this.unitCode = unitCode;
        }

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getUnitName() {
            return this.unitName;
        }

        @Generated
        public String getUnitCode() {
            return this.unitCode;
        }

        @Generated
        public UnitDTO(final Long id, final String unitName, final String unitCode) {
            this.id = id;
            this.unitName = unitName;
            this.unitCode = unitCode;
        }

        @Generated
        public UnitDTO() {
        }
    }

    public static class VendorDTO {
        private Long id;
        private String name;
       private CustomerResponseDTO.GradeMasterDTO grade;

        @Generated
        public Long getId() {
            return this.id;
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public CustomerResponseDTO.GradeMasterDTO getGrade() {
            return this.grade;
        }

        @Generated
        public void setId(final Long id) {
            this.id = id;
        }

        @Generated
        public void setName(final String name) {
            this.name = name;
        }

        @Generated
        public void setGrade(final CustomerResponseDTO.GradeMasterDTO grade) {
            this.grade = grade;
        }

        @Generated
        public VendorDTO(final Long id, final String name, final CustomerResponseDTO.GradeMasterDTO grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        @Generated
        public VendorDTO() {
        }

    }













}
