/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.employees;

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
public class Employees {

    public static class to_employees {

        public final int id;
        public final String employee_id;
        public final String fname;
        public final String mi;
        public final String lname;
        public final String contact_no;
        public final String address;
        public final String department;
        public final String department_id;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;
        public final String shift;
        public final String shift_id;
        public final String supervisor;
        public final String manager;
        public to_employees(int id, String employee_id, String fname, String mi, String lname, String contact_no, String address, String department, String department_id, String date_added, String user_id, String user_screen_name, String shift, String shift_id, String supervisor,String manager) {
            this.id = id;
            this.employee_id = employee_id;
            this.fname = fname;
            this.mi = mi;
            this.lname = lname;
            this.contact_no = contact_no;
            this.address = address;
            this.department = department;
            this.department_id = department_id;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
            this.shift = shift;
            this.shift_id = shift_id;
            this.supervisor = supervisor;
            this.manager=manager;
        }
    }

    public static void add_data(to_employees to_employees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into employees("
                    + "employee_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",contact_no"
                    + ",address"
                    + ",department"
                    + ",department_id"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ",shift"
                    + ",shift_id"
                    + ",supervisor"
                    + ",manager"
                    + ")values("
                    + ":employee_id"
                    + ",:fname"
                    + ",:mi"
                    + ",:lname"
                    + ",:contact_no"
                    + ",:address"
                    + ",:department"
                    + ",:department_id"
                    + ",:date_added"
                    + ",:user_id"
                    + ",:user_screen_name"
                    + ",:shift"
                    + ",:shift_id"
                    + ",:supervisor"
                    + ",:manager"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("employee_id", to_employees.employee_id)
                    .setString("fname", to_employees.fname)
                    .setString("mi", to_employees.mi)
                    .setString("lname", to_employees.lname)
                    .setString("contact_no", to_employees.contact_no)
                    .setString("address", to_employees.address)
                    .setString("department", to_employees.department)
                    .setString("department_id", to_employees.department_id)
                    .setString("date_added", to_employees.date_added)
                    .setString("user_id", to_employees.user_id)
                    .setString("user_screen_name", to_employees.user_screen_name)
                    .setString("shift", to_employees.shift)
                    .setString("shift_id", to_employees.shift_id)
                    .setString("supervisor", to_employees.supervisor)
                    .setString("manager",to_employees.manager)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employees.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_employees to_employees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update employees set "
                    + "employee_id= :employee_id "
                    + ",fname= :fname "
                    + ",mi= :mi "
                    + ",lname= :lname "
                    + ",contact_no= :contact_no "
                    + ",address= :address "
                    + ",department= :department "
                    + ",department_id= :department_id "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + ",shift= :shift"
                    + ",shift_id= :shift_id"
                    + ",supervisor= :supervisor"
                    + ",manager= :manager"
                    + " where id='" + to_employees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("employee_id", to_employees.employee_id)
                    .setString("fname", to_employees.fname)
                    .setString("mi", to_employees.mi)
                    .setString("lname", to_employees.lname)
                    .setString("contact_no", to_employees.contact_no)
                    .setString("address", to_employees.address)
                    .setString("department", to_employees.department)
                    .setString("department_id", to_employees.department_id)
                    .setString("date_added", to_employees.date_added)
                    .setString("user_id", to_employees.user_id)
                    .setString("user_screen_name", to_employees.user_screen_name)
                    .setString("shift", to_employees.shift)
                    .setString("shift_id", to_employees.shift_id)
                    .setString("supervisor", to_employees.supervisor)
                    .setString("manager",to_employees.manager)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_id(to_employees to_employees, int new_id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update employees set "
                    + " id= :id "
                    + " where id='" + to_employees.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setNumber("id", new_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employees.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_employees to_employees) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from employees  "
                    + " where id='" + to_employees.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employees.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_employees> ret_data(String where) {
        List<to_employees> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",employee_id"
                    + ",fname"
                    + ",mi"
                    + ",lname"
                    + ",contact_no"
                    + ",address"
                    + ",department"
                    + ",department_id"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ",shift"
                    + ",shift_id"
                    + ",supervisor"
                    + ",manager"
                    + " from employees"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String employee_id = rs.getString(2);
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);
                String contact_no = rs.getString(6);
                String address = rs.getString(7);
                String department = rs.getString(8);
                String department_id = rs.getString(9);
                String date_added = rs.getString(10);
                String user_id = rs.getString(11);
                String user_screen_name = rs.getString(12);
                String shift = rs.getString(13);
                String shift_id = rs.getString(14);
                String supervisor=rs.getString(15);
                String manager=rs.getString(16);
                to_employees to = new to_employees(id, employee_id, fname, mi, lname, contact_no, address, department, department_id, date_added, user_id, user_screen_name, shift, shift_id,supervisor,manager);
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
