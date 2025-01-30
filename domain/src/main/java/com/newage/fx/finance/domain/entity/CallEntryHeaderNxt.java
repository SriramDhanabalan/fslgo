package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "call_entry_header")
public class CallEntryHeaderNxt extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Version
    @Column(name = "version")
    private Long version;

    @NotNull
    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @NotNull
    @Column(name = "call_entry_uid", length = 100, nullable = false)
    private String callEntryUid;

    @NotNull
    @Column(name = "call_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Accepted values (Scheduled, Completed, Cancelled, Planned)")
    @Column(name = "call_status", length = 100)
    CallEntryStatus status;

    @NotNull
    @Column(name = "customer_id", nullable = false, length = 20)
    private Long customerId;

    @NotNull
    @Column(name = "customer_name", nullable = false, length = 150)
    private String customerName;

    @NotNull
    @Column(name = "salesman_id", nullable = false, length = 20)
    private Long salesmanId;

    @NotNull
    @Column(name = "call_owner_id", nullable = false, length = 20)
    private Long callOwnerId;

    @NotNull
    @Column(name = "call_owner_name", nullable = false, length = 50)
    private String callOwnerName;

    @Column(name = "call_owner_email", nullable = false, length = 100)
    private String callOwnerEmail;

    @NotNull
    @NotEmpty
    @Column(name = "call_no", nullable = false, length = 20)
    private String callNo;

    @NotNull(message = "Accepted Values (PHONE,VISIT)")
    @Column(name = "call_mode", nullable = false, length = 6)
    @Enumerated(EnumType.STRING)
    private CallMode callMode;

    @NotNull(message = "Accepted values (SPANCO(Suspect, Prospect, Analysis, Negotiation, Conclusion, Order))")
    @Column(name = "call_type", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private CallType callType;

    @NotNull
    @Column(name = "call_note", nullable = false)
    private String callNote;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "location_name")
    private String locationName;

    @Column(name = "status_reason", length = 100)
    private String statusReason;

    @NotNull(message = "Accepted values (OCEAN,AIR,LAND,MULTI)")
    @Column(name = "routed", nullable = false)
    @Enumerated(EnumType.STRING)
    private CallEntryRouted routed;

    @NotNull(message = "Accepted values (LCL, FCL,AIR, LTL, FTL, SEAAIR)")
    @Column(name = "routed_by_id", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoutedService routedById;

    @NotNull(message = "Accepted values (IMPORT, EXPORT, CROSSTRADE)")
    @Column(name = "shipment_transport_mode_id", nullable = false)
    @Enumerated(EnumType.STRING)
    private ShipmentTransportMode shipmentTransportId;

    @NotNull
    @Column(name = "shipment_service_id", nullable = false)
    private Long serviceId;

    @NotNull
    @Column(name = "shipment_trade_id", nullable = false)
    private Long tradeId;

    @NotNull
    @Column(name = "origin_id", nullable = false)
    private Long originId;

    @NotNull(message = "Accepted values ( Prepaid,CollectT)")
    @Column(name = "destination_id", nullable = false)
    @Enumerated(EnumType.STRING)
    private Freight destinationId;

    @NotNull(message = "Accepted values (MANUAL, AUTO)")
    @Column(name = "tos_id", nullable = false)
    @Enumerated(EnumType.STRING)
    private TosStatus tosId;

    @NotNull(message = "Accepted values (TRADE, SERVICE)")
    @Column(name = "freight_term", nullable = false)
    @Enumerated(EnumType.STRING)
    private CreationType freightTerm;

    @NotNull(message = "Accepted values (FF, NVO, WMS)")
    @Column(name = "creation_mode", nullable = false)
    @Enumerated(EnumType.STRING)
    private CallEntryCreationMode creationMode;

    @Column(name = "creation_type", nullable = false, length = 100)
    private String creationType;

    @NotNull
    @Column(name = "division_id", nullable = false)
    private Long divisionId;

    @NotNull
    @Column(name = "notes", nullable = false)
    private String notes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "schedule_date")
    private Date scheduleFollowUpDate;

    @Column(name = "call_completed_date", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private  Date callCompletedDate;

    @OneToMany(mappedBy = "callEntryHeader", cascade = CascadeType.ALL)
    private List<AttachmentDetail> callEntryAttachmentDetail = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "callEntryHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CallEntryAttendieesNxt> customerContactDetailList = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "callEntryHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CallEntryFollowupJointCallNxt> jointCallInfoList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "callEntryHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CallEntryQuestionnairesNxt> questionnaireList = new ArrayList<>();

    @OneToOne(mappedBy = "callEntryHeader", cascade = CascadeType.ALL)
    private CallEntryFollowUpNxt callEntryFollowUpNxt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "callEntryHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CallEntryCompetitorDetailsNxt> competitorList = new ArrayList<>();

    @OneToOne( fetch = FetchType.LAZY,mappedBy = "callEntry", cascade = CascadeType.ALL)
    private CallEntryNxtToEfsPosting callEntryNxtToEfsPosting;

    @OneToMany(mappedBy = "callEntryHeader",cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<CallEntryFollowUpLogHistory> callEntryFollowUpLogHistories;

    @Column(name = "call_time")
    private String time;

    @Column(name = "call_started_date")
    private Date callStartDate;

    public void setCustomerContactDetailList(List<CallEntryAttendieesNxt> customerContactDetailList) {
        this.customerContactDetailList.clear();
        this.customerContactDetailList.addAll(customerContactDetailList);
    }

    public void setCompetitorList(List<CallEntryCompetitorDetailsNxt> competitorList) {
        this.competitorList.clear();
        this.competitorList.addAll(competitorList);
    }

}
