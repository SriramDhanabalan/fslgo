package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBillOfEntryDetails is a Querydsl query type for BillOfEntryDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBillOfEntryDetails extends EntityPathBase<BillOfEntryDetails> {

    private static final long serialVersionUID = 537758429L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBillOfEntryDetails billOfEntryDetails = new QBillOfEntryDetails("billOfEntryDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> ackDate = createDateTime("ackDate", java.util.Date.class);

    public final StringPath ackNo = createString("ackNo");

    public final StringPath ackStatus = createString("ackStatus");

    public final NumberPath<Double> amount = createNumber("amount", Double.class);

    public final DateTimePath<java.util.Date> boeDate = createDateTime("boeDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> boeExpiryDate = createDateTime("boeExpiryDate", java.util.Date.class);

    public final NumberPath<Long> boeId = createNumber("boeId", Long.class);

    public final StringPath boeInvoiceNo = createString("boeInvoiceNo");

    public final StringPath boeNO = createString("boeNO");

    public final StringPath boeValue = createString("boeValue");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath declarationNo = createString("declarationNo");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath note = createString("note");

    public final EnumPath<com.newage.fx.finance.domain.enums.PassedBy> passedBy = createEnum("passedBy", com.newage.fx.finance.domain.enums.PassedBy.class);

    public final StringPath passedPerson = createString("passedPerson");

    public final DateTimePath<java.util.Date> processDate = createDateTime("processDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> receiveDate = createDateTime("receiveDate", java.util.Date.class);

    public final QShipmentHeader shipmentHeader;

    public final EnumPath<com.newage.fx.finance.domain.enums.TransactionType> transactionType = createEnum("transactionType", com.newage.fx.finance.domain.enums.TransactionType.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QBillOfEntryDetails(String variable) {
        this(BillOfEntryDetails.class, forVariable(variable), INITS);
    }

    public QBillOfEntryDetails(Path<? extends BillOfEntryDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBillOfEntryDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBillOfEntryDetails(PathMetadata metadata, PathInits inits) {
        this(BillOfEntryDetails.class, metadata, inits);
    }

    public QBillOfEntryDetails(Class<? extends BillOfEntryDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

