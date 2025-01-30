package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleRoutings is a Querydsl query type for SailingScheduleRoutings
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleRoutings extends EntityPathBase<SailingScheduleRoutings> {

    private static final long serialVersionUID = 932660198L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleRoutings sailingScheduleRoutings = new QSailingScheduleRoutings("sailingScheduleRoutings");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> arrivalDateTime = createDateTime("arrivalDateTime", java.util.Date.class);

    public final NumberPath<Long> connectionPortId = createNumber("connectionPortId", Long.class);

    public final StringPath connectionPortName = createString("connectionPortName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> departureDateTime = createDateTime("departureDateTime", java.util.Date.class);

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imoNumber = createString("imoNumber");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode> Mode = createEnum("Mode", com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode.class);

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final QSailingScheduleDetails sailingScheduleDetails;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath voyageNumber = createString("voyageNumber");

    public QSailingScheduleRoutings(String variable) {
        this(SailingScheduleRoutings.class, forVariable(variable), INITS);
    }

    public QSailingScheduleRoutings(Path<? extends SailingScheduleRoutings> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleRoutings(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleRoutings(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleRoutings.class, metadata, inits);
    }

    public QSailingScheduleRoutings(Class<? extends SailingScheduleRoutings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sailingScheduleDetails = inits.isInitialized("sailingScheduleDetails") ? new QSailingScheduleDetails(forProperty("sailingScheduleDetails"), inits.get("sailingScheduleDetails")) : null;
    }

}

