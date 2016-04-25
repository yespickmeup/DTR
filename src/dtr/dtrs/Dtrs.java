/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtrs;

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
public class Dtrs {

    public static class to_dtrs {

        public final int id;
        public final String employee_id;
        public final String employee_name;
        public final String department_id;
        public final String department_name;
        public final String dtr_date;
        public final String am_arrival;
        public final String am_departure;
        public final String pm_arrival;
        public final String pm_departure;
        public final String undertime_hours;
        public final String undertime_minutes;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;

        public to_dtrs(int id, String employee_id, String employee_name, String department_id, String department_name, String dtr_date, String am_arrival, String am_departure, String pm_arrival, String pm_departure, String undertime_hours, String undertime_minutes, String date_added, String user_id, String user_screen_name) {
            this.id = id;
            this.employee_id = employee_id;
            this.employee_name = employee_name;
            this.department_id = department_id;
            this.department_name = department_name;
            this.dtr_date = dtr_date;
            this.am_arrival = am_arrival;
            this.am_departure = am_departure;
            this.pm_arrival = pm_arrival;
            this.pm_departure = pm_departure;
            this.undertime_hours = undertime_hours;
            this.undertime_minutes = undertime_minutes;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
        }
    }

    public static void add_data(List<to_dtrs> to_dtrs1) {
        try {
            Connection conn = MyConnection.connect();
            for (to_dtrs to_dtrs : to_dtrs1) {
                String s0 = "insert into dtrs("
                        + "employee_id"
                        + ",employee_name"
                        + ",department_id"
                        + ",department_name"
                        + ",dtr_date"
                        + ",am_arrival"
                        + ",am_departure"
                        + ",pm_arrival"
                        + ",pm_departure"
                        + ",undertime_hours"
                        + ",undertime_minutes"
                        + ",date_added"
                        + ",user_id"
                        + ",user_screen_name"
                        + ")values("
                        + ":employee_id"
                        + ",:employee_name"
                        + ",:department_id"
                        + ",:department_name"
                        + ",:dtr_date"
                        + ",:am_arrival"
                        + ",:am_departure"
                        + ",:pm_arrival"
                        + ",:pm_departure"
                        + ",:undertime_hours"
                        + ",:undertime_minutes"
                        + ",:date_added"
                        + ",:user_id"
                        + ",:user_screen_name"
                        + ")";

                s0 = SqlStringUtil.parse(s0)
                        .setString("employee_id", to_dtrs.employee_id)
                        .setString("employee_name", to_dtrs.employee_name)
                        .setString("department_id", to_dtrs.department_id)
                        .setString("department_name", to_dtrs.department_name)
                        .setString("dtr_date", to_dtrs.dtr_date)
                        .setString("am_arrival", to_dtrs.am_arrival)
                        .setString("am_departure", to_dtrs.am_departure)
                        .setString("pm_arrival", to_dtrs.pm_arrival)
                        .setString("pm_departure", to_dtrs.pm_departure)
                        .setString("undertime_hours", to_dtrs.undertime_hours)
                        .setString("undertime_minutes", to_dtrs.undertime_minutes)
                        .setString("date_added", to_dtrs.date_added)
                        .setString("user_id", to_dtrs.user_id)
                        .setString("user_screen_name", to_dtrs.user_screen_name)
                        .ok();
                PreparedStatement stmt = conn.prepareStatement(s0);
                stmt.execute();
            }

            Lg.s(Dtrs.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_dtrs to_dtrs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update dtrs set "
                    + "employee_id= :employee_id "
                    + ",employee_name= :employee_name "
                    + ",department_id= :department_id "
                    + ",department_name= :department_name "
                    + ",dtr_date= :dtr_date "
                    + ",am_arrival= :am_arrival "
                    + ",am_departure= :am_departure "
                    + ",pm_arrival= :pm_arrival "
                    + ",pm_departure= :pm_departure "
                    + ",undertime_hours= :undertime_hours "
                    + ",undertime_minutes= :undertime_minutes "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("employee_id", to_dtrs.employee_id)
                    .setString("employee_name", to_dtrs.employee_name)
                    .setString("department_id", to_dtrs.department_id)
                    .setString("department_name", to_dtrs.department_name)
                    .setString("dtr_date", to_dtrs.dtr_date)
                    .setString("am_arrival", to_dtrs.am_arrival)
                    .setString("am_departure", to_dtrs.am_departure)
                    .setString("pm_arrival", to_dtrs.pm_arrival)
                    .setString("pm_departure", to_dtrs.pm_departure)
                    .setString("undertime_hours", to_dtrs.undertime_hours)
                    .setString("undertime_minutes", to_dtrs.undertime_minutes)
                    .setString("date_added", to_dtrs.date_added)
                    .setString("user_id", to_dtrs.user_id)
                    .setString("user_screen_name", to_dtrs.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Dtrs.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_dtrs to_dtrs, String am_arrival, String am_departure, String pm_arrival, String pm_departure, String undertime_hour, String undertime_minute) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "update dtrs set "
                    + " am_arrival= '" + (to_dtrs.dtr_date + " " + am_arrival) + "' "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            if (!am_arrival.equalsIgnoreCase("00:00:00")) {
                stmt.addBatch(s0);
            }

            String s2 = "update dtrs set "
                    + " am_departure= '" + (to_dtrs.dtr_date + " " + am_departure) + "' "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";

            if (!am_departure.equalsIgnoreCase("00:00:00")) {
                stmt.addBatch(s2);
            }
            String s3 = "update dtrs set "
                    + " pm_arrival= '" + (to_dtrs.dtr_date + " " + pm_arrival) + "' "
                    + " where id='" + (to_dtrs.id) + "' "
                    + " ";

            if (!pm_arrival.equalsIgnoreCase("00:00:00")) {
                stmt.addBatch(s3);
            }
            String s4 = "update dtrs set "
                    + " pm_departure= '" + (to_dtrs.dtr_date + " " + pm_departure) + "' "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";

            if (!pm_departure.equalsIgnoreCase("00:00:00")) {
                stmt.addBatch(s4);
            }

            String s5 = "update dtrs set "
                    + " undertime_hours= '" + undertime_hour + "' "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";
            stmt.addBatch(s5);
            String s6 = "update dtrs set "
                    + " undertime_minutes= '" + undertime_minute + "' "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";
            stmt.addBatch(s6);
            stmt.executeBatch();
            conn.commit();
            Lg.s(Dtrs.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_dtrs to_dtrs) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from dtrs  "
                    + " where id='" + to_dtrs.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Dtrs.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(String where) {
        try {
            Connection conn = MyConnection.connect();
            conn.setAutoCommit(false);
            String s0 = "delete from dtrs  "
                    + " " + where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.addBatch(s0);

            stmt.executeBatch();
            conn.commit();
            Lg.s(Dtrs.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_dtrs> ret_data(String where) {
        List<to_dtrs> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",employee_id"
                    + ",employee_name"
                    + ",department_id"
                    + ",department_name"
                    + ",dtr_date"
                    + ",am_arrival"
                    + ",am_departure"
                    + ",pm_arrival"
                    + ",pm_departure"
                    + ",undertime_hours"
                    + ",undertime_minutes"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + " from dtrs"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String employee_id = rs.getString(2);
                String employee_name = rs.getString(3);
                String department_id = rs.getString(4);
                String department_name = rs.getString(5);
                String dtr_date = rs.getString(6);
                String am_arrival = rs.getString(7);
                String am_departure = rs.getString(8);
                String pm_arrival = rs.getString(9);
                String pm_departure = rs.getString(10);
                String undertime_hours = rs.getString(11);
                String undertime_minutes = rs.getString(12);
                String date_added = rs.getString(13);
                String user_id = rs.getString(14);
                String user_screen_name = rs.getString(15);

                to_dtrs to = new to_dtrs(id, employee_id, employee_name, department_id, department_name, dtr_date, am_arrival, am_departure, pm_arrival, pm_departure, undertime_hours, undertime_minutes, date_added, user_id, user_screen_name);
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
