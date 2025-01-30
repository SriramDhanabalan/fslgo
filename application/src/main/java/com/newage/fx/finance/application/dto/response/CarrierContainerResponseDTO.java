package com.newage.fx.finance.application.dto.response;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public class CarrierContainerResponseDTO {

        private Long id;
        private Long containerId;
        private String containerName;
        private String containerCode;
        private int noOfContainer;
    }





