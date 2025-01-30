package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterServiceDetail is a Querydsl query type for MasterServiceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterServiceDetail extends EntityPathBase<MasterServiceDetail> {

    private static final long serialVersionUID = -1888122891L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterServiceDetail masterServiceDetail = new QMasterServiceDetail("masterServiceDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> agentId = createNumber("agentId", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceType> businessType = createEnum("businessType", com.newage.fx.finance.domain.enums.ServiceType.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final ListPath<MasterServiceLinkDetail, QMasterServiceLinkDetail> linkDetailList = this.<MasterServiceLinkDetail, QMasterServiceLinkDetail>createList("linkDetailList", MasterServiceLinkDetail.class, QMasterServiceLinkDetail.class, PathInits.DIRECT2);

    public final QMasterHeader masterHeader;

    public final ListPath<MasterRatesDetail, QMasterRatesDetail> masterRatesDetail = this.<MasterRatesDetail, QMasterRatesDetail>createList("masterRatesDetail", MasterRatesDetail.class, QMasterRatesDetail.class, PathInits.DIRECT2);

    public final QMasterServiceAddlDetail masterServiceAddlDetail;

    public final StringPath productCode = createString("productCode");

    public final DateTimePath<java.util.Date> serviceDate = createDateTime("serviceDate", java.util.Date.class);

    public final StringPath serviceDivision = createString("serviceDivision");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceMode> serviceMode = createEnum("serviceMode", com.newage.fx.finance.domain.enums.ServiceMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentMasterStatus> serviceStatus = createEnum("serviceStatus", com.newage.fx.finance.domain.enums.ShipmentMasterStatus.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> serviceTrade = createEnum("serviceTrade", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> serviceTransportMode = createEnum("serviceTransportMode", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final StringPath serviceUid = createString("serviceUid");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterServiceDetail(String variable) {
        this(MasterServiceDetail.class, forVariable(variable), INITS);
    }

    public QMasterServiceDetail(Path<? extends MasterServiceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterServiceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterServiceDetail(PathMetadata metadata, PathInits inits) {
        this(MasterServiceDetail.class, metadata, inits);
    }

    public QMasterServiceDetail(Class<? extends MasterServiceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.masterServiceAddlDetail = inits.isInitialized("masterServiceAddlDetail") ? new QMasterServiceAddlDetail(forProperty("masterServiceAddlDetail"), inits.get("masterServiceAddlDetail")) : null;
    }

}

