package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleDetails is a Querydsl query type for SailingScheduleDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleDetails extends EntityPathBase<SailingScheduleDetails> {

    private static final long serialVersionUID = 63607721L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleDetails sailingScheduleDetails = new QSailingScheduleDetails("sailingScheduleDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> aesCutOffDate = createDateTime("aesCutOffDate", java.util.Date.class);

    public final StringPath aesCutOffTime = createString("aesCutOffTime");

    public final QCarrierBookingDetails carrierBookingDetails;

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final DateTimePath<java.util.Date> cfsCutOffDateTime = createDateTime("cfsCutOffDateTime", java.util.Date.class);

    public final NumberPath<Long> cfsId = createNumber("cfsId", Long.class);

    public final StringPath cfsName = createString("cfsName");

    public final NumberPath<Long> coLoaderId = createNumber("coLoaderId", Long.class);

    public final StringPath coLoaderName = createString("coLoaderName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath destinationCode = createString("destinationCode");

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final StringPath divisionName = createString("divisionName");

    public final DateTimePath<java.util.Date> estLoadingDate = createDateTime("estLoadingDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imoNumber = createString("imoNumber");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath note = createString("note");

    public final StringPath originCode = createString("originCode");

    public final DateTimePath<java.util.Date> originCutOffDate = createDateTime("originCutOffDate", java.util.Date.class);

    public final StringPath originCutOffTime = createString("originCutOffTime");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final StringPath portName = createString("portName");

    public final StringPath portOfdischarge = createString("portOfdischarge");

    public final NumberPath<Long> portOfDischargeId = createNumber("portOfDischargeId", Long.class);

    public final StringPath portOfLoading = createString("portOfLoading");

    public final NumberPath<Long> portOfLoadingId = createNumber("portOfLoadingId", Long.class);

    public final DateTimePath<java.util.Date> rotationDate = createDateTime("rotationDate", java.util.Date.class);

    public final StringPath rotationNumber = createString("rotationNumber");

    public final ListPath<SailingScheduleEvents, QSailingScheduleEvents> sailingScheduleEvents = this.<SailingScheduleEvents, QSailingScheduleEvents>createList("sailingScheduleEvents", SailingScheduleEvents.class, QSailingScheduleEvents.class, PathInits.DIRECT2);

    public final ListPath<SailingScheduleRoutings, QSailingScheduleRoutings> sailingScheduleRoutings = this.<SailingScheduleRoutings, QSailingScheduleRoutings>createList("sailingScheduleRoutings", SailingScheduleRoutings.class, QSailingScheduleRoutings.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.SailingScheduleStatus> sailingScheduleStatus = createEnum("sailingScheduleStatus", com.newage.fx.finance.domain.enums.SailingScheduleStatus.class);

    public final QSailingScheduleVesselDetails sailingScheduleVesselDetails;

    public final StringPath scheduleId = createString("scheduleId");

    public final StringPath service = createString("service");

    public final StringPath transitLrdToPort = createString("transitLrdToPort");

    public final StringPath transitPortToPort = createString("transitPortToPort");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath viaNumber = createString("viaNumber");

    public final StringPath voyageNumber = createString("voyageNumber");

    public QSailingScheduleDetails(String variable) {
        this(SailingScheduleDetails.class, forVariable(variable), INITS);
    }

    public QSailingScheduleDetails(Path<? extends SailingScheduleDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleDetails(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleDetails.class, metadata, inits);
    }

    public QSailingScheduleDetails(Class<? extends SailingScheduleDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.carrierBookingDetails = inits.isInitialized("carrierBookingDetails") ? new QCarrierBookingDetails(forProperty("carrierBookingDetails"), inits.get("carrierBookingDetails")) : null;
        this.sailingScheduleVesselDetails = inits.isInitialized("sailingScheduleVesselDetails") ? new QSailingScheduleVesselDetails(forProperty("sailingScheduleVesselDetails")) : null;
    }

}

