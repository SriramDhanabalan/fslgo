package com.newage.fx.finance.application.dto.response;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName(value = "error")
public class ResponseError {

    private String code;
    private List<String> message;
}
