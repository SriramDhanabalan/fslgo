package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquiry_service_addl_detail")
public class EnquiryServiceAddlDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20,nullable = true)
    private Long companyId;

    @Column(name = "country_id", length = 20,nullable = true)
    private Long countryId;

    @Column(name = "group_company_id", length = 20,nullable = true)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20,nullable = true)
    private Long branchId;

    @Column(name = "enquiry_no", nullable = true, length = 20)
    private String enquiryNo;

    @Column(name = "enquiry_id", length = 100,nullable = true)
    private Long enquiryId;

    @Column(name = "enquiry_service_uid", length = 100,nullable = true)
    private String enquiryServiceUid;

    @Column(name = "customer_order_no", length = 20)
    private Long customerOrderNo;

    @Column(name = "shipper_name", length = 100)
    private String shipperName;

    @Column(name = "consignee_name", length = 100)
    private String consigneeName;

    @Column(name = "notes")
    @Lob
    private String notes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_SERVICE_ADD_DETAIL"))
    private EnquiryHeader enquiryDetail;
}
