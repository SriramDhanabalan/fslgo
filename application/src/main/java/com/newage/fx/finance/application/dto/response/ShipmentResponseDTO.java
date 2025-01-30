package com.newage.fx.finance.application.dto.response;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode

public class ShipmentResponseDTO<T> {

    private Integer statuscode;
    private String statusmessage;
    private String perPage;
    private String lastPage;
    private String currentPage;
    private String total;
    private Object statuswise_count;
    private List<T> data;
    private ResponseError error;


    public ShipmentResponseDTO(Integer statuscode, String statusmessage, String total, Object statuswise_count, List<T> data, ResponseError error) {
        this.statuscode = statuscode;
        this.statusmessage = statusmessage;

        this.total = total;
        this.statuswise_count = statuswise_count;
        this.data = data;
        this.error = error;
    }


}
