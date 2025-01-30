package com.newage.fx.finance.service.client.dto.response;


import com.newage.fx.finance.domain.enums.TransportMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PortResponseDTO {
    private Long id;
    private String code;
    private String name;
    private TransportMode transportMode;
    private String countryCode;
    private CountryDTO country;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CountryDTO {
        private Long id;
        private String code;
        private String name;
    }
}
