package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterSignOffUnsignOffLogHistory is a Querydsl query type for MasterSignOffUnsignOffLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterSignOffUnsignOffLogHistory extends EntityPathBase<MasterSignOffUnsignOffLogHistory> {

    private static final long serialVersionUID = -176720056L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterSignOffUnsignOffLogHistory masterSignOffUnsignOffLogHistory = new QMasterSignOffUnsignOffLogHistory("masterSignOffUnsignOffLogHistory");

    public final StringPath commentName = createString("commentName");

    public final StringPath createdBy = createString("createdBy");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMasterHeader masterHeader;

    public final StringPath signOffStatus = createString("signOffStatus");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterSignOffUnsignOffLogHistory(String variable) {
        this(MasterSignOffUnsignOffLogHistory.class, forVariable(variable), INITS);
    }

    public QMasterSignOffUnsignOffLogHistory(Path<? extends MasterSignOffUnsignOffLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterSignOffUnsignOffLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterSignOffUnsignOffLogHistory(PathMetadata metadata, PathInits inits) {
        this(MasterSignOffUnsignOffLogHistory.class, metadata, inits);
    }

    public QMasterSignOffUnsignOffLogHistory(Class<? extends MasterSignOffUnsignOffLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

