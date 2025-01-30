package com.newage.fx.finance.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;


@Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @Table(name = "nxt_sales_carrier_address_info")
    public class CarrierPartyAddressInfo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "customer_id")
        private Long customerId;

        @Column(name = "name", length = 100)
        private String name;

        @Column(name = "street_name", length = 100)
        private String streetName;

        @Column(name = "building_no", length = 100)
        private String buildingNo;

        @Column(name = "state_id", nullable = false, length = 20)
        private Long stateId;

        @Column(name = "state_name", nullable = false, length = 100)
        private String stateName;

        @Column(name = "country_id", length = 20)
        private Long countryId;

        @Column(name = "country_name", length = 100)
        private String countryName;

        @Column(name = "city_id", nullable = false, length = 20)
        private Long cityId;

        @Column(name = "city_name", nullable = false, length = 100)
        private String cityName;

        @Column(name = "contact_person", nullable = false, length = 100)
        private String contactPerson;

        @Column(name = "contact_person_id")
        private Long contactPersonId;

        @Column(name = "email", length = 100)
        @Email
        @Pattern(regexp = "^[a-zA-Z0-9@.-]*$", message = "Special characters are not allowed in email.")
        private String email;
}
