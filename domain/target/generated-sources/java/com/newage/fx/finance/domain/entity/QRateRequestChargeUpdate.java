package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRateRequestChargeUpdate is a Querydsl query type for RateRequestChargeUpdate
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRateRequestChargeUpdate extends EntityPathBase<RateRequestChargeUpdate> {

    private static final long serialVersionUID = -176391395L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRateRequestChargeUpdate rateRequestChargeUpdate = new QRateRequestChargeUpdate("rateRequestChargeUpdate");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath buyRate = createString("buyRate");

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath minAmount = createString("minAmount");

    public final QCreateRateRequest rateRequest;

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QRateRequestChargeUpdate(String variable) {
        this(RateRequestChargeUpdate.class, forVariable(variable), INITS);
    }

    public QRateRequestChargeUpdate(Path<? extends RateRequestChargeUpdate> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRateRequestChargeUpdate(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRateRequestChargeUpdate(PathMetadata metadata, PathInits inits) {
        this(RateRequestChargeUpdate.class, metadata, inits);
    }

    public QRateRequestChargeUpdate(Class<? extends RateRequestChargeUpdate> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rateRequest = inits.isInitialized("rateRequest") ? new QCreateRateRequest(forProperty("rateRequest"), inits.get("rateRequest")) : null;
    }

}

