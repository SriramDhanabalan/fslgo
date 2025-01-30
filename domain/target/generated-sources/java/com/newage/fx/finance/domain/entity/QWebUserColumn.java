package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWebUserColumn is a Querydsl query type for WebUserColumn
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWebUserColumn extends EntityPathBase<WebUserColumn> {

    private static final long serialVersionUID = -496154106L;

    public static final QWebUserColumn webUserColumn = new QWebUserColumn("webUserColumn");

    public final StringPath columnPreferences = createString("columnPreferences");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> slNo = createNumber("slNo", Long.class);

    public QWebUserColumn(String variable) {
        super(WebUserColumn.class, forVariable(variable));
    }

    public QWebUserColumn(Path<? extends WebUserColumn> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWebUserColumn(PathMetadata metadata) {
        super(WebUserColumn.class, metadata);
    }

}

