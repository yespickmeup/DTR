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
public class Holidays {

    public static class to_holidays {

        public final int id;
        public final String holiday;
        public final String date_of_holiday;
        public final int half_day_am;
        public final int half_day_pm;
        public final String date_added;
        public final String user_id;
        public final String user_screen_name;

        public to_holidays(int id, String holiday, String date_of_holiday, int half_day_am, int half_day_pm, String date_added, String user_id, String user_screen_name) {
            this.id = id;
            this.holiday = holiday;
            this.date_of_holiday = date_of_holiday;
            this.half_day_am = half_day_am;
            this.half_day_pm = half_day_pm;
            this.date_added = date_added;
            this.user_id = user_id;
            this.user_screen_name = user_screen_name;
        }
    }

    public static void add_data(to_holidays to_holidays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into holidays("
                    + "holiday"
                    + ",date_of_holiday"
                    + ",half_day_am"
                    + ",half_day_pm"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + ")values("
                    + ":holiday"
                    + ",:date_of_holiday"
                    + ",:half_day_am"
                    + ",:half_day_pm"
                    + ",:date_added"
                    + ",:user_id"
                    + ",:user_screen_name"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("holiday", to_holidays.holiday)
                    .setString("date_of_holiday", to_holidays.date_of_holiday)
                    .setNumber("half_day_am", to_holidays.half_day_am)
                    .setNumber("half_day_pm", to_holidays.half_day_pm)
                    .setString("date_added", to_holidays.date_added)
                    .setString("user_id", to_holidays.user_id)
                    .setString("user_screen_name", to_holidays.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holidays.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void update_data(to_holidays to_holidays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update holidays set "
                    + "holiday= :holiday "
                    + ",date_of_holiday= :date_of_holiday "
                    + ",half_day_am= :half_day_am "
                    + ",half_day_pm= :half_day_pm "
                    + ",date_added= :date_added "
                    + ",user_id= :user_id "
                    + ",user_screen_name= :user_screen_name "
                    + " where id='" + to_holidays.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("holiday", to_holidays.holiday)
                    .setString("date_of_holiday", to_holidays.date_of_holiday)
                    .setNumber("half_day_am", to_holidays.half_day_am)
                    .setNumber("half_day_pm", to_holidays.half_day_pm)
                    .setString("date_added", to_holidays.date_added)
                    .setString("user_id", to_holidays.user_id)
                    .setString("user_screen_name", to_holidays.user_screen_name)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holidays.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_data(to_holidays to_holidays) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from holidays  "
                    + " where id='" + to_holidays.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(Holidays.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_holidays> ret_data(String where) {
        List<to_holidays> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",holiday"
                    + ",date_of_holiday"
                    + ",half_day_am"
                    + ",half_day_pm"
                    + ",date_added"
                    + ",user_id"
                    + ",user_screen_name"
                    + " from holidays"
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String holiday = rs.getString(2);
                String date_of_holiday = rs.getString(3);
                int half_day_am = rs.getInt(4);
                int half_day_pm = rs.getInt(5);
                String date_added = rs.getString(6);
                String user_id = rs.getString(7);
                String user_screen_name = rs.getString(8);

                to_holidays to = new to_holidays(id, holiday, date_of_holiday, half_day_am, half_day_pm, date_added, user_id, user_screen_name);
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
