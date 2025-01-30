package com.newage.fx.finance.domain.entity;


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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "nxt_custom_shipment_details")
public class CustomShipmentDetails {
    /*Auto Generation Id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="irn_no")
    private String  irnNo;

    @Column(name="pcin")
    private String pcin;

    @Column(name="pcin_no")
    private String pcinNo;

    @Column(name="doc_type")
    private String docType;

    @Column(name="doc_no")
    private String docNo;

    @Column(name="doc_Site_id")
    private  String docSiteId;

    @Column(name="doc_date")
    private Date docDate;

    @Column(name="invoice_to")
    private String invoiceTo;

    @Column(name="free_zone")
    private YesNo freeZone;

    @Column(name="bl_released")
    private String blReleased;

    @Column(name="hs_code_id")
    private Long hsCodeId;

    @Column(name="uno_code")
    private String unoCode;

    @Column(name="imdg_code")
    private String imdgCode;

    @Column(name="hs_pack_code")
    private String hsPackCode;

    @Column(name="no_of_hs_pack")
    private String noOfHsPack;

    @Column(name="commodity_description")
    private String commodityDescription;

    @Column(name="marks_number")
    private String marksAndNumber;

    @Column(name="note")
    private String note;

    @Column(name="unit_of_volume")
    private String unitOfVolume;

    @Column(name="unit_of_volume_id")
    private Long unitOfVolumeId;

    @Column(name="gross_weight")
    private Double grossWeight;

    @Column(name="currency_id")
    private Long currencyId;

    @Column(name="currency")
    private String currency;

    @Column(name="currency_rate")
    private String currencyRate;

    @Column(name="pack_id")
    private Long packId;

    @Column(name="pack_code")
    private String packCode;

    @Column(name="invoice")
    private String invoice;

    @Column(name="item_type")
    private String itemType;

    @Column(name="cargo_movement")
    private String cargoMovement;

    @Column(name="nature_of_cargo")
    private String natureOfCargo;

    @Column(name="service")
    private String service;

    @OneToOne()
    @JoinColumn(name = "custom_house_id", foreignKey = @ForeignKey(name = "FK_CUSTOM_HOUSE_ID"))
    CustomHouseDetails customHouseDetails;
}
