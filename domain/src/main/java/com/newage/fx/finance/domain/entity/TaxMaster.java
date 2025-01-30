package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tax_master")
public class TaxMaster extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id")
    private Long groupCompanyId;

    @Column(name = "country_id")
    private Long countryId;

    @Column(name ="code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "taxability")
    private String taxability;

    @OneToMany(mappedBy = "taxMaster", cascade = CascadeType.ALL)
    private List<TaxPercentageDetail> taxPercentageDetails = new ArrayList<>();

    @OneToMany(mappedBy = "taxMaster", cascade = CascadeType.ALL) // rename to company mapping
    private List<TaxEntityMappingDetail> taxEntityMappingDetails = new ArrayList<>();

    @OneToMany(mappedBy = "taxMaster", cascade = CascadeType.ALL)
    private List<TaxChargeServieMappingDetails> taxChargeServiceMapping = new ArrayList<>();

}
