package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = false)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_report_detail")
public class WebReportDetail extends Auditable<String>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name = "create_user")
    private String createUser;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "run_user")
    private String runUser;

    @Column(name = "run_date")
    private Date runDate;

    @Column(name = "report_id")
    private String reportId;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "report_script")
    private String reportScript;





}