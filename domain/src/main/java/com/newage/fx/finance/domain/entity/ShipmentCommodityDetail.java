package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_commodity_detail")
public class ShipmentCommodityDetail extends Auditable<String> {

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

    @Column(name = "sl_no", nullable = false)
    private Long slNo ;

    @Column(name = "item_no",length = 30)
    private String itemNo;

    @Column(name = "item_description",length = 2000)
    private String itemDescription;

    @Column(name = "country_of_origin")
    private Long countryOfOriginId;

    @Column(name = "no_of_pack")
    private int noOfPack;

    @Column(name = "gross_weight")
    private double grossWeight;

    @Column(name = "volume")
    private double volume;

    @Column(name = "chargeable_unit")
    private double chargeableUnit;

    @Column(name = "hs_code")
    private String hsCode;

    @Column(name = "currency_id ")
    private Long currencyId ;

    @Column(name = "unit_price")
    private double unitPrice;

    @Column(name = "imo_no",length =10)
    private String imoNo;

    @Column(name = "un_no",length = 10)
    private String unNo;

    @Column(name = "note", length = 2000)
    private String note;

    @Column(name = "po_number")
    private String poNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_CARGO_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

}

