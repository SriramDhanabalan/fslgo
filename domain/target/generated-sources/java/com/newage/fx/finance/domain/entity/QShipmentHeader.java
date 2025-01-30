package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentHeader is a Querydsl query type for ShipmentHeader
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentHeader extends EntityPathBase<ShipmentHeader> {

    private static final long serialVersionUID = 488858198L;

    private static final PathInits INITS = new PathInits("*", "shipmentServices.*.*");

    public static final QShipmentHeader shipmentHeader = new QShipmentHeader("shipmentHeader");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QShipmentAddlDetail addlDetail;

    public final ListPath<AttachmentDetail, QAttachmentDetail> attachmentDetail = this.<AttachmentDetail, QAttachmentDetail>createList("attachmentDetail", AttachmentDetail.class, QAttachmentDetail.class, PathInits.DIRECT2);

    public final ListPath<AuthenticatedDocumentDetail, QAuthenticatedDocumentDetail> authenticatedDocumentDetails = this.<AuthenticatedDocumentDetail, QAuthenticatedDocumentDetail>createList("authenticatedDocumentDetails", AuthenticatedDocumentDetail.class, QAuthenticatedDocumentDetail.class, PathInits.DIRECT2);

    public final ListPath<BillOfEntryDetails, QBillOfEntryDetails> billOfEntryDetails = this.<BillOfEntryDetails, QBillOfEntryDetails>createList("billOfEntryDetails", BillOfEntryDetails.class, QBillOfEntryDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceType> businessType = createEnum("businessType", com.newage.fx.finance.domain.enums.ServiceType.class);

    public final QShipmentCargoDetail cargoDetail;

    public final QCarrierBookingDetails carrierBookingDetails;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final ListPath<ShipmentContainerDetail, QShipmentContainerDetail> containerDetail = this.<ShipmentContainerDetail, QShipmentContainerDetail>createList("containerDetail", ShipmentContainerDetail.class, QShipmentContainerDetail.class, PathInits.DIRECT2);

    public final ListPath<ShipmentContainerRequest, QShipmentContainerRequest> containerRequests = this.<ShipmentContainerRequest, QShipmentContainerRequest>createList("containerRequests", ShipmentContainerRequest.class, QShipmentContainerRequest.class, PathInits.DIRECT2);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentCreationMode> creationMode = createEnum("creationMode", com.newage.fx.finance.domain.enums.ShipmentCreationMode.class);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final QCustomHouseDetails customHouseDetails;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final ListPath<ShipmentDimensionDetailActual, QShipmentDimensionDetailActual> dimensionDetailActual = this.<ShipmentDimensionDetailActual, QShipmentDimensionDetailActual>createList("dimensionDetailActual", ShipmentDimensionDetailActual.class, QShipmentDimensionDetailActual.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> direct = createEnum("direct", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final ListPath<EventDetail, QEventDetail> eventDetail = this.<EventDetail, QEventDetail>createList("eventDetail", EventDetail.class, QEventDetail.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> freight = createEnum("freight", com.newage.fx.finance.domain.enums.Freight.class);

    public final QGeneralInfoAesCustomDetails generalInfoAesCustomDetails;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final QNxtToEfsFinanceIntegration nxtToEfsFinanceIntegration;

    public final QNxtToEfsServiceMasterEntity nxtToEfsServiceMasterEntity;

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final QShipmentPartyDetail partyDetail;

    public final QShipmentPickUpDeliveryDetail pickUpDeliveryDetail;

    public final QRateRequestModificationHistory rateRequestModificationHistory;

    public final ListPath<ShipmentRatesDetail, QShipmentRatesDetail> ratesDetails = this.<ShipmentRatesDetail, QShipmentRatesDetail>createList("ratesDetails", ShipmentRatesDetail.class, QShipmentRatesDetail.class, PathInits.DIRECT2);

    public final ListPath<ReferenceDetail, QReferenceDetail> referenceDetail = this.<ReferenceDetail, QReferenceDetail>createList("referenceDetail", ReferenceDetail.class, QReferenceDetail.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.Routed> routed = createEnum("routed", com.newage.fx.finance.domain.enums.Routed.class);

    public final NumberPath<Long> routedById = createNumber("routedById", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> serviceCode = createEnum("serviceCode", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final ListPath<ShipmentChargeHistory, QShipmentChargeHistory> shipmentChargeHistories = this.<ShipmentChargeHistory, QShipmentChargeHistory>createList("shipmentChargeHistories", ShipmentChargeHistory.class, QShipmentChargeHistory.class, PathInits.DIRECT2);

    public final ListPath<ShipmentCommodityDetail, QShipmentCommodityDetail> shipmentCommodityDetail = this.<ShipmentCommodityDetail, QShipmentCommodityDetail>createList("shipmentCommodityDetail", ShipmentCommodityDetail.class, QShipmentCommodityDetail.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> shipmentDate = createDateTime("shipmentDate", java.util.Date.class);

    public final ListPath<ShipmentRoutingDetail, QShipmentRoutingDetail> shipmentRoutingDetails = this.<ShipmentRoutingDetail, QShipmentRoutingDetail>createList("shipmentRoutingDetails", ShipmentRoutingDetail.class, QShipmentRoutingDetail.class, PathInits.DIRECT2);

    public final ListPath<ShipmentServiceDetail, QShipmentServiceDetail> shipmentServices = this.<ShipmentServiceDetail, QShipmentServiceDetail>createList("shipmentServices", ShipmentServiceDetail.class, QShipmentServiceDetail.class, INITS.get("shipmentServices"));

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentType> shipmentType = createEnum("shipmentType", com.newage.fx.finance.domain.enums.ShipmentType.class);

    public final StringPath shipmentUid = createString("shipmentUid");

    public final ListPath<SignOff, QSignOff> signOff = this.<SignOff, QSignOff>createList("signOff", SignOff.class, QSignOff.class, PathInits.DIRECT2);

    public final ListPath<SignOffAndUnSignOffLogHistory, QSignOffAndUnSignOffLogHistory> signOffAndUnSignOffLogHistories = this.<SignOffAndUnSignOffLogHistory, QSignOffAndUnSignOffLogHistory>createList("signOffAndUnSignOffLogHistories", SignOffAndUnSignOffLogHistory.class, QSignOffAndUnSignOffLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.ShipmentStatus.class);

    public final NumberPath<Long> tosId = createNumber("tosId", Long.class);

    public final StringPath tosName = createString("tosName");

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> tradeCode = createEnum("tradeCode", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final QTransportDocumentAir transportDocumentAir;

    public final QTransportDocumentOcean transportDocumentOcean;

    public final ListPath<TriggerDetail, QTriggerDetail> triggerDetail = this.<TriggerDetail, QTriggerDetail>createList("triggerDetail", TriggerDetail.class, QTriggerDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final QWebUserDetail webUserDetail;

    public QShipmentHeader(String variable) {
        this(ShipmentHeader.class, forVariable(variable), INITS);
    }

    public QShipmentHeader(Path<? extends ShipmentHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentHeader(PathMetadata metadata, PathInits inits) {
        this(ShipmentHeader.class, metadata, inits);
    }

    public QShipmentHeader(Class<? extends ShipmentHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.addlDetail = inits.isInitialized("addlDetail") ? new QShipmentAddlDetail(forProperty("addlDetail"), inits.get("addlDetail")) : null;
        this.cargoDetail = inits.isInitialized("cargoDetail") ? new QShipmentCargoDetail(forProperty("cargoDetail"), inits.get("cargoDetail")) : null;
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
        this.customHouseDetails = inits.isInitialized("customHouseDetails") ? new QCustomHouseDetails(forProperty("customHouseDetails"), inits.get("customHouseDetails")) : null;
        this.generalInfoAesCustomDetails = inits.isInitialized("generalInfoAesCustomDetails") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfoAesCustomDetails"), inits.get("generalInfoAesCustomDetails")) : null;
        this.nxtToEfsFinanceIntegration = inits.isInitialized("nxtToEfsFinanceIntegration") ? new QNxtToEfsFinanceIntegration(forProperty("nxtToEfsFinanceIntegration"), inits.get("nxtToEfsFinanceIntegration")) : null;
        this.nxtToEfsServiceMasterEntity = inits.isInitialized("nxtToEfsServiceMasterEntity") ? new QNxtToEfsServiceMasterEntity(forProperty("nxtToEfsServiceMasterEntity"), inits.get("nxtToEfsServiceMasterEntity")) : null;
        this.partyDetail = inits.isInitialized("partyDetail") ? new QShipmentPartyDetail(forProperty("partyDetail"), inits.get("partyDetail")) : null;
        this.pickUpDeliveryDetail = inits.isInitialized("pickUpDeliveryDetail") ? new QShipmentPickUpDeliveryDetail(forProperty("pickUpDeliveryDetail"), inits.get("pickUpDeliveryDetail")) : null;
        this.rateRequestModificationHistory = inits.isInitialized("rateRequestModificationHistory") ? new QRateRequestModificationHistory(forProperty("rateRequestModificationHistory"), inits.get("rateRequestModificationHistory")) : null;
        this.transportDocumentAir = inits.isInitialized("transportDocumentAir") ? new QTransportDocumentAir(forProperty("transportDocumentAir"), inits.get("transportDocumentAir")) : null;
        this.transportDocumentOcean = inits.isInitialized("transportDocumentOcean") ? new QTransportDocumentOcean(forProperty("transportDocumentOcean"), inits.get("transportDocumentOcean")) : null;
        this.webUserDetail = inits.isInitialized("webUserDetail") ? new QWebUserDetail(forProperty("webUserDetail"), inits.get("webUserDetail")) : null;
    }

}

