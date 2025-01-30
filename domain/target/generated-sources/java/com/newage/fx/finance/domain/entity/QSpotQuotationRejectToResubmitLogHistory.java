package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSpotQuotationRejectToResubmitLogHistory is a Querydsl query type for SpotQuotationRejectToResubmitLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSpotQuotationRejectToResubmitLogHistory extends EntityPathBase<SpotQuotationRejectToResubmitLogHistory> {

    private static final long serialVersionUID = 1262566096L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSpotQuotationRejectToResubmitLogHistory spotQuotationRejectToResubmitLogHistory = new QSpotQuotationRejectToResubmitLogHistory("spotQuotationRejectToResubmitLogHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> reasonId = createNumber("reasonId", Long.class);

    public final StringPath reasonNote = createString("reasonNote");

    public final StringPath reasonToResubmit = createString("reasonToResubmit");

    public final EnumPath<com.newage.fx.finance.domain.enums.EnquiryStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.EnquiryStatus.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSpotQuotationRejectToResubmitLogHistory(String variable) {
        this(SpotQuotationRejectToResubmitLogHistory.class, forVariable(variable), INITS);
    }

    public QSpotQuotationRejectToResubmitLogHistory(Path<? extends SpotQuotationRejectToResubmitLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSpotQuotationRejectToResubmitLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSpotQuotationRejectToResubmitLogHistory(PathMetadata metadata, PathInits inits) {
        this(SpotQuotationRejectToResubmitLogHistory.class, metadata, inits);
    }

    public QSpotQuotationRejectToResubmitLogHistory(Class<? extends SpotQuotationRejectToResubmitLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

