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
public class Shiftings {

    public static class to_shiftings {

        public final int id;
        public final String shift;
        public final String am_12;
        public final String am_1;
        public final String am_2;
        public final String am_3;
        public final String am_4;
        public final String am_5;
        public final String am_6;
        public final String am_7;
        public final String am_8;
        public final String am_9;
        public final String am_10;
        public final String am_11;
        public final String pm_12;
        public final String pm_1;
        public final String pm_2;
        public final String pm_3;
        public final String pm4;
        public final String pm_5;
        public final String pm_6;
        public final String pm_7;
        public final String pm_8;
        public final String pm_9;
        public final String pm_10;
        public final String pm_11;
        public final int status;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;

        public to_shiftings(int id, String shift, String am_12, String am_1, String am_2, String am_3, String am_4, String am_5, String am_6, String am_7, String am_8, String am_9, String am_10, String am_11, String pm_12, String pm_1, String pm_2, String pm_3, String pm4, String pm_5, String pm_6, String pm_7, String pm_8, String pm_9, String pm_10, String pm_11, int status, String created_at, String updated_at, String created_by, String updated_by) {
            this.id = id;
            this.shift = shift;
            this.am_12 = am_12;
            this.am_1 = am_1;
            this.am_2 = am_2;
            this.am_3 = am_3;
            this.am_4 = am_4;
            this.am_5 = am_5;
            this.am_6 = am_6;
            this.am_7 = am_7;
            this.am_8 = am_8;
            this.am_9 = am_9;
            this.am_10 = am_10;
            this.am_11 = am_11;
            this.pm_12 = pm_12;
            this.pm_1 = pm_1;
            this.pm_2 = pm_2;
            this.pm_3 = pm_3;
            this.pm4 = pm4;
            this.pm_5 = pm_5;
            this.pm_6 = pm_6;
            this.pm_7 = pm_7;
            this.pm_8 = pm_8;
            this.pm_9 = pm_9;
            this.pm_10 = pm_10;
            this.pm_11 = pm_11;
            this.status = status;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
        }
    }

