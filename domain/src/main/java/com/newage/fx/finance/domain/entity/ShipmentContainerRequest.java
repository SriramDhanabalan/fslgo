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
@Table(name = "shipment_container_request_detail")
public class ShipmentContainerRequest extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @Column(name = "container_id", length = 20)
    private Long containerId;

    @Column(name = "container_code", length = 20)
    private String containerCode;

    @Column(name = "container_type", length = 20)
    private String containerName;

    @Column(name = "no_of_container", length = 20)
    private int noOfContainer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipment_id", foreignKey = @ForeignKey(name = "FK_MASTER_RATES_DETAIL_ID"))
    public ShipmentHeader shipmentHeader;
}