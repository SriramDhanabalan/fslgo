package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTaxEntityMappingDetail is a Querydsl query type for TaxEntityMappingDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTaxEntityMappingDetail extends EntityPathBase<TaxEntityMappingDetail> {

    private static final long serialVersionUID = 525654144L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTaxEntityMappingDetail taxEntityMappingDetail = new QTaxEntityMappingDetail("taxEntityMappingDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath status = createString("status");

    public final QTaxMaster taxMaster;

    public QTaxEntityMappingDetail(String variable) {
        this(TaxEntityMappingDetail.class, forVariable(variable), INITS);
    }

    public QTaxEntityMappingDetail(Path<? extends TaxEntityMappingDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTaxEntityMappingDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTaxEntityMappingDetail(PathMetadata metadata, PathInits inits) {
        this(TaxEntityMappingDetail.class, metadata, inits);
    }

    public QTaxEntityMappingDetail(Class<? extends TaxEntityMappingDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.taxMaster = inits.isInitialized("taxMaster") ? new QTaxMaster(forProperty("taxMaster")) : null;
    }

}

