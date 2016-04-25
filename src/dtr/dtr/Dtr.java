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

        public static List<hours> seed() {
            List<hours> datas = new ArrayList();
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
            hours h14 = new hours("14");
            hours h15 = new hours("15");
            hours h16 = new hours("16");
            hours h17 = new hours("17");
            hours h18 = new hours("18");
            hours h19 = new hours("19");
            hours h20 = new hours("20");
            hours h21 = new hours("21");
            hours h22 = new hours("22");
            hours h23 = new hours("23");
            
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
            minutes h2 = new minutes("05");
            minutes h3 = new minutes("10");
            minutes h4 = new minutes("15");
            minutes h5 = new minutes("20");
            minutes h6 = new minutes("25");
            minutes h7 = new minutes("30");
            minutes h8 = new minutes("35");
            minutes h9 = new minutes("40");
            minutes h10 = new minutes("45");
            minutes h11 = new minutes("50");
            minutes h12 = new minutes("55");

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
    }

    public static class seconds {

        public String hour;

        public seconds(String hour) {
            this.hour = hour;
        }

        public static List<seconds> seed() {
            List<seconds> datas = new ArrayList();
            seconds h1 = new seconds("00");
            seconds h2 = new seconds("05");
            seconds h3 = new seconds("10");
            seconds h4 = new seconds("15");
            seconds h5 = new seconds("20");
            seconds h6 = new seconds("25");
            seconds h7 = new seconds("30");
            seconds h8 = new seconds("35");
            seconds h9 = new seconds("40");
            seconds h10 = new seconds("45");
            seconds h11 = new seconds("50");
            seconds h12 = new seconds("55");

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

}
