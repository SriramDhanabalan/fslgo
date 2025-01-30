package com.newage.fx.finance.domain.entity.coa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoaControl is a Querydsl query type for CoaControl
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoaControl extends EntityPathBase<CoaControl> {

    private static final long serialVersionUID = -1287275056L;

    public static final QCoaControl coaControl = new QCoaControl("coaControl");

    public final QAuditable _super = new QAuditable(this);

    public final StringPath accountName = createString("accountName");

    public final NumberPath<Long> accountUid = createNumber("accountUid", Long.class);

    public final ListPath<CoaControlDetail, QCoaControlDetail> coaControlDetails = this.<CoaControlDetail, QCoaControlDetail>createList("coaControlDetails", CoaControlDetail.class, QCoaControlDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> coaGroupId = createNumber("coaGroupId", Long.class);

    public final NumberPath<Long> coaHeaderId = createNumber("coaHeaderId", Long.class);

    public final NumberPath<Long> coaSubGroupId = createNumber("coaSubGroupId", Long.class);

    public final NumberPath<Long> controlAccountId = createNumber("controlAccountId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final StringPath status = createString("status");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCoaControl(String variable) {
        super(CoaControl.class, forVariable(variable));
    }

    public QCoaControl(Path<? extends CoaControl> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoaControl(PathMetadata metadata) {
        super(CoaControl.class, metadata);
    }

}

