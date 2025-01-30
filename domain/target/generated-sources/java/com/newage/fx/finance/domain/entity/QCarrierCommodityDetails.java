package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierCommodityDetails is a Querydsl query type for CarrierCommodityDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierCommodityDetails extends EntityPathBase<CarrierCommodityDetails> {

    private static final long serialVersionUID = 374750398L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierCommodityDetails carrierCommodityDetails = new QCarrierCommodityDetails("carrierCommodityDetails");

    public final QCarrierShipmentCargoDetails carrierShipmentCargoDetails;

    public final NumberPath<Double> chargableWeight = createNumber("chargableWeight", Double.class);

    public final StringPath commodityDescription = createString("commodityDescription");

    public final NumberPath<Long> commodityId = createNumber("commodityId", Long.class);

    public final StringPath commodityName = createString("commodityName");

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> referRequired = createEnum("referRequired", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Double> volume = createNumber("volume", Double.class);

    public QCarrierCommodityDetails(String variable) {
        this(CarrierCommodityDetails.class, forVariable(variable), INITS);
    }

    public QCarrierCommodityDetails(Path<? extends CarrierCommodityDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierCommodityDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierCommodityDetails(PathMetadata metadata, PathInits inits) {
        this(CarrierCommodityDetails.class, metadata, inits);
    }

    public QCarrierCommodityDetails(Class<? extends CarrierCommodityDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierShipmentCargoDetails = inits.isInitialized("carrierShipmentCargoDetails") ? new QCarrierShipmentCargoDetails(forProperty("carrierShipmentCargoDetails"), inits.get("carrierShipmentCargoDetails")) : null;
    }

}

