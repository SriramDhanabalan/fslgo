package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentServiceAddlDetail is a Querydsl query type for ShipmentServiceAddlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentServiceAddlDetail extends EntityPathBase<ShipmentServiceAddlDetail> {

    private static final long serialVersionUID = -1684782776L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentServiceAddlDetail shipmentServiceAddlDetail = new QShipmentServiceAddlDetail("shipmentServiceAddlDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chaAddressId = createNumber("chaAddressId", Long.class);

    public final NumberPath<Long> chaId = createNumber("chaId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> coLoad = createEnum("coLoad", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QPartyAddressDetail coLoaderAddressId;

    public final NumberPath<Long> coLoaderId = createNumber("coLoaderId", Long.class);

    public final StringPath coLoaderName = createString("coLoaderName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> employeeId = createNumber("employeeId", Long.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath internalNote = createString("internalNote");

    public final BooleanPath isCoLoaderNameEdited = createBoolean("isCoLoaderNameEdited");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> rateId = createNumber("rateId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> rateRequestModification = createEnum("rateRequestModification", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.RateModificationStatus> rateRequestModificationStatus = createEnum("rateRequestModificationStatus", com.newage.fx.finance.domain.enums.RateModificationStatus.class);

    public final StringPath rateType = createString("rateType");

    public final QShipmentServiceDetail serviceDetail;

    public final NumberPath<Long> shipmentId = createNumber("shipmentId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentServiceAddlDetail(String variable) {
        this(ShipmentServiceAddlDetail.class, forVariable(variable), INITS);
    }

    public QShipmentServiceAddlDetail(Path<? extends ShipmentServiceAddlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentServiceAddlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentServiceAddlDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentServiceAddlDetail.class, metadata, inits);
    }

    public QShipmentServiceAddlDetail(Class<? extends ShipmentServiceAddlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coLoaderAddressId = inits.isInitialized("coLoaderAddressId") ? new QPartyAddressDetail(forProperty("coLoaderAddressId"), inits.get("coLoaderAddressId")) : null;
        this.serviceDetail = inits.isInitialized("serviceDetail") ? new QShipmentServiceDetail(forProperty("serviceDetail"), inits.get("serviceDetail")) : null;
    }

}

