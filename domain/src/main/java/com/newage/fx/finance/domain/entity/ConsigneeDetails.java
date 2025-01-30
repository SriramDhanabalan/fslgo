package com.newage.fx.finance.domain.entity;

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
@Table(name = "us_custom_consignee_details")
public class ConsigneeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "consigneeInfo", cascade = CascadeType.ALL)
    private UltimateConsigneeDetails ultimateConsignee;

    @OneToOne(mappedBy = "consigneeInfo", cascade = CascadeType.ALL)
    private IntermediateConsigneeDetails intermediateConsignee;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", foreignKey = @ForeignKey(name = "FK_CONSIGNEE_GENERAL_ID"))
    private GeneralInfoAesCustomDetails generalInfo;

}
