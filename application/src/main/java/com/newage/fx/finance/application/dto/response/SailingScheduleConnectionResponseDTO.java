package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SailingScheduleConnectionResponseDTO {

    private Long id;

    private Integer slNo;

    private Long connectionPortId;

    private String connectionPortName;

    private Long destinationId;

    private String destinationName;

    private Date eta;

    private Date etd;

    private Long carrierId;

    private String carrierName;

    private Long vesselId;

    private String vesselName;

    private String routeNo;

    private String scheduleMode;

    private SailingScheduleStatus status;

    private String imoNumber;

    private String rotationNumber;

    private String viaNumber;

    private Long version;


}
