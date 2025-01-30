package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquiry_spot_rates_mapping")
public class EnquirySpotRatesMapping extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "rate_schedule_header_id")
    private Long rateHeaderId;

    @Column(name = "rate_schedule_offer_id")
    private Long rateOffersId;

    @Column(name = "rate_id")
    private String rateId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn(name = "enquiry_id", foreignKey = @ForeignKey(name = "FK_ENQ_SPOT_ID"))
    private EnquiryHeader enquiryDetail;
}
