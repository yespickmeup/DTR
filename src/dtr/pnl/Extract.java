/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.pnl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.CellReference;

/**
 *
 * @author Guinness
 */
public class Extract {

    public static class field {

        public String department;
        public String name;
        public String no;
        public String datetime;
        public String location_id;
        public String id_no;
        public String verify_code;
        public String card_no;

        public field(String department, String name, String no, String datetime, String location_id, String id_no, String verify_code, String card_no) {
            this.department = department;
            this.name = name;
            this.no = no;
            this.datetime = datetime;
            this.location_id = location_id;
            this.id_no = id_no;
            this.verify_code = verify_code;
            this.card_no = card_no;
        }

    }

    public static void main(String[] args) {
//        FileDialog fd = new FileDialog(new JDialog(), "Choose .XLS FILE");
//        fd.setVisible(true);
//        if (fd.getDirectory() == null) {
//            return;
//        }
//        String file = fd.getDirectory() + "" + fd.getFile();
//        file = file.replace("\\", "\\\\");
//        final String file2 = file;
//        
//        if (file == null || file.isEmpty()) {
//            return;
//        }
        String path = "C:\\Users\\Guinness\\Desktop\\johnnie.xls";
        FileInputStream fis = null;
        final List sheetData = new ArrayList();
        try {

            fis = new FileInputStream(path);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet sheet = workbook.getSheetAt(0);
            Iterator rows = sheet.rowIterator();
            while (rows.hasNext()) {
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();

                List data = new ArrayList();
                while (cells.hasNext()) {
                    HSSFCell cell = (HSSFCell) cells.next();
                    data.add(cell);
                }
                sheetData.add(data);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unsupported Format");
        } finally {

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Extract.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        showExcelData(sheetData, path);
    }

    public static List<Extract.field> showExcelData(List sheetData, String path) {

        FileInputStream fis;
        List<Extract.field> datas = new ArrayList();
        try {
            fis = new FileInputStream(path);
            int r = 0;
            int r_set = 1;
            int id = 0;
            for (int i = 0; i < sheetData.size(); i++) {

                List list = (List) sheetData.get(i);
                int size = list.size();
                String[] record = new String[8];
                int record_size = 0;
                for (int j = 0; j < list.size(); j++) {

                    CellReference cellReference = new CellReference("B3");
                    HSSFCell cell = (HSSFCell) list.get(j);
                    HSSFDataFormatter hdf = new HSSFDataFormatter();
                    String data = "";
//                    if (j >= 17) {
//                        break;
//                    }
                    data = cell.getStringCellValue();
//                    if (j >= 0 && j <= 3) {
//                        data = "" + cell.getNumericCellValue();
//                    } else if (j == 3) {
//                        data = "" + DateType.sf.format(getRoundedDate(cell.getNumericCellValue())) + "";
//
//                    } else {
//                       
//                    }
                    record[record_size] = data;
//                    System.out.print(data + " | ");
                    record_size++;
                }
//                Date d=getRoundedDate(FitIn.toDouble(record[3]));
//                String da=DateType.sf.format(d);

                Extract.field t = new Extract.field(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);

                if (record[0] != null) {
                    datas.add(t);
//                    System.out.println("");
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Extract.class.getName()).log(Level.SEVERE, null, ex);
        }

        return datas;
    }

    public static Date getRoundedDate(double date) {
        int SECONDS_PER_DAY = 24 * 3600;

        int wholeDays = (int) Math.floor(date);
        double ms = date - wholeDays;

        /**
         * round the time part to seconds
         */
        int millisecondsInDay = (int) Math.round(SECONDS_PER_DAY * ms) * 1000;

        Calendar calendar = new GregorianCalendar(); // using default time-zone
        org.apache.poi.ss.usermodel.DateUtil.setCalendar(calendar, wholeDays, millisecondsInDay, false);

        return calendar.getTime();
    }
}
