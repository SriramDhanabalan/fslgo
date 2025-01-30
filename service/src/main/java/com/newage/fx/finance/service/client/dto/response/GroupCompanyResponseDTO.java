package com.newage.fx.finance.service.client.dto.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GroupCompanyResponseDTO {

    private Long id;
    private String code;
    private String name;
    private String reportingName;
    private String logo;
/*    private String status;
    private List<CompanyResponseDTO> companyDetails;

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class CompanyMasterDto {

        private Long id;
        private String name;
        private String code;
        private LovStatus status;
        private List<BranchMasterDto> branchDetails;

        public CompanyMasterDto() {
        }
    }

    @Getter
    @Setter
    @EqualsAndHashCode
    @AllArgsConstructor
    public static class BranchMasterDto {

        private Long id;
        private String name;
        private String code;
        public BranchMasterDto() {
        }
    } */
}
