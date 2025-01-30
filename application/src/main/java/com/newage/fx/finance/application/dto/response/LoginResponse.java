package com.newage.fx.finance.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {

    private String version;
    private String message;
    private String token;
    private String response;


}
