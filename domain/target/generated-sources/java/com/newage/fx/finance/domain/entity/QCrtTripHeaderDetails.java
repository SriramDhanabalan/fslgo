package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCrtTripHeaderDetails is a Querydsl query type for CrtTripHeaderDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCrtTripHeaderDetails extends EntityPathBase<CrtTripHeaderDetails> {

    private static final long serialVersionUID = -1773520454L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCrtTripHeaderDetails crtTripHeaderDetails = new QCrtTripHeaderDetails("crtTripHeaderDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final ListPath<CrtTripDetails, QCrtTripDetails> crtTripDetails = this.<CrtTripDetails, QCrtTripDetails>createList("crtTripDetails", CrtTripDetails.class, QCrtTripDetails.class, PathInits.DIRECT2);

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath tripNo = createString("tripNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.TripStatus> tripStatus = createEnum("tripStatus", com.newage.fx.finance.domain.enums.TripStatus.class);

    public QCrtTripHeaderDetails(String variable) {
        this(CrtTripHeaderDetails.class, forVariable(variable), INITS);
    }

    public QCrtTripHeaderDetails(Path<? extends CrtTripHeaderDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCrtTripHeaderDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCrtTripHeaderDetails(PathMetadata metadata, PathInits inits) {
        this(CrtTripHeaderDetails.class, metadata, inits);
    }

    public QCrtTripHeaderDetails(Class<? extends CrtTripHeaderDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

