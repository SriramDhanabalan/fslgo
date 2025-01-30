package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_sailing_schedule_vessel_details")
public class SailingScheduleVesselDetails extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@NotNull
    @Column (name = "schedule_id", nullable = false, length = 20)
    private String scheduleId;*/

    @Column(name = "Vessel_id", length = 20)
    private Long vesselId;

    @Column(name = "vessel_name", length = 20)
    private String vesselName;

    @Column(name = "voyage_number", length = 20)
    private String voyageNumber;

    @Column(name = "rotation_number", length = 20)
    private String rotationNumber;

    @Column(name = "date")
    private Date date;

    @Column(name = "via_number", nullable = true, length = 20)
    private String viaNumber;

    @Column(name = "port_of_loading_id", nullable = false, length = 20)
    private Long portOfLoadingId;

    @Column(name = "port_of_loading", nullable = false, length = 20)
    private String portOfLoading;

    @Column(name = "port_of_discharge_id", nullable = false, length = 20)
    private Long portOfDischargeId;

    @Column(name = "port_of_discharge", nullable = false, length = 20)
    private String portOfDischarge;

    @Column(name = "carrier_id", nullable = false, length = 20)
    private Long carrierId;

    @Column(name = "carrier_name", nullable = false, length = 100)
    private String carrierName;
//new
    @Column(name="stuffing_date")
    private Date stuffingDate;

    @Column(name="origin_code")
    private String originCode;

    @Column(name="destination")
    private String designation;

    @Column(name="destination_code")
    private String designationCode;

    @Column(name="is_co_load")
    private String iscoLoad;

    @Column(name="option_no")
    private String OptionNo;

    @Column(name="line_no")
    private String lineNo;

    @Column(name="import_export")
    private String importExport;

    @Column(name="origin_country_code")
    private String originCountryCode;

    @Column(name="dest_country_code")
    private String DestCountryCode;

    @Column(name="dest_country_name")
    private String DestCountryName;

    @Column(name = "schedule_uid", nullable = false, length = 20)
    private Long ScheduleId;







    @OneToMany(mappedBy = "sailingScheduleVesselDetails", cascade = CascadeType.ALL)
    private List<SailingScheduleDetails> sailingScheduleDetails = new ArrayList();

    @Version
    @Column(name = "version")
    private long version;

}