    public static void add_data(to_shiftings to_shiftings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into shiftings("
                    + "shift"
                    + ",am_12"
                    + ",am_1"
                    + ",am_2"
                    + ",am_3"
                    + ",am_4"
                    + ",am_5"
                    + ",am_6"
                    + ",am_7"
                    + ",am_8"
                    + ",am_9"
                    + ",am_10"
                    + ",am_11"
                    + ",pm_12"
                    + ",pm_1"
                    + ",pm_2"
                    + ",pm_3"
                    + ",pm4"
                    + ",pm_5"
                    + ",pm_6"
                    + ",pm_7"
                    + ",pm_8"
                    + ",pm_9"
                    + ",pm_10"
                    + ",pm_11"
                    + ",status"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ")values("
                    + ":shift"
                    + ",:am_12"
                    + ",:am_1"
                    + ",:am_2"
                    + ",:am_3"
                    + ",:am_4"
                    + ",:am_5"
                    + ",:am_6"
                    + ",:am_7"
                    + ",:am_8"
                    + ",:am_9"
                    + ",:am_10"
                    + ",:am_11"
                    + ",:pm_12"
                    + ",:pm_1"
                    + ",:pm_2"
                    + ",:pm_3"
                    + ",:pm4"
                    + ",:pm_5"
                    + ",:pm_6"
                    + ",:pm_7"
                    + ",:pm_8"
                    + ",:pm_9"
                    + ",:pm_10"
                    + ",:pm_11"
                    + ",:status"
                    + ",:created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("shift", to_shiftings.shift)
                    .setString("am_12", to_shiftings.am_12)
                    .setString("am_1", to_shiftings.am_1)
                    .setString("am_2", to_shiftings.am_2)
                    .setString("am_3", to_shiftings.am_3)
                    .setString("am_4", to_shiftings.am_4)
                    .setString("am_5", to_shiftings.am_5)
                    .setString("am_6", to_shiftings.am_6)
                    .setString("am_7", to_shiftings.am_7)
                    .setString("am_8", to_shiftings.am_8)
                    .setString("am_9", to_shiftings.am_9)
                    .setString("am_10", to_shiftings.am_10)
                    .setString("am_11", to_shiftings.am_11)
                    .setString("pm_12", to_shiftings.pm_12)
                    .setString("pm_1", to_shiftings.pm_1)
                    .setString("pm_2", to_shiftings.pm_2)
                    .setString("pm_3", to_shiftings.pm_3)
                    .setString("pm4", to_shiftings.pm4)
                    .setString("pm_5", to_shiftings.pm_5)
                    .setString("pm_6", to_shiftings.pm_6)
                    .setString("pm_7", to_shiftings.pm_7)
                    .setString("pm_8", to_shiftings.pm_8)
                    .setString("pm_9", to_shiftings.pm_9)
                    .setString("pm_10", to_shiftings.pm_10)
                    .setString("pm_11", to_shiftings.pm_11)
                    .setNumber("status", to_shiftings.status)
                    .setString("created_at", to_shiftings.created_at)
                    .setString("updated_at", to_shiftings.updated_at)
                    .setString("created_by", to_shiftings.created_by)
                    .setString("updated_by", to_shiftings.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shiftings.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_shiftings to_shiftings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update shiftings set "
                    + "shift= :shift "
                    + ",am_12= :am_12 "
                    + ",am_1= :am_1 "
                    + ",am_2= :am_2 "
                    + ",am_3= :am_3 "
                    + ",am_4= :am_4 "
                    + ",am_5= :am_5 "
                    + ",am_6= :am_6 "
                    + ",am_7= :am_7 "
                    + ",am_8= :am_8 "
                    + ",am_9= :am_9 "
                    + ",am_10= :am_10 "
                    + ",am_11= :am_11 "
                    + ",pm_12= :pm_12 "
                    + ",pm_1= :pm_1 "
                    + ",pm_2= :pm_2 "
                    + ",pm_3= :pm_3 "
                    + ",pm4= :pm4 "
                    + ",pm_5= :pm_5 "
                    + ",pm_6= :pm_6 "
                    + ",pm_7= :pm_7 "
                    + ",pm_8= :pm_8 "
                    + ",pm_9= :pm_9 "
                    + ",pm_10= :pm_10 "
                    + ",pm_11= :pm_11 "
                    + ",status= :status "
                    + ",created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + " where id='" + to_shiftings.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("shift", to_shiftings.shift)
                    .setString("am_12", to_shiftings.am_12)
                    .setString("am_1", to_shiftings.am_1)
                    .setString("am_2", to_shiftings.am_2)
                    .setString("am_3", to_shiftings.am_3)
                    .setString("am_4", to_shiftings.am_4)
                    .setString("am_5", to_shiftings.am_5)
                    .setString("am_6", to_shiftings.am_6)
                    .setString("am_7", to_shiftings.am_7)
                    .setString("am_8", to_shiftings.am_8)
                    .setString("am_9", to_shiftings.am_9)
                    .setString("am_10", to_shiftings.am_10)
                    .setString("am_11", to_shiftings.am_11)
                    .setString("pm_12", to_shiftings.pm_12)
                    .setString("pm_1", to_shiftings.pm_1)
                    .setString("pm_2", to_shiftings.pm_2)
                    .setString("pm_3", to_shiftings.pm_3)
                    .setString("pm4", to_shiftings.pm4)
                    .setString("pm_5", to_shiftings.pm_5)
                    .setString("pm_6", to_shiftings.pm_6)
                    .setString("pm_7", to_shiftings.pm_7)
                    .setString("pm_8", to_shiftings.pm_8)
                    .setString("pm_9", to_shiftings.pm_9)
                    .setString("pm_10", to_shiftings.pm_10)
                    .setString("pm_11", to_shiftings.pm_11)
                    .setNumber("status", to_shiftings.status)
                    .setString("created_at", to_shiftings.created_at)
                    .setString("updated_at", to_shiftings.updated_at)
                    .setString("created_by", to_shiftings.created_by)
                    .setString("updated_by", to_shiftings.updated_by)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shiftings.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_shiftings to_shiftings) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from shiftings  "
                    + " where id='" + to_shiftings.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shiftings.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_shiftings> ret_data(String where) {
        List<to_shiftings> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",shift"
                    + ",am_12"
                    + ",am_1"
                    + ",am_2"
                    + ",am_3"
                    + ",am_4"
                    + ",am_5"
                    + ",am_6"
                    + ",am_7"
                    + ",am_8"
                    + ",am_9"
                    + ",am_10"
                    + ",am_11"
                    + ",pm_12"
                    + ",pm_1"
                    + ",pm_2"
                    + ",pm_3"
                    + ",pm4"
                    + ",pm_5"
                    + ",pm_6"
                    + ",pm_7"
                    + ",pm_8"
                    + ",pm_9"
                    + ",pm_10"
                    + ",pm_11"
                    + ",status"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + " from shiftings"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String shift = rs.getString(2);
                String am_12 = rs.getString(3);
                String am_1 = rs.getString(4);
                String am_2 = rs.getString(5);
                String am_3 = rs.getString(6);
                String am_4 = rs.getString(7);
                String am_5 = rs.getString(8);
                String am_6 = rs.getString(9);
                String am_7 = rs.getString(10);
                String am_8 = rs.getString(11);
                String am_9 = rs.getString(12);
                String am_10 = rs.getString(13);
                String am_11 = rs.getString(14);
                String pm_12 = rs.getString(15);
                String pm_1 = rs.getString(16);
                String pm_2 = rs.getString(17);
                String pm_3 = rs.getString(18);
                String pm4 = rs.getString(19);
                String pm_5 = rs.getString(20);
                String pm_6 = rs.getString(21);
                String pm_7 = rs.getString(22);
                String pm_8 = rs.getString(23);
                String pm_9 = rs.getString(24);
                String pm_10 = rs.getString(25);
                String pm_11 = rs.getString(26);
                int status = rs.getInt(27);
                String created_at = rs.getString(28);
                String updated_at = rs.getString(29);
                String created_by = rs.getString(30);
                String updated_by = rs.getString(31);

                to_shiftings to = new to_shiftings(id, shift, am_12, am_1, am_2, am_3, am_4, am_5, am_6, am_7, am_8, am_9, am_10, am_11, pm_12, pm_1, pm_2, pm_3, pm4, pm_5, pm_6, pm_7, pm_8, pm_9, pm_10, pm_11, status, created_at, updated_at, created_by, updated_by);
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
