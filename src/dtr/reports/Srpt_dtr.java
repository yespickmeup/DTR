/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.reports;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Srpt_dtr {

    public final String dtr_date;
    public final String date_printed;
    public final String regular_day_am;
    public final String regular_day_pm;
    public final double total_hours;
    public final double total_minutes;
    public final List<field> fields;
    public final String two_nine;
    public final String thirty;
    public final String thirty_one;
    public final String verified_by;
    public final String in_charged;
    public final String user_home;
    public Srpt_dtr(String dtr_date, String date_printed, String regular_day_am, String regular_day_pm, double total_hours
            , double total_minutes, String two_nine, String thirty, String thirty_one, String verified_by, String in_charged,String user_home) {
        this.dtr_date = dtr_date;
        this.date_printed = date_printed;
        this.regular_day_am = regular_day_am;
        this.regular_day_pm = regular_day_pm;
        this.total_hours = total_hours;
        this.total_minutes = total_minutes;
        this.fields = new ArrayList();
        this.two_nine = two_nine;
        this.thirty = thirty;
        this.thirty_one = thirty_one;
        this.verified_by = verified_by;
        this.in_charged = in_charged;
        this.user_home=user_home;
    }

    public static class field {

        String employee_id;
        String employee_name;
        String aa1;
        String aa2;
        String aa3;
        String aa4;
        String aa5;
        String aa6;
        String aa7;
        String aa8;
        String aa9;
        String aa10;
        String aa11;
        String aa12;
        String aa13;
        String aa14;
        String aa15;
        String aa16;
        String aa17;
        String aa18;
        String aa19;
        String aa20;
        String aa21;
        String aa22;
        String aa23;
        String aa24;
        String aa25;
        String aa26;
        String aa27;
        String aa28;
        String aa29;
        String aa30;
        String aa31;
        String pd1;
        String pd2;
        String pd3;
        String pd4;
        String pd5;
        String pd6;
        String pd7;
        String pd8;
        String pd9;
        String pd10;
        String pd11;
        String pd12;
        String pd13;
        String pd14;
        String pd15;
        String pd16;
        String pd17;
        String pd18;
        String pd19;
        String pd20;
        String pd21;
        String pd22;
        String pd23;
        String pd24;
        String pd25;
        String pd26;
        String pd27;
        String pd28;
        String pd29;
        String pd30;
        String pd31;

        public field() {
        }

        public field(String employee_id, String employee_name, String aa1, String aa2, String aa3, String aa4, String aa5, String aa6, String aa7, String aa8, String aa9, String aa10, String aa11, String aa12, String aa13, String aa14, String aa15, String aa16, String aa17, String aa18, String aa19, String aa20, String aa21, String aa22, String aa23, String aa24, String aa25, String aa26, String aa27, String aa28, String aa29, String aa30, String aa31, String pd1, String pd2, String pd3, String pd4, String pd5, String pd6, String pd7, String pd8, String pd9, String pd10, String pd11, String pd12, String pd13, String pd14, String pd15, String pd16, String pd17, String pd18, String pd19, String pd20, String pd21, String pd22, String pd23, String pd24, String pd25, String pd26, String pd27, String pd28, String pd29, String pd30, String pd31) {
            this.employee_id = employee_id;
            this.employee_name = employee_name;
            this.aa1 = aa1;
            this.aa2 = aa2;
            this.aa3 = aa3;
            this.aa4 = aa4;
            this.aa5 = aa5;
            this.aa6 = aa6;
            this.aa7 = aa7;
            this.aa8 = aa8;
            this.aa9 = aa9;
            this.aa10 = aa10;
            this.aa11 = aa11;
            this.aa12 = aa12;
            this.aa13 = aa13;
            this.aa14 = aa14;
            this.aa15 = aa15;
            this.aa16 = aa16;
            this.aa17 = aa17;
            this.aa18 = aa18;
            this.aa19 = aa19;
            this.aa20 = aa20;
            this.aa21 = aa21;
            this.aa22 = aa22;
            this.aa23 = aa23;
            this.aa24 = aa24;
            this.aa25 = aa25;
            this.aa26 = aa26;
            this.aa27 = aa27;
            this.aa28 = aa28;
            this.aa29 = aa29;
            this.aa30 = aa30;
            this.aa31 = aa31;
            this.pd1 = pd1;
            this.pd2 = pd2;
            this.pd3 = pd3;
            this.pd4 = pd4;
            this.pd5 = pd5;
            this.pd6 = pd6;
            this.pd7 = pd7;
            this.pd8 = pd8;
            this.pd9 = pd9;
            this.pd10 = pd10;
            this.pd11 = pd11;
            this.pd12 = pd12;
            this.pd13 = pd13;
            this.pd14 = pd14;
            this.pd15 = pd15;
            this.pd16 = pd16;
            this.pd17 = pd17;
            this.pd18 = pd18;
            this.pd19 = pd19;
            this.pd20 = pd20;
            this.pd21 = pd21;
            this.pd22 = pd22;
            this.pd23 = pd23;
            this.pd24 = pd24;
            this.pd25 = pd25;
            this.pd26 = pd26;
            this.pd27 = pd27;
            this.pd28 = pd28;
            this.pd29 = pd29;
            this.pd30 = pd30;
            this.pd31 = pd31;
        }

        //<editor-fold defaultstate="collapsed" desc=" setter ">
        public String getEmployee_id() {
            return employee_id;
        }

        public void setEmployee_id(String employee_id) {
            this.employee_id = employee_id;
        }

        public String getEmployee_name() {
            return employee_name;
        }

        public void setEmployee_name(String employee_name) {
            this.employee_name = employee_name;
        }

        public String getAa1() {
            return aa1;
        }

        public void setAa1(String aa1) {
            this.aa1 = aa1;
        }

        public String getAa2() {
            return aa2;
        }

        public void setAa2(String aa2) {
            this.aa2 = aa2;
        }

        public String getAa3() {
            return aa3;
        }

        public void setAa3(String aa3) {
            this.aa3 = aa3;
        }

        public String getAa4() {
            return aa4;
        }

        public void setAa4(String aa4) {
            this.aa4 = aa4;
        }

        public String getAa5() {
            return aa5;
        }

        public void setAa5(String aa5) {
            this.aa5 = aa5;
        }

        public String getAa6() {
            return aa6;
        }

        public void setAa6(String aa6) {
            this.aa6 = aa6;
        }

        public String getAa7() {
            return aa7;
        }

        public void setAa7(String aa7) {
            this.aa7 = aa7;
        }

        public String getAa8() {
            return aa8;
        }

        public void setAa8(String aa8) {
            this.aa8 = aa8;
        }

        public String getAa9() {
            return aa9;
        }

        public void setAa9(String aa9) {
            this.aa9 = aa9;
        }

        public String getAa10() {
            return aa10;
        }

        public void setAa10(String aa10) {
            this.aa10 = aa10;
        }

        public String getAa11() {
            return aa11;
        }

        public void setAa11(String aa11) {
            this.aa11 = aa11;
        }

        public String getAa12() {
            return aa12;
        }

        public void setAa12(String aa12) {
            this.aa12 = aa12;
        }

        public String getAa13() {
            return aa13;
        }

        public void setAa13(String aa13) {
            this.aa13 = aa13;
        }

        public String getAa14() {
            return aa14;
        }

        public void setAa14(String aa14) {
            this.aa14 = aa14;
        }

        public String getAa15() {
            return aa15;
        }

        public void setAa15(String aa15) {
            this.aa15 = aa15;
        }

        public String getAa16() {
            return aa16;
        }

        public void setAa16(String aa16) {
            this.aa16 = aa16;
        }

        public String getAa17() {
            return aa17;
        }

        public void setAa17(String aa17) {
            this.aa17 = aa17;
        }

        public String getAa18() {
            return aa18;
        }

        public void setAa18(String aa18) {
            this.aa18 = aa18;
        }

        public String getAa19() {
            return aa19;
        }

        public void setAa19(String aa19) {
            this.aa19 = aa19;
        }

        public String getAa20() {
            return aa20;
        }

        public void setAa20(String aa20) {
            this.aa20 = aa20;
        }

        public String getAa21() {
            return aa21;
        }

        public void setAa21(String aa21) {
            this.aa21 = aa21;
        }

        public String getAa22() {
            return aa22;
        }

        public void setAa22(String aa22) {
            this.aa22 = aa22;
        }

        public String getAa23() {
            return aa23;
        }

        public void setAa23(String aa23) {
            this.aa23 = aa23;
        }

        public String getAa24() {
            return aa24;
        }

        public void setAa24(String aa24) {
            this.aa24 = aa24;
        }

        public String getAa25() {
            return aa25;
        }

        public void setAa25(String aa25) {
            this.aa25 = aa25;
        }

        public String getAa26() {
            return aa26;
        }

        public void setAa26(String aa26) {
            this.aa26 = aa26;
        }

        public String getAa27() {
            return aa27;
        }

        public void setAa27(String aa27) {
            this.aa27 = aa27;
        }

        public String getAa28() {
            return aa28;
        }

        public void setAa28(String aa28) {
            this.aa28 = aa28;
        }

        public String getAa29() {
            return aa29;
        }

        public void setAa29(String aa29) {
            this.aa29 = aa29;
        }

        public String getAa30() {
            return aa30;
        }

        public void setAa30(String aa30) {
            this.aa30 = aa30;
        }

        public String getAa31() {
            return aa31;
        }

        public void setAa31(String aa31) {
            this.aa31 = aa31;
        }

        public String getPd1() {
            return pd1;
        }

        public void setPd1(String pd1) {
            this.pd1 = pd1;
        }

        public String getPd2() {
            return pd2;
        }

        public void setPd2(String pd2) {
            this.pd2 = pd2;
        }

        public String getPd3() {
            return pd3;
        }

        public void setPd3(String pd3) {
            this.pd3 = pd3;
        }

        public String getPd4() {
            return pd4;
        }

        public void setPd4(String pd4) {
            this.pd4 = pd4;
        }

        public String getPd5() {
            return pd5;
        }

        public void setPd5(String pd5) {
            this.pd5 = pd5;
        }

        public String getPd6() {
            return pd6;
        }

        public void setPd6(String pd6) {
            this.pd6 = pd6;
        }

        public String getPd7() {
            return pd7;
        }

        public void setPd7(String pd7) {
            this.pd7 = pd7;
        }

        public String getPd8() {
            return pd8;
        }

        public void setPd8(String pd8) {
            this.pd8 = pd8;
        }

        public String getPd9() {
            return pd9;
        }

        public void setPd9(String pd9) {
            this.pd9 = pd9;
        }

        public String getPd10() {
            return pd10;
        }

        public void setPd10(String pd10) {
            this.pd10 = pd10;
        }

        public String getPd11() {
            return pd11;
        }

        public void setPd11(String pd11) {
            this.pd11 = pd11;
        }

        public String getPd12() {
            return pd12;
        }

        public void setPd12(String pd12) {
            this.pd12 = pd12;
        }

        public String getPd13() {
            return pd13;
        }

        public void setPd13(String pd13) {
            this.pd13 = pd13;
        }

        public String getPd14() {
            return pd14;
        }

        public void setPd14(String pd14) {
            this.pd14 = pd14;
        }

        public String getPd15() {
            return pd15;
        }

        public void setPd15(String pd15) {
            this.pd15 = pd15;
        }

        public String getPd16() {
            return pd16;
        }

        public void setPd16(String pd16) {
            this.pd16 = pd16;
        }

        public String getPd17() {
            return pd17;
        }

        public void setPd17(String pd17) {
            this.pd17 = pd17;
        }

        public String getPd18() {
            return pd18;
        }

        public void setPd18(String pd18) {
            this.pd18 = pd18;
        }

        public String getPd19() {
            return pd19;
        }

        public void setPd19(String pd19) {
            this.pd19 = pd19;
        }

        public String getPd20() {
            return pd20;
        }

        public void setPd20(String pd20) {
            this.pd20 = pd20;
        }

        public String getPd21() {
            return pd21;
        }

        public void setPd21(String pd21) {
            this.pd21 = pd21;
        }

        public String getPd22() {
            return pd22;
        }

        public void setPd22(String pd22) {
            this.pd22 = pd22;
        }

        public String getPd23() {
            return pd23;
        }

        public void setPd23(String pd23) {
            this.pd23 = pd23;
        }

        public String getPd24() {
            return pd24;
        }

        public void setPd24(String pd24) {
            this.pd24 = pd24;
        }

        public String getPd25() {
            return pd25;
        }

        public void setPd25(String pd25) {
            this.pd25 = pd25;
        }

        public String getPd26() {
            return pd26;
        }

        public void setPd26(String pd26) {
            this.pd26 = pd26;
        }

        public String getPd27() {
            return pd27;
        }

        public void setPd27(String pd27) {
            this.pd27 = pd27;
        }

        public String getPd28() {
            return pd28;
        }

        public void setPd28(String pd28) {
            this.pd28 = pd28;
        }

        public String getPd29() {
            return pd29;
        }

        public void setPd29(String pd29) {
            this.pd29 = pd29;
        }

        public String getPd30() {
            return pd30;
        }

        public void setPd30(String pd30) {
            this.pd30 = pd30;
        }

        public String getPd31() {
            return pd31;
        }

        public void setPd31(String pd31) {
            this.pd31 = pd31;
        }
        //</editor-fold>
    }

    public static void main(String[] args) {

        List<Srpt_dtr.field> datas = new ArrayList();
        for (int i = 0; i < 1; i++) {
            String employee_id = "1";
            String employee_name = "ELECCION, VIRGILIO GINOO";
            String aa1 = "07:59";
            String aa2 = "07:59";
            String aa3 = "SATURDAY";
            String aa4 = "SUNDAY";
            String aa5 = "07:59";
            String aa6 = "07:59";
            String aa7 = "07:59";
            String aa8 = "07:59";
            String aa9 = "07:59";
            String aa10 = "SATURDAY";
            String aa11 = "SUNDAY";
            String aa12 = "07:59";
            String aa13 = "07:59";
            String aa14 = "07:59";
            String aa15 = "07:59";
            String aa16 = "07:59";
            String aa17 = "SATURDAY";
            String aa18 = "SUNDAY";
            String aa19 = "07:59";
            String aa20 = "07:59";
            String aa21 = "07:59";
            String aa22 = "07:59";
            String aa23 = "07:59";
            String aa24 = "SATURDAY";
            String aa25 = "SUNDAY";
            String aa26 = "07:59";
            String aa27 = "07:59";
            String aa28 = "07:59";
            String aa29 = "07:59";
            String aa30 = "07:59";
            String aa31 = "SATURDAY";
            String pd1 = "05:03";
            String pd2 = "05:03";
            String pd3 = "SATURDAY";
            String pd4 = "SUNDAY";
            String pd5 = "05:03";
            String pd6 = "05:03";
            String pd7 = "05:03";
            String pd8 = "05:03";
            String pd9 = "05:03";
            String pd10 = "SATURDAY";
            String pd11 = "SUNDAY";
            String pd12 = "05:03";
            String pd13 = "05:03";
            String pd14 = "05:03";
            String pd15 = "05:03";
            String pd16 = "05:03";
            String pd17 = "SATURDAY";
            String pd18 = "SUNDAY";
            String pd19 = "05:03";
            String pd20 = "05:03";
            String pd21 = "05:03";
            String pd22 = "05:03";
            String pd23 = "05:03";
            String pd24 = "SATURDAY";
            String pd25 = "SUNDAY";
            String pd26 = "05:03";
            String pd27 = "05:03";
            String pd28 = "05:03";
            String pd29 = "05:03";
            String pd30 = "05:03";
            String pd31 = "SATURDAY";
            Srpt_dtr.field field = new field(employee_id, employee_name, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20, aa21, aa22, aa23, aa24, aa25, aa26, aa27, aa28, aa29, aa30, aa31, pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9, pd10, pd11, pd12, pd13, pd14, pd15, pd16, pd17, pd18, pd19, pd20, pd21, pd22, pd23, pd24, pd25, pd26, pd27, pd28, pd29, pd30, pd31);
            datas.add(field);
        }

        String business_name = System.getProperty("business_name", "Algorithm Computer Services");
        String date = DateType.month_date.format(new Date());
        String printed_by = "Administrator";

        String dtr_date = "October 2015";
        String date_printed = DateType.slash_w_time.format(new Date());
        String regular_day_am = "8:00";
        String regular_day_pm = "5:00";
        double total_hours = 0;
        double total_minutes = 0;

        String two_nine = "29";
        String thirty = "30";
        String thirty_one = "31";
        String verified_by = "ELICCION, VIRGILIO GINOO";
        String in_charge = "MARJORIE R. ROLA, Ph.D.";
        String user_home=System.getProperty("user.home");
        Srpt_dtr rpt = new Srpt_dtr(dtr_date, date_printed, regular_day_am, regular_day_pm, total_hours, total_minutes, two_nine, thirty, thirty_one
                , verified_by, in_charge,user_home);
        rpt.fields.addAll(datas);
        String jrxml = "rpt_dtr.jrxml";
        JRViewer viewer = get_viewer(rpt, jrxml);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static JasperReport compileJasper(String jrxml) {
        try {

            InputStream is = Srpt_dtr.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer(Srpt_dtr to, String jrxml) {

        return JasperUtil.getJasperViewer(
                compileJasper(jrxml),
                JasperUtil.setParameter(to),
                JasperUtil.makeDatasource(to.fields));
    }
}
