package com.newage.fx.finance.domain.repository;


import com.newage.fx.finance.domain.entity.QSailingScheduleDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleDetails;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface SailingScheduleRepository extends JpaRepository<SailingScheduleDetails, Long> , QuerydslPredicateExecutor<SailingScheduleDetails>, QuerydslBinderCustomizer<QSailingScheduleDetails> {

    @Override
    default void customize(QuerydslBindings bindings, QSailingScheduleDetails root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.sailingScheduleStatus);
        bindings.including(root.originName);
        bindings.including(root.destinationName);
        bindings.including(root.id);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}