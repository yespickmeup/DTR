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
