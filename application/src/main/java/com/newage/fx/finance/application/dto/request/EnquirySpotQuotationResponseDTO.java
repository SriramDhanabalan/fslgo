package com.newage.fx.finance.application.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.newage.fx.finance.domain.enums.EnquiryStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnquirySpotQuotationResponseDTO {


    @JsonProperty("ref_id")
    private Long ref_id; //null

    @JsonProperty("origin")
    private String originName;

    @JsonProperty("destination")
    private String destinationName;

    @JsonProperty("load")
    private String load; //null

    @JsonProperty("tos")
    private Long tosId;

    @JsonProperty("weight")
    private Double grossWeightKg;

    @JsonProperty("Volume")
    private Double volumeInCbm;

    @JsonProperty("rate_validity")
     private String rate;

    @JsonProperty("quotation_currency")
    private Double currencyAmount;

    @JsonProperty("quotation_amount")
    private Double costAmount;

    @JsonProperty("status")
    private EnquiryStatus status;

    @JsonProperty("quotation_link")
    private String quotation_link;



}
