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
@Table(name = "efs_enquiry_value_added_service_details")
public class EnquiryNewValueAddedServiceDetails extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "insurance_required", nullable = false, length = 10)
//    private boolean insuranceRequired;
//
//    @Column(name = "stackables", nullable = false, length = 10)
//    private boolean stackables;
//
//    @Column(name = "origin_clearance", nullable = false, length = 10)
//    private boolean originClearance;
//
//    @Column(name = "destination_clearance", nullable = false, length = 10)
//    private boolean destinationClearance;

    @Column(name = "value_id")
    private Long valueId;

    @ManyToOne
    @JoinColumn(name = "enquiry_detail_id", foreignKey = @ForeignKey(name = "FK_VALUEADDED_SERVICEID"))
    EnquiryHeader enquiryDetail;

    @Version
    @Column(name = "version")
    private Long version;
}
