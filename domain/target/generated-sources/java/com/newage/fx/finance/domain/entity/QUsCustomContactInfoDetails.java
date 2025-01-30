package com.newage.fx.finance.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsCustomContactInfoDetails is a Querydsl query type for UsCustomContactInfoDetails
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsCustomContactInfoDetails extends EntityPathBase<UsCustomContactInfoDetails> {

    private static final long serialVersionUID = 1505335954L;

    public static final QUsCustomContactInfoDetails usCustomContactInfoDetails = new QUsCustomContactInfoDetails("usCustomContactInfoDetails");

    public final StringPath buildingNoAndName = createString("buildingNoAndName");

    public final StringPath cityName = createString("cityName");

    public final StringPath conStateName = createString("conStateName");

    public final NumberPath<Long> countryId = createNumber("countryId", Long.class);

    public final StringPath email = createString("email");

    public final StringPath firstName = createString("firstName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lastName = createString("lastName");

    public final StringPath mobileNo = createString("mobileNo");

    public final StringPath phoneNo = createString("phoneNo");

    public final StringPath poBoxNo = createString("poBoxNo");

    public final StringPath preMobileNo = createString("preMobileNo");

    public final StringPath prePhoneNo = createString("prePhoneNo");

    public final NumberPath<Long> stateId = createNumber("stateId", Long.class);

    public final StringPath streetName = createString("streetName");

    public final NumberPath<Long> zipCodeId = createNumber("zipCodeId", Long.class);

    public QUsCustomContactInfoDetails(String variable) {
        super(UsCustomContactInfoDetails.class, forVariable(variable));
    }

    public QUsCustomContactInfoDetails(Path<? extends UsCustomContactInfoDetails> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsCustomContactInfoDetails(PathMetadata metadata) {
        super(UsCustomContactInfoDetails.class, metadata);
    }

}

