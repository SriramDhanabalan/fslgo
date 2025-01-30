package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceMasterShipmentPartyDetail is a Querydsl query type for ServiceMasterShipmentPartyDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServiceMasterShipmentPartyDetail extends EntityPathBase<ServiceMasterShipmentPartyDetail> {

    private static final long serialVersionUID = 306057653L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceMasterShipmentPartyDetail serviceMasterShipmentPartyDetail = new QServiceMasterShipmentPartyDetail("serviceMasterShipmentPartyDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableWeight = createNumber("chargeableWeight", Double.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final QPartyAddressDetail consigneeAddress;

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final StringPath consigneeName = createString("consigneeName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final StringPath hblHawbNumber = createString("hblHawbNumber");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final StringPath oblMawbNumber = createString("oblMawbNumber");

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final QPartyAddressDetail shipperAddress;

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public final StringPath shipperName = createString("shipperName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volume = createNumber("volume", Double.class);

    public final NumberPath<Double> volumeWeight = createNumber("volumeWeight", Double.class);

    public QServiceMasterShipmentPartyDetail(String variable) {
        this(ServiceMasterShipmentPartyDetail.class, forVariable(variable), INITS);
    }

    public QServiceMasterShipmentPartyDetail(Path<? extends ServiceMasterShipmentPartyDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceMasterShipmentPartyDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceMasterShipmentPartyDetail(PathMetadata metadata, PathInits inits) {
        this(ServiceMasterShipmentPartyDetail.class, metadata, inits);
    }

    public QServiceMasterShipmentPartyDetail(Class<? extends ServiceMasterShipmentPartyDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeAddress = inits.isInitialized("consigneeAddress") ? new QPartyAddressDetail(forProperty("consigneeAddress"), inits.get("consigneeAddress")) : null;
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
        this.shipperAddress = inits.isInitialized("shipperAddress") ? new QPartyAddressDetail(forProperty("shipperAddress"), inits.get("shipperAddress")) : null;
    }

}

