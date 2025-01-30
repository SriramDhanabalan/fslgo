package com.newage.fx.finance.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "nxt_sales_carrier_party_details")
public class CarrierShipmentPartyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JoinColumn(name = "booked_by_address_id", foreignKey = @ForeignKey(name = "FK_CARRIER_SHIPMENT_BOOKEDBYADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private CarrierPartyAddressInfo bookedByAdd;

    @Column(name = "booked_by_contact_person")
    private String bookedByContactPerson;

//        @Column(name = "price_owner_id",  length = 20)
//        private Long priceOwnerId;

    @JoinColumn(name = "price_owner_address_id", foreignKey = @ForeignKey(name = "FK_CARRIER_SHIPMENT_PRICEOWNERADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private CarrierPartyAddressInfo priceOwnerAdd;

    @Column(name = "price_owner_contact_person")
    private String priceOwnerContactPerson;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "carrier_booking_id", foreignKey = @ForeignKey(name = "FK_CARRIER_PARTY_ID"))
    private CarrierBookingDetails carrierBookingDetails;
}
