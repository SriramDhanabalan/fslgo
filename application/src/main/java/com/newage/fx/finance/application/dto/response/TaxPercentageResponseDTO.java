package com.newage.fx.finance.application.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TaxPercentageResponseDTO {


    private Long id;

    private Long taxId;

    private Long percentage;

    private Date effectiveFrom;

    private Long payableAccountId;

    private Long receivableAccountId;

    private String status;

}
