package com.newage.fx.finance.service.client;

import com.newage.fx.finance.service.client.dto.response.*;
import com.querydsl.core.types.Predicate;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.List;

@FeignClient(name = "masterdata", url = "${feign.client.referencedata.url}",configuration = FeignClientInterceptor.class)
public interface MasterDataServiceClient {

    @GetMapping("/api/v1/masterdata/companies/{id}")
    ClientResponseDTO<CompanyResponseDTO> getCompanyById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/groupcompanies")
    ClientPagesResponseDTO<List<GroupCompanyResponseDTO>> getAllGroupCompanies(@PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20) @Parameter(hidden = true) Pageable pageRequest);

    // use this api to get Country info
    @GetMapping("/api/v1/masterdata/countries/{id}")
    ClientResponseDTO<CountryResponseDTO> getCountryById(@PathVariable("id") Long id);

    // use this api to get all Countries info
    @GetMapping("/api/v1/masterdata/countries")
    ClientResponseDTO<List<CountryResponseDTO>> getAllCountries(@PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20) @Parameter(hidden = true) Pageable pageRequest);

    //use this api to get Cuurency by id
    @GetMapping("/api/v1/masterdata/currencies/{id}")
    ClientResponseDTO<CurrencyResponseDTO> getCurrencyById(@PathVariable("id") Long id);

    //use this api to get all Curencies
    @GetMapping("/api/v1/masterdata/currencies")
    ClientPagesResponseDTO<List<CurrencyResponseDTO>> getAllCurrencies(@PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC, size = 20) @Parameter(hidden = true) Pageable pageRequest);

    @GetMapping("/api/v1/masterdata/customers/{id}")
    ClientResponseDTO<CustomerResponseDTO> getCustomerById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/charges/{id}")
    ClientResponseDTO<ChargeResponseDTO> getChargeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/unit/{id}")
    ClientResponseDTO<UnitResponseDTO> getUnitById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/daybookmaster/{id}")
    ClientResponseDTO<DayBookMasterResponse> getDayBookMasterById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/documenttypes/{id}")
    ClientResponseDTO<DocumentTypeResponseDTO> getDocumentTypeById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/services/{id}")
    ClientResponseDTO<ServiceResponseDTO> getServiceById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/states/{id}")
    ClientResponseDTO<StateResponseDTO> getStateById(@PathVariable("id") Long id);

    @GetMapping(value = "/api/v1/masterdata/taxmaster/taxmasterbychargeservice/{chargeid}/{serviceid}")
    ClientResponseDTO<TaxChargeServiceMappingResponseDTO> getTaxmasterbychargeservice(@PathVariable("chargeid") Long chargeId,
                                                                                      @PathVariable("serviceid") Long serviceId);

    @GetMapping(value = "/api/v1/masterdata/using-currencyIds-and-date/{fromCurrencyId}/{toCurrencyId}/{currencyRateDate}?sort=currencyDate,desc")
    ClientResponseDTO<CurrencyRateResponseDTO> getCurrRateByFromAndToCurrencyDate(@PathVariable("fromCurrencyId") Long fromCurrencyId, @PathVariable("toCurrencyId") Long toCurrencyId,
                                                                                  @PathVariable("currencyRateDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date currencyRateDate);

    @GetMapping("/api/v1/masterdata/branch/{id}")
    ClientResponseDTO<BranchResponseDTO> getBranchById(@PathVariable("id") Long id);

    @GetMapping("/api/v1/masterdata/taxmaster/{id}")
    ClientResponseDTO<TaxMasterResponse> getTaxMasterById(@PathVariable("id") Long id);

//    ClientResponseDTO<PortResponseDTO> getPortById(Long connectionPortId);

    //ClientResponseDTO<CFSResponseDTO> getCFSById(Long cfsId);

    //  com.newage.fx.finance.application.dto.response.ClientResponseDTO<com.newage.fx.finance.application.dto.response.CFSResponseDTO> getCFSById(Long cfsId);

//    @GetMapping("/api/v1/masterdata/port/{id}")
//    ClientResponseDTO<PortResponseDTO> getPortById(@PathVariable("id") Long id);
//
//    ClientResponseDTO<CFSResponseDTO> getCFSById(Long cfsId);
//
//
//    ClientResponseDTO<VesselResponseDTO> getVesselById(Long vesselId);


}
