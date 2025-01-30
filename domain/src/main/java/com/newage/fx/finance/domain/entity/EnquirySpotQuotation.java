package com.newage.fx.finance.domain.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.querydsl.core.annotations.QueryInit;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity

@Table(name="spotquote_header")
public class EnquirySpotQuotation  extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Version
    @Column(name = "version")
    private Long version;
    @Column(
            name = "company_entity_id",
            length = 20
    )
    private Long companyId;
    @Column(
            name = "group_company_id",
            length = 20
    )
    private Long groupCompanyId;
    @Column(
            name = "branch_id",
            length = 20
    )
    private Long branchId;
    @Column(
            name = "enquiry_uid",
            length = 100,
            nullable = true
    )
    private String enquiryUid;
    @Column(
            name = "quotation_no",
            nullable = false,
            length = 20
    )
    private @NotNull
    @NotEmpty String quotationNo;
    @Column(
            name = "currency_id",
            nullable = false
    )
    @NotNull Long currencyId;
    @Column(
            name = "currency_code"
    )
    private String currencyCode;
    @Column(
            name = "valid_upto",
            nullable = false
    )
    @NotNull
    Date validUpTo;
    @Column(
            name = "quote_type",
            nullable = false
    )
    @Enumerated(EnumType.STRING)
    @NotNull(
            message = "Accepted Values (Standard, LumpSum, Split)"
    ) QuoteType quoteType;
    @Column(
            name = "quote_amount",
            nullable = false,
            length = 20
    )
    Double quoteAmount;
    @Column(
            name = "buy_amount",
            nullable = false,
            length = 20
    )
    Double buyAmount;
    @Column(
            name = "shipment_uid",
            length = 100,
            nullable = false
    )
    private String shipmentUid;
    @OneToOne
    @MapsId
    @JoinColumn(
            name = "enquiry_id"
    )
    @QueryInit({"*.*"})
    private EnquiryHeader enquiryDetail;
    @Column(
            name = "emp_name",
            nullable = true,
            length = 100
    )
    private String employeeName;
    @Column(
            name = "email_id",
            nullable = true,
            length = 100
    )
    private String empEmailId;
    @Column(
            name = "phone_no",
            nullable = true,
            length = 100
    )
    private String empPhoneNo;
    @Column(
            name = "branch_line1",
            nullable = true,
            length = 1000
    )
    private String branchAddress;
    @Column(
            name = "branch_line2",
            nullable = true,
            length = 1000
    )
    private String branchAddress2;
    @Column(
            name = "branch_line3",
            nullable = true,
            length = 1000
    )
    private String branchAddress3;
    @Column(
            name = "zip_code",
            nullable = true,
            length = 10
    )
    private String zipCode;
    @Column(
            name = "reason_id",
            nullable = true,
            length = 20
    )
    private Long reasonId;
    @Column(
            name = "reason_note",
            nullable = true,
            length = 500
    )
    private String reasonNote;
    @Column(
            name = "approver_name",
            nullable = true,
            length = 50
    )
    private String approvalName;
    @Column(
            name = "approved_date",
            nullable = true
    )
    Date approvedDate;
    @Column(
            name = "approval_sent_date"
    )
    Date sentApprovalDate;

    @Column(
            name = "booked_date"
    )

    Date bookedDate;

    @Column(
            name = "filter_month"
    )
    private String filter_month;





    @OneToMany(
            mappedBy = "spotQuotation",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    List<EnquiryChargeDetailsNew> chargeDetails;
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "spotQuotation",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    List<QuotationTermsAndConditionsGeneralNotes> quotationTermsAndConditionGeneralNotes = new ArrayList();
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "spotQuotation",
            cascade = {CascadeType.ALL},
            orphanRemoval = true
    )
    List<QuotationTermsAndConditionServiceNotes> quotationTermsAndConditionServiceNotes = new ArrayList();
    @Column(
            name = "custom_version"
    )
    Long customVersion = 1L;

    @Generated
    public void setId(final Long id) {
        this.id = id;
    }

    @Generated
    public void setVersion(final Long version) {
        this.version = version;
    }

    @Generated
    public void setCompanyId(final Long companyId) {
        this.companyId = companyId;
    }

    @Generated
    public void setGroupCompanyId(final Long groupCompanyId) {
        this.groupCompanyId = groupCompanyId;
    }

    @Generated
    public void setBranchId(final Long branchId) {
        this.branchId = branchId;
    }



    @Generated
    public void setEnquiryUid(final String enquiryUid) {
        this.enquiryUid = enquiryUid;
    }

    @Generated
    public void setQuotationNo(final String quotationNo) {
        this.quotationNo = quotationNo;
    }

    @Generated
    public void setCurrencyId(final Long currencyId) {
        this.currencyId = currencyId;
    }

    @Generated
    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Generated
    public void setValidUpTo(final Date validUpTo) {
        this.validUpTo = validUpTo;
    }

    @Generated
    public void setQuoteType(final QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @Generated
    public void setQuoteAmount(final Double quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    @Generated
    public void setBuyAmount(final Double buyAmount) {
        this.buyAmount = buyAmount;
    }

    @Generated
    public void setShipmentUid(final String shipmentUid) {
        this.shipmentUid = shipmentUid;
    }

    @Generated
    public void setEnquiryDetail(final EnquiryHeader enquiryDetail) {
        this.enquiryDetail = enquiryDetail;
    }

    @Generated
    public void setEmployeeName(final String employeeName) {
        this.employeeName = employeeName;
    }

    @Generated
    public void setEmpEmailId(final String empEmailId) {
        this.empEmailId = empEmailId;
    }

    @Generated
    public void setEmpPhoneNo(final String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    @Generated
    public void setBranchAddress(final String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Generated
    public void setBranchAddress2(final String branchAddress2) {
        this.branchAddress2 = branchAddress2;
    }

    @Generated
    public void setBranchAddress3(final String branchAddress3) {
        this.branchAddress3 = branchAddress3;
    }

    @Generated
    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    @Generated
    public void setReasonId(final Long reasonId) {
        this.reasonId = reasonId;
    }

    @Generated
    public void setReasonNote(final String reasonNote) {
        this.reasonNote = reasonNote;
    }

    @Generated
    public void setApprovalName(final String approvalName) {
        this.approvalName = approvalName;
    }

    @Generated
    public void setApprovedDate(final Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    @Generated
    public void setSentApprovalDate(final Date sentApprovalDate) {
        this.sentApprovalDate = sentApprovalDate;
    }

    @Generated
    public void setBookedDate(final Date bookedDate) {
        this.bookedDate = bookedDate;
    }

    @Generated
    public void setChargeDetails(final List<EnquiryChargeDetailsNew> chargeDetails) {
        this.chargeDetails = chargeDetails;
    }

    @Generated
    public void setQuotationTermsAndConditionGeneralNotes(final List<QuotationTermsAndConditionsGeneralNotes> quotationTermsAndConditionGeneralNotes) {
        this.quotationTermsAndConditionGeneralNotes = quotationTermsAndConditionGeneralNotes;
    }

    @Generated
    public void setQuotationTermsAndConditionServiceNotes(final List<QuotationTermsAndConditionServiceNotes> quotationTermsAndConditionServiceNotes) {
        this.quotationTermsAndConditionServiceNotes = quotationTermsAndConditionServiceNotes;
    }

    @Generated
    public void setCustomVersion(final Long customVersion) {
        this.customVersion = customVersion;
    }

    @Generated
    public Long getId() {
        return this.id;
    }

    @Generated
    public Long getVersion() {
        return this.version;
    }

    @Generated
    public Long getCompanyId() {
        return this.companyId;
    }

    @Generated
    public Long getGroupCompanyId() {
        return this.groupCompanyId;
    }

    @Generated
    public Long getBranchId() {
        return this.branchId;
    }

    @Generated
    public String getEnquiryUid() {
        return this.enquiryUid;
    }

    @Generated
    public String getQuotationNo() {
        return this.quotationNo;
    }

    @Generated
    public Long getCurrencyId() {
        return this.currencyId;
    }

    @Generated
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    @Generated
    public Date getValidUpTo() {
        return this.validUpTo;
    }

    @Generated
    public QuoteType getQuoteType() {
        return this.quoteType;
    }

    @Generated
    public Double getQuoteAmount() {
        return this.quoteAmount;
    }

    @Generated
    public Double getBuyAmount() {
        return this.buyAmount;
    }

    @Generated
    public String getShipmentUid() {
        return this.shipmentUid;
    }

    @Generated
    public EnquiryHeader getEnquiryDetail() {
        return this.enquiryDetail;
    }

    @Generated
    public String getEmployeeName() {
        return this.employeeName;
    }

    @Generated
    public String getEmpEmailId() {
        return this.empEmailId;
    }

    @Generated
    public String getEmpPhoneNo() {
        return this.empPhoneNo;
    }

    @Generated
    public String getBranchAddress() {
        return this.branchAddress;
    }

    @Generated
    public String getBranchAddress2() {
        return this.branchAddress2;
    }

    @Generated
    public String getBranchAddress3() {
        return this.branchAddress3;
    }

    @Generated
    public String getZipCode() {
        return this.zipCode;
    }

    @Generated
    public Long getReasonId() {
        return this.reasonId;
    }

    @Generated
    public String getReasonNote() {
        return this.reasonNote;
    }

    @Generated
    public String getApprovalName() {
        return this.approvalName;
    }

    @Generated
    public Date getApprovedDate() {
        return this.approvedDate;
    }

    @Generated
    public Date getSentApprovalDate() {
        return this.sentApprovalDate;
    }

    @Generated
    public Date getBookedDate() {
        return this.bookedDate;
    }

    @Generated
    public List<EnquiryChargeDetailsNew> getChargeDetails() {
        return this.chargeDetails;
    }

    @Generated
    public List<QuotationTermsAndConditionsGeneralNotes> getQuotationTermsAndConditionGeneralNotes() {
        return this.quotationTermsAndConditionGeneralNotes;
    }

    @Generated
    public List<QuotationTermsAndConditionServiceNotes> getQuotationTermsAndConditionServiceNotes() {
        return this.quotationTermsAndConditionServiceNotes;
    }

    @Generated
    public Long getCustomVersion() {
        return this.customVersion;
    }

    @Generated
    public EnquirySpotQuotation(final Long id, final Long version, final Long companyId, final Long groupCompanyId, final Long branchId, final String enquiryUid, final String quotationNo, final Long currencyId, final String currencyCode, final Date validUpTo, final QuoteType quoteType, final Double quoteAmount, final Double buyAmount, final String shipmentUid, final EnquiryHeader enquiryDetail, final String employeeName, final String empEmailId, final String empPhoneNo, final String branchAddress, final String branchAddress2, final String branchAddress3, final String zipCode, final Long reasonId, final String reasonNote, final String approvalName, final Date approvedDate, final Date sentApprovalDate, final Date bookedDate, final List<EnquiryChargeDetailsNew> chargeDetails, final List<QuotationTermsAndConditionsGeneralNotes> quotationTermsAndConditionGeneralNotes, final List<QuotationTermsAndConditionServiceNotes> quotationTermsAndConditionServiceNotes, final Long customVersion) {
        this.id = id;
        this.version = version;
        this.companyId = companyId;
        this.groupCompanyId = groupCompanyId;
        this.branchId = branchId;
        this.enquiryUid = enquiryUid;
        this.quotationNo = quotationNo;
        this.currencyId = currencyId;
        this.currencyCode = currencyCode;
        this.validUpTo = validUpTo;
        this.quoteType = quoteType;
        this.quoteAmount = quoteAmount;
        this.buyAmount = buyAmount;
        this.shipmentUid = shipmentUid;
        this.enquiryDetail = enquiryDetail;
        this.employeeName = employeeName;
        this.empEmailId = empEmailId;
        this.empPhoneNo = empPhoneNo;
        this.branchAddress = branchAddress;
        this.branchAddress2 = branchAddress2;
        this.branchAddress3 = branchAddress3;
        this.zipCode = zipCode;
        this.reasonId = reasonId;
        this.reasonNote = reasonNote;
        this.approvalName = approvalName;
        this.approvedDate = approvedDate;
        this.sentApprovalDate = sentApprovalDate;
        this.bookedDate = bookedDate;
        this.chargeDetails = chargeDetails;
        this.quotationTermsAndConditionGeneralNotes = quotationTermsAndConditionGeneralNotes;
        this.quotationTermsAndConditionServiceNotes = quotationTermsAndConditionServiceNotes;
        this.customVersion = customVersion;
    }

    @Generated
    public EnquirySpotQuotation()

    {
    }
}








