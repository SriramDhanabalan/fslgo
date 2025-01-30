package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.AesFillingType;
import com.newage.fx.finance.domain.enums.FilingOption;
import com.newage.fx.finance.domain.enums.UsTransportMode;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@Table(name = "us_custom_general_info")
public class GeneralInfoAesCustomDetails extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "branch")
    private String branch;

    @Column(name = "company")
    private String company;

    @Column(name = "filing_option")
    @Enumerated(EnumType.STRING)
    private FilingOption filingOption;

    @Column(name = "mawb_no")
    private String mawbNo;

    @Column(name = "hawb_no")
    private String hawbNo;

    @Column(name = "us_transport_mode")
    @Enumerated(EnumType.STRING)
    private UsTransportMode transportMode;

    @Column(name = "origin_state_id")
    private Long originStateId;

    @Column(name = "country_of_destination_id")
    private Long countryOfDestinationId;

    @Column(name = "port_of_exportation_id")
    private Long portOfExportationId;

    @Column(name = "port_of_unlading_id")
    private Long portOfUnladingId;

    @Column(name = "etd")
    private Date etd;

    @Column(name = "scas_iata_code_id")
    private Long scasAndIataCodeId;

    @Column(name = "vessel_id")
    private Long vesselId;

    @Column(name = "routed_transaction")
    private Boolean routedTransaction;

    @Column(name = "usppi_ultimate_consignee_related")
    private Boolean usppiAndUltimateConsigneeRelated;

    @Column(name = "is_hazardous_cargo")
    private Boolean isHazardousCargo;

    @Column(name = "inbound_type_id")
    private Long inboundTypeId;

    @Column(name = "import_entry_no")
    private Long importEntryNo;

    @Column(name = "foreign_trade_zone")
    private Long foreignTradeZone;

    @OneToOne(mappedBy = "generalInfo", cascade = CascadeType.ALL)
    private UsppiAesCustomDetails usppiAesCustom;

    @OneToOne(mappedBy = "generalInfo", cascade = CascadeType.ALL)
    private ConsigneeDetails consigneeDetails;

    @OneToOne(mappedBy = "generalInfo", cascade = CascadeType.ALL)
    private FreightForwarderDetails freightForwarder;

    @OneToMany(mappedBy = "generalInfo",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference
    private List<CommodityDetails> aesCommodityList= new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo",cascade = CascadeType.ALL)
    private List<EquipmentDetails> aesEquipmentDetails= new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ID"))
    private ShipmentHeader shipmentHeader;

    @Column(name = "master_id")
    private Long masterId;

    @Column(name="correlation_id")
    private String correlationId;

    @Column(name = "aes_filing_type")
    @Enumerated(EnumType.STRING)
    private AesFillingType aesFillingType;

/*    @Column(name = "userName")
    private String userName;*/
}
