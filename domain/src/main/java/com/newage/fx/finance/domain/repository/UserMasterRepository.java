package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QTaxMaster;
import com.newage.fx.finance.domain.entity.QUserMaster;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.newage.fx.finance.domain.entity.UserMaster;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Long>,
        QuerydslPredicateExecutor<UserMaster>, QuerydslBinderCustomizer<QUserMaster> {
    @Override
    default void customize(QuerydslBindings bindings, QUserMaster root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.name);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }

    UserMaster findByUserId(String userId);
}


