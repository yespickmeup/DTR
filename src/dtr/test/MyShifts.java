/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.test;

/**
 *
 * @author Guinness
 */
public class MyShifts {

    public static void main(String[] args) {
        String noh = getNOH("03:00 PM", "NOH");
        System.out.println(noh);
    }

    public static String getNOH(String time, String shift_type) {
        String[] noh = {"08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 AM", "03:00 AM", "04:00 AM", "05:00 PM"};
        String[] ms =  {"07:00 AM", "08:00 AM", "09:00 AM", "10:00 AM", ""         , "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM"};
        String[] gs =  {"11:00 PM", "12:00 AM", "01:00 AM", "02:00 AM", ""         , "03:00 AM", "04:00 AM", "05:00 AM", "06:00 AM", "07:00 AM"};
        String[] ss =  {"03:00 PM", "04:00 PM", "05:00 PM", "06:00 PM", ""         , "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM"};
        
        
        String h1 = time.substring(0, 2);
        String h2 = time.substring(3, 5);
        String h3 = time.substring(6, 8);
        String my_noh = "";
        if (shift_type.equalsIgnoreCase("MS")) {
            int index = -1;
            for (int i = 0; i < ms.length; i++) {
                if (!ms[i].isEmpty()) {
                    String hh1 = ms[i].substring(0, 2);
                    String hh2 = ms[i].substring(3, 5);
                    String hh3 = ms[i].substring(6, 8);
                    if (hh1.equals(h1) && hh3.equals(h3)) {

                        index = i;
                        break;
                    }
                }
            }

            try {

                my_noh = noh[index];

                String a1 = my_noh.substring(0, 2);
                String a2 = my_noh.substring(3, 5);
                String a3 = my_noh.substring(6, 8);
                my_noh = a1 + ":" + h2 + " " + a3;

            } catch (Exception e) {
                my_noh = h1 + ":" + h2 + " " + h3;
            }

            return my_noh;
        }

        if (shift_type.equalsIgnoreCase("GS")) {
            int index = -1;
            for (int i = 0; i < gs.length; i++) {
                if (!gs[i].isEmpty()) {
                    String hh1 = gs[i].substring(0, 2);
                    String hh2 = gs[i].substring(3, 5);
                    String hh3 = gs[i].substring(6, 8);
                    if (hh1.equals(h1) && hh3.equals(h3)) {

                        index = i;
                        break;
                    }
                }
            }

            try {

                my_noh = noh[index];

                String a1 = my_noh.substring(0, 2);
                String a2 = my_noh.substring(3, 5);
                String a3 = my_noh.substring(6, 8);
                my_noh = a1 + ":" + h2 + " " + a3;

            } catch (Exception e) {
                my_noh = h1 + ":" + h2 + " " + h3;
            }

            return my_noh;
        }

        if (shift_type.equalsIgnoreCase("SS")) {

            int index = -1;
            for (int i = 0; i < ss.length; i++) {
                if (!ss[i].isEmpty()) {
                    String hh1 = ss[i].substring(0, 2);
                    String hh2 = ss[i].substring(3, 5);
                    String hh3 = ss[i].substring(6, 8);
                    if (hh1.equals(h1) && hh3.equals(h3)) {

                        index = i;
                        break;
                    }
                }
            }

            try {

                my_noh = noh[index];

                String a1 = my_noh.substring(0, 2);
                String a2 = my_noh.substring(3, 5);
                String a3 = my_noh.substring(6, 8);
                my_noh = a1 + ":" + h2 + " " + a3;

            } catch (Exception e) {
                my_noh = h1 + ":" + h2 + " " + h3;
            }
            System.out.println("my_noh"+my_noh);
            return my_noh;
        }

        return my_noh;
    }
}
