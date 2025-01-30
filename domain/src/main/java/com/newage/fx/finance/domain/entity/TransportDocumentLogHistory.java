package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.TransportDocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transport_document_log_history")
public class TransportDocumentLogHistory extends Auditable<String> {

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

    @Column(name = "action", nullable = false)
    private String action;

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
