package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
import com.querydsl.core.annotations.QueryInit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_header")
public class MasterHeader extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "master_uid", length = 100, nullable = false)
    private String masterUid;

    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ShipmentMasterStatus status;

    @Column(name = "transport_mode_id", length = 20)
    private TransportMode transportMode;

    @Column(name = "trade_id", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ImportExport tradeCode;

    @Column(name = "service_type", length = 20)
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "origin_id",  nullable = false)
    private Long originId;

    @Column(name = "origin_name", nullable = false)
    private String originName;

    @Column(name = "destination_id", nullable = false)
    private Long destinationId;

    @Column(name = "destination_name", nullable = false)
    private String destinationName;

    @Column(name = "etd", nullable = true)
    private Date etd;

    @Column(name = "eta", nullable = true)
    private Date eta;

    @Column(name = "atd", nullable = true)
    private Date atd;

    @Column(name = "ata", nullable = true)
    private Date ata;

    @Column(name = "container_track", nullable = true)
    @Enumerated(EnumType.STRING)
    private YesNo containerTrack = YesNo.No;

    @Column(name = "master_term", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private Freight freight;

    @Column(name = "creation_mode", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private ShipmentCreationMode creationMode;

    @Column(name = "business_type", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private ServiceType businessType;

    @Column(name = "division_id", nullable = false, length = 7)
    private Long divisionId;

    @Column(name = "service", length = 30)
    private String service;

    @Column(name = "efs_jobno")
    private String efsJobno;

    @Column(name = "efs_job_status")
    private String efsJobStatus;

    @Column(name = "efs_segment_code")
    private String efsSegmentCode;

    @Column(name = "flag_insert_update")
    private String InsertUpdate;

    @Column(name = "nxt_toefs_id")
    private Long nxToefsId;

    @Column(name = "transit_ref_no")
    private String transitRefNo;

    @Column(name = "notes")
    private String notes;

    @Column(name = "service_code")
    private String serviceCode;

    @Valid
    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterAddlDetail masterAddlDetail;

    @Valid
    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterCarrier masterCarrierInfo;

    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    @QueryInit("*.*")
    private List<MasterServiceDetail> masterServices = new ArrayList<>();

    @Valid
    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MasterDimensionDetail> masterDimensionDetails = new ArrayList<>();

    @Valid
    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterCargoDetail cargoDetail;

    @Valid
    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MasterRoutingDetail> masterRoutingDetails = new ArrayList<>();

    @Valid
    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MasterRatesDetail> masterRatesDetails;

    @Valid
    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterPartyDetail masterPartyDetail;

    //vehicle details also will be also stored in same container table
    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MasterContainerDetail> masterContainerDetail;

//    need to be implemented
//    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL)
//    private List<MasterServicePortDetail> masterServicePortDetails;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterServiceCustomsDetail masterServiceCustomsDetail;

    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private List<EventDetail> eventDetail;//foreign key not added

    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private List<ReferenceDetail> referenceDetail;//foreign key not added

    @OneToMany(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private List<AttachmentDetail> attachmentDetail;//foreign key not added

    @OneToMany(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private List<SignOff> signOff;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private CustomEdiDetails customEdiDetails;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private CustomMasterBlDetails customBlDetails;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterTransportDocumentAir masterTransportDocumentAir;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private MasterTransportDocumentOcean masterTransportDocumentOcean;

    @OneToOne(mappedBy = "masterHeader", cascade = CascadeType.ALL)
    private NxtToEfsFinanceIntegration nxtToEfsFinanceIntegration;

    @OneToMany(mappedBy = "masterHeader",cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<MasterSignOffUnsignOffLogHistory> signOffAndUnSignOffLogHistories;

    @Version
    @Column(name = "version")
    private Long version;

}