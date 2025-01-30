package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentServiceDetail is a Querydsl query type for ShipmentServiceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentServiceDetail extends EntityPathBase<ShipmentServiceDetail> {

    private static final long serialVersionUID = 1640958845L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentServiceDetail shipmentServiceDetail = new QShipmentServiceDetail("shipmentServiceDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QPartyAddressDetail billingCustomerAddress;

    public final NumberPath<Long> billingCustomerId = createNumber("billingCustomerId", Long.class);

    public final StringPath bookingPerson = createString("bookingPerson");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath branchName = createString("branchName");

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceType> businessType = createEnum("businessType", com.newage.fx.finance.domain.enums.ServiceType.class);

    public final QCfsDeliveryHeaderDetails cfsDeliveryHeaderDetail;

    public final ListPath<CfsWareHouseShipmentMap, QCfsWareHouseShipmentMap> cfsWareHouseShipmentMaps = this.<CfsWareHouseShipmentMap, QCfsWareHouseShipmentMap>createList("cfsWareHouseShipmentMaps", CfsWareHouseShipmentMap.class, QCfsWareHouseShipmentMap.class, PathInits.DIRECT2);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> csId = createNumber("csId", Long.class);

    public final StringPath exportRef = createString("exportRef");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath importRef = createString("importRef");

    public final StringPath jobId = createString("jobId");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterServiceLinkDetail linkDetailList;

    public final ListPath<ShipmentCancellationLogHistory, QShipmentCancellationLogHistory> logHistories = this.<ShipmentCancellationLogHistory, QShipmentCancellationLogHistory>createList("logHistories", ShipmentCancellationLogHistory.class, QShipmentCancellationLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.OtherTrade> otherTrade = createEnum("otherTrade", com.newage.fx.finance.domain.enums.OtherTrade.class);

    public final QShipmentServiceAddlDetail serviceAddlDetail;

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> serviceCode = createEnum("serviceCode", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final StringPath serviceDivision = createString("serviceDivision");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentCreationMode> serviceMode = createEnum("serviceMode", com.newage.fx.finance.domain.enums.ShipmentCreationMode.class);

    public final StringPath serviceName = createString("serviceName");

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentStatus> serviceStatus = createEnum("serviceStatus", com.newage.fx.finance.domain.enums.ShipmentStatus.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final DateTimePath<java.util.Date> shipmentDate = createDateTime("shipmentDate", java.util.Date.class);

    public final QShipmentHeader shipmentHeader;

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> tradeCode = createEnum("tradeCode", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentServiceDetail(String variable) {
        this(ShipmentServiceDetail.class, forVariable(variable), INITS);
    }

    public QShipmentServiceDetail(Path<? extends ShipmentServiceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentServiceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentServiceDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentServiceDetail.class, metadata, inits);
    }

    public QShipmentServiceDetail(Class<? extends ShipmentServiceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.billingCustomerAddress = inits.isInitialized("billingCustomerAddress") ? new QPartyAddressDetail(forProperty("billingCustomerAddress"), inits.get("billingCustomerAddress")) : null;
        this.cfsDeliveryHeaderDetail = inits.isInitialized("cfsDeliveryHeaderDetail") ? new QCfsDeliveryHeaderDetails(forProperty("cfsDeliveryHeaderDetail"), inits.get("cfsDeliveryHeaderDetail")) : null;
        this.linkDetailList = inits.isInitialized("linkDetailList") ? new QMasterServiceLinkDetail(forProperty("linkDetailList"), inits.get("linkDetailList")) : null;
        this.serviceAddlDetail = inits.isInitialized("serviceAddlDetail") ? new QShipmentServiceAddlDetail(forProperty("serviceAddlDetail"), inits.get("serviceAddlDetail")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

