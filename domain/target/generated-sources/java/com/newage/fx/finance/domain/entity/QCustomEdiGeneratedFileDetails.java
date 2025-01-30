package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomEdiGeneratedFileDetails is a Querydsl query type for CustomEdiGeneratedFileDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomEdiGeneratedFileDetails extends EntityPathBase<CustomEdiGeneratedFileDetails> {

    private static final long serialVersionUID = -822029631L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomEdiGeneratedFileDetails customEdiGeneratedFileDetails = new QCustomEdiGeneratedFileDetails("customEdiGeneratedFileDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QCustomEdiDetails customEdiDetails;

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final StringPath fileName = createString("fileName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public QCustomEdiGeneratedFileDetails(String variable) {
        this(CustomEdiGeneratedFileDetails.class, forVariable(variable), INITS);
    }

    public QCustomEdiGeneratedFileDetails(Path<? extends CustomEdiGeneratedFileDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomEdiGeneratedFileDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomEdiGeneratedFileDetails(PathMetadata metadata, PathInits inits) {
        this(CustomEdiGeneratedFileDetails.class, metadata, inits);
    }

    public QCustomEdiGeneratedFileDetails(Class<? extends CustomEdiGeneratedFileDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customEdiDetails = inits.isInitialized("customEdiDetails") ? new QCustomEdiDetails(forProperty("customEdiDetails"), inits.get("customEdiDetails")) : null;
    }

}

