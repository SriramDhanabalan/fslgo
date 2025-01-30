package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryRoutingDetail is a Querydsl query type for EnquiryRoutingDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryRoutingDetail extends EntityPathBase<EnquiryRoutingDetail> {

    private static final long serialVersionUID = -1427736829L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryRoutingDetail enquiryRoutingDetail = new QEnquiryRoutingDetail("enquiryRoutingDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> ata = createDateTime("ata", java.util.Date.class);

    public final DateTimePath<java.util.Date> atd = createDateTime("atd", java.util.Date.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> carrierOrVesselId = createNumber("carrierOrVesselId", Long.class);

    public final StringPath carrierOrVesselName = createString("carrierOrVesselName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryHeader;

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> fromPortId = createNumber("fromPortId", Long.class);

    public final StringPath fromPortName = createString("fromPortName");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> move = createEnum("move", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus.class);

    public final NumberPath<Long> toPortId = createNumber("toPortId", Long.class);

    public final StringPath toPortName = createString("toPortName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final StringPath voyageOrflightNo = createString("voyageOrflightNo");

    public QEnquiryRoutingDetail(String variable) {
        this(EnquiryRoutingDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryRoutingDetail(Path<? extends EnquiryRoutingDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryRoutingDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryRoutingDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryRoutingDetail.class, metadata, inits);
    }

    public QEnquiryRoutingDetail(Class<? extends EnquiryRoutingDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryHeader = inits.isInitialized("enquiryHeader") ? new QEnquiryHeader(forProperty("enquiryHeader"), inits.get("enquiryHeader")) : null;
    }

}

