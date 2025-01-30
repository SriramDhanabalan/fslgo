package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.Validation.MasterValidation;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ServiceMode;
import com.newage.fx.finance.domain.enums.TransportMode;
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
@Table(name = "master_routing_detail")
public class MasterRoutingDetail extends Auditable<String> {

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


    @Column(name = "from_id")
    private Long fromPortId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "from_name")
    private String fromPortName;

    @Column(name = "to_id")
    private Long toPortId;

    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "to_name")
    private String toPortName;
    @NotNull(groups = {MasterValidation.class}, message = "can not be null")

    @Column(name = "etd", nullable = true)
    private Date etd;
    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "eta", nullable = true)
    private Date eta;
    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "atd", nullable = true)
    private Date atd;
    @NotNull(groups = {MasterValidation.class}, message = "can not be null")
    @Column(name = "ata", nullable = true)
    private Date ata;

    @Column(name = "transporter_mode", nullable = false)
    @Enumerated(EnumType.STRING)
    private TransportMode transportMode;

    @Column(name = "transporter_id")
    private Long transporterId;

    @Column(name = "transporter_name")
    private String transporterName;

    @Column(name = "transport_route_no")
    private String transporterRouteNo;

    @Column(name = "status")
    private String status;

    @Column(name = "routing_mode", nullable = false)
    @Enumerated(EnumType.STRING)
    private ServiceMode routingMode;

    @Column(name = "notes")
    private String notes;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "master_id", foreignKey = @ForeignKey(name = "FK_MASTER_HEADER_ID"))
    public MasterHeader masterHeader;

    @Version
    @Column(name = "version")
    private Long version;

}