package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReferenceDetail is a Querydsl query type for ReferenceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReferenceDetail extends EntityPathBase<ReferenceDetail> {

    private static final long serialVersionUID = 808506317L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReferenceDetail referenceDetail = new QReferenceDetail("referenceDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final StringPath notes = createString("notes");

    public final StringPath referenceMode = createString("referenceMode");

    public final StringPath referenceNo = createString("referenceNo");

    public final NumberPath<Long> referenceTypeId = createNumber("referenceTypeId", Long.class);

    public final StringPath referenceTypeName = createString("referenceTypeName");

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QReferenceDetail(String variable) {
        this(ReferenceDetail.class, forVariable(variable), INITS);
    }

    public QReferenceDetail(Path<? extends ReferenceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReferenceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReferenceDetail(PathMetadata metadata, PathInits inits) {
        this(ReferenceDetail.class, metadata, inits);
    }

    public QReferenceDetail(Class<? extends ReferenceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

