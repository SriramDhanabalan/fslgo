package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipmentAddlDetail is a Querydsl query type for ShipmentAddlDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShipmentAddlDetail extends EntityPathBase<ShipmentAddlDetail> {

    private static final long serialVersionUID = -1591986331L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipmentAddlDetail shipmentAddlDetail = new QShipmentAddlDetail("shipmentAddlDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> aesCutoffDate = createDateTime("aesCutoffDate", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.AesFillingParty> aesFillingParty = createEnum("aesFillingParty", com.newage.fx.finance.domain.enums.AesFillingParty.class);

    public final StringPath aesNo = createString("aesNo");

    public final StringPath amsHblNo = createString("amsHblNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> asAgreed = createEnum("asAgreed", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final DateTimePath<java.util.Date> cargoReadyDate = createDateTime("cargoReadyDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> carrierBookingDate = createDateTime("carrierBookingDate", java.util.Date.class);

    public final StringPath carrierBookingNo = createString("carrierBookingNo");

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final DateTimePath<java.util.Date> ccnDate = createDateTime("ccnDate", java.util.Date.class);

    public final StringPath ccnNo = createString("ccnNo");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> costCenterId = createNumber("costCenterId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath customerReferenceNo = createString("customerReferenceNo");

    public final DateTimePath<java.util.Date> doDate = createDateTime("doDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> doExpiryDate = createDateTime("doExpiryDate", java.util.Date.class);

    public final StringPath doNumber = createString("doNumber");

    public final StringPath efsJobno = createString("efsJobno");

    public final StringPath efsJobStatus = createString("efsJobStatus");

    public final StringPath efsSegmentCode = createString("efsSegmentCode");

    public final DateTimePath<java.util.Date> eta = createDateTime("eta", java.util.Date.class);

    public final StringPath etaTime = createString("etaTime");

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final StringPath etdTime = createString("etdTime");

    public final StringPath forwarderCcnNo = createString("forwarderCcnNo");

    public final StringPath forwarderHbl = createString("forwarderHbl");

    public final StringPath forwarderHblNo = createString("forwarderHblNo");

    public final StringPath forwarderTranshipmentCcnNo = createString("forwarderTranshipmentCcnNo");

    public final DateTimePath<java.util.Date> goDate = createDateTime("goDate", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> hold = createEnum("hold", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath holdNotes = createString("holdNotes");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath importFileNo = createString("importFileNo");

    public final StringPath InsertUpdate = createString("InsertUpdate");

    public final StringPath invoiceNote = createString("invoiceNote");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isCourierShipment = createEnum("isCourierShipment", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath isfNumber = createString("isfNumber");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isServiceJob = createEnum("isServiceJob", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> itApprovedPortId = createNumber("itApprovedPortId", Long.class);

    public final StringPath itApprovedPortName = createString("itApprovedPortName");

    public final DateTimePath<java.util.Date> itDate = createDateTime("itDate", java.util.Date.class);

    public final NumberPath<Long> itemNo = createNumber("itemNo", Long.class);

    public final StringPath itNo = createString("itNo");

    public final DateTimePath<java.util.Date> lastFreeDay = createDateTime("lastFreeDay", java.util.Date.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> lc = createEnum("lc", com.newage.fx.finance.domain.enums.YesNo.class);

    public final DateTimePath<java.util.Date> lcExpiryDate = createDateTime("lcExpiryDate", java.util.Date.class);

    public final StringPath lcNote = createString("lcNote");

    public final StringPath lcNumber = createString("lcNumber");

    public final StringPath manifestHblNo = createString("manifestHblNo");

    public final StringPath masterNo = createString("masterNo");

    public final NumberPath<Long> mftFromId = createNumber("mftFromId", Long.class);

    public final NumberPath<Long> mftToId = createNumber("mftToId", Long.class);

    public final NumberPath<Long> nxToefsId = createNumber("nxToefsId", Long.class);

    public final NumberPath<Long> plannedScheduleId = createNumber("plannedScheduleId", Long.class);

    public final StringPath poNumber = createString("poNumber");

    public final StringPath referenceNumber = createString("referenceNumber");

    public final StringPath secondaryDestinationBookingPerson = createString("secondaryDestinationBookingPerson");

    public final StringPath secondaryOriginBookingPerson = createString("secondaryOriginBookingPerson");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> shipmentCompleted = createEnum("shipmentCompleted", com.newage.fx.finance.domain.enums.YesNo.class);

    public final QShipmentHeader shipmentHeader;

    public final StringPath shipperRefNo = createString("shipperRefNo");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> subItemNo = createNumber("subItemNo", Long.class);

    public final StringPath tabValidation = createString("tabValidation");

    public final DateTimePath<java.util.Date> transCcnDate = createDateTime("transCcnDate", java.util.Date.class);

    public final StringPath transhipmentCcnNo = createString("transhipmentCcnNo");

    public final NumberPath<Long> transhipmentWarehouseId = createNumber("transhipmentWarehouseId", Long.class);

    public final StringPath transportDocumentNo = createString("transportDocumentNo");

    public final DateTimePath<java.util.Date> transWareHouseDate = createDateTime("transWareHouseDate", java.util.Date.class);

    public final StringPath tsaNo = createString("tsaNo");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public final DateTimePath<java.util.Date> vgmCutOffDate = createDateTime("vgmCutOffDate", java.util.Date.class);

    public final NumberPath<Double> vgmWeightInKgs = createNumber("vgmWeightInKgs", Double.class);

    public final NumberPath<Double> vgmWeightInLbs = createNumber("vgmWeightInLbs", Double.class);

    public final StringPath voyageOrflightNo = createString("voyageOrflightNo");

    public QShipmentAddlDetail(String variable) {
        this(ShipmentAddlDetail.class, forVariable(variable), INITS);
    }

    public QShipmentAddlDetail(Path<? extends ShipmentAddlDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipmentAddlDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipmentAddlDetail(PathMetadata metadata, PathInits inits) {
        this(ShipmentAddlDetail.class, metadata, inits);
    }

    public QShipmentAddlDetail(Class<? extends ShipmentAddlDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

