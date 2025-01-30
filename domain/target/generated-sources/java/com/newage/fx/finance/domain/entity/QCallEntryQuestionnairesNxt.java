package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCallEntryQuestionnairesNxt is a Querydsl query type for CallEntryQuestionnairesNxt
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCallEntryQuestionnairesNxt extends EntityPathBase<CallEntryQuestionnairesNxt> {

    private static final long serialVersionUID = -695848107L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCallEntryQuestionnairesNxt callEntryQuestionnairesNxt = new QCallEntryQuestionnairesNxt("callEntryQuestionnairesNxt");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final NumberPath<Long> branchId = createNumber("branchId", Long.class);

    public final QCallEntryHeaderNxt callEntryHeader;

    public final ListPath<CallEntryQuestionnairesResponsesNxt, QCallEntryQuestionnairesResponsesNxt> callEntryQuestionnaireResponsesList = this.<CallEntryQuestionnairesResponsesNxt, QCallEntryQuestionnairesResponsesNxt>createList("callEntryQuestionnaireResponsesList", CallEntryQuestionnairesResponsesNxt.class, QCallEntryQuestionnairesResponsesNxt.class, PathInits.DIRECT2);

    public final NumberPath<Long> companyId = createNumber("companyId", Long.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> groupCompanyId = createNumber("groupCompanyId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath note = createString("note");

    public final NumberPath<Long> questionnaireId = createNumber("questionnaireId", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public final NumberPath<Long> version = createNumber("version", Long.class);

    public QCallEntryQuestionnairesNxt(String variable) {
        this(CallEntryQuestionnairesNxt.class, forVariable(variable), INITS);
    }

    public QCallEntryQuestionnairesNxt(Path<? extends CallEntryQuestionnairesNxt> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCallEntryQuestionnairesNxt(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCallEntryQuestionnairesNxt(PathMetadata metadata, PathInits inits) {
        this(CallEntryQuestionnairesNxt.class, metadata, inits);
    }

    public QCallEntryQuestionnairesNxt(Class<? extends CallEntryQuestionnairesNxt> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.callEntryHeader = inits.isInitialized("callEntryHeader") ? new QCallEntryHeaderNxt(forProperty("callEntryHeader"), inits.get("callEntryHeader")) : null;
    }

}

