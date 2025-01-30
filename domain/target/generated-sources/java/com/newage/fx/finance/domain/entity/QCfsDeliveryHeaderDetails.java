package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsDeliveryHeaderDetails is a Querydsl query type for CfsDeliveryHeaderDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsDeliveryHeaderDetails extends EntityPathBase<CfsDeliveryHeaderDetails> {

    private static final long serialVersionUID = 220498848L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsDeliveryHeaderDetails cfsDeliveryHeaderDetails = new QCfsDeliveryHeaderDetails("cfsDeliveryHeaderDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final ListPath<CfsDeliveryAttachments, QCfsDeliveryAttachments> cfsDeliveryAttachments = this.<CfsDeliveryAttachments, QCfsDeliveryAttachments>createList("cfsDeliveryAttachments", CfsDeliveryAttachments.class, QCfsDeliveryAttachments.class, PathInits.DIRECT2);

    public final ListPath<CfsDeliveryInfo, QCfsDeliveryInfo> cfsDeliveryInfos = this.<CfsDeliveryInfo, QCfsDeliveryInfo>createList("cfsDeliveryInfos", CfsDeliveryInfo.class, QCfsDeliveryInfo.class, PathInits.DIRECT2);

    public final NumberPath<Long> cfsId = createNumber("cfsId", Long.class);

    public final StringPath cfsName = createString("cfsName");

    public final StringPath commodity = createString("commodity");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final StringPath deliveryId = createString("deliveryId");

    public final DateTimePath<java.util.Date> doDate = createDateTime("doDate", java.util.Date.class);

    public final StringPath doNumber = createString("doNumber");

    public final StringPath hblOrHawbNo = createString("hblOrHawbNo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath manifestHblOrHawbNo = createString("manifestHblOrHawbNo");

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final NumberPath<Integer> noOfGrids = createNumber("noOfGrids", Integer.class);

    public final QShipmentServiceDetail shipmentService;

    public final DateTimePath<java.util.Date> unloadingDate = createDateTime("unloadingDate", java.util.Date.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCfsDeliveryHeaderDetails(String variable) {
        this(CfsDeliveryHeaderDetails.class, forVariable(variable), INITS);
    }

    public QCfsDeliveryHeaderDetails(Path<? extends CfsDeliveryHeaderDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsDeliveryHeaderDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsDeliveryHeaderDetails(PathMetadata metadata, PathInits inits) {
        this(CfsDeliveryHeaderDetails.class, metadata, inits);
    }

    public QCfsDeliveryHeaderDetails(Class<? extends CfsDeliveryHeaderDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentService = inits.isInitialized("shipmentService") ? new QShipmentServiceDetail(forProperty("shipmentService"), inits.get("shipmentService")) : null;
    }

}

