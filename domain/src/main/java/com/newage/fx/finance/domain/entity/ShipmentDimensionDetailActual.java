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
@Table(name = "shipment_dimension_detail_actual")
public class ShipmentDimensionDetailActual extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "pack_id", nullable = false, length = 20)
    private Double packId;

    @Column(name = "dimension_unit", nullable = false, length = 20)
    private Double dimensionUnit;

    @Column(name = "dimension_value", nullable = false, length = 20)
    private Double dimensionValue;

    @Column(name = "length", nullable = false, length = 20)
    private Double length;

    @Column(name = "width", nullable = false, length = 20)
    private Double width;

    @Column(name = "height", nullable = false, length = 20)
    private Double height;

    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Integer no_of_pieces;

    @Column(name = "gross_weight_kgs", nullable = false, length = 20)
    private Double grossWeightKgs;

    @Column(name = "gross_weight_lbs", nullable = false, length = 20)
    private Double grossWeightLbs;

    @Column(name = "volume_in_cbm", nullable = false, length = 20)
    private Double volumeInCbm;

    @Column(name = "volume_in_cft", nullable = false, length = 20)
    private Double volumeInCft;

    @Column(name = "volume_weight", nullable = false, length = 20)
    private Double volumeInWeight;

    @Column(name = "over_dimension", nullable = false, length = 20)
    private Double overDimension;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_DD_ACTUAL_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

}