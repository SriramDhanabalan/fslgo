package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_rate_request_charge_update")
public class RateRequestChargeUpdate extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "charge_id", nullable = true, length = 20)
    private Long chargeId;

    @NotNull
    @Column(name = "unit_id", nullable = false, length = 20)
    private Long unitId;

    @NotNull
    @Column(name = "currency_id", nullable = false, length = 20)
    private Long currencyId;

    @Size(min=2,max = 14, message ="BuyRate size must be between 2 and 14")
    @Pattern(regexp = "^[0-9.]*$", message = "BuyRate should be Number only")
    @Column(name = "buy_rate")
    private String buyRate;

    @Size(min=2,max = 14, message ="MinAmount size must be between 2 and 14")
    @Pattern(regexp = "^[0-9.]*$", message = "MinAmount should be Number only")
    @Column(name = "min_amount")
    private String minAmount;

    @ManyToOne
    @JoinColumn(name = "rate_id", foreignKey = @ForeignKey(name = "FK_CHARGE_UPDATE_RATE_REQUEST"))
    CreateRateRequest rateRequest;

    @Version
    @Column(name = "version")
    private Long version;
}
