package com.newage.fx.finance.application.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.enums.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CombinedResponseDTO {

    @JsonProperty("SERVICE")
    private Service SERVICE;

    @JsonProperty("ORDER_NO")
    private String ORDER_NO;

    @JsonProperty("STATUS")
    private String STATUS;

    @JsonProperty("BOOKING_NO")
    private String BOOKING_NO;

    @JsonProperty("BOOKING_DATE")
    private String BOOKING_DATE;

    @JsonProperty("ORIGIN")
    private String ORIGIN;

    @JsonProperty("POL")
    private String POL;

    @JsonProperty("POD")
    private String POD;

    @JsonProperty("FINAL_DESTINATION")
    private String FINAL_DESTINATION;

    @JsonProperty("CARGO_READY_DATE")
    private Date CARGO_READY_DATE;

    @JsonProperty("PICKUP_DATE")
    private Date PICKUP_DATE;

    @JsonProperty("CARGO_RECEIVED_DATE")
    private Date CARGO_RECEIVED_DATE;

    @JsonProperty("ETD_ORIGIN")
    private String ETD_ORIGIN;

    @JsonProperty("CONNECTION_ETA")
    private Date CONNECTION_ETA;

    @JsonProperty("CONNECTION_ETD")
    private Date CONNECTION_ETD;

    @JsonProperty("ETA_DESTINATION")
    private String ETA_DESTINATION;

    @JsonProperty("HOUSE_NO")
    private String HOUSE_NO;

    @JsonProperty("TERMS")
    private String TERMS;

    @JsonProperty("VESSEL_CARRIER")
    private String VESSEL_CARRIER;

    @JsonProperty("SHIPPER_NAME")
    private String SHIPPER_NAME;

    @JsonProperty("CONSIGNEE_NAME")
    private String CONSIGNEE_NAME;

    @JsonProperty("BILLING_PARTY")
    private Long BILLING_PARTY;

    @JsonProperty("IMPORT_EXPORT")
    private Service IMPORT_EXPORT;

    @JsonProperty("PCS")
    private Integer PCS;

    @JsonProperty("WEIGHT")
    private double WEIGHT;

    @JsonProperty("VOLUME")
    private double VOLUME;

    @JsonProperty("SHIPPER_INVOICE_NO")
    private String SHIPPER_INVOICE_NO;

    @JsonProperty("CONTAINER_NO")
    private String CONTAINER_NO;

    @JsonProperty("CONTAINER_DETAILS")
    private String CONTAINER_DETAILS;

    @JsonProperty("CAN_DATE")
    private Date CAN_DATE;

    @JsonProperty("DO_NUMBER")
    private String DO_NUMBER;

    @JsonProperty("DO_DATE")
    private Date DO_DATE;

    @JsonProperty("SHIPPER_REFERENCE_NUMBER")
    private String SHIPPER_REFERENCE_NUMBER;

    @JsonProperty("IGM_GIGM_NO")
    private String IGM_GIGM_NO;

    @JsonProperty("IGM_GIGM_DATE")
    private Date IGM_GIGM_DATE;

    @JsonProperty("LIGM_NO")
    private String LIGM_NO;

    @JsonProperty("LIGM_DATE")
    private Date LIGM_DATE;

    @JsonProperty("HBL_HAWB_RELEASED_DATE")
    private Date HBL_HAWB_RELEASED_DATE;

    @JsonProperty("PRE_ALERT_DATE")
    private Date PRE_ALERT_DATE;

    @JsonProperty("FRT_INVOICE_NO")
    private String FRT_INVOICE_NO;

    @JsonProperty("FRT_INVOICE_DATE")
    private Date FRT_INVOICE_DATE;

    @JsonProperty("SHIPPER_INVOICE_VALUE")
    private String SHIPPER_INVOICE_VALUE;

    @JsonProperty("CARRIER_BOOKING_NO")
    private String CARRIER_BOOKING_NO;

    @JsonProperty("CARRIER_BOOKING_DATE")
    private Date CARRIER_BOOKING_DATE;

    @JsonProperty("DIRECT_BL")
    private String DIRECT_BL;

    @JsonProperty("BRAND")
    private String BRAND;

    @JsonProperty("DIVISION")
    private String DIVISION;

    @JsonProperty("CHA")
    private String CHA;

    @JsonProperty("CONCEPT_NAME")
    private String CONCEPT_NAME;

    @JsonProperty("SHIPMENT_INTENDED_DATE")
    private Date SHIPMENT_INTENDED_DATE;

    @JsonProperty("NAC_NAME")
    private String NAC_NAME;

    @JsonProperty("CHECKLIST_ADVISED")
    private Date CHECKLIST_ADVISED;

    @JsonProperty("CHECKLIST_APPROVED")
    private Date CHECKLIST_APPROVED;

    @JsonProperty("DUTY_ADVISED")
    private String DUTY_ADVISED;

    @JsonProperty("DUTY_SUBMITTED")
    private String DUTY_SUBMITTED;

    @JsonProperty("BOND_SENT_TO_CUSTOMER")
    private String BOND_SENT_TO_CUSTOMER;

    @JsonProperty("BOND_RECVD_FROM_CUSTOMER")
    private Date BOND_RECVD_FROM_CUSTOMER;

    @JsonProperty("BOND_DATE")
    private Date BOND_DATE;

    @JsonProperty("LICENCE_NO")
    private String LICENCE_NO;

    @JsonProperty("LICENCE_DATE")
    private Date LICENCE_DATE;

    @JsonProperty("REMARKS_LATEST_UPDATE")
    private String REMARKS_LATEST_UPDATE;

    @JsonProperty("SUBJOB_UID")
    private String SUBJOB_UID;

    @JsonProperty("SLA_STATUS")
    private String SLA_STATUS;

    @JsonProperty("shipmentData")
    private Page<ShipmentDSRResponseDTO> shipmentData;

    @JsonProperty("columnPreferences")
    private List<String> column;


    // public String setShipmentData(Page<ShipmentDSRResponseDTO> shipmentResult) { }


}
