package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierBookingOtherInfoDetails is a Querydsl query type for CarrierBookingOtherInfoDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierBookingOtherInfoDetails extends EntityPathBase<CarrierBookingOtherInfoDetails> {

    private static final long serialVersionUID = 638230644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierBookingOtherInfoDetails carrierBookingOtherInfoDetails = new QCarrierBookingOtherInfoDetails("carrierBookingOtherInfoDetails");

    public final StringPath additionalInfoToCarrier = createString("additionalInfoToCarrier");

    public final QCarrierBookingDetails carrierBookingDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath infoReceivedFromCarrier = createString("infoReceivedFromCarrier");

    public QCarrierBookingOtherInfoDetails(String variable) {
        this(CarrierBookingOtherInfoDetails.class, forVariable(variable), INITS);
    }

    public QCarrierBookingOtherInfoDetails(Path<? extends CarrierBookingOtherInfoDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierBookingOtherInfoDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierBookingOtherInfoDetails(PathMetadata metadata, PathInits inits) {
        this(CarrierBookingOtherInfoDetails.class, metadata, inits);
    }

    public QCarrierBookingOtherInfoDetails(Class<? extends CarrierBookingOtherInfoDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
    }

}

