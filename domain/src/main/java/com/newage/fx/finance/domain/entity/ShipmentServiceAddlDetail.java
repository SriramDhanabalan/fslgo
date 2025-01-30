package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.RateModificationStatus;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_service_addl_detail")
public class ShipmentServiceAddlDetail extends Auditable<String> {

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

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "shipment_id", length = 100,nullable = false)
    private Long shipmentId;

//    @Column(name = "shipment_service_id", length = 100,nullable = false)
//    private String shipmentServiceId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "rate_type", length = 20)
    private String rateType;

    @Column(name = "rate_id", length = 20)
    private Long rateId;

    @Column(name = "co_load", length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo coLoad;

    @Column(name = "co_loader_id", length = 20)
    private Long coLoaderId;

    @Column(name = "is_co_loader_name_edited")
    private Boolean isCoLoaderNameEdited;

    @Column(name = "co_loader_name")
    private String coLoaderName;

    @JoinColumn(name = "co_loader_address_id", foreignKey = @ForeignKey(name = "FK_BILLING_CUSTOMER_ADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail coLoaderAddressId;

    @Column(name = "cha_id", length = 20)
    private Long chaId;

    @Column(name = "cha_address_id", length = 20)
    private Long chaAddressId;

    @Column(name = "notes")
//    @Lob
    private String internalNote;

    @Column(name = "rate_request_modification")
    @Enumerated(EnumType.STRING)
    private YesNo rateRequestModification;

    @Column(name = "rate_request_modification_status")
    @Enumerated(EnumType.STRING)
    private RateModificationStatus rateRequestModificationStatus;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_service_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_SER_ADDITIONAL_ID"))
    public ShipmentServiceDetail serviceDetail;

}
