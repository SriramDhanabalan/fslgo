package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Table(name = "nxt_cfs_delivery_header_details")
public class CfsDeliveryHeaderDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "delivery_id", nullable = false, length = 100)
    private String deliveryId;

    @Column(name = "hbl_or_hawb_no", nullable = true, length = 20)
    private String hblOrHawbNo;

    @NotNull
    @Column(name = "customer_id", nullable = false, length = 20)
    private Long customerId;

    @NotNull
    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;

    @Column(name = "do_number", nullable = true, length = 30)
    private String doNumber;

    @Column(name = "do_date", nullable = true)
    private Date doDate;

    @Column(name = "marks_and_numbers", nullable = true, length = 2000)
    private String marksAndNumbers;

    @Column(name = "no_of_grids", nullable = true, length = 20)
    private int noOfGrids;

    @Column(name = "unloading_date", nullable = true)
    private Date unloadingDate;

    @NotNull
    @Column(name = "cfs_id", nullable = false, length = 20)
    private Long cfsId;

    @NotNull
    @Column(name = "cfs_name", nullable = false, length = 100)
    private String cfsName;

    @Column(name = "manifest_hbl_or_hawb_no", nullable = true, length = 30)
    private String manifestHblOrHawbNo;

    @Column(name = "commodity", nullable = true, length = 2000)
    private String commodity;

//    need to implement in shipment future
    @OneToOne
    @JoinColumn(name = "shipment_service_id", foreignKey = @ForeignKey(name = "FK_CFS_DELIVERY_SHIPMENT_SERVICE_ID"))
    private ShipmentServiceDetail shipmentService;

    @OneToMany(mappedBy = "cfsDeliveryHeaderDetails",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CfsDeliveryInfo> cfsDeliveryInfos= new ArrayList<>();

    @OneToMany(mappedBy = "cfsDeliveryHeaderDetails",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CfsDeliveryAttachments> cfsDeliveryAttachments= new ArrayList<>();

    @Version
    @Column(name = "version")
    private Long version;


}
