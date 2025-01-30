package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.EnquiryStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "spotquote_log_history")
public class SpotQuotationRejectToResubmitLogHistory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "reason_id",nullable = false)
    private Long reasonId;

    @NotNull
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private EnquiryStatus status;

    @Column(name = "reason_to_resubmit", length = 2000)
    private String reasonToResubmit;

    @Column(name = "reason_note", length = 200)
    private String reasonNote;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_LOG_SPOT_QUOTATION_ID"))
    public EnquiryHeader enquiryDetail;


}
