package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseShipmentMap is a Querydsl query type for CfsWareHouseShipmentMap
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseShipmentMap extends EntityPathBase<CfsWareHouseShipmentMap> {

    private static final long serialVersionUID = 655832736L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseShipmentMap cfsWareHouseShipmentMap = new QCfsWareHouseShipmentMap("cfsWareHouseShipmentMap");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QCfsWareHouseHeaderDetails headerDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QShipmentServiceDetail shipmentService;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCfsWareHouseShipmentMap(String variable) {
        this(CfsWareHouseShipmentMap.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseShipmentMap(Path<? extends CfsWareHouseShipmentMap> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseShipmentMap(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseShipmentMap(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseShipmentMap.class, metadata, inits);
    }

    public QCfsWareHouseShipmentMap(Class<? extends CfsWareHouseShipmentMap> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QCfsWareHouseHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
        this.shipmentService = inits.isInitialized("shipmentService") ? new QShipmentServiceDetail(forProperty("shipmentService"), inits.get("shipmentService")) : null;
    }

}

