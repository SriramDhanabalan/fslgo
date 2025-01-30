package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import com.newage.fx.finance.domain.enums.YesNo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nxt_sailing_schedule_event")
public class SailingScheduleEvents extends Auditable<String>{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_id", length = 20)
    private Long eventId;

    @Column (name = "event_name", length = 20)
    private String eventName;

    @Enumerated(EnumType.STRING)
    @Column (name = "completed", length = 100)
    private YesNo completed;

    @Column (name = "date", length = 100)
    private Date date;

    @ManyToOne
    @JoinColumn (name = "schedule_detail_id", foreignKey = @ForeignKey(name ="FK_SCHEDULE_DETAILS_ID"))
    public SailingScheduleDetails  sailingScheduleDetails;

    @Version
    @Column(name = "version")
    private Long version;



}









