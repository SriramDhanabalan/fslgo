package com.newage.fx.finance.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarrierBookingOtherInfoResponseDTO {
    private Long id;
//    private String carrierContractNo;
//    private String carrierBookingOffice;
//    private String productCode;
    private String additionalInfoToCarrier;
    private String infoReceivedFromCarrier;
}
