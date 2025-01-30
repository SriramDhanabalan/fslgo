package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.*;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;



public interface EnquirySpotQuotationRepositoryNew extends JpaRepository<EnquiryHeader, Long>, QuerydslPredicateExecutor<EnquiryHeader>, QuerydslBinderCustomizer<QEnquiryHeader> {


    default void customize(QuerydslBindings bindings, QEnquiryHeader root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.createdBy);
        bindings.including(root.createdDate);
        bindings.including(root.lastModifiedDate);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
