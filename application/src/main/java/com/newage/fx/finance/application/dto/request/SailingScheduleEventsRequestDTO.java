package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SailingScheduleEventsRequestDTO {

    private Long id;
    private Long eventId;
    private YesNo completed;
    private Date date;
}
