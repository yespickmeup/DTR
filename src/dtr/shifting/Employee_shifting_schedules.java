/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting;

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
public class Employee_shifting_schedules {

    public static class to_employee_shifting_schedules {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String emp_id;
        public final String emp_name;
        public final String mon_shift;
        public final String mon_shift_id;
        public final String tue_shift;
        public final String tue_shift_id;
        public final String wed_shift;
        public final String wed_shift_id;
        public final String thu_shift;
        public final String thu_shfit_id;
        public final String fri_shift;
        public final String fri_shift_id;
        public final String sat_shift;
        public final String sat_shift_id;
        public final String sun_shift;
        public final String sun_shift_id;

        public to_employee_shifting_schedules(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String emp_id, String emp_name, String mon_shift, String mon_shift_id, String tue_shift, String tue_shift_id, String wed_shift, String wed_shift_id, String thu_shift, String thu_shfit_id, String fri_shift, String fri_shift_id, String sat_shift, String sat_shift_id, String sun_shift, String sun_shift_id) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.emp_id = emp_id;
            this.emp_name = emp_name;
            this.mon_shift = mon_shift;
            this.mon_shift_id = mon_shift_id;
            this.tue_shift = tue_shift;
            this.tue_shift_id = tue_shift_id;
            this.wed_shift = wed_shift;
            this.wed_shift_id = wed_shift_id;
            this.thu_shift = thu_shift;
            this.thu_shfit_id = thu_shfit_id;
            this.fri_shift = fri_shift;
            this.fri_shift_id = fri_shift_id;
            this.sat_shift = sat_shift;
            this.sat_shift_id = sat_shift_id;
            this.sun_shift = sun_shift;
            this.sun_shift_id = sun_shift_id;
        }
    }

    public static void add_data(to_employee_shifting_schedules to_employee_shifting_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into employee_shifting_schedules("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",emp_id"
                    + ",emp_name"
                    + ",mon_shift"
                    + ",mon_shift_id"
                    + ",tue_shift"
                    + ",tue_shift_id"
                    + ",wed_shift"
                    + ",wed_shift_id"
                    + ",thu_shift"
                    + ",thu_shfit_id"
                    + ",fri_shift"
                    + ",fri_shift_id"
                    + ",sat_shift"
                    + ",sat_shift_id"
                    + ",sun_shift"
                    + ",sun_shift_id"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:emp_id"
                    + ",:emp_name"
                    + ",:mon_shift"
                    + ",:mon_shift_id"
                    + ",:tue_shift"
                    + ",:tue_shift_id"
                    + ",:wed_shift"
                    + ",:wed_shift_id"
                    + ",:thu_shift"
                    + ",:thu_shfit_id"
                    + ",:fri_shift"
                    + ",:fri_shift_id"
                    + ",:sat_shift"
                    + ",:sat_shift_id"
                    + ",:sun_shift"
                    + ",:sun_shift_id"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_employee_shifting_schedules.created_at)
                    .setString("updated_at", to_employee_shifting_schedules.updated_at)
                    .setString("created_by", to_employee_shifting_schedules.created_by)
                    .setString("updated_by", to_employee_shifting_schedules.updated_by)
                    .setNumber("status", to_employee_shifting_schedules.status)
                    .setString("emp_id", to_employee_shifting_schedules.emp_id)
                    .setString("emp_name", to_employee_shifting_schedules.emp_name)
                    .setString("mon_shift", to_employee_shifting_schedules.mon_shift)
                    .setString("mon_shift_id", to_employee_shifting_schedules.mon_shift_id)
                    .setString("tue_shift", to_employee_shifting_schedules.tue_shift)
                    .setString("tue_shift_id", to_employee_shifting_schedules.tue_shift_id)
                    .setString("wed_shift", to_employee_shifting_schedules.wed_shift)
                    .setString("wed_shift_id", to_employee_shifting_schedules.wed_shift_id)
                    .setString("thu_shift", to_employee_shifting_schedules.thu_shift)
                    .setString("thu_shfit_id", to_employee_shifting_schedules.thu_shfit_id)
                    .setString("fri_shift", to_employee_shifting_schedules.fri_shift)
                    .setString("fri_shift_id", to_employee_shifting_schedules.fri_shift_id)
                    .setString("sat_shift", to_employee_shifting_schedules.sat_shift)
                    .setString("sat_shift_id", to_employee_shifting_schedules.sat_shift_id)
                    .setString("sun_shift", to_employee_shifting_schedules.sun_shift)
                    .setString("sun_shift_id", to_employee_shifting_schedules.sun_shift_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifting_schedules.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_employee_shifting_schedules to_employee_shifting_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update employee_shifting_schedules set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",emp_id= :emp_id "
                    + ",emp_name= :emp_name "
                    + ",mon_shift= :mon_shift "
                    + ",mon_shift_id= :mon_shift_id "
                    + ",tue_shift= :tue_shift "
                    + ",tue_shift_id= :tue_shift_id "
                    + ",wed_shift= :wed_shift "
                    + ",wed_shift_id= :wed_shift_id "
                    + ",thu_shift= :thu_shift "
                    + ",thu_shfit_id= :thu_shfit_id "
                    + ",fri_shift= :fri_shift "
                    + ",fri_shift_id= :fri_shift_id "
                    + ",sat_shift= :sat_shift "
                    + ",sat_shift_id= :sat_shift_id "
                    + ",sun_shift= :sun_shift "
                    + ",sun_shift_id= :sun_shift_id "
                    + " where id='" + to_employee_shifting_schedules.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_employee_shifting_schedules.created_at)
                    .setString("updated_at", to_employee_shifting_schedules.updated_at)
                    .setString("created_by", to_employee_shifting_schedules.created_by)
                    .setString("updated_by", to_employee_shifting_schedules.updated_by)
                    .setNumber("status", to_employee_shifting_schedules.status)
                    .setString("emp_id", to_employee_shifting_schedules.emp_id)
                    .setString("emp_name", to_employee_shifting_schedules.emp_name)
                    .setString("mon_shift", to_employee_shifting_schedules.mon_shift)
                    .setString("mon_shift_id", to_employee_shifting_schedules.mon_shift_id)
                    .setString("tue_shift", to_employee_shifting_schedules.tue_shift)
                    .setString("tue_shift_id", to_employee_shifting_schedules.tue_shift_id)
                    .setString("wed_shift", to_employee_shifting_schedules.wed_shift)
                    .setString("wed_shift_id", to_employee_shifting_schedules.wed_shift_id)
                    .setString("thu_shift", to_employee_shifting_schedules.thu_shift)
                    .setString("thu_shfit_id", to_employee_shifting_schedules.thu_shfit_id)
                    .setString("fri_shift", to_employee_shifting_schedules.fri_shift)
                    .setString("fri_shift_id", to_employee_shifting_schedules.fri_shift_id)
                    .setString("sat_shift", to_employee_shifting_schedules.sat_shift)
                    .setString("sat_shift_id", to_employee_shifting_schedules.sat_shift_id)
                    .setString("sun_shift", to_employee_shifting_schedules.sun_shift)
                    .setString("sun_shift_id", to_employee_shifting_schedules.sun_shift_id)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifting_schedules.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_employee_shifting_schedules to_employee_shifting_schedules) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from employee_shifting_schedules  "
                    + " where id='" + to_employee_shifting_schedules.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Employee_shifting_schedules.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_employee_shifting_schedules> ret_data_shifts(String where) {
        List<to_employee_shifting_schedules> datas = new ArrayList();

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
                    + ",mon_shift"
                    + ",mon_shift_id"
                    + ",tue_shift"
                    + ",tue_shift_id"
                    + ",wed_shift"
                    + ",wed_shift_id"
                    + ",thu_shift"
                    + ",thu_shfit_id"
                    + ",fri_shift"
                    + ",fri_shift_id"
                    + ",sat_shift"
                    + ",sat_shift_id"
                    + ",sun_shift"
                    + ",sun_shift_id"
                    + " from employee_shifting_schedules"
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
                String mon_shift = rs.getString(9);
                String mon_shift_id = rs.getString(10);
                String tue_shift = rs.getString(11);
                String tue_shift_id = rs.getString(12);
                String wed_shift = rs.getString(13);
                String wed_shift_id = rs.getString(14);
                String thu_shift = rs.getString(15);
                String thu_shfit_id = rs.getString(16);
                String fri_shift = rs.getString(17);
                String fri_shift_id = rs.getString(18);
                String sat_shift = rs.getString(19);
                String sat_shift_id = rs.getString(20);
                String sun_shift = rs.getString(21);
                String sun_shift_id = rs.getString(22);

                to_employee_shifting_schedules to = new to_employee_shifting_schedules(id, created_at, updated_at, created_by, updated_by, status, emp_id, emp_name, mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<Employee_shifting_schedules.to_employee_shifting_schedules> ret_data(String where) {
        List<Employee_shifting_schedules.to_employee_shifting_schedules> datas = new ArrayList();

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
                int id = 0;
                String employee_id = rs.getString(1);
                String fname = rs.getString(3);
                String mi = rs.getString(4);
                String lname = rs.getString(5);

                String name = lname + ", " + fname + " " + mi;
                String mon_shift = "";
                String mon_shift_id = "";
                String tue_shift = "";
                String tue_shift_id = "";
                String wed_shift = "";
                String wed_shift_id = "";
                String thu_shift = "";
                String thu_shfit_id = "";
                String fri_shift = "";
                String fri_shift_id = "";
                String sat_shift = "";
                String sat_shift_id = "";
                String sun_shift = "";
                String sun_shift_id = "";
                String created_at = "";
                String updated_at = "";
                String created_by = "";
                String updated_by = "";
                int status = 0;
                String where2 = " where emp_id ='" + employee_id + "' ";
                List<Employee_shifting_schedules.to_employee_shifting_schedules> s = ret_data_shifts(where2);
                if (s.isEmpty()) {
                    Employee_shifting_schedules.to_employee_shifting_schedules sched = new to_employee_shifting_schedules(0, created_at, updated_at, created_by, updated_by, status, employee_id, name, mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id);
                    datas.add(sched);
                } else {
                    datas.add(s.get(0));
                }
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_employee_shifting_schedules> ret_data2(String where) {
        List<to_employee_shifting_schedules> datas = new ArrayList();

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
                    + ",mon_shift"
                    + ",mon_shift_id"
                    + ",tue_shift"
                    + ",tue_shift_id"
                    + ",wed_shift"
                    + ",wed_shift_id"
                    + ",thu_shift"
                    + ",thu_shfit_id"
                    + ",fri_shift"
                    + ",fri_shift_id"
                    + ",sat_shift"
                    + ",sat_shift_id"
                    + ",sun_shift"
                    + ",sun_shift_id"
                    + " from employee_shifting_schedules"
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
                String mon_shift = rs.getString(9);
                String mon_shift_id = rs.getString(10);
                String tue_shift = rs.getString(11);
                String tue_shift_id = rs.getString(12);
                String wed_shift = rs.getString(13);
                String wed_shift_id = rs.getString(14);
                String thu_shift = rs.getString(15);
                String thu_shfit_id = rs.getString(16);
                String fri_shift = rs.getString(17);
                String fri_shift_id = rs.getString(18);
                String sat_shift = rs.getString(19);
                String sat_shift_id = rs.getString(20);
                String sun_shift = rs.getString(21);
                String sun_shift_id = rs.getString(22);

                to_employee_shifting_schedules to = new to_employee_shifting_schedules(id, created_at, updated_at, created_by, updated_by, status, emp_id, emp_name, mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id);
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
