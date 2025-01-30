package com.newage.fx.finance.application.dto.response;

import com.newage.fx.finance.domain.entity.WebUserDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserMasterResponseDTO {

    private Long registrationNo;
    private String userId;
    private String name;
    private String isOurEmployee;
    private String isAgent;
    private String isGroupAccount;
    private String groupAccountId;
    private String email;
    private String ccEmail;
    private byte[] welcomeNote;
    private byte[] welcomeGroupNote;
    private String handlingPersonName;
    private String handlingPersonEmail;
    private String handlingBranchCode;
    private String defaultPortCode;
    private String isAccountDocumentDisplay;
    private String isDocumentViewable;
    private byte[] note;
    private String lovStatus;
    private String bcCode;
    private String product;
    private String divisionNote;
    private String importHandlingPersonEmail;
    private String userType;
    private String clearanceEmail;
    private String wmsEmail;
    private String defaultAirport;
    private String companyCode;
    private String clientType;
    private Date passwordExpiryDate;
    private String customerContactPerson;
    private String eblEmail;
    private String groupName;
    private String isLocked;
    private String exportImport;
    private String routed;
    private String exportLclEmail;
    private String exportFclEmail;
    private String exportAirEmail;
    private String importLclEmail;
    private String importFclEmail;
    private String importAirEmail;
    private String creditLimitOverride;
    private Date overrideUpto;
    private String role;
    private String accountId;
    private byte[] shortName;
    private String versionCode;
    private String isFreight;
    private String isClearance;
    private String isWms;
    private String type;
    private String customerRole;
    private String isPo;
    private String isContractedCust;
    private String employeeCode;
    private String phoneNo;
    private String currency;
    private String address;
    private String city;
    private String countryCode;
    private List<WebUserDetailResponseDTO> webUserDetails;
}

