package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "efs_direct_rate_request_container_details")
public class DirectRateRequestContainerDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "container_id", length = 20)
    Long containerId;

    @Column(name = "container_code", nullable = false, length = 10)
    private String containerCode;

    @Column(name = "container_name", nullable = false, length = 50)
    private String containerName;

    @NotNull
    @Range(min = 1, max = 999, message = "Number of Containers should be in between 1 to 999")
    @Column(name = "no_of_containers", length = 3)
    int numberOfContainers;

    @ManyToOne
    @JoinColumn(name = "rate_req_cargo_id", foreignKey = @ForeignKey(name = "FK_RATE_REQ_CARGO_ID"))
    DirectRateCargoDetails cargoDetails;

    @Version
    @Column(name = "version")
    Long version;
}
