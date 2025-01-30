package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;
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
@Table(name = "master_service_detail")
public class MasterServiceDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "master_service_uid", nullable = false)
    private String serviceUid;

    @Column(name = "service_transport_mode")
    @Enumerated(EnumType.STRING)
    private TransportMode serviceTransportMode;

    @Column(name = "service_date")
    private Date serviceDate;

    @Column(name = "service_type")
    @Enumerated(EnumType.STRING)
    private Service serviceType;

    @Column(name = "service_trade")
    @Enumerated(EnumType.STRING)
    private ImportExport serviceTrade;

    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "service_mode")
    @Enumerated(EnumType.STRING)
    private ServiceMode serviceMode;

    @Column(name = "business_type")
    @Enumerated(EnumType.STRING)
    private ServiceType businessType;

    @Column(name = "service_division")
    private String serviceDivision;

    @Column(name = "service_status")
    private ShipmentMasterStatus serviceStatus;

    @Column(name = "agent_id")
    private Long agentId;

    @OneToOne(mappedBy = "masterServiceDetail",cascade = CascadeType.ALL)
    private MasterServiceAddlDetail masterServiceAddlDetail;

    @OneToMany(mappedBy = "masterServiceDetail",cascade = CascadeType.ALL)
    private List<MasterRatesDetail> masterRatesDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @OneToMany(mappedBy = "masterServiceDetail",cascade = CascadeType.ALL)
    private List<MasterServiceLinkDetail> linkDetailList = new ArrayList<>();

    @Version
    @Column(name = "version")
    private Long version;

}