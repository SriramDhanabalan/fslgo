package com.newage.fx.finance.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MilestoneOriginDTO {
    private String remarks_date;
    private String header_text;
    private String description;
    private String shipment_type;
    private String milestone_status;
}