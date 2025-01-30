package com.newage.fx.finance.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WorkFlowScreenResponseDTO {

    private Long id;
    private String screenName;
    private String productName;
    private TosResponseDTO tosDTO;
    List<String> workFlow;

}
