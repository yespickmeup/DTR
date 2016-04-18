/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtr;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.departments.Departments;
import static dtr.pnl.Dlg_dtr.loadData_dtr;
import dtr.pnl.Extract;
import static dtr.pnl.Extract.showExcelData;
import dtr.reports.Srpt_dtr;
import dtr.util.TableRenderer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.DateType;

/**
 *
 * @author Guinness
 */
public class Dlg_generate_dtr extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_generate_dtr
     */
    //<editor-fold defaultstate="collapsed" desc=" callback ">
    private Callback callback;

    public void setCallback(Callback callback) {
        this.callback = callback;

    }

    public static interface Callback {

        void ok(CloseDialog closeDialog, OutputData data);
    }

    public static class InputData {
    }

    public static class OutputData {
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_generate_dtr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_generate_dtr(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_generate_dtr() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_generate_dtr myRef;

    private void setThisRef(Dlg_generate_dtr myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_generate_dtr> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_generate_dtr create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_generate_dtr create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_generate_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_generate_dtr((java.awt.Frame) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        if (parent instanceof java.awt.Dialog) {
            Dlg_generate_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_generate_dtr((java.awt.Dialog) parent, false);
                dialog.setModalityType(modalType);
                dialogContainer.put(parent, dialog);
                java.util.logging.Logger.getAnonymousLogger().log(Level.INFO, "instances: {0}", dialogContainer.size());
                dialog.setThisRef(dialog);
                return dialog;
            } else {
                dialog.setModalityType(modalType);
                return dialog;
            }

        }

        return null;

    }
    //</editor-fold>    

    //<editor-fold defaultstate="collapsed" desc=" main ">
    public static void main(String args[]) {

        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Dlg_generate_dtr dialog = Dlg_generate_dtr.create(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" added ">
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible == true) {
            getContentPane().removeAll();
            initComponents();
            myInit();
            repaint();
        }

    }

    public javax.swing.JPanel getSurface() {
        return (javax.swing.JPanel) getContentPane();
    }

    public void nullify() {
        myRef.setVisible(false);
        myRef = null;
    }
    //</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new Button.Primary();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new Field.Input();
        jButton2 = new Button.Default();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Combo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new Button.Success();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        pnl_report = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/img/find (5).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setFocusable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/img/computer (1).png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Payroll Period:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setFocusable(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("No. of rows:");

        jLabel3.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel5.setText("Status:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/img/technology.png"))); // NOI18N
        jButton3.setText("Print and Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(313, 313, 313)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(1, 1, 1)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Scan", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 875, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Report", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);

        jLabel6.setText("Status:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(680, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        pnl_report.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_reportLayout = new javax.swing.GroupLayout(pnl_report);
        pnl_report.setLayout(pnl_reportLayout);
        pnl_reportLayout.setHorizontalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_reportLayout.setVerticalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnl_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Print Preview", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        extract();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        init_periods(jTextField2);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_periods(jTextField2);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        init_report();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel pnl_report;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        setPeriod();

        init_tbl_dtr(jTable1);

    }

    public void do_pass() {

    }

    // <editor-fold defaultstate="collapsed" desc="Key">
    private void disposed() {
        this.dispose();
    }

    private void init_key() {
        KeyMapping.mapKeyWIFW(getSurface(),
                KeyEvent.VK_ESCAPE, new KeyAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
//                btn_0.doClick();
                disposed();
            }
        });
    }

    // </editor-fold>
    private void setPeriod() {
        String dir = System.getProperty("user.home") + "\\Desktop\\dtr.xls";
        jTextField1.setText(dir);
        int year = FitIn.toInt(DateType.y.format(new Date()));
        int day = FitIn.toInt(DateType.d.format(new Date()));
        int month = FitIn.toInt(DateType.m1.format(new Date()));
        for (int i = 0; i < 12; i++) {
            String[] date = lastDay(i, year);

            String period1 = date[0] + " " + "1" + ", " + date[2] + " - " + date[0] + " " + "15" + ", " + date[2];
            String period2 = date[0] + " " + "16" + ", " + date[2] + " - " + date[0] + " " + date[1] + ", " + date[2];
            Dtr.periods p1 = new Dtr.periods(period1, date[0] + " " + "1" + ", " + date[2], date[0] + " " + "15" + ", " + date[2]);
            Dtr.periods p2 = new Dtr.periods(period2, date[0] + " " + "16" + ", " + date[2], date[0] + " " + "15" + ", " + date[2]);
            dtr_periods.add(p1);
            dtr_periods.add(p2);
            if (i + 1 == month) {
                if (day <= 15) {
                    jTextField2.setText(p1.period);
                } else {
                    jTextField2.setText(p2.period);
                }
            }
        }
    }

    private String[] lastDay(int month, int year) {
        String[] date = new String[3];

        Calendar dateCal = Calendar.getInstance();
        dateCal.set(year, month, 2);
        String pattern = "MMMM";

        SimpleDateFormat obDateFormat = new SimpleDateFormat(pattern);
        String monthName = obDateFormat.format(dateCal.getTime());
        int maxDay = dateCal.getActualMaximum(Calendar.DAY_OF_MONTH);

        date[0] = monthName;
        date[1] = "" + maxDay;
        date[2] = "" + year;
        return date;
    }

    List<Dtr.periods> dtr_periods = new ArrayList();

    private void init_periods(final JTextField tf) {

        Object[][] obj = new Object[dtr_periods.size()][1];
        int i = 0;
        for (Dtr.periods to : dtr_periods) {
            obj[i][0] = " " + to.period;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo combo = (Field.Combo) tf;
                Dtr.periods to = dtr_periods.get(data.selected_row);
                combo.setText(to.period);
            }
        });
    }

    private void extract() {
        final JFileChooser fileChooser = new JFileChooser();

        String dir = System.getProperty("user.home") + "\\Desktop";
        fileChooser.setCurrentDirectory(new File(dir));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {

            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    jTextField1.setText(selectedFile.getAbsolutePath());

//                    jLabel4.setText("" + dtrs.size());
                    //
                }
            });
            t.start();

        }
    }

    //<editor-fold defaultstate="collapsed" desc=" dtr "> 
    public static ArrayListModel tbl_dtr_ALM;
    public static TbldtrModel tbl_dtr_M;

    public static void init_tbl_dtr(JTable tbl_dtr) {
        tbl_dtr_ALM = new ArrayListModel();
        tbl_dtr_M = new TbldtrModel(tbl_dtr_ALM);
        tbl_dtr.setModel(tbl_dtr_M);
        tbl_dtr.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dtr.setRowHeight(25);
        int[] tbl_widths_dtr = {100, 50, 100, 150, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_dtr.length; i < n; i++) {
            if (i == 2) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_dtr, i, tbl_widths_dtr[i]);
        }
        Dimension d = tbl_dtr.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_dtr.getTableHeader().setPreferredSize(d);
        tbl_dtr.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dtr.setRowHeight(25);
        tbl_dtr.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_dtr(List<Dtr.to_dtr> acc) {
        tbl_dtr_ALM.clear();
        tbl_dtr_ALM.addAll(acc);
    }

    public static class TbldtrModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Department", "No.", "Name", "Date/Time", "datetime", "location_id", "id_no", "verify_code", "card_no", "date_added", "user_id", "user_screen_name"
        };

        public TbldtrModel(ListModel listmodel) {
            super(listmodel, COLUMNS);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            if (column == 100) {
                return true;
            }
            return false;
        }

        @Override
        public Class getColumnClass(int col) {
            if (col == 1000) {
                return Boolean.class;
            }
            return Object.class;
        }

        @Override
        public Object getValueAt(int row, int col) {
            Dtr.to_dtr tt = (Dtr.to_dtr) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.department;
                case 1:
                    return " " + tt.no;
                case 2:
                    return " " + tt.name;
                case 3:
                    return " " + tt.datetime;
                case 4:
                    return tt.datetime;
                case 5:
                    return tt.location_id;
                case 6:
                    return tt.id_no;
                case 7:
                    return tt.verify_code;
                case 8:
                    return tt.card_no;
                case 9:
                    return tt.date_added;
                case 10:
                    return tt.user_id;
                default:
                    return tt.user_screen_name;
            }
        }
    }

