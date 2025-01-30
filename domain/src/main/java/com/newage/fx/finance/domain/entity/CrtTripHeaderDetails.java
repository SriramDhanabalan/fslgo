package com.newage.fx.finance.domain.entity;


import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.TripStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crt_trip_detail_header")
public class CrtTripHeaderDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

//    @Version
//    @Column(name = "version")
//    private Long version;

//    @Column(name = "company_entity_id", length = 20)
//    private Long companyId;
//
//    @Column(name = "group_company_id", length = 20)
//    private Long groupCompanyId;
//
//    @Column(name = "branch_id", length = 20)
//    private Long branchId;

    @Column(name = "trip_no", nullable = false)
    private String tripNo;

    @Column(name = "trip_status")
    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "crtHeader", cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<CrtTripDetails> crtTripDetails = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enquiry_detail", foreignKey = @ForeignKey(name = "FK_ENQ_TRIP_ID"))
    private EnquiryHeader enquiryDetail;

}
