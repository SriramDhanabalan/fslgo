package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_carrier_container_info")
public class CarrierContainerInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "container_id", length = 20)
    private Long containerId;

    @Column(name = "container_name")
    private String containerName;

    @Column(name = "container_code")
    private String containerCode;

    @Column(name = "no_of_container")
    private  int noOfContainer;

//    @ManyToOne()
//    @JoinColumn(name = "carrier_cargo_id", foreignKey = @ForeignKey(name = "FK_CARRIER_CONTAINERID"))
//    CarrierShipmentCargoDetails cargoDetails;

    @ManyToOne()
    @JoinColumn(name = "carrier_container_info_id", foreignKey = @ForeignKey(name = "FK_CARRIER_CONTAINERID"))
    CarrierShipmentCargoDetails carrierShipmentCargoDetails;
}
