package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryNewValueAddedServiceDetails is a Querydsl query type for EnquiryNewValueAddedServiceDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryNewValueAddedServiceDetails extends EntityPathBase<EnquiryNewValueAddedServiceDetails> {

    private static final long serialVersionUID = 1909725384L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryNewValueAddedServiceDetails enquiryNewValueAddedServiceDetails = new QEnquiryNewValueAddedServiceDetails("enquiryNewValueAddedServiceDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> valueId = createNumber("valueId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEnquiryNewValueAddedServiceDetails(String variable) {
        this(EnquiryNewValueAddedServiceDetails.class, forVariable(variable), INITS);
    }

    public QEnquiryNewValueAddedServiceDetails(Path<? extends EnquiryNewValueAddedServiceDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryNewValueAddedServiceDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryNewValueAddedServiceDetails(PathMetadata metadata, PathInits inits) {
        this(EnquiryNewValueAddedServiceDetails.class, metadata, inits);
    }

    public QEnquiryNewValueAddedServiceDetails(Class<? extends EnquiryNewValueAddedServiceDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

