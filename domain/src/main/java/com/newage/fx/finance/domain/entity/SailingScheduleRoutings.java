package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode;
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
@Table(name = "sailing_schedule_routings")
public class SailingScheduleRoutings extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "mode", length = 20)
    private SailingScheduleRoutingMode Mode;

    @Column(name = "origin_id", length = 20)
    private Long originId;

    @Column(name = "origin_name", length = 100)
    private String originName;

    @Column(name = "etd", length = 100)
    private Date etd;

    @Column(name = "destination_id", length = 20)
    private Long destinationId;

    @Column(name = "destination_name", length = 100)
    private String destinationName;

    @Column(name = "eta", length = 100)
    private Date eta;

    @Column(name = "vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "vessel_name", length = 20)
    private String vesselName;

    @Column(name = "voyage_number", length = 20)
    private String voyageNumber;

    @Column(name = "connection_port_id", length = 20)
    private Long connectionPortId;

    @Column(name = "connection_port_name", length = 100)
    private String connectionPortName;

    //    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "arrival_date_time")
    private Date arrivalDateTime;

    //    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "departure_date_time")
    private Date departureDateTime;

    @Column(name = "imo_number", length = 100)
    private String imoNumber;

    @ManyToOne
    @JoinColumn(name = "schedule_details_id", foreignKey = @ForeignKey(name = "FK_SCHEDULE_DETAILS_ID"))
    public SailingScheduleDetails sailingScheduleDetails;

    @Version
    @Column(name = "version")
    private Long version;


}
