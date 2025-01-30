package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_user_master")
public class UserMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationNo;

    @Column(name = "user_id")
    private String userId;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "is_our_employee")
    private String isOurEmployee;
    @Column(name = "is_agent")
    private String isAgent;
    @Column(name = "is_group_account")
    private String isGroupAccount;
    @Column(name = "group_account_id")
    private String groupAccountId;
    @Column(name = "email")
    private String email;
    @Column(name = "cc_email")
    private String ccEmail;
    @Column(name = "welcome_note")
    private byte[] welcomeNote;
    @Column(name = "welcome_group_note")
    private byte[] welcomeGroupNote;
    @Column(name = "handling_person_name")
    private String handlingPersonName;
    @Column(name = "handling_person_email")
    private String handlingPersonEmail;
    @Column(name = "handling_branch_code")
    private String handlingBranchCode;
    @Column(name = "default_port_code")
    private String defaultPortCode;
    @Column(name = "is_account_document_display")
    private String isAccountDocumentDisplay;
    @Column(name = "is_document_viewable")
    private String isDocumentViewable;
    @Column(name = "note")
    private byte[] note;
    @Column(name = "lov_status")
    private String lovStatus;
    @Column(name = "bc_code")
    private String bcCode;
    @Column(name = "product")
    private String product;
    @Column(name = "division_note")
    private String divisionNote;
    @Column(name = "import_handling_person_email")
    private String importHandlingPersonEmail;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "clearance_email")
    private String  clearanceEmail;
    @Column(name = "wms_email")
    private String  wmsEmail;
    @Column(name = "default_airport")
    private String  defaultAirport;
    @Column(name = "company_code")
    private String  companyCode;
    @Column(name = "client_type")
    private String  clientType;
    @Column(name = "password_expiry_date")
    private Date passwordExpiryDate;
    @Column(name = "customer_contact_person")
    private String customerContactPerson;
    @Column(name = "ebl_email")
    private String eblEmail;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "is_locked")
    private String isLocked;
    @Column(name = "export_import")
    private String exportImport;
    @Column(name = "routed")
    private String routed;
    @Column(name = "export_lcl_email")
    private String exportLclEmail;
    @Column(name = "export_fcl_email")
    private String exportFclEmail;
    @Column(name = "export_air_email")
    private String exportAirEmail;
    @Column(name = "import_lcl_email")
    private String importLclEmail;
    @Column(name = "import_fcl_email")
    private String importFclEmail;
    @Column(name = "import_air_email")
    private String importAirEmail;
    @Column(name = "credit_limit_override")
    private String creditLimitOverride;
    @Column(name = "override_upto")
    private Date overrideUpto;
    @Column(name = "role")
    private String role;
    @Column(name = "account_id")
    private String accountId;
    @Column(name = "short_name")
    private byte[] shortName;
    @Column(name = "version_code")
    private String versionCode;
    @Column(name = "is_freight")
    private String isFreight;
    @Column(name = "is_clearance")
    private String isClearance;
    @Column(name = "is_wms")
    private String isWms;
    @Column(name = "type")
    private String type;
    @Column(name = "customer_role")
    private String customerRole;
    @Column(name = "is_po")
    private String isPo;
    @Column(name = "is_contracted_cust")
    private String isContractedCust;
    @Column(name = "employee_code")
    private String employeeCode;
    @Column(name = "phone_no")
    private String phoneNo;
    @Column(name = "currency")
    private String currency;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "country_code")
    private String countryCode;

    @OneToMany(mappedBy = "userMaster", cascade = CascadeType.ALL)
    private List<WebUserDetail> webUserDetails = new ArrayList<>();


}
