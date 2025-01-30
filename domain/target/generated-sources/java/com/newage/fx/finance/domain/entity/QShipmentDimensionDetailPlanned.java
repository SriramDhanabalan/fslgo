package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QShipmentDimensionDetailPlanned is a Querydsl query type for ShipmentDimensionDetailPlanned
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentDimensionDetailPlanned extends EntityPathBase<ShipmentDimensionDetailPlanned> {

    private static final long serialVersionUID = 1862113846L;

    public static final QShipmentDimensionDetailPlanned shipmentDimensionDetailPlanned = new QShipmentDimensionDetailPlanned("shipmentDimensionDetailPlanned");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.DimensionUnit> dimensionUnit = createEnum("dimensionUnit", com.newage.fx.finance.domain.enums.DimensionUnit.class);

    public final NumberPath<Double> dimensionValue = createNumber("dimensionValue", Double.class);

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

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

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> overDimension = createEnum("overDimension", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Double> packId = createNumber("packId", Double.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeWeightKg = createNumber("volumeWeightKg", Double.class);

    public final NumberPath<Double> width = createNumber("width", Double.class);

    public QShipmentDimensionDetailPlanned(String variable) {
        super(ShipmentDimensionDetailPlanned.class, forVariable(variable));
    }

    public QShipmentDimensionDetailPlanned(Path<? extends ShipmentDimensionDetailPlanned> path) {
        super(path.getType(), path.getMetadata());
    }

    public QShipmentDimensionDetailPlanned(PathMetadata metadata) {
        super(ShipmentDimensionDetailPlanned.class, metadata);
    }

}

