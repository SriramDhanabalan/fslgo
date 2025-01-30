package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryFollowUpNxt is a Querydsl query type for CallEntryFollowUpNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryFollowUpNxt extends EntityPathBase<CallEntryFollowUpNxt> {

    private static final long serialVersionUID = 539587353L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryFollowUpNxt callEntryFollowUpNxt = new QCallEntryFollowUpNxt("callEntryFollowUpNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> followUpActionId = createNumber("followUpActionId", Long.class);

    public final StringPath followupActionName = createString("followupActionName");

    public final DateTimePath<java.util.Date> followupDate = createDateTime("followupDate", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isFollowUpCompleted = createEnum("isFollowUpCompleted", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isFollowUpRequired = createEnum("isFollowUpRequired", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryFollowUpNxt(String variable) {
        this(CallEntryFollowUpNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryFollowUpNxt(Path<? extends CallEntryFollowUpNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryFollowUpNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryFollowUpNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryFollowUpNxt.class, metadata, inits);
    }

    public QCallEntryFollowUpNxt(Class<? extends CallEntryFollowUpNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
    }

}

