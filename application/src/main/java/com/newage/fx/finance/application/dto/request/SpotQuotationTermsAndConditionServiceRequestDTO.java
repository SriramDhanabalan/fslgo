package com.newage.fx.finance.application.dto.request;

import lombok.Generated;

public class SpotQuotationTermsAndConditionServiceRequestDTO {

    private Long id;
    private String notes;

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getNotes() {
        return this.notes;
    }

    @Generated
    public SpotQuotationTermsAndConditionServiceRequestDTO(final Long id, final String notes) {
        this.id = id;
        this.notes = notes;
    }

    @Generated
    public SpotQuotationTermsAndConditionServiceRequestDTO() {
    }


}
