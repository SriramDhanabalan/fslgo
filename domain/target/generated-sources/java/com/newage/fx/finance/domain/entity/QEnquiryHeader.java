package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryHeader is a Querydsl query type for EnquiryHeader
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryHeader extends EntityPathBase<EnquiryHeader> {

    private static final long serialVersionUID = -1693523519L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryHeader enquiryHeader = new QEnquiryHeader("enquiryHeader");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final ListPath<AttachmentDetail, QAttachmentDetail> attachmentDetail = this.<AttachmentDetail, QAttachmentDetail>createList("attachmentDetail", AttachmentDetail.class, QAttachmentDetail.class, PathInits.DIRECT2);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QEnquiryCargoDetail cargoDetail;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> contactNo = createNumber("contactNo", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.CreationMode> creationMode = createEnum("creationMode", com.newage.fx.finance.domain.enums.CreationMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.CreationType> creationType = createEnum("creationType", com.newage.fx.finance.domain.enums.CreationType.class);

    public final ListPath<CrtTripHeaderDetails, QCrtTripHeaderDetails> crtTripHeaderDetails = this.<CrtTripHeaderDetails, QCrtTripHeaderDetails>createList("crtTripHeaderDetails", CrtTripHeaderDetails.class, QCrtTripHeaderDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final SetPath<EnquiryDimensionDetail, QEnquiryDimensionDetail> dimensionDetail = this.<EnquiryDimensionDetail, QEnquiryDimensionDetail>createSet("dimensionDetail", EnquiryDimensionDetail.class, QEnquiryDimensionDetail.class, PathInits.DIRECT2);

    public final QDirectRateRequestHeader directRateRequestHeader;

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final QEnquiryAddlDetail enquiryAddlDetail;

    public final ListPath<EnquiryChargeDetailsNew, QEnquiryChargeDetailsNew> enquiryChargeDetail = this.<EnquiryChargeDetailsNew, QEnquiryChargeDetailsNew>createList("enquiryChargeDetail", EnquiryChargeDetailsNew.class, QEnquiryChargeDetailsNew.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> enquiryDate = createDateTime("enquiryDate", java.util.Date.class);

    public final SetPath<EnquiryNewContainerDetails, QEnquiryNewContainerDetails> enquiryNewContainerDetails = this.<EnquiryNewContainerDetails, QEnquiryNewContainerDetails>createSet("enquiryNewContainerDetails", EnquiryNewContainerDetails.class, QEnquiryNewContainerDetails.class, PathInits.DIRECT2);

    public final StringPath enquiryNo = createString("enquiryNo");

    public final ListPath<EnquiryRoutingDetail, QEnquiryRoutingDetail> enquiryRoutingDetails = this.<EnquiryRoutingDetail, QEnquiryRoutingDetail>createList("enquiryRoutingDetails", EnquiryRoutingDetail.class, QEnquiryRoutingDetail.class, PathInits.DIRECT2);

    public final QEnquiryServiceAddlDetail enquiryServiceAddlDetail;

    public final QEnquirySpotRatesMapping enquirySpotRatesMapping;

    public final EnumPath<com.newage.fx.finance.domain.enums.EnquiryType> enquiryType = createEnum("enquiryType", com.newage.fx.finance.domain.enums.EnquiryType.class);

    public final StringPath enquiryUid = createString("enquiryUid");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> plannedScheduleId = createNumber("plannedScheduleId", Long.class);

    public final DateTimePath<java.util.Date> quoteByDate = createDateTime("quoteByDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> rateRequestCreated = createEnum("rateRequestCreated", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> rateRequestModification = createEnum("rateRequestModification", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> reasonId = createNumber("reasonId", Long.class);

    public final StringPath remark = createString("remark");

    public final NumberPath<Long> routeBydId = createNumber("routeBydId", Long.class);

    public final NumberPath<Long> routed = createNumber("routed", Long.class);

    public final NumberPath<Long> salesmanId = createNumber("salesmanId", Long.class);

    public final StringPath salesmanName = createString("salesmanName");

    public final QEnquiryServiceDetail serviceDetail;

    public final StringPath shipmentUid = createString("shipmentUid");

    public final QEnquirySpotQuotationNew spotQuotation;

    public final ListPath<SpotQuotationChargeHistory, QSpotQuotationChargeHistory> spotQuotationChargeHistories = this.<SpotQuotationChargeHistory, QSpotQuotationChargeHistory>createList("spotQuotationChargeHistories", SpotQuotationChargeHistory.class, QSpotQuotationChargeHistory.class, PathInits.DIRECT2);

    public final SetPath<SpotQuotationRejectToResubmitLogHistory, QSpotQuotationRejectToResubmitLogHistory> spotQuotationRejectToResubmitLogHistories = this.<SpotQuotationRejectToResubmitLogHistory, QSpotQuotationRejectToResubmitLogHistory>createSet("spotQuotationRejectToResubmitLogHistories", SpotQuotationRejectToResubmitLogHistory.class, QSpotQuotationRejectToResubmitLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.EnquiryStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.EnquiryStatus.class);

    public final NumberPath<Long> userEmployeeId = createNumber("userEmployeeId", Long.class);

    public final SetPath<EnquiryNewValueAddedServiceDetails, QEnquiryNewValueAddedServiceDetails> valueAddedServiceDetail = this.<EnquiryNewValueAddedServiceDetails, QEnquiryNewValueAddedServiceDetails>createSet("valueAddedServiceDetail", EnquiryNewValueAddedServiceDetails.class, QEnquiryNewValueAddedServiceDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QEnquiryHeader(String variable) {
        this(EnquiryHeader.class, forVariable(variable), INITS);
    }

    public QEnquiryHeader(Path<? extends EnquiryHeader> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryHeader(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryHeader(PathMetadata metadata, PathInits inits) {
        this(EnquiryHeader.class, metadata, inits);
    }

    public QEnquiryHeader(Class<? extends EnquiryHeader> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cargoDetail = inits.isInitialized("cargoDetail") ? new QEnquiryCargoDetail(forProperty("cargoDetail"), inits.get("cargoDetail")) : null;
        this.directRateRequestHeader = inits.isInitialized("directRateRequestHeader") ? new QDirectRateRequestHeader(forProperty("directRateRequestHeader"), inits.get("directRateRequestHeader")) : null;
        this.enquiryAddlDetail = inits.isInitialized("enquiryAddlDetail") ? new QEnquiryAddlDetail(forProperty("enquiryAddlDetail"), inits.get("enquiryAddlDetail")) : null;
        this.enquiryServiceAddlDetail = inits.isInitialized("enquiryServiceAddlDetail") ? new QEnquiryServiceAddlDetail(forProperty("enquiryServiceAddlDetail"), inits.get("enquiryServiceAddlDetail")) : null;
        this.enquirySpotRatesMapping = inits.isInitialized("enquirySpotRatesMapping") ? new QEnquirySpotRatesMapping(forProperty("enquirySpotRatesMapping"), inits.get("enquirySpotRatesMapping")) : null;
        this.serviceDetail = inits.isInitialized("serviceDetail") ? new QEnquiryServiceDetail(forProperty("serviceDetail"), inits.get("serviceDetail")) : null;
        this.spotQuotation = inits.isInitialized("spotQuotation") ? new QEnquirySpotQuotationNew(forProperty("spotQuotation"), inits.get("spotQuotation")) : null;
    }

}

