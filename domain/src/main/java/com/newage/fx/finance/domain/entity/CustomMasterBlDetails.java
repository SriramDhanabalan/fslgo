package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_custom_master_bl_details")
public class CustomMasterBlDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vcn")
    private String vcn;

    @Column(name = "obl_no")
    private String oblNo;

    @Column(name = "obl_date")
    private Date oblDate;

    @Column(name = "bl_type")
    private String blType;

    @Column(name = "custom_house")
    private String customHouse;

    @Column(name = "pieces")
    private String pieces;

    @Column(name = "piece_type")
    private String pieceType;

    @Column(name = "gross_weight")
    private Double grossWeight;

    @Column(name = "volume")
    private Double volume;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "master_shipment_id", foreignKey = @ForeignKey(name = "FK_MASTER_SHIPMENT_ID"))
    private MasterHeader masterHeader;
}
