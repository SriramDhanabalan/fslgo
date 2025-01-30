package com.newage.fx.finance.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TaxMasterRequestDTO {

    private Long id;

    private String code;

    private String name;

    private String taxability;

    private List<TaxPercentageRequestDTO> taxPercentageDetails = new ArrayList<>();

    private List<TaxEntityMappingRequestDTO> taxEntityMappingDetails = new ArrayList<>();

    private List<TaxChargeServiceMappingRequestDTO> taxChargeServiceMapping = new ArrayList<>();
}
