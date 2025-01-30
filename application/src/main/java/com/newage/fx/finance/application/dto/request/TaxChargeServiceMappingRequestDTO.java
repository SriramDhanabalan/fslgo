package com.newage.fx.finance.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxChargeServiceMappingRequestDTO {
    private Long chargeId;
    private Long serviceId;
    private String status;

}
