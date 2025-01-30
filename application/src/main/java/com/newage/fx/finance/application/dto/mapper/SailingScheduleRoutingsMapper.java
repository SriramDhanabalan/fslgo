package com.newage.fx.finance.application.dto.mapper;

import com.newage.fx.finance.application.dto.request.SailingScheduleConnectionRequestDTO;
import com.newage.fx.finance.application.dto.request.SailingScheduleRoutingsRequestDTO;
import com.newage.fx.finance.application.dto.response.SailingScheduleRoutingsResponseDTO;
import com.newage.fx.finance.domain.entity.SailingScheduleConnectionDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleRoutings;
import com.newage.fx.finance.service.client.MasterDataServiceClient;
import com.newage.fx.finance.service.client.dto.response.ClientResponseDTO;
import com.newage.fx.finance.service.client.dto.response.PortResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class SailingScheduleRoutingsMapper implements DTOMapper <SailingScheduleRoutings, SailingScheduleRoutingsRequestDTO, SailingScheduleRoutingsResponseDTO> {

//    @Autowired
//    MasterDataServiceClient masterDataServiceClient;

    @Autowired
    ModelMapper modelMapper;

    // @Autowired
    // SailingScheduleEventsMapper sailingScheduleEventsMapper;

    public SailingScheduleConnectionDetails convertNewCreateRequestToEntity(SailingScheduleConnectionRequestDTO connectionRequestDTO) {

        SailingScheduleConnectionDetails connectionDetails = modelMapper.map(connectionRequestDTO, SailingScheduleConnectionDetails.class);

        if (connectionRequestDTO.getScheduleMode() != null && connectionRequestDTO.getScheduleMode().toString().equals("Air")) {
//            if (connectionRequestDTO.getVesselId() != null) {
//                ClientResponseDTO<CarrierResponseDTO> responseDTO = masterDataServiceClient.getCarrierById(connectionDetails.getVesselId());
//                connectionDetails.setVesselName(responseDTO.getResult().getName());
//            }
        } else
        {
//            if (connectionRequestDTO.getVesselId() != null) {
//                ClientResponseDTO<VesselResponseDTO> responseDTO = masterDataServiceClient.getVesselById(connectionDetails.getVesselId());
//                connectionDetails.setVesselName(responseDTO.getResult().getName());
//
//            }
        }

//        if (connectionRequestDTO.getDestinationId() != null) {
//            ClientResponseDTO<PortResponseDTO> responseDTO = masterDataServiceClient.getPortById(connectionRequestDTO.getDestinationId());
//            connectionDetails.setDestinationName(responseDTO.getResult().getName());
//        }
//        if (connectionDetails.getConnectionPortId() != null) {
//            ClientResponseDTO<PortResponseDTO> responseDTO = masterDataServiceClient.getPortById(connectionDetails.getConnectionPortId());
//            connectionDetails.setConnectionPortName(responseDTO.getResult().getName());
//        }

        return connectionDetails;
    }

    @Override
    public SailingScheduleRoutingsResponseDTO convertEntityToResponseDTO(SailingScheduleRoutings sailingScheduleRoutings) {
        return null;
    }

    @Override
    public SailingScheduleRoutings convertCreateRequestToEntity(SailingScheduleRoutingsRequestDTO sailingScheduleRoutingsRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(SailingScheduleRoutingsRequestDTO sailingScheduleRoutingsRequestDTO, SailingScheduleRoutings sailingScheduleRoutings) {
String qa="20GB";
    }

    @Override
    public Page<SailingScheduleRoutingsResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<SailingScheduleRoutings> sailingScheduleRoutings) {
        return null;
    }
}