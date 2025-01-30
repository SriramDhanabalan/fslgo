package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMultiCarrier is a Querydsl query type for MultiCarrier
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMultiCarrier extends EntityPathBase<MultiCarrier> {

    private static final long serialVersionUID = -47229746L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMultiCarrier multiCarrier = new QMultiCarrier("multiCarrier");

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final NumberPath<Long> cost = createNumber("cost", Long.class);

    public final QEnquiryChargeDetailsNew enquiryChargeDetailsNew;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sell = createNumber("sell", Long.class);

    public QMultiCarrier(String variable) {
        this(MultiCarrier.class, forVariable(variable), INITS);
    }

    public QMultiCarrier(Path<? extends MultiCarrier> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMultiCarrier(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMultiCarrier(PathMetadata metadata, PathInits inits) {
        this(MultiCarrier.class, metadata, inits);
    }

    public QMultiCarrier(Class<? extends MultiCarrier> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryChargeDetailsNew = inits.isInitialized("enquiryChargeDetailsNew") ? new QEnquiryChargeDetailsNew(forProperty("enquiryChargeDetailsNew"), inits.get("enquiryChargeDetailsNew")) : null;
    }

}

