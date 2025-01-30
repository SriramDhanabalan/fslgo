package com.newage.fx.finance.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAdditionalInfoResponseDTO {

    private Long id;
    private Long companyId;
    private Long groupCompanyId;
    private Long branchId;
    private String tsaValidationNumber;
    private Date tsaValidationDate;
    private String tsaVerificationNumber;
    private String panNumber;
    private String vatNumber;
    private String taxIdNo;
    private String agentIATACode;
    private String identificationType;
    private String identificationNo;
    private CustomerMasterDTO broker;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

}
