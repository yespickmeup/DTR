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
public class Sick_leave_reasons {

    public static class to_sick_leave_reasons {

        public final int id;
        public final String reason;

        public to_sick_leave_reasons(int id, String reason) {
            this.id = id;
            this.reason = reason;
        }
    }

    public static void add_data(to_sick_leave_reasons to_sick_leave_reasons) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into sick_leave_reasons("
                    + "reason"
                    + ")values("
                    + ":reason"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reason", to_sick_leave_reasons.reason)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leave_reasons.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_sick_leave_reasons to_sick_leave_reasons) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update sick_leave_reasons set "
                    + "reason= :reason "
                    + " where id='" + to_sick_leave_reasons.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("reason", to_sick_leave_reasons.reason)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leave_reasons.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_sick_leave_reasons to_sick_leave_reasons) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from sick_leave_reasons  "
                    + " where id='" + to_sick_leave_reasons.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Sick_leave_reasons.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_sick_leave_reasons> ret_data(String where) {
        List<to_sick_leave_reasons> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",reason"
                    + " from sick_leave_reasons"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String reason = rs.getString(2);

                to_sick_leave_reasons to = new to_sick_leave_reasons(id, reason);
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
