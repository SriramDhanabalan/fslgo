package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUsppiAesCustomDetails is a Querydsl query type for UsppiAesCustomDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsppiAesCustomDetails extends EntityPathBase<UsppiAesCustomDetails> {

    private static final long serialVersionUID = 938337726L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsppiAesCustomDetails usppiAesCustomDetails = new QUsppiAesCustomDetails("usppiAesCustomDetails");

    public final QGeneralInfoAesCustomDetails generalInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> shipperId = createNumber("shipperId", Long.class);

    public final NumberPath<Long> shipperIdNumber = createNumber("shipperIdNumber", Long.class);

    public final StringPath shipperIdType = createString("shipperIdType");

    public final QUsCustomContactInfoDetails usspiContatInfo;

    public QUsppiAesCustomDetails(String variable) {
        this(UsppiAesCustomDetails.class, forVariable(variable), INITS);
    }

    public QUsppiAesCustomDetails(Path<? extends UsppiAesCustomDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUsppiAesCustomDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUsppiAesCustomDetails(PathMetadata metadata, PathInits inits) {
        this(UsppiAesCustomDetails.class, metadata, inits);
    }

    public QUsppiAesCustomDetails(Class<? extends UsppiAesCustomDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.generalInfo = inits.isInitialized("generalInfo") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfo"), inits.get("generalInfo")) : null;
        this.usspiContatInfo = inits.isInitialized("usspiContatInfo") ? new QUsCustomContactInfoDetails(forProperty("usspiContatInfo")) : null;
    }

}

