package com.newage.fx.finance.application.dto.request;


import com.newage.fx.finance.domain.enums.BLType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequestDTO {

    @NotNull
    private Long  documentId;
    private BLType blType;
    private List<String> to;
    private List<String> cc;
    private String employeeName;
    private String document;
    private String fileName;
    //for pre alert
    private List<Long> attachmentIds;
    private String subject;
    private String body;
}
