package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.AesFillingParty;
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
@Table(name = "shipment_addl_detail")
public class ShipmentAddlDetail extends Auditable<String> {

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

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "planned_carrier_id", length = 20)
    private Long carrierId;

    @Column(name = "planned_vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "planned_route_no", length = 20)
    private String voyageOrflightNo;

    @Column(name = "planned_schedule_id", length = 20)
    private Long plannedScheduleId;

    @Column(name = "etd", nullable = true)
    private Date etd;

    @Column(name = "eta", nullable = true)
    private Date eta;

    @Column(name = "etd_time")
    private String etdTime;

    @Column(name = "eta_time")
    private String etaTime;

    @Column(name = "tab_validation", nullable = true)
    private String tabValidation;

    @Column(name = "transport_document_no", nullable = true)
    private String transportDocumentNo;

    @Column(name = "lc", nullable = true)
    @Enumerated(EnumType.STRING)
    private YesNo lc;

    @Column(name = "lc_number", nullable = true)
    private String lcNumber;

    @Column(name = "lc_exp_date", nullable = true)
    private Date lcExpiryDate;

    @Column(name = "do_number", nullable = true)
    private String doNumber;

    @Column(name = "do_date", nullable = true)
    private Date doDate;

    @Column(name = "lc_note", nullable = true)
    private String lcNote;

    @Column(name = "po_number", nullable = true, length = 100)
    private String poNumber;

    @Column(name = "customer_reference_no", nullable = true, length = 100)
    private String customerReferenceNo;

    @Column(name = "shipper_ref_no", nullable = true, length = 100)
    private String shipperRefNo;

    @Column(name = "invoice_note",nullable = true, length = 500)
    private String invoiceNote;

    @Column(name = "reference_number", nullable = true)
    private String referenceNumber;

    @Column(name = "item_no", nullable = true)
    private Long itemNo;

    @Column(name = "sub_item_no", nullable = true)
    private Long subItemNo;

    @Column(name = "tsa_no", nullable = true,length = 15)
    private String tsaNo;

    @Column(name = "as_agreed", nullable = true)
    @Enumerated(EnumType.STRING)
    private YesNo asAgreed;

    @Column(name = "aes_no", nullable = true,length = 15)
    private String aesNo;

    @Column(name = "ams_hbl_no", nullable = true,length = 15)
    private String amsHblNo;

    @Column(name = "import_file_no", nullable = true,length = 15)
    private String importFileNo;

    @Column(name = "it_no", nullable = true,length = 15)
    private String itNo;

    @Column(name = "go_date", nullable = true,length = 15)
    private Date goDate;

    @Column(name = "it_date", nullable = true,length = 15)
    private Date itDate;

    @Column(name = "it_approved_port_id",nullable = true,length = 15)
    private Long itApprovedPortId;

    @Column(name = "it_approved_port_name",nullable = true,length = 15)
    private String itApprovedPortName;

    @Column(name = "is_service_job",nullable = true,length = 15)
    @Enumerated(EnumType.STRING)
    private YesNo isServiceJob;

    @Column(name = "is_courier_shipment",nullable = true,length = 15)
    @Enumerated(EnumType.STRING)
    private YesNo isCourierShipment;

    @Column(name = "vgm_cutoff_date",nullable = true)
    private Date vgmCutOffDate;

    @Column(name = "vgm_weight_kgs", nullable = true)
    private Double vgmWeightInKgs;

    @Column(name = "vgm_weight_lbs", nullable = true)
    private Double vgmWeightInLbs;

    @Column(name = "aes_cutoff_date", nullable = true)
    private Date aesCutoffDate;

    @Column(name = "aes_filling_party", nullable = true, length = 20)
    @Enumerated(EnumType.STRING)
    private AesFillingParty aesFillingParty;

    //job transfer
    @Column(name = "nxt_toefs_id")
    private Long nxToefsId;

    @Column(name = "efs_jobno")
    private String efsJobno;

    @Column(name = "efs_segment_code")
    private String efsSegmentCode;

    @Column(name = "efs_job_status")
    private String efsJobStatus;

    @Column(name = "flag_insert_update")
    private String InsertUpdate;

    //canada
    @Column(name = "ccn_no")
    private String ccnNo;

    @Column(name = "ccn_date")
    private Date ccnDate;

    @Column(name = "transhipment_ccn_no")
    private String transhipmentCcnNo;

    @Column(name = "trans_ccn_date")
    private Date transCcnDate;

    @Column(name = "forwarder_ccn_no")
    private String forwarderCcnNo;

    @Column(name = "forwarder_transhipment_ccn_no")
    private String forwarderTranshipmentCcnNo;

    @Column(name = "transhipment_warehouse_id")
    private Long transhipmentWarehouseId;

    @Column(name = "trans_warehouse_date")
    private Date transWareHouseDate;

    @Column(name = "last_free_day")
    private Date lastFreeDay;

    @Column(name = "shipment_completed", nullable = false, length = 20)
    @Enumerated(EnumType.STRING)
    private YesNo shipmentCompleted;

    @Column(name = "master_no")
    private String masterNo;

    @Column(name = "mft_from_id")
    private Long mftFromId;

    @Column(name = "mft_to_id")
    private Long mftToId;

    @Column(name = "forwarder_hbl_no",length = 15)
    private String forwarderHblNo;

    @Column(name = "hold", nullable = true)
    @Enumerated(EnumType.STRING)
    private YesNo hold;

    @Column(name = "isf_number", nullable = true, length = 25)
    private String isfNumber;

    @Column(name = "forwarder_hbl", nullable = true, length = 15)
    private String forwarderHbl;

    @Column(name = "do_expiry_date", nullable = true)
    private Date doExpiryDate;

    @Column(name = "secondary_origin_booking_person",nullable = true)
    private String secondaryOriginBookingPerson;

    @Column(name = "secondary_destination_booking_person",nullable = true)
    private String secondaryDestinationBookingPerson;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_header_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_ADDITIONAL_ID"))
    public ShipmentHeader shipmentHeader;

    @Column(name = "cost_center_id")
    private Long costCenterId;

    @Column(name = "carrier_booking_no", nullable = true)
    private String carrierBookingNo;

    @Column(name = "carrier_booking_date", nullable = true)
    private Date carrierBookingDate;

    @Column(name = "manifest_hbl_no", length = 30)
    private String manifestHblNo;

    @Column(name = "hold_notes", length = 100)
    private String holdNotes;

    @Column(name = "cargo_ready_date")
    private Date cargoReadyDate;
}