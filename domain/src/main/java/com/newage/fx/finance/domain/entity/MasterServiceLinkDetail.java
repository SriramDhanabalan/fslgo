package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;

@Valid
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_service_link_detail", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"shipment_service_id"}, name = "UK_SHIPMENT_SERVICE_ID")})
public class MasterServiceLinkDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "master_id", length = 20)
    public Long masterHeaderId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "master_service_id", foreignKey = @ForeignKey(name = "FK_MASTER_SERVICE_ID"))
    public MasterServiceDetail masterServiceDetail;

    @Column(name = "shipment_id", length = 20)
    public Long shipmentId;

    @OneToOne(fetch = FetchType.EAGER)
    @Valid
    @JoinColumn(name = "shipment_service_id", foreignKey = @ForeignKey(name = "FK_SHIPMENT_SERVICE_ID"))
    public ShipmentServiceDetail shipmentService;

    @Column(name = "service_group_company_id")
    private Long serviceGroupCompanyId;

    @Column(name = "service_company_id")
    private Long serviceCompanyId;

    @Column(name = "service_branch_id")
    private Long serviceBranchId;

    @Version
    @Column(name = "version")
    private Long version;

}