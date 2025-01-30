package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "enquiry_service_cargo_detail")
public class EnquiryCargoDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "enquiry_id", length = 100,nullable = true)
    private Long enquiryId;

    @Column(name = "enquiry_no", nullable = true, length = 20)
    private String enquiryNo;

    @Column(name = "hazardous", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo hazardous;

    @Column(name = "stackable", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo stackable;

    /* cargoReadyDate */
    @Column(name = "cargo_ready_date", nullable = false, length = 10)
    private Date cargoReadyDate;

    /* zone name */
    @Column(name = "expected_delivery_date", nullable = false, length = 10)
    private Date expectedDeliveryDate;



//    @OneToMany(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
//    private List<EnquiryDimensionDetails> dimensionDetails;
//
//    @OneToMany(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
//    private List<EnquiryContainerDetails> containerDetails;
//
//    @OneToOne(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
//    EnquiryPackageDetails packageDetails;

    @Column(name = "commodity_id", nullable = true, length = 20)
    private Long commodityId;

    @Column(name = "commodity_name", nullable = true, length = 100)
    private String commodityName;

    @Column(name = "commodity_description",nullable = true,length = 200)
    private String commodityDescription;

    @Column(name = "pack_id", nullable = true, length = 20)
    private Long packId;

    @Column(name = "no_of_packages", nullable = true, length = 20)
    private Integer noOfPackages;

    @Column(name = "gross_weight_kgs", nullable = false, length = 20)
    @JsonProperty("weight")
    private Double grossWeightKg;

    @Column(name = "gross_weight_lbs", nullable = false, length = 20)
    private Double grossWeightLbs;

    @Column(name = "volume_in_cbm", nullable = false, length = 20)
    @JsonProperty("volume")
    private Double volumeInCbm;

    @Column(name = "volume_in_cft", nullable = true, length = 20)
    private Double volumeInCft;

    @Column(name = "volume_weight_kgs", nullable = true, length = 20)
    private Double volWeightKg;

    @Column(name = "chargeable_unit", nullable = true, length = 20)
    private Double chargeableUnit;

    @Column(name = "chargeable_volume_cbm", nullable = true, length = 20)
    private Double chargeableVolumeCbm;

    @Column(name = "chargeable_weight", nullable = true, length = 20)
    private Double chargeableWeightKg;

    @Column(name = "marks_and_numbers", nullable = true, length = 200)
    private String marksAndNumbers;

    @Column(name = "notes" , nullable = true)
    private String notes;

    //CRT
    @Column(name = "vehicle_type_id" )
    private Long vehicleTypeId;

    @Column(name = "vehicle_type_name")
    private String vehicleTypeName;

    @Column(name = "expected_date")
    private Date expectedArrivalTime;

    @Column(name = "planned_date")
    private Date plannedArrivalTime;

    @Column(name = "time_slot")
    private String timeSlot;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_SERVICE_ENQCARGOID"))
    private EnquiryHeader enquiryDetail;


}
