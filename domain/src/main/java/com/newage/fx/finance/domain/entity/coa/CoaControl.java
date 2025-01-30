package com.newage.fx.finance.domain.entity.coa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Where(clause = "deleted <> true ")
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "coa_control")
public class CoaControl extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id")
    private Long groupCompanyId;

    @Column(name = "coa_header_id")
    private Long coaHeaderId;

    @Column(name = "coa_group_id")
    private Long coaGroupId;

    @Column(name = "coa_subgroup_id")
    private Long coaSubGroupId;

    @Column(name = "control_account_id")
    private Long controlAccountId;

    @Column(name = "account_uid")
    private Long accountUid;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "status")
    private String status;

    @Column(name = "notes")
    private String notes;

    @Column(name = "deleted")
    boolean deleted = false;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coaControl", cascade = CascadeType.ALL)
    private List<CoaControlDetail> coaControlDetails = new ArrayList();

}
