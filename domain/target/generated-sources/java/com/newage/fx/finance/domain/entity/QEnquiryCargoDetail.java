package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryCargoDetail is a Querydsl query type for EnquiryCargoDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryCargoDetail extends EntityPathBase<EnquiryCargoDetail> {

    private static final long serialVersionUID = 2017693817L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryCargoDetail enquiryCargoDetail = new QEnquiryCargoDetail("enquiryCargoDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final DateTimePath<java.util.Date> cargoReadyDate = createDateTime("cargoReadyDate", java.util.Date.class);

    public final NumberPath<Double> chargeableUnit = createNumber("chargeableUnit", Double.class);

    public final NumberPath<Double> chargeableVolumeCbm = createNumber("chargeableVolumeCbm", Double.class);

    public final NumberPath<Double> chargeableWeightKg = createNumber("chargeableWeightKg", Double.class);

    public final StringPath commodityDescription = createString("commodityDescription");

    public final NumberPath<Long> commodityId = createNumber("commodityId", Long.class);

    public final StringPath commodityName = createString("commodityName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> enquiryId = createNumber("enquiryId", Long.class);

    public final StringPath enquiryNo = createString("enquiryNo");

    public final DateTimePath<java.util.Date> expectedArrivalTime = createDateTime("expectedArrivalTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> expectedDeliveryDate = createDateTime("expectedDeliveryDate", java.util.Date.class);

    public final NumberPath<Double> grossWeightKg = createNumber("grossWeightKg", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> hazardous = createEnum("hazardous", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath marksAndNumbers = createString("marksAndNumbers");

    public final NumberPath<Integer> noOfPackages = createNumber("noOfPackages", Integer.class);

    public final StringPath notes = createString("notes");

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final DateTimePath<java.util.Date> plannedArrivalTime = createDateTime("plannedArrivalTime", java.util.Date.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> stackable = createEnum("stackable", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath timeSlot = createString("timeSlot");

    public final NumberPath<Long> vehicleTypeId = createNumber("vehicleTypeId", Long.class);

    public final StringPath vehicleTypeName = createString("vehicleTypeName");

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCbm = createNumber("volumeInCbm", Double.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volWeightKg = createNumber("volWeightKg", Double.class);

    public QEnquiryCargoDetail(String variable) {
        this(EnquiryCargoDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryCargoDetail(Path<? extends EnquiryCargoDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryCargoDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryCargoDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryCargoDetail.class, metadata, inits);
    }

    public QEnquiryCargoDetail(Class<? extends EnquiryCargoDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

