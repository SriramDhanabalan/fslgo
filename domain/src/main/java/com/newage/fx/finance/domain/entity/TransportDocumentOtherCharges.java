package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Freight;
import com.newage.fx.finance.domain.enums.MAWBCharges;
import com.newage.fx.finance.domain.enums.TransportDocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transport_document_other_charges")
public class TransportDocumentOtherCharges extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "other_charge_id", nullable = true)
    private Long otherChargeId;

    @Column(name = "other_charge", nullable = true)
    private String otherChargeName;

    @Column(name = "unit_id", nullable = true)
    private  Long  unitId;

    @Column(name = "unit_code", nullable = true)
    private  String  unitCode;

    @Column(name = "currency_id", nullable = true)
    private  Long  currencyId;

    @Column(name = "currency_code", nullable = true)
    private  String  currencyCode;

    @Column(name = "per_unit", nullable = true)
    private double perUnit;

    @Column(name = "local_amt", nullable = true)
    private String localAmount;

    @Column(name = "due", nullable = true, length = 20)
    @Enumerated(EnumType.STRING)
    private MAWBCharges due;

    @Column(name = "pp_or_cc", length = 20 ,nullable = true)
    @Enumerated(EnumType.STRING)
    private Freight ppOrCc;

    @Column(name = "prepaid_amt")
    private Double prepaidAmount;

    @Column(name = "collect_amt")
    private Double collectAmount;

    @Column(name = "source_type", length = 100)
    @Enumerated(EnumType.STRING)
    private TransportDocumentType sourceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public TransportDocumentAir transportDocumentAir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public TransportDocumentOcean transportDocumentOcean;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public MasterTransportDocumentAir masterTransportDocumentAir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public MasterTransportDocumentOcean masterTransportDocumentOcean;
}
