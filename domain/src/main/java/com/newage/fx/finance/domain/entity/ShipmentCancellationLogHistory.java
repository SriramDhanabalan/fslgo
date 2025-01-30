package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ShipmentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shipment_cancellation_log_history")
public class ShipmentCancellationLogHistory extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @NotEmpty
    @Column(name = "shipment_no", nullable = false, length = 20)
    private String shipmentNo;

    @NotNull
    @Column(name = "status", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ShipmentStatus status;

    @ManyToOne
    @JoinColumn(name = "shipment_service_detail_id", foreignKey = @ForeignKey(name = "FK_LOG_HISTORY_SHIPMENT_TABLE_ID"))
    ShipmentServiceDetail shipmentService;

    @ManyToOne
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_LOG_HISTORY_SHIPMENT_TABLE_ID1"))
    ShipmentHeader shipmentService1;

    @Column(name = "created_by", nullable = false)
    private String created;

    @Column(name = "updated_by", nullable = false)
    private String  modified;

    @Column(name = "reason_id",nullable = false)
    private Long reasonId;

    @Column(name = "reason_name",nullable = false)
    private String reasonName;

   @Column(name = "remark",nullable = false)
   private String remark;

    @Version
    @Column(name = "version")
    private Long version;
}
