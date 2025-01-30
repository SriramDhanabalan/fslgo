package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "call_entry_followup_log_history")
public class CallEntryFollowUpLogHistory extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "followup_date")
    private Date followupDate;

    @Column(name = "followup_action_name", nullable = true, length = 100)
    private String followupActionName;

    @Column(name = "note")
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_followup_log_history"))
    private CallEntryHeaderNxt callEntryHeader;
}
