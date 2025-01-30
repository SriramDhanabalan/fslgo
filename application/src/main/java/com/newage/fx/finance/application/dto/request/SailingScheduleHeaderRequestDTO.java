package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class SailingScheduleHeaderRequestDTO {
    private Long id;

    private Long carrierId;

    private Long originId;

    private Long destinationId;

    private List<String> serviceList;

    private Long vesselId;

    /* Same as voyage number */
    private String routeNo;

    private Date loadPortCutoffDate;

    private String loadPortCutoffTime;

    private Date etd;

    private Date eta;

    private String imoNumber;

    private Long cfsId;

    private Date cfsCutOffDate;

    private String cfsCutOffTime;

    /* customer master */
    private Long coLoaderId;

    private String rotationNumber;

    private Date rotationDate;

    private String viaNumber;

    private Long divisionId;

    private String note;

    private String scheduleMode;

    private SailingScheduleStatus status;

    private Long version;

   // private Long groupCompanyId;

//    private Long companyId;
//
//    private Long branchId;

    private List<SailingScheduleConnectionRequestDTO> connectionDetails = new ArrayList<>();

}
