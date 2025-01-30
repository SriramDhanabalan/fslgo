package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomPartyDetails is a Querydsl query type for CustomPartyDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomPartyDetails extends EntityPathBase<CustomPartyDetails> {

    private static final long serialVersionUID = 1823972508L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomPartyDetails customPartyDetails = new QCustomPartyDetails("customPartyDetails");

    public final QCustomPartyAddressInfo consigneeAdd;

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final QCustomHouseDetails customHouseDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QCustomPartyAddressInfo notifyAdd;

    public final NumberPath<Long> notifyId = createNumber("notifyId", Long.class);

    public final QCustomPartyAddressInfo shipperAdd;

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public QCustomPartyDetails(String variable) {
        this(CustomPartyDetails.class, forVariable(variable), INITS);
    }

    public QCustomPartyDetails(Path<? extends CustomPartyDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomPartyDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomPartyDetails(PathMetadata metadata, PathInits inits) {
        this(CustomPartyDetails.class, metadata, inits);
    }

    public QCustomPartyDetails(Class<? extends CustomPartyDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeAdd = inits.isInitialized("consigneeAdd") ? new QCustomPartyAddressInfo(forProperty("consigneeAdd")) : null;
        this.customHouseDetails = inits.isInitialized("customHouseDetails") ? new QCustomHouseDetails(forProperty("customHouseDetails"), inits.get("customHouseDetails")) : null;
        this.notifyAdd = inits.isInitialized("notifyAdd") ? new QCustomPartyAddressInfo(forProperty("notifyAdd")) : null;
        this.shipperAdd = inits.isInitialized("shipperAdd") ? new QCustomPartyAddressInfo(forProperty("shipperAdd")) : null;
    }

}

