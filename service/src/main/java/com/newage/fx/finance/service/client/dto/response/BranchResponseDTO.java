package com.newage.fx.finance.service.client.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BranchResponseDTO {

    private Long id;
    private String name;
    private String code;
    private String reportingName;
    private CountryMasterDTO country;
    private CurrencyMasterDTO currency;
    private TimeZoneMasterDTO timeZone;
    private String dateFormat;


    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CountryMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class StateMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CityMasterDTO {
        private Long id;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class ZoneMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CurrencyMasterDTO {
        private Long id;
        private String code;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AgentMasterDTO {
        private Long id;
        private String code;
        private String name;
        private String nameCode;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class CompanyMasterDTO {
        private Long id;
        private String name;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class TimeZoneMasterDTO {
        private Long id;
        private String countryCode;
        private String zoneName;
        private String abbreviation;
        private String std;
        private String dst;
    }

}