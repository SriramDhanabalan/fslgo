package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryServiceAddlDetail is a Querydsl query type for EnquiryServiceAddlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryServiceAddlDetail extends EntityPathBase<EnquiryServiceAddlDetail> {

    private static final long serialVersionUID = 622035197L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryServiceAddlDetail enquiryServiceAddlDetail = new QEnquiryServiceAddlDetail("enquiryServiceAddlDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath consigneeName = createString("consigneeName");

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerOrderNo = createNumber("customerOrderNo", Long.class);

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> enquiryId = createNumber("enquiryId", Long.class);

    public final StringPath enquiryNo = createString("enquiryNo");

    public final StringPath enquiryServiceUid = createString("enquiryServiceUid");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final StringPath shipperName = createString("shipperName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEnquiryServiceAddlDetail(String variable) {
        this(EnquiryServiceAddlDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryServiceAddlDetail(Path<? extends EnquiryServiceAddlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryServiceAddlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryServiceAddlDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryServiceAddlDetail.class, metadata, inits);
    }

    public QEnquiryServiceAddlDetail(Class<? extends EnquiryServiceAddlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

