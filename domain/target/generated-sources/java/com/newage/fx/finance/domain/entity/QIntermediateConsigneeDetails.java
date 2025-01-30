package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QIntermediateConsigneeDetails is a Querydsl query type for IntermediateConsigneeDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QIntermediateConsigneeDetails extends EntityPathBase<IntermediateConsigneeDetails> {

    private static final long serialVersionUID = 534092939L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QIntermediateConsigneeDetails intermediateConsigneeDetails = new QIntermediateConsigneeDetails("intermediateConsigneeDetails");

    public final QConsigneeDetails consigneeInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath intermediateConsigneeCode = createString("intermediateConsigneeCode");

    public final QUsCustomContactInfoDetails intermediateConsigneeContactInfo;

    public final NumberPath<Long> intermediateConsigneeId = createNumber("intermediateConsigneeId", Long.class);

    public QIntermediateConsigneeDetails(String variable) {
        this(IntermediateConsigneeDetails.class, forVariable(variable), INITS);
    }

    public QIntermediateConsigneeDetails(Path<? extends IntermediateConsigneeDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QIntermediateConsigneeDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QIntermediateConsigneeDetails(PathMetadata metadata, PathInits inits) {
        this(IntermediateConsigneeDetails.class, metadata, inits);
    }

    public QIntermediateConsigneeDetails(Class<? extends IntermediateConsigneeDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeInfo = inits.isInitialized("consigneeInfo") ? new QConsigneeDetails(forProperty("consigneeInfo"), inits.get("consigneeInfo")) : null;
        this.intermediateConsigneeContactInfo = inits.isInitialized("intermediateConsigneeContactInfo") ? new QUsCustomContactInfoDetails(forProperty("intermediateConsigneeContactInfo")) : null;
    }

}

