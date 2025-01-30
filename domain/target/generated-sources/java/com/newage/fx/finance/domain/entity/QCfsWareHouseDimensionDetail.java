package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseDimensionDetail is a Querydsl query type for CfsWareHouseDimensionDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseDimensionDetail extends EntityPathBase<CfsWareHouseDimensionDetail> {

    private static final long serialVersionUID = 1824561045L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseDimensionDetail cfsWareHouseDimensionDetail = new QCfsWareHouseDimensionDetail("cfsWareHouseDimensionDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final QCfsWareHouseHeaderDetails headerDetails;

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> length = createNumber("length", Double.class);

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath packageType = createString("packageType");

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeCbm = createNumber("volumeCbm", Double.class);

    public final NumberPath<Double> width = createNumber("width", Double.class);

    public QCfsWareHouseDimensionDetail(String variable) {
        this(CfsWareHouseDimensionDetail.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseDimensionDetail(Path<? extends CfsWareHouseDimensionDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseDimensionDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseDimensionDetail(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseDimensionDetail.class, metadata, inits);
    }

    public QCfsWareHouseDimensionDetail(Class<? extends CfsWareHouseDimensionDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QCfsWareHouseHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
    }

}

