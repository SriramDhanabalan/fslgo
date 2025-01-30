package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryAttendieesNxt is a Querydsl query type for CallEntryAttendieesNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryAttendieesNxt extends EntityPathBase<CallEntryAttendieesNxt> {

    private static final long serialVersionUID = -115110111L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryAttendieesNxt callEntryAttendieesNxt = new QCallEntryAttendieesNxt("callEntryAttendieesNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> customerContactId = createNumber("customerContactId", Long.class);

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> decisionMaker = createEnum("decisionMaker", com.newage.fx.finance.domain.enums.YesNo.class);

    public final StringPath department = createString("department");

    public final NumberPath<Long> departmentId = createNumber("departmentId", Long.class);

    public final NumberPath<Long> designationId = createNumber("designationId", Long.class);

    public final StringPath designationName = createString("designationName");

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lastName = createString("lastName");

    public final StringPath mobileNo = createString("mobileNo");

    public final StringPath officePhoneNo = createString("officePhoneNo");

    public final StringPath preMobileNo = createString("preMobileNo");

    public final StringPath preOfficeNo = createString("preOfficeNo");

    public final EnumPath<com.newage.fx.finance.domain.enums.YesNo> primaryContact = createEnum("primaryContact", com.newage.fx.finance.domain.enums.YesNo.class);

    public final EnumPath<Salutation> salutation = createEnum("salutation", Salutation.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryAttendieesNxt(String variable) {
        this(CallEntryAttendieesNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryAttendieesNxt(Path<? extends CallEntryAttendieesNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryAttendieesNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryAttendieesNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryAttendieesNxt.class, metadata, inits);
    }

    public QCallEntryAttendieesNxt(Class<? extends CallEntryAttendieesNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
    }

}

