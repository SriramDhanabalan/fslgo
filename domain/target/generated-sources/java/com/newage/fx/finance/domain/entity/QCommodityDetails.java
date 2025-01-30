package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommodityDetails is a Querydsl query type for CommodityDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommodityDetails extends EntityPathBase<CommodityDetails> {

    private static final long serialVersionUID = 1188203556L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommodityDetails commodityDetails = new QCommodityDetails("commodityDetails");

    public final EnumPath<com.newage.fx.finance.domain.enums.Action> action = createEnum("action", com.newage.fx.finance.domain.enums.Action.class);

    public final StringPath commodityDescription = createString("commodityDescription");

    public final StringPath eccn = createString("eccn");

    public final NumberPath<Long> exportCodeId = createNumber("exportCodeId", Long.class);

    public final StringPath exportLicNo = createString("exportLicNo");

    public final QGeneralInfoAesCustomDetails generalInfo;

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath idType = createString("idType");

    public final StringPath isUsedVehicle = createString("isUsedVehicle");

    public final NumberPath<Long> licenseTypeId = createNumber("licenseTypeId", Long.class);

    public final StringPath licenseValue = createString("licenseValue");

    public final StringPath originOfGoods = createString("originOfGoods");

    public final StringPath quantatity1UnitCode = createString("quantatity1UnitCode");

    public final StringPath quantatity2UnitCode = createString("quantatity2UnitCode");

    public final NumberPath<Long> quantity1 = createNumber("quantity1", Long.class);

    public final NumberPath<Long> quantity2 = createNumber("quantity2", Long.class);

    public final NumberPath<Long> scheduleBHTSCodeId = createNumber("scheduleBHTSCodeId", Long.class);

    public final NumberPath<Long> value = createNumber("value", Long.class);

    public final StringPath vehicleTitleNo = createString("vehicleTitleNo");

    public final NumberPath<Long> vehicleTitleStateId = createNumber("vehicleTitleStateId", Long.class);

    public final StringPath VinProductId = createString("VinProductId");

    public QCommodityDetails(String variable) {
        this(CommodityDetails.class, forVariable(variable), INITS);
    }

    public QCommodityDetails(Path<? extends CommodityDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommodityDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommodityDetails(PathMetadata metadata, PathInits inits) {
        this(CommodityDetails.class, metadata, inits);
    }

    public QCommodityDetails(Class<? extends CommodityDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.generalInfo = inits.isInitialized("generalInfo") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfo"), inits.get("generalInfo")) : null;
    }

}

