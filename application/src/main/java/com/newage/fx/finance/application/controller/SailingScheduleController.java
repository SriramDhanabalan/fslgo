package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.SailingScheduleMapper;
import com.newage.fx.finance.application.dto.mapper.SailingScheduleVesselMapper;
import com.newage.fx.finance.application.dto.request.SailingScheduleVesselRequestDTO;
import com.newage.fx.finance.application.dto.response.*;
import com.newage.fx.finance.domain.entity.ContainerPack;
import com.newage.fx.finance.domain.entity.SailingScheduleHeaderDetails;
import com.newage.fx.finance.domain.entity.SailingScheduleVesselDetails;
import com.newage.fx.finance.domain.enums.DateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleDateFilter;
import com.newage.fx.finance.domain.enums.SailingScheduleStatus;
import com.newage.fx.finance.service.SailingScheduleVesselService;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController
@Log4j2
@RequestMapping(value = "/api/sailingschedule")
public class SailingScheduleController {

    @Autowired
    private SailingScheduleVesselMapper scheduleSailingMapper;

    @Autowired
    private SailingScheduleMapper sailingScheduleMapper;

    @Autowired
    private SailingScheduleVesselService scheduleSailingService;

    //Not in use
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createSailingSchedule(@RequestBody SailingScheduleVesselRequestDTO sailingScheduleVesselRequestDTO,
                                                   @RequestParam(required = false) Long groupCompanyId,
                                                   @RequestParam String origin,
                                                   @RequestParam String designation) {

        SailingScheduleVesselDetails sailingScheduleVesselDetails = scheduleSailingMapper.convertCreateRequestToEntity(sailingScheduleVesselRequestDTO);
        sailingScheduleVesselDetails.getSailingScheduleDetails().forEach(e -> e.setGroupCompanyId(groupCompanyId));
        sailingScheduleVesselDetails = scheduleSailingService.createSailingSchedule(sailingScheduleVesselDetails);
        SailingScheduleVesselResponseDTO result = scheduleSailingMapper.convertEntityToResponseDTO(sailingScheduleVesselDetails);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // Not in use
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getSailingScheduleById(@PathVariable("id") Long id) {

        SailingScheduleVesselResponseDTO result = scheduleSailingMapper.convertEntityToResponseDTO(scheduleSailingService.getSailingScheduleById(id));
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }

    //used for container pack
    @GetMapping(value = "/api/container_pack", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getContainerPack() {
        ContainerPack containerPack = new ContainerPack();
        ContainerResponseDTO result = scheduleSailingMapper.convertEntityToResponseDTO(containerPack);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }


    //designation and origin

    @GetMapping(value = "/get/port", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllNewSailingSchedule(@QuerydslPredicate(root = SailingScheduleHeaderDetails.class) Predicate predicate, @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20) @Parameter(hidden = true) Pageable pageRequest,
                                                      @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date fromDate, @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date toDate,
                                                      @RequestParam(required = false) DateFilter dateFilter, @RequestParam(required = false) Long groupCompanyId,
                                                      @RequestParam(required = false) SailingScheduleDateFilter sailingScheduleDateFilter,
                                                      @RequestParam(required = false) List<SailingScheduleStatus> sailingScheduleStatus) {
        Page<SailingScheduleHeaderDetails> headerDetailsPage = scheduleSailingService.getAllNewSailingSchedule(predicate, pageRequest, fromDate, toDate, dateFilter, sailingScheduleDateFilter, sailingScheduleStatus, groupCompanyId);
        Page<SailingScheduleHeaderResponseDTO> result = sailingScheduleMapper.convertEntityTestPageToResponsePage(pageRequest, headerDetailsPage);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, (ResponseError) null);
        return ResponseEntity.ok(response);
    }


}
