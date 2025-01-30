package com.newage.fx.finance.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxChargeServiceMappingResponseDTO {

    private Long taxId;
    private Long chargeId;
    private Long serviceId;
    private String status;
}
