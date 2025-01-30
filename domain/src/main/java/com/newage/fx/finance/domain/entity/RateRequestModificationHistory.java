package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.RateModificationStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "rate_request_modification_history")
public class RateRequestModificationHistory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "user_id", length = 100)
    private Long userId;

    @Column(name = "user_name", length = 100)
    private String userName;

    @Column(name = "assignee_id", length = 100)
    private Long assigneeId;

    @Column(name = "assignee_name", length = 100)
    private String assigneeName;

    @Column(name = "document_id", length = 100)
    private Long documentId;

    @Column(name = "enquiry_uid", length = 100)
    private String enquiryUid;

    @Column(name = "file_name", length = 100)
    private String fileName;

    @Column(name = "file_attached")
    private byte[] file;

    @Column(name = "reference_no", length = 100)
    private String referenceNo;

    @Column(name = "type_for_request", length = 100)
    private String typeForRequest;

    @Column(name = "status", length = 100)
    @Enumerated(EnumType.STRING)
    private RateModificationStatus status;

    @Column(name = "rejection_reason", length = 100)
    private String rejectionReason;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}
