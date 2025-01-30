package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryFollowUpLogHistory is a Querydsl query type for CallEntryFollowUpLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryFollowUpLogHistory extends EntityPathBase<CallEntryFollowUpLogHistory> {

    private static final long serialVersionUID = -1863648607L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryFollowUpLogHistory callEntryFollowUpLogHistory = new QCallEntryFollowUpLogHistory("callEntryFollowUpLogHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath followupActionName = createString("followupActionName");

    public final DateTimePath<java.util.Date> followupDate = createDateTime("followupDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath note = createString("note");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryFollowUpLogHistory(String variable) {
        this(CallEntryFollowUpLogHistory.class, forVariable(variable), INITS);
    }

    public QCallEntryFollowUpLogHistory(Path<? extends CallEntryFollowUpLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryFollowUpLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryFollowUpLogHistory(PathMetadata metadata, PathInits inits) {
        this(CallEntryFollowUpLogHistory.class, metadata, inits);
    }

    public QCallEntryFollowUpLogHistory(Class<? extends CallEntryFollowUpLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
    }

}

