package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuotationTermsAndConditionServiceNotes is a Querydsl query type for QuotationTermsAndConditionServiceNotes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuotationTermsAndConditionServiceNotes extends EntityPathBase<QuotationTermsAndConditionServiceNotes> {

    private static final long serialVersionUID = 1579402042L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuotationTermsAndConditionServiceNotes quotationTermsAndConditionServiceNotes = new QQuotationTermsAndConditionServiceNotes("quotationTermsAndConditionServiceNotes");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notes = createString("notes");

    public final QEnquirySpotQuotationNew spotQuotation;

    public QQuotationTermsAndConditionServiceNotes(String variable) {
        this(QuotationTermsAndConditionServiceNotes.class, forVariable(variable), INITS);
    }

    public QQuotationTermsAndConditionServiceNotes(Path<? extends QuotationTermsAndConditionServiceNotes> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuotationTermsAndConditionServiceNotes(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuotationTermsAndConditionServiceNotes(PathMetadata metadata, PathInits inits) {
        this(QuotationTermsAndConditionServiceNotes.class, metadata, inits);
    }

    public QQuotationTermsAndConditionServiceNotes(Class<? extends QuotationTermsAndConditionServiceNotes> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.spotQuotation = inits.isInitialized("spotQuotation") ? new QEnquirySpotQuotationNew(forProperty("spotQuotation"), inits.get("spotQuotation")) : null;
    }

}

