package com.newage.fx.finance.domain.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_sign_off_un_signoff_log_history")
public class MasterSignOffUnsignOffLogHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "comment_name", nullable = false, length = 100)
    private String commentName;

    @Column(name = "status", nullable = false, length = 100)
    private String signOffStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_ID"))
    public MasterHeader masterHeader;


}
