package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentCancellationLogHistory is a Querydsl query type for ShipmentCancellationLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentCancellationLogHistory extends EntityPathBase<ShipmentCancellationLogHistory> {

    private static final long serialVersionUID = -1115525156L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentCancellationLogHistory shipmentCancellationLogHistory = new QShipmentCancellationLogHistory("shipmentCancellationLogHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath created = createString("created");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath modified = createString("modified");

    public final NumberPath<Long> reasonId = createNumber("reasonId", Long.class);

    public final StringPath reasonName = createString("reasonName");

    public final StringPath remark = createString("remark");

    public final StringPath shipmentNo = createString("shipmentNo");

    public final QShipmentServiceDetail shipmentService;

    public final QShipmentHeader shipmentService1;

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.ShipmentStatus.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentCancellationLogHistory(String variable) {
        this(ShipmentCancellationLogHistory.class, forVariable(variable), INITS);
    }

    public QShipmentCancellationLogHistory(Path<? extends ShipmentCancellationLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentCancellationLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentCancellationLogHistory(PathMetadata metadata, PathInits inits) {
        this(ShipmentCancellationLogHistory.class, metadata, inits);
    }

    public QShipmentCancellationLogHistory(Class<? extends ShipmentCancellationLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentService = inits.isInitialized("shipmentService") ? new QShipmentServiceDetail(forProperty("shipmentService"), inits.get("shipmentService")) : null;
        this.shipmentService1 = inits.isInitialized("shipmentService1") ? new QShipmentHeader(forProperty("shipmentService1"), inits.get("shipmentService1")) : null;
    }

}

