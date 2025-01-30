package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserMaster is a Querydsl query type for UserMaster
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserMaster extends EntityPathBase<UserMaster> {

    private static final long serialVersionUID = -240510180L;

    public static final QUserMaster userMaster = new QUserMaster("userMaster");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath accountId = createString("accountId");

    public final StringPath address = createString("address");

    public final StringPath bcCode = createString("bcCode");

    public final StringPath ccEmail = createString("ccEmail");

    public final StringPath city = createString("city");

    public final StringPath clearanceEmail = createString("clearanceEmail");

    public final StringPath clientType = createString("clientType");

    public final StringPath companyCode = createString("companyCode");

    public final StringPath countryCode = createString("countryCode");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath creditLimitOverride = createString("creditLimitOverride");

    public final StringPath currency = createString("currency");

    public final StringPath customerContactPerson = createString("customerContactPerson");

    public final StringPath customerRole = createString("customerRole");

    public final StringPath defaultAirport = createString("defaultAirport");

    public final StringPath defaultPortCode = createString("defaultPortCode");

    public final StringPath divisionNote = createString("divisionNote");

    public final StringPath eblEmail = createString("eblEmail");

    public final StringPath email = createString("email");

    public final StringPath employeeCode = createString("employeeCode");

    public final StringPath exportAirEmail = createString("exportAirEmail");

    public final StringPath exportFclEmail = createString("exportFclEmail");

    public final StringPath exportImport = createString("exportImport");

    public final StringPath exportLclEmail = createString("exportLclEmail");

    public final StringPath groupAccountId = createString("groupAccountId");

    public final StringPath groupName = createString("groupName");

    public final StringPath handlingBranchCode = createString("handlingBranchCode");

    public final StringPath handlingPersonEmail = createString("handlingPersonEmail");

    public final StringPath handlingPersonName = createString("handlingPersonName");

    public final StringPath importAirEmail = createString("importAirEmail");

    public final StringPath importFclEmail = createString("importFclEmail");

    public final StringPath importHandlingPersonEmail = createString("importHandlingPersonEmail");

    public final StringPath importLclEmail = createString("importLclEmail");

    public final StringPath isAccountDocumentDisplay = createString("isAccountDocumentDisplay");

    public final StringPath isAgent = createString("isAgent");

    public final StringPath isClearance = createString("isClearance");

    public final StringPath isContractedCust = createString("isContractedCust");

    public final StringPath isDocumentViewable = createString("isDocumentViewable");

    public final StringPath isFreight = createString("isFreight");

    public final StringPath isGroupAccount = createString("isGroupAccount");

    public final StringPath isLocked = createString("isLocked");

    public final StringPath isOurEmployee = createString("isOurEmployee");

    public final StringPath isPo = createString("isPo");

    public final StringPath isWms = createString("isWms");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lovStatus = createString("lovStatus");

    public final StringPath name = createString("name");

    public final ArrayPath<byte[], Byte> note = createArray("note", byte[].class);

    public final DateTimePath<java.util.Date> overrideUpto = createDateTime("overrideUpto", java.util.Date.class);

    public final StringPath password = createString("password");

    public final DateTimePath<java.util.Date> passwordExpiryDate = createDateTime("passwordExpiryDate", java.util.Date.class);

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath product = createString("product");

    public final NumberPath<Long> registrationNo = createNumber("registrationNo", Long.class);

    public final StringPath role = createString("role");

    public final StringPath routed = createString("routed");

    public final ArrayPath<byte[], Byte> shortName = createArray("shortName", byte[].class);

    public final StringPath type = createString("type");

    public final StringPath userId = createString("userId");

    public final StringPath userType = createString("userType");

    public final StringPath versionCode = createString("versionCode");

    public final ListPath<WebUserDetail, QWebUserDetail> webUserDetails = this.<WebUserDetail, QWebUserDetail>createList("webUserDetails", WebUserDetail.class, QWebUserDetail.class, PathInits.DIRECT2);

    public final ArrayPath<byte[], Byte> welcomeGroupNote = createArray("welcomeGroupNote", byte[].class);

    public final ArrayPath<byte[], Byte> welcomeNote = createArray("welcomeNote", byte[].class);

    public final StringPath wmsEmail = createString("wmsEmail");

    public QUserMaster(String variable) {
        super(UserMaster.class, forVariable(variable));
    }

    public QUserMaster(Path<? extends UserMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserMaster(PathMetadata metadata) {
        super(UserMaster.class, metadata);
    }

}

