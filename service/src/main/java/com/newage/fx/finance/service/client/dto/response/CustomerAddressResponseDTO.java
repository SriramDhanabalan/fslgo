package com.newage.fx.finance.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAddressResponseDTO {
    private Long id;
    private boolean communicationAddress;
    private boolean corporateAddress;
    private String streetName;
    private String poBoxNo;
    private String buildingNoName;
}
