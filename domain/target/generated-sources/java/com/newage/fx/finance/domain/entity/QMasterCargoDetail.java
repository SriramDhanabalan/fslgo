package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterCargoDetail is a Querydsl query type for MasterCargoDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterCargoDetail extends EntityPathBase<MasterCargoDetail> {

    private static final long serialVersionUID = 1892441980L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterCargoDetail masterCargoDetail = new QMasterCargoDetail("masterCargoDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableUnit = createNumber("chargeableUnit", Double.class);

    public final StringPath commodityDescription = createString("commodityDescription");

    public final NumberPath<Long> commodityId = createNumber("commodityId", Long.class);

    public final StringPath commodityName = createString("commodityName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> hazardous = createEnum("hazardous", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath markNo = createString("markNo");

    public final QMasterHeader masterHeader;

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> stackable = createEnum("stackable", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeWeight = createNumber("volumeWeight", Double.class);

    public QMasterCargoDetail(String variable) {
        this(MasterCargoDetail.class, forVariable(variable), INITS);
    }

    public QMasterCargoDetail(Path<? extends MasterCargoDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterCargoDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterCargoDetail(PathMetadata metadata, PathInits inits) {
        this(MasterCargoDetail.class, metadata, inits);
    }

    public QMasterCargoDetail(Class<? extends MasterCargoDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

