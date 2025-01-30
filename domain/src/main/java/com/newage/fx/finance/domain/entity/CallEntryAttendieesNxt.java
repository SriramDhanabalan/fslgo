package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "call_entry_attendees")
public class CallEntryAttendieesNxt extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "group_company_id", length = 20)
    private Long groupCompanyId;

    @Column(name = "company_entity_id", length = 20)
    private Long companyId;

    @Column(name = "branch_id", length = 20)
    private Long branchId;

    @Column(name = "sl_no")
    private Long slNo;

    @NotNull(message = "Accepted Values ( Mr, Ms, Mrs)")
    @Column(name = "salutation", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private Salutation salutation;

    @Column(name = "first_name", nullable = false, length = 60)
    private String firstName;

    @Column(name = "last_name", nullable = true, length = 60)
    private String lastName;

    @Column(name = "designation_id", nullable = true, length = 20)
    private Long designationId;

    @Column(name = "designation_name", nullable = true, length = 60)
    private String designationName;

    @Column(name = "pre_office_no", nullable = true, length = 10)
    private String preOfficeNo;

    @Column(name = "office_phone_no", nullable = true, length = 100)
    private String officePhoneNo;

    @NotNull(message = "Accepted Values (Yes, No)")
    @Column(name = "primary_contact", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo primaryContact;

    @NotNull(message = "Accepted Values (Yes, No)")
    @Column(name = "decision_maker", nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private YesNo decisionMaker;

    @Column(name = "pre_mobile_no", nullable = true, length = 10)
    private String preMobileNo;

    @Column(name = "mobile_no", nullable = true, length = 100)
    private String mobileNo;

    @Column(name = "email", nullable = true, length = 100)
    private String email;

    @Column(name = "department_id", nullable = true, length = 20)
    private Long departmentId;

    @Column(name = "department", nullable = true, length = 30)
    private String department;

    @Column(name = "customer_contact_id", nullable = true, length = 20)
    private Long customerContactId;

    @ManyToOne()
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_header"))
    private CallEntryHeaderNxt callEntryHeader;
}
