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
    private String sailing_id;
    private String rate_is_valid_till;
    private String label_1;
    private String product;
    private String new_tab_2;
    private String heading_1;
    private String total_weight;
    private String total_volume;
    private String value;
    private String package_type;
    private String no_of_units;
    private String stackable_cargo;
    private String heading_2;
    private String commodity_name;
    private String cargo_ready_date;
    private String hs_code;
    private String no_of_containers;
    private String co_emission;
    private String heading_3;
    private String shipper_name;
    private String consignee_name;
    private String billing_party_name;
    private String notify_name;
    private String container_no;
    private String actual_seal;
    private String address;
    private String email;
    private String mobile;
    private String header_4;
    private String picking_list;
    private String other;
    private String commercial_invoice;
    private String cargo_image;
    private String header_5;
    private String pincode;
    private String header_6;
    private String text;
    private String new_tab_3;
    private String reference_id;
    private String origin_charges;
    private String international_changes;
    private String destination_charges;
    private String total_amount;
    private String newtab_4;
    private String document_type;
    private String id_reference_number;
    private String last_update;
    private String action;
    private String spl_requirements;
    private String is_import_clearance;
    private String is_export_clearance;
    private String Cargo_type;
    private String cargo_pickup;
    private String cargo_insurance;
    private String door_delivery;
    private String newtab_5;
    private List<DocumentDTO> documents;
}
