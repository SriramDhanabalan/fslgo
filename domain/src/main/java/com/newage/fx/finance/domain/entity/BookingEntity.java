//package com.newage.fx.finance.domain.entity;
//
//import javax.persistence.*;
//
//@Entity
//public class BookingEntity {
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        private String bookingId;
//        private String hblNumber;
//        private String currency;
//        private String origin;
//        private String destination;
//        private String product;
//        private String totalWeight;
//        private String totalVolume;
//        private String packageType;
//        private String noOfUnits;
//        private String stackableCargo;
//        private String commodityName;
//        private String cargoReadyDate;
//        private String noOfContainers;
//        private String shipperName;
//        private String consigneeName;
//        private String billingPartyName;
//        private String notifyName;
//        private String containerNo;
//        private String actualSeal;
//        private String address;
//        private String text;
//        private String cargoType;
//        private String cargoPickup;
//        private String cargoInsurance;
//        private String doorDelivery;
//
//        @OneToMany(mappedBy = "booking")
//        private List<Milestone> milestones;
//
//        @OneToMany(mappedBy = "booking")
//        private List<Document> documents;
//
//    }
