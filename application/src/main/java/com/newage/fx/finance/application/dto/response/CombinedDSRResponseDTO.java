package com.newage.fx.finance.application.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CombinedDSRResponseDTO {
    private String token;
    private String message;
    private List<String> columns;
    private List<ShipmentDSRResponseDTO> data;
}