package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.SailingScheduleRoutingMode;

import java.util.Date;

public class SailingScheduleRoutingsResponseDTO {
    private Long id;
    private SailingScheduleRoutingMode Mode;
    private Long originId;
    private String originName;
    private Date etd;
    private Long destinationId;
    private String destinationName;
    private Date eta;
    private Long vesselId;
    private String vesselName;
    private String voyageNumber;
    private Date arrivalDateTime;
    private Date departureDateTime;
    private String imoNumber;
    private Long connectionPortId;
    private String connectionPortName;
    private SailingScheduleVesselResponseDTO.PortDetailsDTO connectionPortDetails;







}
