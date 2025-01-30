package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGeneralInfoAesCustomDetails is a Querydsl query type for GeneralInfoAesCustomDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGeneralInfoAesCustomDetails extends EntityPathBase<GeneralInfoAesCustomDetails> {

    private static final long serialVersionUID = 1201993129L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGeneralInfoAesCustomDetails generalInfoAesCustomDetails = new QGeneralInfoAesCustomDetails("generalInfoAesCustomDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final ListPath<CommodityDetails, QCommodityDetails> aesCommodityList = this.<CommodityDetails, QCommodityDetails>createList("aesCommodityList", CommodityDetails.class, QCommodityDetails.class, PathInits.DIRECT2);

    public final ListPath<EquipmentDetails, QEquipmentDetails> aesEquipmentDetails = this.<EquipmentDetails, QEquipmentDetails>createList("aesEquipmentDetails", EquipmentDetails.class, QEquipmentDetails.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.AesFillingType> aesFillingType = createEnum("aesFillingType", com.newage.fx.finance.domain.enums.AesFillingType.class);

    public final StringPath branch = createString("branch");

    public final StringPath company = createString("company");

    public final QConsigneeDetails consigneeDetails;

    public final StringPath correlationId = createString("correlationId");

    public final NumberPath<Long> countryOfDestinationId = createNumber("countryOfDestinationId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final DateTimePath<java.util.Date> etd = createDateTime("etd", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.FilingOption> filingOption = createEnum("filingOption", com.newage.fx.finance.domain.enums.FilingOption.class);

    public final NumberPath<Long> foreignTradeZone = createNumber("foreignTradeZone", Long.class);

    public final QFreightForwarderDetails freightForwarder;

    public final StringPath hawbNo = createString("hawbNo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> importEntryNo = createNumber("importEntryNo", Long.class);

    public final NumberPath<Long> inboundTypeId = createNumber("inboundTypeId", Long.class);

    public final BooleanPath isHazardousCargo = createBoolean("isHazardousCargo");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> masterId = createNumber("masterId", Long.class);

    public final StringPath mawbNo = createString("mawbNo");

    public final NumberPath<Long> originStateId = createNumber("originStateId", Long.class);

    public final NumberPath<Long> portOfExportationId = createNumber("portOfExportationId", Long.class);

    public final NumberPath<Long> portOfUnladingId = createNumber("portOfUnladingId", Long.class);

    public final BooleanPath routedTransaction = createBoolean("routedTransaction");

    public final NumberPath<Long> scasAndIataCodeId = createNumber("scasAndIataCodeId", Long.class);

    public final QShipmentHeader shipmentHeader;

    public final StringPath tenantId = createString("tenantId");

    public final EnumPath<com.newage.fx.finance.domain.enums.UsTransportMode> transportMode = createEnum("transportMode", com.newage.fx.finance.domain.enums.UsTransportMode.class);

    public final QUsppiAesCustomDetails usppiAesCustom;

    public final BooleanPath usppiAndUltimateConsigneeRelated = createBoolean("usppiAndUltimateConsigneeRelated");

    public final NumberPath<Long> vesselId = createNumber("vesselId", Long.class);

    public QGeneralInfoAesCustomDetails(String variable) {
        this(GeneralInfoAesCustomDetails.class, forVariable(variable), INITS);
    }

    public QGeneralInfoAesCustomDetails(Path<? extends GeneralInfoAesCustomDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGeneralInfoAesCustomDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGeneralInfoAesCustomDetails(PathMetadata metadata, PathInits inits) {
        this(GeneralInfoAesCustomDetails.class, metadata, inits);
    }

    public QGeneralInfoAesCustomDetails(Class<? extends GeneralInfoAesCustomDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.consigneeDetails = inits.isInitialized("consigneeDetails") ? new QConsigneeDetails(forProperty("consigneeDetails"), inits.get("consigneeDetails")) : null;
        this.freightForwarder = inits.isInitialized("freightForwarder") ? new QFreightForwarderDetails(forProperty("freightForwarder"), inits.get("freightForwarder")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
        this.usppiAesCustom = inits.isInitialized("usppiAesCustom") ? new QUsppiAesCustomDetails(forProperty("usppiAesCustom"), inits.get("usppiAesCustom")) : null;
    }

}

