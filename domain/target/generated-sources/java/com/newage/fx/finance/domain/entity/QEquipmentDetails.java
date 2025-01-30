package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipmentDetails is a Querydsl query type for EquipmentDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEquipmentDetails extends EntityPathBase<EquipmentDetails> {

    private static final long serialVersionUID = 69533347L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEquipmentDetails equipmentDetails = new QEquipmentDetails("equipmentDetails");

    public final StringPath equipmentContainerNo = createString("equipmentContainerNo");

    public final QGeneralInfoAesCustomDetails generalInfo;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sealNo = createNumber("sealNo", Long.class);

    public QEquipmentDetails(String variable) {
        this(EquipmentDetails.class, forVariable(variable), INITS);
    }

    public QEquipmentDetails(Path<? extends EquipmentDetails> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEquipmentDetails(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEquipmentDetails(PathMetadata metadata, PathInits inits) {
        this(EquipmentDetails.class, metadata, inits);
    }

    public QEquipmentDetails(Class<? extends EquipmentDetails> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.generalInfo = inits.isInitialized("generalInfo") ? new QGeneralInfoAesCustomDetails(forProperty("generalInfo"), inits.get("generalInfo")) : null;
    }

}

