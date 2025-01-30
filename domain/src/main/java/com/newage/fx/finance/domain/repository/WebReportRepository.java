package com.newage.fx.finance.domain.repository;


import com.newage.fx.finance.domain.entity.QWebReport;
import com.newage.fx.finance.domain.entity.WebReport;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WebReportRepository extends JpaRepository<WebReport, String>,
        QuerydslPredicateExecutor<WebReport>, QuerydslBinderCustomizer<QWebReport> {

    // Find WebReport by email
    Optional<WebReport> findByEmail(String email);

    // Find WebReport by reportId
    Optional<WebReport> findByReportId(String reportId);

    // Find WebReport by email and reportId
    Optional<WebReport> findByEmailAndReportId(String email, String reportId);

    @Override
    default void customize(QuerydslBindings bindings, QWebReport root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.userId);
        bindings.including(root.reportId);
        bindings.including(root.reportName);
        bindings.including(root.runDate);
        bindings.including(root.daily);
        bindings.including(root.weekly);
        bindings.including(root.monthly);
        bindings.including(root.email);
        bindings.including(root.status);
        bindings.including(root.filter);
        bindings.including(root.shipmentStatus);
        bindings.including(root.isDefault);
        bindings.including(root.autoReportType);
        bindings.including(root.chartType);
        bindings.including(root.graphCounts);
        bindings.including(root.menuType);
        bindings.including(root.menuLovStatus);
        bindings.including(root.presetName);

        // Custom String search for fields like reportName and filter
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
