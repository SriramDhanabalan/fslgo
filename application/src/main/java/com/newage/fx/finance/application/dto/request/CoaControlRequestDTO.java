package com.newage.fx.finance.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CoaControlRequestDTO {

    private Long id;

    private Long coaHeaderId;

    private Long coaGroupId;

    private Long coaSubGroupId;

    private Long controlAccountId;

  //  private Long accountUid;

    private String accountName;

    private String status;

    private String notes;

    List<CoaControlDetailRequestDTO> coaControlDetails = new ArrayList<>();

}
