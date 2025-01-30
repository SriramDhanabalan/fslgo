package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRateRequestModificationHistory is a Querydsl query type for RateRequestModificationHistory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRateRequestModificationHistory extends EntityPathBase<RateRequestModificationHistory> {

    private static final long serialVersionUID = -1701312296L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRateRequestModificationHistory rateRequestModificationHistory = new QRateRequestModificationHistory("rateRequestModificationHistory");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> assigneeId = createNumber("assigneeId", Long.class);

    public final StringPath assigneeName = createString("assigneeName");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> documentId = createNumber("documentId", Long.class);

    public final StringPath enquiryUid = createString("enquiryUid");

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath referenceNo = createString("referenceNo");

    public final StringPath rejectionReason = createString("rejectionReason");

    public final QShipmentHeader shipmentHeader;

    public final EnumPath<com.newage.fx.finance.domain.enums.RateModificationStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.RateModificationStatus.class);

    public final StringPath typeForRequest = createString("typeForRequest");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final StringPath userName = createString("userName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QRateRequestModificationHistory(String variable) {
        this(RateRequestModificationHistory.class, forVariable(variable), INITS);
    }

    public QRateRequestModificationHistory(Path<? extends RateRequestModificationHistory> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRateRequestModificationHistory(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRateRequestModificationHistory(PathMetadata metadata, PathInits inits) {
        this(RateRequestModificationHistory.class, metadata, inits);
    }

    public QRateRequestModificationHistory(Class<? extends RateRequestModificationHistory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

