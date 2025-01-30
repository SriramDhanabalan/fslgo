package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SailingScheduleConnectionRequestDTO {

    private Long id;

    private Integer slNo;

    private Long connectionPortId;

    private Long destinationId;

    private Date eta;

    private Date etd;

    private Long carrierId;

    private Long vesselId;

    private String routeNo;

    private String scheduleMode;

    private SailingScheduleStatus status;

    private String imoNumber;

    private String rotationNumber;

    private String viaNumber;

    private Long groupCompanyId;

    private Long companyId;

    private Long branchId;

}
