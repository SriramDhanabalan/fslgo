package com.newage.fx.finance.service.client.dto.response;

import com.newage.fx.finance.domain.enums.Freight;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TosResponseDTO {
    private Long id;
    private String code;
    private String name;
    private Freight freightPPCC;
}
