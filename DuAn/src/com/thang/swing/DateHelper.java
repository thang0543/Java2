package com.thang.swing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {

    static final SimpleDateFormat DatFormater = new SimpleDateFormat("MM/DD/YYYY");

    public static Date toDate(String date, String... pattern) {
        try {
            if (pattern.length > 0) {
                DatFormater.applyPattern(pattern[0]);
            }
            if (date == null) {
                return DateHelper.now();
            }
            return DatFormater.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    
    public static String toString(Date date, String... pattern) {
        if (pattern.length > 0) {
            DatFormater.applyPattern(pattern[0]);
        }
        if (date == null) {
            date = DateHelper.now();
        }
        return DatFormater.format(date);
    }

    
    public static Date now() {
        return new Date();
    }

    public static Date addDays(Date date, int days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    public static Date add(int days) {
        Date now = DateHelper.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }
}
