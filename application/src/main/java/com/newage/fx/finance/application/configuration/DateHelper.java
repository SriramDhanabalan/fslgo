package com.newage.fx.finance.application.configuration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    private static SimpleDateFormat databaseFortma = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static Date parseStringToDatabaseDate(String date)  {
        Date result = null;
        if (FinanceUtils.isEmpty(date)) {
            return result;
        }

        try {
            result = databaseFortma.parse(date);
        } catch(ParseException ex) {
            //do nothing;
        }

        return result;
    }
}
