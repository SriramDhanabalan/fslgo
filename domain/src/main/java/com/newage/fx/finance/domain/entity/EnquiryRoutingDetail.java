package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;

import com.newage.fx.finance.domain.enums.ShipmentConnectionsStatus;
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
@Table(name = "enquiry_routing_detail")
public class EnquiryRoutingDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "company_id", length = 20)
    private Long companyId;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no", length = 20)
    private Long slNo;

    @NotNull
    @Column(name = "from_id", nullable = false, length = 20)
    private Long fromPortId;


    @Column(name = "from_name",  length = 100)
    private String fromPortName;

    @NotNull
    @Column(name = "to_id", nullable = false, length = 20)
    private Long toPortId;


    @Column(name = "to_name", length = 100)
    private String toPortName;

    @NotNull
    @Column(name = "etd", nullable = false)
    private Date etd;

    @NotNull
    @Column(name = "eta", nullable = false)
    private Date eta;

    @Column(name = "atd", nullable = true)
    private Date atd;

    @Column(name = "ata", nullable = true)
    private Date ata;

    @NotNull
    @Column(name = "transporter_mode", nullable = false, length = 20)
    private TransportMode move ;

    @NotNull
    @Column(name = "transporter_id", nullable = false, length = 20)
    private Long carrierOrVesselId;


    @Column(name = "transporter_name",  length = 100)
    private String carrierOrVesselName;

    @NotNull
    @Column(name = "transport_route_no", nullable = false, length = 20)
    private String voyageOrflightNo;

    @NotNull
    @Column(name = "status", nullable = false, length = 20)
    private ShipmentConnectionsStatus status;

    @Column(name = "notes")
//    @Lob
    private String notes;

    @ManyToOne
    @JoinColumn(name = "enquiry_id", foreignKey = @ForeignKey(name = "FK_ENQUIRY_DETAILS_ENQUIRY_ID"))
    public EnquiryHeader enquiryHeader;
}
