package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAttachmentDetail is a Querydsl query type for AttachmentDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAttachmentDetail extends EntityPathBase<AttachmentDetail> {

    private static final long serialVersionUID = -1750479581L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAttachmentDetail attachmentDetail = new QAttachmentDetail("attachmentDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath alfrescoNodeId = createString("alfrescoNodeId");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customs = createString("customs");

    public final StringPath documentName = createString("documentName");

    public final StringPath documentRefNo = createString("documentRefNo");

    public final NumberPath<Long> documentTypeId = createNumber("documentTypeId", Long.class);

    public final StringPath documentTypeName = createString("documentTypeName");

    public final QEnquiryHeader enquiryDetail;

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isProtected = createBoolean("isProtected");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final StringPath notes = createString("notes");

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QAttachmentDetail(String variable) {
        this(AttachmentDetail.class, forVariable(variable), INITS);
    }

    public QAttachmentDetail(Path<? extends AttachmentDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAttachmentDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAttachmentDetail(PathMetadata metadata, PathInits inits) {
        this(AttachmentDetail.class, metadata, inits);
    }

    public QAttachmentDetail(Class<? extends AttachmentDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

