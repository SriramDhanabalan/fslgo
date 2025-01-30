package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Table(name = "call_entry_competitor_details")
public class CallEntryCompetitorDetailsNxt extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "competitor_id", nullable = false, length = 20)
    Long competitorId;

    @Column(name = "service_id", nullable = true, length = 20)
    Long serviceId;

    @Column(name = "origin_id", nullable = true, length = 20)
    Long originId;

    @Column(name = "destination_id", nullable = true, length = 20)
    Long destinationId;

    @Column(name = "rate", nullable = true, length = 100)
    String rate;

    @Column(name = "group_company_id", length = 20)
    Long groupCompanyId;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Version
    @Column(name = "version")
    Long version;

    @ManyToOne()
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_nxt_competitor_details"))
    private CallEntryHeaderNxt callEntryHeader;
}
