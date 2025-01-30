package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_dimension_detail")
public class CfsWareHouseDimensionDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "pack_id", nullable = true, length = 20)
    private Long packId;

    @Column(name = "package_type", length = 20)
    private String packageType;

    @NotNull
    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Integer noOfPieces;

    @NotNull
    @Column(name = "length", nullable = false, length = 20)
    private Double length;

    @NotNull
    @Column(name = "width", nullable = false, length = 20)
    private Double width;

    @NotNull
    @Column(name = "height", nullable = false, length = 20)
    private Double height;

    @Column(name = "volume_cbm", nullable = true, length = 20)
    private Double volumeCbm;

    @Column(name = "gross_weight_lbs", nullable = true, length = 20)
    private Double grossWeightLbs;

    @Column(name = "gross_weight_kg", nullable = true, length = 20)
    private Double grossWeightKg;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "header_details_id",foreignKey = @ForeignKey(name = "FK_CFS_DIMENSION_HEADERID"))
    private CfsWareHouseHeaderDetails headerDetails;

}
