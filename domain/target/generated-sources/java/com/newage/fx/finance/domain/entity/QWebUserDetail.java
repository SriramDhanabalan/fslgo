package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWebUserDetail is a Querydsl query type for WebUserDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWebUserDetail extends EntityPathBase<WebUserDetail> {

    private static final long serialVersionUID = -476541183L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWebUserDetail webUserDetail = new QWebUserDetail("webUserDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath autoInvoiceNo = createString("autoInvoiceNo");

    public final StringPath branchCode = createString("branchCode");

    public final StringPath codeType = createString("codeType");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerCode = createString("customerCode");

    public final StringPath customerName = createString("customerName");

    public final StringPath isPrimary = createString("isPrimary");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath locationCode = createString("locationCode");

    public final NumberPath<Long> nxtCustomerId = createNumber("nxtCustomerId", Long.class);

    public final StringPath projectCode = createString("projectCode");

    public final ListPath<ShipmentHeader, QShipmentHeader> shipmentHeaderList = this.<ShipmentHeader, QShipmentHeader>createList("shipmentHeaderList", ShipmentHeader.class, QShipmentHeader.class, PathInits.DIRECT2);

    public final StringPath shortName = createString("shortName");

    public final NumberPath<Integer> slNo = createNumber("slNo", Integer.class);

    public final QUserMaster userMaster;

    public QWebUserDetail(String variable) {
        this(WebUserDetail.class, forVariable(variable), INITS);
    }

    public QWebUserDetail(Path<? extends WebUserDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWebUserDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWebUserDetail(PathMetadata metadata, PathInits inits) {
        this(WebUserDetail.class, metadata, inits);
    }

    public QWebUserDetail(Class<? extends WebUserDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userMaster = inits.isInitialized("userMaster") ? new QUserMaster(forProperty("userMaster")) : null;
    }

}

