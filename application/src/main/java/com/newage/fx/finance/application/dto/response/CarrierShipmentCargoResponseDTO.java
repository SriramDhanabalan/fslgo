package com.newage.fx.finance.application.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CarrierShipmentCargoResponseDTO {

  //  private YesNo hazardous;
    private List<CarrierCommodityResponseDTO> commodityDetails;
//    private List<CarrierContainerResponse> carrierContainerInfo;

}
