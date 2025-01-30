package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceMasterShipmentHeader is a Querydsl query type for ServiceMasterShipmentHeader
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServiceMasterShipmentHeader extends EntityPathBase<ServiceMasterShipmentHeader> {

    private static final long serialVersionUID = -1410311953L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceMasterShipmentHeader serviceMasterShipmentHeader = new QServiceMasterShipmentHeader("serviceMasterShipmentHeader");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> ata = createDateTime("ata", java.util.Date.class);

    public final DateTimePath<java.util.Date> atd = createDateTime("atd", java.util.Date.class);

    public final ListPath<AttachmentDetail, QAttachmentDetail> attachmentDetail = this.<AttachmentDetail, QAttachmentDetail>createList("attachmentDetail", AttachmentDetail.class, QAttachmentDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final ListPath<EventDetail, QEventDetail> eventDetail = this.<EventDetail, QEventDetail>createList("eventDetail", EventDetail.class, QEventDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> masterCompleted = createEnum("masterCompleted", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath masterUid = createString("masterUid");

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final QServiceMasterShipmentPartyDetail partyDetails;

    public final StringPath productCode = createString("productCode");

    public final ListPath<ServiceMasterShipmentRatesDetail, QServiceMasterShipmentRatesDetail> ratesDetails = this.<ServiceMasterShipmentRatesDetail, QServiceMasterShipmentRatesDetail>createList("ratesDetails", ServiceMasterShipmentRatesDetail.class, QServiceMasterShipmentRatesDetail.class, PathInits.DIRECT2);

    public final ListPath<ReferenceDetail, QReferenceDetail> referenceDetail = this.<ReferenceDetail, QReferenceDetail>createList("referenceDetail", ReferenceDetail.class, QReferenceDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> salesmanId = createNumber("salesmanId", Long.class);

    public final StringPath salesmanName = createString("salesmanName");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final ListPath<SignOff, QSignOff> signOffDetail = this.<SignOff, QSignOff>createList("signOffDetail", SignOff.class, QSignOff.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> tradeCode = createEnum("tradeCode", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QServiceMasterShipmentHeader(String variable) {
        this(ServiceMasterShipmentHeader.class, forVariable(variable), INITS);
    }

    public QServiceMasterShipmentHeader(Path<? extends ServiceMasterShipmentHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceMasterShipmentHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceMasterShipmentHeader(PathMetadata metadata, PathInits inits) {
        this(ServiceMasterShipmentHeader.class, metadata, inits);
    }

    public QServiceMasterShipmentHeader(Class<? extends ServiceMasterShipmentHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.partyDetails = inits.isInitialized("partyDetails") ? new QServiceMasterShipmentPartyDetail(forProperty("partyDetails"), inits.get("partyDetails")) : null;
    }

}

