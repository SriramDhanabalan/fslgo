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
@Table(name = "nxt_custom_party_details")
public class CustomPartyDetails {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="shipper_id")
    private Long shipperId;

    @JoinColumn(name = "shipper_address_id", foreignKey = @ForeignKey(name = "FK_CUSTOM_SHIPPERADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private CustomPartyAddressInfo shipperAdd;

    @Column(name="consignee_id")
    private Long consigneeId;

    @JoinColumn(name = "consignee_address_id", foreignKey = @ForeignKey(name = "FK_CUSTOM_CONSIGNEEADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private CustomPartyAddressInfo consigneeAdd;

    @Column(name="notify_id")
    private Long notifyId;

    @JoinColumn(name = "notify_address_id", foreignKey = @ForeignKey(name = "FK_CUSTOM_NOTIFYADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private CustomPartyAddressInfo notifyAdd;

    @OneToOne()
    @JoinColumn(name = "custom_house_id", foreignKey = @ForeignKey(name = "FK_CUSTOM_HOUSE_ID"))
    CustomHouseDetails customHouseDetails;
}
