package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "service_master_shipment_party_detail")
public class ServiceMasterShipmentPartyDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "shipper_id")
    private Long shipperId;

    @Column(name = "shipper_name")
    private String shipperName;

    @JoinColumn(name = "shipper_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_SHIPPERADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail shipperAddress;

    @Column(name = "consignee_id")
    private Long consigneeId;

    @Column(name = "consignee_name")
    private String consigneeName;

    @JoinColumn(name = "consignee_address_id", foreignKey = @ForeignKey(name = "FK_PARTY_DETAIL_CONSIGNEEADD"))
    @OneToOne(cascade = CascadeType.ALL)
    private PartyAddressDetail consigneeAddress;

    @Column(name = "obl_mawb_number")
    private String oblMawbNumber;

    @Column(name = "hbl_hawb_number")
    private String hblHawbNumber;

    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Integer noOfPieces;

    @Column(name = "gross_weight_kgs", nullable = false, length = 20)
    private Double grossWeightKg;

    @Column(name = "volume_weight", nullable = false, length = 20)
    private Double volumeWeight;

    @Column(name = "volume", nullable = false, length = 20)
    private Double volume;

    @Column(name = "chargeable_weight",nullable = false,length = 20)
    private Double chargeableWeight;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_master_id", foreignKey = @ForeignKey(name = "FK_SERVICE_MASTER_HEADER_ID"))
    public ServiceMasterShipmentHeader serviceMasterShipmentHeader;

    @Version
    @Column(name = "version")
    private Long version;


}
