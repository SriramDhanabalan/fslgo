package com.newage.fx.finance.domain.util;

import java.util.Date;

public class FinanceUtils {

    public static boolean isEmpty(String str) {

        return str == null || "".equals(str.trim());
    }

    public static boolean isCodeValid(String str, int amountOfDigits) {

        if (FinanceUtils.isEmpty(str)) {

            return false;
        }

        String pattern = "^[0-9]{" + amountOfDigits + "}$";

        return str.matches(pattern);
    }

    public static boolean isTimestampValid(String timestamp) {

        Date date = DateHelper.parseStringToDatabaseDate(timestamp);
        return date != null;
    }
}
