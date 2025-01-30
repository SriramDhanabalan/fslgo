package com.newage.fx.finance.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyResponseDTO {

    private Long id;
    private String code;
    private String name;
    private String prefix;
    private String suffix;
    private Integer decimalPoints;
    private String symbol;
    private CountryMasterDTO country;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountryMasterDTO {

        private Long id;
        private String code;
        private String name;


    }
}
