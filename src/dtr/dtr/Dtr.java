/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtr;

import dtr.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class Dtr {

    public static class to_dtr {

        public final int id;
        public final String department;
        public final String name;
        public final String no;
        public final String datetime;
        public final String location_id;
        public final String id_no;
        public final String verify_code;
        public final String card_no;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;

        public to_dtr(int id, String department, String name, String no, String datetime, String location_id, String id_no, String verify_code, String card_no, String date_added, String user_id, String user_screen_name) {
            this.id = id;
            this.department = department;
            this.name = name;
            this.no = no;
            this.datetime = datetime;
            this.location_id = location_id;
            this.id_no = id_no;
            this.verify_code = verify_code;
            this.card_no = card_no;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
        }

    }

    public static class hours {

        public String hour;

        public hours(String hour) {
            this.hour = hour;
        }

        public static List<hours> seed_am() {
            List<hours> datas = new ArrayList();
            hours h0 = new hours("");
            hours h1 = new hours("12 AM");
            hours h2 = new hours("01 AM");
            hours h3 = new hours("02 AM");
            hours h4 = new hours("03 AM");
            hours h5 = new hours("04 AM");
            hours h6 = new hours("05 AM");
            hours h7 = new hours("06 AM");
            hours h8 = new hours("07 AM");
            hours h9 = new hours("08 AM");
            hours h10 = new hours("09 AM");
            hours h11 = new hours("10 AM");
            hours h12 = new hours("11 AM");
            datas.add(h0);
            datas.add(h1);
            datas.add(h2);
            datas.add(h3);
            datas.add(h4);
            datas.add(h5);
            datas.add(h6);
            datas.add(h7);
            datas.add(h8);
            datas.add(h9);
            datas.add(h10);
            datas.add(h11);
            datas.add(h12);

            return datas;
        }

        public static List<hours> seed_pm() {
            List<hours> datas = new ArrayList();
            hours h0 = new hours("");
            hours h1 = new hours("12 AM");
            hours h2 = new hours("01 AM");
            hours h3 = new hours("02 AM");
            hours h4 = new hours("03 AM");
            hours h5 = new hours("04 AM");
            hours h6 = new hours("05 AM");
            hours h7 = new hours("06 AM");
            hours h8 = new hours("07 AM");
            hours h9 = new hours("08 AM");
            hours h10 = new hours("09 AM");
            hours h11 = new hours("10 AM");
            hours h12 = new hours("11 AM");
            hours h13 = new hours("12 PM");
            hours h14 = new hours("01 PM");
            hours h15 = new hours("02 PM");
            hours h16 = new hours("03 PM");
            hours h17 = new hours("04 PM");
            hours h18 = new hours("05 PM");
            hours h19 = new hours("06 PM");
            hours h20 = new hours("07 PM");
            hours h21 = new hours("08 PM");
            hours h22 = new hours("09 PM");
            hours h23 = new hours("10 PM");
            hours h24 = new hours("11 PM");
            datas.add(h0);
            datas.add(h1);
            datas.add(h2);
            datas.add(h3);
            datas.add(h4);
            datas.add(h5);
            datas.add(h6);
            datas.add(h7);
            datas.add(h8);
            datas.add(h9);
            datas.add(h10);
            datas.add(h11);
            datas.add(h12);

            datas.add(h13);
            datas.add(h14);
            datas.add(h15);
            datas.add(h16);
            datas.add(h17);
            datas.add(h18);
            datas.add(h19);
            datas.add(h20);
            datas.add(h21);
            datas.add(h22);
            datas.add(h23);
            datas.add(h24);
            return datas;
        }

        public static List<hours> seed_undertime() {
            List<hours> datas = new ArrayList();
            hours h0 = new hours("");
            hours h1 = new hours("00");
            hours h2 = new hours("01");
            hours h3 = new hours("02");
            hours h4 = new hours("03");
            hours h5 = new hours("04");
            hours h6 = new hours("05");
            hours h7 = new hours("06");
            hours h8 = new hours("07");
            hours h9 = new hours("08");
            hours h10 = new hours("09");
            hours h11 = new hours("10");
            hours h12 = new hours("11");
            hours h13 = new hours("12");

            datas.add(h0);
            datas.add(h1);
            datas.add(h2);
            datas.add(h3);
            datas.add(h4);
            datas.add(h5);
            datas.add(h6);
            datas.add(h7);
            datas.add(h8);
            datas.add(h9);
            datas.add(h10);
            datas.add(h11);
            datas.add(h12);

            datas.add(h13);

            return datas;
        }

        public static List<hours> seed_all() {
            List<hours> datas = new ArrayList();
            hours h1 = new hours("");
            hours h13 = new hours("12 PM");
            hours h14 = new hours("01 PM");
            hours h15 = new hours("02 PM");
            hours h16 = new hours("03 PM");
            hours h17 = new hours("04 PM");
            hours h18 = new hours("05 PM");
            hours h19 = new hours("06 PM");
            hours h20 = new hours("07 PM");
            hours h21 = new hours("08 PM");
            hours h22 = new hours("09 PM");
            hours h23 = new hours("10 PM");
            hours h24 = new hours("11 PM");
            datas.add(h1);
            datas.add(h13);
            datas.add(h14);
            datas.add(h15);
            datas.add(h16);
            datas.add(h17);
            datas.add(h18);
            datas.add(h19);
            datas.add(h20);
            datas.add(h21);
            datas.add(h22);
            datas.add(h23);
            datas.add(h24);
            return datas;
        }
    }

    public static class minutes {

        public String hour;

        public minutes(String hour) {
            this.hour = hour;
        }

        public static List<minutes> seed() {
            List<minutes> datas = new ArrayList();
            minutes h1 = new minutes("00");
            minutes h1a = new minutes("01");
            minutes h1aa = new minutes("02");
            minutes h1aaa = new minutes("03");
            minutes h1aaaa = new minutes("04");
            minutes h2 = new minutes("05");
            minutes h2a = new minutes("06");
            minutes h2aa = new minutes("07");
            minutes h2aaa = new minutes("08");
            minutes h2aaaa = new minutes("09");
            minutes h3 = new minutes("10");
            datas.add(h1);
            datas.add(h1a);
            datas.add(h1aa);
            datas.add(h1aaa);
            datas.add(h1aaaa);
            datas.add(h2);
            datas.add(h2a);
            datas.add(h2aa);
            datas.add(h2aaa);
            datas.add(h2aaaa);
            datas.add(h3);
            for (int i = 11; i < 60; i++) {
                minutes g = new minutes("" + i);
                datas.add(g);
            }

            return datas;
        }
    }

    public static class seconds {

        public String hour;

        public seconds(String hour) {
            this.hour = hour;
        }

        public static List<seconds> seed() {
            List<seconds> datas = new ArrayList();
            seconds h1 = new seconds("00");
            seconds h1a = new seconds("01");
            seconds h1aa = new seconds("02");
            seconds h1aaa = new seconds("03");
            seconds h1aaaa = new seconds("04");
            seconds h2 = new seconds("05");
            seconds h2a = new seconds("06");
            seconds h2aa = new seconds("07");
            seconds h2aaa = new seconds("08");
            seconds h2aaaa = new seconds("09");
            seconds h3 = new seconds("10");
            datas.add(h1);
            datas.add(h1a);
            datas.add(h1aa);
            datas.add(h1aaa);
            datas.add(h1aaaa);
            datas.add(h2);
            datas.add(h2a);
            datas.add(h2aa);
            datas.add(h2aaa);
            datas.add(h2aaaa);
            datas.add(h3);
            for (int i = 11; i < 60; i++) {
                seconds g = new seconds("" + i);
                datas.add(g);
            }

            return datas;
        }
    }

    public static class dtr_dates {

        String date;

        public dtr_dates(String date) {
            this.date = date;
        }

    }

    public static class periods {

        String period;
        String date_from;
        String date_to;

        public periods(String period, String date_from, String date_to) {
            this.period = period;
            this.date_from = date_from;
            this.date_to = date_to;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public String getDate_from() {
            return date_from;
        }

        public void setDate_from(String date_from) {
            this.date_from = date_from;
        }

        public String getDate_to() {
            return date_to;
        }

        public void setDate_to(String date_to) {
            this.date_to = date_to;
        }

    }

    public static void add_data(to_dtr to_dtr) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into dtr("
                    + "department"
                    + ",name"
                    + ",no"
                    + ",datetime"
                    + ",location_id"
                    + ",id_no"
                    + ",verify_code"
                    + ",card_no"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ")values("
                    + ":department"
                    + ",:name"
                    + ",:no"
                    + ",:datetime"
                    + ",:location_id"
                    + ",:id_no"
                    + ",:verify_code"
                    + ",:card_no"
                    + ",:date_added"
                    + ",:user_id"
                    + ",:user_screen_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department", to_dtr.department)
                    .setString("name", to_dtr.name)
                    .setString("no", to_dtr.no)
                    .setString("datetime", to_dtr.datetime)
                    .setString("location_id", to_dtr.location_id)
                    .setString("id_no", to_dtr.id_no)
                    .setString("verify_code", to_dtr.verify_code)
                    .setString("card_no", to_dtr.card_no)
                    .setString("date_added", to_dtr.date_added)
                    .setString("user_id", to_dtr.user_id)
                    .setString("user_screen_name", to_dtr.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Dtr.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_dtr to_dtr) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update dtr set "
                    + "department= :department "
                    + ",name= :name "
                    + ",no= :no "
                    + ",datetime= :datetime "
                    + ",location_id= :location_id "
                    + ",id_no= :id_no "
                    + ",verify_code= :verify_code "
                    + ",card_no= :card_no "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + " where id='" + to_dtr.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department", to_dtr.department)
                    .setString("name", to_dtr.name)
                    .setString("no", to_dtr.no)
                    .setString("datetime", to_dtr.datetime)
                    .setString("location_id", to_dtr.location_id)
                    .setString("id_no", to_dtr.id_no)
                    .setString("verify_code", to_dtr.verify_code)
                    .setString("card_no", to_dtr.card_no)
                    .setString("date_added", to_dtr.date_added)
                    .setString("user_id", to_dtr.user_id)
                    .setString("user_screen_name", to_dtr.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Dtr.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_dtr to_dtr) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from dtr  "
                    + " where id='" + to_dtr.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Dtr.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_dtr> ret_data(String where) {
        List<to_dtr> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",department"
                    + ",name"
                    + ",no"
                    + ",datetime"
                    + ",location_id"
                    + ",id_no"
                    + ",verify_code"
                    + ",card_no"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + " from dtr"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String department = rs.getString(2);
                String name = rs.getString(3);
                String no = rs.getString(4);
                String datetime = rs.getString(5);
                String location_id = rs.getString(6);
                String id_no = rs.getString(7);
                String verify_code = rs.getString(8);
                String card_no = rs.getString(9);
                String date_added = rs.getString(10);
                String user_id = rs.getString(11);
                String user_screen_name = rs.getString(12);

                to_dtr to = new to_dtr(id, department, name, no, datetime, location_id, id_no, verify_code, card_no, date_added, user_id, user_screen_name);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static String convert_to_ampm(String hour) {
        String converted = "";
        if (hour.equals("00")) {
            converted = "12 AM";
        }
        if (hour.equals("01")) {
            converted = "01 AM";
        }
        if (hour.equals("02")) {
            converted = "02 AM";
        }
        if (hour.equals("03")) {
            converted = "03 AM";
        }
        if (hour.equals("04")) {
            converted = "04 AM";
        }
        if (hour.equals("05")) {
            converted = "05 AM";
        }
        if (hour.equals("06")) {
            converted = "06 AM";
        }
        if (hour.equals("07")) {
            converted = "07 AM";
        }
        if (hour.equals("08")) {
            converted = "08 AM";
        }
        if (hour.equals("09")) {
            converted = "09 AM";
        }
        if (hour.equals("10")) {
            converted = "10 AM";
        }
        if (hour.equals("11")) {
            converted = "11 AM";
        }
        if (hour.equals("12")) {
            converted = "12 PM";
        }
        if (hour.equals("13")) {
            converted = "01 PM";
        }
        if (hour.equals("14")) {
            converted = "02 PM";
        }
        if (hour.equals("15")) {
            converted = "03 PM";
        }
        if (hour.equals("16")) {
            converted = "04 PM";
        }
        if (hour.equals("17")) {
            converted = "05 PM";
        }
        if (hour.equals("18")) {
            converted = "06 PM";
        }
        if (hour.equals("19")) {
            converted = "07 PM";
        }
        if (hour.equals("20")) {
            converted = "08 PM";
        }
        if (hour.equals("21")) {
            converted = "09 PM";
        }
        if (hour.equals("22")) {
            converted = "10 PM";
        }
        if (hour.equals("23")) {
            converted = "11 PM";
        }
        return converted;
    }

    public static String convert_to_00(String hour) {
        String converted = "";

        if (hour.equals("12 AM")) {
            converted = "00";
        }
        if (hour.equals("01 AM")) {
            converted = "01";
        }
        if (hour.equals("02 AM")) {
            converted = "02";
        }
        if (hour.equals("03 AM")) {
            converted = "03";
        }
        if (hour.equals("04 AM")) {
            converted = "04";
        }
        if (hour.equals("05 AM")) {
            converted = "05 AM";
        }
        if (hour.equals("06 AM")) {
            converted = "06";
        }
        if (hour.equals("07 AM")) {
            converted = "07";
        }
        if (hour.equals("08 AM")) {
            converted = "08";
        }
        if (hour.equals("09 AM")) {
            converted = "09";
        }
        if (hour.equals("10 AM")) {
            converted = "10";
        }
        if (hour.equals("11 AM")) {
            converted = "11";
        }
        if (hour.equals("12 PM")) {
            converted = "12";
        }
        if (hour.equals("01 PM")) {
            converted = "13";
        }
        if (hour.equals("02 PM")) {
            converted = "14";
        }
        if (hour.equals("03 PM")) {
            converted = "15";
        }
        if (hour.equals("04 PM")) {
            converted = "16";
        }
        if (hour.equals("05 PM")) {
            converted = "17";
        }
        if (hour.equals("06 PM")) {
            converted = "18";
        }
        if (hour.equals("07 PM")) {
            converted = "19";
        }
        if (hour.equals("08 PM")) {
            converted = "20";
        }
        if (hour.equals("09 PM")) {
            converted = "21";
        }
        if (hour.equals("10 PM")) {
            converted = "22";
        }
        if (hour.equals("11 PM")) {
            converted = "23";
        }
        return converted;
    }
}
