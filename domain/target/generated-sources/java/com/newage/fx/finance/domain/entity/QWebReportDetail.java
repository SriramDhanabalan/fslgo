package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWebReportDetail is a Querydsl query type for WebReportDetail
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWebReportDetail extends EntityPathBase<WebReportDetail> {

    private static final long serialVersionUID = 1488771178L;

    public static final QWebReportDetail webReportDetail = new QWebReportDetail("webReportDetail");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final DateTimePath<java.util.Date> createDate = createDateTime("createDate", java.util.Date.class);

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath createUser = createString("createUser");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath reportId = createString("reportId");

    public final StringPath reportName = createString("reportName");

    public final StringPath reportScript = createString("reportScript");

    public final DateTimePath<java.util.Date> runDate = createDateTime("runDate", java.util.Date.class);

    public final StringPath runUser = createString("runUser");

    public QWebReportDetail(String variable) {
        super(WebReportDetail.class, forVariable(variable));
    }

    public QWebReportDetail(Path<? extends WebReportDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWebReportDetail(PathMetadata metadata) {
        super(WebReportDetail.class, metadata);
    }

}

