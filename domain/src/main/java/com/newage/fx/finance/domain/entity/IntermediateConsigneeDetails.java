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
@Table(name = "us_custom_intermediate_consignee")
public class IntermediateConsigneeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "intermediate_consignee_code")
    private String intermediateConsigneeCode;

    @Column(name = "intermediate_consignee_id")
    private Long intermediateConsigneeId;

    @JoinColumn(name = "intermediate_contact_id", foreignKey = @ForeignKey(name = "FK_AES_INTERMEDIATE_CON_ID"))
    @OneToOne(cascade = CascadeType.ALL)
    private UsCustomContactInfoDetails intermediateConsigneeContactInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "consignee_info_id", foreignKey = @ForeignKey(name = "FK_INTERMEDIATE_CONSIGNEE_GENERAL_ID"))
    private ConsigneeDetails consigneeInfo;


}
