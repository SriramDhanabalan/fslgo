package com.newage.fx.finance.domain.entity;


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
@Table(name = "master_container_detail")
public class MasterContainerDetail extends Auditable<String> {

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

    @Column(name = "container_number", length = 20)
    private String containerNumber;

    @Column(name = "actual_seal_number", length = 30)
    private String actualSealNumber;

    @Column(name = "customs_seal_number", length = 30)
    private String customsSealNumber;

    @Column(name = "haz")
    @Enumerated(EnumType.STRING)
    private YesNo haz;

    @Column(name = "loading_date")
    private Date loadingDate;

    @Column(name = "unloading_date")
    private Date unloadingDate;

    @Column(name = "soc")
    @Enumerated(EnumType.STRING)
    private YesNo soc;

    @Column(name = "confirmed")
    @Enumerated(EnumType.STRING)
    private YesNo confirmed;

    @Column(name = "cfs_id")
    private Long cfsId;

    @Column(name = "cfs_name", length = 50)
    private String cfsName;

    @Column(name = "pickup_yard_date")
    private Date pickupDate;

    @Column(name = "pickup_yard", length = 30)
    private String pickupYard;

    @Column(name = "cfs_in_date")
    private Date cfsInDate;

    @Column(name = "cfs_out_date")
    private Date cfsOutDate;

    @Column(name = "grid_no", length = 20)
    private String gridNo;

    @Column(name = "tare_weight")
    private Double tareWeight;

    @Column(name = "transporter_id")
    private Long transporterId;

    @Column(name = "transporter_name", length = 50)
    private String transporterName;

    @Column(name = "commodity", length = 2000)
    private String commodity;

    @Column(name = "note", length = 2000)
    private String note;

    @Column(name = "stuffing_date")
    private Date stuffingDate;

    @Column(name = "unstuffing_date")
    private Date unStuffingDate;

    @Column(name = "port_unload_date")
    private Date portUnloadDate;

    @Column(name = "tallied", length = 20)
    private String tallied;

    @Column(name = "free_days")
    private Date freeDays;

    @Column(name = "damage_note", length = 2000)
    private String damageNote;

    @Column(name = "manifest_seal_number", length = 300)
    private String manifestSealNumber;

    @Column(name = "container_id")
    private Long containerId;

    @Column(name = "container_name")
    private String containerName;

    @Column(name = "vehicle_id")
    private Long vehicleId;

    @Column(name = "vehicle_name")
    private String vehicleName;

    @Column(name = "trailer_number")
    private String trailerNo;

    @Column(name = "vehicle_type_id")
    private Long vehicleTypeId;

    @Column(name = "driver_id")
    private Long driverId;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "reference_number")
    private String referenceNumber;

    @Column(name = "po_number")
    private String poNumber;

    @Column(name = "external_no_of_piece")
    private Long externalNoOfPiece;

    @Column(name = "internal_no_of_piece")
    private Long internalNoOfPiece;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_RATES_DETAIL_ID"))
    public MasterHeader masterHeader;

    // MasterContainerDetail.java
    @OneToOne(mappedBy = "masterContainer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ShipmentContainerDetail shipmentContainerDetail;

    @Version
    @Column(name = "version")
    private Long version;

}