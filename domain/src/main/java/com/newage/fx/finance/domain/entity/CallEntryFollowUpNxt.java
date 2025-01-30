package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;

import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "call_entry_follow_up")
public class CallEntryFollowUpNxt extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @NotNull
    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @NotNull(message = "Accepted Values (Yes,No)")
    @Column(name = "is_followup_required", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo isFollowUpRequired = YesNo.No;

    @NotNull(message = "Accepted Values (Yes,No)")
    @Column(name = "is_followup_completed", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo isFollowUpCompleted = YesNo.No;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "followup_date")
    private Date followupDate;

    @Column(name = "followup_action_id", nullable = true, length = 20)
    private Long followUpActionId;

    @Column(name = "followup_action_name", nullable = true, length = 100)
    private String followupActionName;

    @OneToOne
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_header"))
    private CallEntryHeaderNxt callEntryHeader;
}
