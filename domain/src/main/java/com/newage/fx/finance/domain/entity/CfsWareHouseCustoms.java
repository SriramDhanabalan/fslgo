package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_customs")
public class CfsWareHouseCustoms extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "customs_clearance_date", nullable = true)
    private Date customsClearanceDate;

    @Column(name = "vgm_date", nullable = true)
    private Date vgmDate;

    @Column(name = "damage_remarks", nullable = true, length = 2000)
    private String damageAndRemarks;

    @Column(name = "marks_number", nullable = true, length = 2000)
    private String marksAndNumber;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "time")
    private String time;

    @OneToOne
    @JoinColumn(name="cfs_item_information_customs",foreignKey = @ForeignKey(name="FK_CFS_ITEM_INFORMATION_CUSTOMSID"))
    CfsWareHouseHeaderDetails information;
}
