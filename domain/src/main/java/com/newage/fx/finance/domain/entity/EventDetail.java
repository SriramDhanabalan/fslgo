package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.CreationMode;
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
@Table(name = "event_detail")
public class EventDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

//    @Column(name = "source_id", length = 100,nullable = false)
//    private Long sourceId;

    @Column(name = "source_type", length = 100, nullable = false)
    @Enumerated(EnumType.STRING)
    private SourceType sourceType;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "event_id", nullable = false, length = 20)
    private Long eventId;

    @Column(name = "event_name", nullable = false, length = 100)
    private String eventName;

    @Column(name = "event_code", nullable = false, length = 100)
    private String eventCode;

    @Column(name = "event_date", nullable = false)
    private Date eventDate;

    @Column(name = "followup", nullable = false)
    @Enumerated(EnumType.STRING)
    private YesNo followUp;

    @Column(name = "assigned_to", nullable = true)
    private Long assignedTo;

    @Column(name = "followup_date", nullable = true)
    private Date followUpDate;

    @Column(name = "completed", nullable = true)
    @Enumerated(EnumType.STRING)
    private YesNo completed;


    @Column(name = "event_mode", nullable = false, length = 100)
    @Enumerated(EnumType.STRING)
    private CreationMode eventMode;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"), insertable = false, updatable = false)
    public ShipmentHeader shipmentHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_ENQUIRY_ID"), insertable = false, updatable = false)
    public EnquiryHeader enquiryDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_MASTER_ID"), insertable = false, updatable = false)
    public MasterHeader masterHeader;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SERVICE_MASTER_ID"), insertable = false, updatable = false)
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;

}