//</editor-fold> 
    private void search() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        jButton1.setEnabled(false);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String path = jTextField1.getText();
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
                String date_added = dtr.util.DateType.datetime.format(new Date());
                List<Extract.field> datas = showExcelData(sheetData, path);
                List<Dtr.to_dtr> dtrs = new ArrayList();
                int i = 0;
                for (Extract.field f : datas) {
                    if (i != 0) {
                        int id = 0;
                        String department = f.department;
                        String name = f.name;
                        String no = f.no;
                        String datetime = f.datetime;
                        String location_id = f.location_id;
                        String id_no = f.id_no;
                        String verify_code = f.verify_code;
                        String card_no = f.card_no;
                        String user_id = "";
                        String user_screen_name = "";
                        Dtr.to_dtr dtr = new Dtr.to_dtr(id, department, name, no, datetime, location_id, id_no, verify_code, card_no, date_added, user_id, user_screen_name);
                        dtrs.add(dtr);
                    }
                    i++;
                }
                loadData_dtr(dtrs);
                jButton1.setEnabled(true);
                jButton3.setEnabled(true);
                jLabel3.setText("" + tbl_dtr_ALM.size());
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void init_report() {
        jTabbedPane1.setSelectedIndex(2);
        jProgressBar2.setString("Loading...Please wait...");
        jProgressBar2.setIndeterminate(true);

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                List<Srpt_dtr.field> datas = new ArrayList();
                for (int i = 0; i < 4; i++) {
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
                    Srpt_dtr.field field = new Srpt_dtr.field(employee_id, employee_name, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20, aa21, aa22, aa23, aa24, aa25, aa26, aa27, aa28, aa29, aa30, aa31, pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9, pd10, pd11, pd12, pd13, pd14, pd15, pd16, pd17, pd18, pd19, pd20, pd21, pd22, pd23, pd24, pd25, pd26, pd27, pd28, pd29, pd30, pd31);
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
                String user_home = System.getProperty("user.home");
                Srpt_dtr rpt = new Srpt_dtr(dtr_date, date_printed, regular_day_am, regular_day_pm, total_hours, total_minutes, two_nine, thirty, thirty_one, verified_by, in_charge, user_home);
                rpt.fields.addAll(datas);
                String jrxml = "rpt_dtr.jrxml";
                report_sales_items(rpt, jrxml);
                jProgressBar2.setString("Finished...");
                jProgressBar2.setIndeterminate(false);
            }
        });
        t.start();

    }

    private void report_sales_items(final Srpt_dtr to, String jrxml_name) {
        pnl_report.removeAll();
        pnl_report.setLayout(new BorderLayout());
        try {
            JRViewer viewer = get_viewer_expenses(to, jrxml_name);
            JPanel pnl = new JPanel();
            pnl.add(viewer);
            pnl.setVisible(true);
            pnl.setVisible(true);
            pnl_report.add(viewer);
            pnl_report.updateUI();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JRViewer get_viewer_expenses(Srpt_dtr to, String rpt_name) {
        try {
            return JasperUtil.getJasperViewer(
                    compileJasper(rpt_name),
                    JasperUtil.setParameter(to),
                    JasperUtil.makeDatasource(to.fields));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }

    public static JasperReport compileJasper(String rpt_name) {
        try {
            String jrxml = rpt_name;
            InputStream is = Srpt_dtr.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);
            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
    JasperPrint jasperPrint = null;

    private void print() {
        try {
            if (jasperPrint != null) {
                JasperPrintManager.printReport(jasperPrint, false);
            }

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Failed To Print, Please Check the Printer");
            throw new RuntimeException(e);
        }
    }
}
