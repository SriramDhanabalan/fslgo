package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterServiceCustomsDetail is a Querydsl query type for MasterServiceCustomsDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterServiceCustomsDetail extends EntityPathBase<MasterServiceCustomsDetail> {

    private static final long serialVersionUID = 1945236975L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterServiceCustomsDetail masterServiceCustomsDetail = new QMasterServiceCustomsDetail("masterServiceCustomsDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> boeDate = createDateTime("boeDate", java.util.Date.class);

    public final StringPath boeNo = createString("boeNo");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath branchSerialNo = createString("branchSerialNo");

    public final NumberPath<Long> cargoMovement = createNumber("cargoMovement", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> consigneeId = createNumber("consigneeId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> customsCleared = createEnum("customsCleared", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> customsConsigneeConfirmed = createEnum("customsConsigneeConfirmed", com.newage.fx.finance.domain.enums.YesNo.class);

    public final DateTimePath<java.util.Date> customsEntryDate = createDateTime("customsEntryDate", java.util.Date.class);

    public final StringPath customsEntryNo = createString("customsEntryNo");

    public final StringPath customsStatus = createString("customsStatus");

    public final StringPath declaredValueForCustoms = createString("declaredValueForCustoms");

    public final DateTimePath<java.util.Date> exportCustomsClearanceDate = createDateTime("exportCustomsClearanceDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> finalBuyer = createEnum("finalBuyer", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> firstNotifyId = createNumber("firstNotifyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> forwarderHBLInvolved = createEnum("forwarderHBLInvolved", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> forwarderId = createNumber("forwarderId", Long.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.BLType> hblType = createEnum("hblType", com.newage.fx.finance.domain.enums.BLType.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ieCode = createString("ieCode");

    public final DateTimePath<java.util.Date> igmDate = createDateTime("igmDate", java.util.Date.class);

    public final StringPath igmNo = createString("igmNo");

    public final DateTimePath<java.util.Date> importCustomsClearanceDate = createDateTime("importCustomsClearanceDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isHighSeaSale = createEnum("isHighSeaSale", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final DateTimePath<java.util.Date> mrnDate = createDateTime("mrnDate", java.util.Date.class);

    public final StringPath mrnNo = createString("mrnNo");

    public final NumberPath<Long> natureOfCargo = createNumber("natureOfCargo", Long.class);

    public final StringPath remarks = createString("remarks");

    public final DateTimePath<java.util.Date> rotationDate = createDateTime("rotationDate", java.util.Date.class);

    public final StringPath rotationNo = createString("rotationNo");

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final DateTimePath<java.util.Date> unstuffDate = createDateTime("unstuffDate", java.util.Date.class);

    public final NumberPath<Long> unstuffPlace = createNumber("unstuffPlace", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterServiceCustomsDetail(String variable) {
        this(MasterServiceCustomsDetail.class, forVariable(variable), INITS);
    }

    public QMasterServiceCustomsDetail(Path<? extends MasterServiceCustomsDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterServiceCustomsDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterServiceCustomsDetail(PathMetadata metadata, PathInits inits) {
        this(MasterServiceCustomsDetail.class, metadata, inits);
    }

    public QMasterServiceCustomsDetail(Class<? extends MasterServiceCustomsDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

