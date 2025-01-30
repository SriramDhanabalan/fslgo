package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRateRequestCarrierDetail is a Querydsl query type for DirectRateRequestCarrierDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRateRequestCarrierDetail extends EntityPathBase<DirectRateRequestCarrierDetail> {

    private static final long serialVersionUID = -893629262L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRateRequestCarrierDetail directRateRequestCarrierDetail = new QDirectRateRequestCarrierDetail("directRateRequestCarrierDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> carrier = createNumber("carrier", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QDirectRateRequestHeader rateRequestHeader;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QDirectRateRequestCarrierDetail(String variable) {
        this(DirectRateRequestCarrierDetail.class, forVariable(variable), INITS);
    }

    public QDirectRateRequestCarrierDetail(Path<? extends DirectRateRequestCarrierDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRateRequestCarrierDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRateRequestCarrierDetail(PathMetadata metadata, PathInits inits) {
        this(DirectRateRequestCarrierDetail.class, metadata, inits);
    }

    public QDirectRateRequestCarrierDetail(Class<? extends DirectRateRequestCarrierDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rateRequestHeader = inits.isInitialized("rateRequestHeader") ? new QDirectRateRequestHeader(forProperty("rateRequestHeader"), inits.get("rateRequestHeader")) : null;
    }

}

