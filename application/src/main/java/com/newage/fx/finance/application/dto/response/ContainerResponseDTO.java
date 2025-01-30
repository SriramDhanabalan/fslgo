package com.newage.fx.finance.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContainerResponseDTO {

    private String statuscode;
    private String statusmessage;
    private List<PackageDTO> packageList;
    private List<ContainerDTO> container_type;

}