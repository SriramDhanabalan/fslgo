package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
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
@Table(name = "tax_charge_service_mapping")
public class TaxChargeServieMappingDetails extends Auditable<String> {

    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "charge_id")
    private Long chargeId;

    @Column(name = "service_id")
    private Long serviceId;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "tax_id", foreignKey = @ForeignKey(name = "FK_TAX_MASTER_ID"))
    public TaxMaster taxMaster;
}


