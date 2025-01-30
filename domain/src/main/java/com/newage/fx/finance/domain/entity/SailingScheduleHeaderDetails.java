package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_sailing_schedule_header")
public class SailingScheduleHeaderDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "schedule_id", nullable = false, length = 100)
    private String scheduleId;


    @Column(name = "carrier_id", length = 20)
    private Long carrierId;


    @Column(name = "carrier_name",  length = 100)
    private String carrierName;

    @Column(name = "origin_id", nullable = false, length = 20)
    private Long originId;

    @Column(name = "origin_name", nullable = false, length = 100)
    private String originName;

    @Column(name = "destination_id", nullable = false, length = 20)
    private Long destinationId;

    @Column(name = "destination_name", nullable = false, length = 100)
    private String destinationName;

    @Column(name = "service", length = 30)
    private String service;

    @Column(name = "vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "vessel_name", length = 20)
    private String vesselName;

    /* Same as voyage number */
    @Column(name = "route_no", length = 20)
    private String routeNo;

    @Column(name = "load_port_cutoff_date")
    private Date loadPortCutoffDate;

    @Column(name = "load_port_cutoff_time")
    private String loadPortCutoffTime;

    @Column(name = "etd", length = 100)
    private Date etd;

    @Column(name = "eta", length = 100)
    private Date eta;

    @Column(name = "imo_number", length = 100)
    private String imoNumber;

    @Column(name = "cfs_id", length = 20)
    private Long cfsId;

    @Column(name = "cfs_name", length = 100)
    private String cfsName;

    @Column(name = "cfs_cut_off_date")
    private Date cfsCutOffDate;

    @Column(name = "cfs_cut_off_time")
    private String cfsCutOffTime;

    /* customer master */
    @Column(name = "co_Loader_id", length = 20)
    private Long coLoaderId;

    @Column(name = "co_loader_name", length = 100)
    private String coLoaderName;

    @Column(name = "rotation_number", length = 20)
    private String rotationNumber;

    @Column(name = "rotation_date")
    private Date rotationDate;

    @Column(name = "via_number", length = 20)
    private String viaNumber;

    @Column(name = "division_id", length = 20)
    private Long divisionId;

    @Column(name = "division_name", length = 100)
    private String divisionName;

    @Column(name = "note", length = 500)
    private String note;

    @Column(name = "schedule_mode", length = 20)
    private String scheduleMode;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", length = 20)
    private SailingScheduleStatus status;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id")
    private Long groupCompanyId;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "branch_id")
    private Long branchId;

    @OneToOne(mappedBy = "sailingScheduleDetails", cascade = CascadeType.ALL)
    private CarrierBookingDetails carrierBookingDetails;

    @OneToMany( fetch = FetchType.EAGER, mappedBy = "headerDetails", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SailingScheduleConnectionDetails> connectionDetails = new ArrayList();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "headerDetails", cascade = CascadeType.ALL)
    private List<SailingScheduleMappedShipments> scheduleMappedShipments = new ArrayList();

}
