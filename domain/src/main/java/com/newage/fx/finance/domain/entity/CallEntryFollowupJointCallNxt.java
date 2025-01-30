package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.JointCallStatus;
import com.newage.fx.finance.domain.enums.JointCallType;
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
@Table(name = "call_entry_followup_joint_call")
public class CallEntryFollowupJointCallNxt extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @NotNull
    @Column(name = "employee_id", nullable = false, length = 20)
    private Long employeeId;

    @NotNull
    @Column(name = "employee_name", nullable = false, length = 50)
    private String employeeName;

    @Column(name = "employee_email", nullable = true, length = 100)
    private String employeeEmail;

    @Column(name = "description", nullable = true, length = 500)
    private String description;

    @NotNull(message = "Accepted Values (CURRENT,FOLLOWUP)")
    @Column(name = "joint_call_type", nullable = false, length = 8)
    @Enumerated(EnumType.STRING)
    private JointCallType jointCallType;

    @Column(name = "joint_call_status", nullable = false, length = 8)
    @Enumerated(EnumType.STRING)
    private JointCallStatus jointCallStatus;

    @Column(name = "call_reference", nullable = true, length = 20)
    private String callReference;

    @Column(name = "follow_up_email_status", nullable = true, length = 20)
    private String followUpEmailStatus;

    @ManyToOne()
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_header"))
    private CallEntryHeaderNxt callEntryHeader;
}
