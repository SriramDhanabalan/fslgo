package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.JobCompletedStatus;
import com.newage.fx.finance.domain.enums.JobType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_toefs_integration_status")
public class NxtToEfsFinanceIntegration extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "nxt_group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "nxt_company_id", length = 20)
    private Long companyId;

    @Column(name = "nxt_branch_id", length = 20)
    private Long branchId;

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "nxt_job_uid",length = 45)
    private String nxtJobId;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Accepted values (Completed,Pending,PENDING,COMPLETED)")
    @Column(name = "job_completed_status",length = 45)
    private JobCompletedStatus jobCompletedStatus ;

    @Column(name = "efs_company_code",length = 45)
    private String efsCompanyCode;

    @Column(name = "efs_branch_code",length = 45)
    private String efsBranchCode;

    @Column(name = "efs_location_code",length = 45)
    private String efsLocationCode;

    @Column(name = "efs_job_no",length = 45)
    private String efsJobNo;

    @Column(name = "efs_job_id",length = 45)
    private String efsJobId;

    @Column(name = "efs_confirmation_user",length = 45)
    private String efsConfirmationUser;

    @Column(name = "efs_confirmation_date",length = 45)
    private String efsConfirmationDate;

    @Column(name = "error_message",length = 45)
    private String errorMessage;

    @Column(name = "efs_segment_code",length = 50)
    private String efsSegmentCode;

    @Column(name = "sass_id",length = 50)
    private String sassId;

    @Column(name = "is_service_job")
    private String isServiceJob;


    @Enumerated(EnumType.STRING)
    @Column(name = "job_type")
    private JobType jobType;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_shipment_id", foreignKey = @ForeignKey(name = "FK_MASTER_SHIPMENT_ID1"))
    private MasterHeader masterHeader;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_MASTER_SHIPMENT_ID1"))
    private ShipmentHeader shipmentHeader;
}
