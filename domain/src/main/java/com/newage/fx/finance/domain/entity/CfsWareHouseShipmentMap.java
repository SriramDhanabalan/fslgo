package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_map_shipment")

public class CfsWareHouseShipmentMap extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "shipment_servicee_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_SERVICEE_ID"))
    private ShipmentServiceDetail shipmentService;

    @Version
    @Column(name = "version")
    private Long version;

    @ManyToOne()
    @JoinColumn(name = "header_details_id",foreignKey = @ForeignKey(name="FK_CFS_WAREHOUSE_MAP_SHIPMENT_HEADERID"))
    CfsWareHouseHeaderDetails headerDetails;


}
