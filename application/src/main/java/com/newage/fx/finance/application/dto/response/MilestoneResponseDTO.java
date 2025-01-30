package com.newage.fx.finance.application.dto.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MilestoneResponseDTO {
    private LocalDateTime booked;
    private LocalDateTime cargoReady;
    private LocalDateTime plannedPickup;
    private LocalDateTime actualPickup;
    private LocalDateTime cargoReceived;
    private LocalDateTime exportClearanceDate;
    private LocalDateTime containerStuffingDate;
    private LocalDateTime draftHBLIssued;
    private LocalDateTime blReleased;
    private LocalDateTime preAlert;
    private LocalDateTime shipmentDepartureChennai;
    private LocalDateTime shipmentArrivalJebelAli;
    private LocalDateTime shipmentDepartureJebelAli;
    private LocalDateTime shipmentArrivalKuwait;
    private LocalDateTime canIssuedDate;
    private LocalDateTime containerDestuffingDate;
    private LocalDateTime importClearanceDate;
    private LocalDateTime doIssuedDate;
}