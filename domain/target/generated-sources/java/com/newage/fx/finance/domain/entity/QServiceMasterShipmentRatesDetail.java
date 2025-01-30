package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceMasterShipmentRatesDetail is a Querydsl query type for ServiceMasterShipmentRatesDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QServiceMasterShipmentRatesDetail extends EntityPathBase<ServiceMasterShipmentRatesDetail> {

    private static final long serialVersionUID = 284774562L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceMasterShipmentRatesDetail serviceMasterShipmentRatesDetail = new QServiceMasterShipmentRatesDetail("serviceMasterShipmentRatesDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final NumberPath<Double> amountPerUnit = createNumber("amountPerUnit", Double.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final NumberPath<Double> currencyRoe = createNumber("currencyRoe", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> noOfUnit = createNumber("noOfUnit", Double.class);

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> term = createEnum("term", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QServiceMasterShipmentRatesDetail(String variable) {
        this(ServiceMasterShipmentRatesDetail.class, forVariable(variable), INITS);
    }

    public QServiceMasterShipmentRatesDetail(Path<? extends ServiceMasterShipmentRatesDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceMasterShipmentRatesDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceMasterShipmentRatesDetail(PathMetadata metadata, PathInits inits) {
        this(ServiceMasterShipmentRatesDetail.class, metadata, inits);
    }

    public QServiceMasterShipmentRatesDetail(Class<? extends ServiceMasterShipmentRatesDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
    }

}

