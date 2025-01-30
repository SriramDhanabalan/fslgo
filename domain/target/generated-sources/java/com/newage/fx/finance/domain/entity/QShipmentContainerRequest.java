package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentContainerRequest is a Querydsl query type for ShipmentContainerRequest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentContainerRequest extends EntityPathBase<ShipmentContainerRequest> {

    private static final long serialVersionUID = 1549562711L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentContainerRequest shipmentContainerRequest = new QShipmentContainerRequest("shipmentContainerRequest");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath containerCode = createString("containerCode");

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfContainer = createNumber("noOfContainer", Integer.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public QShipmentContainerRequest(String variable) {
        this(ShipmentContainerRequest.class, forVariable(variable), INITS);
    }

    public QShipmentContainerRequest(Path<? extends ShipmentContainerRequest> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentContainerRequest(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentContainerRequest(PathMetadata metadata, PathInits inits) {
        this(ShipmentContainerRequest.class, metadata, inits);
    }

    public QShipmentContainerRequest(Class<? extends ShipmentContainerRequest> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

