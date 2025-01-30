package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SourceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "party_address_detail")
public class PartyAddressDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "source_type", length = 100)
    @Enumerated(EnumType.STRING)
    private SourceType sourceType;

//    @Column(name = "source_id", length = 100)
//    private String sourceId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    //size changed
    @Column(name = "party_type", length = 45)
    private String partyType;

    @Column(name = "address_line_1", length = 100)
    private String addressLine1;

    @Column(name = "address_line_2", length = 100)
    private String addressLine2;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "building_no", nullable = false, length = 100)
    private String buildingNoName;


    @Column(name = "street_name", length = 100)
    private String streetName;


    @Column(name = "state_id", nullable = false, length = 20)
    private Long stateId;

    @Column(name = "state_name", nullable = false, length = 100)
    private String stateName;

    @Column(name = "city_id", nullable = false, length = 20)
    private Long cityId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "city_name", nullable = false, length = 100)
    private String cityName;

    @Column(name = "country_id", length = 20)
    private Long countryId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "country_name", length = 100)
    private String countryName;

    @Column(name = "po_box",  length = 20)
    private String poBox;

    @Column(name = "pickup_place_or_zipcode", length = 45)
    private String pickupplaceOrZipcode;

    @Column(name = "contact_details", length = 100)
    private String contactDetail;

    @Column(name = "email", length = 100)
//    @Email --- handling from front end
//    @Pattern(regexp = "^[a-zA-Z0-9@.-]*$", message = "Special characters are not allowed in email.")
    private String email;

    @Column(name = "mobile", length = 20)
    private String mobile;

    @Column(name = "pre_mobile_no", length = 10)
    private String preMobileNo;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "pre_phone_no", length = 10)
    private String prePhoneNo;

    @Column(name = "status", length = 100)
    private String status;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"))
    public ShipmentPartyDetail partyDetail;

    //will add in time of master creation
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"), insertable = false, updatable = false)
//    public ShipmentGenerationMasterDetails generationMasterDetails;

}
