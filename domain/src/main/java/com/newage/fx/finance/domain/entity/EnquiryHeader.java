package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
import com.querydsl.core.types.Predicate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="enquiry_header")
public class EnquiryHeader extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
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

    @Column(name = "shipment_uid", nullable = false, length = 20)
    private String shipmentUid;

    @Column(name = "employee_id", length = 20)
    private Long userEmployeeId;

    @Column(name = "enquiry_uid", length = 100, nullable = true)
    private String enquiryUid;

    @Column(name = "enquiry_no", nullable = false)
    private String enquiryNo;

    @Column(name = "enquiry_date")
    private Date enquiryDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @JsonProperty("filter_month")
    @Column(name = "quote_by_date")
    private Date quoteByDate;

    @NotNull(message = "Accepted Values (Active, Block, Hide)")
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private EnquiryStatus status;

    @Column(name = "customer_id", nullable = true, length = 20)
    private Long customerId;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;


    @Column(name = "salesman_id", nullable = false, length = 20)
    private Long salesmanId;


    @Column(name = "salesman_name", nullable = false, length = 100)
    private String salesmanName;

    @Column(name = "routed", nullable = true, length = 20)
    private Long routed;

    @Column(name = "routed_by_id", nullable = true, length = 20)
    private Long routeBydId;

    @Column(name = "creation_mode", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private CreationMode creationMode;

    @Column(name = "creation_type", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private CreationType creationType;

    @Column(name = "division_id", nullable = true, length = 20)
    private Long divisionId;



    @Column(name = "notes")
    private String notes;

    @Column(name = "reason_id", nullable = true, length = 20)
    private Long reasonId;

    @Column(name = "remark", nullable = true, length = 2000)
    private String remark;

    //CRT
    @Column(name = "contact_no")
    private Long contactNo;

    @Column(name = "enquiry_type", nullable = true, length = 10)
    @Enumerated(EnumType.STRING)
    private EnquiryType enquiryType;

    @Column(name = "rate_request_modification")
    @Enumerated(EnumType.STRING)
    private YesNo rateRequestModification;



    @Column(name = "rate_request_created", nullable = true, length = 10)
    @Enumerated(EnumType.STRING)
    private YesNo rateRequestCreated;

    //Sailing Schedule
    @Column(name = "planned_schedule_id", length = 20)
    private Long plannedScheduleId;


    @OneToOne(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    EnquiryAddlDetail enquiryAddlDetail;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    EnquiryServiceDetail serviceDetail;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    EnquiryServiceAddlDetail enquiryServiceAddlDetail;

    @OneToOne(fetch = FetchType.EAGER, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    EnquirySpotQuotationNew spotQuotation;

//    @OneToMany(mappedBy = "enquiryDetail",cascade = CascadeType.ALL)
//    private List<TriggerDetail> triggerDetail;//foreign key not added

//    @OneToMany(mappedBy = "enquiryDetail",cascade = CascadeType.ALL)
//    private List<EventDetail> eventDetail;//foreign key not added

//    @OneToMany(mappedBy = "enquiryDetail",cascade = CascadeType.ALL)
//    private List<ReferenceDetail> referenceDetail;//foreign key not added

//    @OneToOne(mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
//    EnquiryPartyDetail enquiryPartyDetail;

    //@OneToOne(mappedBy = "enquiryDetail", cascade = CascadeType.MERGE)
//    EnquiryPickupDeliveryDetail pickupDeliveryDetail;xml


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<EnquiryNewValueAddedServiceDetails> valueAddedServiceDetail;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL,orphanRemoval = true)
    @OrderBy("id ASC")
    private Set<EnquiryNewContainerDetails> enquiryNewContainerDetails = new LinkedHashSet<>();

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    EnquiryCargoDetail cargoDetail;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "enquiryDetail",cascade = CascadeType.ALL,orphanRemoval = true)
    EnquirySpotRatesMapping enquirySpotRatesMapping;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<EnquiryDimensionDetail> dimensionDetail = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<AttachmentDetail> attachmentDetail;

    @OneToMany(mappedBy = "enquiryDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    Set<SpotQuotationRejectToResubmitLogHistory> spotQuotationRejectToResubmitLogHistories;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "enquiryHeader", cascade = CascadeType.ALL)
    @OrderBy("id DESC")
    List<SpotQuotationChargeHistory> spotQuotationChargeHistories;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("id ASC")
    List<EnquiryChargeDetailsNew> enquiryChargeDetail;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryDetail", cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    List<CrtTripHeaderDetails> crtTripHeaderDetails = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    public DirectRateRequestHeader directRateRequestHeader;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enquiryHeader", cascade = CascadeType.ALL)
    List<EnquiryRoutingDetail> enquiryRoutingDetails = new ArrayList<>();

/*
    @OneToMany(mappedBy = "enquiryDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    List<EnquiryVehicleTypeDetails> enquiryVehicleTypeDetails;*/



//    public void setAttachmentDetail(List<AttachmentDetail> attachmentDetail) {
//        this.attachmentDetail.clear();
//        this.attachmentDetail.addAll(attachmentDetail);
//    }
}
