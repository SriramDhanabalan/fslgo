package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transport_document_ocean")
public class TransportDocumentOcean extends Auditable<String> {

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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"),insertable = false,updatable = false)
//    public MasterHeader masterHeader;

    @Column(name = "document_type", length = 100)
    @Enumerated(EnumType.STRING)
    private TransportDocumentType documentType;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "document_no", length = 100)
    private String documentNo;

    @Column(name = "bl_type", length = 50)
    @Enumerated(EnumType.STRING)
    private BLType blType;

    @Column(name = "shipper", length = 100)
    private String shipper;

    @Column(name = "shippers_address", length = 300)
    private String shipperAddress;

    @Column(name = "consignee", length = 100)
    private String consignee;

    @Column(name = "consignees_address", length = 300)
    private String consigneeAddress;

    @Column(name = "notify_party", length = 100)
    private String notifyParty;

    @Column(name = "notify_address", length = 300)
    private String notifyPartyAddress;

    @Column(name = "bill_lading_no", length = 300)
    private String billLadingNo;

    @Column(name = "export_reference", length = 300)
    private String exportReference;

    @Column(name = "forwarder_agent", length = 100)
    private String forwarderAgent;

    @Column(name = "forwarder_agent_address", length = 300)
    private String forwarderAgentAddress;

    @Column(name = "document_presentation", length = 100)
    private String documentPresentation;

    @Column(name = "document_presentation_value", length = 300)
    private String documentPresentationValue;

    @Column(name = "place_of_receipt_id")
    private Long placeOfReceiptId;

    @Column(name = "place_of_receipt_name", length = 300)
    private String placeOfReceiptName;

    @Column(name = "vessel_id")
    private Long vesselId;

    @Column(name = "vessel_name",length = 300)
    private String vesselName;

    @Column(name = "voyage_number", length = 20)
    private String voyageNumber;

    @Column(name = "port_of_loading_id")
    private Long portOfLoadingId;

    @Column(name = "port_of_loading_name")
    private String portOfLoadingName;

    @Column(name = "port_of_discharge_id")
    private Long portOfDischargeId;

    @Column(name = "port_of_discharge_name")
    private String portOfDischargeName;

    @Column(name = "place_of_delivery_id")
    private Long placeOfDeliveryId;

    @Column(name = "place_of_delivery_name")
    private String placeOfDeliveryName;

    @Column(name = "internal_reference")
    private String internalReference;

    @Column(name = "marks_and_no", length = 1000)
    private String marksAndNumbers;

    @Column(name = "description_of_package", length = 1000)
    private String descriptionOfPackage;

    @Column(name = "field_one")
    private String fieldOne;

    @Column(name = "field_two")
    private String fieldTwo;

    @Column(name = "field_three")
    private String fieldThree;

    @Column(name = "freight", nullable = false, length = 7)
    @Enumerated(EnumType.STRING)
    private Freight freight;

    @Column(name = "company")
    private String company;

    @Column(name = "place_of_issue_id")
    private Long placeOfIssueId;

    @Column(name = "place_of_issue_name")
    private String placeOfIssueName;

    @Column(name = "issue_date")
    private Date issueDate;

    @Column(name = "aes_number", length = 20)
    private String aesNumber;

    @Column(name = "status", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private HawbStatus hblStatus;

    @Column(name = "date")
    private Date date;

    @OneToMany(mappedBy = "transportDocumentOcean", cascade = CascadeType.ALL)
    private List<TransportDocumentDetails>  transportDocumentDetails = new ArrayList<>();

    @OneToMany(mappedBy = "transportDocumentOcean", cascade = CascadeType.ALL)
    private List<TransportDocumentOtherCharges> hblChargeDetails = new ArrayList<>();

    @OneToMany(mappedBy = "transportDocumentOcean", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransportDocumentContainerDetails> hblContainerDetails = new ArrayList<>();

    @OneToMany(mappedBy = "transportDocumentOcean", cascade = CascadeType.ALL)
    private List<TransportDocumentLogHistory> hblHistoryLogs = new ArrayList<>();
}
