package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentCommodityDetail is a Querydsl query type for ShipmentCommodityDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentCommodityDetail extends EntityPathBase<ShipmentCommodityDetail> {

    private static final long serialVersionUID = 2124445749L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentCommodityDetail shipmentCommodityDetail = new QShipmentCommodityDetail("shipmentCommodityDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableUnit = createNumber("chargeableUnit", Double.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> countryOfOriginId = createNumber("countryOfOriginId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final StringPath hsCode = createString("hsCode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imoNo = createString("imoNo");

    public final StringPath itemDescription = createString("itemDescription");

    public final StringPath itemNo = createString("itemNo");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPack = createNumber("noOfPack", Integer.class);

    public final StringPath note = createString("note");

    public final StringPath poNumber = createString("poNumber");

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Double> unitPrice = createNumber("unitPrice", Double.class);

    public final StringPath unNo = createString("unNo");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volume = createNumber("volume", Double.class);

    public QShipmentCommodityDetail(String variable) {
        this(ShipmentCommodityDetail.class, forVariable(variable), INITS);
    }

    public QShipmentCommodityDetail(Path<? extends ShipmentCommodityDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentCommodityDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentCommodityDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentCommodityDetail.class, metadata, inits);
    }

    public QShipmentCommodityDetail(Class<? extends ShipmentCommodityDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

