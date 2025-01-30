package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.service.client.dto.response.CustomerAdditionalInfoResponseDTO;
import com.newage.fx.finance.service.client.dto.response.CustomerAddressResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.Priority;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponseDTO {
    private Long id;

    private String code;

    private String name;

    private List<CustomerAddressResponseDTO> addresses;

    private CustomerAdditionalInfoResponseDTO customerAdditionalInfoResponseDTO;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GradeMasterDTO {

        private Long id;

        private String name;

        private Priority priority;

        private String colourCode;


    }



}
