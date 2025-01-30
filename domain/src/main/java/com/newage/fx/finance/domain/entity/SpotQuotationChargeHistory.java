package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.QuoteProcess;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spotquote_charge_history")
public class SpotQuotationChargeHistory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @NotNull
    @Column(name = "charge_id", nullable = false)
   private Long chargeId;

    @NotNull(message = "Accepted Values (Inserted, Updated, Deleted)")
    @Column(name = "process", nullable = false)
    @Enumerated(EnumType.STRING)
    private QuoteProcess process;

    @Column(name = "charge_name")
    private String chargeName;

    @Column(name = "charge_code")
    private String chargeCode;

    @NotNull
    @Column(name = "currency_id", nullable = false)
    private Long currencyId;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "unit_id", nullable = false)
    private String unit;

    @Column(name = "unit_code")
    private String unitCode;

    @Column(name = "unit_master_id")
    private Long unitId;

    @NotNull
    @Column(name = "no_of_units", nullable = false)
    Double noOfUnit;

    @Column(name = "rate_of_exchange")
    private Double roe;

    @Column(name = "min_amount")
    private Double minAmount;

    @Column(name = "sell_per_unit", length = 20)
    Double sellPerUnit;

    @Column(name = "currency_amount")
    private Double currencyAmount;

    @Column(name = "min_cost_amount")
    private Double minCostAmount;

    @NotNull
    @Column(name = "valid_upto", nullable = false)
    private Date validUpTo;

    @Column(name = "cost_per_unit", length = 20)
    private Double costPerUnit;

    @Column(name = "vendor_id", length = 20)
    private Long vendorId;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_CHARGE_HISTORY_SPOT_QUOTATION_ID"))
    EnquiryHeader enquiryHeader;
}
