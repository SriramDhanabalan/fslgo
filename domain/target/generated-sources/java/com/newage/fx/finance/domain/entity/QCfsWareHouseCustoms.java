package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseCustoms is a Querydsl query type for CfsWareHouseCustoms
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseCustoms extends EntityPathBase<CfsWareHouseCustoms> {

    private static final long serialVersionUID = -2079306912L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseCustoms cfsWareHouseCustoms = new QCfsWareHouseCustoms("cfsWareHouseCustoms");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> customsClearanceDate = createDateTime("customsClearanceDate", java.util.Date.class);

    public final StringPath damageAndRemarks = createString("damageAndRemarks");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QCfsWareHouseHeaderDetails information;

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath marksAndNumber = createString("marksAndNumber");

    public final StringPath time = createString("time");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final DateTimePath<java.util.Date> vgmDate = createDateTime("vgmDate", java.util.Date.class);

    public QCfsWareHouseCustoms(String variable) {
        this(CfsWareHouseCustoms.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseCustoms(Path<? extends CfsWareHouseCustoms> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseCustoms(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseCustoms(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseCustoms.class, metadata, inits);
    }

    public QCfsWareHouseCustoms(Class<? extends CfsWareHouseCustoms> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.information = inits.isInitialized("information") ? new QCfsWareHouseHeaderDetails(forProperty("information"), inits.get("information")) : null;
    }

}

