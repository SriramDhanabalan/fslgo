package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDirectRateRequestHeader is a Querydsl query type for DirectRateRequestHeader
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirectRateRequestHeader extends EntityPathBase<DirectRateRequestHeader> {

    private static final long serialVersionUID = -1205825692L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDirectRateRequestHeader directRateRequestHeader = new QDirectRateRequestHeader("directRateRequestHeader");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final QDirectRateCargoDetails cargoDetails;

    public final ListPath<DirectRateRequestCarrierDetail, QDirectRateRequestCarrierDetail> carrier = this.<DirectRateRequestCarrierDetail, QDirectRateRequestCarrierDetail>createList("carrier", DirectRateRequestCarrierDetail.class, QDirectRateRequestCarrierDetail.class, PathInits.DIRECT2);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath deliveryPlace = createString("deliveryPlace");

    public final BooleanPath deliveryRequired = createBoolean("deliveryRequired");

    public final StringPath designationName = createString("designationName");

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final ListPath<DirectAddRateDetails, QDirectAddRateDetails> directAddRateDetails = this.<DirectAddRateDetails, QDirectAddRateDetails>createList("directAddRateDetails", DirectAddRateDetails.class, QDirectAddRateDetails.class, PathInits.DIRECT2);

    public final StringPath emailId = createString("emailId");

    public final StringPath employeeName = createString("employeeName");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> enquiryCreated = createEnum("enquiryCreated", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QEnquiryHeader enquiryHeader;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.JointCallStatus> jointCallStatus = createEnum("jointCallStatus", com.newage.fx.finance.domain.enums.JointCallStatus.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath pickupPlace = createString("pickupPlace");

    public final BooleanPath pickupRequired = createBoolean("pickupRequired");

    public final DateTimePath<java.util.Date> rateRequestDate = createDateTime("rateRequestDate", java.util.Date.class);

    public final StringPath rateRequestNo = createString("rateRequestNo");

    public final ListPath<CreateRateRequest, QCreateRateRequest> rateRequests = this.<CreateRateRequest, QCreateRateRequest>createList("rateRequests", CreateRateRequest.class, QCreateRateRequest.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.RequestFor> requestFor = createEnum("requestFor", com.newage.fx.finance.domain.enums.RequestFor.class);

    public final StringPath serviceCode = createString("serviceCode");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final StringPath serviceName = createString("serviceName");

    public final NumberPath<Long> tosId = createNumber("tosId", Long.class);

    public final StringPath tosName = createString("tosName");

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> tradeCode = createEnum("tradeCode", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QDirectRateRequestHeader(String variable) {
        this(DirectRateRequestHeader.class, forVariable(variable), INITS);
    }

    public QDirectRateRequestHeader(Path<? extends DirectRateRequestHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDirectRateRequestHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDirectRateRequestHeader(PathMetadata metadata, PathInits inits) {
        this(DirectRateRequestHeader.class, metadata, inits);
    }

    public QDirectRateRequestHeader(Class<? extends DirectRateRequestHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetails = inits.isInitialized("cargoDetails") ? new QDirectRateCargoDetails(forProperty("cargoDetails"), inits.get("cargoDetails")) : null;
        this.enquiryHeader = inits.isInitialized("enquiryHeader") ? new QEnquiryHeader(forProperty("enquiryHeader"), inits.get("enquiryHeader")) : null;
    }

}

