package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleHeaderDetails is a Querydsl query type for SailingScheduleHeaderDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleHeaderDetails extends EntityPathBase<SailingScheduleHeaderDetails> {

    private static final long serialVersionUID = 1226233628L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleHeaderDetails sailingScheduleHeaderDetails = new QSailingScheduleHeaderDetails("sailingScheduleHeaderDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCarrierBookingDetails carrierBookingDetails;

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final DateTimePath<java.util.Date> cfsCutOffDate = createDateTime("cfsCutOffDate", java.util.Date.class);

    public final StringPath cfsCutOffTime = createString("cfsCutOffTime");

    public final NumberPath<Long> cfsId = createNumber("cfsId", Long.class);

    public final StringPath cfsName = createString("cfsName");

    public final NumberPath<Long> coLoaderId = createNumber("coLoaderId", Long.class);

    public final StringPath coLoaderName = createString("coLoaderName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final ListPath<SailingScheduleConnectionDetails, QSailingScheduleConnectionDetails> connectionDetails = this.<SailingScheduleConnectionDetails, QSailingScheduleConnectionDetails>createList("connectionDetails", SailingScheduleConnectionDetails.class, QSailingScheduleConnectionDetails.class, PathInits.DIRECT2);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final StringPath divisionName = createString("divisionName");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imoNumber = createString("imoNumber");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> loadPortCutoffDate = createDateTime("loadPortCutoffDate", java.util.Date.class);

    public final StringPath loadPortCutoffTime = createString("loadPortCutoffTime");

    public final StringPath note = createString("note");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final DateTimePath<java.util.Date> rotationDate = createDateTime("rotationDate", java.util.Date.class);

    public final StringPath rotationNumber = createString("rotationNumber");

    public final StringPath routeNo = createString("routeNo");

    public final StringPath scheduleId = createString("scheduleId");

    public final ListPath<SailingScheduleMappedShipments, QSailingScheduleMappedShipments> scheduleMappedShipments = this.<SailingScheduleMappedShipments, QSailingScheduleMappedShipments>createList("scheduleMappedShipments", SailingScheduleMappedShipments.class, QSailingScheduleMappedShipments.class, PathInits.DIRECT2);

    public final StringPath scheduleMode = createString("scheduleMode");

    public final StringPath service = createString("service");

    public final EnumPath<com.newage.fx.finance.domain.enums.SailingScheduleStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.SailingScheduleStatus.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath viaNumber = createString("viaNumber");

    public QSailingScheduleHeaderDetails(String variable) {
        this(SailingScheduleHeaderDetails.class, forVariable(variable), INITS);
    }

    public QSailingScheduleHeaderDetails(Path<? extends SailingScheduleHeaderDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleHeaderDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleHeaderDetails(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleHeaderDetails.class, metadata, inits);
    }

    public QSailingScheduleHeaderDetails(Class<? extends SailingScheduleHeaderDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
    }

}

