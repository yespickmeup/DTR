/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Guinness
 */
public class AddTime {

    public static void main2(String[] args) {
        List<String> timestampsList = new ArrayList();
        timestampsList.add("00:01:00");
        timestampsList.add("10:00:00");
        timestampsList.add("00:00:00");
        final DateFormat dt = new SimpleDateFormat("HH:mm:ss");
        final Calendar c = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        long milliseconds = 0;
        c.clear();
        long startingMS = c.getTimeInMillis();
        for (final String t : timestampsList) {
            try {
                milliseconds = milliseconds + (dt.parse(t).getTime() - startingMS);
            } catch (ParseException ex) {
                Logger.getLogger(AddTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        System.out.println(milliseconds + " milliseconds");
        System.out.println(milliseconds / 1000 + " seconds");
        System.out.println(milliseconds / 1000 / 60 + " minutes");
        System.out.println(milliseconds / 1000 / 60 / 60 + " hours");
    }

    public static void main(String[] args) {
        List<String> times = new ArrayList();
        times.add("20:01:00");
        times.add("10:02:00");
        times.add("20:00:00");

        System.out.println(sumTimes(times));

        String[] total = sumTimes(times).split(":");
        System.out.println("HH:" + total[0]);
        System.out.println("MM:" + total[1]);
    }

    public static String sumTimes(final List<String> timestampList) {
        long milliseconds = 0;
        final DateFormat dt = new SimpleDateFormat("HH:mm:ss");
        dt.setLenient(false);
        try {
            final long timezoneOffset = dt.parse("00:00:00").getTime();
            for (final String t : timestampList) {
                milliseconds += (dt.parse(t).getTime() - timezoneOffset);
            }
        } catch (final ParseException e) {
            throw new RuntimeException(e);
        }

        ((SimpleDateFormat) dt).applyPattern(":mm:ss");
        return new StringBuilder(8).append(milliseconds / 3600000).append(
                dt.format(new Date(milliseconds))).toString();
    }
}
