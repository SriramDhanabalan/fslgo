package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.MasterHeader;
import com.newage.fx.finance.domain.entity.MasterServiceLinkDetail;
import com.newage.fx.finance.domain.entity.QMasterServiceLinkDetail;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;
import java.util.Optional;

public interface MasterServiceLinkDetailRepository extends JpaRepository<MasterServiceLinkDetail, Long>,
        QuerydslPredicateExecutor<MasterServiceLinkDetail>, QuerydslBinderCustomizer<QMasterServiceLinkDetail> {

//    @Query("SELECT h.id FROM MasterServiceLinkDetail AS l" +
//            "LEFT JOIN ShipmentHeader AS h ON l.shipmentId = h.id\n" +
//            "WHERE l.masterHeaderId = :masterId AND l.branchId = :branchId\n")
     @Query("select h from MasterServiceLinkDetail as l\n" +
             "LEFT JOIN ShipmentHeader as h ON h.id = l.shipmentId\n" +
             "WHERE l.masterHeaderId = :masterId AND l.branchId = :branchId\n")
    List<ShipmentHeader> findShipmentLinkedByMasterId(Long masterId, Long branchId);

    Optional<List<MasterServiceLinkDetail>> findByMasterHeaderId(Long materId);

    Optional<List<MasterServiceLinkDetail>> findByShipmentId(Long shipmentId);

    @Query("select master from MasterHeader as master\n" +
            "left join MasterServiceLinkDetail as l on master.id = l.masterHeaderId\n" +
            "left join ShipmentHeader as h on h.id = l.shipmentId\n" +
            "where h.shipmentUid= :ShipmentUid")
    List<MasterHeader> findLinkedMasterByShipmentUid(String ShipmentUid);

    @Override
    default void customize(QuerydslBindings bindings, QMasterServiceLinkDetail root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.including(root.shipmentService);
        bindings.including(root.shipmentId);
        bindings.including(root.masterServiceDetail);
        bindings.including(root.masterHeaderId);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }
}
