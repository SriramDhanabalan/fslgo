package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crt_trip_container_details")
public class CrtTripContainerDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Trailer
    @Column(name = "trailer_no")
    private String trailerNo;

    //container
    @Column(name = "container_no")
    private String containerNo;

    @Column(name = "tare_weight")
    private Double tareWeight;

    @Column(name = "seal_no")
    private String sealNo;

    @Column(name = "container_id")
    private Long containerId;

    @Column(name = "container_type")
    private String containerType;

    @Column(name = "expected_date")
    private Date expectedDate;

    @Column(name = "planned_date")
    private Date plannedDate;

    @Column(name = "cfs_terminal_id")
    private Long cfsTerminalId;

    @Column(name = "time_slot")
    private String timeSlot;

    @Column(name = "cfs_terminal_name")
    private String cfsTerminalName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trip_detail_id",foreignKey = @ForeignKey(name = "FK_TRIP_DETAIL_ID"))
    private CrtTripDetails tripDetails;
}
