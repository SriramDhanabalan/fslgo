package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SailingScheduleResponseDTO {
    private Long id;
    private String scheduleId;
    //private Mode mode;
    private List<String> serviceList;
    private Long originId;
    private String originName;
    private Date originCutOffDate;
    private String originCutOffTime;
    private Date estLoadingDate;
    private Long portOfLoadingId;
    private String portOfLoading;
    private Date etd;
    private Long portOfDischargeId;
    private String portOfDischarge;
    private Long destinationId;
    private String destinationName;
    private Date eta;
    private Long carrierId;
    private String carrierName;
    private Long cfsId;
    private String cfsName;
    private Long coLoaderId;
    private String coLoaderName;
    private String transitLrdToPort;
    private String transitPortToPort;
    private SailingScheduleStatus sailingScheduleStatus;
    private String note;
    private Long divisionId;
    private String divisionName;
    // private String aesCutOffTime;
    private Date aesCutOffDate;
    private String imoNumber;
    private Date cfsCutOffDateTime;
    private String voyageNumber;
    private String rotationNumber;
    private Date rotationDate;
    private String viaNumber;


}
