package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SourceType;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "sign_off")
public class SignOff extends Auditable<String> {

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

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "is_checked", length = 10)
    @Enumerated(EnumType.STRING)
    private YesNo isChecked;

    @Column(name = "sign_off_status", nullable = false, length = 20)
    private String signOffStatus;

    @Column(name = "owner_id", nullable = true, length = 20)
    private Long ownerId;

    @Column(name = "owner_name", nullable = false, length = 100)
    private String ownerName;

    @Column(name = "status_date")
    private Date statusDate;

    @Column(name = "comment_id", nullable = true, length = 20)
    private Long commentId;

    @Column(name = "comment_name", nullable = false, length = 100)
    private String commentName;

    @Column(name = "comments", nullable = false, length = 100)
    private String comments;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @Column(name = "signoff_mode", nullable = false, length = 20)
    private String signoffMode;

    @Column(name = "is_un_signoff_checked", length = 10)
    @Enumerated(EnumType.STRING)
    private YesNo isUnSignOffChecked;

    @Column(name = "un_signoff_status", nullable = false, length = 20)
    private String unSignOffStatus;

    @Column(name = "un_signoff_owner_id", nullable = true, length = 20)
    private Long unSignOffOwnerId;

    @Column(name = "un_signoff_owner_name", nullable = false, length = 100)
    private String unSignOffOwnerName;

    @Column(name = "un_signoff_status_date")
    private Date unSignOffstatusDate;

    @Column(name = "un_signoff_comment_id", nullable = true, length = 20)
    private Long unSignOffCommentId;

    @Column(name = "un_signoff_comment_name", nullable = false, length = 100)
    private String unSignOffCommentName;

    @Column(name = "un_signoff_comments", nullable = false, length = 100)
    private String unSignOffComments;

    @Column(name = "un_signoff_description", nullable = false, length = 100)
    private String unSignOffDescription;

    @Column(name = "un_signoff_notes")
    private String unSignOffNotes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"),insertable = false,updatable = false)
    public ShipmentHeader shipmentHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"),insertable = false,updatable = false)
    public MasterHeader masterHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_SERVICE_MASTER_HEADER_ID"),insertable = false,updatable = false)
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;





}
