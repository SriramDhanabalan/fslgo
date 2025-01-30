package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTaxMaster is a Querydsl query type for TaxMaster
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTaxMaster extends EntityPathBase<TaxMaster> {

    private static final long serialVersionUID = 1907257086L;

    public static final QTaxMaster taxMaster = new QTaxMaster("taxMaster");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath code = createString("code");

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath taxability = createString("taxability");

    public final ListPath<TaxChargeServieMappingDetails, QTaxChargeServieMappingDetails> taxChargeServiceMapping = this.<TaxChargeServieMappingDetails, QTaxChargeServieMappingDetails>createList("taxChargeServiceMapping", TaxChargeServieMappingDetails.class, QTaxChargeServieMappingDetails.class, PathInits.DIRECT2);

    public final ListPath<TaxEntityMappingDetail, QTaxEntityMappingDetail> taxEntityMappingDetails = this.<TaxEntityMappingDetail, QTaxEntityMappingDetail>createList("taxEntityMappingDetails", TaxEntityMappingDetail.class, QTaxEntityMappingDetail.class, PathInits.DIRECT2);

    public final ListPath<TaxPercentageDetail, QTaxPercentageDetail> taxPercentageDetails = this.<TaxPercentageDetail, QTaxPercentageDetail>createList("taxPercentageDetails", TaxPercentageDetail.class, QTaxPercentageDetail.class, PathInits.DIRECT2);

    public QTaxMaster(String variable) {
        super(TaxMaster.class, forVariable(variable));
    }

    public QTaxMaster(Path<? extends TaxMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTaxMaster(PathMetadata metadata) {
        super(TaxMaster.class, metadata);
    }

}

