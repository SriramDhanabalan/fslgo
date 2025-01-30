package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSignOffAndUnSignOffLogHistory is a Querydsl query type for SignOffAndUnSignOffLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSignOffAndUnSignOffLogHistory extends EntityPathBase<SignOffAndUnSignOffLogHistory> {

    private static final long serialVersionUID = -532878475L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSignOffAndUnSignOffLogHistory signOffAndUnSignOffLogHistory = new QSignOffAndUnSignOffLogHistory("signOffAndUnSignOffLogHistory");

    public final StringPath commentName = createString("commentName");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QShipmentHeader shipmentHeader;

    public final StringPath signOffStatus = createString("signOffStatus");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSignOffAndUnSignOffLogHistory(String variable) {
        this(SignOffAndUnSignOffLogHistory.class, forVariable(variable), INITS);
    }

    public QSignOffAndUnSignOffLogHistory(Path<? extends SignOffAndUnSignOffLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSignOffAndUnSignOffLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSignOffAndUnSignOffLogHistory(PathMetadata metadata, PathInits inits) {
        this(SignOffAndUnSignOffLogHistory.class, metadata, inits);
    }

    public QSignOffAndUnSignOffLogHistory(Class<? extends SignOffAndUnSignOffLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

