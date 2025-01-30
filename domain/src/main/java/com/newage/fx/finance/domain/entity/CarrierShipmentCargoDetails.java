package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nxt_sales_carrier_shipment_cargo_details")
public class CarrierShipmentCargoDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


 @OneToMany(mappedBy = "carrierShipmentCargoDetails", cascade = CascadeType.ALL)
 private List<CarrierCommodityDetails> commodityDetails = new ArrayList<>();

@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "carrier_booking_id", foreignKey = @ForeignKey(name = "FK_CARRIER_CARGO_BOOKING_ID"))
private CarrierBookingDetails carrierBookingDetails;

@OneToMany(mappedBy = "carrierShipmentCargoDetails", cascade = CascadeType.ALL )
private List<CarrierContainerInfo> carrierContainerInfo = new ArrayList<>();

}
