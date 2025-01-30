package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QSailingScheduleHeaderDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleHeaderDetails;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

@Repository
public interface SailingScheduleNewRepository extends JpaRepository<SailingScheduleHeaderDetails, Long>, QuerydslPredicateExecutor<SailingScheduleHeaderDetails>, QuerydslBinderCustomizer<QSailingScheduleHeaderDetails> {

    SailingScheduleHeaderDetails findByScheduleId(String scheduleId);
    @Override
    default void customize(QuerydslBindings bindings, QSailingScheduleHeaderDetails root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.including(root.status);
        bindings.including(root.scheduleId);
        bindings.including(root.loadPortCutoffDate);
        bindings.including(root.etd);
        bindings.including(root.eta);
        bindings.including(root.carrierName);
        bindings.including(root.vesselName);
        bindings.including(root.routeNo);
        bindings.including(root.imoNumber);
        bindings.including(root.destinationName);
        bindings.including(root.originName);
        bindings.including(root.viaNumber);
        bindings.including(root.cfsCutOffDate);
        bindings.including(root.service);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }






}
