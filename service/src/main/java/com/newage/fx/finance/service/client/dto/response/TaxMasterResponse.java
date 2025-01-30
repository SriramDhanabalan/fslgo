package com.newage.fx.finance.service.client.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TaxMasterResponse {

    private Long id;

    private Long groupCompanyId;

    private Long countryId;

    private String code;

    private String name;

    private String taxability;

    private List<TaxPercentageResponseDTO> taxPercentageDetails = new ArrayList<>();

    private List<TaxEntityMappingResponseDTO> taxEntityMappingDetails = new ArrayList<>();

    private List<TaxChargeServiceMappingResponseDTO> taxChargeServiceMapping = new ArrayList<>();
}
