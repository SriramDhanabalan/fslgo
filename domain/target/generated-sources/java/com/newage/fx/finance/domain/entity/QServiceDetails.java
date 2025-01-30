package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceDetails is a Querydsl query type for ServiceDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServiceDetails extends EntityPathBase<ServiceDetails> {

    private static final long serialVersionUID = -1161757860L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceDetails serviceDetails = new QServiceDetails("serviceDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final StringPath divisionName = createString("divisionName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QCfsWareHouseHeaderDetails information;

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> service = createEnum("service", com.newage.fx.finance.domain.enums.Service.class);

    public QServiceDetails(String variable) {
        this(ServiceDetails.class, forVariable(variable), INITS);
    }

    public QServiceDetails(Path<? extends ServiceDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceDetails(PathMetadata metadata, PathInits inits) {
        this(ServiceDetails.class, metadata, inits);
    }

    public QServiceDetails(Class<? extends ServiceDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.information = inits.isInitialized("information") ? new QCfsWareHouseHeaderDetails(forProperty("information"), inits.get("information")) : null;
    }

}

