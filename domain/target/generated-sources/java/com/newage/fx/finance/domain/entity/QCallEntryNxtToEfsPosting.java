package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryNxtToEfsPosting is a Querydsl query type for CallEntryNxtToEfsPosting
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryNxtToEfsPosting extends EntityPathBase<CallEntryNxtToEfsPosting> {

    private static final long serialVersionUID = 1763720272L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryNxtToEfsPosting callEntryNxtToEfsPosting = new QCallEntryNxtToEfsPosting("callEntryNxtToEfsPosting");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QCallEntryHeaderNxt callEntry;

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.CreateOrUpdate> createOrUpdate = createEnum("createOrUpdate", com.newage.fx.finance.domain.enums.CreateOrUpdate.class);

    public final StringPath efsCallNo = createString("efsCallNo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> postingDateTime = createDateTime("postingDateTime", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> postingStatus = createEnum("postingStatus", com.newage.fx.finance.domain.enums.YesNo.class);

    public QCallEntryNxtToEfsPosting(String variable) {
        this(CallEntryNxtToEfsPosting.class, forVariable(variable), INITS);
    }

    public QCallEntryNxtToEfsPosting(Path<? extends CallEntryNxtToEfsPosting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryNxtToEfsPosting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryNxtToEfsPosting(PathMetadata metadata, PathInits inits) {
        this(CallEntryNxtToEfsPosting.class, metadata, inits);
    }

    public QCallEntryNxtToEfsPosting(Class<? extends CallEntryNxtToEfsPosting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntry = inits.isInitialized("callEntry") ? new QCallEntryHeaderNxt(forProperty("callEntry"), inits.get("callEntry")) : null;
    }

}

