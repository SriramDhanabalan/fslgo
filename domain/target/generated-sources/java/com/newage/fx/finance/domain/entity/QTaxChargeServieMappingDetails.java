package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTaxChargeServieMappingDetails is a Querydsl query type for TaxChargeServieMappingDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTaxChargeServieMappingDetails extends EntityPathBase<TaxChargeServieMappingDetails> {

    private static final long serialVersionUID = -516424362L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTaxChargeServieMappingDetails taxChargeServieMappingDetails = new QTaxChargeServieMappingDetails("taxChargeServieMappingDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final StringPath status = createString("status");

    public final QTaxMaster taxMaster;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTaxChargeServieMappingDetails(String variable) {
        this(TaxChargeServieMappingDetails.class, forVariable(variable), INITS);
    }

    public QTaxChargeServieMappingDetails(Path<? extends TaxChargeServieMappingDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTaxChargeServieMappingDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTaxChargeServieMappingDetails(PathMetadata metadata, PathInits inits) {
        this(TaxChargeServieMappingDetails.class, metadata, inits);
    }

    public QTaxChargeServieMappingDetails(Class<? extends TaxChargeServieMappingDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.taxMaster = inits.isInitialized("taxMaster") ? new QTaxMaster(forProperty("taxMaster")) : null;
    }

}

