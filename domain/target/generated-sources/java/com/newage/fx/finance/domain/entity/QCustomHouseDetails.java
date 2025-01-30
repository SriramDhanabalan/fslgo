package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomHouseDetails is a Querydsl query type for CustomHouseDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomHouseDetails extends EntityPathBase<CustomHouseDetails> {

    private static final long serialVersionUID = 2125241122L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomHouseDetails customHouseDetails = new QCustomHouseDetails("customHouseDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> divisionId = createNumber("divisionId", Long.class);

    public final NumberPath<Long> finalDestinationCountryId = createNumber("finalDestinationCountryId", Long.class);

    public final NumberPath<Long> finalDestinationId = createNumber("finalDestinationId", Long.class);

    public final NumberPath<Long> finalDestinationLegId = createNumber("finalDestinationLegId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Freight> freight = createEnum("freight", com.newage.fx.finance.domain.enums.Freight.class);

    public final DateTimePath<java.util.Date> hblDate = createDateTime("hblDate", java.util.Date.class);

    public final StringPath hblNo = createString("hblNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.HouseDetailsTrade> houseDetailsTrade = createEnum("houseDetailsTrade", com.newage.fx.finance.domain.enums.HouseDetailsTrade.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final DateTimePath<java.util.Date> manifestHblDate = createDateTime("manifestHblDate", java.util.Date.class);

    public final StringPath manifestHblNo = createString("manifestHblNo");

    public final NumberPath<Long> masterId = createNumber("masterId", Long.class);

    public final QCustomPartyDetails partyDetails;

    public final NumberPath<Long> portOfDischargeId = createNumber("portOfDischargeId", Long.class);

    public final NumberPath<Long> portOfLoadingId = createNumber("portOfLoadingId", Long.class);

    public final NumberPath<Long> portOfLoadingLegId = createNumber("portOfLoadingLegId", Long.class);

    public final NumberPath<Long> portOfOriginId = createNumber("portOfOriginId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.Routed> routed = createEnum("routed", com.newage.fx.finance.domain.enums.Routed.class);

    public final NumberPath<Long> routedById = createNumber("routedById", Long.class);

    public final QCustomShipmentDetails shipmentDetails;

    public final QShipmentHeader shipmentHeader;

    public final NumberPath<Long> termOfShipmentId = createNumber("termOfShipmentId", Long.class);

    public QCustomHouseDetails(String variable) {
        this(CustomHouseDetails.class, forVariable(variable), INITS);
    }

    public QCustomHouseDetails(Path<? extends CustomHouseDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomHouseDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomHouseDetails(PathMetadata metadata, PathInits inits) {
        this(CustomHouseDetails.class, metadata, inits);
    }

    public QCustomHouseDetails(Class<? extends CustomHouseDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.partyDetails = inits.isInitialized("partyDetails") ? new QCustomPartyDetails(forProperty("partyDetails"), inits.get("partyDetails")) : null;
        this.shipmentDetails = inits.isInitialized("shipmentDetails") ? new QCustomShipmentDetails(forProperty("shipmentDetails"), inits.get("shipmentDetails")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

