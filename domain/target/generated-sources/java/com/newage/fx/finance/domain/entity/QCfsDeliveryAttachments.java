package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsDeliveryAttachments is a Querydsl query type for CfsDeliveryAttachments
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsDeliveryAttachments extends EntityPathBase<CfsDeliveryAttachments> {

    private static final long serialVersionUID = -351181029L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsDeliveryAttachments cfsDeliveryAttachments = new QCfsDeliveryAttachments("cfsDeliveryAttachments");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath alfrescoNodeId = createString("alfrescoNodeId");

    public final QCfsDeliveryHeaderDetails cfsDeliveryHeaderDetails;

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final ArrayPath<byte[], Byte> document = createArray("document", byte[].class);

    public final NumberPath<Long> documentTypeId = createNumber("documentTypeId", Long.class);

    public final StringPath format = createString("format");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath referenceNo = createString("referenceNo");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCfsDeliveryAttachments(String variable) {
        this(CfsDeliveryAttachments.class, forVariable(variable), INITS);
    }

    public QCfsDeliveryAttachments(Path<? extends CfsDeliveryAttachments> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsDeliveryAttachments(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsDeliveryAttachments(PathMetadata metadata, PathInits inits) {
        this(CfsDeliveryAttachments.class, metadata, inits);
    }

    public QCfsDeliveryAttachments(Class<? extends CfsDeliveryAttachments> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cfsDeliveryHeaderDetails = inits.isInitialized("cfsDeliveryHeaderDetails") ? new QCfsDeliveryHeaderDetails(forProperty("cfsDeliveryHeaderDetails"), inits.get("cfsDeliveryHeaderDetails")) : null;
    }

}

