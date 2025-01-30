package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ImportExport;
import com.newage.fx.finance.domain.enums.Service;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "service_master_shipment_header")
public class ServiceMasterShipmentHeader extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "master_uid", length = 100, nullable = false)
    private String masterUid;

    @Column(name = "trade_id", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private ImportExport tradeCode;

    @Column(name = "service_type", length = 20)
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "customer_id", length = 100,nullable = false)
    private Long customerId;

    @Column(name = "customer_name", length = 20)
    private String customerName;

    @Column(name = "origin_id",  nullable = false)
    private Long originId;

    @Column(name = "origin_name", nullable = false)
    private String originName;

    @Column(name = "destination_id", nullable = false)
    private Long destinationId;

    @Column(name = "destination_name", nullable = false)
    private String destinationName;

    @Column(name = "etd", nullable = true)
    private Date etd;

    @Column(name = "eta", nullable = true)
    private Date eta;

    @Column(name = "atd", nullable = true)
    private Date atd;

    @Column(name = "ata", nullable = true)
    private Date ata;


    @Column(name = "salesman_id", nullable = false, length = 20)
    private Long salesmanId;


    @Column(name = "salesman_name", nullable = false, length = 100)
    private String salesmanName;

    @Column(name = "notes")
    private String notes;

    @Column(name = "master_completed", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo masterCompleted;

    @OneToOne(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL)
    private ServiceMasterShipmentPartyDetail partyDetails;

    @OneToMany(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServiceMasterShipmentRatesDetail> ratesDetails;

    @OneToMany(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL)
    private List<SignOff> signOffDetail;

    @OneToMany(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL)
    private List<EventDetail> eventDetail;//foreign key not added

    @OneToMany(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL)
    private List<ReferenceDetail> referenceDetail;//foreign key not added

    @OneToMany(mappedBy = "serviceMasterShipmentHeader", cascade = CascadeType.ALL)
    private List<AttachmentDetail> attachmentDetail;//foreign key not added

    @Version
    @Column(name = "version")
    private Long version;

}
