package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;

import com.newage.fx.finance.domain.enums.CarrierBookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "nxt_sales_carrier_booking")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarrierBookingDetails extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_provider", nullable = true)
    private  String  serviceProvider;

    @Column(name = "booking_ref_no", nullable = true)
    private  String  carrierBookingRefNo;

    @Enumerated(EnumType.STRING)
    @Column(name = "booking_current_status", nullable = true)
    private CarrierBookingStatus bookingCurrentStatus;

    @Column(name = "carrier_id", nullable = true)
    private  Long  carrierId;

    @Column(name = "carrier", nullable = true)
    private  String  carrier;

    @Column(name = "vessel_id", nullable = true)
    private  Long  vesselId;

    @Column(name = "vessel", nullable = true)
    private  String  vessel;

    @Column(name = "voyage", nullable = true)
    private  String  voyage;

    @Column(name = "carrier_contract_no", nullable = true)
    private  String  carrierContractNo;

    @Column(name = "place_of_receipt_id", nullable = true)
    private  Long  placeOfReceiptId;

    @Column(name = "place_of_delivery_id", nullable = true)
    private  Long  placeOfDeliveryId;

    @Column(name = "etd", nullable = true)
    private  Date  etd;

    @Column(name = "service_type", nullable = true)
    private  String  serviceType;

    @Column(name = "retry_count")
    private Integer retryCount=0;

    @Column(name = "job_ref_no", nullable = true)   //ShipmentUid
    private  String  jobReferenceNo;

    @Column(name="tenant_id")
    private String tenantId;

    @Column(name="company")
    private String company;

    @Column(name = "branch")
    private String branch;

    @Column(name = "additional_request_id")
    private String additionalRequestId;

    @Column(name= "send_si")
    private Boolean sendSI=false;

    @OneToOne(mappedBy = "carrierBookingDetails", cascade = CascadeType.ALL)
    private CarrierBookingOtherInfoDetails carrierBookingOtherInfoDetails;

    @OneToOne(mappedBy = "carrierBookingDetails", cascade = CascadeType.ALL)
    private CarrierShipmentPartyDetails partyDetails;

//    @OneToOne(mappedBy = "carrierBookingDetails", cascade = CascadeType.ALL)
//    private CarrierShipmentInfoDetails infoDetails;

    @OneToOne(mappedBy = "carrierBookingDetails", cascade = CascadeType.ALL)
    private CarrierShipmentCargoDetails cargoDetails;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ID"))
    private ShipmentHeader shipmentHeader;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "sailing_schedule_id", foreignKey = @ForeignKey(name = "FK_SAILING_SCHEDULE_ID"))
    private SailingScheduleHeaderDetails sailingScheduleDetails;


}
