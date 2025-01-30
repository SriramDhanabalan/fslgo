package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCustomShipmentDetails is a Querydsl query type for CustomShipmentDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomShipmentDetails extends EntityPathBase<CustomShipmentDetails> {

    private static final long serialVersionUID = -117184728L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCustomShipmentDetails customShipmentDetails = new QCustomShipmentDetails("customShipmentDetails");

    public final StringPath blReleased = createString("blReleased");

    public final StringPath cargoMovement = createString("cargoMovement");

    public final StringPath commodityDescription = createString("commodityDescription");

    public final StringPath currency = createString("currency");

    public final NumberPath<Long> currencyId = createNumber("currencyId", Long.class);

    public final StringPath currencyRate = createString("currencyRate");

    public final QCustomHouseDetails customHouseDetails;

    public final DateTimePath<java.util.Date> docDate = createDateTime("docDate", java.util.Date.class);

    public final StringPath docNo = createString("docNo");

    public final StringPath docSiteId = createString("docSiteId");

    public final StringPath docType = createString("docType");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> freeZone = createEnum("freeZone", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final NumberPath<Long> hsCodeId = createNumber("hsCodeId", Long.class);

    public final StringPath hsPackCode = createString("hsPackCode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath imdgCode = createString("imdgCode");

    public final StringPath invoice = createString("invoice");

    public final StringPath invoiceTo = createString("invoiceTo");

    public final StringPath irnNo = createString("irnNo");

    public final StringPath itemType = createString("itemType");

    public final StringPath marksAndNumber = createString("marksAndNumber");

    public final StringPath natureOfCargo = createString("natureOfCargo");

    public final StringPath noOfHsPack = createString("noOfHsPack");

    public final StringPath note = createString("note");

    public final StringPath packCode = createString("packCode");

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final StringPath pcin = createString("pcin");

    public final StringPath pcinNo = createString("pcinNo");

    public final StringPath service = createString("service");

    public final StringPath unitOfVolume = createString("unitOfVolume");

    public final NumberPath<Long> unitOfVolumeId = createNumber("unitOfVolumeId", Long.class);

    public final StringPath unoCode = createString("unoCode");

    public QCustomShipmentDetails(String variable) {
        this(CustomShipmentDetails.class, forVariable(variable), INITS);
    }

    public QCustomShipmentDetails(Path<? extends CustomShipmentDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCustomShipmentDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCustomShipmentDetails(PathMetadata metadata, PathInits inits) {
        this(CustomShipmentDetails.class, metadata, inits);
    }

    public QCustomShipmentDetails(Class<? extends CustomShipmentDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customHouseDetails = inits.isInitialized("customHouseDetails") ? new QCustomHouseDetails(forProperty("customHouseDetails"), inits.get("customHouseDetails")) : null;
    }

}

