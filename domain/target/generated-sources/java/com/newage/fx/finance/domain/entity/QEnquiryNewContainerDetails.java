package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEnquiryNewContainerDetails is a Querydsl query type for EnquiryNewContainerDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEnquiryNewContainerDetails extends EntityPathBase<EnquiryNewContainerDetails> {

    private static final long serialVersionUID = -1302176371L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEnquiryNewContainerDetails enquiryNewContainerDetails = new QEnquiryNewContainerDetails("enquiryNewContainerDetails");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final NumberPath<Long> cfsTerminalId = createNumber("cfsTerminalId", Long.class);

    public final StringPath cfsTerminalName = createString("cfsTerminalName");

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final NumberPath<Long> containerId = createNumber("containerId", Long.class);

    public final StringPath containerNo = createString("containerNo");

    public final StringPath containerType = createString("containerType");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QEnquiryHeader enquiryDetail;

    public final DateTimePath<java.util.Date> expectedArrivalTime = createDateTime("expectedArrivalTime", java.util.Date.class);

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> noOfContainer = createNumber("noOfContainer", Integer.class);

    public final StringPath note = createString("note");

    public final DateTimePath<java.util.Date> plannedArrivalTime = createDateTime("plannedArrivalTime", java.util.Date.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final StringPath timeSlot = createString("timeSlot");

    public QEnquiryNewContainerDetails(String variable) {
        this(EnquiryNewContainerDetails.class, forVariable(variable), INITS);
    }

    public QEnquiryNewContainerDetails(Path<? extends EnquiryNewContainerDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEnquiryNewContainerDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEnquiryNewContainerDetails(PathMetadata metadata, PathInits inits) {
        this(EnquiryNewContainerDetails.class, metadata, inits);
    }

    public QEnquiryNewContainerDetails(Class<? extends EnquiryNewContainerDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.enquiryDetail = inits.isInitialized("enquiryDetail") ? new QEnquiryHeader(forProperty("enquiryDetail"), inits.get("enquiryDetail")) : null;
    }

}

