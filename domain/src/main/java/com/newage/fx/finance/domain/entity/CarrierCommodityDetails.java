package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nxt_sales_carrier_commodity_details")
public class CarrierCommodityDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commodity_id")
    private Long commodityId;

    @Column(name = "commodity_name")
    private String commodityName;

    @Column(name = "commodity_description")
    private String commodityDescription;

    @Column(name = "gross_weight")
    private Double grossWeight;

    @Column(name = "volume")
    private Double volume;

    @Column(name = "chargable_weight")
    private Double chargableWeight;

    @Column(name = "reefer_required")
    private YesNo referRequired;

    @ManyToOne()
    @JoinColumn(name = "carrier_cargo_id", foreignKey = @ForeignKey(name = "FK_CARRIER_CARGOID"))
    CarrierShipmentCargoDetails carrierShipmentCargoDetails;
}
