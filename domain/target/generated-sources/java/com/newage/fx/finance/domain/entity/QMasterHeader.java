package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterHeader is a Querydsl query type for MasterHeader
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterHeader extends EntityPathBase<MasterHeader> {

    private static final long serialVersionUID = -190087970L;

    private static final PathInits INITS = new PathInits("*", "masterServices.*.*");

    public static final QMasterHeader masterHeader = new QMasterHeader("masterHeader");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> ata = createDateTime("ata", java.util.Date.class);

    public final DateTimePath<java.util.Date> atd = createDateTime("atd", java.util.Date.class);

    public final ListPath<AttachmentDetail, QAttachmentDetail> attachmentDetail = this.<AttachmentDetail, QAttachmentDetail>createList("attachmentDetail", AttachmentDetail.class, QAttachmentDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceType> businessType = createEnum("businessType", com.newage.fx.finance.domain.enums.ServiceType.class);

    public final QMasterCargoDetail cargoDetail;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> containerTrack = createEnum("containerTrack", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentCreationMode> creationMode = createEnum("creationMode", com.newage.fx.finance.domain.enums.ShipmentCreationMode.class);

    public final QCustomMasterBlDetails customBlDetails;

    public final QCustomEdiDetails customEdiDetails;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final StringPath efsJobno = createString("efsJobno");

    public final StringPath efsJobStatus = createString("efsJobStatus");

    public final StringPath efsSegmentCode = createString("efsSegmentCode");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final ListPath<EventDetail, QEventDetail> eventDetail = this.<EventDetail, QEventDetail>createList("eventDetail", EventDetail.class, QEventDetail.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> freight = createEnum("freight", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath InsertUpdate = createString("InsertUpdate");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterAddlDetail masterAddlDetail;

    public final QMasterCarrier masterCarrierInfo;

    public final QMasterContainerDetail masterContainerDetail;

    public final ListPath<MasterDimensionDetail, QMasterDimensionDetail> masterDimensionDetails = this.<MasterDimensionDetail, QMasterDimensionDetail>createList("masterDimensionDetails", MasterDimensionDetail.class, QMasterDimensionDetail.class, PathInits.DIRECT2);

    public final QMasterPartyDetail masterPartyDetail;

    public final ListPath<MasterRatesDetail, QMasterRatesDetail> masterRatesDetails = this.<MasterRatesDetail, QMasterRatesDetail>createList("masterRatesDetails", MasterRatesDetail.class, QMasterRatesDetail.class, PathInits.DIRECT2);

    public final ListPath<MasterRoutingDetail, QMasterRoutingDetail> masterRoutingDetails = this.<MasterRoutingDetail, QMasterRoutingDetail>createList("masterRoutingDetails", MasterRoutingDetail.class, QMasterRoutingDetail.class, PathInits.DIRECT2);

    public final QMasterServiceCustomsDetail masterServiceCustomsDetail;

    public final ListPath<MasterServiceDetail, QMasterServiceDetail> masterServices = this.<MasterServiceDetail, QMasterServiceDetail>createList("masterServices", MasterServiceDetail.class, QMasterServiceDetail.class, INITS.get("masterServices"));

    public final QMasterTransportDocumentAir masterTransportDocumentAir;

    public final QMasterTransportDocumentOcean masterTransportDocumentOcean;

    public final StringPath masterUid = createString("masterUid");

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> nxToefsId = createNumber("nxToefsId", Long.class);

    public final QNxtToEfsFinanceIntegration nxtToEfsFinanceIntegration;

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final ListPath<ReferenceDetail, QReferenceDetail> referenceDetail = this.<ReferenceDetail, QReferenceDetail>createList("referenceDetail", ReferenceDetail.class, QReferenceDetail.class, PathInits.DIRECT2);

    public final StringPath service = createString("service");

    public final StringPath serviceCode = createString("serviceCode");

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final ListPath<SignOff, QSignOff> signOff = this.<SignOff, QSignOff>createList("signOff", SignOff.class, QSignOff.class, PathInits.DIRECT2);

    public final ListPath<MasterSignOffUnsignOffLogHistory, QMasterSignOffUnsignOffLogHistory> signOffAndUnSignOffLogHistories = this.<MasterSignOffUnsignOffLogHistory, QMasterSignOffUnsignOffLogHistory>createList("signOffAndUnSignOffLogHistories", MasterSignOffUnsignOffLogHistory.class, QMasterSignOffUnsignOffLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentMasterStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.ShipmentMasterStatus.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> tradeCode = createEnum("tradeCode", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final StringPath transitRefNo = createString("transitRefNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> transportMode = createEnum("transportMode", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterHeader(String variable) {
        this(MasterHeader.class, forVariable(variable), INITS);
    }

    public QMasterHeader(Path<? extends MasterHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterHeader(PathMetadata metadata, PathInits inits) {
        this(MasterHeader.class, metadata, inits);
    }

    public QMasterHeader(Class<? extends MasterHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetail = inits.isInitialized("cargoDetail") ? new QMasterCargoDetail(forProperty("cargoDetail"), inits.get("cargoDetail")) : null;
        this.customBlDetails = inits.isInitialized("customBlDetails") ? new QCustomMasterBlDetails(forProperty("customBlDetails"), inits.get("customBlDetails")) : null;
        this.customEdiDetails = inits.isInitialized("customEdiDetails") ? new QCustomEdiDetails(forProperty("customEdiDetails"), inits.get("customEdiDetails")) : null;
        this.masterAddlDetail = inits.isInitialized("masterAddlDetail") ? new QMasterAddlDetail(forProperty("masterAddlDetail"), inits.get("masterAddlDetail")) : null;
        this.masterCarrierInfo = inits.isInitialized("masterCarrierInfo") ? new QMasterCarrier(forProperty("masterCarrierInfo"), inits.get("masterCarrierInfo")) : null;
        this.masterContainerDetail = inits.isInitialized("masterContainerDetail") ? new QMasterContainerDetail(forProperty("masterContainerDetail"), inits.get("masterContainerDetail")) : null;
        this.masterPartyDetail = inits.isInitialized("masterPartyDetail") ? new QMasterPartyDetail(forProperty("masterPartyDetail"), inits.get("masterPartyDetail")) : null;
        this.masterServiceCustomsDetail = inits.isInitialized("masterServiceCustomsDetail") ? new QMasterServiceCustomsDetail(forProperty("masterServiceCustomsDetail"), inits.get("masterServiceCustomsDetail")) : null;
        this.masterTransportDocumentAir = inits.isInitialized("masterTransportDocumentAir") ? new QMasterTransportDocumentAir(forProperty("masterTransportDocumentAir"), inits.get("masterTransportDocumentAir")) : null;
        this.masterTransportDocumentOcean = inits.isInitialized("masterTransportDocumentOcean") ? new QMasterTransportDocumentOcean(forProperty("masterTransportDocumentOcean"), inits.get("masterTransportDocumentOcean")) : null;
        this.nxtToEfsFinanceIntegration = inits.isInitialized("nxtToEfsFinanceIntegration") ? new QNxtToEfsFinanceIntegration(forProperty("nxtToEfsFinanceIntegration"), inits.get("nxtToEfsFinanceIntegration")) : null;
    }

}

