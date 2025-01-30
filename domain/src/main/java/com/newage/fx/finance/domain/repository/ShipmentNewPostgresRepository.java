package com.newage.fx.finance.domain.repository;

import com.newage.fx.finance.domain.entity.QShipmentHeader;
import com.newage.fx.finance.domain.entity.ShipmentHeader;
import com.newage.fx.finance.domain.enums.Service;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;

import java.util.List;


public interface ShipmentNewPostgresRepository extends JpaRepository<ShipmentHeader, Long>,
        QuerydslPredicateExecutor<ShipmentHeader>, QuerydslBinderCustomizer<QShipmentHeader> {

//    @Override
//    @EntityGraph(attributePaths = {"shipmentServices","cargoDetail","transportDocumentAir","transportDocumentOcean","addlDetail"})
//    Page<ShipmentHeader> findAll(Predicate predicate, Pageable pageRequest);

    List<ShipmentHeader> findByShipmentUid(String shipmentUid);

    List<ShipmentHeader> findByShipmentUidLikeIgnoreCase(String shipmentUid);

    @Query("select s.shipmentHeader from ShipmentServiceDetail s where s.id = :shipmentServiceId")
    ShipmentHeader getShipmentByServiceId(Long shipmentServiceId);

//    @Query("SELECT sh FROM ShipmentHeader sh JOIN sh.containerDetail cd WHERE cd.containerNumber = :containerNumber")
//    List<ShipmentHeader> findByContainerNumber(String containerNumber);

//    @Query("SELECT ta.documentNo,h.id \n"+
//            "FROM ShipmentHeader AS h\n" +
//            "LEFT JOIN ShipmentServiceDetail AS s ON h.id = s.shipmentHeader.id\n" +
//            "LEFT JOIN TransportDocumentOcean AS ta ON h.id = ta.shipmentHeader.id\n" +
//            "WHERE s.serviceStatus IN ('Booked', 'Received') \n" +
//            "  AND s.tradeCode = 'Import'\n" +
//            "  AND s.branchId = :branchId\n" +
//            "  AND s.serviceName = :serviceName\n" +
//            "  AND s.serviceType = :serviceType\n" +
//            "  AND h.originId = :originId\n" +
//            "  AND h.destinationId = :destinationId\n" +
//            "  AND ta.documentNo IS NOT NULL")
//    List<Object[]> getListOfTransportDocumentOcean(Service serviceType, Long originId, Long destinationId, String serviceName, Long branchId);
//    @Query("SELECT ta.documentNo,h.id  \n" +
//            "FROM ShipmentHeader AS h\n" +
//            "LEFT JOIN ShipmentServiceDetail AS s ON h.id = s.shipmentHeader.id\n" +
//            "LEFT JOIN TransportDocumentAir AS ta ON h.id = ta.shipmentHeader.id\n" +
//            "WHERE s.serviceStatus IN ('Booked', 'Received') \n" +
//            "  AND s.tradeCode = 'Import'\n" +
//            "  AND s.branchId = :branchId\n" +
//            "  AND s.serviceName = :serviceName\n" +
//            "  AND s.serviceType = :serviceType\n" +
//            "  AND h.originId = :originId\n" +
//            "  AND h.destinationId = :destinationId\n" +
//            "  AND ta.documentNo IS NOT NULL")
//    List<Object[]> getListOfTransportDocumentAir(Service serviceType,Long originId,Long destinationId,String serviceName, Long branchId);

//    @EntityGraph(attributePaths = "shipmentServices") // Eagerly fetch the shipmentServices collection
//    Iterable<ShipmentHeader> findAll(Predicate predicate);

    @Override
    default void customize(QuerydslBindings bindings, QShipmentHeader root) {
        bindings.excludeUnlistedProperties(true);
        bindings.including(root.id);
        bindings.including(root.customerId);
        bindings.including(root.customerName);
        bindings.including(root.originId);
        bindings.including(root.shipmentUid);
        bindings.including(root.creationMode);
        bindings.including(root.originName);
        bindings.including(root.destinationId);
        bindings.including(root.destinationName);
        bindings.including(root.serviceCode);
        bindings.including(root.serviceType);
        bindings.including(root.direct);
        bindings.including(root.routed);
        bindings.including(root.routedById);
        bindings.including(root.shipmentServices.any().serviceName);
        bindings.including(root.shipmentServices.any().serviceStatus);
        bindings.including(root.shipmentServices.any().tradeCode);
        bindings.including(root.shipmentServices.any().shipmentDate);
        bindings.including(root.shipmentServices.any().serviceMode);
        bindings.including(root.shipmentServices.any().serviceAddlDetail.coLoad);
        bindings.including(root.addlDetail.plannedScheduleId);
        bindings.including(root.transportDocumentOcean.documentNo);
        bindings.including(root.transportDocumentAir.documentNo);
        bindings.including(root.partyDetail.shipperName);
        bindings.including(root.partyDetail.consigneeName);
        bindings.including(root.addlDetail.transportDocumentNo);
        bindings.including(root.tosName);
        bindings.including(root.status);
        bindings.including(root.webUserDetail.nxtCustomerId);
        bindings.including(root.addlDetail.goDate);
        bindings.including(root.pickUpDeliveryDetail.actualPickupDate);
        bindings.including(root.pickUpDeliveryDetail.actualDeliveryDate);
        bindings.including(root.partyDetail.forwarderId);
        bindings.including(root.businessType);
        bindings.including(root.cargoDetail.noOfPieces);
        bindings.including(root.cargoDetail.grossWeightKgs);
        bindings.including(root.cargoDetail.volumeInCbm);
        bindings.including(root.addlDetail.shipperRefNo);
        bindings.including(root.addlDetail.lcNumber);
        bindings.including(root.addlDetail.lcExpiryDate);
        bindings.including(root.addlDetail.doDate);
        bindings.including(root.addlDetail.doNumber);
        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
    }

}
