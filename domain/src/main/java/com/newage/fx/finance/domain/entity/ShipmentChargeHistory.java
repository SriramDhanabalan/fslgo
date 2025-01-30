package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.QuoteProcess;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_charge_history")
public class ShipmentChargeHistory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "charge_id", nullable = true, length = 20)
    private Long chargeId;

    @Column(name = "charge_name", nullable = true, length = 20)
    private String chargeName;

    @Column(name = "sell_unit_id", nullable = true, length = 20)
    private Long unitId;

    @Column(name = "sell_unit", nullable = true, length = 20)
    private String unitName;

    @Column(name = "currency_id", nullable = true, length = 20)
    private Long currencyId;

    @Column(name = "currency_rate_of_exchange")//spell correction in db
    private Double roe;

    @Column(name = "sell_rate_per_unit", nullable = true, length = 20)
    private Double sellRatePerUnit;

    @NotNull(message = "Accepted Values (Inserted, Updated, Deleted)")
    @Column(name = "process", nullable = false)
    @Enumerated(EnumType.STRING)
    private QuoteProcess process;

    @Column(name = "sell_amount", nullable = true, length = 100)
    private Double sellAmount;

    @Column(name = "sell_amount_min", nullable = true, length = 100)
    private Double sellAmountMinimum;

    @Column(name = "cost_rate_per_unit", nullable = true, length = 100)
    private Double costRatePerUnit;

    @Column(name = "cost_amount", nullable = true, length = 100)
    private Double costAmount;

    @Column(name = "bill_to_customer_id", nullable = true, length = 100)
    private Long billToCustomerId;

    @Column(name = "cost_to_vendor_id", nullable = true, length = 100)
    private Long costToVendorId;

    @Column(name = "declrated_sell_rate", nullable = true, length = 100)
    private Double declratedSellRate;

    @Column(name = "declrated_sell_min", nullable = true, length = 100)
    private Double declratedSellMinimum;

    @Column(name = "cost_unit_id", nullable = true, length = 100)
    private Long costUnitId;

    @Column(name = "cost_unit", nullable = true, length = 100)
    private Double costUnit;

    @Column(name = "rate_id", nullable = true, length = 100)
    private Long shipmentRateId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_CHARGE_HISTORY_ID"))
    public ShipmentHeader shipmentHeader;
}
