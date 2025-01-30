package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
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
@Table(name = "trigger_detail")
public class TriggerDetail extends Auditable<String> {

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

    @Column(name = "date", nullable = false, length = 100)
    private Date date;

    @Column(name = "trigger_type_id", nullable = false, length = 20)
    private Long triggerTypeId;

    @Column(name = "trigger_type_name", nullable = false, length = 100)
    private String triggerTypeName;

    @Column(name = "trigger_id", nullable = false, length = 20)
    private Long triggerId;

    @Column(name = "trigger_code", nullable = true, length = 100)
    private String triggerCode;

    @Column(name = "followup_completed", nullable = true, length = 100)
    private YesNo followUpCompleted;

    @Column(name = "followup_date", nullable = true, length = 100)
    private Date followUpDate;

    @Column(name = "trigger_to_id", nullable = true, length = 20)
    private Long triggerToId;

    @Column(name = "trigger_to_contact_id", nullable = true, length = 20)
    private Long triggerToContactId;

    @Column(name = "trigger_to_email", nullable = true, length = 500)
    private String triggerToEmail;

    @Column(name = "trigger_message", nullable = true, length = 500)
    private String triggerMessage;

    @Column(name = "trigger_event_code", nullable = true, length = 100)
    private String triggerEventCode;

    @Column(name = "trigger_mode", nullable = true, length = 100)
    private String triggerMode;

    @Column(name = "attachment_info_id", nullable = true, length = 20)
    private Long attachmentInfoId;

    @Column(name = "notes")
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_SERVICE_ENQUIRY_ID"))
//    public EnquiryHeader enquiryDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_service_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
    public ShipmentServiceDetail servicelDetail;

}