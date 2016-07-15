/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.test;

import dtr.shifting_types.Shifting_types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guinness
 */
public class MyShifts {

    public static void main(String[] args) {
        final List<Shifting_types.shifts> dtr_hours = new ArrayList();
        List<Shifting_types.to_shifting_types> shift_types = Shifting_types.ret_data("");

        for (Shifting_types.to_shifting_types to : shift_types) {
            if (to.shift_starts.equalsIgnoreCase("\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"")) {
                String[] shift = {""};
                Shifting_types.shifts s_ms = new Shifting_types.shifts(to.shift_name, shift);
                dtr_hours.add(s_ms);
            } else {
                String[] shift = {to.shift_starts};
                Shifting_types.shifts s_ms = new Shifting_types.shifts(to.shift_name, shift);
                dtr_hours.add(s_ms);
            }
        }
        String noh1 = getNOH("11:00 PM", "GS(OT)", dtr_hours);
        System.out.println(noh1);
    }

    public static String getNOH(String time, String shift_type, List<Shifting_types.shifts> shifts) {
        String[] noh = {"08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 AM", "03:00 AM", "04:00 AM", "05:00 PM"};
        String[] ms = {"07:00 AM", "08:00 AM", "09:00 AM", "10:00 AM", "", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM"};
        String[] gs = {"11:00 PM", "12:00 AM", "01:00 AM", "02:00 AM", "", "03:00 AM", "04:00 AM", "05:00 AM", "06:00 AM", "07:00 AM"};
        String[] ss = {"03:00 PM", "04:00 PM", "05:00 PM", "06:00 PM", "", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM"};

        String h1 = time.substring(0, 2);
        String h2 = time.substring(3, 5);
        String h3 = time.substring(6, 8);

        String my_noh = "";
        for (Shifting_types.shifts shift : shifts) {

            if (shift_type.equalsIgnoreCase(shift.name)) {
                System.out.println("shift_type:" + shift_type + " , shift.name:" + shift.name);
                int index = -1;
                for (int i = 0; i < shift.time.length; i++) {
                    System.out.println("shift.time[i]:" + shift.time[i]);
                    if (!shift.time[i].isEmpty()) {
                        String hh1 = shift.time[i].substring(1, 3);
                        String hh2 = shift.time[i].substring(4, 6);
                        String hh3 = shift.time[i].substring(7, 9);
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
                break;
            }
        }

        return my_noh;
    }
}
