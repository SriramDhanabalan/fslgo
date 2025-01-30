//package com.newage.fx.finance.domain.repository;
//
//import com.newage.fx.finance.domain.entity.QSailingScheduleVesselDetails;
//import com.newage.fx.finance.domain.entity.SailingScheduleVesselDetails;
//import com.querydsl.core.types.dsl.StringExpression;
//import com.querydsl.core.types.dsl.StringPath;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
//import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
//import org.springframework.data.querydsl.binding.QuerydslBindings;
//import org.springframework.data.querydsl.binding.SingleValueBinding;
//
//public interface SailingScheduleVesselRepository extends JpaRepository<SailingScheduleVesselDetails, Long> , QuerydslPredicateExecutor<SailingScheduleVesselDetails>, QuerydslBinderCustomizer<QSailingScheduleVesselDetails> {
//
//
////    @Override
////    default void customize(QuerydslBindings bindings, QSailingScheduleVesselDetails root) {
////        bindings.excludeUnlistedProperties(true);
////        bindings.including(root.sailingScheduleStatus);
////        bindings.including(root.id);
////        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
////    }
//
//    @Override
//    default void customize(QuerydslBindings bindings, QSailingScheduleVesselDetails root) {
//        bindings.excludeUnlistedProperties(true);
//        bindings.including(root.vesselName);
//        bindings.including(root.voyageNumber);
//        bindings.including(root.sailingScheduleDetails.any().scheduleId);
//        bindings.including(root.sailingScheduleDetails.any().originName);
//        bindings.including(root.sailingScheduleDetails.any().destinationName);
//        bindings.including(root.sailingScheduleDetails.any().carrierName);
//        bindings.including(root.sailingScheduleDetails.any().eta);
//        bindings.including(root.sailingScheduleDetails.any().etd);
//        bindings.including(root.sailingScheduleDetails.any().originCutOffDate);
//        bindings.including(root.sailingScheduleDetails.any().sailingScheduleStatus);
//        bindings.bind(String.class).first((SingleValueBinding<StringPath, String>) StringExpression::containsIgnoreCase);
//    }
//
//
//
//
//
//
//
//
//
//}
