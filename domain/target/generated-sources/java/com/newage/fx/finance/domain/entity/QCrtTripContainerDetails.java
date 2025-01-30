package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrtTripContainerDetails is a Querydsl query type for CrtTripContainerDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCrtTripContainerDetails extends EntityPathBase<CrtTripContainerDetails> {

    private static final long serialVersionUID = -941912676L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrtTripContainerDetails crtTripContainerDetails = new QCrtTripContainerDetails("crtTripContainerDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> cfsTerminalId = createNumber("cfsTerminalId", Long.class);

    public final StringPath cfsTerminalName = createString("cfsTerminalName");

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerNo = createString("containerNo");

    public final StringPath containerType = createString("containerType");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> expectedDate = createDateTime("expectedDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> plannedDate = createDateTime("plannedDate", java.util.Date.class);

    public final StringPath sealNo = createString("sealNo");

    public final NumberPath<Double> tareWeight = createNumber("tareWeight", Double.class);

    public final StringPath timeSlot = createString("timeSlot");

    public final StringPath trailerNo = createString("trailerNo");

    public final QCrtTripDetails tripDetails;

    public QCrtTripContainerDetails(String variable) {
        this(CrtTripContainerDetails.class, forVariable(variable), INITS);
    }

    public QCrtTripContainerDetails(Path<? extends CrtTripContainerDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrtTripContainerDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrtTripContainerDetails(PathMetadata metadata, PathInits inits) {
        this(CrtTripContainerDetails.class, metadata, inits);
    }

    public QCrtTripContainerDetails(Class<? extends CrtTripContainerDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tripDetails = inits.isInitialized("tripDetails") ? new QCrtTripDetails(forProperty("tripDetails"), inits.get("tripDetails")) : null;
    }

}

