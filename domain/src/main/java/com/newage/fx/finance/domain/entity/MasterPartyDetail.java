package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_party_detail")
public class MasterPartyDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @Column(name = "shipper_id")
    private Long shipperId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "shipper_name")
    private String shipperName;

    @Valid
    @JoinColumn(name = "shipper_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_SHIPPERADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail shipperAddress;

    @Column(name = "consignee_id")
    private Long consigneeId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "consignee_name")
    private String consigneeName;

    @Valid
    @JoinColumn(name = "consignee_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_CONSIGNEEADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail consigneeAddress;

    @Column(name = "origin_agent_id")
    private Long originAgentId;

    @Column(name = "origin_agent_name")
    private String originAgentName;

    @JoinColumn(name = "origin_agent_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_ORIGIN_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail originAgentAddress;

    @Column(name = "destination_agent_id")
    private Long destinationAgentId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "destination_agent_name")
    private String destinationAgentName;


    @Valid
    @JoinColumn(name = "destination_agent_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_DESTINATION_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail destinationAgentAddress;

    @Column(name = "notify_customer_1_id")
    private Long notifyOneId;

    @JoinColumn(name = "notify_customer_1_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_NOTIFY1_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail notifyOneAddress;

    @Column(name = "notify_customer_2_id")
    private Long notifyTwoId;

    @JoinColumn(name = "notify_customer_2_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_NOTIFY2_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail notifyTwoAddress;

    @Column(name = "forwarder_id")
    private Long forwarderId;

    @JoinColumn(name = "forwarder_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_FORWARDER_AGENTADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail forwarderAddress;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @Version
    @Column(name = "version")
    private Long version;

}