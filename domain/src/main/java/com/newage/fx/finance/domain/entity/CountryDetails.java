package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

//@Entity
@Getter
@Setter

public class CountryDetails extends Auditable<String> {

    private Long id;
    private String name;
    private String address;




}
