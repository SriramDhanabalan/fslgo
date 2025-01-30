package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRateDimensionDetails is a Querydsl query type for DirectRateDimensionDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRateDimensionDetails extends EntityPathBase<DirectRateDimensionDetails> {

    private static final long serialVersionUID = -1095348332L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRateDimensionDetails directRateDimensionDetails = new QDirectRateDimensionDetails("directRateDimensionDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QDirectRateCargoDetails cargoDetails;

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> dimHeight = createNumber("dimHeight", Double.class);

    public final NumberPath<Double> dimLength = createNumber("dimLength", Double.class);

    public final NumberPath<Double> dimWidth = createNumber("dimWidth", Double.class);

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPiece = createNumber("noOfPiece", Integer.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volWeightKg = createNumber("volWeightKg", Double.class);

    public QDirectRateDimensionDetails(String variable) {
        this(DirectRateDimensionDetails.class, forVariable(variable), INITS);
    }

    public QDirectRateDimensionDetails(Path<? extends DirectRateDimensionDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRateDimensionDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRateDimensionDetails(PathMetadata metadata, PathInits inits) {
        this(DirectRateDimensionDetails.class, metadata, inits);
    }

    public QDirectRateDimensionDetails(Class<? extends DirectRateDimensionDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetails = inits.isInitialized("cargoDetails") ? new QDirectRateCargoDetails(forProperty("cargoDetails"), inits.get("cargoDetails")) : null;
    }

}

