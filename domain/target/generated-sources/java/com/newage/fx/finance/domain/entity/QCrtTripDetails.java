package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrtTripDetails is a Querydsl query type for CrtTripDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCrtTripDetails extends EntityPathBase<CrtTripDetails> {

    private static final long serialVersionUID = -1989425977L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrtTripDetails crtTripDetails = new QCrtTripDetails("crtTripDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> billingCurrencyId = createNumber("billingCurrencyId", Long.class);

    public final NumberPath<Long> chargeId = createNumber("chargeId", Long.class);

    public final StringPath chargeName = createString("chargeName");

    public final NumberPath<Double> costAmount = createNumber("costAmount", Double.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QCrtTripHeaderDetails crtHeader;

    public final ListPath<CrtTripContainerDetails, QCrtTripContainerDetails> crtTripContainerDetails = this.<CrtTripContainerDetails, QCrtTripContainerDetails>createList("crtTripContainerDetails", CrtTripContainerDetails.class, QCrtTripContainerDetails.class, PathInits.DIRECT2);

    public final StringPath driverContactNo = createString("driverContactNo");

    public final NumberPath<Long> driverId = createNumber("driverId", Long.class);

    public final StringPath driverName = createString("driverName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceLegType> serviceLegType = createEnum("serviceLegType", com.newage.fx.finance.domain.enums.ServiceLegType.class);

    public final StringPath token = createString("token");

    public final NumberPath<Long> trailerId = createNumber("trailerId", Long.class);

    public final StringPath trailerName = createString("trailerName");

    public final StringPath trailerNo = createString("trailerNo");

    public final NumberPath<Long> transporterId = createNumber("transporterId", Long.class);

    public final StringPath transporterName = createString("transporterName");

    public final EnumPath<com.newage.fx.finance.domain.enums.TripType> tripType = createEnum("tripType", com.newage.fx.finance.domain.enums.TripType.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TypeStatus> type = createEnum("type", com.newage.fx.finance.domain.enums.TypeStatus.class);

    public final NumberPath<Long> vehicleId = createNumber("vehicleId", Long.class);

    public final StringPath vehicleNo = createString("vehicleNo");

    public QCrtTripDetails(String variable) {
        this(CrtTripDetails.class, forVariable(variable), INITS);
    }

    public QCrtTripDetails(Path<? extends CrtTripDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrtTripDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrtTripDetails(PathMetadata metadata, PathInits inits) {
        this(CrtTripDetails.class, metadata, inits);
    }

    public QCrtTripDetails(Class<? extends CrtTripDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.crtHeader = inits.isInitialized("crtHeader") ? new QCrtTripHeaderDetails(forProperty("crtHeader"), inits.get("crtHeader")) : null;
    }

}

