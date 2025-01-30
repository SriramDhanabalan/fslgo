package com.newage.fx.finance.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebReportResponseDTO {

    private String userId;
    private String reportId;
    private String reportName;
    private String status;
    private String reportType;
    private String daily;
    private String weekly;
    private String monthly;
    private String email;
    private String presetName;
    private String filterOverride;
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
//public class WebReportResponseDTO {
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


