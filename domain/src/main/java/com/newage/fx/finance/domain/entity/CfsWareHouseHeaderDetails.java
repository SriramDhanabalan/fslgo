package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.DimensionUnit;
import com.newage.fx.finance.domain.enums.ReceiveType;
import com.newage.fx.finance.domain.enums.ReceivedIn;

import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_cfs_warehouse_header_details")
public class CfsWareHouseHeaderDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /*Call Number*/
    @NotNull
    @Column(name = "cfs_id", nullable = false, length = 20)
    private Long cfsId;

    @NotNull
    @Column(name = "cfs_name", nullable = false, length = 100)
    private String cfsName;

    @NotNull
    @Column(name = "receipt_id", nullable = false, length = 100)
    private String receiptId;

    @Column(name = "receipt_type",nullable = true)
    private ReceiveType receiptType;

    @CreatedDate
    @Column(name = "received_datetime", nullable = false)
    private Date receivedDate;


    @Column(name = "received_time", nullable = false)
    private String  receivedTime;

    @Column(name = "customer_id", nullable = true, length = 20)
    private Long customerId;


    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;


    @Column(name = "cust_ref_no", nullable = false, length = 100)
    private String custRefNo;

    @Column(name = "supplier_id", nullable = true, length = 20)
    private Long supplierId;


    @Column(name = "supplier_name", nullable = false, length = 100)
    private String supplierName;


    @Column(name = "supplier_ref_no", nullable = false, length = 100)
    private String supplierRefNo;


    @Column(name = "cfs_note", nullable = true, length = 2000)
    private String cfsNote;

    @Column(name = "marks_and_numbers", nullable = true, length = 2000)
    private String marksAndNumbers;

    @Column(name = "commodity", nullable = true, length = 2000)
    private String commodity;

//    @Column(name = "driver_id", nullable = true, length = 20)
//    private Long driverId;

    @NotNull
    @Column(name = "driver_name", nullable = false, length = 100)
    private String driverName;

    @NotNull
    @Column(name = "truck_no", nullable = false, length = 100)
    private String truckNo;

    @Column(name = "hbl_hawb_no", nullable = false, length = 100)
    private String HBLOrHawb;

    @Column(name="branch_id",nullable = false)
    private Long userBranchId;

    @Column(name="employee_id",nullable = false)
    private Long userEmployeeId;

    @Column(name = "dimension_unit", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private DimensionUnit unit;

    @Column(name = "received_in", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private ReceivedIn receivedIn;

    @Column(name = "dimension_value", nullable = true, length = 20)
    private Integer dimensionValue;

    @Column(name = "auto_cfs", nullable = true, length = 10)
    @Enumerated(EnumType.STRING)
    private YesNo autoCfs = YesNo.Yes;

    @Column(name = "manual_cfs", nullable = true, length = 10)
    @Enumerated(EnumType.STRING)
    private YesNo manualCfs;

    @Version
    @Column(name = "version")
    private Long version;

    @OneToMany(mappedBy = "headerDetails",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<CfsWareHouseItemInformation> information = new ArrayList<>();

    @OneToMany(mappedBy = "headerDetails",cascade = CascadeType.ALL)
    private List<CfsWareHouseDimensionDetail> dimensionDetail= new ArrayList<>();

    @OneToOne (mappedBy = "information",cascade = CascadeType.ALL)
    private CfsWareHouseCustoms cfsCustoms;

//    @OneToOne(mappedBy = "information",cascade = CascadeType.ALL)
//    private CfsWareHouseMileStone cfsMileStone;

    @OneToOne (mappedBy = "information",cascade = CascadeType.ALL)
    private CfsWareHousePackageDetail cfsPackageDetail;

    @OneToMany(mappedBy = "headerDetails",cascade = CascadeType.ALL)
    private List<CfsWareHouseAttachment> attachments = new ArrayList<>();

    @OneToMany(mappedBy = "headerDetails",cascade = CascadeType.ALL)
    private List<CfsWareHouseShipmentMap> shipmentMap = new ArrayList<>();

    @OneToOne(mappedBy = "information",cascade = CascadeType.ALL)
    private ServiceDetails serviceDetails;

}