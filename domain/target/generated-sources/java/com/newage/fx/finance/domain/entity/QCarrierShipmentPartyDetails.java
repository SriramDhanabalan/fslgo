package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierShipmentPartyDetails is a Querydsl query type for CarrierShipmentPartyDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierShipmentPartyDetails extends EntityPathBase<CarrierShipmentPartyDetails> {

    private static final long serialVersionUID = 601102623L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierShipmentPartyDetails carrierShipmentPartyDetails = new QCarrierShipmentPartyDetails("carrierShipmentPartyDetails");

    public final QCarrierPartyAddressInfo bookedByAdd;

    public final StringPath bookedByContactPerson = createString("bookedByContactPerson");

    public final QCarrierBookingDetails carrierBookingDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QCarrierPartyAddressInfo priceOwnerAdd;

    public final StringPath priceOwnerContactPerson = createString("priceOwnerContactPerson");

    public QCarrierShipmentPartyDetails(String variable) {
        this(CarrierShipmentPartyDetails.class, forVariable(variable), INITS);
    }

    public QCarrierShipmentPartyDetails(Path<? extends CarrierShipmentPartyDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierShipmentPartyDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierShipmentPartyDetails(PathMetadata metadata, PathInits inits) {
        this(CarrierShipmentPartyDetails.class, metadata, inits);
    }

    public QCarrierShipmentPartyDetails(Class<? extends CarrierShipmentPartyDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bookedByAdd = inits.isInitialized("bookedByAdd") ? new QCarrierPartyAddressInfo(forProperty("bookedByAdd")) : null;
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
        this.priceOwnerAdd = inits.isInitialized("priceOwnerAdd") ? new QCarrierPartyAddressInfo(forProperty("priceOwnerAdd")) : null;
    }

}

