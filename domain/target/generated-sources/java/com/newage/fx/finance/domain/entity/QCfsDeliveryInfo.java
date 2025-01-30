package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsDeliveryInfo is a Querydsl query type for CfsDeliveryInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsDeliveryInfo extends EntityPathBase<CfsDeliveryInfo> {

    private static final long serialVersionUID = 725547939L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsDeliveryInfo cfsDeliveryInfo = new QCfsDeliveryInfo("cfsDeliveryInfo");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath boe = createString("boe");

    public final QCfsDeliveryHeaderDetails cfsDeliveryHeaderDetails;

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final StringPath declarationNo = createString("declarationNo");

    public final StringPath driverName = createString("driverName");

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath remarks = createString("remarks");

    public final StringPath time = createString("time");

    public final StringPath truckNo = createString("truckNo");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeWeightKg = createNumber("volumeWeightKg", Double.class);

    public QCfsDeliveryInfo(String variable) {
        this(CfsDeliveryInfo.class, forVariable(variable), INITS);
    }

    public QCfsDeliveryInfo(Path<? extends CfsDeliveryInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsDeliveryInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsDeliveryInfo(PathMetadata metadata, PathInits inits) {
        this(CfsDeliveryInfo.class, metadata, inits);
    }

    public QCfsDeliveryInfo(Class<? extends CfsDeliveryInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cfsDeliveryHeaderDetails = inits.isInitialized("cfsDeliveryHeaderDetails") ? new QCfsDeliveryHeaderDetails(forProperty("cfsDeliveryHeaderDetails"), inits.get("cfsDeliveryHeaderDetails")) : null;
    }

}

