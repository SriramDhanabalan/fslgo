package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "call_entry_questionnaires")
public class CallEntryQuestionnairesNxt extends Auditable<String> {

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

    @Column(name = "questionnaire_id")
    private Long questionnaireId;

    @NotNull
    @Column(name = "note", nullable = false)
    private String note;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "callEntryQuestionnaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CallEntryQuestionnairesResponsesNxt> callEntryQuestionnaireResponsesList = new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "call_entry_id", foreignKey = @ForeignKey(name = "fk_call_entry_header"))
    private CallEntryHeaderNxt callEntryHeader;
}
