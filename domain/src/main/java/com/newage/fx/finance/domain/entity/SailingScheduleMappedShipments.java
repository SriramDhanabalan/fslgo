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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_sailing_schedule_mapped_shipment")
public class SailingScheduleMappedShipments extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_SCHEDULE_SHIPMENT_HEADER_ID"))
    public ShipmentHeader shipmentHeader;

    @ManyToOne
    @JoinColumn(name = "schedule_id", foreignKey = @ForeignKey(name = "FK_SCHEDULE_HEADER_ID"))
    public SailingScheduleHeaderDetails headerDetails;

    @Version
    @Column(name = "version")
    private Long version;

}