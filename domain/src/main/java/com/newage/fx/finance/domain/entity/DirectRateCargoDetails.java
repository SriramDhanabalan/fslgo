package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.DimensionUnit;
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
@Table(name = "efs_direct_rate_cargo_details")
public class DirectRateCargoDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* hazardus */
    @Column(name = "hazardus", nullable = false, length = 10)
    private boolean hazardus;

    /* Dimension Unit */
    @Column(name = "dimension_unit", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private DimensionUnit dimensionUnit;

    @OneToMany(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
    private List<DirectRateDimensionDetails> dimensionDetails;

    @OneToOne(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
    DirectRatePackageDetails packageDetails;

    @OneToMany(mappedBy = "cargoDetails", cascade = CascadeType.ALL)
    private List<DirectRateRequestContainerDetails> directRateRequestContainerDetails = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "header_detail_id", foreignKey = @ForeignKey(name = "FK_DIRECTRATE_HEADERID"))
    DirectRateRequestHeader requestHeader;

    @Version
    @Column(name = "version")
    private Long version;
}
