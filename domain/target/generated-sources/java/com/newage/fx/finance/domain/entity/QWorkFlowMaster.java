package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWorkFlowMaster is a Querydsl query type for WorkFlowMaster
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWorkFlowMaster extends EntityPathBase<WorkFlowMaster> {

    private static final long serialVersionUID = 1821506736L;

    public static final QWorkFlowMaster workFlowMaster = new QWorkFlowMaster("workFlowMaster");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath workflowCode = createString("workflowCode");

    public final StringPath workflowName = createString("workflowName");

    public QWorkFlowMaster(String variable) {
        super(WorkFlowMaster.class, forVariable(variable));
    }

    public QWorkFlowMaster(Path<? extends WorkFlowMaster> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkFlowMaster(PathMetadata metadata) {
        super(WorkFlowMaster.class, metadata);
    }

}

