package com.newage.fx.finance.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "efs_work_flow_mapping")
public class WorkFlowMasterScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "screen_name", length = 10)
    String screenName;

    @Column(name = "product_name")
    String productName;

    @ManyToOne
    @JoinColumn(name = "tos_id", foreignKey = @ForeignKey(name = "FK_WORK_FLOW_SCREEN_TOS_ID"))
    TosMaster tos;

    @OneToOne
    @JoinColumn(name = "workflow_id", foreignKey = @ForeignKey(name = "FK_WORK_FLOW_SCREEN_ID"))
    WorkFlowMaster workFlowMaster;
}
