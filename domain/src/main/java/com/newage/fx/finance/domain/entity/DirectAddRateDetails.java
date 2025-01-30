package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
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
@Table(name = "efs_direct_charge_details")
public class DirectAddRateDetails extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name="charge_id",nullable = false,length = 20)
    private Long charge;

    @NotNull
    @Column(name="unit_id",nullable = false,length = 20)
    private  Long unit;

    @NotNull
    @Column(name="currency_id",nullable = false,length = 20)
    private  Long currency;

    @Column(name="buy_rate",nullable = false,length = 20)
    private  double buyRate;

    @Column(name="min_amount",nullable = false,length = 20)
    private  double minAmount;

    @Version
    @Column(name = "version")
    private Long version;

    @OneToOne
    @JoinColumn(name = "charge_req_id", foreignKey = @ForeignKey(name = "FK_ADD_CHARGE_ID"))
    private DirectRateRequestHeader rateRequestHeader;

}
