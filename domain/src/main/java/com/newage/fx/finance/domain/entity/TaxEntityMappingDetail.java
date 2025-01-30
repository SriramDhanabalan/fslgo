package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tax_entity_mapping_detail")
public class TaxEntityMappingDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_id")
    private Long companyId;

    @Column(name = "branch_id")
    private Long branchId;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "tax_id", foreignKey = @ForeignKey(name = "FK_TAX_MASTER_ID"))
    public TaxMaster taxMaster;
}
