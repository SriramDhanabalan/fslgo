package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "spotquote_terms_and_condition_general_notes")
public class QuotationTermsAndConditionsGeneralNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "spot_quotation_id", foreignKey = @ForeignKey(name = "FK_SPOT_QUOTATION_TERMS_ID"))
    EnquirySpotQuotationNew spotQuotation;
}
