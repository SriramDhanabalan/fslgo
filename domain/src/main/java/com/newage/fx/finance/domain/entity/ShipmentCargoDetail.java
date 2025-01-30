package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.Configuration.CustomValidationMarkerInterface;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.TemperatureUnit;
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
@Table(name = "shipment_cargo_detail")
public class ShipmentCargoDetail extends Auditable<String> {

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


    @Column(name = "hazardous", nullable = true, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo hazardous;

    @Column(name = "stackable", nullable = true, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo stackable;

    @Column(name = "refrigeration", nullable = true, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo refrigerationRequired;

    @Column(name = "minimum_temperature")
    private Double minTemperature;

    @Column(name = "maximum_temperature")
    private Double maxTemperature;

    @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "commodity_id", nullable = false, length = 20)
    private Long commodityId;

    @Column(name = "commodity_name", nullable = false, length = 100)
    private String commodityName;

   // @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "commodity_description",nullable = true,length = 200)
    private String commodityDescription;


    @Column(name = "pack_id", nullable = false, length = 20)
    private Long packId; // We're using to  store As InternalPackId

    @Column(name = "external_pack_id", nullable = false, length = 20)
    private Long ExternalPackId;

    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Integer noOfPieces;


    @Column(name = "gross_weight_kgs", nullable = false, length = 20)
    private Double grossWeightKgs;

    @Column(name = "gross_weight_lbs", nullable = false, length = 20)
    private Double grossWeightlbs;

    @Column(name = "volume_in_cbm", nullable = false, length = 20)
    private Double volumeInCbm;

    @Column(name = "volume_in_cft", nullable = false, length = 20)
    private Double volumeInCft;

    @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "volume_weight", nullable = false, length = 20)
    private Double volumeWeight;

    @Column(name = "chargeable_unit", nullable = false, length = 20)
    private Double chargeableUnit;

    @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "marks_and_numbers", nullable = true, length = 200)
    private String marksAndNumbers;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @Column(name = "imo_class_id")
    private Long imoClassId;

    @Column(name = "imo_class")
    private String imoClassName;

    @Column(name = "un_number")
    private String unNumber;

    @Column(name = "storage_code")
    private String storageCode;

    @Column(name = "flash_point")
    private String flashPoint;

    @Column(name = "temperature_code")
    @Enumerated(EnumType.STRING)
    private TemperatureUnit temperatureCode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_CARGO_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

}