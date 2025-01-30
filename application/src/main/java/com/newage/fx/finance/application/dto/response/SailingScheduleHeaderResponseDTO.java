package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SailingScheduleHeaderResponseDTO {

    private Long id;

    private String scheduleId;

    private Long carrierId;

    private String carrierName;

    private Long originId;

    private String originName;

    private Long destinationId;

    private String destinationName;

    private List<String> serviceList;

    private Long vesselId;

    private String vesselName;

    /* Same as voyage number */
    private String routeNo;

    private Date loadPortCutoffDate;

    private String loadPortCutoffTime;

    private Date etd;

    private Date eta;

    private String imoNumber;

    private Long cfsId;

    private String cfsName;

    private Date cfsCutOffDate;

    private String cfsCutOffTime;

    /* customer master */
    private Long coLoaderId;

    private String coLoaderName;

    private String rotationNumber;

    private Date rotationDate;

    private String viaNumber;

    private Long divisionId;

    private String divisionName;

    private String note;

    private String scheduleMode;

    private SailingScheduleStatus status;

    private Long version;

    private Long groupCompanyId;

    private Long companyId;

    private Long branchId;

    private List<Long> shipmentId;

    private List<SailingScheduleConnectionResponseDTO> connectionDetails = new ArrayList<>();

    private CarrierBookingResponseDTO carrierBookingDetails;


}
