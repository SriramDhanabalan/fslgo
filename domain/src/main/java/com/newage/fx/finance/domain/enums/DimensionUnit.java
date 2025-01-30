package com.newage.fx.finance.domain.enums;

public enum DimensionUnit {

    CENTIMETERORKILOS("Centimeter/Kilos"), INCHORPOUNDS("Inch/Pounds");

    String dimensionUnit;

    DimensionUnit(String d) {
        dimensionUnit = d;
    }

    public String getDimensionUnit() {
        return dimensionUnit;
    }

}