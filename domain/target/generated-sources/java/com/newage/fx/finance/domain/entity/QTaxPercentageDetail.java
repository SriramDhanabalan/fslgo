package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTaxPercentageDetail is a Querydsl query type for TaxPercentageDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTaxPercentageDetail extends EntityPathBase<TaxPercentageDetail> {

    private static final long serialVersionUID = -1286058713L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTaxPercentageDetail taxPercentageDetail = new QTaxPercentageDetail("taxPercentageDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> effectiveFrom = createDateTime("effectiveFrom", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> payableAccountId = createNumber("payableAccountId", Long.class);

    public final NumberPath<Long> percentage = createNumber("percentage", Long.class);

    public final NumberPath<Long> receivableAccountId = createNumber("receivableAccountId", Long.class);

    public final StringPath status = createString("status");

    public final QTaxMaster taxMaster;

    public QTaxPercentageDetail(String variable) {
        this(TaxPercentageDetail.class, forVariable(variable), INITS);
    }

    public QTaxPercentageDetail(Path<? extends TaxPercentageDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTaxPercentageDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTaxPercentageDetail(PathMetadata metadata, PathInits inits) {
        this(TaxPercentageDetail.class, metadata, inits);
    }

    public QTaxPercentageDetail(Class<? extends TaxPercentageDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.taxMaster = inits.isInitialized("taxMaster") ? new QTaxMaster(forProperty("taxMaster")) : null;
    }

}

