package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCarrierBookingDetails is a Querydsl query type for CarrierBookingDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierBookingDetails extends EntityPathBase<CarrierBookingDetails> {

    private static final long serialVersionUID = -470128558L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCarrierBookingDetails carrierBookingDetails = new QCarrierBookingDetails("carrierBookingDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath additionalRequestId = createString("additionalRequestId");

    public final EnumPath<com.newage.fx.finance.domain.enums.CarrierBookingStatus> bookingCurrentStatus = createEnum("bookingCurrentStatus", com.newage.fx.finance.domain.enums.CarrierBookingStatus.class);

    public final StringPath branch = createString("branch");

    public final QCarrierShipmentCargoDetails cargoDetails;

    public final StringPath carrier = createString("carrier");

    public final QCarrierBookingOtherInfoDetails carrierBookingOtherInfoDetails;

    public final StringPath carrierBookingRefNo = createString("carrierBookingRefNo");

    public final StringPath carrierContractNo = createString("carrierContractNo");

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath company = createString("company");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jobReferenceNo = createString("jobReferenceNo");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QCarrierShipmentPartyDetails partyDetails;

    public final NumberPath<Long> placeOfDeliveryId = createNumber("placeOfDeliveryId", Long.class);

    public final NumberPath<Long> placeOfReceiptId = createNumber("placeOfReceiptId", Long.class);

    public final NumberPath<Integer> retryCount = createNumber("retryCount", Integer.class);

    public final QSailingScheduleHeaderDetails sailingScheduleDetails;

    public final BooleanPath sendSI = createBoolean("sendSI");

    public final StringPath serviceProvider = createString("serviceProvider");

    public final StringPath serviceType = createString("serviceType");

    public final QShipmentHeader shipmentHeader;

    public final StringPath tenantId = createString("tenantId");

    public final StringPath vessel = createString("vessel");

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath voyage = createString("voyage");

    public QCarrierBookingDetails(String variable) {
        this(CarrierBookingDetails.class, forVariable(variable), INITS);
    }

    public QCarrierBookingDetails(Path<? extends CarrierBookingDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCarrierBookingDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCarrierBookingDetails(PathMetadata metadata, PathInits inits) {
        this(CarrierBookingDetails.class, metadata, inits);
    }

    public QCarrierBookingDetails(Class<? extends CarrierBookingDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetails = inits.isInitialized("cargoDetails") ? new QCarrierShipmentCargoDetails(forProperty("cargoDetails"), inits.get("cargoDetails")) : null;
        this.carrierBookingOtherInfoDetails = inits.isInitialized("carrierBookingOtherInfoDetails") ? new QCarrierBookingOtherInfoDetails(forProperty("carrierBookingOtherInfoDetails"), inits.get("carrierBookingOtherInfoDetails")) : null;
        this.partyDetails = inits.isInitialized("partyDetails") ? new QCarrierShipmentPartyDetails(forProperty("partyDetails"), inits.get("partyDetails")) : null;
        this.sailingScheduleDetails = inits.isInitialized("sailingScheduleDetails") ? new QSailingScheduleHeaderDetails(forProperty("sailingScheduleDetails"), inits.get("sailingScheduleDetails")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

