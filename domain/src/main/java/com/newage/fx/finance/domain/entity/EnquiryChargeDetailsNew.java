package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ChargeType;
import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spotquote_charge_detail")
public class EnquiryChargeDetailsNew extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @NotNull
    @Column(name = "charge_id", nullable = false)
    Long chargeId;

    @Column(name = "charge_name")
    private String chargeName;

    @Column(name = "charge_code")
    private String chargeCode;

    @NotNull
    @Column(name = "currency_id", nullable = false)
    Long currencyId;

    @NotNull
    @Column(name = "converted_currency_id", nullable = false)
    Long convertedCurrencyId;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "converted_currency_code")
    private String convertedCurrencyCode;

    @Column(name = "measurement_id", nullable = false)
    Long measurementId;

    @Column(name = "unit_id", nullable = false, length = 20)
    private String unit;

    @Column(name = "unit_code", length = 20)
    private String unitCode;

    @Column(name = "unit_master_id")
    Long unitId;

    @Column(name = "no_of_units", nullable = false)
    Double noOfUnit;

    @Column(name = "rate_of_exchange")
    private Double roe;

    @Column(name = "min_amount")
    private Double minAmount;

    @Column(name = "amount_per_unit", length = 20)
    Double amountPerUnit;

    @Column(name = "amount")
    Double amount;

    @Column(name = "currency_amount")
    Double currencyAmount;

    @Column(name = "min_cost_amount")
    Double minCostAmount;

    @Column(name = "cost_per_unit", length = 20)
    Double costPerUnit;

    @Column(name = "cost_amount")
    Double costAmount;

    @Column(name = "cost_currency_amount")
    Double costCurrencyAmount;

    @Column(name = "vendor_id", length = 20)
    Long vendorId;

    @Column(name = "term")
    @Enumerated(EnumType.STRING)
    private Freight term;

    @Column(name = "bill_to_customer_id", nullable = true, length = 20)
    private Long billToCustomerId;

    @Column(name = "bill_to_customer_name", nullable = true, length = 20)
    private String billToCustomerName;

    @Column(name = "cost_roe")//spell correction in db
    private Double costRoe;

    @Column(name = "charge_type")
    @Enumerated(EnumType.STRING)
    private ChargeType chargeType;

    @Column(name = "is_container")
    @Enumerated(EnumType.STRING)
    private YesNo isContainer;

    @ManyToOne
    @JoinColumn(name = "spot_quotation_id", foreignKey = @ForeignKey(name = "FK_CHARGE_SPOT_QUOTATION_ID"))
    EnquirySpotQuotationNew spotQuotation;

    @ManyToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_ENQUIRY_DETAIL_ID"))
    private EnquiryHeader enquiryDetail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "enquiryChargeDetailsNew", cascade = CascadeType.ALL)
    private List<MultiCarrier> multiCarrier;

}
