package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransportDocumentContainerDetails is a Querydsl query type for TransportDocumentContainerDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransportDocumentContainerDetails extends EntityPathBase<TransportDocumentContainerDetails> {

    private static final long serialVersionUID = 1217309718L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransportDocumentContainerDetails transportDocumentContainerDetails = new QTransportDocumentContainerDetails("transportDocumentContainerDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath containerDetails = createString("containerDetails");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final StringPath grossWeight = createString("grossWeight");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterTransportDocumentOcean masterTransportDocumentOcean;

    public final StringPath measurement = createString("measurement");

    public final NumberPath<Integer> noOfPackage = createNumber("noOfPackage", Integer.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final QTransportDocumentOcean transportDocumentOcean;

    public final NumberPath<Long> transportDocumentSlNo = createNumber("transportDocumentSlNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTransportDocumentContainerDetails(String variable) {
        this(TransportDocumentContainerDetails.class, forVariable(variable), INITS);
    }

    public QTransportDocumentContainerDetails(Path<? extends TransportDocumentContainerDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransportDocumentContainerDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransportDocumentContainerDetails(PathMetadata metadata, PathInits inits) {
        this(TransportDocumentContainerDetails.class, metadata, inits);
    }

    public QTransportDocumentContainerDetails(Class<? extends TransportDocumentContainerDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterTransportDocumentOcean = inits.isInitialized("masterTransportDocumentOcean") ? new QMasterTransportDocumentOcean(forProperty("masterTransportDocumentOcean"), inits.get("masterTransportDocumentOcean")) : null;
        this.transportDocumentOcean = inits.isInitialized("transportDocumentOcean") ? new QTransportDocumentOcean(forProperty("transportDocumentOcean"), inits.get("transportDocumentOcean")) : null;
    }

}

