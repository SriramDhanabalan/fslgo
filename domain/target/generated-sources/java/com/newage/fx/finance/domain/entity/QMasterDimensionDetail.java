package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterDimensionDetail is a Querydsl query type for MasterDimensionDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterDimensionDetail extends EntityPathBase<MasterDimensionDetail> {

    private static final long serialVersionUID = 466861606L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterDimensionDetail masterDimensionDetail = new QMasterDimensionDetail("masterDimensionDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.DimensionUnit> dimensionUnit = createEnum("dimensionUnit", com.newage.fx.finance.domain.enums.DimensionUnit.class);

    public final StringPath dimensionValue = createString("dimensionValue");

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> length = createNumber("length", Double.class);

    public final QMasterHeader masterHeader;

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath notes = createString("notes");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> overDimension = createEnum("overDimension", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeWeight = createNumber("volumeWeight", Double.class);

    public final NumberPath<Double> width = createNumber("width", Double.class);

    public QMasterDimensionDetail(String variable) {
        this(MasterDimensionDetail.class, forVariable(variable), INITS);
    }

    public QMasterDimensionDetail(Path<? extends MasterDimensionDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterDimensionDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterDimensionDetail(PathMetadata metadata, PathInits inits) {
        this(MasterDimensionDetail.class, metadata, inits);
    }

    public QMasterDimensionDetail(Class<? extends MasterDimensionDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

