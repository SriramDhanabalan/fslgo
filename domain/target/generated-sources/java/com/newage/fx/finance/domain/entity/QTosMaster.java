package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTosMaster is a Querydsl query type for TosMaster
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTosMaster extends EntityPathBase<TosMaster> {

    private static final long serialVersionUID = 394246891L;

    public static final QTosMaster tosMaster = new QTosMaster("tosMaster");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final CollectionPath<com.newage.fx.finance.domain.enums.Applicability, EnumPath<com.newage.fx.finance.domain.enums.Applicability>> applicability = this.<com.newage.fx.finance.domain.enums.Applicability, EnumPath<com.newage.fx.finance.domain.enums.Applicability>>createCollection("applicability", com.newage.fx.finance.domain.enums.Applicability.class, EnumPath.class, PathInits.DIRECT2);

    public final StringPath code = createString("code");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final BooleanPath deleted = createBoolean("deleted");

    public final EnumPath<com.newage.fx.finance.domain.enums.PrepaidCollect> freightPPCC = createEnum("freightPPCC", com.newage.fx.finance.domain.enums.PrepaidCollect.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final StringPath note = createString("note");

    public final NumberPath<Long> ranking = createNumber("ranking", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.LovStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.LovStatus.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QTosMaster(String variable) {
        super(TosMaster.class, forVariable(variable));
    }

    public QTosMaster(Path<? extends TosMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTosMaster(PathMetadata metadata) {
        super(TosMaster.class, metadata);
    }

}

