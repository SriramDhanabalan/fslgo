package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterRatesDetail is a Querydsl query type for MasterRatesDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterRatesDetail extends EntityPathBase<MasterRatesDetail> {

    private static final long serialVersionUID = 1452427795L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterRatesDetail masterRatesDetail = new QMasterRatesDetail("masterRatesDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Double> costRatePerUnit = createNumber("costRatePerUnit", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Double> currencyRoe = createNumber("currencyRoe", Double.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.MAWBCharges> due = createEnum("due", com.newage.fx.finance.domain.enums.MAWBCharges.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final QMasterServiceDetail masterServiceDetail;

    public final NumberPath<Double> noOfUnit = createNumber("noOfUnit", Double.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> term = createEnum("term", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final NumberPath<Long> vendorId = createNumber("vendorId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterRatesDetail(String variable) {
        this(MasterRatesDetail.class, forVariable(variable), INITS);
    }

    public QMasterRatesDetail(Path<? extends MasterRatesDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterRatesDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterRatesDetail(PathMetadata metadata, PathInits inits) {
        this(MasterRatesDetail.class, metadata, inits);
    }

    public QMasterRatesDetail(Class<? extends MasterRatesDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.masterServiceDetail = inits.isInitialized("masterServiceDetail") ? new QMasterServiceDetail(forProperty("masterServiceDetail"), inits.get("masterServiceDetail")) : null;
    }

}

