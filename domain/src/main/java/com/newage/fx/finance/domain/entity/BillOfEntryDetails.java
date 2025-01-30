package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.PassedBy;
import com.newage.fx.finance.domain.enums.TransactionType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_bill_of_entry")
public class BillOfEntryDetails extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id")
    private Long groupCompanyId;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "declaration_no", nullable = false)
    private String declarationNo;

    @Column(name = "boe_no", nullable = false)
    private String boeNO;

    @Column(name = "boe_date")
    private Date boeDate;

    @Column(name = "boe_expiry_date")
    private Date boeExpiryDate;

    @Column(name = "boe_value")
    private String boeValue;

    @Column(name = "boe_invoice_no")
    private String boeInvoiceNo;

    @Column(name = "transaction_type", length = 100, nullable = false)
    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "passed_by")
    @Enumerated(EnumType.STRING)
    private PassedBy passedBy;

    @Column(name = "boe_id")
    private Long boeId;

    @Column(name = "passed_person")
    private String passedPerson;

    @Column(name = "process_date")
    private Date processDate;

    @Column(name = "receive_date")
    private Date receiveDate;

    @Column(name = "ack_no")
    private String ackNo;

    @Column(name = "ack_date")
    private Date ackDate;

    @Column(name = "ack_status")
    private String ackStatus;

    @Column(name = "note")
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_BILL_ENTRY_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

    @Version
    @Column(name = "version")
    private Long version;
}
