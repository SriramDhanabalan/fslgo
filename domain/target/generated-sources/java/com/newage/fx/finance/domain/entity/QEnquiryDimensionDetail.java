package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryDimensionDetail is a Querydsl query type for EnquiryDimensionDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryDimensionDetail extends EntityPathBase<EnquiryDimensionDetail> {

    private static final long serialVersionUID = 1109403811L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryDimensionDetail enquiryDimensionDetail = new QEnquiryDimensionDetail("enquiryDimensionDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Double> chargeableWeightKg = createNumber("chargeableWeightKg", Double.class);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath dimensionUnit = createString("dimensionUnit");

    public final NumberPath<Double> dimensionValue = createNumber("dimensionValue", Double.class);

    public final QEnquiryHeader enquiryDetail;

    public final NumberPath<Long> enquiryId = createNumber("enquiryId", Long.class);

    public final StringPath enquiryNo = createString("enquiryNo");

    public final NumberPath<Double> grossWeightKgs = createNumber("grossWeightKgs", Double.class);

    public final NumberPath<Double> grossWeightLbs = createNumber("grossWeightLbs", Double.class);

    public final NumberPath<Double> grossWeightPerPiece = createNumber("grossWeightPerPiece", Double.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Double> height = createNumber("height", Double.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Double> length = createNumber("length", Double.class);

    public final NumberPath<Long> noOfPiece = createNumber("noOfPiece", Long.class);

    public final StringPath notes = createString("notes");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> overDimension = createEnum("overDimension", com.newage.fx.finance.domain.enums.YesNo.class);

    public final NumberPath<Long> packId = createNumber("packId", Long.class);

    public final NumberPath<Integer> serialNumber = createNumber("serialNumber", Integer.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public final NumberPath<Double> volumeInCft = createNumber("volumeInCft", Double.class);

    public final NumberPath<Double> volumeInCpm = createNumber("volumeInCpm", Double.class);

    public final NumberPath<Double> volWeightKg = createNumber("volWeightKg", Double.class);

    public final NumberPath<Double> width = createNumber("width", Double.class);

    public QEnquiryDimensionDetail(String variable) {
        this(EnquiryDimensionDetail.class, forVariable(variable), INITS);
    }

    public QEnquiryDimensionDetail(Path<? extends EnquiryDimensionDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryDimensionDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryDimensionDetail(PathMetadata metadata, PathInits inits) {
        this(EnquiryDimensionDetail.class, metadata, inits);
    }

    public QEnquiryDimensionDetail(Class<? extends EnquiryDimensionDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

