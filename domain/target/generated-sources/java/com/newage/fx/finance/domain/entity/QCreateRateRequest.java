package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCreateRateRequest is a Querydsl query type for CreateRateRequest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCreateRateRequest extends EntityPathBase<CreateRateRequest> {

    private static final long serialVersionUID = 2048751364L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCreateRateRequest createRateRequest = new QCreateRateRequest("createRateRequest");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> agentId = createNumber("agentId", Long.class);

    public final StringPath ccMailId = createString("ccMailId");

    public final ListPath<RateRequestChargeUpdate, QRateRequestChargeUpdate> chargeUpdate = this.<RateRequestChargeUpdate, QRateRequestChargeUpdate>createList("chargeUpdate", RateRequestChargeUpdate.class, QRateRequestChargeUpdate.class, PathInits.DIRECT2);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath emailId = createString("emailId");

    public final NumberPath<Long> employeeId = createNumber("employeeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final QDirectRateRequestHeader rateRequestHeader;

    public final EnumPath<com.newage.fx.finance.domain.enums.RateRequest> rateRequestTo = createEnum("rateRequestTo", com.newage.fx.finance.domain.enums.RateRequest.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCreateRateRequest(String variable) {
        this(CreateRateRequest.class, forVariable(variable), INITS);
    }

    public QCreateRateRequest(Path<? extends CreateRateRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCreateRateRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCreateRateRequest(PathMetadata metadata, PathInits inits) {
        this(CreateRateRequest.class, metadata, inits);
    }

    public QCreateRateRequest(Class<? extends CreateRateRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rateRequestHeader = inits.isInitialized("rateRequestHeader") ? new QDirectRateRequestHeader(forProperty("rateRequestHeader"), inits.get("rateRequestHeader")) : null;
    }

}

