package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryHeaderNxt is a Querydsl query type for CallEntryHeaderNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryHeaderNxt extends EntityPathBase<CallEntryHeaderNxt> {

    private static final long serialVersionUID = 236997080L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryHeaderNxt callEntryHeaderNxt = new QCallEntryHeaderNxt("callEntryHeaderNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final DateTimePath<java.util.Date> callCompletedDate = createDateTime("callCompletedDate", java.util.Date.class);

    public final ListPath<AttachmentDetail, QAttachmentDetail> callEntryAttachmentDetail = this.<AttachmentDetail, QAttachmentDetail>createList("callEntryAttachmentDetail", AttachmentDetail.class, QAttachmentDetail.class, PathInits.DIRECT2);

    public final ListPath<CallEntryFollowUpLogHistory, QCallEntryFollowUpLogHistory> callEntryFollowUpLogHistories = this.<CallEntryFollowUpLogHistory, QCallEntryFollowUpLogHistory>createList("callEntryFollowUpLogHistories", CallEntryFollowUpLogHistory.class, QCallEntryFollowUpLogHistory.class, PathInits.DIRECT2);

    public final QCallEntryFollowUpNxt callEntryFollowUpNxt;

    public final QCallEntryNxtToEfsPosting callEntryNxtToEfsPosting;

    public final StringPath callEntryUid = createString("callEntryUid");

    public final EnumPath<com.newage.fx.finance.domain.enums.CallMode> callMode = createEnum("callMode", com.newage.fx.finance.domain.enums.CallMode.class);

    public final StringPath callNo = createString("callNo");

    public final StringPath callNote = createString("callNote");

    public final StringPath callOwnerEmail = createString("callOwnerEmail");

    public final NumberPath<Long> callOwnerId = createNumber("callOwnerId", Long.class);

    public final StringPath callOwnerName = createString("callOwnerName");

    public final DateTimePath<java.util.Date> callStartDate = createDateTime("callStartDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.CallType> callType = createEnum("callType", com.newage.fx.finance.domain.enums.CallType.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final ListPath<CallEntryCompetitorDetailsNxt, QCallEntryCompetitorDetailsNxt> competitorList = this.<CallEntryCompetitorDetailsNxt, QCallEntryCompetitorDetailsNxt>createList("competitorList", CallEntryCompetitorDetailsNxt.class, QCallEntryCompetitorDetailsNxt.class, PathInits.DIRECT2);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.CallEntryCreationMode> creationMode = createEnum("creationMode", com.newage.fx.finance.domain.enums.CallEntryCreationMode.class);

    public final StringPath creationType = createString("creationType");

    public final ListPath<CallEntryAttendieesNxt, QCallEntryAttendieesNxt> customerContactDetailList = this.<CallEntryAttendieesNxt, QCallEntryAttendieesNxt>createList("customerContactDetailList", CallEntryAttendieesNxt.class, QCallEntryAttendieesNxt.class, PathInits.DIRECT2);

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath customerName = createString("customerName");

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> destinationId = createEnum("destinationId", com.newage.fx.finance.domain.enums.Freight.class);

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.CreationType> freightTerm = createEnum("freightTerm", com.newage.fx.finance.domain.enums.CreationType.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<CallEntryFollowupJointCallNxt, QCallEntryFollowupJointCallNxt> jointCallInfoList = this.<CallEntryFollowupJointCallNxt, QCallEntryFollowupJointCallNxt>createList("jointCallInfoList", CallEntryFollowupJointCallNxt.class, QCallEntryFollowupJointCallNxt.class, PathInits.DIRECT2);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final StringPath locationName = createString("locationName");

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> originId = createNumber("originId", Long.class);

    public final ListPath<CallEntryQuestionnairesNxt, QCallEntryQuestionnairesNxt> questionnaireList = this.<CallEntryQuestionnairesNxt, QCallEntryQuestionnairesNxt>createList("questionnaireList", CallEntryQuestionnairesNxt.class, QCallEntryQuestionnairesNxt.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.CallEntryRouted> routed = createEnum("routed", com.newage.fx.finance.domain.enums.CallEntryRouted.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.RoutedService> routedById = createEnum("routedById", com.newage.fx.finance.domain.enums.RoutedService.class);

    public final NumberPath<Long> salesmanId = createNumber("salesmanId", Long.class);

    public final DateTimePath<java.util.Date> scheduleFollowUpDate = createDateTime("scheduleFollowUpDate", java.util.Date.class);

    public final NumberPath<Long> serviceId = createNumber("serviceId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.ShipmentTransportMode> shipmentTransportId = createEnum("shipmentTransportId", com.newage.fx.finance.domain.enums.ShipmentTransportMode.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.CallEntryStatus> status = createEnum("status", com.newage.fx.finance.domain.enums.CallEntryStatus.class);

    public final StringPath statusReason = createString("statusReason");

    public final StringPath time = createString("time");

    public final EnumPath<com.newage.fx.finance.domain.enums.TosStatus> tosId = createEnum("tosId", com.newage.fx.finance.domain.enums.TosStatus.class);

    public final NumberPath<Long> tradeId = createNumber("tradeId", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryHeaderNxt(String variable) {
        this(CallEntryHeaderNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryHeaderNxt(Path<? extends CallEntryHeaderNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryHeaderNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryHeaderNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryHeaderNxt.class, metadata, inits);
    }

    public QCallEntryHeaderNxt(Class<? extends CallEntryHeaderNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryFollowUpNxt = inits.isInitialized("callEntryFollowUpNxt") ? new QCallEntryFollowUpNxt(forProperty("callEntryFollowUpNxt"), inits.get("callEntryFollowUpNxt")) : null;
        this.callEntryNxtToEfsPosting = inits.isInitialized("callEntryNxtToEfsPosting") ? new QCallEntryNxtToEfsPosting(forProperty("callEntryNxtToEfsPosting"), inits.get("callEntryNxtToEfsPosting")) : null;
    }

}

