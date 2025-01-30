package com.newage.fx.finance.domain.entity;

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
@Table(name = "us_custom_equipment")
public class EquipmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "equipment_container_no")
    private String equipmentContainerNo;

    @Column(name = "seal_no")
    private Long sealNo;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "general_info_id", foreignKey = @ForeignKey(name = "FK_EQUIPMENT_GENERAL_ID"))
    public GeneralInfoAesCustomDetails generalInfo;
}
