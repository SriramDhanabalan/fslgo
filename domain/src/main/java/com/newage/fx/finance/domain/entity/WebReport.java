package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_report")
public class WebReport extends Auditable<String>{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "user_id")
    private String userId;

    @Column(name = "sl_no")
    private Integer slNo;

    @Column(name = "report_id")
    private String reportId;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "run_date")
    private Date runDate;

    @Column(name = "daily")
    private String daily;

    @Column(name = "weekly")
    private String weekly;

    @Column(name = "monthly")
    private String monthly;

    @Column(name = "filter")
    private String filter;

    @Column(name = "days")
    private String days;

    @Column(name = "days_flag")
    private String daysFlag;

    @Column(name = "status")
    private String status;

    @Column(name = "email")
    private String email;

    @Column(name = "export_import")
    private String exportImport;

    @Column(name = "transport_mode")
    private String transportMode;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "email_bcc")
    private String emailBcc;

    @Column(name = "filter_override")
    private String filterOverride;

    @Column(name = "stage")
    private String stage;

    @Column(name = "shipment_status")
    private String shipmentStatus;

    @Column(name = "filter_addon")
    private String filterAddon;

    @Column(name = "lcl_fcl_air")
    private String lclFclAir;

    @Column(name = "registration_no")
    private String registrationNo;

    @Column(name = "is_default")
    private String isDefault;

    @Column(name = "auto_report_type")
    private String autoReportType;

    @Column(name = "chart_type")
    private String chartType;

    @Column(name = "graph_counts")
    private Integer graphCounts;

    @Column(name = "menu_type")
    private String menuType;

    @Column(name = "menu_lov_status")
    private String menuLovStatus;

    @Column(name = "default_value")
    private String defaultValue;

    @Column(name = "preset_name")
    private String presetName;




//    @ManyToOne
//    @JoinColumn(name = "registration_no", foreignKey = @ForeignKey(name = "FK_USER_MASTER_ID"))
//    public UserMaster userMaster;
//
//    @OneToMany(mappedBy = "webUserDetail", cascade = CascadeType.ALL)
//    private List<ShipmentHeader> shipmentHeaderList = new ArrayList<>();

}