package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.Configuration.CustomValidationMarkerInterface;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;

import com.querydsl.core.annotations.QueryInit;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_header")
public class ShipmentHeader extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "shipment_uid", length = 100,nullable = false)
    private String shipmentUid;

    @Column(name = "shipment_date", nullable = false)
    private Date shipmentDate;

    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ShipmentStatus status;

    @Column(name = "customer_id", length = 100,nullable = false)
    private Long customerId;

    @Column(name = "customer_name", length = 20)
    private String customerName;

    @Column(name = "routed", nullable = true, length = 5)
    @Enumerated(EnumType.STRING)
    private Routed routed;

    @Column(name = "routed_by_id", length = 20)
    private Long routedById;

    @Column(name = "shipment_transport_mode_id", length = 20)
    private TransportMode serviceCode;

    @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "service_type", length = 20)
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "shipment_trade_id", nullable = false, length = 20)
    private ImportExport tradeCode;

    /* Origin Port Id */

    @Column(name = "origin_id", length = 20)
    private Long originId;

    @Column(name = "origin_name", length = 20)
    private String originName;

    /* destination Port Id */

    @Column(name = "destination_id", nullable = false, length = 20)
    private Long destinationId;

    @Column(name = "destination_name", length = 20)
    private String destinationName;

    /* Term of shipment Id */
    @Column(name = "tos_id", nullable = false, length = 20)
    private Long tosId;

    @Column(name = "tos_name", nullable = false, length = 20)
    private String tosName;

    @Column(name = "freight_term", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private Freight freight;

    @Column(name = "creation_mode", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private ShipmentCreationMode creationMode;

    @Column(name = "business_type", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private ServiceType businessType;

    @Column(name = "direct", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private YesNo direct;

    @Column(name = "division_id", nullable = false, length = 7)
    private Long divisionId;

//  future use - type of shipments identification
    @Column(name = "shipment_type", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;

    @Column(name = "note")
//    @Lob
    private String notes;

    @OneToOne(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private ShipmentAddlDetail addlDetail;

    @Valid
    @OneToOne(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private ShipmentPartyDetail partyDetail;

    @OneToOne(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private ShipmentPickUpDeliveryDetail pickUpDeliveryDetail;

    @Valid
    @OneToOne(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private ShipmentCargoDetail cargoDetail;

    @OneToOne(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private RateRequestModificationHistory rateRequestModificationHistory;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipmentHeader",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ShipmentCommodityDetail> shipmentCommodityDetail;

//    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL,orphanRemoval = true)
//    private List<ShipmentDimensionDetailPlanned> dimensionDetailPlanned;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ShipmentDimensionDetailActual> dimensionDetailActual;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ShipmentRoutingDetail> shipmentRoutingDetails;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipmentHeader",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ShipmentContainerRequest> containerRequests;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipmentHeader",cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderBy("id ASC")
    private List<ShipmentContainerDetail> containerDetail;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<EventDetail> eventDetail;//foreign key not added

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<ReferenceDetail> referenceDetail;//foreign key not added

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<AttachmentDetail> attachmentDetail;//foreign key not added

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<TriggerDetail> triggerDetail;//foreign key not added

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<SignOff> signOff;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<ShipmentRatesDetail> ratesDetails;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<AuthenticatedDocumentDetail> authenticatedDocumentDetails;

    @OneToMany(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    @QueryInit("*.*")
    private List<ShipmentServiceDetail> shipmentServices = new ArrayList<>();

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private CarrierBookingDetails carrierBookingDetails;

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private TransportDocumentAir transportDocumentAir;

    @Valid
    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private TransportDocumentOcean transportDocumentOcean;

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private CustomHouseDetails customHouseDetails;

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private GeneralInfoAesCustomDetails generalInfoAesCustomDetails;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    private List<BillOfEntryDetails> billOfEntryDetails;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<ShipmentChargeHistory> shipmentChargeHistories;

    @OneToMany(mappedBy = "shipmentHeader",cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<SignOffAndUnSignOffLogHistory> signOffAndUnSignOffLogHistories;

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private NxtToEfsServiceMasterEntity nxtToEfsServiceMasterEntity;

    @OneToOne(mappedBy = "shipmentHeader", cascade = CascadeType.ALL)
    private NxtToEfsFinanceIntegration nxtToEfsFinanceIntegration;

    @ManyToOne
    @JoinColumn(name = "customer_code",referencedColumnName = "customer_code", foreignKey = @ForeignKey(name = "FK_WEB_USER_DETAILS_ID"))
    public WebUserDetail webUserDetail;

    @Version
    @Column(name = "version")
    private Long version;



}