package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleMappedShipments is a Querydsl query type for SailingScheduleMappedShipments
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleMappedShipments extends EntityPathBase<SailingScheduleMappedShipments> {

    private static final long serialVersionUID = 1310439309L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleMappedShipments sailingScheduleMappedShipments = new QSailingScheduleMappedShipments("sailingScheduleMappedShipments");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QSailingScheduleHeaderDetails headerDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSailingScheduleMappedShipments(String variable) {
        this(SailingScheduleMappedShipments.class, forVariable(variable), INITS);
    }

    public QSailingScheduleMappedShipments(Path<? extends SailingScheduleMappedShipments> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleMappedShipments(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleMappedShipments(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleMappedShipments.class, metadata, inits);
    }

    public QSailingScheduleMappedShipments(Class<? extends SailingScheduleMappedShipments> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QSailingScheduleHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

