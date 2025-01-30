package com.newage.fx.finance.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SailingScheduleVesselRequestDTO {
    private Long id;
    private Long vesselId;
    private String voyageNumber;
    private String rotationNumber;
    private Date date;
    private String viaNumber;
    private Long portOfLoadingId;
    private Long portOfDischargeId;
    private Long carrierId;
    private Date stuffingDate;
    private String originCode;
    private String designation;
    private String designationCode;
    private String iscoLoad;
    private String OptionNo;
    private String lineNo;
    private String importExport;
    private String originCountryCode;
    private String DestCountryCode;
    private String DestCountryName;
    private Long ScheduleId;
    private Date etd;
    private String vesselName;
    private Date originCutOffDate;
    private String transitLrdToPort;
    private String originName;
    private Date eta;
    private String destinationName;
    private String destinationCode;
    private String portOfLoading;
    private String portName;
    private String transitPortToPort;



    // private Date originCutOffDate;

    //  private String originCode;

    //private String voyageNumber;




    private List<SailingScheduleRequestDTO> sailingScheduleRequest = new ArrayList();
}
