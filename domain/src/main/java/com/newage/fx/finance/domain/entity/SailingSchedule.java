package com.newage.fx.finance.domain.entity;

import com.newage.fx.finance.domain.entity.coa.Auditable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

//@Entity
@Setter
@Getter
public class SailingSchedule extends Auditable {

    private String  name;

}
