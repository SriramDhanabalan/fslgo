package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPartyAddressDetail is a Querydsl query type for PartyAddressDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPartyAddressDetail extends EntityPathBase<PartyAddressDetail> {

    private static final long serialVersionUID = -1008913874L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPartyAddressDetail partyAddressDetail = new QPartyAddressDetail("partyAddressDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath addressLine1 = createString("addressLine1");

    public final StringPath addressLine2 = createString("addressLine2");

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final StringPath buildingNoName = createString("buildingNoName");

    public final NumberPath<Long> cityId = createNumber("cityId", Long.class);

    public final StringPath cityName = createString("cityName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath contactDetail = createString("contactDetail");

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath countryName = createString("countryName");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath mobile = createString("mobile");

    public final StringPath notes = createString("notes");

    public final QShipmentPartyDetail partyDetail;

    public final StringPath partyType = createString("partyType");

    public final StringPath phone = createString("phone");

    public final StringPath pickupplaceOrZipcode = createString("pickupplaceOrZipcode");

    public final StringPath poBox = createString("poBox");

    public final StringPath preMobileNo = createString("preMobileNo");

    public final StringPath prePhoneNo = createString("prePhoneNo");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final NumberPath<Long> stateId = createNumber("stateId", Long.class);

    public final StringPath stateName = createString("stateName");

    public final StringPath status = createString("status");

    public final StringPath streetName = createString("streetName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QPartyAddressDetail(String variable) {
        this(PartyAddressDetail.class, forVariable(variable), INITS);
    }

    public QPartyAddressDetail(Path<? extends PartyAddressDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPartyAddressDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPartyAddressDetail(PathMetadata metadata, PathInits inits) {
        this(PartyAddressDetail.class, metadata, inits);
    }

    public QPartyAddressDetail(Class<? extends PartyAddressDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.partyDetail = inits.isInitialized("partyDetail") ? new QShipmentPartyDetail(forProperty("partyDetail"), inits.get("partyDetail")) : null;
    }

}

