package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentCargoDetail is a Querydsl query type for ShipmentCargoDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentCargoDetail extends EntityPathBase<ShipmentCargoDetail> {

    private static final long serialVersionUID = -1925110524L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentCargoDetail shipmentCargoDetail = new QShipmentCargoDetail("shipmentCargoDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableUnit = createNumber("chargeableUnit", Double.class);

    public final StringPath commodityDescription = createString("commodityDescription");

    public final NumberPath<Long> commodityId = createNumber("commodityId", Long.class);

    public final StringPath commodityName = createString("commodityName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> ExternalPackId = createNumber("ExternalPackId", Long.class);

    public final StringPath flashPoint = createString("flashPoint");

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightlbs = createNumber("grossWeightlbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> hazardous = createEnum("hazardous", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> imoClassId = createNumber("imoClassId", Long.class);

    public final StringPath imoClassName = createString("imoClassName");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final NumberPath<Double> maxTemperature = createNumber("maxTemperature", Double.class);

    public final NumberPath<Double> minTemperature = createNumber("minTemperature", Double.class);

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> refrigerationRequired = createEnum("refrigerationRequired", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> stackable = createEnum("stackable", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath storageCode = createString("storageCode");

    public final EnumPath<com.newage.fx.finance.domain.enums.TemperatureUnit> temperatureCode = createEnum("temperatureCode", com.newage.fx.finance.domain.enums.TemperatureUnit.class);

    public final StringPath unNumber = createString("unNumber");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeWeight = createNumber("volumeWeight", Double.class);

    public QShipmentCargoDetail(String variable) {
        this(ShipmentCargoDetail.class, forVariable(variable), INITS);
    }

    public QShipmentCargoDetail(Path<? extends ShipmentCargoDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentCargoDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentCargoDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentCargoDetail.class, metadata, inits);
    }

    public QShipmentCargoDetail(Class<? extends ShipmentCargoDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

