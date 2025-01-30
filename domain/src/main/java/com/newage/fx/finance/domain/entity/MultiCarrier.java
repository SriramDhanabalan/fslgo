package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "multi_carrier")
public class MultiCarrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "container_id")
    private Long containerId;

    @Column(name = "container_name")
    private String containerName;

    @Column(name = "sell")
    private Long sell;

    @Column(name = "cost")
    private Long cost;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "charge_id", foreignKey = @ForeignKey(name = "FK_CHARGE_ID"))
    private EnquiryChargeDetailsNew enquiryChargeDetailsNew;
}
