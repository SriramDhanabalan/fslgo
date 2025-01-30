package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_direct_rate_package_details")
public class DirectRatePackageDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "gross_weight_kg",length=14)
    private double grossWeightKg;



    @Column(name = "vol_weight_kg",length=14)
    private double volWeightKg;



    @Column(name = "chargeable_weight_kg",length=14)
    private double chargeableWeightKg;

    @OneToOne()
    @JoinColumn(name = "cargo_detail_id", foreignKey = @ForeignKey(name = "FK_CONTAINER_SERVICEID"))
    DirectRateCargoDetails cargoDetails;

    @Version
    @Column(name = "version")
    private Long version;

}
