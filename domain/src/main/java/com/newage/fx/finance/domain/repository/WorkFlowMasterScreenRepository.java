package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QWorkFlowMasterScreen;
import com.newage.fx.finance.domain.entity.WorkFlowMasterScreen;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

public interface WorkFlowMasterScreenRepository extends JpaRepository<WorkFlowMasterScreen, Long>, QuerydslPredicateExecutor<WorkFlowMasterScreen>, QuerydslBinderCustomizer<QWorkFlowMasterScreen> {

    default void customize(QuerydslBindings bindings, QWorkFlowMasterScreen root) {

        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.including(root.productName);
        bindings.including(root.tos.id);
        bindings.including(root.screenName);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }

    @Query(value = "select wfm from WorkFlowMasterScreen wfm join wfm.tos tos where wfm.screenName= :screen and wfm.productName= :productName and tos.id= :tosId")
    WorkFlowMasterScreen findByScreenNameAndProductNameAndTos(String screen, String productName, Long tosId);

    WorkFlowMasterScreen findByScreenName(String screen);
}