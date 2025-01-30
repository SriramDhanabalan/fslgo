package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "master_carrier_detail")
public class MasterCarrier extends Auditable<String> {

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

    @Column(name = "carrier_id")
    private Long carrierId;

    @Column(name = "sail_id")
    private Long sailId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "carrier_name")
    private String carrierName;

    @Column(name = "vessel_id")
    private Long vesselId;

    @Column(name = "vessel_name")
    private String vesselName;

    @Column(name = "notes")
    private String notes;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "route_no")
    private String routeNo;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")

    @Column(name = "master_no")
    private String masterNo;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "master_date")
    private Date masterDate;

    @Column(name = "master_do_no")
    private Long masterDoNo;

//    @Column(name = "flight_number")
//    private String flightNumber;

    @Column(name = "carrier_booking_no")
    private String carrierBookingNo;

    @Column(name = "carrier_booking_date")
    private Date carrierBookingDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader    ;

    @Version
    @Column(name = "version")
    private Long version;

}