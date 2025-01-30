package com.newage.fx.finance.domain.entity;
import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "efs_cfs_warehouse_service_details")
public class ServiceDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origin_id", nullable = true, length = 20)
    private Long originId;

    @Column(name = "origin_name", nullable = true, length = 50)
    private String originName;

    @Column(name = "destination_id", nullable = true, length = 20)
    private Long destinationId;

    @Column(name = "destination_name", nullable = true, length = 50)
    private String destinationName;

    @Column(name = "division_id", nullable = true, length = 20)
    private Long divisionId;

    @Column(name = "division_name", nullable = true, length = 50)
    private String divisionName;

    @Column(name = "service", nullable = true, length = 50)
    @Enumerated(EnumType.STRING)
    private Service service;

    @OneToOne
    @JoinColumn(name="header_details_id",foreignKey = @ForeignKey(name="FK_CFS_SERVICEDETAILS"))
    CfsWareHouseHeaderDetails information;

}
