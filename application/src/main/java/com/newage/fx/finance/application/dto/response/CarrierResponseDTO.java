package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.TransportMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarrierResponseDTO {

    private Long id;
    private String code;
    private String name;
    private String scacCode;
    private String carrierPrefix;
    private TransportMode transportMode;

    List<CarrierMasterContactResponseDTO> contacts;

}
