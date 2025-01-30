package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;

import com.newage.fx.finance.domain.enums.CreateOrUpdate;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_sales_call_entry_nxt_to_efs")
public class CallEntryNxtToEfsPosting extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "FK_CALL_ENTRY_ID"))
    private CallEntryHeaderNxt callEntry;

    @Column(name = "posting_status")
    @Enumerated(EnumType.STRING)
    private YesNo postingStatus=YesNo.No;

    @Column(name = "posting_date_time")
    private Date postingDateTime;

    @Column(name = "efs_call_no")
    private String efsCallNo;

    @Column(name = "create_or_update")
    @Enumerated(EnumType.STRING)
    private CreateOrUpdate createOrUpdate=CreateOrUpdate.CREATED;


}
