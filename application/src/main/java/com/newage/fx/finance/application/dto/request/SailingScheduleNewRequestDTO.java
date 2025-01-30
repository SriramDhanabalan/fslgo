package com.newage.fx.finance.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class SailingScheduleNewRequestDTO {
    private List<SailingScheduleHeaderRequestDTO> headerDetails = new ArrayList();
}