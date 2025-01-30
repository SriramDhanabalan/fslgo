package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ImportExport;
import com.newage.fx.finance.domain.enums.JointCallStatus;
import com.newage.fx.finance.domain.enums.RequestFor;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_direct_rate_request_header")
public class DirectRateRequestHeader extends Auditable<String> {

    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*Rate Request No*/
    @NotNull
    @NotEmpty
    @Column(name = "rate_request_no", nullable = false, length = 20)
    private String rateRequestNo;

    @NotNull
    @CreatedDate
    @Column(name = "rate_request_date", nullable = false)
    private Date rateRequestDate;

    @Column(name = "service_code", nullable = false, length = 10)
    private String serviceCode;

    @Column(name = "trade_code", nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private ImportExport tradeCode;

    @NotNull
    @Column(name = "service_id", nullable = false, length = 20)
    private Long serviceId;

    @Column(name = "service_name", nullable = false, length = 100)
    private String serviceName;

    @NotNull
    @Column(name = "origin_id", nullable = false, length = 20)
    private Long originId;

    @Column(name = "origin_name", nullable = false, length = 100)
    private String originName;

    @NotNull
    @Column(name = "destination_id", nullable = false, length = 20)
    private Long destinationId;

    @Column(name = "destination_name", nullable = false, length = 100)
    private String destinationName;

    @NotNull
    @Column(name = "tos_id", nullable = false, length = 20)
    private Long tosId;

    @Column(name = "tos_name", nullable = false, length = 100)
    private String tosName;

    @Column(name = "pickup_required", nullable = false, length = 10)
    private boolean pickupRequired;

    @Column(name = "delivery_required", nullable = false, length = 10)
    private boolean deliveryRequired;

    @Column(name = "pickup_place", nullable = true, length = 10)
    private String pickupPlace;

    @Column(name = "delivery_place", nullable = true, length = 10)
    private String deliveryPlace;

    @Column(name = "request_for", nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private RequestFor requestFor;

    // Need to Implement these columns once RBAC ready
   /*
   @Column(name = "branch_id")
    private Long branchId;
    
    @Column(name = "user_id")
    private Long userId;
     */

    @OneToMany(mappedBy = "rateRequestHeader", cascade = CascadeType.ALL)
    private List<DirectRateRequestCarrierDetail> carrier = new ArrayList<>();

    @OneToOne(mappedBy = "requestHeader", cascade = CascadeType.ALL)
    DirectRateCargoDetails cargoDetails;

    @OneToMany(mappedBy = "rateRequestHeader", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CreateRateRequest> rateRequests = new ArrayList<>();

    @OneToMany(mappedBy = "rateRequestHeader", cascade = CascadeType.ALL)
    private List<DirectAddRateDetails> directAddRateDetails = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "enquiry_rate_request_id", foreignKey = @ForeignKey(name = "FK_ENQUIRY_TO_RATE_REQ_ID"))
    public EnquiryHeader enquiryHeader;

    @Column(name = "enquiry_created") //check bro
    @Enumerated(EnumType.STRING)
    private YesNo enquiryCreated = YesNo.No;

    @Column(name = "emp_name", nullable = true, length = 100)
    private String employeeName;

    @Column(name = "email_id", nullable = true, length = 100)
    private String emailId;

    @Column(name = "phone_no", nullable = true, length = 100)
    private String phoneNo;

    @Column(name = "designation_name", nullable = true, length = 100)
    private String designationName;

    @Column(name = "status_mail", nullable = false, length = 8)
    @Enumerated(EnumType.STRING)
    private JointCallStatus jointCallStatus;


    @Version
    @Column(name = "version")
    private Long version;

}
