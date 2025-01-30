package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAuthenticatedDocumentDetail is a Querydsl query type for AuthenticatedDocumentDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAuthenticatedDocumentDetail extends EntityPathBase<AuthenticatedDocumentDetail> {

    private static final long serialVersionUID = -1880368596L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAuthenticatedDocumentDetail authenticatedDocumentDetail = new QAuthenticatedDocumentDetail("authenticatedDocumentDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableUnit = createNumber("chargeableUnit", Double.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final StringPath consigneeName = createString("consigneeName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final DateTimePath<java.util.Date> documentDate = createDateTime("documentDate", java.util.Date.class);

    public final StringPath documentNo = createString("documentNo");

    public final NumberPath<Long> forwarderId = createNumber("forwarderId", Long.class);

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPiece = createNumber("noOfPiece", Integer.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> notifyOneId = createNumber("notifyOneId", Long.class);

    public final NumberPath<Long> notifyTwoId = createNumber("notifyTwoId", Long.class);

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public final StringPath shipperName = createString("shipperName");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeIncbm = createNumber("volumeIncbm", Double.class);

    public final NumberPath<Double> volumeIncbt = createNumber("volumeIncbt", Double.class);

    public final NumberPath<Double> volumeWeight = createNumber("volumeWeight", Double.class);

    public QAuthenticatedDocumentDetail(String variable) {
        this(AuthenticatedDocumentDetail.class, forVariable(variable), INITS);
    }

    public QAuthenticatedDocumentDetail(Path<? extends AuthenticatedDocumentDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAuthenticatedDocumentDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAuthenticatedDocumentDetail(PathMetadata metadata, PathInits inits) {
        this(AuthenticatedDocumentDetail.class, metadata, inits);
    }

    public QAuthenticatedDocumentDetail(Class<? extends AuthenticatedDocumentDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

