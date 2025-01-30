package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "nxt_sales_carrier_booking_other")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CarrierBookingOtherInfoDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "carrier_contract_no", nullable = true)
//    private  String  carrierContractNo;
//
//    @Column(name = "carrier_booking_office", nullable = true)
//    private  String  carrierBookingOffice;
//
//    @Column(name = "product_code", nullable = true)
//    private  String  productCode;

    @Column(name = "additional_info_to_carrier", nullable = true)
    private  String  additionalInfoToCarrier;

    @Column(name = "info_received_from_carrier", nullable = true)
    private  String  infoReceivedFromCarrier;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "carrier_booking_id", foreignKey = @ForeignKey(name = "FK_CARRIER_BOOKING_ID"))
    private CarrierBookingDetails carrierBookingDetails;
}
