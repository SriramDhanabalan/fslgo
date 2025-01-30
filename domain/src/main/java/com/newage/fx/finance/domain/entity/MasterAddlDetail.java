package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_addl_detail")
public class MasterAddlDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "agent_iata", length = 100)
    private String agentIata;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "account_no", length = 100)
    private String accountNo;

    @Column(name = "declared_value_carrier")
    private String declaredValueCarrier;

    @Column(name = "declared_value_customs")
    private String declaredValueCustoms;

    @Column(name = "rate_class", length = 20)
    private String rateClass;

    @Column(name = "handling_info", length = 200)
    private String handlingInfo;

    @Column(name = "accounting_info", length = 200)
    private String accountingInfo;

    @Column(name = "marks_and_numbers", length = 200)
    private String marksAndNumbers;

    @Column(name = "commodity", length = 100)
    private String commodity;

    @Column(name = "lc_note", length = 200)
    private String lcNote;

    @Column(name = "declare_value_insurance")
    private String declaredValueInsurance;

    @Column(name = "agreed", length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo agreed;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "iata_rate", length = 100)
    private Double iataRate;

    @Column(name = "is_email_sent")
    @Enumerated(EnumType.STRING)
    private YesNo emailSent=YesNo.No;

    @Column(name = "known_shipper")
    @Enumerated(EnumType.STRING)
    private YesNo knownShipper;


    @Column(name = "tab_validation", nullable = true)
    private String tabValidation;

    @Column(name = "previous_ccn",length = 30)
    private String previousCcn;

    @Column(name = "master_completed", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo masterCompleted;

    @Column(name = "buyer_consolidation")
    @Enumerated(EnumType.STRING)
    private YesNo buyerConsolidation= YesNo.No;

    @Column(name = "mft_from_id")
    private Long mftFromId;

    @Column(name = "mft_to_id")
    private Long mftToId;

    @Column(name = "unstuff_place_id")
    private Long unstuffPlaceId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @Version
    @Column(name = "version")
    private Long version;



}
