package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseAttachment is a Querydsl query type for CfsWareHouseAttachment
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseAttachment extends EntityPathBase<CfsWareHouseAttachment> {

    private static final long serialVersionUID = 1298472997L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseAttachment cfsWareHouseAttachment = new QCfsWareHouseAttachment("cfsWareHouseAttachment");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath alfrescoNodeId = createString("alfrescoNodeId");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath documentName = createString("documentName");

    public final StringPath documentRefNo = createString("documentRefNo");

    public final NumberPath<Long> documentTypeId = createNumber("documentTypeId", Long.class);

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final QCfsWareHouseHeaderDetails headerDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCfsWareHouseAttachment(String variable) {
        this(CfsWareHouseAttachment.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseAttachment(Path<? extends CfsWareHouseAttachment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseAttachment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseAttachment(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseAttachment.class, metadata, inits);
    }

    public QCfsWareHouseAttachment(Class<? extends CfsWareHouseAttachment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QCfsWareHouseHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
    }

}

