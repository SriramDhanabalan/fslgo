package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.CarrierBookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarrierBookingResponseDTO {
    private Long id;
    private String serviceProvider;
    private String carrierBookingRefNo;
    private CarrierBookingStatus bookingCurrentStatus;
    private Long carrierId;
    private String carrier;
    private Long vesselId;
    private String vessel;
    private String voyage;
    private String carrierContractNo;
    private Long placeOfReceiptId;
    private String placeOfReceipt;
    private Long placeOfDeliveryId;
    private String placeOfDelivery;
    private Date etd;
    private String serviceType;
    private Long shipmentId;
    private Long sailingScheduleId;
    private String serviceName;
    private String jobReferenceNo;    //shipmenUid
    private Boolean sendSI;

    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;

    private CarrierShipmentPartyResponseDTO partyDetails;
 //   private CarrierShipmentInfoResponseDTO infoDetails;
    private CarrierShipmentCargoResponseDTO cargoDetails;
    private CarrierBookingOtherInfoResponseDTO carrierBookingOtherInfoDetails;

}
