package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMasterTransportDocumentOcean is a Querydsl query type for MasterTransportDocumentOcean
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMasterTransportDocumentOcean extends EntityPathBase<MasterTransportDocumentOcean> {

    private static final long serialVersionUID = 1250241611L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMasterTransportDocumentOcean masterTransportDocumentOcean = new QMasterTransportDocumentOcean("masterTransportDocumentOcean");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath aesNumber = createString("aesNumber");

    public final StringPath billLadingNo = createString("billLadingNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.BLType> blType = createEnum("blType", com.newage.fx.finance.domain.enums.BLType.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath company = createString("company");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath consignee = createString("consignee");

    public final StringPath consigneeAddress = createString("consigneeAddress");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final StringPath descriptionOfPackage = createString("descriptionOfPackage");

    public final StringPath documentNo = createString("documentNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportDocumentType> documentType = createEnum("documentType", com.newage.fx.finance.domain.enums.TransportDocumentType.class);

    public final StringPath exportInstruction = createString("exportInstruction");

    public final StringPath exportReference = createString("exportReference");

    public final StringPath fieldOne = createString("fieldOne");

    public final StringPath fieldThree = createString("fieldThree");

    public final StringPath fieldTwo = createString("fieldTwo");

    public final StringPath forwarderAgent = createString("forwarderAgent");

    public final StringPath forwarderAgentAddress = createString("forwarderAgentAddress");

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> freight = createEnum("freight", com.newage.fx.finance.domain.enums.Freight.class);

    public final StringPath FTZNo = createString("FTZNo");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final ListPath<TransportDocumentOtherCharges, QTransportDocumentOtherCharges> hblChargeDetails = this.<TransportDocumentOtherCharges, QTransportDocumentOtherCharges>createList("hblChargeDetails", TransportDocumentOtherCharges.class, QTransportDocumentOtherCharges.class, PathInits.DIRECT2);

    public final ListPath<TransportDocumentContainerDetails, QTransportDocumentContainerDetails> hblContainerDetails = this.<TransportDocumentContainerDetails, QTransportDocumentContainerDetails>createList("hblContainerDetails", TransportDocumentContainerDetails.class, QTransportDocumentContainerDetails.class, PathInits.DIRECT2);

    public final ListPath<TransportDocumentLogHistory, QTransportDocumentLogHistory> hblHistoryLogs = this.<TransportDocumentLogHistory, QTransportDocumentLogHistory>createList("hblHistoryLogs", TransportDocumentLogHistory.class, QTransportDocumentLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.HawbStatus> hblStatus = createEnum("hblStatus", com.newage.fx.finance.domain.enums.HawbStatus.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath internalReference = createString("internalReference");

    public final DateTimePath<java.util.Date> issueDate = createDateTime("issueDate", java.util.Date.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final QMasterHeader masterHeader;

    public final StringPath move = createString("move");

    public final StringPath notifyParty = createString("notifyParty");

    public final StringPath notifyPartyAddress = createString("notifyPartyAddress");

    public final StringPath oceanCarrier = createString("oceanCarrier");

    public final NumberPath<Long> placeOfDeliveryId = createNumber("placeOfDeliveryId", Long.class);

    public final StringPath placeOfDeliveryName = createString("placeOfDeliveryName");

    public final NumberPath<Long> placeOfIssueId = createNumber("placeOfIssueId", Long.class);

    public final StringPath placeOfIssueName = createString("placeOfIssueName");

    public final NumberPath<Long> placeOfReceiptId = createNumber("placeOfReceiptId", Long.class);

    public final StringPath placeOfReceiptName = createString("placeOfReceiptName");

    public final NumberPath<Long> portOfDischargeId = createNumber("portOfDischargeId", Long.class);

    public final StringPath portOfDischargeName = createString("portOfDischargeName");

    public final NumberPath<Long> portOfLoadingId = createNumber("portOfLoadingId", Long.class);

    public final StringPath portOfLoadingName = createString("portOfLoadingName");

    public final NumberPath<Long> preCarriage = createNumber("preCarriage", Long.class);

    public final StringPath preCarrier = createString("preCarrier");

    public final StringPath shipper = createString("shipper");

    public final StringPath shipperAddress = createString("shipperAddress");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final StringPath terminal = createString("terminal");

    public final ListPath<TransportDocumentDetails, QTransportDocumentDetails> transportDocumentDetails = this.<TransportDocumentDetails, QTransportDocumentDetails>createList("transportDocumentDetails", TransportDocumentDetails.class, QTransportDocumentDetails.class, PathInits.DIRECT2);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final StringPath vesselName = createString("vesselName");

    public final StringPath voyageNumber = createString("voyageNumber");

    public QMasterTransportDocumentOcean(String variable) {
        this(MasterTransportDocumentOcean.class, forVariable(variable), INITS);
    }

    public QMasterTransportDocumentOcean(Path<? extends MasterTransportDocumentOcean> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMasterTransportDocumentOcean(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMasterTransportDocumentOcean(PathMetadata metadata, PathInits inits) {
        this(MasterTransportDocumentOcean.class, metadata, inits);
    }

    public QMasterTransportDocumentOcean(Class<? extends MasterTransportDocumentOcean> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
    }

}

