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
@Table(name = "nxt_custom_party_address_details")
public class CustomPartyAddressInfo {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="address1")
    private String address1;

    @Column(name="address2")
    private String address2;

    @Column(name="address3")
    private String address3;

    @Column(name="city_id")
    private Long cityId;

    @Column(name="state_id")
    private Long stateId;

    @Column(name="country_id")
    private Long countryId;

    @Column(name="pin")
    private String pin;

    @Column(name="type")
    private String type;

    @Column(name="gst")
    private String gst;

    @Column(name="iec")
    private String iec;

    @Column(name="subcode")
    private String subCode;

    @Column(name="pan")
    private String pan;

    @Column(name="sub_name")
    private String subName;
}
