package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus;
import com.newage.fx.finance.domain.enums.TransportMode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_routing_detail")
public class ShipmentRoutingDetail extends Auditable<String> {

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

    @NotNull
    @Column(name = "from_id", nullable = false, length = 20)
    private Long fromPortId;

    @NotNull
    @Column(name = "from_name", nullable = false, length = 100)
    private String fromPortName;

    @NotNull
    @Column(name = "to_id", nullable = false, length = 20)
    private Long toPortId;

    @NotNull
    @Column(name = "to_name", nullable = false, length = 100)
    private String toPortName;

    @NotNull
    @Column(name = "etd", nullable = false)
    private Date etd;

    @NotNull
    @Column(name = "eta", nullable = false)
    private Date eta;

    @Column(name = "atd", nullable = true)
    private Date atd;

    @Column(name = "ata", nullable = true)
    private Date ata;

    @NotNull
    @Column(name = "transporter_mode", nullable = false, length = 20)
    private TransportMode move ;

    @Column(name = "transporter_id", nullable = false, length = 20)
    private Long carrierOrVesselId;


    @Column(name = "transporter_name", nullable = false, length = 100)
    private String carrierOrVesselName;


    @Column(name = "transport_route_no", nullable = false, length = 20)
    private String voyageOrflightNo;


    @Column(name = "vehicle_id", nullable = false, length = 20)
    private Long vehicleId;


    @Column(name = "vehicle_name", nullable = false, length = 100)
    private String vehicleName;


    @Column(name = "driver_id", nullable = false, length = 20)
    private Long driverId;


    @Column(name = "driver_name", nullable = false, length = 100)
    private String driverName;

    @NotNull
    @Column(name = "status", nullable = false, length = 20)
    private ShipmentConnectionsStatus status;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SHP_DETAILS_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}
