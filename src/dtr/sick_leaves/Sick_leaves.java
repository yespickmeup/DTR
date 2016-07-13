/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.sick_leaves;

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
public class Sick_leaves {

    public static class to_sick_leaves {

        public final int id;
        public final String reason;
        public final String date_of_leave;
        public final int half_day_am;
        public final int half_day_pm;
        public final String employee_name;
        public final String employee_id;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;

        public to_sick_leaves(int id, String reason, String date_of_leave, int half_day_am, int half_day_pm, String employee_name, String employee_id, String date_added, String user_id, String user_screen_name) {
            this.id = id;
            this.reason = reason;
            this.date_of_leave = date_of_leave;
            this.half_day_am = half_day_am;
            this.half_day_pm = half_day_pm;
            this.employee_name = employee_name;
            this.employee_id = employee_id;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
        }
    }

    public static void add_data(to_sick_leaves to_sick_leaves) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into sick_leaves("
                    + "reason"
                    + ",date_of_leave"
                    + ",half_day_am"
                    + ",half_day_pm"
                    + ",employee_name"
                    + ",employee_id"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ")values("
                    + ":reason"
                    + ",:date_of_leave"
                    + ",:half_day_am"
                    + ",:half_day_pm"
                    + ",:employee_name"
                    + ",:employee_id"
                    + ",:date_added"
                    + ",:user_id"
                    + ",:user_screen_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reason", to_sick_leaves.reason)
                    .setString("date_of_leave", to_sick_leaves.date_of_leave)
                    .setNumber("half_day_am", to_sick_leaves.half_day_am)
                    .setNumber("half_day_pm", to_sick_leaves.half_day_pm)
                    .setString("employee_name", to_sick_leaves.employee_name)
                    .setString("employee_id", to_sick_leaves.employee_id)
                    .setString("date_added", to_sick_leaves.date_added)
                    .setString("user_id", to_sick_leaves.user_id)
                    .setString("user_screen_name", to_sick_leaves.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leaves.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_sick_leaves to_sick_leaves) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update sick_leaves set "
                    + "reason= :reason "
                    + ",date_of_leave= :date_of_leave "
                    + ",half_day_am= :half_day_am "
                    + ",half_day_pm= :half_day_pm "
                    + ",employee_name= :employee_name "
                    + ",employee_id= :employee_id "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + " where id='" + to_sick_leaves.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reason", to_sick_leaves.reason)
                    .setString("date_of_leave", to_sick_leaves.date_of_leave)
                    .setNumber("half_day_am", to_sick_leaves.half_day_am)
                    .setNumber("half_day_pm", to_sick_leaves.half_day_pm)
                    .setString("employee_name", to_sick_leaves.employee_name)
                    .setString("employee_id", to_sick_leaves.employee_id)
                    .setString("date_added", to_sick_leaves.date_added)
                    .setString("user_id", to_sick_leaves.user_id)
                    .setString("user_screen_name", to_sick_leaves.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leaves.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_sick_leaves to_sick_leaves) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from sick_leaves  "
                    + " where id='" + to_sick_leaves.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leaves.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from sick_leaves  "
                    + " "+where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leaves.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_sick_leaves> ret_data(String where) {
        List<to_sick_leaves> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reason"
                    + ",date_of_leave"
                    + ",half_day_am"
                    + ",half_day_pm"
                    + ",employee_name"
                    + ",employee_id"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + " from sick_leaves"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reason = rs.getString(2);
                String date_of_leave = rs.getString(3);
                int half_day_am = rs.getInt(4);
                int half_day_pm = rs.getInt(5);
                String employee_name = rs.getString(6);
                String employee_id = rs.getString(7);
                String date_added = rs.getString(8);
                String user_id = rs.getString(9);
                String user_screen_name = rs.getString(10);

                to_sick_leaves to = new to_sick_leaves(id, reason, date_of_leave, half_day_am, half_day_pm, employee_name, employee_id, date_added, user_id, user_screen_name);
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
