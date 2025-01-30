package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNxtToEfsServiceMasterEntity is a Querydsl query type for NxtToEfsServiceMasterEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNxtToEfsServiceMasterEntity extends EntityPathBase<NxtToEfsServiceMasterEntity> {

    private static final long serialVersionUID = -267783138L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNxtToEfsServiceMasterEntity nxtToEfsServiceMasterEntity = new QNxtToEfsServiceMasterEntity("nxtToEfsServiceMasterEntity");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath efsBranchCode = createString("efsBranchCode");

    public final StringPath efsCompanyCode = createString("efsCompanyCode");

    public final StringPath efsJobId = createString("efsJobId");

    public final StringPath efsJobNo = createString("efsJobNo");

    public final StringPath efsLocationCode = createString("efsLocationCode");

    public final StringPath efsSegmentCode = createString("efsSegmentCode");

    public final StringPath errorNote = createString("errorNote");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.JobCompletedStatus> jobCompletedStatus = createEnum("jobCompletedStatus", com.newage.fx.finance.domain.enums.JobCompletedStatus.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath nxtJobId = createString("nxtJobId");

    public final StringPath sassId = createString("sassId");

    public final StringPath serviceCode = createString("serviceCode");

    public final NumberPath<Long> serviceMasterId = createNumber("serviceMasterId", Long.class);

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QNxtToEfsServiceMasterEntity(String variable) {
        this(NxtToEfsServiceMasterEntity.class, forVariable(variable), INITS);
    }

    public QNxtToEfsServiceMasterEntity(Path<? extends NxtToEfsServiceMasterEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNxtToEfsServiceMasterEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNxtToEfsServiceMasterEntity(PathMetadata metadata, PathInits inits) {
        this(NxtToEfsServiceMasterEntity.class, metadata, inits);
    }

    public QNxtToEfsServiceMasterEntity(Class<? extends NxtToEfsServiceMasterEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

