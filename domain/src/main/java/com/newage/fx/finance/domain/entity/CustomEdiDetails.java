package com.newage.fx.finance.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_custom_edi")
public class CustomEdiDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "no_of_instalment")
    Long noOfInstalment;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "master_shipment_id", foreignKey = @ForeignKey(name = "FK_MASTER_SHIPMENT_ID"))
    private MasterHeader masterHeader;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customEdiDetails", cascade = CascadeType.ALL)
    private List<CustomEdiGeneratedFileDetails> customEdiFileDetails = new ArrayList<>();

}