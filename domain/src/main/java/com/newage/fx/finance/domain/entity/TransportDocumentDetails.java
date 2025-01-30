package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.TransportDocumentType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transport_document_details")
public class TransportDocumentDetails extends Auditable<String> {

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

    @Column(name = "source_type", length = 100)
    @Enumerated(EnumType.STRING)
    private TransportDocumentType sourceType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public TransportDocumentAir transportDocumentAir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public TransportDocumentOcean transportDocumentOcean;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    public MasterTransportDocumentAir masterTransportDocumentAir;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id", foreignKey = @ForeignKey(name = "FK_TRANSPORT_DOCUMENT_ID"),insertable = false,updatable = false)
    private MasterTransportDocumentOcean masterTransportDocumentOcean;

    @Column(name = "transport_document_sl_no", length = 20)
    private Long transportDocumentSlNo;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "execution_date", nullable = true, length = 1000)
    private Date executionDate;

    @Column(name = "execution_place_id", nullable = true, length = 1000)
    private Long executionPlaceId;

    @Column(name = "execution_place_name", nullable = true, length = 1000)
    private String executionPlaceName;

    @Column(name = "sign_of_shipper", nullable = true, length = 1000)
    private String signOfShipper;

    @Column(name = "sign_of_carrier", nullable = true, length = 1000)
    private String signOfCarrier;

    @Column(name = "drafted_date")
    private Date draftDate;

    @Column(name = "confirmed_date")
    private Date confirmedDate;

}
