package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_service_detail")
public class ShipmentServiceDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "branch_name", length = 100)
    private String branchName;

    @Column(name = "shipment_service_uid", length = 100,nullable = false)
    private String jobId;

    @Column(name = "export_ref", length = 6)
    private String exportRef;

    @Column(name = "import_ref", length = 6)
    private String importRef;

    @Column(name = "service_transport_mode", nullable = false, length = 100)
    @Enumerated(EnumType.STRING)
    private TransportMode serviceCode;

    @Column(name = "service_date", nullable = false)
    private Date shipmentDate;

    @Column(name = "service_id", length = 100,nullable = false)
    private Long serviceId;

    @Column(name = "service_trade", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ImportExport tradeCode;

    @Column(name = "product_code", length = 100,nullable = false)
    private String serviceName;

    @Column(name = "service_mode", length = 100,nullable = false)
    private ShipmentCreationMode serviceMode;

    @Column(name = "service_type", length = 100,nullable = false)
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "business_type", length = 100,nullable = false)
    @Enumerated(EnumType.STRING)
    private ServiceType businessType;

    @Column(name = "service_division", length = 100,nullable = false)
    private String serviceDivision;

    @Column(name = "service_status", length = 100,nullable = false)
    @Enumerated(EnumType.STRING)
    private ShipmentStatus serviceStatus;

    @Column(name = "billing_customer_id", length = 100,nullable = false)
    private Long billingCustomerId;

    @JoinColumn(name = "billing_customer_address_id", foreignKey = @ForeignKey(name = "FK_BILLING_CUSTOMER_ADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail billingCustomerAddress;

    @Column(name = "cs_id", length = 100,nullable = false)
    private Long  csId;

    @Column(name = "other_trade", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private OtherTrade otherTrade;

    @Column(name = "booking_person",nullable = true)
    private String bookingPerson;

    @OneToOne(mappedBy = "serviceDetail", cascade = CascadeType.ALL)
    private ShipmentServiceAddlDetail serviceAddlDetail;

    @OneToOne(mappedBy = "shipmentService",cascade = CascadeType.ALL,orphanRemoval = true)
    private MasterServiceLinkDetail linkDetailList;

    @OneToMany(mappedBy = "shipmentService",cascade = CascadeType.ALL)
    private List<ShipmentCancellationLogHistory>logHistories=new ArrayList<>();

    @OneToMany(mappedBy = "shipmentService",cascade = CascadeType.ALL)
    private List<CfsWareHouseShipmentMap> cfsWareHouseShipmentMaps=new ArrayList<>();

    @OneToOne(mappedBy = "shipmentService",cascade = CascadeType.ALL)
    private CfsDeliveryHeaderDetails cfsDeliveryHeaderDetail;

    @ManyToOne
    @Valid
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}