package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterContainerDetail is a Querydsl query type for MasterContainerDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterContainerDetail extends EntityPathBase<MasterContainerDetail> {

    private static final long serialVersionUID = -21062399L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterContainerDetail masterContainerDetail = new QMasterContainerDetail("masterContainerDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath actualSealNumber = createString("actualSealNumber");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> cfsId = createNumber("cfsId", Long.class);

    public final DateTimePath<java.util.Date> cfsInDate = createDateTime("cfsInDate", java.util.Date.class);

    public final StringPath cfsName = createString("cfsName");

    public final DateTimePath<java.util.Date> cfsOutDate = createDateTime("cfsOutDate", java.util.Date.class);

    public final StringPath commodity = createString("commodity");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> confirmed = createEnum("confirmed", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerName = createString("containerName");

    public final StringPath containerNumber = createString("containerNumber");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customsSealNumber = createString("customsSealNumber");

    public final StringPath damageNote = createString("damageNote");

    public final NumberPath<Long> driverId = createNumber("driverId", Long.class);

    public final StringPath driverName = createString("driverName");

    public final NumberPath<Long> externalNoOfPiece = createNumber("externalNoOfPiece", Long.class);

    public final DateTimePath<java.util.Date> freeDays = createDateTime("freeDays", java.util.Date.class);

    public final StringPath gridNo = createString("gridNo");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> haz = createEnum("haz", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> internalNoOfPiece = createNumber("internalNoOfPiece", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> loadingDate = createDateTime("loadingDate", java.util.Date.class);

    public final StringPath manifestSealNumber = createString("manifestSealNumber");

    public final QMasterHeader masterHeader;

    public final StringPath mobile = createString("mobile");

    public final StringPath note = createString("note");

    public final DateTimePath<java.util.Date> pickupDate = createDateTime("pickupDate", java.util.Date.class);

    public final StringPath pickupYard = createString("pickupYard");

    public final StringPath poNumber = createString("poNumber");

    public final DateTimePath<java.util.Date> portUnloadDate = createDateTime("portUnloadDate", java.util.Date.class);

    public final StringPath referenceNumber = createString("referenceNumber");

    public final ListPath<ShipmentContainerDetail, QShipmentContainerDetail> shipmentContainerDetails = this.<ShipmentContainerDetail, QShipmentContainerDetail>createList("shipmentContainerDetails", ShipmentContainerDetail.class, QShipmentContainerDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> soc = createEnum("soc", com.newage.fx.finance.domain.enums.YesNo.class);

    public final DateTimePath<java.util.Date> stuffingDate = createDateTime("stuffingDate", java.util.Date.class);

    public final StringPath tallied = createString("tallied");

    public final NumberPath<Double> tareWeight = createNumber("tareWeight", Double.class);

    public final StringPath trailerNo = createString("trailerNo");

    public final NumberPath<Long> transporterId = createNumber("transporterId", Long.class);

    public final StringPath transporterName = createString("transporterName");

    public final DateTimePath<java.util.Date> unloadingDate = createDateTime("unloadingDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> unStuffingDate = createDateTime("unStuffingDate", java.util.Date.class);

    public final NumberPath<Long> vehicleId = createNumber("vehicleId", Long.class);

    public final StringPath vehicleName = createString("vehicleName");

    public final NumberPath<Long> vehicleTypeId = createNumber("vehicleTypeId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterContainerDetail(String variable) {
        this(MasterContainerDetail.class, forVariable(variable), INITS);
    }

    public QMasterContainerDetail(Path<? extends MasterContainerDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterContainerDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterContainerDetail(PathMetadata metadata, PathInits inits) {
        this(MasterContainerDetail.class, metadata, inits);
    }

    public QMasterContainerDetail(Class<? extends MasterContainerDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

