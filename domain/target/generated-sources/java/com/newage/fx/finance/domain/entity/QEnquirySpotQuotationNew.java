package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquirySpotQuotationNew is a Querydsl query type for EnquirySpotQuotationNew
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquirySpotQuotationNew extends EntityPathBase<EnquirySpotQuotationNew> {

    private static final long serialVersionUID = 14715082L;

    private static final PathInits INITS = new PathInits("*", "enquiryDetail.*.*");

    public static final QEnquirySpotQuotationNew enquirySpotQuotationNew = new QEnquirySpotQuotationNew("enquirySpotQuotationNew");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath approvalName = createString("approvalName");

    public final DateTimePath<java.util.Date> approvedDate = createDateTime("approvedDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> bookedDate = createDateTime("bookedDate", java.util.Date.class);

    public final StringPath branchAddress = createString("branchAddress");

    public final StringPath branchAddress2 = createString("branchAddress2");

    public final StringPath branchAddress3 = createString("branchAddress3");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> buyAmount = createNumber("buyAmount", Double.class);

    public final ListPath<EnquiryChargeDetailsNew, QEnquiryChargeDetailsNew> chargeDetails = this.<EnquiryChargeDetailsNew, QEnquiryChargeDetailsNew>createList("chargeDetails", EnquiryChargeDetailsNew.class, QEnquiryChargeDetailsNew.class, PathInits.DIRECT2);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath currencyCode = createString("currencyCode");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Long> customVersion = createNumber("customVersion", Long.class);

    public final StringPath empEmailId = createString("empEmailId");

    public final StringPath employeeName = createString("employeeName");

    public final StringPath empPhoneNo = createString("empPhoneNo");

    public final QEnquiryHeader enquiryDetail;

    public final StringPath enquiryUid = createString("enquiryUid");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath quotationNo = createString("quotationNo");

    public final ListPath<QuotationTermsAndConditionsGeneralNotes, QQuotationTermsAndConditionsGeneralNotes> quotationTermsAndConditionGeneralNotes = this.<QuotationTermsAndConditionsGeneralNotes, QQuotationTermsAndConditionsGeneralNotes>createList("quotationTermsAndConditionGeneralNotes", QuotationTermsAndConditionsGeneralNotes.class, QQuotationTermsAndConditionsGeneralNotes.class, PathInits.DIRECT2);

    public final ListPath<QuotationTermsAndConditionServiceNotes, QQuotationTermsAndConditionServiceNotes> quotationTermsAndConditionServiceNotes = this.<QuotationTermsAndConditionServiceNotes, QQuotationTermsAndConditionServiceNotes>createList("quotationTermsAndConditionServiceNotes", QuotationTermsAndConditionServiceNotes.class, QQuotationTermsAndConditionServiceNotes.class, PathInits.DIRECT2);

    public final NumberPath<Double> quoteAmount = createNumber("quoteAmount", Double.class);

    public final EnumPath<QuoteType> quoteType = createEnum("quoteType", QuoteType.class);

    public final NumberPath<Long> reasonId = createNumber("reasonId", Long.class);

    public final StringPath reasonNote = createString("reasonNote");

    public final DateTimePath<java.util.Date> sentApprovalDate = createDateTime("sentApprovalDate", java.util.Date.class);

    public final StringPath shipmentUid = createString("shipmentUid");

    public final DateTimePath<java.util.Date> validUpTo = createDateTime("validUpTo", java.util.Date.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final StringPath zipCode = createString("zipCode");

    public QEnquirySpotQuotationNew(String variable) {
        this(EnquirySpotQuotationNew.class, forVariable(variable), INITS);
    }

    public QEnquirySpotQuotationNew(Path<? extends EnquirySpotQuotationNew> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquirySpotQuotationNew(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquirySpotQuotationNew(PathMetadata metadata, PathInits inits) {
        this(EnquirySpotQuotationNew.class, metadata, inits);
    }

    public QEnquirySpotQuotationNew(Class<? extends EnquirySpotQuotationNew> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

