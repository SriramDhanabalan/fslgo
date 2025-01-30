package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.HouseDetailsTrade;
import com.newage.fx.finance.domain.enums.Routed;
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
@Table(name = "nxt_custom_house_details")
public class CustomHouseDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "division_id")
    private Long divisionId;

    @Column(name = "hbl_no")
    private String hblNo;

    @Column(name = "hbl_date")
    private Date hblDate;

    @Column(name = "manifest_hbl_no")
    private String manifestHblNo;

    @Column(name = "manifest_hbl_date")
    private Date manifestHblDate;

    @Column(name = "port_of_origin_id")
    private Long portOfOriginId;

    @Column(name = "port_of_loading_id")
    private Long portOfLoadingId;

    @Column(name = "port_of_loading_leg_id")
    private Long portOfLoadingLegId;

    @Column(name = "port_of_discharge_id")
    private Long portOfDischargeId;

    @Column(name = "final_destination_id")
    private Long finalDestinationId;

    @Column(name = "final_destination_leg_id")
    private Long finalDestinationLegId;

    @Column(name = "term_of_Shipment_id")
    private Long termOfShipmentId;

    @Column(name = "final_destination_country_id")
    private Long finalDestinationCountryId;

    @Column(name = "house_details_trade")
    private HouseDetailsTrade houseDetailsTrade;

    @Column(name = "freight")
    private Freight freight;

    @Column(name = "routed")
    private Routed routed;

    @Column(name = "routed_by_id")
    private Long routedById;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ID"))
    private ShipmentHeader shipmentHeader;

    @Column(name = "master_id")
    private Long masterId;

    @OneToOne(mappedBy = "customHouseDetails", cascade = CascadeType.ALL)
    CustomPartyDetails partyDetails;

    @OneToOne(mappedBy = "customHouseDetails", cascade = CascadeType.ALL)
    CustomShipmentDetails shipmentDetails;
}
