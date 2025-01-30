package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSignOff is a Querydsl query type for SignOff
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSignOff extends EntityPathBase<SignOff> {

    private static final long serialVersionUID = -340494397L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSignOff signOff = new QSignOff("signOff");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> commentId = createNumber("commentId", Long.class);

    public final StringPath commentName = createString("commentName");

    public final StringPath comments = createString("comments");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isChecked = createEnum("isChecked", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> isUnSignOffChecked = createEnum("isUnSignOffChecked", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMasterHeader masterHeader;

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> ownerId = createNumber("ownerId", Long.class);

    public final StringPath ownerName = createString("ownerName");

    public final QServiceMasterShipmentHeader serviceMasterShipmentHeader;

    public final QShipmentHeader shipmentHeader;

    public final StringPath signoffMode = createString("signoffMode");

    public final StringPath signOffStatus = createString("signOffStatus");

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.SourceType> sourceType = createEnum("sourceType", com.newage.fx.finance.domain.enums.SourceType.class);

    public final DateTimePath<java.util.Date> statusDate = createDateTime("statusDate", java.util.Date.class);

    public final NumberPath<Long> unSignOffCommentId = createNumber("unSignOffCommentId", Long.class);

    public final StringPath unSignOffCommentName = createString("unSignOffCommentName");

    public final StringPath unSignOffComments = createString("unSignOffComments");

    public final StringPath unSignOffDescription = createString("unSignOffDescription");

    public final StringPath unSignOffNotes = createString("unSignOffNotes");

    public final NumberPath<Long> unSignOffOwnerId = createNumber("unSignOffOwnerId", Long.class);

    public final StringPath unSignOffOwnerName = createString("unSignOffOwnerName");

    public final StringPath unSignOffStatus = createString("unSignOffStatus");

    public final DateTimePath<java.util.Date> unSignOffstatusDate = createDateTime("unSignOffstatusDate", java.util.Date.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QSignOff(String variable) {
        this(SignOff.class, forVariable(variable), INITS);
    }

    public QSignOff(Path<? extends SignOff> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSignOff(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSignOff(PathMetadata metadata, PathInits inits) {
        this(SignOff.class, metadata, inits);
    }

    public QSignOff(Class<? extends SignOff> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.masterHeader = inits.isInitialized("masterHeader") ? new QMasterHeader(forProperty("masterHeader"), inits.get("masterHeader")) : null;
        this.serviceMasterShipmentHeader = inits.isInitialized("serviceMasterShipmentHeader") ? new QServiceMasterShipmentHeader(forProperty("serviceMasterShipmentHeader"), inits.get("serviceMasterShipmentHeader")) : null;
        this.shipmentHeader = inits.isInitialized("shipmentHeader") ? new QShipmentHeader(forProperty("shipmentHeader"), inits.get("shipmentHeader")) : null;
    }

}

