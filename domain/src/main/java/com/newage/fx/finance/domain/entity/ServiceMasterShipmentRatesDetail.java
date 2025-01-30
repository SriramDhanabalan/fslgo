package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Freight;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "service_master_shipment_rates_detail")
public class ServiceMasterShipmentRatesDetail extends Auditable<String> {

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
    private Double amountPerUnit;

    @Column(name = "amount")
    private Double amount;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_master_id", foreignKey = @ForeignKey(name = "FK_SERVICE_MASTER_HEADER_ID"))
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;
}
