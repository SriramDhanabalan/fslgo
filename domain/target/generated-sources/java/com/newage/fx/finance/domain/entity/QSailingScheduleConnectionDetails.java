package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleConnectionDetails is a Querydsl query type for SailingScheduleConnectionDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleConnectionDetails extends EntityPathBase<SailingScheduleConnectionDetails> {

    private static final long serialVersionUID = 1028162091L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleConnectionDetails sailingScheduleConnectionDetails = new QSailingScheduleConnectionDetails("sailingScheduleConnectionDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final NumberPath<Long> connectionPortId = createNumber("connectionPortId", Long.class);

    public final StringPath connectionPortName = createString("connectionPortName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final QSailingScheduleHeaderDetails headerDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imoNumber = createString("imoNumber");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath rotationNumber = createString("rotationNumber");

    public final StringPath routeNo = createString("routeNo");

    public final StringPath scheduleMode = createString("scheduleMode");

    public final NumberPath<Integer> slNo = createNumber("slNo", Integer.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SailingScheduleStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.SailingScheduleStatus.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath viaNumber = createString("viaNumber");

    public QSailingScheduleConnectionDetails(String variable) {
        this(SailingScheduleConnectionDetails.class, forVariable(variable), INITS);
    }

    public QSailingScheduleConnectionDetails(Path<? extends SailingScheduleConnectionDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleConnectionDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleConnectionDetails(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleConnectionDetails.class, metadata, inits);
    }

    public QSailingScheduleConnectionDetails(Class<? extends SailingScheduleConnectionDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QSailingScheduleHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
    }

}

