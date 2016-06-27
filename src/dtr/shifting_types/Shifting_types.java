/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting_types;

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
public class Shifting_types {

    public static class shifts {

        public final String name;
        public final String[] time;

        public shifts(String name, String[] time) {
            this.name = name;
            this.time = time;
        }

    }

    public static class to_shifting_types {

        public final int id;
        public final String created_at;
        public final String updated_at;
        public final String created_by;
        public final String updated_by;
        public final int status;
        public final String shift_name;
        public final String shift_starts;
        public final String shift_ends;

        public to_shifting_types(int id, String created_at, String updated_at, String created_by, String updated_by, int status, String shift_name, String shift_starts, String shift_ends) {
            this.id = id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.created_by = created_by;
            this.updated_by = updated_by;
            this.status = status;
            this.shift_name = shift_name;
            this.shift_starts = shift_starts;
            this.shift_ends = shift_ends;
        }
    }

    public static void add_data(to_shifting_types to_shifting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into shifting_types("
                    + "created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",shift_name"
                    + ",shift_starts"
                    + ",shift_ends"
                    + ")values("
                    + ":created_at"
                    + ",:updated_at"
                    + ",:created_by"
                    + ",:updated_by"
                    + ",:status"
                    + ",:shift_name"
                    + ",:shift_starts"
                    + ",:shift_ends"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_shifting_types.created_at)
                    .setString("updated_at", to_shifting_types.updated_at)
                    .setString("created_by", to_shifting_types.created_by)
                    .setString("updated_by", to_shifting_types.updated_by)
                    .setNumber("status", to_shifting_types.status)
                    .setString("shift_name", to_shifting_types.shift_name)
                    .setString("shift_starts", to_shifting_types.shift_starts)
                    .setString("shift_ends", to_shifting_types.shift_ends)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shifting_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_shifting_types to_shifting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update shifting_types set "
                    + "created_at= :created_at "
                    + ",updated_at= :updated_at "
                    + ",created_by= :created_by "
                    + ",updated_by= :updated_by "
                    + ",status= :status "
                    + ",shift_name= :shift_name "
                    + ",shift_starts= :shift_starts "
                    + ",shift_ends= :shift_ends "
                    + " where id='" + to_shifting_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("created_at", to_shifting_types.created_at)
                    .setString("updated_at", to_shifting_types.updated_at)
                    .setString("created_by", to_shifting_types.created_by)
                    .setString("updated_by", to_shifting_types.updated_by)
                    .setNumber("status", to_shifting_types.status)
                    .setString("shift_name", to_shifting_types.shift_name)
                    .setString("shift_starts", to_shifting_types.shift_starts)
                    .setString("shift_ends", to_shifting_types.shift_ends)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shifting_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_shifting_types to_shifting_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from shifting_types  "
                    + " where id='" + to_shifting_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Shifting_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_shifting_types> ret_data(String where) {
        List<to_shifting_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",created_at"
                    + ",updated_at"
                    + ",created_by"
                    + ",updated_by"
                    + ",status"
                    + ",shift_name"
                    + ",shift_starts"
                    + ",shift_ends"
                    + " from shifting_types"
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
                String shift_name = rs.getString(7);
                String shift_starts = rs.getString(8);
                String shift_ends = rs.getString(9);

                to_shifting_types to = new to_shifting_types(id, created_at, updated_at, created_by, updated_by, status, shift_name, shift_starts, shift_ends);
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
