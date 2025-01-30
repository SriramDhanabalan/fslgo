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
@Table(name = "attachment_detail")
public class AttachmentDetail extends Auditable<String> {

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

    @Column(name = "source_type", length = 100)
    @Enumerated(EnumType.STRING)
    private SourceType sourceType;


//    @Column(name = "source_id", length = 100)
//    private String sourceId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "document_type_id", length = 100)
    private Long documentTypeId;

    @Column(name = "document_type_name", length = 100, nullable = true)
    private String documentTypeName;

    @Column(name = "document_name", length = 100)
    private String documentName;

    @Column(name = "file_attached")
    private byte[] file;

    @Column(name = "reference", length = 100)//name change
    private String documentRefNo;

    @Column(name = "alfresco_node_id", nullable = true, length = 200)
    private String alfrescoNodeId;

    @Column(name = "is_protected")
    private Boolean isProtected = false;

    @Column(name = "customs", length = 20)
    private String customs;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"), insertable = false, updatable = false)
    public ShipmentHeader shipmentHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_ATTACHMENT_ENQUIRY_ID"), insertable = false, updatable = false)
    EnquiryHeader enquiryDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_MASTER_ID"), insertable = false, updatable = false)
    public MasterHeader masterHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "fk_call_entry_header"),insertable = false, updatable = false)
    CallEntryHeaderNxt callEntryHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "fk_service_master"),insertable = false, updatable = false)
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;
}