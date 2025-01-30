package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterCarrier is a Querydsl query type for MasterCarrier
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterCarrier extends EntityPathBase<MasterCarrier> {

    private static final long serialVersionUID = -1838707001L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterCarrier masterCarrier = new QMasterCarrier("masterCarrier");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final DateTimePath<java.util.Date> carrierBookingDate = createDateTime("carrierBookingDate", java.util.Date.class);

    public final StringPath carrierBookingNo = createString("carrierBookingNo");

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> masterDate = createDateTime("masterDate", java.util.Date.class);

    public final NumberPath<Long> masterDoNo = createNumber("masterDoNo", Long.class);

    public final QMasterHeader masterHeader;

    public final StringPath masterNo = createString("masterNo");

    public final StringPath notes = createString("notes");

    public final StringPath routeNo = createString("routeNo");

    public final NumberPath<Long> sailId = createNumber("sailId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public QMasterCarrier(String variable) {
        this(MasterCarrier.class, forVariable(variable), INITS);
    }

    public QMasterCarrier(Path<? extends MasterCarrier> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterCarrier(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterCarrier(PathMetadata metadata, PathInits inits) {
        this(MasterCarrier.class, metadata, inits);
    }

    public QMasterCarrier(Class<? extends MasterCarrier> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

