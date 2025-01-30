package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRatePackageDetails is a Querydsl query type for DirectRatePackageDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRatePackageDetails extends EntityPathBase<DirectRatePackageDetails> {

    private static final long serialVersionUID = -462908748L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRatePackageDetails directRatePackageDetails = new QDirectRatePackageDetails("directRatePackageDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QDirectRateCargoDetails cargoDetails;

    public final NumberPath<Double> chargeableWeightKg = createNumber("chargeableWeightKg", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volWeightKg = createNumber("volWeightKg", Double.class);

    public QDirectRatePackageDetails(String variable) {
        this(DirectRatePackageDetails.class, forVariable(variable), INITS);
    }

    public QDirectRatePackageDetails(Path<? extends DirectRatePackageDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRatePackageDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRatePackageDetails(PathMetadata metadata, PathInits inits) {
        this(DirectRatePackageDetails.class, metadata, inits);
    }

    public QDirectRatePackageDetails(Class<? extends DirectRatePackageDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetails = inits.isInitialized("cargoDetails") ? new QDirectRateCargoDetails(forProperty("cargoDetails"), inits.get("cargoDetails")) : null;
    }

}

