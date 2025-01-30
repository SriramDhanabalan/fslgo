package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCustomPartyAddressInfo is a Querydsl query type for CustomPartyAddressInfo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCustomPartyAddressInfo extends EntityPathBase<CustomPartyAddressInfo> {

    private static final long serialVersionUID = -11450340L;

    public static final QCustomPartyAddressInfo customPartyAddressInfo = new QCustomPartyAddressInfo("customPartyAddressInfo");

    public final StringPath address1 = createString("address1");

    public final StringPath address2 = createString("address2");

    public final StringPath address3 = createString("address3");

    public final NumberPath<Long> cityId = createNumber("cityId", Long.class);

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath gst = createString("gst");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath iec = createString("iec");

    public final StringPath pan = createString("pan");

    public final StringPath pin = createString("pin");

    public final NumberPath<Long> stateId = createNumber("stateId", Long.class);

    public final StringPath subCode = createString("subCode");

    public final StringPath subName = createString("subName");

    public final StringPath type = createString("type");

    public QCustomPartyAddressInfo(String variable) {
        super(CustomPartyAddressInfo.class, forVariable(variable));
    }

    public QCustomPartyAddressInfo(Path<? extends CustomPartyAddressInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCustomPartyAddressInfo(PathMetadata metadata) {
        super(CustomPartyAddressInfo.class, metadata);
    }

}

