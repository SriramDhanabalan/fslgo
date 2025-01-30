package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryChargeDetailsNew is a Querydsl query type for EnquiryChargeDetailsNew
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryChargeDetailsNew extends EntityPathBase<EnquiryChargeDetailsNew> {

    private static final long serialVersionUID = 1289272326L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryChargeDetailsNew enquiryChargeDetailsNew = new QEnquiryChargeDetailsNew("enquiryChargeDetailsNew");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final NumberPath<Double> amountPerUnit = createNumber("amountPerUnit", Double.class);

    public final NumberPath<Long> billToCustomerId = createNumber("billToCustomerId", Long.class);

    public final StringPath billToCustomerName = createString("billToCustomerName");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath chargeCode = createString("chargeCode");

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final EnumPath<com.newage.fx.finance.domain.enums.ChargeType> chargeType = createEnum("chargeType", com.newage.fx.finance.domain.enums.ChargeType.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath convertedCurrencyCode = createString("convertedCurrencyCode");

    public final NumberPath<Long> convertedCurrencyId = createNumber("convertedCurrencyId", Long.class);

    public final NumberPath<Double> costAmount = createNumber("costAmount", Double.class);

    public final NumberPath<Double> costCurrencyAmount = createNumber("costCurrencyAmount", Double.class);

    public final NumberPath<Double> costPerUnit = createNumber("costPerUnit", Double.class);

    public final NumberPath<Double> costRoe = createNumber("costRoe", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> currencyAmount = createNumber("currencyAmount", Double.class);

    public final StringPath currencyCode = createString("currencyCode");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isContainer = createEnum("isContainer", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> measurementId = createNumber("measurementId", Long.class);

    public final NumberPath<Double> minAmount = createNumber("minAmount", Double.class);

    public final NumberPath<Double> minCostAmount = createNumber("minCostAmount", Double.class);

    public final ListPath<MultiCarrier, QMultiCarrier> multiCarrier = this.<MultiCarrier, QMultiCarrier>createList("multiCarrier", MultiCarrier.class, QMultiCarrier.class, PathInits.DIRECT2);

    public final NumberPath<Double> noOfUnit = createNumber("noOfUnit", Double.class);

    public final NumberPath<Double> roe = createNumber("roe", Double.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final QEnquirySpotQuotationNew spotQuotation;

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> term = createEnum("term", com.newage.fx.finance.domain.enums.Freight.class);

    public final StringPath unit = createString("unit");

    public final StringPath unitCode = createString("unitCode");

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final NumberPath<Long> vendorId = createNumber("vendorId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEnquiryChargeDetailsNew(String variable) {
        this(EnquiryChargeDetailsNew.class, forVariable(variable), INITS);
    }

    public QEnquiryChargeDetailsNew(Path<? extends EnquiryChargeDetailsNew> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryChargeDetailsNew(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryChargeDetailsNew(PathMetadata metadata, PathInits inits) {
        this(EnquiryChargeDetailsNew.class, metadata, inits);
    }

    public QEnquiryChargeDetailsNew(Class<? extends EnquiryChargeDetailsNew> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
        this.spotQuotation = inits.isInitialized("spotQuotation") ? new QEnquirySpotQuotationNew(forProperty("spotQuotation"), inits.get("spotQuotation")) : null;
    }

}

