package com.newage.fx.finance.domain.entity;



import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.querydsl.core.annotations.QueryInit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "spotquote_header")
public class EnquirySpotQuotationNew extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "enquiry_uid", length = 100,nullable = true)
    private String enquiryUid;

    @NotNull
    @NotEmpty
    @Column(name = "quotation_no", nullable = false, length = 20)
    private String quotationNo;

    @NotNull
    @Column(name = "currency_id", nullable = false)
    Long currencyId;

    @Column(name = "currency_code")
    private String currencyCode;

    @NotNull
    @Column(name = "valid_upto", nullable = false)
    Date validUpTo;

    @NotNull(message = "Accepted Values (Standard, LumpSum, Split)")
    @Column(name = "quote_type", nullable = false)
    @Enumerated(EnumType.STRING)
    QuoteType quoteType;

    @Column(name = "quote_amount", nullable = false, length = 20)
    Double quoteAmount;

    @Column(name = "buy_amount", nullable = false, length = 20)
    Double buyAmount;

    @Column(name = "shipment_uid", length = 100, nullable = false)
    private String shipmentUid;

    @OneToOne
    @MapsId
    @JoinColumn(name = "enquiry_id")
    @QueryInit("*.*")
    private EnquiryHeader enquiryDetail;

    @Column(name = "emp_name", nullable = true, length = 100)
    private String employeeName;

    @Column(name = "email_id", nullable = true, length = 100)
    private String empEmailId;

    @Column(name = "phone_no", nullable = true, length = 100)
    private String empPhoneNo;

    @Column(name = "branch_line1", nullable = true, length = 1000)
    private String branchAddress;

    @Column(name = "branch_line2", nullable = true, length = 1000)
    private String branchAddress2;

    @Column(name = "branch_line3", nullable = true, length = 1000)
    private String branchAddress3;

    @Column(name = "zip_code", nullable = true, length = 10)
    private String zipCode;

    @Column(name = "reason_id", nullable = true, length = 20)
    private Long reasonId;

    @Column(name = "reason_note", nullable = true, length = 500)
    private String reasonNote;

    @Column(name = "approver_name", nullable = true, length = 50)
    private String approvalName;

    @Column(name = "approved_date", nullable = true)
    Date approvedDate;

    @Column(name = "approval_sent_date")
    Date sentApprovalDate;

    @Column(name = "booked_date")
    Date bookedDate;

    @OneToMany(mappedBy = "spotQuotation", cascade = CascadeType.ALL, orphanRemoval = true)
    List<EnquiryChargeDetailsNew> chargeDetails;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "spotQuotation", cascade = CascadeType.ALL,orphanRemoval = true)
    List<QuotationTermsAndConditionsGeneralNotes> quotationTermsAndConditionGeneralNotes = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "spotQuotation", cascade = CascadeType.ALL,orphanRemoval = true)
    List<QuotationTermsAndConditionServiceNotes> quotationTermsAndConditionServiceNotes =new ArrayList<>();

    @Column(name = "custom_version")
    Long customVersion = 1L;

}
