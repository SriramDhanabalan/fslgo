package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarrierCommodityResponseDTO {

    private Long commodityId;
    private String commodityName;
    private String commodityDescription;
    private Double grossWeight;
    private Double volume;
    private Double chargableWeight;
    private YesNo referRequired;
}
