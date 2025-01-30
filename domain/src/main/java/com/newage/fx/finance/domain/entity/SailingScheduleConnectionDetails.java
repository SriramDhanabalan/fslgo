package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_sailing_schedule_connection")
public class SailingScheduleConnectionDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sl_no", length = 20)
    private Integer slNo;

    @Column(name = "connection_port_id", length = 20)
    private Long connectionPortId;

    @Column(name = "connection_port_name", length = 100)
    private String connectionPortName;

    @Column(name = "destination_id", length = 20)
    private Long destinationId;

    @Column(name = "destination_name", length = 100)
    private String destinationName;

    @Column(name = "eta", length = 100)
    private Date eta;

    @Column(name = "etd", length = 100)
    private Date etd;


    @Column(name = "carrier_id",  length = 20)
    private Long carrierId;


    @Column(name = "carrier_name", length = 100)
    private String carrierName;

    @Column(name = "vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "vessel_name", length = 20)
    private String vesselName;

    @Column(name = "route_no", length = 20)
    private String routeNo;

    @Column(name = "schedule_mode", length = 20)
    private String scheduleMode;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private SailingScheduleStatus status;

    @Column(name = "imo_number", length = 100)
    private String imoNumber;

    @Column(name = "rotation_number", length = 20)
    private String rotationNumber;

    @Column(name = "via_number", length = 20)
    private String viaNumber;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne
    @JoinColumn(name = "schedule_id", foreignKey = @ForeignKey(name = "FK_SCHEDULE_HEADER_ID"))
    public SailingScheduleHeaderDetails headerDetails;

}
