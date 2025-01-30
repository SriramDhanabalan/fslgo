package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryServiceDetail is a Querydsl query type for EnquiryServiceDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryServiceDetail extends EntityPathBase<EnquiryServiceDetail> {

    private static final long serialVersionUID = -1780191822L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryServiceDetail enquiryServiceDetail = new QEnquiryServiceDetail("enquiryServiceDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> billingPartyId = createNumber("billingPartyId", Long.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceType> businessType = createEnum("businessType", com.newage.fx.finance.domain.enums.ServiceType.class);

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath contactPerson = createString("contactPerson");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerReferenceNo = createString("customerReferenceNo");

    public final BooleanPath deliveryRequired = createBoolean("deliveryRequired");

    public final DateTimePath<java.util.Date> demurrageDate = createDateTime("demurrageDate", java.util.Date.class);

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath destinationName = createString("destinationName");

    public final DateTimePath<java.util.Date> doCutOffDate = createDateTime("doCutOffDate", java.util.Date.class);

    public final StringPath dropPoint = createString("dropPoint");

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> enquiryId = createNumber("enquiryId", Long.class);

    public final StringPath enquiryNo = createString("enquiryNo");

    public final NumberPath<Long> enquiryServiceUid = createNumber("enquiryServiceUid", Long.class);

    public final StringPath fromPlace = createString("fromPlace");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath noOfFreeDay = createString("noOfFreeDay");

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final StringPath originName = createString("originName");

    public final StringPath pickupPoint = createString("pickupPoint");

    public final BooleanPath pickupRequired = createBoolean("pickupRequired");

    public final DateTimePath<java.util.Date> portCutOffDate = createDateTime("portCutOffDate", java.util.Date.class);

    public final StringPath referenceNo1 = createString("referenceNo1");

    public final StringPath referenceNo2 = createString("referenceNo2");

    public final EnumPath<RoutingHaul> routingHaul = createEnum("routingHaul", RoutingHaul.class);

    public final StringPath serviceCode = createString("serviceCode");

    public final DateTimePath<java.util.Date> serviceDate = createDateTime("serviceDate", java.util.Date.class);

    public final StringPath serviceDivision = createString("serviceDivision");

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ServiceMode> serviceMode = createEnum("serviceMode", com.newage.fx.finance.domain.enums.ServiceMode.class);

    public final StringPath serviceName = createString("serviceName");

    public final StringPath serviceStatus = createString("serviceStatus");

    public final EnumPath<com.newage.fx.finance.domain.enums.ImportExport> serviceTrade = createEnum("serviceTrade", com.newage.fx.finance.domain.enums.ImportExport.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportMode> serviceTransportMode = createEnum("serviceTransportMode", com.newage.fx.finance.domain.enums.TransportMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Service> serviceType = createEnum("serviceType", com.newage.fx.finance.domain.enums.Service.class);

    public final StringPath toPlace = createString("toPlace");

    public final NumberPath<Long> tosId = createNumber("tosId", Long.class);

    public final StringPath tradeLane = createString("tradeLane");

    public final StringPath transitDays = createString("transitDays");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEnquiryServiceDetail(String variable) {
        this(EnquiryServiceDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryServiceDetail(Path<? extends EnquiryServiceDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryServiceDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryServiceDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryServiceDetail.class, metadata, inits);
    }

    public QEnquiryServiceDetail(Class<? extends EnquiryServiceDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

