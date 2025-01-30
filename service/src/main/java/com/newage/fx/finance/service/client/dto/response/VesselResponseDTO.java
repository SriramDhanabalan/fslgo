package com.newage.fx.finance.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VesselResponseDTO {
    private Long id;
    private String code;
    private String shortName;
    private String name;
    private String imoNumber;
    private VesselCountryDTO vesselCountry;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VesselCountryDTO {

        private Long id;
        private String code;
        private String name;
        private String flag;
    }


}
