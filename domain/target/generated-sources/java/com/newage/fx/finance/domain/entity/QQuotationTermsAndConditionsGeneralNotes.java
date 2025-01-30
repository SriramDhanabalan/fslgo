package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQuotationTermsAndConditionsGeneralNotes is a Querydsl query type for QuotationTermsAndConditionsGeneralNotes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QQuotationTermsAndConditionsGeneralNotes extends EntityPathBase<QuotationTermsAndConditionsGeneralNotes> {

    private static final long serialVersionUID = 1088469630L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQuotationTermsAndConditionsGeneralNotes quotationTermsAndConditionsGeneralNotes = new QQuotationTermsAndConditionsGeneralNotes("quotationTermsAndConditionsGeneralNotes");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notes = createString("notes");

    public final QEnquirySpotQuotationNew spotQuotation;

    public QQuotationTermsAndConditionsGeneralNotes(String variable) {
        this(QuotationTermsAndConditionsGeneralNotes.class, forVariable(variable), INITS);
    }

    public QQuotationTermsAndConditionsGeneralNotes(Path<? extends QuotationTermsAndConditionsGeneralNotes> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQuotationTermsAndConditionsGeneralNotes(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQuotationTermsAndConditionsGeneralNotes(PathMetadata metadata, PathInits inits) {
        this(QuotationTermsAndConditionsGeneralNotes.class, metadata, inits);
    }

    public QQuotationTermsAndConditionsGeneralNotes(Class<? extends QuotationTermsAndConditionsGeneralNotes> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.spotQuotation = inits.isInitialized("spotQuotation") ? new QEnquirySpotQuotationNew(forProperty("spotQuotation"), inits.get("spotQuotation")) : null;
    }

}

