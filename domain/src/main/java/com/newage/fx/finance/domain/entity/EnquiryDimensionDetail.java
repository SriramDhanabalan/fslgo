package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "enquriy_service_dimention_detail")
public class EnquiryDimensionDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number")
    private Integer serialNumber;


    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "enquiry_no", nullable = false, length = 20)
    private String enquiryNo;

    @Column(name = "enquiry_id", length = 100,nullable = false)
    private Long enquiryId;

    @Column(name = "pack_id", nullable = true, length = 20)
    private Long packId;

    @Column(name = "dimension_unit", nullable = false, length = 20)
    private String dimensionUnit;

    @Column(name = "dimension_value", nullable = false, length = 20)
    private Double dimensionValue;

    @Column(name = "length", nullable = false, length = 20)
    private Double length;

    @Column(name = "width", nullable = false, length = 20)
    private Double width;

    @Column(name = "height", nullable = false, length = 20)
    private Double height;

    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Long noOfPiece;

    @Column(name = "gross_weight_kgs", nullable = false, length = 20)
    private Double grossWeightKgs;

    @Column(name = "gross_weight_lbs", nullable = false, length = 20)
    private Double grossWeightLbs;

    @Column(name = "volume_in_cpm", nullable = false, length = 20)
    private Double volumeInCpm;

    @Column(name = "volume_in_cft", nullable = false, length = 20)
    private Double volumeInCft;

    @Column(name = "volume_in_weight", nullable = false, length = 20)
    private Double volWeightKg;

    @Column(name = "chargeable_weight_kg")
    private Double chargeableWeightKg;

    @Column(name = "gross_weight_per_piece")
    private Double grossWeightPerPiece;

    @Column(name = "over_dimension", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo overDimension;

    @Column(name = "notes",nullable = true)
    private String notes;

    @ManyToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_DIMENSIONDETAIL_ID"))
    public EnquiryHeader enquiryDetail;

}
