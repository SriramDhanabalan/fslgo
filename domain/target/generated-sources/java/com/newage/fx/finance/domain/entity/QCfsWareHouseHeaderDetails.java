package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseHeaderDetails is a Querydsl query type for CfsWareHouseHeaderDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseHeaderDetails extends EntityPathBase<CfsWareHouseHeaderDetails> {

    private static final long serialVersionUID = 736747699L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseHeaderDetails cfsWareHouseHeaderDetails = new QCfsWareHouseHeaderDetails("cfsWareHouseHeaderDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final ListPath<CfsWareHouseAttachment, QCfsWareHouseAttachment> attachments = this.<CfsWareHouseAttachment, QCfsWareHouseAttachment>createList("attachments", CfsWareHouseAttachment.class, QCfsWareHouseAttachment.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> autoCfs = createEnum("autoCfs", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QCfsWareHouseCustoms cfsCustoms;

    public final NumberPath<Long> cfsId = createNumber("cfsId", Long.class);

    public final StringPath cfsName = createString("cfsName");

    public final StringPath cfsNote = createString("cfsNote");

    public final QCfsWareHousePackageDetail cfsPackageDetail;

    public final StringPath commodity = createString("commodity");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final StringPath custRefNo = createString("custRefNo");

    public final ListPath<CfsWareHouseDimensionDetail, QCfsWareHouseDimensionDetail> dimensionDetail = this.<CfsWareHouseDimensionDetail, QCfsWareHouseDimensionDetail>createList("dimensionDetail", CfsWareHouseDimensionDetail.class, QCfsWareHouseDimensionDetail.class, PathInits.DIRECT2);

    public final NumberPath<Integer> dimensionValue = createNumber("dimensionValue", Integer.class);

    public final StringPath driverName = createString("driverName");

    public final StringPath HBLOrHawb = createString("HBLOrHawb");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<CfsWareHouseItemInformation, QCfsWareHouseItemInformation> information = this.<CfsWareHouseItemInformation, QCfsWareHouseItemInformation>createList("information", CfsWareHouseItemInformation.class, QCfsWareHouseItemInformation.class, PathInits.DIRECT2);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> manualCfs = createEnum("manualCfs", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final StringPath receiptId = createString("receiptId");

    public final EnumPath<com.newage.fx.finance.domain.enums.ReceiveType> receiptType = createEnum("receiptType", com.newage.fx.finance.domain.enums.ReceiveType.class);

    public final DateTimePath<java.util.Date> receivedDate = createDateTime("receivedDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ReceivedIn> receivedIn = createEnum("receivedIn", com.newage.fx.finance.domain.enums.ReceivedIn.class);

    public final StringPath receivedTime = createString("receivedTime");

    public final QServiceDetails serviceDetails;

    public final ListPath<CfsWareHouseShipmentMap, QCfsWareHouseShipmentMap> shipmentMap = this.<CfsWareHouseShipmentMap, QCfsWareHouseShipmentMap>createList("shipmentMap", CfsWareHouseShipmentMap.class, QCfsWareHouseShipmentMap.class, PathInits.DIRECT2);

    public final NumberPath<Long> supplierId = createNumber("supplierId", Long.class);

    public final StringPath supplierName = createString("supplierName");

    public final StringPath supplierRefNo = createString("supplierRefNo");

    public final StringPath truckNo = createString("truckNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.DimensionUnit> unit = createEnum("unit", com.newage.fx.finance.domain.enums.DimensionUnit.class);

    public final NumberPath<Long> userBranchId = createNumber("userBranchId", Long.class);

    public final NumberPath<Long> userEmployeeId = createNumber("userEmployeeId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCfsWareHouseHeaderDetails(String variable) {
        this(CfsWareHouseHeaderDetails.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseHeaderDetails(Path<? extends CfsWareHouseHeaderDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseHeaderDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseHeaderDetails(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseHeaderDetails.class, metadata, inits);
    }

    public QCfsWareHouseHeaderDetails(Class<? extends CfsWareHouseHeaderDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cfsCustoms = inits.isInitialized("cfsCustoms") ? new QCfsWareHouseCustoms(forProperty("cfsCustoms"), inits.get("cfsCustoms")) : null;
        this.cfsPackageDetail = inits.isInitialized("cfsPackageDetail") ? new QCfsWareHousePackageDetail(forProperty("cfsPackageDetail"), inits.get("cfsPackageDetail")) : null;
        this.serviceDetails = inits.isInitialized("serviceDetails") ? new QServiceDetails(forProperty("serviceDetails"), inits.get("serviceDetails")) : null;
    }

}

