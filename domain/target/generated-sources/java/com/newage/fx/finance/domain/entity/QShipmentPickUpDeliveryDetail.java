package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentPickUpDeliveryDetail is a Querydsl query type for ShipmentPickUpDeliveryDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentPickUpDeliveryDetail extends EntityPathBase<ShipmentPickUpDeliveryDetail> {

    private static final long serialVersionUID = -1240656086L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentPickUpDeliveryDetail shipmentPickUpDeliveryDetail = new QShipmentPickUpDeliveryDetail("shipmentPickUpDeliveryDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> actualDeliveryDate = createDateTime("actualDeliveryDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> actualOrginCfsArrivalDate = createDateTime("actualOrginCfsArrivalDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> actualPickupDate = createDateTime("actualPickupDate", java.util.Date.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath cfsTransporterContactName = createString("cfsTransporterContactName");

    public final StringPath cfsTransporterEmail = createString("cfsTransporterEmail");

    public final NumberPath<Long> cfsTransporterId = createNumber("cfsTransporterId", Long.class);

    public final StringPath cfsTransporterMobile = createString("cfsTransporterMobile");

    public final StringPath cfsTransporterPreMobileNo = createString("cfsTransporterPreMobileNo");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> deliveryRequired = createEnum("deliveryRequired", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QPartyAddressDetail deliveryToAddress;

    public final NumberPath<Long> deliveryToId = createNumber("deliveryToId", Long.class);

    public final StringPath deliveryTransporterContactName = createString("deliveryTransporterContactName");

    public final StringPath deliveryTransporterEmail = createString("deliveryTransporterEmail");

    public final NumberPath<Long> deliveryTransporterId = createNumber("deliveryTransporterId", Long.class);

    public final StringPath deliveryTransporterMobile = createString("deliveryTransporterMobile");

    public final StringPath deliveryTransporterPreMobileNo = createString("deliveryTransporterPreMobileNo");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final QPartyAddressDetail orginCfsTerminalAddress;

    public final NumberPath<Long> orginCfsTerminalId = createNumber("orginCfsTerminalId", Long.class);

    public final QPartyAddressDetail pickupFromAddress;

    public final NumberPath<Long> pickupFromId = createNumber("pickupFromId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> pickupRequired = createEnum("pickupRequired", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath pickupTransporterContactName = createString("pickupTransporterContactName");

    public final StringPath pickupTransporterEmail = createString("pickupTransporterEmail");

    public final NumberPath<Long> pickupTransporterId = createNumber("pickupTransporterId", Long.class);

    public final StringPath pickupTransporterMobile = createString("pickupTransporterMobile");

    public final StringPath pickupTransporterPreMobile = createString("pickupTransporterPreMobile");

    public final DateTimePath<java.util.Date> plannedDeliveryDate = createDateTime("plannedDeliveryDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> plannedOrginCfsArrivalDate = createDateTime("plannedOrginCfsArrivalDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> plannedPickupDate = createDateTime("plannedPickupDate", java.util.Date.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> shipmentServiceId = createNumber("shipmentServiceId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentPickUpDeliveryDetail(String variable) {
        this(ShipmentPickUpDeliveryDetail.class, forVariable(variable), INITS);
    }

    public QShipmentPickUpDeliveryDetail(Path<? extends ShipmentPickUpDeliveryDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentPickUpDeliveryDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentPickUpDeliveryDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentPickUpDeliveryDetail.class, metadata, inits);
    }

    public QShipmentPickUpDeliveryDetail(Class<? extends ShipmentPickUpDeliveryDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.deliveryToAddress = inits.isInitialized("deliveryToAddress") ? new QPartyAddressDetail(forProperty("deliveryToAddress"), inits.get("deliveryToAddress")) : null;
        this.orginCfsTerminalAddress = inits.isInitialized("orginCfsTerminalAddress") ? new QPartyAddressDetail(forProperty("orginCfsTerminalAddress"), inits.get("orginCfsTerminalAddress")) : null;
        this.pickupFromAddress = inits.isInitialized("pickupFromAddress") ? new QPartyAddressDetail(forProperty("pickupFromAddress"), inits.get("pickupFromAddress")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

