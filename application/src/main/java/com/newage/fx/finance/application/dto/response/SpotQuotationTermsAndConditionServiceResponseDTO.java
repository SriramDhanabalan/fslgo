package com.newage.fx.finance.application.dto.response;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SpotQuotationTermsAndConditionServiceResponseDTO {
    private Long id;
    private String notes;

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public String getNotes() {
        return this.notes;
    }

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setNotes(final String notes) {
        this.notes = notes;
    }

    @Generated
    public SpotQuotationTermsAndConditionServiceResponseDTO() {
    }

    @Generated
    public SpotQuotationTermsAndConditionServiceResponseDTO(final Long id, final String notes) {
        this.id = id;
        this.notes = notes;
    }


}
