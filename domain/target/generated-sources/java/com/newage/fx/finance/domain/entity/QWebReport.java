package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWebReport is a Querydsl query type for WebReport
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWebReport extends EntityPathBase<WebReport> {

    private static final long serialVersionUID = 1257669305L;

    public static final QWebReport webReport = new QWebReport("webReport");

    public final com.newage.fx.finance.domain.entity.coa.QAuditable _super = new com.newage.fx.finance.domain.entity.coa.QAuditable(this);

    public final StringPath autoReportType = createString("autoReportType");

    public final StringPath chartType = createString("chartType");

    public final StringPath createdBy = createString("createdBy");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final StringPath daily = createString("daily");

    public final StringPath days = createString("days");

    public final StringPath daysFlag = createString("daysFlag");

    public final StringPath defaultValue = createString("defaultValue");

    public final StringPath email = createString("email");

    public final StringPath emailBcc = createString("emailBcc");

    public final StringPath exportImport = createString("exportImport");

    public final StringPath filter = createString("filter");

    public final StringPath filterAddon = createString("filterAddon");

    public final StringPath filterOverride = createString("filterOverride");

    public final NumberPath<Integer> graphCounts = createNumber("graphCounts", Integer.class);

    public final StringPath isDefault = createString("isDefault");

    public final StringPath lastModifiedBy = createString("lastModifiedBy");

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath lclFclAir = createString("lclFclAir");

    public final StringPath menuLovStatus = createString("menuLovStatus");

    public final StringPath menuType = createString("menuType");

    public final StringPath monthly = createString("monthly");

    public final StringPath presetName = createString("presetName");

    public final StringPath registrationNo = createString("registrationNo");

    public final StringPath reportId = createString("reportId");

    public final StringPath reportName = createString("reportName");

    public final StringPath reportType = createString("reportType");

    public final DateTimePath<java.util.Date> runDate = createDateTime("runDate", java.util.Date.class);

    public final StringPath shipmentStatus = createString("shipmentStatus");

    public final NumberPath<Integer> slNo = createNumber("slNo", Integer.class);

    public final StringPath stage = createString("stage");

    public final StringPath status = createString("status");

    public final StringPath transportMode = createString("transportMode");

    public final StringPath userId = createString("userId");

    public final StringPath weekly = createString("weekly");

    public QWebReport(String variable) {
        super(WebReport.class, forVariable(variable));
    }

    public QWebReport(Path<? extends WebReport> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWebReport(PathMetadata metadata) {
        super(WebReport.class, metadata);
    }

}

