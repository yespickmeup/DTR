/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.departments;

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
public class Departments {

    public static class to_departments {

        public final int id;
        public final String department;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;

        public to_departments(int id, String department, String date_added, String user_id, String user_screen_name) {
            this.id = id;
            this.department = department;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
        }
    }

    public static void add_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into departments("
                    + "department"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ")values("
                    + ":department"
                    + ",:date_added"
                    + ",:user_id"
                    + ",:user_screen_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department", to_departments.department)
                    .setString("date_added", to_departments.date_added)
                    .setString("user_id", to_departments.user_id)
                    .setString("user_screen_name", to_departments.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update departments set "
                    + "department= :department "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + " where id='" + to_departments.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("department", to_departments.department)
                    .setString("date_added", to_departments.date_added)
                    .setString("user_id", to_departments.user_id)
                    .setString("user_screen_name", to_departments.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_departments to_departments) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from departments  "
                    + " where id='" + to_departments.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Departments.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_departments> ret_data(String where) {
        List<to_departments> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",department"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + " from departments"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String department = rs.getString(2);
                String date_added = rs.getString(3);
                String user_id = rs.getString(4);
                String user_screen_name = rs.getString(5);

                to_departments to = new to_departments(id, department, date_added, user_id, user_screen_name);
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
