package com.newage.fx.finance.domain.entity;

;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.BLType;
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
@Table(name = "master_service_customs_detail")
public class MasterServiceCustomsDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "declared_value_for_customs")
    private String declaredValueForCustoms;

    @Column(name = "boe_no")
    private String boeNo;

    @Column(name = "boe_date")
    private Date boeDate;

    @Column(name = "igm_no")
    private String igmNo;

    @Column(name = "igm_date")
    private Date igmDate;

    @Column(name = "rotation_no")
    private String rotationNo;

    @Column(name = "rotation_date")
    private Date rotationDate;

    @Column(name = "mrn_no")
    private String mrnNo;

    @Column(name = "mrn_date")
    private Date mrnDate;

    @Column(name = "unstuff_place")
    private Long unstuffPlace;

    @Column(name = "unstuff_date")
    private Date unstuffDate;

    @Column(name = "export_customs_clearance_date")
    private Date exportCustomsClearanceDate;

    @Column(name = "import_customs_clearance_date")
    private Date importCustomsClearanceDate;

    @Column(name = "customs_status")
    private String customsStatus;

    @Column(name = "customs_cleared")
    @Enumerated(EnumType.STRING)
    private YesNo customsCleared;

    @Column(name = "customs_entry_no")
    private String customsEntryNo;

    @Column(name = "customs_entry_date")
    private Date customsEntryDate;

    @Column(name = "shipper_id")
    private Long shipperId;

    @Column(name = "consignee_id")
    private Long consigneeId;

    @Column(name = "first_notify_id")
    private Long firstNotifyId;

    @Column(name = "forwarder_id")
    private Long forwarderId;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "nature_of_cargo")
    private Long natureOfCargo;

    @Column(name = "cargo_movement")
    private Long cargoMovement;

    @Column(name = "hbl_type")
    @Enumerated(EnumType.STRING)
    private BLType hblType;

    @Column(name = "forwarder_hbl_involved")
    @Enumerated(EnumType.STRING)
    private YesNo forwarderHBLInvolved;

    @Column(name = "customs_consignee_confirmed")
    @Enumerated(EnumType.STRING)
    private YesNo customsConsigneeConfirmed;

    @Column(name = "is_high_sea_sale")
    @Enumerated(EnumType.STRING)
    private YesNo isHighSeaSale;

    @Column(name = "final_buyer")
    @Enumerated(EnumType.STRING)
    private YesNo finalBuyer;

    @Column(name = "ie_code")
    private String ieCode;

    @Column(name = "branch_serial_number")
    private String branchSerialNo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "master_service_id", foreignKey = @ForeignKey(name = "FK_MASTER_SERVICE_ID"))
//    public MasterServiceDetail masterServiceId;

    @Column(name = "sl_no")
    private Long slNo;

    @Version
    @Column(name = "version")
    private Long version;

}