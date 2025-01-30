package com.newage.fx.finance.domain.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "efs_work_flow_master")
public class WorkFlowMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "workflow_code", length = 10)
    String workflowCode;

    @Column(name = "workflow_name")
    String workflowName;

}