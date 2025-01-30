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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_direct_rate_dimension_details")

public class DirectRateDimensionDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* No. of Pieces */
    @NotNull
    @Column(name = "no_of_pieces",nullable = false,length=8)
    int noOfPiece;

    /*legth*/
    @NotNull
    @Column(name = "legth",nullable = false,length=8)
    double dimLength;

    /*width*/
    @NotNull
    @Column(name = "width",nullable = false,length=8)
    double dimWidth;

    /*hight*/
    @NotNull
    @Column(name = "hight",nullable = false,length=8)
    double dimHeight;

    /* Gross Weight in kg*/
    @Column(name = "gross_weight_kg",length=14)
    double grossWeightKg = 0.0;

    /* Vol Weight(kg) */
    @Column(name = "vol_weight_kg",length=14)
    double volWeightKg;

    /* Vol Weight (Lbs)*/
    @Column(name = "gross_weight_lbs",length=14)
    double grossWeightLbs;

    @ManyToOne()
    @JoinColumn(name = "cargo_detail_id", foreignKey = @ForeignKey(name = "FK_DIMENSION_CARGODETID"))
    DirectRateCargoDetails cargoDetails;

    @Version
    @Column(name = "version")
    private Long version;

}
