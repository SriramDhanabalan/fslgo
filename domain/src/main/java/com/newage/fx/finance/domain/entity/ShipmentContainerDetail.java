package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_container_detail")
public class ShipmentContainerDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "master_id", length = 20)
    private Long masterId;

    @Column(name = "container_sl_no", length = 20)
    private String containerNumber;

    @Column(name = "no_of_pieces", length = 20)
    private int noOfPieces;

    @Column(name = "external_no_of_piece", length = 20)
    private Long externalNoOfPiece;

    @Column(name = "internal_no_of_piece", length = 20)
    private Long internalNoOfPiece;

    @Column(name = "gross_weight_kgs", nullable = true, length = 20)
    private Double grossWeightKgs;

    @Column(name = "gross_weight_lbs", nullable = true, length = 20)
    private Double grossWeightLbs;


    @Column(name = "volume_in_cbm", nullable = true, length = 20)
    private Double volumeInCbm;

    @Column(name = "volume_in_cft", nullable = true, length = 20)
    private Double volumeInCft;

    @Column(name = "container_id")
    private Long containerId;

    @Column(name = "container_name", length = 20)
    private String containerName;

    @Column(name = "container_type_id")
    private Long containerTypeId;

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

    @Column(name = "transporter_id")
    private Long transporterId;

    @Column(name = "transporter_name")
    private String transporterName;

    @Column(name = "modified")
    private boolean isModified;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "master_container_details_id", foreignKey = @ForeignKey(name = "FK_MASTER_CONTAINER_ID"))
    public MasterContainerDetail masterContainer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_HEADER_ID"))
    public ShipmentHeader shipmentHeader;

    @Version
    @Column(name = "version")
    private Long version;

}