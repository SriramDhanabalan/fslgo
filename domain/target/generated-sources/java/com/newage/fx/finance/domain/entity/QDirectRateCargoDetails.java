package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRateCargoDetails is a Querydsl query type for DirectRateCargoDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRateCargoDetails extends EntityPathBase<DirectRateCargoDetails> {

    private static final long serialVersionUID = 2044802174L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRateCargoDetails directRateCargoDetails = new QDirectRateCargoDetails("directRateCargoDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final ListPath<DirectRateDimensionDetails, QDirectRateDimensionDetails> dimensionDetails = this.<DirectRateDimensionDetails, QDirectRateDimensionDetails>createList("dimensionDetails", DirectRateDimensionDetails.class, QDirectRateDimensionDetails.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.DimensionUnit> dimensionUnit = createEnum("dimensionUnit", com.newage.fx.finance.domain.enums.DimensionUnit.class);

    public final ListPath<DirectRateRequestContainerDetails, QDirectRateRequestContainerDetails> directRateRequestContainerDetails = this.<DirectRateRequestContainerDetails, QDirectRateRequestContainerDetails>createList("directRateRequestContainerDetails", DirectRateRequestContainerDetails.class, QDirectRateRequestContainerDetails.class, PathInits.DIRECT2);

    public final BooleanPath hazardus = createBoolean("hazardus");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QDirectRatePackageDetails packageDetails;

    public final QDirectRateRequestHeader requestHeader;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QDirectRateCargoDetails(String variable) {
        this(DirectRateCargoDetails.class, forVariable(variable), INITS);
    }

    public QDirectRateCargoDetails(Path<? extends DirectRateCargoDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRateCargoDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRateCargoDetails(PathMetadata metadata, PathInits inits) {
        this(DirectRateCargoDetails.class, metadata, inits);
    }

    public QDirectRateCargoDetails(Class<? extends DirectRateCargoDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.packageDetails = inits.isInitialized("packageDetails") ? new QDirectRatePackageDetails(forProperty("packageDetails"), inits.get("packageDetails")) : null;
        this.requestHeader = inits.isInitialized("requestHeader") ? new QDirectRateRequestHeader(forProperty("requestHeader"), inits.get("requestHeader")) : null;
    }

}

