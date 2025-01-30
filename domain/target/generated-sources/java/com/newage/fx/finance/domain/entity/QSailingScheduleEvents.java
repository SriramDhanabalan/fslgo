package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSailingScheduleEvents is a Querydsl query type for SailingScheduleEvents
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSailingScheduleEvents extends EntityPathBase<SailingScheduleEvents> {

    private static final long serialVersionUID = -231147822L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSailingScheduleEvents sailingScheduleEvents = new QSailingScheduleEvents("sailingScheduleEvents");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> completed = createEnum("completed", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final NumberPath<Long> eventId = createNumber("eventId", Long.class);

    public final StringPath eventName = createString("eventName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QSailingScheduleDetails sailingScheduleDetails;

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSailingScheduleEvents(String variable) {
        this(SailingScheduleEvents.class, forVariable(variable), INITS);
    }

    public QSailingScheduleEvents(Path<? extends SailingScheduleEvents> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSailingScheduleEvents(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSailingScheduleEvents(PathMetadata metadata, PathInits inits) {
        this(SailingScheduleEvents.class, metadata, inits);
    }

    public QSailingScheduleEvents(Class<? extends SailingScheduleEvents> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.sailingScheduleDetails = inits.isInitialized("sailingScheduleDetails") ? new QSailingScheduleDetails(forProperty("sailingScheduleDetails"), inits.get("sailingScheduleDetails")) : null;
    }

}

