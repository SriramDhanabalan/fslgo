package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentRoutingDetail is a Querydsl query type for ShipmentRoutingDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentRoutingDetail extends EntityPathBase<ShipmentRoutingDetail> {

    private static final long serialVersionUID = 1993413838L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentRoutingDetail shipmentRoutingDetail = new QShipmentRoutingDetail("shipmentRoutingDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> ata = createDateTime("ata", java.util.Date.class);

    public final DateTimePath<java.util.Date> atd = createDateTime("atd", java.util.Date.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> carrierOrVesselId = createNumber("carrierOrVesselId", Long.class);

    public final StringPath carrierOrVesselName = createString("carrierOrVesselName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> driverId = createNumber("driverId", Long.class);

    public final StringPath driverName = createString("driverName");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> fromPortId = createNumber("fromPortId", Long.class);

    public final StringPath fromPortName = createString("fromPortName");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> move = createEnum("move", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final StringPath notes = createString("notes");

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus.class);

    public final NumberPath<Long> toPortId = createNumber("toPortId", Long.class);

    public final StringPath toPortName = createString("toPortName");

    public final NumberPath<Long> vehicleId = createNumber("vehicleId", Long.class);

    public final StringPath vehicleName = createString("vehicleName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final StringPath voyageOrflightNo = createString("voyageOrflightNo");

    public QShipmentRoutingDetail(String variable) {
        this(ShipmentRoutingDetail.class, forVariable(variable), INITS);
    }

    public QShipmentRoutingDetail(Path<? extends ShipmentRoutingDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentRoutingDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentRoutingDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentRoutingDetail.class, metadata, inits);
    }

    public QShipmentRoutingDetail(Class<? extends ShipmentRoutingDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

