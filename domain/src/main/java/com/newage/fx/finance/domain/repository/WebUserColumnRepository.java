package com.newage.fx.finance.domain.repository;


import com.newage.fx.finance.domain.entity.WebUserColumn;
import com.newage.fx.finance.domain.entity.QWebUserColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.stereotype.Repository;

@Repository
public interface WebUserColumnRepository extends JpaRepository<WebUserColumn, Long>,
        QuerydslPredicateExecutor<WebUserColumn>,
        QuerydslBinderCustomizer<QWebUserColumn> {

    // Custom query method to find WebUserColumn by slNo
    WebUserColumn findBySlNo(Long slNo);

    // Querydsl customizations for binding
    @Override
    default void customize(QuerydslBindings bindings, QWebUserColumn root) {
        bindings.excludeUnlistedProperties(true);  // Exclude properties not listed in the bindings
        bindings.including(root.id);  // Include id field
        bindings.including(root.slNo);  // Include slNo field
        bindings.including(root.columnPreferences);  // Include columnPreferences field
    }
}
