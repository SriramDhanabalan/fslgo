package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleVesselDetails is a Querydsl query type for SailingScheduleVesselDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleVesselDetails extends EntityPathBase<SailingScheduleVesselDetails> {

    private static final long serialVersionUID = -1386457261L;

    public static final QSailingScheduleVesselDetails sailingScheduleVesselDetails = new QSailingScheduleVesselDetails("sailingScheduleVesselDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final StringPath designation = createString("designation");

    public final StringPath designationCode = createString("designationCode");

    public final StringPath DestCountryCode = createString("DestCountryCode");

    public final StringPath DestCountryName = createString("DestCountryName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath importExport = createString("importExport");

    public final StringPath iscoLoad = createString("iscoLoad");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lineNo = createString("lineNo");

    public final StringPath OptionNo = createString("OptionNo");

    public final StringPath originCode = createString("originCode");

    public final StringPath originCountryCode = createString("originCountryCode");

    public final StringPath portOfDischarge = createString("portOfDischarge");

    public final NumberPath<Long> portOfDischargeId = createNumber("portOfDischargeId", Long.class);

    public final StringPath portOfLoading = createString("portOfLoading");

    public final NumberPath<Long> portOfLoadingId = createNumber("portOfLoadingId", Long.class);

    public final StringPath rotationNumber = createString("rotationNumber");

    public final ListPath<SailingScheduleDetails, QSailingScheduleDetails> sailingScheduleDetails = this.<SailingScheduleDetails, QSailingScheduleDetails>createList("sailingScheduleDetails", SailingScheduleDetails.class, QSailingScheduleDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> ScheduleId = createNumber("ScheduleId", Long.class);

    public final DateTimePath<java.util.Date> stuffingDate = createDateTime("stuffingDate", java.util.Date.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath viaNumber = createString("viaNumber");

    public final StringPath voyageNumber = createString("voyageNumber");

    public QSailingScheduleVesselDetails(String variable) {
        super(SailingScheduleVesselDetails.class, forVariable(variable));
    }

    public QSailingScheduleVesselDetails(Path<? extends SailingScheduleVesselDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSailingScheduleVesselDetails(PathMetadata metadata) {
        super(SailingScheduleVesselDetails.class, metadata);
    }

}

