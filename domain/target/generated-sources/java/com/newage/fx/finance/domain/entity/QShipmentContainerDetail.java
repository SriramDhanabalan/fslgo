package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentContainerDetail is a Querydsl query type for ShipmentContainerDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentContainerDetail extends EntityPathBase<ShipmentContainerDetail> {

    private static final long serialVersionUID = -1597677943L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentContainerDetail shipmentContainerDetail = new QShipmentContainerDetail("shipmentContainerDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final StringPath containerNumber = createString("containerNumber");

    public final NumberPath<Long> containerTypeId = createNumber("containerTypeId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> driverId = createNumber("driverId", Long.class);

    public final StringPath driverName = createString("driverName");

    public final NumberPath<Long> externalNoOfPiece = createNumber("externalNoOfPiece", Long.class);

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> internalNoOfPiece = createNumber("internalNoOfPiece", Long.class);

    public final BooleanPath isModified = createBoolean("isModified");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterContainerDetail masterContainer;

    public final NumberPath<Long> masterId = createNumber("masterId", Long.class);

    public final StringPath mobile = createString("mobile");

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final QShipmentHeader shipmentHeader;

    public final StringPath trailerNo = createString("trailerNo");

    public final NumberPath<Long> transporterId = createNumber("transporterId", Long.class);

    public final StringPath transporterName = createString("transporterName");

    public final NumberPath<Long> vehicleId = createNumber("vehicleId", Long.class);

    public final StringPath vehicleName = createString("vehicleName");

    public final NumberPath<Long> vehicleTypeId = createNumber("vehicleTypeId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public QShipmentContainerDetail(String variable) {
        this(ShipmentContainerDetail.class, forVariable(variable), INITS);
    }

    public QShipmentContainerDetail(Path<? extends ShipmentContainerDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentContainerDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentContainerDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentContainerDetail.class, metadata, inits);
    }

    public QShipmentContainerDetail(Class<? extends ShipmentContainerDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterContainer = inits.isInitialized("masterContainer") ? new QMasterContainerDetail(forProperty("masterContainer"), inits.get("masterContainer")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

