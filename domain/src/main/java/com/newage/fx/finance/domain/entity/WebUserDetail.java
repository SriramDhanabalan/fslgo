package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "web_user_detail")
public class WebUserDetail extends Auditable<String>{


    @Id
    @Column(name = "sl_no")
    private Integer slNo;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "customer_code",length = 20)
    private String customerCode;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "code_type")
    private String codeType;

    @Column(name = "is_primary")
    private String isPrimary;

    @Column(name = "company_code")
    private String companyCode;

    @Column(name = "location_code")
    private String locationCode;

    @Column(name = "project_code")
    private String projectCode;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "auto_invoice_no")
    private String autoInvoiceNo;

    @Column(name = "nxt_customer_id")
    private long nxtCustomerId;

    @ManyToOne
    @JoinColumn(name = "registration_no", foreignKey = @ForeignKey(name = "FK_USER_MASTER_ID"))
    public UserMaster userMaster;

    @OneToMany(mappedBy = "webUserDetail", cascade = CascadeType.ALL)
    private List<ShipmentHeader> shipmentHeaderList = new ArrayList<>();

}