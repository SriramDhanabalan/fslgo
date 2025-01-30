package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QTaxMaster;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface TaxMasterRepository extends JpaRepository<TaxMaster, Long>,
        QuerydslPredicateExecutor<TaxMaster>, QuerydslBinderCustomizer<QTaxMaster> {
    @Override
    default void customize(QuerydslBindings bindings, QTaxMaster root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.code);
        bindings.including(root.name);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
