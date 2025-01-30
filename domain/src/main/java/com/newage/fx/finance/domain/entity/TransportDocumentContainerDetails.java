package com.newage.fx.finance.domain.entity;



import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "transport_document_container_details")
public class TransportDocumentContainerDetails extends Auditable<String> {

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id", insertable = false, updatable = false)
    public TransportDocumentOcean transportDocumentOcean;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_document_id")
    public MasterTransportDocumentOcean masterTransportDocumentOcean;

    @Column(name = "transport_document_sl_no", length = 20)
    private Long transportDocumentSlNo;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "container_details", length = 300)
    private String containerDetails;

    @Column(name = "no_of_packages")
    private Integer noOfPackage;

    @Column(name = "gross_weight")
    private String grossWeight;

    @Column(name = "measurement")
    private String measurement;

    @Column(name = "description")
    private String description;


}
