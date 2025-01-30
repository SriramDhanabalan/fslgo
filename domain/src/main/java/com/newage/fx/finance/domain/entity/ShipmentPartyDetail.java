package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.Configuration.CustomValidationMarkerInterface;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_party_detail")
public class ShipmentPartyDetail extends Auditable<String> {

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

//    @Column(name = "shipment_id", length = 100,nullable = false)
//    private Long shipmentId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

   // @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "shipper_id", length = 20)
    private Long shipperId;

    @Column(name = "shipper_name", nullable = false, length = 20)
    private String shipperName;

    @Column(name = "is_shipper_name_edited")
    private Boolean isShipperNameEdited;


    @JoinColumn(name = "shipper_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_SHIPPERADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail shipperAddress;

    @Column(name = "consignee_id", length = 20)
    private Long consigneeId;

    @Column(name = "consignee_name", nullable = false, length = 20)
    private String consigneeName;

    @Column(name = "is_consignee_name_edited")
    private Boolean isConsigneeNameEdited;

    @JoinColumn(name = "consignee_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_CONSIGNEEADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail consigneeAddress;

    @Column(name = "is_agent_edited")
    private Boolean isAgentNameEdited;

    @Column(name = "origin_agent_id", nullable = false, length = 20)
    private Long originAgentId;

    @Column(name = "origin_agent_name", length = 20)
    private String originAgentName;

    @JoinColumn(name = "origin_agent_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_ORIGIN_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail originAgentAddress;

    @Column(name = "destination_agent_id", nullable = false, length = 20)
    private Long destinationAgentId;

    @Column(name = "destination_agent_name", length = 20)
    private String destinationAgentName;

    @JoinColumn(name = "destination_agent_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_DESTINATION_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail destinationAgentAddress;

    @NotNull(groups = {CustomValidationMarkerInterface.class}, message = "can not be null")
    @Column(name = "notify_customer_1_id", nullable = false, length = 20)
    private Long notifyOneId;

    @JoinColumn(name = "notify_customer_1_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_NOTIFY1_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail notifyOneAddress;

    @Column(name = "notify_customer_2_id", nullable = false, length = 20)
    private Long notifyTwoId;

    @JoinColumn(name = "notify_customer_2_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_NOTIFY2_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail notifyTwoAddress;

    @Column(name = "forwarder_id", nullable = false, length = 20)
    private Long forwarderId;

    @JoinColumn(name = "forwarder_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_FORWARDER_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail forwarderAddress;

    @Column(name = "custom_house_agent_id", nullable = false, length = 20)
    private Long customHouseAgentId;

    @JoinColumn(name = "custom_house_agent_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_NOTIFY2_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail customHouseAgentAddress;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_PARTY_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}
