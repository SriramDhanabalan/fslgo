package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransportDocumentDetails is a Querydsl query type for TransportDocumentDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransportDocumentDetails extends EntityPathBase<TransportDocumentDetails> {

    private static final long serialVersionUID = -250112755L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransportDocumentDetails transportDocumentDetails = new QTransportDocumentDetails("transportDocumentDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final DateTimePath<java.util.Date> confirmedDate = createDateTime("confirmedDate", java.util.Date.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> draftDate = createDateTime("draftDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> executionDate = createDateTime("executionDate", java.util.Date.class);

    public final NumberPath<Long> executionPlaceId = createNumber("executionPlaceId", Long.class);

    public final StringPath executionPlaceName = createString("executionPlaceName");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterTransportDocumentAir masterTransportDocumentAir;

    public final QMasterTransportDocumentOcean masterTransportDocumentOcean;

    public final StringPath signOfCarrier = createString("signOfCarrier");

    public final StringPath signOfShipper = createString("signOfShipper");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportDocumentType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.TransportDocumentType.class);

    public final QTransportDocumentAir transportDocumentAir;

    public final QTransportDocumentOcean transportDocumentOcean;

    public final NumberPath<Long> transportDocumentSlNo = createNumber("transportDocumentSlNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTransportDocumentDetails(String variable) {
        this(TransportDocumentDetails.class, forVariable(variable), INITS);
    }

    public QTransportDocumentDetails(Path<? extends TransportDocumentDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransportDocumentDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransportDocumentDetails(PathMetadata metadata, PathInits inits) {
        this(TransportDocumentDetails.class, metadata, inits);
    }

    public QTransportDocumentDetails(Class<? extends TransportDocumentDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterTransportDocumentAir = inits.isInitialized("masterTransportDocumentAir") ? new QMasterTransportDocumentAir(forProperty("masterTransportDocumentAir"), inits.get("masterTransportDocumentAir")) : null;
        this.masterTransportDocumentOcean = inits.isInitialized("masterTransportDocumentOcean") ? new QMasterTransportDocumentOcean(forProperty("masterTransportDocumentOcean"), inits.get("masterTransportDocumentOcean")) : null;
        this.transportDocumentAir = inits.isInitialized("transportDocumentAir") ? new QTransportDocumentAir(forProperty("transportDocumentAir"), inits.get("transportDocumentAir")) : null;
        this.transportDocumentOcean = inits.isInitialized("transportDocumentOcean") ? new QTransportDocumentOcean(forProperty("transportDocumentOcean"), inits.get("transportDocumentOcean")) : null;
    }

}

