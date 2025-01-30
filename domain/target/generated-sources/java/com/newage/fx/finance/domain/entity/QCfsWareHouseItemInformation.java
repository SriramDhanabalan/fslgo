package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCfsWareHouseItemInformation is a Querydsl query type for CfsWareHouseItemInformation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCfsWareHouseItemInformation extends EntityPathBase<CfsWareHouseItemInformation> {

    private static final long serialVersionUID = -1106029993L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCfsWareHouseItemInformation cfsWareHouseItemInformation = new QCfsWareHouseItemInformation("cfsWareHouseItemInformation");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final NumberPath<Double> grossWeight = createNumber("grossWeight", Double.class);

    public final QCfsWareHouseHeaderDetails headerDetails;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfPieces = createNumber("noOfPieces", Integer.class);

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final StringPath packName = createString("packName");

    public final DateTimePath<java.util.Date> shippingBillingDate = createDateTime("shippingBillingDate", java.util.Date.class);

    public final StringPath shippingBillingNo = createString("shippingBillingNo");

    public final StringPath shippingInvoiceNo = createString("shippingInvoiceNo");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volume = createNumber("volume", Double.class);

    public QCfsWareHouseItemInformation(String variable) {
        this(CfsWareHouseItemInformation.class, forVariable(variable), INITS);
    }

    public QCfsWareHouseItemInformation(Path<? extends CfsWareHouseItemInformation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCfsWareHouseItemInformation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCfsWareHouseItemInformation(PathMetadata metadata, PathInits inits) {
        this(CfsWareHouseItemInformation.class, metadata, inits);
    }

    public QCfsWareHouseItemInformation(Class<? extends CfsWareHouseItemInformation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.headerDetails = inits.isInitialized("headerDetails") ? new QCfsWareHouseHeaderDetails(forProperty("headerDetails"), inits.get("headerDetails")) : null;
    }

}

