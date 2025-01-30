package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFreightForwarderDetails is a Querydsl query type for FreightForwarderDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFreightForwarderDetails extends EntityPathBase<FreightForwarderDetails> {

    private static final long serialVersionUID = 979738724L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFreightForwarderDetails freightForwarderDetails = new QFreightForwarderDetails("freightForwarderDetails");

    public final QUsCustomContactInfoDetails forwarderContactInfo;

    public final StringPath forwarderIdNumber = createString("forwarderIdNumber");

    public final StringPath forwarderIdType = createString("forwarderIdType");

    public final NumberPath<Long> freightForwarderid = createNumber("freightForwarderid", Long.class);

    public final QGeneralInfoAesCustomDetails generalInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QFreightForwarderDetails(String variable) {
        this(FreightForwarderDetails.class, forVariable(variable), INITS);
    }

    public QFreightForwarderDetails(Path<? extends FreightForwarderDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFreightForwarderDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFreightForwarderDetails(PathMetadata metadata, PathInits inits) {
        this(FreightForwarderDetails.class, metadata, inits);
    }

    public QFreightForwarderDetails(Class<? extends FreightForwarderDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.forwarderContactInfo = inits.isInitialized("forwarderContactInfo") ? new QUsCustomContactInfoDetails(forProperty("forwarderContactInfo")) : null;
        this.generalInfo = inits.isInitialized("generalInfo") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfo"), inits.get("generalInfo")) : null;
    }

}

