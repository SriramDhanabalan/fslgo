package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCarrierPartyAddressInfo is a Querydsl query type for CarrierPartyAddressInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCarrierPartyAddressInfo extends EntityPathBase<CarrierPartyAddressInfo> {

    private static final long serialVersionUID = -1980824987L;

    public static final QCarrierPartyAddressInfo carrierPartyAddressInfo = new QCarrierPartyAddressInfo("carrierPartyAddressInfo");

    public final StringPath buildingNo = createString("buildingNo");

    public final NumberPath<Long> cityId = createNumber("cityId", Long.class);

    public final StringPath cityName = createString("cityName");

    public final StringPath contactPerson = createString("contactPerson");

    public final NumberPath<Long> contactPersonId = createNumber("contactPersonId", Long.class);

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath countryName = createString("countryName");

    public final NumberPath<Long> customerId = createNumber("customerId", Long.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> stateId = createNumber("stateId", Long.class);

    public final StringPath stateName = createString("stateName");

    public final StringPath streetName = createString("streetName");

    public QCarrierPartyAddressInfo(String variable) {
        super(CarrierPartyAddressInfo.class, forVariable(variable));
    }

    public QCarrierPartyAddressInfo(Path<? extends CarrierPartyAddressInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCarrierPartyAddressInfo(PathMetadata metadata) {
        super(CarrierPartyAddressInfo.class, metadata);
    }

}

