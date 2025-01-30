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
@Table(name = "us_custom_contact_info")
public class UsCustomContactInfoDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "building_no_name")
    private String buildingNoAndName;

    @Column(name = "zip_code_id")
    private Long zipCodeId;

    @Column(name = "po_box_no")
    private String poBoxNo;

/*    @Column(name = "city_id")
    private Long cityId;*/

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state_id")
    private Long stateId;

    @Column(name = "con_state_name")
    private String conStateName;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "pre_mobile_no")
    private String preMobileNo;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "pre_phone_no")
    private String prePhoneNo;

    @Column(name = "phone_no")
    private String phoneNo;

    @Column(name = "email")
    private String email;
}
