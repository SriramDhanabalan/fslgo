package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryQuestionnairesResponsesNxt is a Querydsl query type for CallEntryQuestionnairesResponsesNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryQuestionnairesResponsesNxt extends EntityPathBase<CallEntryQuestionnairesResponsesNxt> {

    private static final long serialVersionUID = 1764501293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryQuestionnairesResponsesNxt callEntryQuestionnairesResponsesNxt = new QCallEntryQuestionnairesResponsesNxt("callEntryQuestionnairesResponsesNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryQuestionnairesNxt callEntryQuestionnaire;

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath response = createString("response");

    public final NumberPath<Long> responseId = createNumber("responseId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryQuestionnairesResponsesNxt(String variable) {
        this(CallEntryQuestionnairesResponsesNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryQuestionnairesResponsesNxt(Path<? extends CallEntryQuestionnairesResponsesNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryQuestionnairesResponsesNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryQuestionnairesResponsesNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryQuestionnairesResponsesNxt.class, metadata, inits);
    }

    public QCallEntryQuestionnairesResponsesNxt(Class<? extends CallEntryQuestionnairesResponsesNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryQuestionnaire = inits.isInitialized("callEntryQuestionnaire") ? new QCallEntryQuestionnairesNxt(forProperty("callEntryQuestionnaire"), inits.get("callEntryQuestionnaire")) : null;
    }

}

