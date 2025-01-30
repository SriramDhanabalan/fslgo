package com.newage.fx.finance.application.dto.mapper;


import com.newage.fx.finance.application.dto.request.SailingScheduleConnectionRequestDTO;
import com.newage.fx.finance.application.dto.request.SailingScheduleHeaderRequestDTO;
import com.newage.fx.finance.application.dto.request.SailingScheduleNewRequestDTO;
import com.newage.fx.finance.application.dto.request.SailingScheduleRequestDTO;
import com.newage.fx.finance.application.dto.response.SailingScheduleHeaderResponseDTO;
import com.newage.fx.finance.application.dto.response.SailingScheduleNewResponseDTO;
import com.newage.fx.finance.application.dto.response.SailingScheduleResponseDTO;
import com.newage.fx.finance.domain.entity.SailingScheduleConnectionDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleHeaderDetails;
import com.newage.fx.finance.service.client.MasterDataServiceClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class SailingScheduleMapper implements DTOMapper<SailingScheduleDetails, SailingScheduleRequestDTO, SailingScheduleResponseDTO> {

    @Autowired
    MasterDataServiceClient masterDataServiceClient;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    SailingScheduleRoutingsMapper sailingScheduleRoutingsMapper;

    @Override
    public SailingScheduleResponseDTO convertEntityToResponseDTO(SailingScheduleDetails sailingScheduleDetails) {
        return null;
    }

    @Override
    public SailingScheduleDetails convertCreateRequestToEntity(SailingScheduleRequestDTO sailingScheduleRequestDTO) {
        return null;
    }

    @Override
    public void convertUpdateRequestToEntity(SailingScheduleRequestDTO sailingScheduleRequestDTO, SailingScheduleDetails sailingScheduleDetails) {

    }

    @Override
    public Page<SailingScheduleResponseDTO> convertEntityPageToResponsePage(Pageable pageRequest, Page<SailingScheduleDetails> sailingScheduleDetails) {
        return null;
    }

    public List<SailingScheduleHeaderDetails> convertTestCreateRequestToEntity(SailingScheduleNewRequestDTO newRequestDTO) {
        List<SailingScheduleHeaderDetails> headerDetailsList = new ArrayList<>();
        for (SailingScheduleHeaderRequestDTO headerRequestDTO : newRequestDTO.getHeaderDetails()) {
            SailingScheduleHeaderDetails headerDetails = modelMapper.map(headerRequestDTO, SailingScheduleHeaderDetails.class);
            for(SailingScheduleConnectionDetails connectionDetails : headerDetails.getConnectionDetails()){
                connectionDetails.setHeaderDetails(headerDetails);
            }
            if (headerRequestDTO.getServiceList() != null) {
                headerDetails.setService("");
                for (String service : headerRequestDTO.getServiceList()) {
                    headerDetails.setService(headerDetails.getService() + service + ";");
                }
            }
//            ClientResponseDTO<CFSResponseDTO> cfsResponse = masterDataServiceClient.getCFSById(headerRequestDTO.getCfsId());
//            headerDetails.setCfsId(cfsResponse.getResult().getId());
//            headerDetails.setCfsName(cfsResponse.getResult().getName());
//
//            ClientResponseDTO<CarrierResponseDTO> carrierResponse = masterDataServiceClient.getCarrierById(headerRequestDTO.getCarrierId());
//            headerDetails.setCarrierId(carrierResponse.getResult().getId());
//            headerDetails.setCarrierName(carrierResponse.getResult().getName());
//
//            ClientResponseDTO<PortResponseDTO> portResponse = masterDataServiceClient.getPortById(headerRequestDTO.getOriginId());
//            headerDetails.setOriginId(portResponse.getResult().getId());
//            headerDetails.setOriginName(portResponse.getResult().getName());
//
//            ClientResponseDTO<PortResponseDTO> destinationResponse = masterDataServiceClient.getPortById(headerRequestDTO.getDestinationId());
//            headerDetails.setDestinationId(destinationResponse.getResult().getId());
//            headerDetails.setDestinationName(destinationResponse.getResult().getName());
//
//            ClientResponseDTO<VesselResponseDTO> vesselResponse = masterDataServiceClient.getVesselById(headerRequestDTO.getVesselId());
//            headerDetails.setVesselId(vesselResponse.getResult().getId());
//            headerDetails.setVesselName(vesselResponse.getResult().getName());
//
//            ClientResponseDTO<DivisionResponseDTO> divisionResponse = masterDataServiceClient.getDivisionById(headerRequestDTO.getDivisionId());
//            headerDetails.setDivisionId(divisionResponse.getResult().getId());
//            headerDetails.setDivisionName(divisionResponse.getResult().getName());

//            if(headerRequestDTO.getCoLoaderId()!=null) {
//                ClientResponseDTO<CustomerResponseDTO> coloaderResponse = masterDataServiceClient.getCustomerById(headerRequestDTO.getCoLoaderId());
//                headerDetails.setCoLoaderId(coloaderResponse.getResult().getId());
//                headerDetails.setCoLoaderName(coloaderResponse.getResult().getName());
//            }
            if (headerRequestDTO.getConnectionDetails() != null) {
                headerDetails.setConnectionDetails(new ArrayList<>());
                for (SailingScheduleConnectionRequestDTO connectionRequestDTO : headerRequestDTO.getConnectionDetails()) {
                    SailingScheduleConnectionDetails connectionDetails = sailingScheduleRoutingsMapper.convertNewCreateRequestToEntity(connectionRequestDTO);
                    connectionDetails.setId(null);
                    connectionDetails.setHeaderDetails(headerDetails);
                    headerDetails.getConnectionDetails().add(connectionDetails);
                }
            }

            headerDetailsList.add(headerDetails);
        }
        return headerDetailsList;
    }

    public SailingScheduleNewResponseDTO convertTestEntityToResponseDTO(SailingScheduleHeaderDetails headerDetails) {
        SailingScheduleNewResponseDTO responseDTO = modelMapper.map(headerDetails, SailingScheduleNewResponseDTO.class);
        responseDTO.setId(headerDetails.getId());
        if (headerDetails != null) {
            List<SailingScheduleHeaderResponseDTO> sailingScheduleHeaderResponseDTOS = new ArrayList<>();
            SailingScheduleHeaderResponseDTO sailingScheduleHeaderResponseDTO = modelMapper.map(headerDetails, SailingScheduleHeaderResponseDTO.class);
            sailingScheduleHeaderResponseDTO.setScheduleId(headerDetails.getScheduleId());
            sailingScheduleHeaderResponseDTOS.add(sailingScheduleHeaderResponseDTO);
            responseDTO.setHeaderDetails(sailingScheduleHeaderResponseDTOS);
        }

        return responseDTO;
    }

    public Page<SailingScheduleHeaderResponseDTO> convertEntityTestPageToResponsePage(Pageable pageRequest, Page<SailingScheduleHeaderDetails> headerDetails) {
        List<SailingScheduleHeaderResponseDTO> dtos = new ArrayList<>();
        headerDetails.forEach(e -> dtos.add(convertHeaderEntityToResponseDTO(e)));
        return new PageImpl<>(dtos, pageRequest, headerDetails.getTotalElements());
    }


    public SailingScheduleHeaderResponseDTO convertHeaderEntityToResponseDTO(SailingScheduleHeaderDetails headerDetails) {
        SailingScheduleHeaderResponseDTO responseDTO = modelMapper.map(headerDetails, SailingScheduleHeaderResponseDTO.class);
        responseDTO.setId(headerDetails.getId());



        if (headerDetails.getService() != null) {
            List<String> serviceList = new ArrayList<>();
            String services = headerDetails.getService();
            while (services.length() > 0) {
                String separator = ";";
                int sepPos = services.indexOf(separator);
                serviceList.add(services.substring(0, sepPos));
                services = services.substring(sepPos + separator.length());
            }
            responseDTO.setServiceList(serviceList);
        }

        return responseDTO;
    }














}
