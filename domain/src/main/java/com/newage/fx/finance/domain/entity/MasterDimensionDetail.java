package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.DimensionUnit;
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
@Table(name = "master_dimension_detail")
public class MasterDimensionDetail extends Auditable<String> {

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

    @Column(name = "pack_id")
    private Long packId;

    @Column(name = "dimension_unit")
    @Enumerated(EnumType.STRING)
    private DimensionUnit dimensionUnit;

    @Column(name = "dimension_value")
    private String dimensionValue;

    @Column(name = "length")
    private Double length;

    @Column(name = "width")
    private Double width;

    @Column(name = "height")
    private Double height;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "no_of_pieces")
    private Integer noOfPieces;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "gross_weight_kgs")
    private Double grossWeightKgs;

    @Column(name = "gross_weight_lbs")
    private Double grossWeightLbs;

    @Column(name = "volume_in_cbm")
    private Double volumeInCbm;

    @Column(name = "volume_in_cft")
    private Double volumeInCft;

    @Column(name = "volume_weight")
    private Double volumeWeight;

    @Column(name = "over_dimension")
    @Enumerated(EnumType.STRING)
    private YesNo overDimension;

    @Column(name = "notes")
    private String notes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @Version
    @Column(name = "version")
    private Long version;

}