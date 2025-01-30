package com.newage.fx.finance.application.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WebUserColumnRequestDTO {
    private Long id;
    @JsonProperty("sserialno")
    private Long slNo;
    @JsonProperty("sselectcolumn")
    private List<String> columnPreferences;
}
