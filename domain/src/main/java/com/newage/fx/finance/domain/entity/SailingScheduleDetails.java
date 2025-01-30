package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_schedule_details")
public class SailingScheduleDetails extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull
//    @Enumerated(EnumType.STRING)
//    @Column(name = "mode", nullable = false, length = 20)
//    private Mode mode;

    @Column(name = "service", length = 30)
    private String service;

    @Column(name = "origin_id", nullable = false, length = 20)
    private Long originId;

    @Column(name = "origin_name", nullable = false, length = 100)
    @JsonProperty("origin")
    private String originName;

    @Column(name = "origin_code", nullable = false, length = 100)
    @JsonProperty("origin_code")
    private String originCode;

    @Column(name = "origin_cutoff_date", length = 100)
    @JsonProperty("cutoff_date")
    private Date originCutOffDate;

    @Column(name = "origin_cutoff_time", length = 100)
    private String originCutOffTime;

    @Column(name = "est_loading_Date", length = 100)
    private Date estLoadingDate;

    @NotNull
    @Column(name = "port_of_loading_id", nullable = false, length = 20)
    private Long portOfLoadingId;

    @NotNull
    @Column(name = "port_of_loading", nullable = false, length = 20)
    @JsonProperty("pol")
    private String portOfLoading;

    @NotNull
    @Column(name = "port_of_name", nullable = false, length = 20)
    @JsonProperty("pol_name")
    private String portName;

    @NotNull
    @Column(name = "etd", nullable = false, length = 100)
    @JsonProperty("ETD")
    private Date etd;

    @NotNull
    @Column(name = "port_of_discharge_id", nullable = false, length = 20)
    private Long portOfDischargeId;

    @NotNull
    @Column(name = "port_of_discharge", nullable = false, length = 20)
    @JsonProperty("pod_name")
    private String portOfdischarge;

//    @NotNull
//    @Column(name = "port_of_discharge", nullable = false, length = 20)
//    @JsonProperty("pod")
//    private String pod ;

    @Column(name = "destination_id", nullable = false, length = 20)
    private Long destinationId;

    @Column(name = "destination_name", nullable = false, length = 100)
    @JsonProperty("designation")
    private String destinationName;

    @Column(name = "destination_code", nullable = false, length = 100)
    @JsonProperty("destination_code")
    private String destinationCode;

    @NotNull
    @Column(name = "eta", nullable = false, length = 100)
    @JsonProperty("ETA")
    private Date eta;

    @NotNull
    @Column(name = "carrier_id", nullable = false, length = 20)
    private Long carrierId;

    @NotNull
    @Column(name = "carrier_name", nullable = false, length = 100)
    private String carrierName;

    @Column(name = "cfs_id", length = 20)
    private Long cfsId;

    @Column(name = "cfs_name", length = 100)
    private String cfsName;

    @Column(name = "co_Loader_id", length = 20)
    private Long coLoaderId;

    @Column(name = "co_loader_name", length = 100)
    private String coLoaderName;

    @Column(name = "transit_LRD_to_port", length = 3)
    @JsonProperty("ttlrd")
    private String transitLrdToPort;

    @Column(name = "transit_port_to_port", length = 3)
    @JsonProperty("ttport")
    private String transitPortToPort;

    @Enumerated(EnumType.STRING)
    @Column(name = "sailing_Schedule_Status", length = 20)
    private SailingScheduleStatus sailingScheduleStatus;

    @Column(name = "note", length = 500)
    private String note;

    @NotNull
    @Column(name = "schedule_id", nullable = false, length = 20)
    private String scheduleId;

    @Column(name = "division_id", length = 20)
    private Long divisionId;

    @Column(name = "division_name", length = 100)
    private String divisionName;

    @Column(name = "aes_cut_off_date", length = 100)
    private Date aesCutOffDate;

    @Column(name = "aes_cut_off_time", length = 100)
    private String aesCutOffTime;

    @Column(name = "imo_number", length = 100)
    private String imoNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "cfs_cut_off_date_time")
    private Date cfsCutOffDateTime;

    @Column(name = "vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "vessel_name", length = 20)
    private String vesselName;

    @Column(name = "voyage_number", length = 20)
    @JsonProperty("voyage_no")
    private String voyageNumber;

    @Column(name = "rotation_number", length = 20)
    private String rotationNumber;

    @Column(name = "rotation_date")
    private Date rotationDate;

    @Column(name = "via_number", length = 20)
    private String viaNumber;

    @Column(name = "group_company_id")
    private Long groupCompanyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vessel_details_id", nullable = false, foreignKey = @ForeignKey(name = "FK_VESSEL_DETAILS_ID"))
    public SailingScheduleVesselDetails sailingScheduleVesselDetails;

   @OneToMany(fetch = FetchType.LAZY, mappedBy = "sailingScheduleDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SailingScheduleRoutings> sailingScheduleRoutings = new ArrayList();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sailingScheduleDetails", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SailingScheduleEvents> sailingScheduleEvents = new ArrayList();

    @OneToOne(mappedBy = "sailingScheduleDetails", cascade = CascadeType.ALL)
    private CarrierBookingDetails carrierBookingDetails;

    @Version
    @Column(name = "version")
    private Long version;


}
