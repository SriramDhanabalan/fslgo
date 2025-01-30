package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquiry_service_detail")
public class EnquiryServiceDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "enquiry_id", length = 100, nullable = false)
    private Long enquiryId;

    @Column(name = "enquiry_service_uid", length = 100, nullable = false)
    private Long enquiryServiceUid;

    @Column(name = "service_transport_mode", nullable = true, length = 30)
    @Enumerated(EnumType.STRING)
    private TransportMode serviceTransportMode;

    @Column(name = "service_date")
    private Date serviceDate;

    @Column(name = "service_id", nullable = false, length = 20)
    private Long serviceId;

    @Column(name = "service_code", nullable = false, length = 10)
    private String serviceCode;

//    @NotNull
    @Column(name = "product_code", nullable = false, length = 100)
    private String serviceName;

    @Column(name = "origin_id", nullable = false, length = 20)
    private Long originId;

//    @NotNull
    @Column(name = "origin_name", nullable = false, length = 100)
    private String originName;

    @Column(name = "destination_id", nullable = false, length = 20)
    private Long destinationId;

//    @NotNull
    @Column(name = "destination_name", nullable = false, length = 100)
    private String destinationName;

    @Column(name = "trade_lane", nullable = false, length = 100)
    private String tradeLane;

    @Column(name = "tos_id", nullable = false, length = 20)
    @JsonProperty("tos")
    private Long tosId;

    @Column(name = "enquiry_no", nullable = false, length = 20)
    private String enquiryNo;

    @Column(name = "service_trade", length = 100)
    @Enumerated(EnumType.STRING)
    private ImportExport serviceTrade;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "no_of_free_day")
    private String  noOfFreeDay;
//    @Column(name = "product_code", nullable = false, length = 10)
//    private String productCode;

    @Column(name = "service_mode", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ServiceMode serviceMode;

    @Column(name = "service_type", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "business_type", length = 100, nullable = false)
    @Enumerated(EnumType.STRING)
    private ServiceType businessType;

    @Column(name = "service_division", nullable = true, length = 10)
    private String serviceDivision;

    @Column(name = "service_status", nullable = true, length = 10)
    private String serviceStatus;

    @Column(name = "pickup_required", nullable = false, length = 10)
    private boolean pickupRequired;

    @Column(name = "delivery_required", nullable = false, length = 10)
    private boolean deliveryRequired;

    @Column(name = "from_place", nullable = false, length = 10)
    private String fromPlace;

    @Column(name = "to_place", nullable = false, length = 10)
    private String toPlace;

    @Column(name = "routing_haul")
    @Enumerated(EnumType.STRING)
    private RoutingHaul routingHaul;

    @Column(name = "notes", nullable = true)
    @Lob
    private String notes;

    //CRT
    @Column(name = "pickup_point")
    private String pickupPoint;

    @Column(name = "drop_point")
    private String dropPoint;

    @Column(name = "billing_party_id")
    private Long billingPartyId;

    @Column(name = "reference_no1")
    private String referenceNo1;

    @Column(name = "reference_no2")
    private String referenceNo2;

    @Column(name = "do_cut_off_date")
    private Date doCutOffDate;

    @Column(name = "demurrage_date")
    private Date demurrageDate;

    @Column(name = "port_cut_off_date")
    private Date portCutOffDate;

    @Column(name = "transit_days")
    private String transitDays;

    @Column(name = "carrier_id", nullable = false, length = 20)
    private Long carrierId;

    @Column(name = "carrier_name", nullable = false, length = 100)
    private String carrierName;

    @Column(name = "customer_reference_no", nullable = true, length = 100)
    private String customerReferenceNo;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_SERVICE_DETAIL"))
    private EnquiryHeader enquiryDetail;
}
