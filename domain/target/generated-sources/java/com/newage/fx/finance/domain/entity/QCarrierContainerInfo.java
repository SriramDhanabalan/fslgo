package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierContainerInfo is a Querydsl query type for CarrierContainerInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierContainerInfo extends EntityPathBase<CarrierContainerInfo> {

    private static final long serialVersionUID = 1965225734L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierContainerInfo carrierContainerInfo = new QCarrierContainerInfo("carrierContainerInfo");

    public final QCarrierShipmentCargoDetails carrierShipmentCargoDetails;

    public final StringPath containerCode = createString("containerCode");

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> noOfContainer = createNumber("noOfContainer", Integer.class);

    public QCarrierContainerInfo(String variable) {
        this(CarrierContainerInfo.class, forVariable(variable), INITS);
    }

    public QCarrierContainerInfo(Path<? extends CarrierContainerInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierContainerInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierContainerInfo(PathMetadata metadata, PathInits inits) {
        this(CarrierContainerInfo.class, metadata, inits);
    }

    public QCarrierContainerInfo(Class<? extends CarrierContainerInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierShipmentCargoDetails = inits.isInitialized("carrierShipmentCargoDetails") ? new QCarrierShipmentCargoDetails(forProperty("carrierShipmentCargoDetails"), inits.get("carrierShipmentCargoDetails")) : null;
    }

}

