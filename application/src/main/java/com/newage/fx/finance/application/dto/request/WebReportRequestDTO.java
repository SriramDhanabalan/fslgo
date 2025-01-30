package com.newage.fx.finance.application.dto.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebReportRequestDTO {

    @NotEmpty(message = "Email address cannot be empty")
    @Email(message = "Invalid email address format")
    private String sEmail;

    private String sreport_id;
    private String spreset_name;
    private Integer sl_no;
    private String link_type;
    private String sDaily;
    private String sWeekly;
    private String sMonthly;
    private String stype;
    private List<String> shipment_status;
    private String sreport_name;
}

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import java.util.List;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class WebReportRequestDTO {
//
//    @NotEmpty(message = "Email address cannot be empty")
//    @Email(message = "Invalid email address format")
//    private String email;
//
//    private String reportId;
//    private String presetName;
//    private Integer slNo;
//    private String linkType;
//    private String daily;
//    private String weekly;
//    private String monthly;
//    private String type;
//    private List<String> shipmentStatus;
//    private String reportName;
//}


