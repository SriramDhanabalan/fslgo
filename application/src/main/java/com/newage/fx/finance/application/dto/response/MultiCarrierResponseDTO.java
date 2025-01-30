package com.newage.fx.finance.application.dto.response;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MultiCarrierResponseDTO {
    private Long id;
    private String containerrName;
    private Long sell;
    private Long cost;
    private EnquiryChargeResponseNewDTO enquiryChargeResponseNewDTO;

    public MultiCarrierResponseDTO() {
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getContainerrName() {
        return this.containerrName;
    }

    @Generated
    public Long getSell() {
        return this.sell;
    }

    @Generated
    public Long getCost() {
        return this.cost;
    }

    @Generated
    public EnquiryChargeResponseNewDTO getEnquiryChargeResponseNewDTO() {
        return this.enquiryChargeResponseNewDTO;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setContainerrName(final String containerrName) {
        this.containerrName = containerrName;
    }

    @Generated
    public void setSell(final Long sell) {
        this.sell = sell;
    }

    @Generated
    public void setCost(final Long cost) {
        this.cost = cost;
    }

    @Generated
    public void setEnquiryChargeResponseNewDTO(final EnquiryChargeResponseNewDTO enquiryChargeResponseNewDTO) {
        this.enquiryChargeResponseNewDTO = enquiryChargeResponseNewDTO;
    }















}
