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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_package_detail")
public class CfsWareHousePackageDetail extends Auditable<String> {

    @Id
    Long id;

    @Column(name = "gross_weight_kg", length = 14)
    private Double grossWeightKg;

    @Column(name = "vol_weight_kg", length = 14)
    private Double volWeightKg;

    @Column(name = "chargeable_weight_kg", length = 14)
    private Double chargeableWeightKg;

    @Version
    @Column(name = "version")
    private Long version;

    @OneToOne
    @JoinColumn(name="cfs_item_information_package",foreignKey = @ForeignKey(name="FK_CFS_ITEM_INFORMATION_PACKAGEID"))
    CfsWareHouseHeaderDetails information;
}
