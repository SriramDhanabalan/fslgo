package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "call_entry_questionnaires_responses")
public class CallEntryQuestionnairesResponsesNxt extends Auditable<String> {

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

    @Column(name = "response_id", nullable = true, length = 20)
    private Long responseId;

    @Column(name = "response", nullable = false, length = 50)
    private String response;

    @ManyToOne()
    @JoinColumn(name = "questionnaire_id", foreignKey = @ForeignKey(name = "fk_call_entry_question_response"))
    private CallEntryQuestionnairesNxt callEntryQuestionnaire;
}
