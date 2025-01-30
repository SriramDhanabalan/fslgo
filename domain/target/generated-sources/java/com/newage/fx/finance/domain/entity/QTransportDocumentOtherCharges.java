package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransportDocumentOtherCharges is a Querydsl query type for TransportDocumentOtherCharges
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransportDocumentOtherCharges extends EntityPathBase<TransportDocumentOtherCharges> {

    private static final long serialVersionUID = -1979211996L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransportDocumentOtherCharges transportDocumentOtherCharges = new QTransportDocumentOtherCharges("transportDocumentOtherCharges");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> collectAmount = createNumber("collectAmount", Double.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath currencyCode = createString("currencyCode");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.MAWBCharges> due = createEnum("due", com.newage.fx.finance.domain.enums.MAWBCharges.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath localAmount = createString("localAmount");

    public final QMasterTransportDocumentAir masterTransportDocumentAir;

    public final QMasterTransportDocumentOcean masterTransportDocumentOcean;

    public final NumberPath<Long> otherChargeId = createNumber("otherChargeId", Long.class);

    public final StringPath otherChargeName = createString("otherChargeName");

    public final NumberPath<Double> perUnit = createNumber("perUnit", Double.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> ppOrCc = createEnum("ppOrCc", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Double> prepaidAmount = createNumber("prepaidAmount", Double.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportDocumentType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.TransportDocumentType.class);

    public final QTransportDocumentAir transportDocumentAir;

    public final QTransportDocumentOcean transportDocumentOcean;

    public final StringPath unitCode = createString("unitCode");

    public final NumberPath<Long> unitId = createNumber("unitId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTransportDocumentOtherCharges(String variable) {
        this(TransportDocumentOtherCharges.class, forVariable(variable), INITS);
    }

    public QTransportDocumentOtherCharges(Path<? extends TransportDocumentOtherCharges> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransportDocumentOtherCharges(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransportDocumentOtherCharges(PathMetadata metadata, PathInits inits) {
        this(TransportDocumentOtherCharges.class, metadata, inits);
    }

    public QTransportDocumentOtherCharges(Class<? extends TransportDocumentOtherCharges> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterTransportDocumentAir = inits.isInitialized("masterTransportDocumentAir") ? new QMasterTransportDocumentAir(forProperty("masterTransportDocumentAir"), inits.get("masterTransportDocumentAir")) : null;
        this.masterTransportDocumentOcean = inits.isInitialized("masterTransportDocumentOcean") ? new QMasterTransportDocumentOcean(forProperty("masterTransportDocumentOcean"), inits.get("masterTransportDocumentOcean")) : null;
        this.transportDocumentAir = inits.isInitialized("transportDocumentAir") ? new QTransportDocumentAir(forProperty("transportDocumentAir"), inits.get("transportDocumentAir")) : null;
        this.transportDocumentOcean = inits.isInitialized("transportDocumentOcean") ? new QTransportDocumentOcean(forProperty("transportDocumentOcean"), inits.get("transportDocumentOcean")) : null;
    }

}

