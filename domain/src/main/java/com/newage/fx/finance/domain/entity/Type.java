package com.newage.fx.finance.domain.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

//@Entity
@Getter
@Setter
@NoArgsConstructor
public class Type {


    private String code;
    private String label;
    private String value;

    public Type(String code, String label, String value) {
        this.code = code;
        this.label = label;
        this.value = value;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }



}
