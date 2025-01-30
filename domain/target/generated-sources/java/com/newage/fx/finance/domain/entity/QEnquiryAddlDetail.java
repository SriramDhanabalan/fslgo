package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryAddlDetail is a Querydsl query type for EnquiryAddlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryAddlDetail extends EntityPathBase<EnquiryAddlDetail> {

    private static final long serialVersionUID = 890505552L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryAddlDetail enquiryAddlDetail = new QEnquiryAddlDetail("enquiryAddlDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final StringPath enquiryNo = createString("enquiryNo");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> plannedScheduleId = createNumber("plannedScheduleId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath voyageOrflightNo = createString("voyageOrflightNo");

    public QEnquiryAddlDetail(String variable) {
        this(EnquiryAddlDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryAddlDetail(Path<? extends EnquiryAddlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryAddlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryAddlDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryAddlDetail.class, metadata, inits);
    }

    public QEnquiryAddlDetail(Class<? extends EnquiryAddlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

