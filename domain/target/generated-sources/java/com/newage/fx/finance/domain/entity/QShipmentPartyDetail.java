package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentPartyDetail is a Querydsl query type for ShipmentPartyDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentPartyDetail extends EntityPathBase<ShipmentPartyDetail> {

    private static final long serialVersionUID = 1951125678L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentPartyDetail shipmentPartyDetail = new QShipmentPartyDetail("shipmentPartyDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final QPartyAddressDetail consigneeAddress;

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final StringPath consigneeName = createString("consigneeName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QPartyAddressDetail customHouseAgentAddress;

    public final NumberPath<Long> customHouseAgentId = createNumber("customHouseAgentId", Long.class);

    public final QPartyAddressDetail destinationAgentAddress;

    public final NumberPath<Long> destinationAgentId = createNumber("destinationAgentId", Long.class);

    public final StringPath destinationAgentName = createString("destinationAgentName");

    public final QPartyAddressDetail forwarderAddress;

    public final NumberPath<Long> forwarderId = createNumber("forwarderId", Long.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isAgentNameEdited = createBoolean("isAgentNameEdited");

    public final BooleanPath isConsigneeNameEdited = createBoolean("isConsigneeNameEdited");

    public final BooleanPath isShipperNameEdited = createBoolean("isShipperNameEdited");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QPartyAddressDetail notifyOneAddress;

    public final NumberPath<Long> notifyOneId = createNumber("notifyOneId", Long.class);

    public final QPartyAddressDetail notifyTwoAddress;

    public final NumberPath<Long> notifyTwoId = createNumber("notifyTwoId", Long.class);

    public final QPartyAddressDetail originAgentAddress;

    public final NumberPath<Long> originAgentId = createNumber("originAgentId", Long.class);

    public final StringPath originAgentName = createString("originAgentName");

    public final QShipmentHeader shipmentHeader;

    public final QPartyAddressDetail shipperAddress;

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public final StringPath shipperName = createString("shipperName");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QShipmentPartyDetail(String variable) {
        this(ShipmentPartyDetail.class, forVariable(variable), INITS);
    }

    public QShipmentPartyDetail(Path<? extends ShipmentPartyDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentPartyDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentPartyDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentPartyDetail.class, metadata, inits);
    }

    public QShipmentPartyDetail(Class<? extends ShipmentPartyDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeAddress = inits.isInitialized("consigneeAddress") ? new QPartyAddressDetail(forProperty("consigneeAddress"), inits.get("consigneeAddress")) : null;
        this.customHouseAgentAddress = inits.isInitialized("customHouseAgentAddress") ? new QPartyAddressDetail(forProperty("customHouseAgentAddress"), inits.get("customHouseAgentAddress")) : null;
        this.destinationAgentAddress = inits.isInitialized("destinationAgentAddress") ? new QPartyAddressDetail(forProperty("destinationAgentAddress"), inits.get("destinationAgentAddress")) : null;
        this.forwarderAddress = inits.isInitialized("forwarderAddress") ? new QPartyAddressDetail(forProperty("forwarderAddress"), inits.get("forwarderAddress")) : null;
        this.notifyOneAddress = inits.isInitialized("notifyOneAddress") ? new QPartyAddressDetail(forProperty("notifyOneAddress"), inits.get("notifyOneAddress")) : null;
        this.notifyTwoAddress = inits.isInitialized("notifyTwoAddress") ? new QPartyAddressDetail(forProperty("notifyTwoAddress"), inits.get("notifyTwoAddress")) : null;
        this.originAgentAddress = inits.isInitialized("originAgentAddress") ? new QPartyAddressDetail(forProperty("originAgentAddress"), inits.get("originAgentAddress")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
        this.shipperAddress = inits.isInitialized("shipperAddress") ? new QPartyAddressDetail(forProperty("shipperAddress"), inits.get("shipperAddress")) : null;
    }

}

