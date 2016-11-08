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

    public Srpt_dtr(String dtr_date, String date_printed, String regular_day_am, String regular_day_pm, double total_hours, double total_minutes, String two_nine, String thirty, String thirty_one, String verified_by, String in_charged, String user_home) {
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
        this.user_home = user_home;
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
        String ad1;
        String ad2;
        String ad3;
        String ad4;
        String ad5;
        String ad6;
        String ad7;
        String ad8;
        String ad9;
        String ad10;
        String ad11;
        String ad12;
        String ad13;
        String ad14;
        String ad15;
        String ad16;
        String ad17;
        String ad18;
        String ad19;
        String ad20;
        String ad21;
        String ad22;
        String ad23;
        String ad24;
        String ad25;
        String ad26;
        String ad27;
        String ad28;
        String ad29;
        String ad30;
        String ad31;
        String pa1;
        String pa2;
        String pa3;
        String pa4;
        String pa5;
        String pa6;
        String pa7;
        String pa8;
        String pa9;
        String pa10;
        String pa11;
        String pa12;
        String pa13;
        String pa14;
        String pa15;
        String pa16;
        String pa17;
        String pa18;
        String pa19;
        String pa20;
        String pa21;
        String pa22;
        String pa23;
        String pa24;
        String pa25;
        String pa26;
        String pa27;
        String pa28;
        String pa29;
        String pa30;
        String pa31;
        String uh1;
        String uh2;
        String uh3;
        String uh4;
        String uh5;
        String uh6;
        String uh7;
        String uh8;
        String uh9;
        String uh10;
        String uh11;
        String uh12;
        String uh13;
        String uh14;
        String uh15;
        String uh16;
        String uh17;
        String uh18;
        String uh19;
        String uh20;
        String uh21;
        String uh22;
        String uh23;
        String uh24;
        String uh25;
        String uh26;
        String uh27;
        String uh28;
        String uh29;
        String uh30;
        String uh31;
        String um1;
        String um2;
        String um3;
        String um4;
        String um5;
        String um6;
        String um7;
        String um8;
        String um9;
        String um10;
        String um11;
        String um12;
        String um13;
        String um14;
        String um15;
        String um16;
        String um17;
        String um18;
        String um19;
        String um20;
        String um21;
        String um22;
        String um23;
        String um24;
        String um25;
        String um26;
        String um27;
        String um28;
        String um29;
        String um30;
        String um31;
        String supervisor;
        String total_hh;
        String total_mm;
        String uh66;
        public field() {
        }
        //<editor-fold defaultstate="collapsed" desc=" constructor ">
        public field(String employee_id, String employee_name, String aa1, String aa2, String aa3, String aa4, String aa5, String aa6, String aa7, String aa8, String aa9, String aa10, String aa11, String aa12, String aa13, String aa14, String aa15, String aa16, String aa17, String aa18, String aa19, String aa20, String aa21, String aa22, String aa23, String aa24, String aa25, String aa26, String aa27, String aa28, String aa29, String aa30, String aa31, String pd1, String pd2, String pd3, String pd4, String pd5, String pd6, String pd7, String pd8, String pd9, String pd10, String pd11, String pd12, String pd13, String pd14, String pd15, String pd16, String pd17, String pd18, String pd19, String pd20, String pd21, String pd22, String pd23, String pd24, String pd25, String pd26, String pd27, String pd28, String pd29, String pd30, String pd31, String ad1, String ad2, String ad3, String ad4, String ad5, String ad6, String ad7, String ad8, String ad9, String ad10, String ad11, String ad12, String ad13, String ad14, String ad15, String ad16, String ad17, String ad18, String ad19, String ad20, String ad21, String ad22, String ad23, String ad24, String ad25, String ad26, String ad27, String ad28, String ad29, String ad30, String ad31, String pa1, String pa2, String pa3, String pa4, String pa5, String pa6, String pa7, String pa8, String pa9, String pa10, String pa11, String pa12, String pa13, String pa14, String pa15, String pa16, String pa17, String pa18, String pa19, String pa20, String pa21, String pa22, String pa23, String pa24, String pa25, String pa26, String pa27, String pa28, String pa29, String pa30, String pa31, String uh1, String uh2, String uh3, String uh4, String uh5, String uh6, String uh7, String uh8, String uh9, String uh10, String uh11, String uh12, String uh13, String uh14, String uh15, String uh16, String uh17, String uh18, String uh19, String uh20, String uh21, String uh22, String uh23, String uh24, String uh25, String uh26, String uh27, String uh28, String uh29, String uh30, String uh31, String um1, String um2, String um3, String um4, String um5, String um6, String um7, String um8, String um9, String um10, String um11, String um12, String um13, String um14, String um15, String um16, String um17, String um18, String um19, String um20, String um21, String um22, String um23, String um24, String um25, String um26, String um27, String um28, String um29, String um30, String um31,String supervisor,String total_hh,String total_mm,String uh66) {
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
            this.ad1 = ad1;
            this.ad2 = ad2;
            this.ad3 = ad3;
            this.ad4 = ad4;
            this.ad5 = ad5;
            this.ad6 = ad6;
            this.ad7 = ad7;
            this.ad8 = ad8;
            this.ad9 = ad9;
            this.ad10 = ad10;
            this.ad11 = ad11;
            this.ad12 = ad12;
            this.ad13 = ad13;
            this.ad14 = ad14;
            this.ad15 = ad15;
            this.ad16 = ad16;
            this.ad17 = ad17;
            this.ad18 = ad18;
            this.ad19 = ad19;
            this.ad20 = ad20;
            this.ad21 = ad21;
            this.ad22 = ad22;
            this.ad23 = ad23;
            this.ad24 = ad24;
            this.ad25 = ad25;
            this.ad26 = ad26;
            this.ad27 = ad27;
            this.ad28 = ad28;
            this.ad29 = ad29;
            this.ad30 = ad30;
            this.ad31 = ad31;
            this.pa1 = pa1;
            this.pa2 = pa2;
            this.pa3 = pa3;
            this.pa4 = pa4;
            this.pa5 = pa5;
            this.pa6 = pa6;
            this.pa7 = pa7;
            this.pa8 = pa8;
            this.pa9 = pa9;
            this.pa10 = pa10;
            this.pa11 = pa11;
            this.pa12 = pa12;
            this.pa13 = pa13;
            this.pa14 = pa14;
            this.pa15 = pa15;
            this.pa16 = pa16;
            this.pa17 = pa17;
            this.pa18 = pa18;
            this.pa19 = pa19;
            this.pa20 = pa20;
            this.pa21 = pa21;
            this.pa22 = pa22;
            this.pa23 = pa23;
            this.pa24 = pa24;
            this.pa25 = pa25;
            this.pa26 = pa26;
            this.pa27 = pa27;
            this.pa28 = pa28;
            this.pa29 = pa29;
            this.pa30 = pa30;
            this.pa31 = pa31;
            this.uh1 = uh1;
            this.uh2 = uh2;
            this.uh3 = uh3;
            this.uh4 = uh4;
            this.uh5 = uh5;
            this.uh6 = uh6;
            this.uh7 = uh7;
            this.uh8 = uh8;
            this.uh9 = uh9;
            this.uh10 = uh10;
            this.uh11 = uh11;
            this.uh12 = uh12;
            this.uh13 = uh13;
            this.uh14 = uh14;
            this.uh15 = uh15;
            this.uh16 = uh16;
            this.uh17 = uh17;
            this.uh18 = uh18;
            this.uh19 = uh19;
            this.uh20 = uh20;
            this.uh21 = uh21;
            this.uh22 = uh22;
            this.uh23 = uh23;
            this.uh24 = uh24;
            this.uh25 = uh25;
            this.uh26 = uh26;
            this.uh27 = uh27;
            this.uh28 = uh28;
            this.uh29 = uh29;
            this.uh30 = uh30;
            this.uh31 = uh31;
            this.um1 = um1;
            this.um2 = um2;
            this.um3 = um3;
            this.um4 = um4;
            this.um5 = um5;
            this.um6 = um6;
            this.um7 = um7;
            this.um8 = um8;
            this.um9 = um9;
            this.um10 = um10;
            this.um11 = um11;
            this.um12 = um12;
            this.um13 = um13;
            this.um14 = um14;
            this.um15 = um15;
            this.um16 = um16;
            this.um17 = um17;
            this.um18 = um18;
            this.um19 = um19;
            this.um20 = um20;
            this.um21 = um21;
            this.um22 = um22;
            this.um23 = um23;
            this.um24 = um24;
            this.um25 = um25;
            this.um26 = um26;
            this.um27 = um27;
            this.um28 = um28;
            this.um29 = um29;
            this.um30 = um30;
            this.um31 = um31;
            this.supervisor=supervisor;
            this.total_hh=total_hh;
            this.total_mm=total_mm;
            this.uh66=uh66;
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" getter and setter ">

        public String getUh66() {
            return uh66;
        }

        public void setUh66(String uh66) {
            this.uh66 = uh66;
        }
        
        public String getSupervisor() {
            return supervisor;
        }

        public void setSupervisor(String supervisor) {
            this.supervisor = supervisor;
        }
        
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

        public String getAd1() {
            return ad1;
        }

        public void setAd1(String ad1) {
            this.ad1 = ad1;
        }

        public String getAd2() {
            return ad2;
        }

        public void setAd2(String ad2) {
            this.ad2 = ad2;
        }

        public String getAd3() {
            return ad3;
        }

        public void setAd3(String ad3) {
            this.ad3 = ad3;
        }

        public String getAd4() {
            return ad4;
        }

        public void setAd4(String ad4) {
            this.ad4 = ad4;
        }

        public String getAd5() {
            return ad5;
        }

        public void setAd5(String ad5) {
            this.ad5 = ad5;
        }

        public String getAd6() {
            return ad6;
        }

        public void setAd6(String ad6) {
            this.ad6 = ad6;
        }

        public String getAd7() {
            return ad7;
        }

        public void setAd7(String ad7) {
            this.ad7 = ad7;
        }

        public String getAd8() {
            return ad8;
        }

        public void setAd8(String ad8) {
            this.ad8 = ad8;
        }

        public String getAd9() {
            return ad9;
        }

        public void setAd9(String ad9) {
            this.ad9 = ad9;
        }

        public String getAd10() {
            return ad10;
        }

        public void setAd10(String ad10) {
            this.ad10 = ad10;
        }

        public String getAd11() {
            return ad11;
        }

        public void setAd11(String ad11) {
            this.ad11 = ad11;
        }

        public String getAd12() {
            return ad12;
        }

        public void setAd12(String ad12) {
            this.ad12 = ad12;
        }

        public String getAd13() {
            return ad13;
        }

        public void setAd13(String ad13) {
            this.ad13 = ad13;
        }

        public String getAd14() {
            return ad14;
        }

        public void setAd14(String ad14) {
            this.ad14 = ad14;
        }

        public String getAd15() {
            return ad15;
        }

        public void setAd15(String ad15) {
            this.ad15 = ad15;
        }

        public String getAd16() {
            return ad16;
        }

        public void setAd16(String ad16) {
            this.ad16 = ad16;
        }

        public String getAd17() {
            return ad17;
        }

        public void setAd17(String ad17) {
            this.ad17 = ad17;
        }

        public String getAd18() {
            return ad18;
        }

        public void setAd18(String ad18) {
            this.ad18 = ad18;
        }

        public String getAd19() {
            return ad19;
        }

        public void setAd19(String ad19) {
            this.ad19 = ad19;
        }

        public String getAd20() {
            return ad20;
        }

        public void setAd20(String ad20) {
            this.ad20 = ad20;
        }

        public String getAd21() {
            return ad21;
        }

        public void setAd21(String ad21) {
            this.ad21 = ad21;
        }

        public String getAd22() {
            return ad22;
        }

        public void setAd22(String ad22) {
            this.ad22 = ad22;
        }

        public String getAd23() {
            return ad23;
        }

        public void setAd23(String ad23) {
            this.ad23 = ad23;
        }

        public String getAd24() {
            return ad24;
        }

        public void setAd24(String ad24) {
            this.ad24 = ad24;
        }

        public String getAd25() {
            return ad25;
        }

        public void setAd25(String ad25) {
            this.ad25 = ad25;
        }

        public String getAd26() {
            return ad26;
        }

        public void setAd26(String ad26) {
            this.ad26 = ad26;
        }

        public String getAd27() {
            return ad27;
        }

        public void setAd27(String ad27) {
            this.ad27 = ad27;
        }

        public String getAd28() {
            return ad28;
        }

        public void setAd28(String ad28) {
            this.ad28 = ad28;
        }

        public String getAd29() {
            return ad29;
        }

        public void setAd29(String ad29) {
            this.ad29 = ad29;
        }

        public String getAd30() {
            return ad30;
        }

        public void setAd30(String ad30) {
            this.ad30 = ad30;
        }

        public String getAd31() {
            return ad31;
        }

        public void setAd31(String ad31) {
            this.ad31 = ad31;
        }

        public String getPa1() {
            return pa1;
        }

        public void setPa1(String pa1) {
            this.pa1 = pa1;
        }

        public String getPa2() {
            return pa2;
        }

        public void setPa2(String pa2) {
            this.pa2 = pa2;
        }

        public String getPa3() {
            return pa3;
        }

        public void setPa3(String pa3) {
            this.pa3 = pa3;
        }

        public String getPa4() {
            return pa4;
        }

        public void setPa4(String pa4) {
            this.pa4 = pa4;
        }

        public String getPa5() {
            return pa5;
        }

        public void setPa5(String pa5) {
            this.pa5 = pa5;
        }

        public String getPa6() {
            return pa6;
        }

        public void setPa6(String pa6) {
            this.pa6 = pa6;
        }

        public String getPa7() {
            return pa7;
        }

        public void setPa7(String pa7) {
            this.pa7 = pa7;
        }

        public String getPa8() {
            return pa8;
        }

        public void setPa8(String pa8) {
            this.pa8 = pa8;
        }

        public String getPa9() {
            return pa9;
        }

        public void setPa9(String pa9) {
            this.pa9 = pa9;
        }

        public String getPa10() {
            return pa10;
        }

        public void setPa10(String pa10) {
            this.pa10 = pa10;
        }

        public String getPa11() {
            return pa11;
        }

        public void setPa11(String pa11) {
            this.pa11 = pa11;
        }

        public String getPa12() {
            return pa12;
        }

        public void setPa12(String pa12) {
            this.pa12 = pa12;
        }

        public String getPa13() {
            return pa13;
        }

        public void setPa13(String pa13) {
            this.pa13 = pa13;
        }

        public String getPa14() {
            return pa14;
        }

        public void setPa14(String pa14) {
            this.pa14 = pa14;
        }

        public String getPa15() {
            return pa15;
        }

        public void setPa15(String pa15) {
            this.pa15 = pa15;
        }

        public String getPa16() {
            return pa16;
        }

        public void setPa16(String pa16) {
            this.pa16 = pa16;
        }

        public String getPa17() {
            return pa17;
        }

        public void setPa17(String pa17) {
            this.pa17 = pa17;
        }

        public String getPa18() {
            return pa18;
        }

        public void setPa18(String pa18) {
            this.pa18 = pa18;
        }

        public String getPa19() {
            return pa19;
        }

        public void setPa19(String pa19) {
            this.pa19 = pa19;
        }

        public String getPa20() {
            return pa20;
        }

        public void setPa20(String pa20) {
            this.pa20 = pa20;
        }

        public String getPa21() {
            return pa21;
        }

        public void setPa21(String pa21) {
            this.pa21 = pa21;
        }

        public String getPa22() {
            return pa22;
        }

        public void setPa22(String pa22) {
            this.pa22 = pa22;
        }

        public String getPa23() {
            return pa23;
        }

        public void setPa23(String pa23) {
            this.pa23 = pa23;
        }

        public String getPa24() {
            return pa24;
        }

        public void setPa24(String pa24) {
            this.pa24 = pa24;
        }

        public String getPa25() {
            return pa25;
        }

        public void setPa25(String pa25) {
            this.pa25 = pa25;
        }

        public String getPa26() {
            return pa26;
        }

        public void setPa26(String pa26) {
            this.pa26 = pa26;
        }

        public String getPa27() {
            return pa27;
        }

        public void setPa27(String pa27) {
            this.pa27 = pa27;
        }

        public String getPa28() {
            return pa28;
        }

        public void setPa28(String pa28) {
            this.pa28 = pa28;
        }

        public String getPa29() {
            return pa29;
        }

        public void setPa29(String pa29) {
            this.pa29 = pa29;
        }

        public String getPa30() {
            return pa30;
        }

        public void setPa30(String pa30) {
            this.pa30 = pa30;
        }

        public String getPa31() {
            return pa31;
        }

        public void setPa31(String pa31) {
            this.pa31 = pa31;
        }

        public String getUh1() {
            return uh1;
        }

        public void setUh1(String uh1) {
            this.uh1 = uh1;
        }

        public String getUh2() {
            return uh2;
        }

        public void setUh2(String uh2) {
            this.uh2 = uh2;
        }

        public String getUh3() {
            return uh3;
        }

        public void setUh3(String uh3) {
            this.uh3 = uh3;
        }

        public String getUh4() {
            return uh4;
        }

        public void setUh4(String uh4) {
            this.uh4 = uh4;
        }

        public String getUh5() {
            return uh5;
        }

        public void setUh5(String uh5) {
            this.uh5 = uh5;
        }

        public String getUh6() {
            return uh6;
        }

        public void setUh6(String uh6) {
            this.uh6 = uh6;
        }

        public String getUh7() {
            return uh7;
        }

        public void setUh7(String uh7) {
            this.uh7 = uh7;
        }

        public String getUh8() {
            return uh8;
        }

        public void setUh8(String uh8) {
            this.uh8 = uh8;
        }

        public String getUh9() {
            return uh9;
        }

        public void setUh9(String uh9) {
            this.uh9 = uh9;
        }

        public String getUh10() {
            return uh10;
        }

        public void setUh10(String uh10) {
            this.uh10 = uh10;
        }

        public String getUh11() {
            return uh11;
        }

        public void setUh11(String uh11) {
            this.uh11 = uh11;
        }

        public String getUh12() {
            return uh12;
        }

        public void setUh12(String uh12) {
            this.uh12 = uh12;
        }

        public String getUh13() {
            return uh13;
        }

        public void setUh13(String uh13) {
            this.uh13 = uh13;
        }

        public String getUh14() {
            return uh14;
        }

        public void setUh14(String uh14) {
            this.uh14 = uh14;
        }

        public String getUh15() {
            return uh15;
        }

        public void setUh15(String uh15) {
            this.uh15 = uh15;
        }

        public String getUh16() {
            return uh16;
        }

        public void setUh16(String uh16) {
            this.uh16 = uh16;
        }

        public String getUh17() {
            return uh17;
        }

        public void setUh17(String uh17) {
            this.uh17 = uh17;
        }

        public String getUh18() {
            return uh18;
        }

        public void setUh18(String uh18) {
            this.uh18 = uh18;
        }

        public String getUh19() {
            return uh19;
        }

        public void setUh19(String uh19) {
            this.uh19 = uh19;
        }

        public String getUh20() {
            return uh20;
        }

        public void setUh20(String uh20) {
            this.uh20 = uh20;
        }

        public String getUh21() {
            return uh21;
        }

        public void setUh21(String uh21) {
            this.uh21 = uh21;
        }

        public String getUh22() {
            return uh22;
        }

        public void setUh22(String uh22) {
            this.uh22 = uh22;
        }

        public String getUh23() {
            return uh23;
        }

        public void setUh23(String uh23) {
            this.uh23 = uh23;
        }

        public String getUh24() {
            return uh24;
        }

        public void setUh24(String uh24) {
            this.uh24 = uh24;
        }

        public String getUh25() {
            return uh25;
        }

        public void setUh25(String uh25) {
            this.uh25 = uh25;
        }

        public String getUh26() {
            return uh26;
        }

        public void setUh26(String uh26) {
            this.uh26 = uh26;
        }

        public String getUh27() {
            return uh27;
        }

        public void setUh27(String uh27) {
            this.uh27 = uh27;
        }

        public String getUh28() {
            return uh28;
        }

        public void setUh28(String uh28) {
            this.uh28 = uh28;
        }

        public String getUh29() {
            return uh29;
        }

        public void setUh29(String uh29) {
            this.uh29 = uh29;
        }

        public String getUh30() {
            return uh30;
        }

        public void setUh30(String uh30) {
            this.uh30 = uh30;
        }

        public String getUh31() {
            return uh31;
        }

        public void setUh31(String uh31) {
            this.uh31 = uh31;
        }

        public String getUm1() {
            return um1;
        }

        public void setUm1(String um1) {
            this.um1 = um1;
        }

        public String getUm2() {
            return um2;
        }

        public void setUm2(String um2) {
            this.um2 = um2;
        }

        public String getUm3() {
            return um3;
        }

        public void setUm3(String um3) {
            this.um3 = um3;
        }

        public String getUm4() {
            return um4;
        }

        public void setUm4(String um4) {
            this.um4 = um4;
        }

        public String getUm5() {
            return um5;
        }

        public void setUm5(String um5) {
            this.um5 = um5;
        }

        public String getUm6() {
            return um6;
        }

        public void setUm6(String um6) {
            this.um6 = um6;
        }

        public String getUm7() {
            return um7;
        }

        public void setUm7(String um7) {
            this.um7 = um7;
        }

        public String getUm8() {
            return um8;
        }

        public void setUm8(String um8) {
            this.um8 = um8;
        }

        public String getUm9() {
            return um9;
        }

        public void setUm9(String um9) {
            this.um9 = um9;
        }

        public String getUm10() {
            return um10;
        }

        public void setUm10(String um10) {
            this.um10 = um10;
        }

        public String getUm11() {
            return um11;
        }

        public void setUm11(String um11) {
            this.um11 = um11;
        }

        public String getUm12() {
            return um12;
        }

        public void setUm12(String um12) {
            this.um12 = um12;
        }

        public String getUm13() {
            return um13;
        }

        public void setUm13(String um13) {
            this.um13 = um13;
        }

        public String getUm14() {
            return um14;
        }

        public void setUm14(String um14) {
            this.um14 = um14;
        }

        public String getUm15() {
            return um15;
        }

        public void setUm15(String um15) {
            this.um15 = um15;
        }

        public String getUm16() {
            return um16;
        }

        public void setUm16(String um16) {
            this.um16 = um16;
        }

        public String getUm17() {
            return um17;
        }

        public void setUm17(String um17) {
            this.um17 = um17;
        }

        public String getUm18() {
            return um18;
        }

        public void setUm18(String um18) {
            this.um18 = um18;
        }

        public String getUm19() {
            return um19;
        }

        public void setUm19(String um19) {
            this.um19 = um19;
        }

        public String getUm20() {
            return um20;
        }

        public void setUm20(String um20) {
            this.um20 = um20;
        }

        public String getUm21() {
            return um21;
        }

        public void setUm21(String um21) {
            this.um21 = um21;
        }

        public String getUm22() {
            return um22;
        }

        public void setUm22(String um22) {
            this.um22 = um22;
        }

        public String getUm23() {
            return um23;
        }

        public void setUm23(String um23) {
            this.um23 = um23;
        }

        public String getUm24() {
            return um24;
        }

        public void setUm24(String um24) {
            this.um24 = um24;
        }

        public String getUm25() {
            return um25;
        }

        public void setUm25(String um25) {
            this.um25 = um25;
        }

        public String getUm26() {
            return um26;
        }

        public void setUm26(String um26) {
            this.um26 = um26;
        }

        public String getUm27() {
            return um27;
        }

        public void setUm27(String um27) {
            this.um27 = um27;
        }

        public String getUm28() {
            return um28;
        }

        public void setUm28(String um28) {
            this.um28 = um28;
        }

        public String getUm29() {
            return um29;
        }

        public void setUm29(String um29) {
            this.um29 = um29;
        }

        public String getUm30() {
            return um30;
        }

        public void setUm30(String um30) {
            this.um30 = um30;
        }

        public String getUm31() {
            return um31;
        }

        public void setUm31(String um31) {
            this.um31 = um31;
        }
        //</editor-fold>

        public String getTotal_hh() {
            return total_hh;
        }

        public void setTotal_hh(String total_hh) {
            this.total_hh = total_hh;
        }

        public String getTotal_mm() {
            return total_mm;
        }

        public void setTotal_mm(String total_mm) {
            this.total_mm = total_mm;
        }
        
        
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
//            Srpt_dtr.field field = new field(employee_id, employee_name, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20, aa21, aa22, aa23, aa24, aa25, aa26, aa27, aa28, aa29, aa30, aa31, pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9, pd10, pd11, pd12, pd13, pd14, pd15, pd16, pd17, pd18, pd19, pd20, pd21, pd22, pd23, pd24, pd25, pd26, pd27, pd28, pd29, pd30, pd31);
//            datas.add(field);
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
        String user_home = System.getProperty("user.home");
        Srpt_dtr rpt = new Srpt_dtr(dtr_date, date_printed, regular_day_am, regular_day_pm, total_hours, total_minutes, two_nine, thirty, thirty_one, verified_by, in_charge, user_home);
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
