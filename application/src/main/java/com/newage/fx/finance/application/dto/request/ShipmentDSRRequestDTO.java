package com.newage.fx.finance.application.dto.request;

import com.newage.fx.finance.domain.enums.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShipmentDSRRequestDTO {

    private Service SERVICE;
    private String BOOKING_NO;
    private Date BOOKING_DATE;
    private String ORIGIN;
    private String POL;
    private String POD;
    private String FINAL_DESTINATION;
    private Date CARGO_READY_DATE;
    private Date PICKUP_DATE;
    private Date CARGO_RECEIVED_DATE;
    private Date ETD_ORIGIN;
    private Date CONNECTION_ETA;
    private Date CONNECTION_ETD;
    private Date ETA_DESTINATION;
    private String HOUSE_NO;
    private String TERMS;
    private String VESSEL_CARRIER;
    private String SHIPPER_NAME;
    private String CONSIGNEE_NAME;
    private String BILLING_PARTY;
    private String IMPORT_EXPORT;
    private int PCS;
    private double WEIGHT;
    private double VOLUME;
    private String SHIPPER_INVOICE_NO;
    private String CONTAINER_NO;
    private String CONTAINER_DETAILS;
    private Date CAN_DATE;
    private String DO_NUMBER;
    private Date DO_DATE;
    private String SHIPPER_REFERENCE_NUMBER;
    private String IGM_GIGM_NO;
    private Date IGM_GIGM_DATE;
    private String LIGM_NO;
    private Date LIGM_DATE;
    private Date HBL_HAWB_RELEASED_DATE;
    private Date PRE_ALERT_DATE;
    private String FRT_INVOICE_NO;
    private Date FRT_INVOICE_DATE;
    private String SHIPPER_INVOICE_VALUE;
    private String CARRIER_BOOKING_NO;
    private Date CARRIER_BOOKING_DATE;
    private String DIRECT_BL;
    private String BRAND;
    private String DIVISION;
    private String CHA;
    private String CONCEPT_NAME;
    private Date SHIPMENT_INTENDED_DATE;
    private String NAC_NAME;
    private Date CHECKLIST_ADVISED;
    private Date CHECKLIST_APPROVED;
    private String DUTY_ADVISED;
    private String DUTY_SUBMITTED;
    private String BOND_SENT_TO_CUSTOMER;
    private Date BOND_RECVD_FROM_CUSTOMER;
    private Date BOND_DATE;
    private String LICENCE_NO;
    private Date LICENCE_DATE;
    private String REMARKS_LATEST_UPDATE;
    private String SUBJOB_UID;
    private String SLA_STATUS;

}
