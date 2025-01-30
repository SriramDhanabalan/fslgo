package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentRatesDetail is a Querydsl query type for ShipmentRatesDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentRatesDetail extends EntityPathBase<ShipmentRatesDetail> {

    private static final long serialVersionUID = 1929842587L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentRatesDetail shipmentRatesDetail = new QShipmentRatesDetail("shipmentRatesDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> balanceCostAmt = createNumber("balanceCostAmt", Double.class);

    public final NumberPath<Double> balanceSellAmt = createNumber("balanceSellAmt", Double.class);

    public final NumberPath<Long> billToCustomerId = createNumber("billToCustomerId", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Double> costAmount = createNumber("costAmount", Double.class);

    public final NumberPath<Long> costCurrencyId = createNumber("costCurrencyId", Long.class);

    public final NumberPath<Double> costRatePerUnit = createNumber("costRatePerUnit", Double.class);

    public final NumberPath<Double> costRoe = createNumber("costRoe", Double.class);

    public final NumberPath<Long> costToVendorId = createNumber("costToVendorId", Long.class);

    public final NumberPath<Double> costUnit = createNumber("costUnit", Double.class);

    public final NumberPath<Long> costUnitId = createNumber("costUnitId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath currencyCode = createString("currencyCode");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Double> declratedSellMinimum = createNumber("declratedSellMinimum", Double.class);

    public final NumberPath<Double> declratedSellRate = createNumber("declratedSellRate", Double.class);

    public final NumberPath<Long> enquiryRefChargeId = createNumber("enquiryRefChargeId", Long.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isModified = createBoolean("isModified");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> noOfUnit = createNumber("noOfUnit", Double.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Double> rateReferenceAmount = createNumber("rateReferenceAmount", Double.class);

    public final NumberPath<Long> rateReferenceId = createNumber("rateReferenceId", Long.class);

    public final NumberPath<Long> rateReferenceSlNo = createNumber("rateReferenceSlNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.RateReferenceTypes> rateReferenceType = createEnum("rateReferenceType", com.newage.fx.finance.domain.enums.RateReferenceTypes.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.RateTypes> rateType = createEnum("rateType", com.newage.fx.finance.domain.enums.RateTypes.class);

    public final NumberPath<Double> roe = createNumber("roe", Double.class);

    public final NumberPath<Double> sellAmount = createNumber("sellAmount", Double.class);

    public final NumberPath<Double> sellAmountMinimum = createNumber("sellAmountMinimum", Double.class);

    public final NumberPath<Double> sellRatePerUnit = createNumber("sellRatePerUnit", Double.class);

    public final QShipmentHeader shipmentHeader;

    public final QShipmentServiceDetail shipmentServiceId;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> term = createEnum("term", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Long> unitFrom = createNumber("unitFrom", Long.class);

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final StringPath unitName = createString("unitName");

    public final NumberPath<Long> unitTo = createNumber("unitTo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentRatesDetail(String variable) {
        this(ShipmentRatesDetail.class, forVariable(variable), INITS);
    }

    public QShipmentRatesDetail(Path<? extends ShipmentRatesDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentRatesDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentRatesDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentRatesDetail.class, metadata, inits);
    }

    public QShipmentRatesDetail(Class<? extends ShipmentRatesDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
        this.shipmentServiceId = inits.isInitialized("shipmentServiceId") ? new QShipmentServiceDetail(forProperty("shipmentServiceId"), inits.get("shipmentServiceId")) : null;
    }

}

