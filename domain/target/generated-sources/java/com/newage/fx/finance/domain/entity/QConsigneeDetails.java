package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConsigneeDetails is a Querydsl query type for ConsigneeDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QConsigneeDetails extends EntityPathBase<ConsigneeDetails> {

    private static final long serialVersionUID = 1209788402L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConsigneeDetails consigneeDetails = new QConsigneeDetails("consigneeDetails");

    public final QGeneralInfoAesCustomDetails generalInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIntermediateConsigneeDetails intermediateConsignee;

    public final QUltimateConsigneeDetails ultimateConsignee;

    public QConsigneeDetails(String variable) {
        this(ConsigneeDetails.class, forVariable(variable), INITS);
    }

    public QConsigneeDetails(Path<? extends ConsigneeDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConsigneeDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConsigneeDetails(PathMetadata metadata, PathInits inits) {
        this(ConsigneeDetails.class, metadata, inits);
    }

    public QConsigneeDetails(Class<? extends ConsigneeDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.generalInfo = inits.isInitialized("generalInfo") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfo"), inits.get("generalInfo")) : null;
        this.intermediateConsignee = inits.isInitialized("intermediateConsignee") ? new QIntermediateConsigneeDetails(forProperty("intermediateConsignee"), inits.get("intermediateConsignee")) : null;
        this.ultimateConsignee = inits.isInitialized("ultimateConsignee") ? new QUltimateConsigneeDetails(forProperty("ultimateConsignee"), inits.get("ultimateConsignee")) : null;
    }

}

