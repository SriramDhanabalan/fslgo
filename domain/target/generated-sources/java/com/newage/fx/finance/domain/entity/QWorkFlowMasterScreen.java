package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkFlowMasterScreen is a Querydsl query type for WorkFlowMasterScreen
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWorkFlowMasterScreen extends EntityPathBase<WorkFlowMasterScreen> {

    private static final long serialVersionUID = -1883740868L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWorkFlowMasterScreen workFlowMasterScreen = new QWorkFlowMasterScreen("workFlowMasterScreen");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath productName = createString("productName");

    public final StringPath screenName = createString("screenName");

    public final QTosMaster tos;

    public final QWorkFlowMaster workFlowMaster;

    public QWorkFlowMasterScreen(String variable) {
        this(WorkFlowMasterScreen.class, forVariable(variable), INITS);
    }

    public QWorkFlowMasterScreen(Path<? extends WorkFlowMasterScreen> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWorkFlowMasterScreen(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWorkFlowMasterScreen(PathMetadata metadata, PathInits inits) {
        this(WorkFlowMasterScreen.class, metadata, inits);
    }

    public QWorkFlowMasterScreen(Class<? extends WorkFlowMasterScreen> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tos = inits.isInitialized("tos") ? new QTosMaster(forProperty("tos")) : null;
        this.workFlowMaster = inits.isInitialized("workFlowMaster") ? new QWorkFlowMaster(forProperty("workFlowMaster")) : null;
    }

}

