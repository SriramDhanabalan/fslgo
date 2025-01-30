package com.newage.fx.finance.domain.entity.coa;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCoaControlDetail is a Querydsl query type for CoaControlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCoaControlDetail extends EntityPathBase<CoaControlDetail> {

    private static final long serialVersionUID = -635230655L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCoaControlDetail coaControlDetail = new QCoaControlDetail("coaControlDetail");

    public final QAuditable _super = new QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCoaControl coaControl;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final StringPath status = createString("status");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCoaControlDetail(String variable) {
        this(CoaControlDetail.class, forVariable(variable), INITS);
    }

    public QCoaControlDetail(Path<? extends CoaControlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCoaControlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCoaControlDetail(PathMetadata metadata, PathInits inits) {
        this(CoaControlDetail.class, metadata, inits);
    }

    public QCoaControlDetail(Class<? extends CoaControlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coaControl = inits.isInitialized("coaControl") ? new QCoaControl(forProperty("coaControl")) : null;
    }

}

