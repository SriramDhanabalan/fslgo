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
@Table(name = "us_custom_freight_forwarder")

public class FreightForwarderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "freight_forwarder_id")
    private Long freightForwarderid;

    @Column(name = "forwarder_id_type")
    private String forwarderIdType;

    @Column(name = "forwarder_id_number")
    private String forwarderIdNumber;

    @JoinColumn(name = "forwarder_contact_id", foreignKey = @ForeignKey(name = "FK_AES_FORWARDER_ID"))
    @OneToOne(cascade = CascadeType.ALL)
    private UsCustomContactInfoDetails forwarderContactInfo;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "general_Info_id", foreignKey = @ForeignKey(name = "FK_FORWARDER_GENERAL_ID"))
    private GeneralInfoAesCustomDetails generalInfo;

}
