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
@Table(name = "us_custom_ultimate_consignee")
public class UltimateConsigneeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ultimate_consignee_id")
    private Long ultimateConsigneeId;

    @Column(name = "consignee_type")
    private String consigneeType;

    @Column(name = "consignee_id_type")
    private String consigneeIdType;

    @Column(name = "consignee_id")
    private Long consigneeId;

    @JoinColumn(name = "ultimate_contact_id", foreignKey = @ForeignKey(name = "FK_AES_ULTIMATE_CON_ID"))
    @OneToOne(cascade = CascadeType.ALL)
    private UsCustomContactInfoDetails consigneeContactInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "consignee_info_id", foreignKey = @ForeignKey(name = "FK_ULTIMATE_CONSIGNEE_GENERAL_ID"))
    private ConsigneeDetails consigneeInfo;
  /*  private UsCustomContactInfoDetails intermediateConsigneeContactInfo;*/

}
