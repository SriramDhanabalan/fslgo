package com.newage.fx.finance.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.RateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_enquiry_rate_request")
public class CreateRateRequest extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Accepted Values (AGENT,CARRIER,WAREHOUSE,TRANSPORTER,COMMERCIAL TEAM)")
    @Column(name = "rate_request_to")
    @Enumerated(EnumType.STRING)
    private RateRequest rateRequestTo;

    //@NotNull(message = "Please enter the agent id")
    @Column(name = "agent_id", nullable = false, length = 20)
    Long agentId;

    @Column(name = "customer_id", nullable = false, length = 20)
    Long customerId;

    @Column(name = "employee_id", nullable = false, length = 20)
    Long employeeId;

    @Column(name = "name", length = 100)
    String name;

    @Column(name = "to_email_id", length = 500)
    String emailId;

    @NotNull
    @Column(name = "cc_mail_id", length = 500)
    @Size(message = "CC Email id has to be separated by semicolon")
    @Pattern(regexp = "^$|(.+)@(\\S+)$", message = "Enter valid email id")
    String ccMailId;

    @ManyToOne
    @JoinColumn(name = "rate_req_id", foreignKey = @ForeignKey(name = "FK_RATE_REQUEST"))
    @JsonManagedReference
    DirectRateRequestHeader rateRequestHeader;

    @OneToMany(mappedBy = "rateRequest", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<RateRequestChargeUpdate> chargeUpdate = new ArrayList<>();

    @Version
    @Column(name = "version")
    private Long version;
}
