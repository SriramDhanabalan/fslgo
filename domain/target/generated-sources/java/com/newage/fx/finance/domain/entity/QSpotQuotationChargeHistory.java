package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSpotQuotationChargeHistory is a Querydsl query type for SpotQuotationChargeHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSpotQuotationChargeHistory extends EntityPathBase<SpotQuotationChargeHistory> {

    private static final long serialVersionUID = -2091639867L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSpotQuotationChargeHistory spotQuotationChargeHistory = new QSpotQuotationChargeHistory("spotQuotationChargeHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath chargeCode = createString("chargeCode");

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Double> costPerUnit = createNumber("costPerUnit", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> currencyAmount = createNumber("currencyAmount", Double.class);

    public final StringPath currencyCode = createString("currencyCode");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final QEnquiryHeader enquiryHeader;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> minAmount = createNumber("minAmount", Double.class);

    public final NumberPath<Double> minCostAmount = createNumber("minCostAmount", Double.class);

    public final NumberPath<Double> noOfUnit = createNumber("noOfUnit", Double.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.QuoteProcess> process = createEnum("process", com.newage.fx.finance.domain.enums.QuoteProcess.class);

    public final NumberPath<Double> roe = createNumber("roe", Double.class);

    public final NumberPath<Double> sellPerUnit = createNumber("sellPerUnit", Double.class);

    public final StringPath unit = createString("unit");

    public final StringPath unitCode = createString("unitCode");

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final DateTimePath<java.util.Date> validUpTo = createDateTime("validUpTo", java.util.Date.class);

    public final NumberPath<Long> vendorId = createNumber("vendorId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSpotQuotationChargeHistory(String variable) {
        this(SpotQuotationChargeHistory.class, forVariable(variable), INITS);
    }

    public QSpotQuotationChargeHistory(Path<? extends SpotQuotationChargeHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSpotQuotationChargeHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSpotQuotationChargeHistory(PathMetadata metadata, PathInits inits) {
        this(SpotQuotationChargeHistory.class, metadata, inits);
    }

    public QSpotQuotationChargeHistory(Class<? extends SpotQuotationChargeHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryHeader = inits.isInitialized("enquiryHeader") ? new QEnquiryHeader(forProperty("enquiryHeader"), inits.get("enquiryHeader")) : null;
    }

}

