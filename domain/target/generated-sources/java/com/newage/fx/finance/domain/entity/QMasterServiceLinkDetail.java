package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterServiceLinkDetail is a Querydsl query type for MasterServiceLinkDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterServiceLinkDetail extends EntityPathBase<MasterServiceLinkDetail> {

    private static final long serialVersionUID = -1633988977L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterServiceLinkDetail masterServiceLinkDetail = new QMasterServiceLinkDetail("masterServiceLinkDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

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

    public final NumberPath<Long> masterHeaderId = createNumber("masterHeaderId", Long.class);

    public final QMasterServiceDetail masterServiceDetail;

    public final NumberPath<Long> serviceBranchId = createNumber("serviceBranchId", Long.class);

    public final NumberPath<Long> serviceCompanyId = createNumber("serviceCompanyId", Long.class);

    public final NumberPath<Long> serviceGroupCompanyId = createNumber("serviceGroupCompanyId", Long.class);

    public final NumberPath<Long> shipmentId = createNumber("shipmentId", Long.class);

    public final QShipmentServiceDetail shipmentService;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterServiceLinkDetail(String variable) {
        this(MasterServiceLinkDetail.class, forVariable(variable), INITS);
    }

    public QMasterServiceLinkDetail(Path<? extends MasterServiceLinkDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterServiceLinkDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterServiceLinkDetail(PathMetadata metadata, PathInits inits) {
        this(MasterServiceLinkDetail.class, metadata, inits);
    }

    public QMasterServiceLinkDetail(Class<? extends MasterServiceLinkDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterServiceDetail = inits.isInitialized("masterServiceDetail") ? new QMasterServiceDetail(forProperty("masterServiceDetail"), inits.get("masterServiceDetail")) : null;
        this.shipmentService = inits.isInitialized("shipmentService") ? new QShipmentServiceDetail(forProperty("shipmentService"), inits.get("shipmentService")) : null;
    }

}

