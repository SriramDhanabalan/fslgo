package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransportDocumentLogHistory is a Querydsl query type for TransportDocumentLogHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransportDocumentLogHistory extends EntityPathBase<TransportDocumentLogHistory> {

    private static final long serialVersionUID = 599509509L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransportDocumentLogHistory transportDocumentLogHistory = new QTransportDocumentLogHistory("transportDocumentLogHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath action = createString("action");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterTransportDocumentAir masterTransportDocumentAir;

    public final QMasterTransportDocumentOcean masterTransportDocumentOcean;

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportDocumentType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.TransportDocumentType.class);

    public final QTransportDocumentAir transportDocumentAir;

    public final QTransportDocumentOcean transportDocumentOcean;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTransportDocumentLogHistory(String variable) {
        this(TransportDocumentLogHistory.class, forVariable(variable), INITS);
    }

    public QTransportDocumentLogHistory(Path<? extends TransportDocumentLogHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransportDocumentLogHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransportDocumentLogHistory(PathMetadata metadata, PathInits inits) {
        this(TransportDocumentLogHistory.class, metadata, inits);
    }

    public QTransportDocumentLogHistory(Class<? extends TransportDocumentLogHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterTransportDocumentAir = inits.isInitialized("masterTransportDocumentAir") ? new QMasterTransportDocumentAir(forProperty("masterTransportDocumentAir"), inits.get("masterTransportDocumentAir")) : null;
        this.masterTransportDocumentOcean = inits.isInitialized("masterTransportDocumentOcean") ? new QMasterTransportDocumentOcean(forProperty("masterTransportDocumentOcean"), inits.get("masterTransportDocumentOcean")) : null;
        this.transportDocumentAir = inits.isInitialized("transportDocumentAir") ? new QTransportDocumentAir(forProperty("transportDocumentAir"), inits.get("transportDocumentAir")) : null;
        this.transportDocumentOcean = inits.isInitialized("transportDocumentOcean") ? new QTransportDocumentOcean(forProperty("transportDocumentOcean"), inits.get("transportDocumentOcean")) : null;
    }

}

