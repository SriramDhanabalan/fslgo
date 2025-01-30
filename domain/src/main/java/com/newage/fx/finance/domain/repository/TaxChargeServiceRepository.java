package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QTaxChargeServieMappingDetails;
import com.newage.fx.finance.domain.entity.TaxChargeServieMappingDetails;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface TaxChargeServiceRepository extends JpaRepository<TaxChargeServieMappingDetails, Long>,
        QuerydslPredicateExecutor<TaxChargeServieMappingDetails>, QuerydslBinderCustomizer<QTaxChargeServieMappingDetails> {

    TaxChargeServieMappingDetails findByChargeIdAndServiceId(Long chargeId, Long serviceId);

    default void customize(QuerydslBindings bindings, QTaxChargeServieMappingDetails root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);

    }
}
