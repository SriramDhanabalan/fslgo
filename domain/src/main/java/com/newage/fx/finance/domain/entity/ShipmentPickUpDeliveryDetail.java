package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "shipment_pickup_delivery_detail")
public class ShipmentPickUpDeliveryDetail extends Auditable<String> {

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
//    private String shipmentId;

    @Column(name = "shipment_service_id", length = 100,nullable = false)
    private Long shipmentServiceId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "pickup_required", length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo pickupRequired;

    @Column(name = "planned_pickup_date", nullable = false)
    private Date plannedPickupDate;

    @Column(name = "actual_pickup_date", nullable = false)
    private Date actualPickupDate;

    @Column(name = "pickup_from_id", nullable = false, length = 20)
    private Long pickupFromId;

    @JoinColumn(name = "pickup_from_address_id", foreignKey = @ForeignKey(name = "FK_PICKUP_FROM_ADDINFO"), nullable = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private PartyAddressDetail pickupFromAddress;

    @Column(name = "pickup_transporter_id", nullable = false, length = 20)
    private Long pickupTransporterId;

    @Column(name = "pickup_transporter_contact_name", nullable = false, length = 20)
    private String pickupTransporterContactName;

    @Column(name = "pickup_transporter_email", nullable = false, length = 20)
    private String pickupTransporterEmail;

    @Column(name = "pickup_transporter_pre_mobile", nullable = false, length = 20)
    private String pickupTransporterPreMobile;

    @Column(name = "pickup_transporter_mobile", nullable = false, length = 20)
    private String pickupTransporterMobile;

    @Column(name = "origin_cfs_terminal_id", nullable = false, length = 20)
    private Long orginCfsTerminalId;

    @JoinColumn(name = "origin_cfs_terminal_address_id", foreignKey = @ForeignKey(name = "FK_ORIGIN_CFS_TERMINAL_ADDINFO"), nullable = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private PartyAddressDetail orginCfsTerminalAddress;

    @Column(name = "cfs_transporter_id", nullable = false, length = 20)
    private Long cfsTransporterId;

    @Column(name = "cfs_transporter_contact_name", nullable = false, length = 20)
    private String cfsTransporterContactName;

    @Column(name = "cfs_transporter_email", nullable = false, length = 20)
    private String cfsTransporterEmail;

    @Column(name = "cfs_transporter_pre_mobile", nullable = false, length = 20)
    private String cfsTransporterPreMobileNo;

    @Column(name = "cfs_transporter_mobile", nullable = false, length = 20)
    private String cfsTransporterMobile;

    @Column(name = "planned_origin_cfs_arrival_date", nullable = false)
    private Date plannedOrginCfsArrivalDate;

    @Column(name = "actual_origin_cfs_arrival_date", nullable = false)
    private Date actualOrginCfsArrivalDate;

    @Column(name = "delivery_required", length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo deliveryRequired;

    @Column(name = "delivery_to_id", nullable = false, length = 20)
    private Long deliveryToId;

    @JoinColumn(name = "delivery_to_address_id", foreignKey = @ForeignKey(name = "FK_DELIVERY_TO_INFO"), nullable = true)
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    private PartyAddressDetail deliveryToAddress;

    @Column(name = "planned_delivery_date", nullable = false)
    private Date plannedDeliveryDate;

    @Column(name = "actual_delivery_date", nullable = false)//name change in db
    private Date actualDeliveryDate;

    @Column(name = "delivery_transporter_id", nullable = false, length = 20)
    private Long deliveryTransporterId;

    @Column(name = "delivery_transporter_contact_name", nullable = false, length = 20)
    private String deliveryTransporterContactName;

    @Column(name = "delivery_transporter_email", nullable = false, length = 20)
    private String deliveryTransporterEmail;

    @Column(name = "delivery_transporter_pre_mobile", nullable = false, length = 20)
    private String deliveryTransporterPreMobileNo;

    @Column(name = "delivery_transporter_mobile", nullable = false, length = 20)
    private String deliveryTransporterMobile;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_PICKUP_DEL_SHIPMENT_ID"))
    public ShipmentHeader shipmentHeader;

}
