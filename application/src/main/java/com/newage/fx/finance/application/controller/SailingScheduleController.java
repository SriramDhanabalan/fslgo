//package com.newage.fx.finance.application.controller;
//
//
//import com.newage.fx.finance.application.dto.response.ResponseDTO;
//import com.newage.fx.finance.domain.entity.SailingScheduleVesselDetails;
//import com.newage.fx.finance.service.client.MasterDataServiceClient;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@Log4j2
//@RequestMapping(value = "/api/v1/sales/sailingscheduleOld")
//
//
//public class SailingScheduleController {
//
//    @Autowired
//    private MasterDataServiceClient masterDataServiceClient;
//
//    @Autowired
//    private SailingScheduleVesselMapper scheduleSailingMapper;
//
//
//    @Autowired
//    private SailingScheduleVesselService scheduleSailingService;
//
//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<?> createSailingSchedule(@RequestBody SailingScheduleVesselRequestDTO sailingScheduleVesselRequestDTO,
//                                                   @RequestParam(required = false) Long groupCompanyId) {
//
//       SailingScheduleVesselDetails sailingScheduleVesselDetails = scheduleSailingMapper.convertCreateRequestToEntity(sailingScheduleVesselRequestDTO);
//       sailingScheduleVesselDetails.getSailingScheduleDetails().forEach(e -> e.setGroupCompanyId(groupCompanyId));
//        sailingScheduleVesselDetails = scheduleSailingService.createSailingSchedule(sailingScheduleVesselDetails);
//        SailingScheduleVesselResponseDTO result = scheduleSailingMapper.convertEntityToResponseDTO(sailingScheduleVesselDetails);
//        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
//        return ResponseEntity.status(HttpStatus.CREATED).body(response);
//   }
//
//
//
//
//
//
//
//
//
//
//
//
//
//}
