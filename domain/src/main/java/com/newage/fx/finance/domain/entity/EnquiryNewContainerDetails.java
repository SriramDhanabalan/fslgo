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
@Table(name = "enquiry_container_details")
public class EnquiryNewContainerDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*Container Master id*/
    @Column(name = "container_id")
    private Long containerId;

    @Column(name = "cfs_terminal_id")
    private  Long cfsTerminalId;

    /*No of Container*/
    @Column(name = "no_of_container")
    private Integer noOfContainer;

    @Column(name = "container_no")
    private String containerNo;

    @Column(name = "container_type",nullable = true)
    private String containerType;

    @Column(name = "cfs_terminal_name")
    private String cfsTerminalName;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private long slNo;

    @Column(name = "notes", nullable = true)
    private String note;

    @Column(name = "expected_date")
    private Date expectedArrivalTime;

    @Column(name = "planned_date")
    private Date plannedArrivalTime;

    @Column(name = "time_slot")
    private String timeSlot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_CONTAINER_DETAILS_ID"))
    public EnquiryHeader enquiryDetail;

}
