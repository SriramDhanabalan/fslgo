package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;

import com.newage.fx.finance.domain.enums.JobCompletedStatus;
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
@Table(name = "nxt_toefs_service_job_status")
public class NxtToEfsServiceMasterEntity extends Auditable<String> {

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

    @Column(name = "service_master_id")
    private Long serviceMasterId;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "nxt_job_uid",length = 45)
    private String nxtJobId;

    @Enumerated(EnumType.STRING)
    @NotNull(message = "Accepted values (Completed,Pending,PENDING,COMPLETED)")
    @Column(name = "job_completed_status",length = 45)
    private JobCompletedStatus jobCompletedStatus = JobCompletedStatus.Pending;

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

    @Column(name = "efs_segment_code",length = 50)
    private String efsSegmentCode;

    @Column(name = "error_note")
    private String errorNote;

    @Column(name = "sass_id",length = 50)
    private String sassId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}
