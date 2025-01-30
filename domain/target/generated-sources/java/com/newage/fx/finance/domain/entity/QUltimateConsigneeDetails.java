package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUltimateConsigneeDetails is a Querydsl query type for UltimateConsigneeDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUltimateConsigneeDetails extends EntityPathBase<UltimateConsigneeDetails> {

    private static final long serialVersionUID = -1847623837L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUltimateConsigneeDetails ultimateConsigneeDetails = new QUltimateConsigneeDetails("ultimateConsigneeDetails");

    public final QUsCustomContactInfoDetails consigneeContactInfo;

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final StringPath consigneeIdType = createString("consigneeIdType");

    public final QConsigneeDetails consigneeInfo;

    public final StringPath consigneeType = createString("consigneeType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> ultimateConsigneeId = createNumber("ultimateConsigneeId", Long.class);

    public QUltimateConsigneeDetails(String variable) {
        this(UltimateConsigneeDetails.class, forVariable(variable), INITS);
    }

    public QUltimateConsigneeDetails(Path<? extends UltimateConsigneeDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUltimateConsigneeDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUltimateConsigneeDetails(PathMetadata metadata, PathInits inits) {
        this(UltimateConsigneeDetails.class, metadata, inits);
    }

    public QUltimateConsigneeDetails(Class<? extends UltimateConsigneeDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeContactInfo = inits.isInitialized("consigneeContactInfo") ? new QUsCustomContactInfoDetails(forProperty("consigneeContactInfo")) : null;
        this.consigneeInfo = inits.isInitialized("consigneeInfo") ? new QConsigneeDetails(forProperty("consigneeInfo"), inits.get("consigneeInfo")) : null;
    }

}

