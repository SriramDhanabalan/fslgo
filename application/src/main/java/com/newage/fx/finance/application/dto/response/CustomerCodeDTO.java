package com.newage.fx.finance.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCodeDTO {
    private String booking_id;
    private String hbl_number;
    private String label;
    private String currency;
    private String origin;
    private String destination;
    private String transit_time;
    private String sailing_date;
    private String product;
    private String total_weight;
    private String total_volume;
    private String package_type;
    private String no_of_units;
    private String stackable_cargo;
    private String commodity_name;
    private String cargo_ready_date;
    private String no_of_containers;
    private String shipper_name;
    private String consignee_name;
    private String billing_party_name;
    private String notify_name;
    private String container_no;
    private String actual_seal;
    private String address;
    private String text;
    private String cargo_type;
    private String cargo_pickup;
    private String cargo_insurance;
    private String door_delivery;
    private List<DocumentDTO> documents;
}