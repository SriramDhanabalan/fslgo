package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.SailingScheduleStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SailingScheduleRequestDTO {
    private Long id;
    // private Mode mode;
    private List<String> serviceList;
    private Long originId;
    private Date originCutOffDate;
    private String originCutOffTime;
    private Date estLoadingDate;
    private Long portOfLoadingId;
    private Date etd;
    private Long portOfDischargeId;
    private Long destinationId;
    private Date eta;
    private Long carrierId;
    private Long cfsId;
    private Long coLoaderId;
    private String transitLrdToPort;
    private String transitPortToPort;
    private SailingScheduleStatus sailingScheduleStatus;
    private String note;
    private Long divisionId;
    // private String aesCutOffTime;
    private Date aesCutOffDate;
    private String imoNumber;
    private Date cfsCutOffDateTime;
    private Long vesselId;
    private String voyageNumber;
    private String rotationNumber;
    private Date rotationDate;
    private String viaNumber;
    private List<SailingScheduleRoutingsRequestDTO> sailingScheduleRoutingsRequest = new ArrayList();
    private List<SailingScheduleEventsRequestDTO> sailingScheduleEventsRequest = new ArrayList();

}
