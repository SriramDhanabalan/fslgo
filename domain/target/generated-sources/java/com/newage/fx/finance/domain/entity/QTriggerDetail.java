package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTriggerDetail is a Querydsl query type for TriggerDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTriggerDetail extends EntityPathBase<TriggerDetail> {

    private static final long serialVersionUID = -934640454L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTriggerDetail triggerDetail = new QTriggerDetail("triggerDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> attachmentInfoId = createNumber("attachmentInfoId", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> followUpCompleted = createEnum("followUpCompleted", com.newage.fx.finance.domain.enums.YesNo.class);

    public final DateTimePath<java.util.Date> followUpDate = createDateTime("followUpDate", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final QShipmentServiceDetail servicelDetail;

    public final QShipmentHeader shipmentHeader;

    public final StringPath triggerCode = createString("triggerCode");

    public final StringPath triggerEventCode = createString("triggerEventCode");

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerMessage = createString("triggerMessage");

    public final StringPath triggerMode = createString("triggerMode");

    public final NumberPath<Long> triggerToContactId = createNumber("triggerToContactId", Long.class);

    public final StringPath triggerToEmail = createString("triggerToEmail");

    public final NumberPath<Long> triggerToId = createNumber("triggerToId", Long.class);

    public final NumberPath<Long> triggerTypeId = createNumber("triggerTypeId", Long.class);

    public final StringPath triggerTypeName = createString("triggerTypeName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTriggerDetail(String variable) {
        this(TriggerDetail.class, forVariable(variable), INITS);
    }

    public QTriggerDetail(Path<? extends TriggerDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTriggerDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTriggerDetail(PathMetadata metadata, PathInits inits) {
        this(TriggerDetail.class, metadata, inits);
    }

    public QTriggerDetail(Class<? extends TriggerDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.servicelDetail = inits.isInitialized("servicelDetail") ? new QShipmentServiceDetail(forProperty("servicelDetail"), inits.get("servicelDetail")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

