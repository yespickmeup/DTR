/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.holidays;

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
public class Holiday_types {

    public static class to_holiday_types {

        public final int id;
        public final String holiday_type;

        public to_holiday_types(int id, String holiday_type) {
            this.id = id;
            this.holiday_type = holiday_type;
        }
    }

    public static void add_data(to_holiday_types to_holiday_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into holiday_types("
                    + "holiday_type"
                    + ")values("
                    + ":holiday_type"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("holiday_type", to_holiday_types.holiday_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holiday_types.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_holiday_types to_holiday_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update holiday_types set "
                    + "holiday_type= :holiday_type "
                    + " where id='" + to_holiday_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("holiday_type", to_holiday_types.holiday_type)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holiday_types.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_holiday_types to_holiday_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from holiday_types  "
                    + " where id='" + to_holiday_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holiday_types.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_holiday_types> ret_data(String where) {
        List<to_holiday_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",holiday_type"
                    + " from holiday_types"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String holiday_type = rs.getString(2);

                to_holiday_types to = new to_holiday_types(id, holiday_type);
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
