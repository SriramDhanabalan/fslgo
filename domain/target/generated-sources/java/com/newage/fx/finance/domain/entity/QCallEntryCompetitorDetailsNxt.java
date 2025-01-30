package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryCompetitorDetailsNxt is a Querydsl query type for CallEntryCompetitorDetailsNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryCompetitorDetailsNxt extends EntityPathBase<CallEntryCompetitorDetailsNxt> {

    private static final long serialVersionUID = -1312784871L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryCompetitorDetailsNxt callEntryCompetitorDetailsNxt = new QCallEntryCompetitorDetailsNxt("callEntryCompetitorDetailsNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> competitorId = createNumber("competitorId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath rate = createString("rate");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryCompetitorDetailsNxt(String variable) {
        this(CallEntryCompetitorDetailsNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryCompetitorDetailsNxt(Path<? extends CallEntryCompetitorDetailsNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryCompetitorDetailsNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryCompetitorDetailsNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryCompetitorDetailsNxt.class, metadata, inits);
    }

    public QCallEntryCompetitorDetailsNxt(Class<? extends CallEntryCompetitorDetailsNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
    }

}

