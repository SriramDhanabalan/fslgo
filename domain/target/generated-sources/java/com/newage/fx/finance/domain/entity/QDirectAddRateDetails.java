package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectAddRateDetails is a Querydsl query type for DirectAddRateDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectAddRateDetails extends EntityPathBase<DirectAddRateDetails> {

    private static final long serialVersionUID = 607102073L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectAddRateDetails directAddRateDetails = new QDirectAddRateDetails("directAddRateDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> buyRate = createNumber("buyRate", Double.class);

    public final NumberPath<Long> charge = createNumber("charge", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currency = createNumber("currency", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> minAmount = createNumber("minAmount", Double.class);

    public final QDirectRateRequestHeader rateRequestHeader;

    public final NumberPath<Long> unit = createNumber("unit", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QDirectAddRateDetails(String variable) {
        this(DirectAddRateDetails.class, forVariable(variable), INITS);
    }

    public QDirectAddRateDetails(Path<? extends DirectAddRateDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectAddRateDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectAddRateDetails(PathMetadata metadata, PathInits inits) {
        this(DirectAddRateDetails.class, metadata, inits);
    }

    public QDirectAddRateDetails(Class<? extends DirectAddRateDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rateRequestHeader = inits.isInitialized("rateRequestHeader") ? new QDirectRateRequestHeader(forProperty("rateRequestHeader"), inits.get("rateRequestHeader")) : null;
    }

}

