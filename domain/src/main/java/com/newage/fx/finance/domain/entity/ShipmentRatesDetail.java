package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.RateReferenceTypes;
import com.newage.fx.finance.domain.enums.RateTypes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_rates_detail")
public class ShipmentRatesDetail extends Auditable<String> {

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

//    @Column(name = "shipment_id", length = 100,nullable = false)
//    private String shipmentId;

//    @Column(name = "shipment_service_id", length = 100,nullable = false)
//    private Long shipmentServiceId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

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

    @Column(name = "currency_code",nullable = true, length = 20)
    private String currencyCode;

    @Column(name = "currency_rate_of_exchange")//spell correction in db
    private Double roe;

    @Column(name = "sell_rate_per_unit", nullable = true, length = 20)
    private Double sellRatePerUnit;

    @Column(name = "sell_amount", nullable = true, length = 20)
    private Double sellAmount;

    @Column(name = "sell_amount_min", nullable = true, length = 20)
    private Double sellAmountMinimum;

    @Column(name = "cost_rate_per_unit", nullable = true, length = 20)
    private Double costRatePerUnit;

    @Column(name = "cost_amount", nullable = true, length = 20)
    private Double costAmount;

    @Column(name = "bill_to_customer_id", nullable = true, length = 20)
    private Long billToCustomerId;

    @Column(name = "cost_to_vendor_id", nullable = true, length = 20)
    private Long costToVendorId;

    @Column(name = "declrated_sell_rate", nullable = true, length = 20)
    private Double declratedSellRate;

    @Column(name = "declarted_sell_min", nullable = true, length = 20)
    private Double declratedSellMinimum;

    @Column(name = "rate_type", nullable = true, length = 20)
    private RateTypes rateType;

    @Column(name = "rate_reference_type", nullable = true, length = 20)
    private RateReferenceTypes rateReferenceType;

    @Column(name = "rate_reference_id", nullable = true, length = 20)
    private Long rateReferenceId;

    @Column(name = "rate_reference_sl_no", nullable = true, length = 20)//spell correction in db
    private Long rateReferenceSlNo;

    @Column(name = "rate_reference_amount", nullable = true, length = 20)
    private Double rateReferenceAmount;

    @Column(name = "unit_from", nullable = true, length = 20)
    private Long unitFrom;

    @Column(name = "unit_to", nullable = true, length = 20)
    private Long unitTo;

    @Column(name = "cost_currency_id", nullable = true, length = 20)
    private Long costCurrencyId;

    @Column(name = "cost_roe")//spell correction in db
    private Double costRoe;

    @Column(name = "cost_unit_id", nullable = true, length = 20)
    private Long costUnitId;

    @Column(name = "cost_unit", nullable = true, length = 20)
    private Double costUnit;

    @Column(name = "no_of_units", nullable = true)
    private Double noOfUnit;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @Column(name = "term")
    @Enumerated(EnumType.STRING)
    private Freight term;

    @Column(name = "modified", nullable = true)
    private boolean isModified;

    @Column(name = "enquiry_ref_charge_id")
    private Long enquiryRefChargeId;

    @Column(name = "balance_sell_amt")
    private Double balanceSellAmt;

    @Column(name = "balance_cost_amt")
    private Double balanceCostAmt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_service_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_SERVICE_ID"))
    public ShipmentServiceDetail shipmentServiceId;

}
