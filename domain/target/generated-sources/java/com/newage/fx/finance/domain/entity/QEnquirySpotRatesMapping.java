package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquirySpotRatesMapping is a Querydsl query type for EnquirySpotRatesMapping
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquirySpotRatesMapping extends EntityPathBase<EnquirySpotRatesMapping> {

    private static final long serialVersionUID = -1387549167L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquirySpotRatesMapping enquirySpotRatesMapping = new QEnquirySpotRatesMapping("enquirySpotRatesMapping");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> rateHeaderId = createNumber("rateHeaderId", Long.class);

    public final StringPath rateId = createString("rateId");

    public final NumberPath<Long> rateOffersId = createNumber("rateOffersId", Long.class);

    public QEnquirySpotRatesMapping(String variable) {
        this(EnquirySpotRatesMapping.class, forVariable(variable), INITS);
    }

    public QEnquirySpotRatesMapping(Path<? extends EnquirySpotRatesMapping> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquirySpotRatesMapping(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquirySpotRatesMapping(PathMetadata metadata, PathInits inits) {
        this(EnquirySpotRatesMapping.class, metadata, inits);
    }

    public QEnquirySpotRatesMapping(Class<? extends EnquirySpotRatesMapping> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

