package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.enums.WorkFlow;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class WorkflowResponseDTO {

    private String workFlowName;
    private WorkFlow workFlowStatus;
    private Date value;

}
