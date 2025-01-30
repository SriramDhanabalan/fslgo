package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "enquiry_addl_detail")
public class EnquiryAddlDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_entity_id", length = 20, nullable = true)
    private Long companyId;

    @Column(name = "country_id", length = 20, nullable = true)
    private Long countryId;

    @Column(name = "group_company_id", length = 20, nullable = true)
    private Long groupCompanyId;

    @Column(name = "enquiry_no", nullable = false, length = 20)
    private String enquiryNo;

    @Column(name = "branch_id", length = 20, nullable = true)
    private Long branchId;

//    @Column(name = "enquiry_id", length = 100,nullable = true)
//    private Long enquiryId;

    @Column(name = "notes", nullable = true)
    private String notes;

    @Column(name = "planned_carrier_id", length = 20)
    private Long carrierId;

    @Column(name = "planned_vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "planned_route_no", length = 20)
    private String voyageOrflightNo;

    @Column(name = "planned_schedule_id", length = 20)
    private Long plannedScheduleId;

    @Column(name = "etd", nullable = true)
    private Date etd;

    @Column(name = "eta", nullable = true)
    private Date eta;

    @OneToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_ADD_DETAIL"))
    private EnquiryHeader enquiryDetail;
}
