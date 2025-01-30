package com.newage.fx.finance.application.dto.request;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompi




import java.util.List;

import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.QuoteProcess;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Generated;

public class EnquiryChargeRequestNewDTO {
    private Long id;
    private Long slNo;
    private Long chargeId;
    private String chargeName;
    private Long currencyId;
    private Long convertedCurrencyId;
    private Long measurementId;
    private Long unitId;
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
    private Long vendorId;
    private Double sellPerUnit;
    private QuoteProcess process;
    private boolean isModified;
    private Freight term;
    private Long billToCustomerId;
    private Double costRoe;
    private YesNo isContainer;
    private List<MultiCarrierRequestDTO> multiCarrierRequestDTOS;

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setSlNo(final Long slNo) {
        this.slNo = slNo;
    }

    @Generated
    public void setChargeId(final Long chargeId) {
        this.chargeId = chargeId;
    }

    @Generated
    public void setChargeName(final String chargeName) {
        this.chargeName = chargeName;
    }

    @Generated
    public void setCurrencyId(final Long currencyId) {
        this.currencyId = currencyId;
    }

    @Generated
    public void setConvertedCurrencyId(final Long convertedCurrencyId) {
        this.convertedCurrencyId = convertedCurrencyId;
    }

    @Generated
    public void setMeasurementId(final Long measurementId) {
        this.measurementId = measurementId;
    }

    @Generated
    public void setUnitId(final Long unitId) {
        this.unitId = unitId;
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
    public void setVendorId(final Long vendorId) {
        this.vendorId = vendorId;
    }

    @Generated
    public void setSellPerUnit(final Double sellPerUnit) {
        this.sellPerUnit = sellPerUnit;
    }

    @Generated
    public void setProcess(final QuoteProcess process) {
        this.process = process;
    }

    @Generated
    public void setModified(final boolean isModified) {
        this.isModified = isModified;
    }

    @Generated
    public void setTerm(final Freight term) {
        this.term = term;
    }

    @Generated
    public void setBillToCustomerId(final Long billToCustomerId) {
        this.billToCustomerId = billToCustomerId;
    }

    @Generated
    public void setCostRoe(final Double costRoe) {
        this.costRoe = costRoe;
    }

    @Generated
    public void setIsContainer(final YesNo isContainer) {
        this.isContainer = isContainer;
    }

    @Generated
    public void setMultiCarrierRequestDTOS(final List<MultiCarrierRequestDTO> multiCarrierRequestDTOS) {
        this.multiCarrierRequestDTOS = multiCarrierRequestDTOS;
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getSlNo() {
        return this.slNo;
    }

    @Generated
    public Long getChargeId() {
        return this.chargeId;
    }

    @Generated
    public String getChargeName() {
        return this.chargeName;
    }

    @Generated
    public Long getCurrencyId() {
        return this.currencyId;
    }

    @Generated
    public Long getConvertedCurrencyId() {
        return this.convertedCurrencyId;
    }

    @Generated
    public Long getMeasurementId() {
        return this.measurementId;
    }

    @Generated
    public Long getUnitId() {
        return this.unitId;
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
    public Long getVendorId() {
        return this.vendorId;
    }

    @Generated
    public Double getSellPerUnit() {
        return this.sellPerUnit;
    }

    @Generated
    public QuoteProcess getProcess() {
        return this.process;
    }

    @Generated
    public boolean isModified() {
        return this.isModified;
    }

    @Generated
    public Freight getTerm() {
        return this.term;
    }

    @Generated
    public Long getBillToCustomerId() {
        return this.billToCustomerId;
    }

    @Generated
    public Double getCostRoe() {
        return this.costRoe;
    }

    @Generated
    public YesNo getIsContainer() {
        return this.isContainer;
    }

    @Generated
    public List<MultiCarrierRequestDTO> getMultiCarrierRequestDTOS() {
        return this.multiCarrierRequestDTOS;
    }

    @Generated
    public EnquiryChargeRequestNewDTO(final Long id, final Long slNo, final Long chargeId, final String chargeName, final Long currencyId, final Long convertedCurrencyId, final Long measurementId, final Long unitId, final Double noOfUnit, final Double roe, final Double minAmount, final Double amountPerUnit, final Double amount, final Double currencyAmount, final Double minCostAmount, final Double costPerUnit, final Double costAmount, final Double costCurrencyAmount, final Long vendorId, final Double sellPerUnit, final QuoteProcess process, final boolean isModified, final Freight term, final Long billToCustomerId, final Double costRoe, final YesNo isContainer, final List<MultiCarrierRequestDTO> multiCarrierRequestDTOS) {
        this.id = id;
        this.slNo = slNo;
        this.chargeId = chargeId;
        this.chargeName = chargeName;
        this.currencyId = currencyId;
        this.convertedCurrencyId = convertedCurrencyId;
        this.measurementId = measurementId;
        this.unitId = unitId;
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
        this.vendorId = vendorId;
        this.sellPerUnit = sellPerUnit;
        this.process = process;
        this.isModified = isModified;
        this.term = term;
        this.billToCustomerId = billToCustomerId;
        this.costRoe = costRoe;
        this.isContainer = isContainer;
        this.multiCarrierRequestDTOS = multiCarrierRequestDTOS;
    }

    @Generated
    public EnquiryChargeRequestNewDTO() {
    }
}
