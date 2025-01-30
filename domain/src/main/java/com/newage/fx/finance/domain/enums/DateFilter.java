package com.newage.fx.finance.domain.enums;

public enum DateFilter {
    TODAY(0),
    LAST_7_DAYS(7),
    LAST_15_DAYS(15),
    LAST_30_DAYS(30),
    LAST_60_DAYS(60),
    LAST_90_DAYS(90),
    LAST_180_DAYS(180),
    LAST_365_DAYS(365);

    private final int days;

    DateFilter(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
