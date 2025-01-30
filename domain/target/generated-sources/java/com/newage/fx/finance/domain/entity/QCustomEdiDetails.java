package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomEdiDetails is a Querydsl query type for CustomEdiDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomEdiDetails extends EntityPathBase<CustomEdiDetails> {

    private static final long serialVersionUID = 1377538904L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomEdiDetails customEdiDetails = new QCustomEdiDetails("customEdiDetails");

    public final ListPath<CustomEdiGeneratedFileDetails, QCustomEdiGeneratedFileDetails> customEdiFileDetails = this.<CustomEdiGeneratedFileDetails, QCustomEdiGeneratedFileDetails>createList("customEdiFileDetails", CustomEdiGeneratedFileDetails.class, QCustomEdiGeneratedFileDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMasterHeader masterHeader;

    public final NumberPath<Long> noOfInstalment = createNumber("noOfInstalment", Long.class);

    public QCustomEdiDetails(String variable) {
        this(CustomEdiDetails.class, forVariable(variable), INITS);
    }

    public QCustomEdiDetails(Path<? extends CustomEdiDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomEdiDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomEdiDetails(PathMetadata metadata, PathInits inits) {
        this(CustomEdiDetails.class, metadata, inits);
    }

    public QCustomEdiDetails(Class<? extends CustomEdiDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

