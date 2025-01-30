package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.MAWBCharges;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_rates_detail")
public class MasterRatesDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @Column(name = "charge_id")
    private Long chargeId;

    @Column(name = "charge_name")
    private String chargeName;

    @Column(name = "unit_id")
//    @Column(name = "sell_unit_id")
    private Long unitId;

    @Column(name = "term")
    @Enumerated(EnumType.STRING)
    private Freight term;

    @Column(name = "currency_id")
    private Long currencyId;

    @Column(name = "currency_rate_of_exchange")
    private Double currencyRoe;

    @Column(name = "no_of_unit")
    private Double noOfUnit;

    @Column(name = "amount_per_unit")
    private Double costRatePerUnit;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "amount")
    private Double amount;


    @Column(name = "due")
    @Enumerated(EnumType.STRING)
    private MAWBCharges due;

    @Column(name = "vendor_id")
//    @Column(name = "cost_to_vendor_id")
    private Long vendorId;

    @Column(name = "notes")
    private String notes;


//
//    @Column(name = "sell_amount_min")
//    private Double sellAmountMin;
//
//    @Column(name = "cost_rate_per_unit")
//    private Double costRatePerUnit;
//
//    @Column(name = "cost_amount")
//    private Double costAmount;
//
//    @Column(name = "bill_to_customer_id")
//    private Long billToCustomerId;
//

//
//    @Column(name = "declrated_sell_rate")
//    private Double declaredSellRate;
//
//    @Column(name = "declrated_sell_min")
//    private Double declaredSellMin;
//
//    @Column(name = "rate_type", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private RateTypes rateType;
//
//    @Column(name = "rate_reference_type", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private RateReferenceTypes rateReferenceType;
//
//    @Column(name = "rate_reference_id")
//    private Long rateReferenceId;
//
//    @Column(name = "rate_reference_sl_no")
//    private Long rateReferenceSlNo;
//
//    @Column(name = "rate_reference_amount")
//    private Double rateReferenceAmount;
//
//
//    @Column(name = "unit_from")
//    private Long unitFrom;
//
//    @Column(name = "unit_to")
//    private Long unitTo;
//
//    @Column(name = "cost_unit_id")
//    private Long costUnitId;
//
//    @Column(name = "cost_unit")
//    private Double costUnit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_service_id", foreignKey = @ForeignKey(name = "FK_MASTER_SERVICE_DETAIL_ID"))
    public MasterServiceDetail masterServiceDetail;

    @Version
    @Column(name = "version")
    private Long version;

}