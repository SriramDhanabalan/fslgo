package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierShipmentCargoDetails is a Querydsl query type for CarrierShipmentCargoDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierShipmentCargoDetails extends EntityPathBase<CarrierShipmentCargoDetails> {

    private static final long serialVersionUID = 696864649L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierShipmentCargoDetails carrierShipmentCargoDetails = new QCarrierShipmentCargoDetails("carrierShipmentCargoDetails");

    public final QCarrierBookingDetails carrierBookingDetails;

    public final ListPath<CarrierContainerInfo, QCarrierContainerInfo> carrierContainerInfo = this.<CarrierContainerInfo, QCarrierContainerInfo>createList("carrierContainerInfo", CarrierContainerInfo.class, QCarrierContainerInfo.class, PathInits.DIRECT2);

    public final ListPath<CarrierCommodityDetails, QCarrierCommodityDetails> commodityDetails = this.<CarrierCommodityDetails, QCarrierCommodityDetails>createList("commodityDetails", CarrierCommodityDetails.class, QCarrierCommodityDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QCarrierShipmentCargoDetails(String variable) {
        this(CarrierShipmentCargoDetails.class, forVariable(variable), INITS);
    }

    public QCarrierShipmentCargoDetails(Path<? extends CarrierShipmentCargoDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierShipmentCargoDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierShipmentCargoDetails(PathMetadata metadata, PathInits inits) {
        this(CarrierShipmentCargoDetails.class, metadata, inits);
    }

    public QCarrierShipmentCargoDetails(Class<? extends CarrierShipmentCargoDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
    }

}

