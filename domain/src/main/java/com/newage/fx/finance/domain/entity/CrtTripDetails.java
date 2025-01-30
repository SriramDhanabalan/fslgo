package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.ServiceLegType;
import com.newage.fx.finance.domain.enums.TripType;
import com.newage.fx.finance.domain.enums.TypeStatus;
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
@Table(name = "crt_trip_details")
public class CrtTripDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private TypeStatus type;

    // Standard , Bogie, Couple
    @Enumerated(EnumType.STRING)
    @Column(name = "trip_type")
    private TripType tripType;

    @Column(name = "vehicle_id", nullable = true, length = 20)
    private Long vehicleId;

    @Column(name = "vehicle_no")
    private String vehicleNo;

    @Column(name = "driver_id", nullable = true, length = 20)
    private Long driverId;

    @Column(name = "driver_name")
    private String driverName;

    @Column(name = "driver_contact_no")
    private String driverContactNo;

    @Column(name = "token")
    private String token;

    @Column(name = "transporter_id", nullable = true, length = 20)
    private Long transporterId;

    @Column(name = "transporter_name")
    private String transporterName;
    //cost

    @Column(name = "trailer_id", nullable = true, length = 20)
    private Long trailerId;

    @Column(name = "trailer_name")
    private String trailerName;

    @Column(name = "charge_id")
    private Long chargeId;

    @Column(name = "charge_name")
    private String chargeName;

    @Column(name = "billing_currency_id")
    private Long billingCurrencyId;

    @Column(name = "cost_amount")
    private Double costAmount;

    @Column(name = "trailer_no")
    private String trailerNo;

    @Column(name = "leg_type")
    @Enumerated(EnumType.STRING)
    private ServiceLegType serviceLegType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tripDetails", cascade = CascadeType.ALL)
    @OrderBy("id ASC")
    private List<CrtTripContainerDetails> crtTripContainerDetails = new ArrayList<>();
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "enquiry_id", foreignKey = @ForeignKey(name = "FK_ENQ_TRIP_ID"))
//    private EnquiryHeader enquiryDetail;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "crt_header_id", foreignKey = @ForeignKey(name = "FK_CRT_TRIP_ID"))
    private CrtTripHeaderDetails crtHeader;

}
