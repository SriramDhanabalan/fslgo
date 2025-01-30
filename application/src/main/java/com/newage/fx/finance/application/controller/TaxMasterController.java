package com.newage.fx.finance.application.controller;

import com.newage.fx.finance.application.dto.mapper.TaxMasterMapper;
import com.newage.fx.finance.application.dto.request.TaxMasterRequestDTO;
import com.newage.fx.finance.application.dto.response.ResponseDTO;
import com.newage.fx.finance.application.dto.response.TaxMasterResponse;
import com.newage.fx.finance.application.dto.response.TaxPercentageResponseDTO;
import com.newage.fx.finance.domain.entity.TaxChargeServieMappingDetails;
import com.newage.fx.finance.domain.entity.TaxMaster;
import com.newage.fx.finance.domain.entity.TaxPercentageDetail;
import com.newage.fx.finance.service.TaxMasterService;
import com.newage.fx.finance.service.client.dto.response.TaxChargeServiceMappingResponseDTO;
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

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@Log4j2
@RequestMapping(value = "/api/v1/masterdata/taxmaster")
public class TaxMasterController {
    @Autowired
    TaxMasterService taxMasterService;

    @Autowired
    TaxMasterMapper taxMasterMapper;

//    @Autowired
//    BranchMasterService branchMasterService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getAllTaxMaster(@QuerydslPredicate(root = TaxMaster.class) Predicate predicate,
                                                     @PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20)
                                                     @Parameter(hidden = true) Pageable pageRequest) {

        Page<TaxMaster> taxMasterPage = taxMasterService.getAllTaxMaster(predicate, pageRequest);
        Page<TaxMasterResponse> result = taxMasterMapper.convertEntityPageToResponsePage(pageRequest, taxMasterPage);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getTaxMasterById(@PathVariable("id") Long id) {

        TaxMasterResponse result = taxMasterMapper.convertEntityToResponseDTO(taxMasterService.getTaxMasterById(id));
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> createTaxMaster(@Valid @RequestBody TaxMasterRequestDTO taxMasterRequest,
                                                           @RequestHeader Long groupCompanyId,
                                                           @RequestHeader Long companyId,
                                                           @RequestHeader Long branchId){
        TaxMaster taxMaster = taxMasterMapper.convertCreateRequestToEntity(taxMasterRequest);
        taxMaster.setGroupCompanyId(groupCompanyId);
//        BranchMaster branchMaster = branchMasterService.getBranchById(branchId);
//        taxMaster.setCountryId(branchMaster.getCountryMaster().getId());
//        for (TaxEntityMappingDetail mappingDetail: taxMaster.getTaxEntityMappingDetails()
//        ) {
//            mappingDetail.setBranchId(branchId);
//            mappingDetail.setCompanyId(companyId);
//        }
        taxMaster = taxMasterService.createTaxMaster(taxMaster);
        TaxMasterResponse result = taxMasterMapper.convertEntityToResponseDTO(taxMaster);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        log.info(" Tax Master created Successfully");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> updateTaxMaster(@RequestBody TaxMasterRequestDTO taxMasterRequest, @PathVariable("id") Long id) {

        TaxMaster taxMaster = taxMasterService.getTaxMasterById(id);

        taxMasterMapper.convertUpdateRequestToEntity(taxMasterRequest, taxMaster);
        taxMaster = taxMasterService.updateTaxMaster(taxMaster);
        TaxMasterResponse result = taxMasterMapper.convertEntityToResponseDTO(taxMaster);
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value="/taxmasterbychargeservice/{chargeid}/{serviceid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getTaxmasterbychargeservice(@PathVariable("chargeid") Long chargeId,
                                                                   @PathVariable("serviceid") Long serviceId) {

        TaxChargeServieMappingDetails taxChargeServieMappingDetails = taxMasterService.getTaxMasterBychargeservice(chargeId,serviceId);
        TaxChargeServiceMappingResponseDTO result = new TaxChargeServiceMappingResponseDTO();
        if(taxChargeServieMappingDetails != null){
            result = taxMasterMapper.convertTaxChargeServiceMappingEntityToResponseDTO(taxChargeServieMappingDetails);
        }
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }
    @GetMapping(value="/taxmasterHeaderbychargeservice/{chargeid}/{serviceid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getTaxmasterHeaderbychargeservice(@PathVariable("chargeid") Long chargeId,
                                                                   @PathVariable("serviceid") Long serviceId) {

        TaxChargeServieMappingDetails taxChargeServieMappingDetails = taxMasterService.getTaxMasterBychargeservice(chargeId,serviceId);
        TaxMasterResponse result = new TaxMasterResponse();
        if(taxChargeServieMappingDetails!=null && taxChargeServieMappingDetails.getTaxMaster()!=null) {
            TaxMaster taxMaster = taxMasterService.getTaxMasterById(taxChargeServieMappingDetails.getTaxMaster().getId());
            if (taxMaster != null) {
                result = taxMasterMapper.convertEntityToResponseDTO(taxMaster);
            }
        }
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, result, null);
        return ResponseEntity.ok(response);
    }

    @GetMapping(value="/percentageByTaxIdandeffectivefrom/{taxId}/{effectiveFrom}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO> getPercentageByTaxIdAndEffectiveFrom(@PathVariable("taxId") Long taxId,
                                                                      @PathVariable("effectiveFrom") @DateTimeFormat(pattern = "yyyy-MM-dd") Date effectiveFrom){
        TaxMaster taxMaster = taxMasterService.getTaxMasterById(taxId);
        List<TaxPercentageDetail> taxPercentageDetails = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String date = format.format(effectiveFrom);
        taxPercentageDetails = taxMaster.getTaxPercentageDetails().stream().
                filter(n -> n.getEffectiveFrom().toString().substring(0,10).equalsIgnoreCase(date)).collect(Collectors.toList());
        if(!(taxPercentageDetails.size() > 0)){
            taxPercentageDetails = taxMaster.getTaxPercentageDetails().stream().
                    filter(n -> n.getEffectiveFrom().before(effectiveFrom)).collect(Collectors.toList());
        }
        Collections.sort(taxPercentageDetails, new Comparator<TaxPercentageDetail>() {
            @Override
            public int compare(TaxPercentageDetail obj1, TaxPercentageDetail obj2) {
                return obj1.getEffectiveFrom().compareTo(obj2.getEffectiveFrom());
            }
        });
        TaxPercentageDetail percentageDetail = taxPercentageDetails.get(taxPercentageDetails.size()-1);
        TaxPercentageResponseDTO taxPercentageResponseDTO = new TaxPercentageResponseDTO();
        taxPercentageResponseDTO.setPercentage(percentageDetail.getPercentage());
        taxPercentageResponseDTO.setEffectiveFrom(percentageDetail.getEffectiveFrom());
        taxPercentageResponseDTO.setTaxId(taxId);
        taxPercentageResponseDTO.setPayableAccountId(percentageDetail.getPayableAccountId());
        ResponseDTO response = new ResponseDTO(HttpStatus.OK.value(), Boolean.TRUE, taxPercentageResponseDTO, null);
        return ResponseEntity.ok(response);
    }


}
