package com.newage.fx.finance.application.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SailingScheduleNewResponseDTO {
    private Long id;
    private List<SailingScheduleHeaderResponseDTO> headerDetails = new ArrayList<>();
}
