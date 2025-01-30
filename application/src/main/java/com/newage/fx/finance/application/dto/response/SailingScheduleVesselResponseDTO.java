package com.newage.fx.finance.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SailingScheduleVesselResponseDTO {

    private Long id;

    public void setSailingScheduleResponse(List<SailingScheduleResponseDTO> sailingScheduleResponseDTOS) {

    }


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VesselDetailsDTO
    {
        private Long vesselId;
        private String vesselName;
        private String shortName;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CarrierDetailsDTO {
        private Long id;
        private String name;
        private String code;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PortDetailsDTO {
        private Long id;
        private String name;
        private String code;
    }








}
