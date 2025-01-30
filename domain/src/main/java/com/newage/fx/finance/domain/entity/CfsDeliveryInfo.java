package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_cfs_delivery_info")
public class CfsDeliveryInfo extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "no_of_pieces", nullable = false, length = 20)
    private int noOfPieces;

    @Column(name = "gross_weight_kg", nullable = true, length = 20)
    private double grossWeightKg;

    @Column(name = "volume_weight_kg", nullable = true, length = 20)
    private double volumeWeightKg;

    @Column(name = "truck_no", nullable = true, length = 12)
    private String truckNo;

    @Column(name = "driver_name", nullable = true, length = 25)
    private String driverName;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "time", nullable = false)
    private String time;

    @Column(name = "boe", nullable = true, length = 15)
    private String boe;

    @Column(name = "declaration_no", nullable = true, length = 20)
    private String declarationNo;

    @Column(name = "remarks", nullable = true, length = 4000)
    private String remarks;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "delivery_header_id", foreignKey = @ForeignKey(name = "FK_CFS_DELIVERY_HEADER_ID"))
    public CfsDeliveryHeaderDetails cfsDeliveryHeaderDetails;

    @Version
    @Column(name = "version")
    private Long version;


}
