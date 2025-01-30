package com.newage.fx.finance.application.dto.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebUserDetailResponseDTO {
    private Long registrationNo;
    private Integer slNo;
    private String branchCode;
    private String customerCode;
    private String customerName;
    private String codeType;
    private String isPrimary;
    private String companyCode;
    private String locationCode;
    private String projectCode;
    private String shortName;
    private String autoInvoiceNo;
}
