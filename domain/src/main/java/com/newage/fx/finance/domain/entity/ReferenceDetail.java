package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SourceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reference_detail")
public class ReferenceDetail extends Auditable<String> {

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

    @Column(name = "source_type", length = 100,nullable = false)
    @Enumerated(EnumType.STRING)
    private SourceType sourceType;

    /*@Column(name = "source_id", length = 100,nullable = false)
    private String sourceId;*/

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "reference_id", nullable = false, length = 100)
    private Long referenceTypeId;

    @Column(name = "reference_name", nullable = false, length = 100)
    private String referenceTypeName;

    @Column(name = "reference_no", nullable = false, length = 15)//name change
    private String referenceNo;

    @Column(name = "reference_mode", nullable = false, length = 100)
    private String referenceMode;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"), insertable = false, updatable = false)
    public ShipmentHeader shipmentHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_ENQUIRY_ID"), insertable = false, updatable = false)
    public EnquiryHeader enquiryDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_MASTER_ID"), insertable = false, updatable = false)
    public MasterHeader masterHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SERVICE_MASTER_ID"), insertable = false, updatable = false)
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;

}