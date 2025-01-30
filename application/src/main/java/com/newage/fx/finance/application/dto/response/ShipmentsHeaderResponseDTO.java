package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentsHeaderResponseDTO {
    private String id;
    private String origin;
    private Service mode;
    private String tos;
    private String destination;
    private String booked_on;
    private String status;

    private String hbl_number;


    //headermaster
    private String etdAtd;
    private String etaAta;
    private String etd_atd;
    private String eta_ata;

    private String valid_date;
    private String order_no;
    private String forwarder_ref_no;
    private String shipper_ref_no;
    private String shipper_name;
    private String consignee_name;

    private String origin_countrycode;
    private String destination_countrycode;
    private String action;
    private String actiontype;
    private String is_updated;
    private String updated_message;

    private String estimated_departure;
    private String actual_departure;
    private String estimated_arrival;
    private String actuval_arrival;
    private String booking_link="http://fslgo.com";
}
