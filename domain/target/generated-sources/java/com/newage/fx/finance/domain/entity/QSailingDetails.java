package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSailingDetails is a Querydsl query type for SailingDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingDetails extends EntityPathBase<SailingDetails> {

    private static final long serialVersionUID = 423244864L;

    public static final QSailingDetails sailingDetails = new QSailingDetails("sailingDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> aesCutOffDate = createDateTime("aesCutOffDate", java.util.Date.class);

    public final StringPath aesCutOffTime = createString("aesCutOffTime");

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

    public final DateTimePath<java.util.Date> originCutOffDate = createDateTime("originCutOffDate", java.util.Date.class);

    public final StringPath originCutOffTime = createString("originCutOffTime");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final StringPath portOfdischarge = createString("portOfdischarge");

    public final NumberPath<Long> portOfDischargeId = createNumber("portOfDischargeId", Long.class);

    public final StringPath portOfLoading = createString("portOfLoading");

    public final NumberPath<Long> portOfLoadingId = createNumber("portOfLoadingId", Long.class);

    public final DateTimePath<java.util.Date> rotationDate = createDateTime("rotationDate", java.util.Date.class);

    public final StringPath rotationNumber = createString("rotationNumber");

    public final StringPath scheduleId = createString("scheduleId");

    public final StringPath service = createString("service");

    public final StringPath transitLrdToPort = createString("transitLrdToPort");

    public final StringPath transitPortToPort = createString("transitPortToPort");

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath viaNumber = createString("viaNumber");

    public final StringPath voyageNumber = createString("voyageNumber");

    public QSailingDetails(String variable) {
        super(SailingDetails.class, forVariable(variable));
    }

    public QSailingDetails(Path<? extends SailingDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSailingDetails(PathMetadata metadata) {
        super(SailingDetails.class, metadata);
    }

}

