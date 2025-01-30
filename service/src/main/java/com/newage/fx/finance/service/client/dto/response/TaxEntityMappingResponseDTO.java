package com.newage.fx.finance.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxEntityMappingResponseDTO {
    private Long id;

    private Long companyId;

    private Long branchId;

    private String status;

    private Long taxId;
}
