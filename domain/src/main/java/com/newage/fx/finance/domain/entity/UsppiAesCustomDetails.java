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
@Table(name = "us_custom_usppi_aes")
public class UsppiAesCustomDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "shipper_id")
    private Long shipperId;

    @Column(name = "shipper_id_type")
    private String shipperIdType;

    @Column(name = "shipper_id_number")
    private Long shipperIdNumber;

    @JoinColumn(name = "usppi_contact_id", foreignKey = @ForeignKey(name = "FK_AES_USPPI_ID"))
    @OneToOne(cascade = CascadeType.ALL)
    private UsCustomContactInfoDetails usspiContatInfo;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "general_Info_id", foreignKey = @ForeignKey(name = "FK_USPPI_GENERAL_ID"))
    private GeneralInfoAesCustomDetails generalInfo;
}
