package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomMasterBlDetails is a Querydsl query type for CustomMasterBlDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomMasterBlDetails extends EntityPathBase<CustomMasterBlDetails> {

    private static final long serialVersionUID = 645687862L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomMasterBlDetails customMasterBlDetails = new QCustomMasterBlDetails("customMasterBlDetails");

    public final StringPath blType = createString("blType");

    public final StringPath customHouse = createString("customHouse");

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMasterHeader masterHeader;

    public final DateTimePath<java.util.Date> oblDate = createDateTime("oblDate", java.util.Date.class);

    public final StringPath oblNo = createString("oblNo");

    public final StringPath pieces = createString("pieces");

    public final StringPath pieceType = createString("pieceType");

    public final StringPath vcn = createString("vcn");

    public final NumberPath<Double> volume = createNumber("volume", Double.class);

    public QCustomMasterBlDetails(String variable) {
        this(CustomMasterBlDetails.class, forVariable(variable), INITS);
    }

    public QCustomMasterBlDetails(Path<? extends CustomMasterBlDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomMasterBlDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomMasterBlDetails(PathMetadata metadata, PathInits inits) {
        this(CustomMasterBlDetails.class, metadata, inits);
    }

    public QCustomMasterBlDetails(Class<? extends CustomMasterBlDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

