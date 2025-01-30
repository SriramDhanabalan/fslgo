package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterServiceAddlDetail is a Querydsl query type for MasterServiceAddlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterServiceAddlDetail extends EntityPathBase<MasterServiceAddlDetail> {

    private static final long serialVersionUID = 1614266816L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterServiceAddlDetail masterServiceAddlDetail = new QMasterServiceAddlDetail("masterServiceAddlDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> chaAddressId = createNumber("chaAddressId", Long.class);

    public final NumberPath<Long> chaId = createNumber("chaId", Long.class);

    public final NumberPath<Long> coLoaderAddressId = createNumber("coLoaderAddressId", Long.class);

    public final NumberPath<Long> coLoaderId = createNumber("coLoaderId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final QMasterServiceDetail masterServiceDetail;

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QMasterServiceAddlDetail(String variable) {
        this(MasterServiceAddlDetail.class, forVariable(variable), INITS);
    }

    public QMasterServiceAddlDetail(Path<? extends MasterServiceAddlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterServiceAddlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterServiceAddlDetail(PathMetadata metadata, PathInits inits) {
        this(MasterServiceAddlDetail.class, metadata, inits);
    }

    public QMasterServiceAddlDetail(Class<? extends MasterServiceAddlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.masterServiceDetail = inits.isInitialized("masterServiceDetail") ? new QMasterServiceDetail(forProperty("masterServiceDetail"), inits.get("masterServiceDetail")) : null;
    }

}

