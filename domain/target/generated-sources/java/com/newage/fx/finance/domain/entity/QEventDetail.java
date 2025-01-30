package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEventDetail is a Querydsl query type for EventDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEventDetail extends EntityPathBase<EventDetail> {

    private static final long serialVersionUID = 259448924L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEventDetail eventDetail = new QEventDetail("eventDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> assignedTo = createNumber("assignedTo", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> completed = createEnum("completed", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final StringPath eventCode = createString("eventCode");

    public final DateTimePath<java.util.Date> eventDate = createDateTime("eventDate", java.util.Date.class);

    public final NumberPath<Long> eventId = createNumber("eventId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.CreationMode> eventMode = createEnum("eventMode", com.newage.fx.finance.domain.enums.CreationMode.class);

    public final StringPath eventName = createString("eventName");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> followUp = createEnum("followUp", com.newage.fx.finance.domain.enums.YesNo.class);

    public final DateTimePath<java.util.Date> followUpDate = createDateTime("followUpDate", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final StringPath notes = createString("notes");

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEventDetail(String variable) {
        this(EventDetail.class, forVariable(variable), INITS);
    }

    public QEventDetail(Path<? extends EventDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEventDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEventDetail(PathMetadata metadata, PathInits inits) {
        this(EventDetail.class, metadata, inits);
    }

    public QEventDetail(Class<? extends EventDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

