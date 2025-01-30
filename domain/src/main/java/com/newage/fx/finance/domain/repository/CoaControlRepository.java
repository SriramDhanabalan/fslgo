package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.coa.CoaControl;
import com.newage.fx.finance.domain.entity.coa.QCoaControl;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;

public interface CoaControlRepository extends JpaRepository<CoaControl, Long>,
        QuerydslPredicateExecutor<CoaControl>, QuerydslBinderCustomizer<QCoaControl> {

   // List<CoaControl> findByField1LikeAndField2LikeAndField3Like(Long param1, Long param2, Long param3);

    @Query("SELECT c FROM CoaControl c WHERE " +
            "c.coaHeaderId = :headerId AND " +
            "c.coaGroupId = :groupId AND " +
            "c.coaSubGroupId = :subGroupId")
    List<CoaControl> findByCoaHeaderIdAndCoaGroupIdAndCoaSubGroupId(
            @Param("headerId") Long headerId,
            @Param("groupId") Long groupId,
            @Param("subGroupId") Long subGroupId);



    default void customize(QuerydslBindings bindings, QCoaControl root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);

    }
}
