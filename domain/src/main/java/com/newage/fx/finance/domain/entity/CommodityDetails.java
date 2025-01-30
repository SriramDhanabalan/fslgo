package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.enums.Action;
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
@Table(name = "us_custom_commodity")
public class CommodityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "action")
    private Action action;

    @Column(name = "origin_of_goods")
    private String originOfGoods;

    @Column(name = "license_type_id")
    private Long licenseTypeId;

    @Column(name = "schedule_bhts_code_id")
    private Long scheduleBHTSCodeId;

    @Column(name = "commodity_description")
    private String commodityDescription;

    @Column(name = "quantity1")
    private Long quantity1;

    @Column(name = "quantatity1_unit_code")
    private String quantatity1UnitCode;

    @Column(name = "quantity2")
    private Long quantity2;

    @Column(name = "quantatity2_unit_code")
    private String quantatity2UnitCode;

    @Column(name = "value")
    private Long value;

    @Column(name = "gross_weight")
    private Double grossWeight;

    @Column(name = "export_code_id")
    private Long exportCodeId;

    @Column(name = "eccn")
    private String eccn;

    @Column(name = "export_lic_no")
    private String exportLicNo;

    @Column(name = "license_value")
    private String licenseValue;

    @Column(name = "is_used_vehicle")
    private String isUsedVehicle;

    @Column(name = "vin_product_id")
    private String VinProductId;

    @Column(name = "id_type")
    private String idType;

    @Column(name = "vehicle_title_no")
    private String vehicleTitleNo;

    @Column(name = "vehicle_title_state_id")
    private Long vehicleTitleStateId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "general_info_id", foreignKey = @ForeignKey(name = "FK_COMMODITY_GENERAL_ID"))
    public GeneralInfoAesCustomDetails generalInfo;
}
