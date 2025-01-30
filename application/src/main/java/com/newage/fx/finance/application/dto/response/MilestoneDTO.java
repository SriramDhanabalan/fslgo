package com.newage.fx.finance.application.dto.response;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MilestoneDTO {
    private String milestone;
    private String date;
    private String status;
    private String milestonestatus;
}