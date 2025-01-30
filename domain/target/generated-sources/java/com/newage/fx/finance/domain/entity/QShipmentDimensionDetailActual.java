package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentDimensionDetailActual is a Querydsl query type for ShipmentDimensionDetailActual
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentDimensionDetailActual extends EntityPathBase<ShipmentDimensionDetailActual> {

    private static final long serialVersionUID = 315628252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentDimensionDetailActual shipmentDimensionDetailActual = new QShipmentDimensionDetailActual("shipmentDimensionDetailActual");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> dimensionUnit = createNumber("dimensionUnit", Double.class);

    public final NumberPath<Double> dimensionValue = createNumber("dimensionValue", Double.class);

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> length = createNumber("length", Double.class);

    public final NumberPath<Integer> no_of_pieces = createNumber("no_of_pieces", Integer.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Double> overDimension = createNumber("overDimension", Double.class);

    public final NumberPath<Double> packId = createNumber("packId", Double.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeInWeight = createNumber("volumeInWeight", Double.class);

    public final NumberPath<Double> width = createNumber("width", Double.class);

    public QShipmentDimensionDetailActual(String variable) {
        this(ShipmentDimensionDetailActual.class, forVariable(variable), INITS);
    }

    public QShipmentDimensionDetailActual(Path<? extends ShipmentDimensionDetailActual> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentDimensionDetailActual(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentDimensionDetailActual(PathMetadata metadata, PathInits inits) {
        this(ShipmentDimensionDetailActual.class, metadata, inits);
    }

    public QShipmentDimensionDetailActual(Class<? extends ShipmentDimensionDetailActual> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

