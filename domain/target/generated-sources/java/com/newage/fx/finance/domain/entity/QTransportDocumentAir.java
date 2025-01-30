package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransportDocumentAir is a Querydsl query type for TransportDocumentAir
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTransportDocumentAir extends EntityPathBase<TransportDocumentAir> {

    private static final long serialVersionUID = -989906539L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransportDocumentAir transportDocumentAir = new QTransportDocumentAir("transportDocumentAir");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath accountingInformation = createString("accountingInformation");

    public final StringPath accountNo = createString("accountNo");

    public final StringPath aesNumber = createString("aesNumber");

    public final StringPath agent = createString("agent");

    public final StringPath agentIATACode = createString("agentIATACode");

    public final NumberPath<Long> agentId = createNumber("agentId", Long.class);

    public final StringPath airportOfDeparture = createString("airportOfDeparture");

    public final NumberPath<Long> airportOfDepartureId = createNumber("airportOfDepartureId", Long.class);

    public final StringPath amountOfInsurance = createString("amountOfInsurance");

    public final StringPath autoAgent = createString("autoAgent");

    public final NumberPath<Long> autoAgentId = createNumber("autoAgentId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.BLType> blType = createEnum("blType", com.newage.fx.finance.domain.enums.BLType.class);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath byFirstCarrier = createString("byFirstCarrier");

    public final NumberPath<Long> byFirstCarrierId = createNumber("byFirstCarrierId", Long.class);

    public final StringPath carrierAgent = createString("carrierAgent");

    public final NumberPath<Long> carrierAgentId = createNumber("carrierAgentId", Long.class);

    public final NumberPath<Long> carrierId = createNumber("carrierId", Long.class);

    public final StringPath carrierName = createString("carrierName");

    public final StringPath ccCharge = createString("ccCharge");

    public final NumberPath<Long> ccChargeId = createNumber("ccChargeId", Long.class);

    public final StringPath chargeableWeight = createString("chargeableWeight");

    public final StringPath chargeAtDestination = createString("chargeAtDestination");

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> chargeCode = createEnum("chargeCode", com.newage.fx.finance.domain.enums.Freight.class);

    public final StringPath commodityCode = createString("commodityCode");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath consignee = createString("consignee");

    public final StringPath consigneeAccountNumber = createString("consigneeAccountNumber");

    public final StringPath consigneeAddress = createString("consigneeAddress");

    public final StringPath consigneeName = createString("consigneeName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath currencyCode = createString("currencyCode");

    public final StringPath currencyConversionRate = createString("currencyConversionRate");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final DateTimePath<java.util.Date> date = createDateTime("date", java.util.Date.class);

    public final StringPath declareValueOfCarriage = createString("declareValueOfCarriage");

    public final StringPath declareValueOfCustoms = createString("declareValueOfCustoms");

    public final StringPath destination = createString("destination");

    public final NumberPath<Long> destinationId = createNumber("destinationId", Long.class);

    public final StringPath DiversionContrayToUS = createString("DiversionContrayToUS");

    public final StringPath documentNo = createString("documentNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.TransportDocumentType> documentType = createEnum("documentType", com.newage.fx.finance.domain.enums.TransportDocumentType.class);

    public final DateTimePath<java.util.Date> flight1Date = createDateTime("flight1Date", java.util.Date.class);

    public final DateTimePath<java.util.Date> flight2Date = createDateTime("flight2Date", java.util.Date.class);

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final StringPath handlingInformation = createString("handlingInformation");

    public final StringPath hawbGeneratedNo = createString("hawbGeneratedNo");

    public final ListPath<TransportDocumentLogHistory, QTransportDocumentLogHistory> hawbHistoryLogs = this.<TransportDocumentLogHistory, QTransportDocumentLogHistory>createList("hawbHistoryLogs", TransportDocumentLogHistory.class, QTransportDocumentLogHistory.class, PathInits.DIRECT2);

    public final EnumPath<com.newage.fx.finance.domain.enums.HawbStatus> hawbStatus = createEnum("hawbStatus", com.newage.fx.finance.domain.enums.HawbStatus.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuingAddress = createString("issuingAddress");

    public final StringPath issuingCarrierAgent = createString("issuingCarrierAgent");

    public final StringPath issuingCarrierNameAndCity = createString("issuingCarrierNameAndCity");

    public final StringPath issuingName = createString("issuingName");

    public final StringPath kgOrLb = createString("kgOrLb");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final StringPath masterRefId = createString("masterRefId");

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> other1 = createEnum("other1", com.newage.fx.finance.domain.enums.Freight.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> other2 = createEnum("other2", com.newage.fx.finance.domain.enums.Freight.class);

    public final ListPath<TransportDocumentOtherCharges, QTransportDocumentOtherCharges> otherCharges = this.<TransportDocumentOtherCharges, QTransportDocumentOtherCharges>createList("otherCharges", TransportDocumentOtherCharges.class, QTransportDocumentOtherCharges.class, PathInits.DIRECT2);

    public final StringPath otherDueAgentColllect = createString("otherDueAgentColllect");

    public final StringPath otherDueAgentPrepaid = createString("otherDueAgentPrepaid");

    public final StringPath otherDueCarrierCollect = createString("otherDueCarrierCollect");

    public final StringPath otherDueCarrierPrepaid = createString("otherDueCarrierPrepaid");

    public final StringPath panNumber = createString("panNumber");

    public final EnumPath<com.newage.fx.finance.domain.enums.RateClass> rateClass = createEnum("rateClass", com.newage.fx.finance.domain.enums.RateClass.class);

    public final StringPath rateOrCharge = createString("rateOrCharge");

    public final StringPath routingBy1 = createString("routingBy1");

    public final NumberPath<Long> routingBy1Id = createNumber("routingBy1Id", Long.class);

    public final StringPath routingBy2 = createString("routingBy2");

    public final NumberPath<Long> routingBy2Id = createNumber("routingBy2Id", Long.class);

    public final StringPath routingNo1 = createString("routingNo1");

    public final StringPath routingNo2 = createString("routingNo2");

    public final StringPath routingNo3 = createString("routingNo3");

    public final StringPath routingTo1 = createString("routingTo1");

    public final NumberPath<Long> routingTo1Id = createNumber("routingTo1Id", Long.class);

    public final StringPath routingTo2 = createString("routingTo2");

    public final NumberPath<Long> routingTo2Id = createNumber("routingTo2Id", Long.class);

    public final StringPath routingTo3 = createString("routingTo3");

    public final NumberPath<Long> routingTo3Id = createNumber("routingTo3Id", Long.class);

    public final QShipmentHeader shipmentHeader;

    public final StringPath shipper = createString("shipper");

    public final StringPath shipperAccountNumber = createString("shipperAccountNumber");

    public final StringPath shipperAddress = createString("shipperAddress");

    public final StringPath shipperName = createString("shipperName");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final StringPath taxCollect = createString("taxCollect");

    public final StringPath taxPrepaid = createString("taxPrepaid");

    public final StringPath total = createString("total");

    public final StringPath totalCollect = createString("totalCollect");

    public final StringPath totalPrepaid = createString("totalPrepaid");

    public final StringPath totalVolume = createString("totalVolume");

    public final ListPath<TransportDocumentDetails, QTransportDocumentDetails> transportDocumentDetails = this.<TransportDocumentDetails, QTransportDocumentDetails>createList("transportDocumentDetails", TransportDocumentDetails.class, QTransportDocumentDetails.class, PathInits.DIRECT2);

    public final StringPath valuationChargesCollect = createString("valuationChargesCollect");

    public final StringPath valuationChargesPrepaid = createString("valuationChargesPrepaid");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final StringPath voyageNo1 = createString("voyageNo1");

    public final StringPath voyageNo2 = createString("voyageNo2");

    public final StringPath weightChargeCollect = createString("weightChargeCollect");

    public final StringPath weightChargePrepaid = createString("weightChargePrepaid");

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> wtOrVal1 = createEnum("wtOrVal1", com.newage.fx.finance.domain.enums.Freight.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> wtOrVal2 = createEnum("wtOrVal2", com.newage.fx.finance.domain.enums.Freight.class);

    public QTransportDocumentAir(String variable) {
        this(TransportDocumentAir.class, forVariable(variable), INITS);
    }

    public QTransportDocumentAir(Path<? extends TransportDocumentAir> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransportDocumentAir(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransportDocumentAir(PathMetadata metadata, PathInits inits) {
        this(TransportDocumentAir.class, metadata, inits);
    }

    public QTransportDocumentAir(Class<? extends TransportDocumentAir> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

