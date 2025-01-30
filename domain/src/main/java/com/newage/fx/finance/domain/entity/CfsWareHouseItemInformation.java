package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_item_information")
public class CfsWareHouseItemInformation extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Column(name = "description", nullable = false, length = 2000)
    private String description;

    @Column(name = "shipping_billing_no", nullable = true, length = 30)
    private String shippingBillingNo;

    @Column(name = "shipping_billing_date", nullable = true)
    private Date shippingBillingDate;

    @Column(name = "shipping_invoice_no", nullable = true, length = 30)
    private String shippingInvoiceNo;

    @Column(name = "pack_id", nullable = false, length = 20)
    private Long packId;

    @Column(name="pack_name",nullable = false,length = 100)
    private String packName;

    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private Integer noOfPieces;

    @Column(name = "gross_weight", nullable = false, length = 20)
    private Double grossWeight;

    @Column(name = "volume_weight", nullable = false, length = 20)
    private Double volume;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne()
    @JoinColumn(name = "header_details_id",foreignKey = @ForeignKey(name="FK_CFS_WAREHOUSE_HEADERID"))
    CfsWareHouseHeaderDetails headerDetails;

}
