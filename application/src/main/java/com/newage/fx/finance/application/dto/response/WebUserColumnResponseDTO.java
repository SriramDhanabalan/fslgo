package com.newage.fx.finance.application.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WebUserColumnResponseDTO {
    private Long id;
    @JsonProperty("sserialno")
    private Long slNo;
    @JsonProperty("sselectcolumn")
    private List<String> columnPreferences;
}
