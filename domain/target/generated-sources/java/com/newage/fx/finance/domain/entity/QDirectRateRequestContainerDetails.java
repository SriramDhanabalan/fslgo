package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRateRequestContainerDetails is a Querydsl query type for DirectRateRequestContainerDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRateRequestContainerDetails extends EntityPathBase<DirectRateRequestContainerDetails> {

    private static final long serialVersionUID = -1835981160L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRateRequestContainerDetails directRateRequestContainerDetails = new QDirectRateRequestContainerDetails("directRateRequestContainerDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QDirectRateCargoDetails cargoDetails;

    public final StringPath containerCode = createString("containerCode");

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> numberOfContainers = createNumber("numberOfContainers", Integer.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QDirectRateRequestContainerDetails(String variable) {
        this(DirectRateRequestContainerDetails.class, forVariable(variable), INITS);
    }

    public QDirectRateRequestContainerDetails(Path<? extends DirectRateRequestContainerDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRateRequestContainerDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRateRequestContainerDetails(PathMetadata metadata, PathInits inits) {
        this(DirectRateRequestContainerDetails.class, metadata, inits);
    }

    public QDirectRateRequestContainerDetails(Class<? extends DirectRateRequestContainerDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetails = inits.isInitialized("cargoDetails") ? new QDirectRateCargoDetails(forProperty("cargoDetails"), inits.get("cargoDetails")) : null;
    }

}

