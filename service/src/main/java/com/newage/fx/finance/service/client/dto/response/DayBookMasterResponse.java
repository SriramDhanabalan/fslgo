package com.newage.fx.finance.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DayBookMasterResponse {

    Long id;

    private Long groupCompanyId;

    private Long companyId;

    private Long branchId;

    private String code;

    private String name;

    private Long documentTypeId;

    private String documentTypeName;

    private String paymentType;

    private Long accountId;

    private Long subledgerId;

    private String status;

    private String note;

}
