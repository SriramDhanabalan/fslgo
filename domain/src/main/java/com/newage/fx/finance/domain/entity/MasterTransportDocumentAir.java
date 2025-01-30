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
@Table(name = "master_transport_document_air")
public class MasterTransportDocumentAir extends Auditable<String> {

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

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_SERVICE_SHIPMENT_ID"))
//    public ShipmentHeader shipmentHeader;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @Column(name = "document_type", length = 100)
    @Enumerated(EnumType.STRING)
    private TransportDocumentType documentType;

    @Column(name = "bl_type", length = 50)
    @Enumerated(EnumType.STRING)
    private BLType blType;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "document_no", length = 100)
    private String documentNo;

    @Column(name = "hawb_generated", length = 100)
    private String hawbGeneratedNo;

    @Column(name = "shipper", length = 100)
    private String shipper;

    @Column(name = "shippers_name", length = 300)
    private String shipperName;

    @Column(name = "shippers_address", length = 300)
    private String shipperAddress;

    @Column(name = "shippers_account_number", length = 500)
    private String shipperAccountNumber;

    @Column(name = "consignee", length = 100)
    private String consignee;

    @Column(name = "consignees_name", length = 300)
    private String consigneeName;

    @Column(name = "consignees_address", length = 300)
    private String consigneeAddress;

    @Column(name = "consignees_account_number", length = 500)
    private String consigneeAccountNumber;

    @Column(name = "issuing_carrier_agent", length = 100)
    private String issuingCarrierAgent;

    @Column(name = "issuing_carrier_name_and_city", length = 300)
    private String issuingCarrierNameAndCity;

    @Column(name = "issuing_name", length = 100)
    private String issuingName;

    @Column(name = "issuing_address", length = 300)
    private String issuingAddress;

    @Column(name = "accounting_information", length = 200)
    private String accountingInformation;

    @Column(name = "agents_IATA_code", length = 100)
    private String agentIATACode;

    @Column(name = "account_no", length = 100)
    private String accountNo;

    @Column(name = "routing_id_1", length = 100)
    private Long routingTo1Id;

    @Column(name = "routing_1", length = 100)
    private String routingTo1;

    @Column(name = "routing_no_1", length = 100)
    private String routingNo1;

    @Column(name = "routing_id_2", length = 100)
    private Long routingTo2Id;

    @Column(name = "routing_2", length = 100)
    private String routingTo2;

    @Column(name = "routing_no_2", length = 100)
    private String routingNo2;

    @Column(name = "routing_id_3", length = 100)
    private Long routingTo3Id;

    @Column(name = "routing_3", length = 100)
    private String routingTo3;

    @Column(name = "routing_no_3", length = 100)
    private String routingNo3;

    @Column(name = "by_first_career_id", length = 100)
    private Long byFirstCarrierId;

    @Column(name = "by_first_career", length = 100)
    private String byFirstCarrier;

    @Column(name = "routing_by1", length = 100)
    private String routingBy1;

    @Column(name = "routing_by1_id", length = 100)
    private Long routingBy1Id;

    @Column(name = "routing_by2", length = 100)
    private String routingBy2;

    @Column(name = "routing_by2_id", length = 100)
    private Long routingBy2Id;

    @Column(name = "currency_id", length = 10)
    private Long currencyId;

    @Column(name = "currency_code", length = 20)
    private String currencyCode;

    @Column(name = "charge_code", length = 5)
    @Enumerated(EnumType.STRING)
    private Freight chargeCode;

    @Column(name = "other_1", length = 10, nullable = true)
    @Enumerated(EnumType.STRING)
    private Freight other1;

    @Column(name = "wt_or_val_1", length = 10, nullable = true)
    @Enumerated(EnumType.STRING)
    private Freight wtOrVal1;

    @Column(name = "other_2", length = 10, nullable = true)
    @Enumerated(EnumType.STRING)
    private Freight other2;

    @Column(name = "wt_or_val_2", length = 10, nullable = true)
    @Enumerated(EnumType.STRING)
    private Freight wtOrVal2;

    @Column(name = "declare_value_of_carriage", length = 10)
    private String declareValueOfCarriage;

    @Column(name = "declare_value_of_customs", length = 10)
    private String declareValueOfCustoms;

    @Column(name = "origin_id", length = 100)
    private Long airportOfDepartureId;

    @Column(name = "origin", length = 100)
    private String airportOfDeparture;

    @Column(name = "destination_id", length = 100)
    private Long destinationId;

    @Column(name = "destination", length = 100)
    private String destination;

    @Column(name = "flight1_date", length = 100)
    private Date flight1Date;

    @Column(name = "flight2_date", length = 100)
    private Date flight2Date;

    @Column(name = "voyage_no1", length = 100)
    private String voyageNo1;

    @Column(name = "voyage_no2", length = 100)
    private String voyageNo2;

    @Column(name = "amt_of_insurance", nullable = true)
    private String amountOfInsurance;

    @Column(name = "handling_information", length = 100)
    private String handlingInformation;

    @Column(name = "aes_number", length = 20)
    private String aesNumber;

    @Column(name = "pan_number", length = 10)
    private String panNumber;

    @Column(name = "diversion_contray_to_us_law_prohibited", length = 10)
    private String DiversionContrayToUS;

    @Column(name = "no_of_pieces", nullable = true, length = 20)
    private Integer noOfPieces;

    @Column(name = "gross_weight_kgs", nullable = true)
    private Double grossWeightKg;

    @Column(name = "gross_weight_lbs", nullable = true)
    private Double grossWeightLbs;

    @Column(name = "kg_lb", nullable = true, length = 10)
    private String kgOrLb;

    @Column(name = "rate_class", nullable = true, length = 10)
    @Enumerated(EnumType.STRING)
    private RateClass rateClass;

    @Column(name = "commodity_code", nullable = true, length = 10)
    private String commodityCode;

    @Column(name = "chargeable_weight", nullable = true)
    private String chargeableWeight;

    @Column(name = "rate_or_charge", nullable = true)
    private String rateOrCharge;

    @Column(name = "total", nullable = true)
    private String total;

    @Column(name = "marks_and_no", nullable = true, length = 1000)
    private String marksAndNumbers;

    //prepaid

    @Column(name = "weight_charge_prepaid", nullable = true, length = 20)
    private String weightChargePrepaid;

    @Column(name = "valuation_charges_prepaid", nullable = true, length = 20)
    private String valuationChargesPrepaid;

    @Column(name = "tax_prepaid", nullable = true, length = 20)
    private String taxPrepaid;

    @Column(name = "other_due_agent_prepaid", nullable = true, length = 20)
    private String otherDueAgentPrepaid;

    @Column(name = "other_due_carrier_prepaid", nullable = true, length = 20)
    private String otherDueCarrierPrepaid;

    @Column(name = "total_prepaid", nullable = true, length = 20)
    private String totalPrepaid;

    @Column(name = "currency_conv_rate_prepaid", nullable = true, length = 20)
    private String currencyConversionRate;

    //collect

    @Column(name = "weight_charge_collect", nullable = true, length = 20)
    private String weightChargeCollect;

    @Column(name = "valuation_charges_collect", nullable = true, length = 20)
    private String valuationChargesCollect;

    @Column(name = "tax_collect", nullable = true, length = 20)
    private String taxCollect;

    @Column(name = "other_due_agent_collect", nullable = true, length = 20)
    private String otherDueAgentColllect;

    @Column(name = "other_due_carrier_collect", nullable = true, length = 20)
    private String otherDueCarrierCollect;

    @Column(name = "total_collect", nullable = true, length = 20)
    private String totalCollect;

    @Column(name = "cc_charge_id", nullable = true, length = 20)
    private Long ccChargeId;

    @Column(name = "cc_charge", nullable = true, length = 100)
    private String ccCharge;

    @Column(name = "charges_at_destination", nullable = true, length = 20)
    private String chargeAtDestination;

    @Column(name = "agent_id", length = 10)
    private Long agentId;

    @Column(name = "agent", length = 300)
    private String agent;

    @Column(name = "auto_agent_id", length = 10)
    private Long autoAgentId;

    @Column(name = "auto_agent", length = 300)
    private String autoAgent;

    @Column(name = "carrier_agent_id", length = 10)
    private Long carrierAgentId;

    @Column(name = "carrier_agent", length = 300)
    private String carrierAgent;

    @Column(name = "carrier_name", length = 100)
    private String carrierName;

    @Column(name = "carrier_id", length = 100)
    private Long carrierId;

    @Column(name = "status", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private HawbStatus mawbStatus;

    @Column(name = "master_ref_id", length = 100)
    private String masterRefId;

    @Column(name = "total_volume", length = 100)
    private String totalVolume;

    @OneToMany(mappedBy = "transportDocumentAir", cascade = CascadeType.ALL)
    private List<TransportDocumentDetails>  transportDocumentDetails = new ArrayList<>();

    @OneToMany(mappedBy = "transportDocumentAir", cascade = CascadeType.ALL)
    private List<TransportDocumentOtherCharges> otherCharges = new ArrayList<>();

    @OneToMany(mappedBy = "transportDocumentAir", cascade = CascadeType.ALL)
    private List<TransportDocumentLogHistory> hawbHistoryLogs = new ArrayList<>();
}
