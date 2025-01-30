package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.SourceType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "authenticated_document_detail")
public class AuthenticatedDocumentDetail extends Auditable<String> {

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

    @Column(name = "source_type", length = 100)
    @Enumerated(EnumType.STRING)
    private SourceType sourceType;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "document_no",length = 25)
    private String documentNo;

    @Column(name = "document_date")
    private Date documentDate;

    @Column(name = "origin_id", length = 20)
    private Long originId;

    @Column(name = "destination_id", length = 20)
    private Long destinationId;

    @Column(name = "no_of_pieces",length = 8)
    private int noOfPiece;

    @Column(name = "gross_weight_kgs",precision = 14, scale = 3)
    private double grossWeightKgs;

    @Column(name = "gross_weight_lbs",precision = 14, scale = 3)
    private double grossWeightLbs;

    @Column(name = "volume_in_cbm",precision = 14, scale = 3)
    private double volumeIncbm;

    @Column(name = "volume_in_cft",precision = 14, scale = 3)
    private double volumeIncbt;

    @Column(name = "volume_weight",precision = 14, scale = 3)
    private double volumeWeight;

    @Column(name = "chargeable_unit",precision = 14, scale = 3)
    private double chargeableUnit;

    @Column(name = "shipper_id", nullable = true, length = 20)
    private Long shipperId;

    @Column(name = "shipper_name", nullable = true, length = 100)
    private String shipperName;

/*    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "shipper_address_id", foreignKey = @ForeignKey(name = "FK_AUTH_DOCS_SHIPPERADDID"))
    private AddressInfo shipperAddress;*/

    @Column(name = "consignee_id", nullable = true, length = 20)
    private Long consigneeId;

    @Column(name = "consignee_name", nullable = true, length = 100)
    private String consigneeName;

/*    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "consignee_address_id", foreignKey = @ForeignKey(name = "FK_AUTH_DOCS_CONSIGNADDID"))
    private AddressInfo consigneeAddress;*/

    @Column(name = "notify_customer_1_id", nullable = true, length = 20)
    private Long notifyOneId;

/*    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "notify_customer_1_address_id", foreignKey = @ForeignKey(name = "FK_AUTH_DOCS_NOTIFYONEADDID"))
    private AddressInfo notifyOneAddress;*/

    @Column(name = "notify_customer_2_id", nullable = true, length = 20)
    private Long notifyTwoId;

    /*@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "notify_customer_2_address_id", foreignKey = @ForeignKey(name = "FK_AUTH_DOCS_NOTIFYONEADDID"))
    private AddressInfo notifyTwoAddress;*/

    @Column(name = "forwarder_id", nullable = true, length = 20)
    private Long forwarderId;

    /*@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "forwarder_address_id", foreignKey = @ForeignKey(name = "FK_AUTH_DOCS_FORWARDADDID"))
    private AddressInfo forwarderAddress;*/

    @Column(name = "note")
//    @Lob
    private String notes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_EVENT_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;
}
