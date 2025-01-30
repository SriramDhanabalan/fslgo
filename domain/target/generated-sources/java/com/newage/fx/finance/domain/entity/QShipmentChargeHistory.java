package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentChargeHistory is a Querydsl query type for ShipmentChargeHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentChargeHistory extends EntityPathBase<ShipmentChargeHistory> {

    private static final long serialVersionUID = -982809769L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentChargeHistory shipmentChargeHistory = new QShipmentChargeHistory("shipmentChargeHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> billToCustomerId = createNumber("billToCustomerId", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Double> costAmount = createNumber("costAmount", Double.class);

    public final NumberPath<Double> costRatePerUnit = createNumber("costRatePerUnit", Double.class);

    public final NumberPath<Long> costToVendorId = createNumber("costToVendorId", Long.class);

    public final NumberPath<Double> costUnit = createNumber("costUnit", Double.class);

    public final NumberPath<Long> costUnitId = createNumber("costUnitId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Double> declratedSellMinimum = createNumber("declratedSellMinimum", Double.class);

    public final NumberPath<Double> declratedSellRate = createNumber("declratedSellRate", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.QuoteProcess> process = createEnum("process", com.newage.fx.finance.domain.enums.QuoteProcess.class);

    public final NumberPath<Double> roe = createNumber("roe", Double.class);

    public final NumberPath<Double> sellAmount = createNumber("sellAmount", Double.class);

    public final NumberPath<Double> sellAmountMinimum = createNumber("sellAmountMinimum", Double.class);

    public final NumberPath<Double> sellRatePerUnit = createNumber("sellRatePerUnit", Double.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> shipmentRateId = createNumber("shipmentRateId", Long.class);

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final StringPath unitName = createString("unitName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentChargeHistory(String variable) {
        this(ShipmentChargeHistory.class, forVariable(variable), INITS);
    }

    public QShipmentChargeHistory(Path<? extends ShipmentChargeHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentChargeHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentChargeHistory(PathMetadata metadata, PathInits inits) {
        this(ShipmentChargeHistory.class, metadata, inits);
    }

    public QShipmentChargeHistory(Class<? extends ShipmentChargeHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

