package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tax_percentage_detail")
public class TaxPercentageDetail extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

/*    @Column(name = "tax_id")
    private Long taxId;*/

    @Column(name = "percentage")
    private Long percentage;

    @Column(name = "effective_from")
    private Date effectiveFrom;

    @Column(name = "payable_account_id")    //subledger- y -- subledger master  - subledger + acc.id (if subledger - n only accn id)
    private Long payableAccountId;

    @Column(name = "receivable_account_id")
    private Long receivableAccountId;

    @Column(name = "Status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "tax_id", foreignKey = @ForeignKey(name = "FK_TAX_MASTER_ID"))
    public TaxMaster taxMaster;
}
