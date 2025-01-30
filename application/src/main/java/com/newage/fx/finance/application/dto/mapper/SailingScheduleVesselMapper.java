package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.SailingScheduleRequestDTO;
import com.newage.fx.finance.application.dto.request.SailingScheduleVesselRequestDTO;
import com.newage.fx.finance.application.dto.response.*;
import com.newage.fx.finance.domain.entity.*;

import com.newage.fx.finance.service.client.MasterDataServiceClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class SailingScheduleVesselMapper implements DTOMapper<SailingScheduleVesselDetails, SailingScheduleVesselRequestDTO, SailingScheduleVesselResponseDTO> {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MasterDataServiceClient masterDataServiceClient;

    @Autowired
    SailingScheduleMapper sailingScheduleMapper;


    @Override
    public SailingScheduleVesselResponseDTO convertEntityToResponseDTO(SailingScheduleVesselDetails sailingScheduleVesselDetails) {

        SailingScheduleVesselResponseDTO sailingScheduleVesselResponseDTO = modelMapper.map(sailingScheduleVesselDetails, SailingScheduleVesselResponseDTO.class);

        sailingScheduleVesselResponseDTO.setId(sailingScheduleVesselDetails.getId());
        if (sailingScheduleVesselDetails.getSailingScheduleDetails() != null) {
            List<SailingScheduleResponseDTO> sailingScheduleResponseDTOS = new ArrayList<>();
            for (SailingScheduleDetails details : sailingScheduleVesselDetails.getSailingScheduleDetails()) {
                SailingScheduleResponseDTO sailingResponseDTO = sailingScheduleMapper.convertEntityToResponseDTO(details);
                sailingScheduleResponseDTOS.add(sailingResponseDTO);
            }
            sailingScheduleVesselResponseDTO.setSailingScheduleResponse(sailingScheduleResponseDTOS);
        }

        return sailingScheduleVesselResponseDTO;
    }

//    @Override
//    public ContainerResponseDTO convertEntityToResponseDTO(ContainerPack containerpack ){
//
//        ContainerResponseDTO containerResponseDTO = modelMapper.map(containerpack , ContainerResponseDTO.class);
//        containerResponseDTO.setStatuscode(containerpack.getStatuscode());
//       if(containerpack.getStatuscode() != null) {
//
//       }
//
//    }




    @Override
    public SailingScheduleVesselDetails convertCreateRequestToEntity(SailingScheduleVesselRequestDTO sailingScheduleVesselRequestDTO) {
        SailingScheduleVesselDetails sailingScheduleVesselDetails = modelMapper.map(sailingScheduleVesselRequestDTO, SailingScheduleVesselDetails.class);
        if (sailingScheduleVesselRequestDTO != null && sailingScheduleVesselRequestDTO.getSailingScheduleRequest() != null) {
            sailingScheduleVesselDetails.setSailingScheduleDetails(new ArrayList<>());
            for (SailingScheduleRequestDTO sailingScheduleRequestDTO : sailingScheduleVesselRequestDTO.getSailingScheduleRequest()) {
                SailingScheduleDetails sailingScheduleDetails = sailingScheduleMapper.convertCreateRequestToEntity(sailingScheduleRequestDTO);
                sailingScheduleDetails.setId(null);
                sailingScheduleDetails.setSailingScheduleVesselDetails(sailingScheduleVesselDetails);
                sailingScheduleVesselDetails.getSailingScheduleDetails().add(sailingScheduleDetails);
            }
        }


        return sailingScheduleVesselDetails;
    }

    @Override
    public void convertUpdateRequestToEntity(SailingScheduleVesselRequestDTO sailingScheduleVesselRequestDTO, SailingScheduleVesselDetails sailingScheduleVesselDetails) {

    }

    @Override
    public Page<SailingScheduleVesselResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<SailingScheduleVesselDetails> sailingScheduleVesselDetails) {
        return null;
    }


    public ContainerResponseDTO convertEntityToResponseDTO(ContainerPack containerPack) {
        // Create a new instance of ContainerResponseDTO
        ContainerResponseDTO containerResponseDTO = new ContainerResponseDTO();

        // Set the status code and message
        containerResponseDTO.setStatuscode(containerPack.getStatuscode());
        containerResponseDTO.setStatusmessage(containerPack.getStatusmessage());

        // Map the package list
        if (containerPack.getPackageList() != null) {
            List<PackageDTO> packageDTOList = new ArrayList<>();
            for (Pack pkg : containerPack.getPackageList()) {
                // Correctly instantiate PackageDTO
                PackageDTO packageDTO = new PackageDTO(pkg.getCode(), pkg.getLabel(), pkg.getValue());
                packageDTOList.add(packageDTO);
            }
            containerResponseDTO.setPackageList(packageDTOList);
        }

        // Map the container type list
        if (containerPack.getContainer_type() != null) {
            List<ContainerDTO> containerDTOList = new ArrayList<>();
            for (Type   container : containerPack.getContainer_type()) {
                // Correctly instantiate ContainerDTO
                ContainerDTO containerDTO = new ContainerDTO(container.getCode(), container.getLabel(), container.getValue());
                containerDTOList.add(containerDTO);
            }
            containerResponseDTO.setContainer_type(containerDTOList);
        }

        return containerResponseDTO;
    }


    }













