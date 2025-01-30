package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode;

import java.util.Date;

public class SailingScheduleRoutingsRequestDTO {

    private Long id;
    private SailingScheduleRoutingMode Mode;
    private Long originId;
    private Date etd;
    private Long destinationId;
    private Date eta;
    private Long vesselId;
    private String voyageNumber;
    private Long connectionPortId;
    private Date arrivalDateTime;
    private Date departureDateTime;
    private String imoNumber;




}
