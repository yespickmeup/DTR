/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.employee_shifts;

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
public class Employee_shifts {

    public static class to_employee_shifts {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String emp_id;
        public final String emp_name;
        public final String shift;
        public final String shift_date;

        public to_employee_shifts(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String emp_id, String emp_name, String shift, String shift_date) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.emp_id = emp_id;
            this.emp_name = emp_name;
            this.shift = shift;
            this.shift_date = shift_date;
        }
    }

    public static void add_data(to_employee_shifts to_employee_shifts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into employee_shifts("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",emp_id"
                    + ",emp_name"
                    + ",shift"
                    + ",shift_date"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:emp_id"
                    + ",:emp_name"
                    + ",:shift"
                    + ",:shift_date"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_employee_shifts.created_at)
                    .setString("updated_at", to_employee_shifts.updated_at)
                    .setString("created_by", to_employee_shifts.created_by)
                    .setString("updated_by", to_employee_shifts.updated_by)
                    .setNumber("status", to_employee_shifts.status)
                    .setString("emp_id", to_employee_shifts.emp_id)
                    .setString("emp_name", to_employee_shifts.emp_name)
                    .setString("shift", to_employee_shifts.shift)
                    .setString("shift_date", to_employee_shifts.shift_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifts.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_employee_shifts to_employee_shifts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update employee_shifts set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",emp_id= :emp_id "
                    + ",emp_name= :emp_name "
                    + ",shift= :shift "
                    + ",shift_date= :shift_date "
                    + " where id='" + to_employee_shifts.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_employee_shifts.created_at)
                    .setString("updated_at", to_employee_shifts.updated_at)
                    .setString("created_by", to_employee_shifts.created_by)
                    .setString("updated_by", to_employee_shifts.updated_by)
                    .setNumber("status", to_employee_shifts.status)
                    .setString("emp_id", to_employee_shifts.emp_id)
                    .setString("emp_name", to_employee_shifts.emp_name)
                    .setString("shift", to_employee_shifts.shift)
                    .setString("shift_date", to_employee_shifts.shift_date)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifts.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_employee_shifts to_employee_shifts) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from employee_shifts  "
                    + " where id='" + to_employee_shifts.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(String where) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from employee_shifts  "
                    + " "+where;

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifts.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_employee_shifts> ret_data(String where) {
        List<to_employee_shifts> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",emp_id"
                    + ",emp_name"
                    + ",shift"
                    + ",shift_date"
                    + " from employee_shifts"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String created_at = rs.getString(2);
                String updated_at = rs.getString(3);
                String created_by = rs.getString(4);
                String updated_by = rs.getString(5);
                int status = rs.getInt(6);
                String emp_id = rs.getString(7);
                String emp_name = rs.getString(8);
                String shift = rs.getString(9);
                String shift_date = rs.getString(10);

                to_employee_shifts to = new to_employee_shifts(id, created_at, updated_at, created_by, updated_by, status, emp_id, emp_name, shift, shift_date);
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
