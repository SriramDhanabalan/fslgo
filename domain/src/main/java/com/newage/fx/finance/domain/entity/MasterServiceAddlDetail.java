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
@Table(name = "master_service_addl_detail")
public class MasterServiceAddlDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @Column(name = "co_loader_id")
    private Long coLoaderId;

    @Column(name = "co_loader_address_id")
    private Long coLoaderAddressId;

    @Column(name = "cha_id")
    private Long chaId;

    @Column(name = "cha_address_id")
    private Long chaAddressId;

    @Column(name = "notes")
    private String notes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_SERVICE_ADDITIONAL_ID"))
    public MasterHeader masterHeader;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_service_id", foreignKey = @ForeignKey(name = "FK_MASTER_SERVICE_ID"))
    public MasterServiceDetail masterServiceDetail;

    @Version
    @Column(name = "version")
    private Long version;

}