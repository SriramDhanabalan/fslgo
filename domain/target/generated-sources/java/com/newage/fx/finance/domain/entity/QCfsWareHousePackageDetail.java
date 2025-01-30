package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHousePackageDetail is a Querydsl query type for CfsWareHousePackageDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHousePackageDetail extends EntityPathBase<CfsWareHousePackageDetail> {

    private static final long serialVersionUID = 702230005L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHousePackageDetail cfsWareHousePackageDetail = new QCfsWareHousePackageDetail("cfsWareHousePackageDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> chargeableWeightKg = createNumber("chargeableWeightKg", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QCfsWareHouseHeaderDetails information;

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volWeightKg = createNumber("volWeightKg", Double.class);

    public QCfsWareHousePackageDetail(String variable) {
        this(CfsWareHousePackageDetail.class, forVariable(variable), INITS);
    }

    public QCfsWareHousePackageDetail(Path<? extends CfsWareHousePackageDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHousePackageDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHousePackageDetail(PathMetadata metadata, PathInits inits) {
        this(CfsWareHousePackageDetail.class, metadata, inits);
    }

    public QCfsWareHousePackageDetail(Class<? extends CfsWareHousePackageDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.information = inits.isInitialized("information") ? new QCfsWareHouseHeaderDetails(forProperty("information"), inits.get("information")) : null;
    }

}

