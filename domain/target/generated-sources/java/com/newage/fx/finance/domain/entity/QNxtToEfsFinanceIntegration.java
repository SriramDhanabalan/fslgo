package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNxtToEfsFinanceIntegration is a Querydsl query type for NxtToEfsFinanceIntegration
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNxtToEfsFinanceIntegration extends EntityPathBase<NxtToEfsFinanceIntegration> {

    private static final long serialVersionUID = -240673482L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNxtToEfsFinanceIntegration nxtToEfsFinanceIntegration = new QNxtToEfsFinanceIntegration("nxtToEfsFinanceIntegration");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath efsBranchCode = createString("efsBranchCode");

    public final StringPath efsCompanyCode = createString("efsCompanyCode");

    public final StringPath efsConfirmationDate = createString("efsConfirmationDate");

    public final StringPath efsConfirmationUser = createString("efsConfirmationUser");

    public final StringPath efsJobId = createString("efsJobId");

    public final StringPath efsJobNo = createString("efsJobNo");

    public final StringPath efsLocationCode = createString("efsLocationCode");

    public final StringPath efsSegmentCode = createString("efsSegmentCode");

    public final StringPath errorMessage = createString("errorMessage");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isServiceJob = createString("isServiceJob");

    public final EnumPath<com.newage.fx.finance.domain.enums.JobCompletedStatus> jobCompletedStatus = createEnum("jobCompletedStatus", com.newage.fx.finance.domain.enums.JobCompletedStatus.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.JobType> jobType = createEnum("jobType", com.newage.fx.finance.domain.enums.JobType.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final StringPath nxtJobId = createString("nxtJobId");

    public final StringPath productCode = createString("productCode");

    public final StringPath sassId = createString("sassId");

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QNxtToEfsFinanceIntegration(String variable) {
        this(NxtToEfsFinanceIntegration.class, forVariable(variable), INITS);
    }

    public QNxtToEfsFinanceIntegration(Path<? extends NxtToEfsFinanceIntegration> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNxtToEfsFinanceIntegration(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNxtToEfsFinanceIntegration(PathMetadata metadata, PathInits inits) {
        this(NxtToEfsFinanceIntegration.class, metadata, inits);
    }

    public QNxtToEfsFinanceIntegration(Class<? extends NxtToEfsFinanceIntegration> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

