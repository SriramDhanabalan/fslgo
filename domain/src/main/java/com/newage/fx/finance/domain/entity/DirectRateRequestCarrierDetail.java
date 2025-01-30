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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_direct_rate_request_carrier_detail")
public class DirectRateRequestCarrierDetail extends Auditable<String> {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "carrier_id", nullable = false, length = 20)
    private Long carrier;

    @ManyToOne
    @JoinColumn(name = "rate_req_id", foreignKey = @ForeignKey(name = "FK_RATE_REQUEST_CARRIERID"))
    DirectRateRequestHeader rateRequestHeader;

    @Version
    @Column(name = "version")
    private Long version;

}
