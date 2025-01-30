package com.newage.fx.finance.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponseDTO {
    private String statuscode;
    private String statusmessage;
    private List<CustomerCodeDTO> customercode;
    private List<MilestoneDTO> milestones;
    private String booking_link;
    private List<DocumentDTO> documents;
    private List<MilestoneOriginDTO> milestone_origin;
    private List<MilestoneTransitDTO> milestone_transit;
    private List<MilestoneDestinationDTO> milestone_destination;
}