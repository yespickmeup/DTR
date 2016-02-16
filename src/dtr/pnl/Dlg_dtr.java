/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.pnl;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.dtr.Dtr;
import dtr.dtr.Dtr.to_dtr;
import dtr.dtrs.Dtrs;
import dtr.dtrs.Dtrs.to_dtrs;
import dtr.employees.Employees;
import static dtr.pnl.Extract.showExcelData;
import dtr.util.Alert;
import dtr.util.DateType;
import dtr.util.Dlg_confirm_action;
import dtr.util.TableRenderer;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import synsoftech.fields.Button;
import synsoftech.fields.Field;
import synsoftech.util.ImageRenderer1;

/**
 *
 * @author Guinness
 */
public class Dlg_dtr extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_dtr
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
    private Dlg_dtr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_dtr(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_dtr() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_dtr myRef;

    private void setThisRef(Dlg_dtr myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_dtr> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_dtr create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_dtr create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dtr((java.awt.Frame) parent, false);
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
            Dlg_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_dtr((java.awt.Dialog) parent, false);
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

        Dlg_dtr dialog = Dlg_dtr.create(new javax.swing.JFrame(), true);
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

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new Field.Search();
        jButton1 = new Button.Default();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dtr = new javax.swing.JTable();
        jButton3 = new Button.Success();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMonthChooser2 = new com.toedter.calendar.JMonthChooser();
        jYearChooser2 = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jButton2 = new Button.Default();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dtrs = new javax.swing.JTable();
        jButton4 = new Button.Info();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField2 = new Field.Combo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Location:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setFocusable(false);

        jButton1.setText("Select File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbl_dtr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_dtr);

        jButton3.setText("Save Extracted Data");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("No. of rows:");

        jLabel4.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Select Date:");

        jMonthChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jYearChooser2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setText("Status:");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonthChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jMonthChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jYearChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Extract", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Select Date:");

        jMonthChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jYearChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl_dtrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_dtrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dtrsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_dtrs);

        jButton4.setText("Generate Dtr");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("No. of rows:");

        jLabel6.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Select Employee:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("All");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox1))
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11))
        );

        jTabbedPane1.addTab("Generate DTR", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        extract();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        confirm_save();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        generate_dtr();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        init_employees(jTextField2);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        init_employees(jTextField2);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        data_cols();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_dtrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dtrsMouseClicked
        edit();
    }//GEN-LAST:event_tbl_dtrsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private com.toedter.calendar.JYearChooser jYearChooser2;
    private javax.swing.JTable tbl_dtr;
    private javax.swing.JTable tbl_dtrs;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        init_key();
        init_tbl_dtr(tbl_dtr);
        init_tbl_dtrs(tbl_dtrs);
        String where = "";
        employees = Employees.ret_data(where);

    }

    List<Employees.to_employees> employees = new ArrayList();

    private void init_employees(final JTextField tf) {

        Object[][] obj = new Object[employees.size()][1];
        int i = 0;
        for (Employees.to_employees to : employees) {
            obj[i][0] = " " + to.lname + ", " + to.fname + " " + to.mi;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {tf.getWidth()};
        int width = 0;
        String[] col_names = {"Name"};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo combo = (Field.Combo) tf;
                Employees.to_employees to = employees.get(data.selected_row);
                combo.setId("" + to.employee_id);
                combo.setText(to.lname + ", " + to.fname + " " + to.mi);
            }
        });
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

    //<editor-fold defaultstate="collapsed" desc=" dtr "> 
    public static ArrayListModel tbl_dtr_ALM;
    public static TbldtrModel tbl_dtr_M;

    public static void init_tbl_dtr(JTable tbl_dtr) {
        tbl_dtr_ALM = new ArrayListModel();
        tbl_dtr_M = new TbldtrModel(tbl_dtr_ALM);
        tbl_dtr.setModel(tbl_dtr_M);
        tbl_dtr.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dtr.setRowHeight(25);
        int[] tbl_widths_dtr = {100, 100, 150, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_dtr.length; i < n; i++) {
            if (i == 1) {
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

    public static void loadData_dtr(List<to_dtr> acc) {
        tbl_dtr_ALM.clear();
        tbl_dtr_ALM.addAll(acc);
    }

    public static class TbldtrModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Department", "Name", "Date/Time", "no", "datetime", "location_id", "id_no", "verify_code", "card_no", "date_added", "user_id", "user_screen_name"
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
            to_dtr tt = (to_dtr) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.department;
                case 1:
                    return " " + tt.name;
                case 2:
                    return " " + tt.datetime;
                case 3:
                    return tt.no;
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
    private void extract() {
        final JFileChooser fileChooser = new JFileChooser();
        final String date_added = DateType.datetime.format(new Date());
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {

            Thread t = new Thread(new Runnable() {

                @Override
                public void run() {
                    File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    jTextField1.setText(selectedFile.getAbsolutePath());

                    FileInputStream fis = null;
                    final List sheetData = new ArrayList();
                    try {

                        fis = new FileInputStream(selectedFile.getAbsolutePath());
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

                    List<Extract.field> datas = showExcelData(sheetData, selectedFile.getAbsolutePath());
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
                    jLabel4.setText("" + dtrs.size());
                    if (!dtrs.isEmpty()) {
                        jButton3.setEnabled(true);
                    }
                    //
                }
            });
            t.start();

        }
    }

    private void generate_dtr() {
        Window p = (Window) this;
        Dlg_rpt_dtr nd = Dlg_rpt_dtr.create(p, true);
        nd.setTitle("");
        nd.do_pass();
        nd.setCallback(new Dlg_rpt_dtr.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_rpt_dtr.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void confirm_save() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");
        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();

                jButton3.setEnabled(false);
                jButton1.setEnabled(false);
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {

                        save();
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);

                        jButton1.setEnabled(true);
                    }
                });
                t.start();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void save() {
        List<Employees.to_employees> emp = employees;
        List<Dtr.to_dtr> dtrs = tbl_dtr_ALM;
        List<Dtrs.to_dtrs> my_dtr = new ArrayList();

        int year = FitIn.toInt(DateType.y.format(new Date()));
        int month = FitIn.toInt(DateType.m1.format(new Date()));
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        int numDays = calendar.getActualMaximum(Calendar.DATE);

        for (Employees.to_employees e : emp) {
            List<Dtr.to_dtr> dtr_emp = new ArrayList();
            int i = 0;
            for (Dtr.to_dtr dtr : dtrs) {
                if (dtr.no.equalsIgnoreCase(e.employee_id)) {
                    dtr_emp.add(dtr);
                    i++;
                }
            }

            if (i != 0) {
                System.out.println("Name: " + e.lname + ", " + e.fname + " " + e.mi + " NO: " + i);

                for (int a = 1; a <= numDays; a++) {
                    String am_arrival = "";
                    String pm_departure = "";
                    String dtr_date = "";
                    for (Dtr.to_dtr d : dtr_emp) {
                        try {
                            String j = "" + a;
                            if (j.length() == 1) {
                                j = "0" + j;
                            }
                            Date date = DateType.slash_w_time3.parse(d.datetime);
                            dtr_date = DateType.y.format(date) + "-" + DateType.m1.format(date) + "-" + j;
                            String formattedDate = DateType.slash_w_time.format(date).toString();
                            int day = FitIn.toInt(DateType.d.format(date));
                            int hour = FitIn.toInt(DateType.hour.format(date));
                            if (day == a) {
                                if (hour < 13) {
                                    am_arrival = DateType.hour_minute.format(date);
                                } else {
                                    pm_departure = DateType.hour_minute.format(date);
                                }
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(Dlg_dtr.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    if (am_arrival.equalsIgnoreCase("") && pm_departure.equalsIgnoreCase("")) {

                    } else {
                        am_arrival = dtr_date + " " + am_arrival;
                        pm_departure = dtr_date + " " + pm_departure;
                        int id = 0;
                        String employee_id = e.employee_id;
                        String employee_name = e.lname + ", " + e.fname + " " + e.mi;
                        String department_id = e.department_id;
                        String department_name = e.department;
                        String am_departure = am_arrival;
                        String pm_arrival = pm_departure;
                        double undertime_hours = 0;
                        double undertime_minutes = 0;
                        String date_added = DateType.datetime.format(new Date());
                        String user_id = "";
                        String user_screen_name = "";

                        Dtrs.to_dtrs dtrrs = new Dtrs.to_dtrs(id, employee_id, employee_name, department_id, department_name, dtr_date, am_arrival, am_departure, pm_arrival, pm_departure, undertime_hours, undertime_minutes, date_added, user_id, user_screen_name);
                        my_dtr.add(dtrrs);
                    }

                }

            }
        }

//        for (Dtrs.to_dtrs d : my_dtr) {
//            System.out.println(d.employee_name + " | " + d.dtr_date + " | " + d.am_arrival + " = " + d.pm_departure);
//        }
        Dtrs.add_data(my_dtr);
        Alert.set(1, "");
        tbl_dtr_ALM.clear();
        tbl_dtr_M.fireTableDataChanged();
        jTextField1.setText("");
    }

    //<editor-fold defaultstate="collapsed" desc=" dtrs "> 
    public static ArrayListModel tbl_dtrs_ALM;
    public static TbldtrsModel tbl_dtrs_M;

    public static void init_tbl_dtrs(JTable tbl_dtrs) {
        tbl_dtrs_ALM = new ArrayListModel();
        tbl_dtrs_M = new TbldtrsModel(tbl_dtrs_ALM);
        tbl_dtrs.setModel(tbl_dtrs_M);
        tbl_dtrs.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dtrs.setRowHeight(25);
        int[] tbl_widths_dtrs = {120, 100, 90, 90, 80, 30, 30, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_dtrs.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_dtrs, i, tbl_widths_dtrs[i]);
        }
        Dimension d = tbl_dtrs.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_dtrs.getTableHeader().setPreferredSize(d);
        tbl_dtrs.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dtrs.setRowHeight(25);
        tbl_dtrs.setFont(new java.awt.Font("Arial", 0, 12));
        tbl_dtrs.getColumnModel().getColumn(5).setCellRenderer(new ImageRenderer1());
        tbl_dtrs.getColumnModel().getColumn(6).setCellRenderer(new ImageRenderer1());
    }

    public static void loadData_dtrs(List<to_dtrs> acc) {
        tbl_dtrs_ALM.clear();
        tbl_dtrs_ALM.addAll(acc);
    }

    public static class TbldtrsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "Employee", "AM-Arrival", "PM-Departure", "Undertime", "", "", "am_departure", "pm_arrival", "pm_departure", "undertime_hours", "undertime_minutes", "date_added", "user_id", "user_screen_name"
        };

        public TbldtrsModel(ListModel listmodel) {
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
            to_dtrs tt = (to_dtrs) getRow(row);
            switch (col) {
                case 0:
                    return " " + DateType.convert_slash_datetime2(tt.dtr_date);
                case 1:
                    return " " + tt.employee_name;
                case 2:
                    return " " + DateType.convert_slash_datetime4(tt.am_arrival);
                case 3:
                    return " " + DateType.convert_slash_datetime4(tt.pm_departure);
                case 4:
                    String undertime_h = FitIn.fmt_woc(tt.undertime_hours);
                    String undertime_m = FitIn.fmt_woc(tt.undertime_minutes);
                    if (tt.undertime_hours == 0) {
                        undertime_h = "";
                    }
                    if (tt.undertime_minutes == 0) {
                        undertime_m = "";
                    }

                    if (tt.undertime_hours == 0 && tt.undertime_minutes == 0) {
                        return "";
                    } else {
                        if (undertime_h.length() == 1) {
                            undertime_h = "0" + undertime_h;
                        }
                        if (undertime_m.length() == 1) {
                            undertime_m = "0" + undertime_m;
                        }
                        return " " + undertime_h + ":" + undertime_m;
                    }

                case 5:
                    return "/dtr/icons/edit45.png";
                case 6:
                    return "/dtr/icons/delete30.png";
                case 7:
                    return tt.am_departure;
                case 8:
                    return tt.pm_arrival;
                case 9:
                    return tt.pm_departure;
                case 10:
                    return tt.undertime_hours;
                case 11:
                    return tt.undertime_minutes;
                case 12:
                    return tt.date_added;
                case 13:
                    return tt.user_id;
                default:
                    return tt.user_screen_name;
            }
        }
    }
//</editor-fold> 

    private void data_cols() {
        String where = "";
        List<to_dtrs> datas = Dtrs.ret_data(where);
        loadData_dtrs(datas);
    }

    private void edit() {
        int row = tbl_dtrs.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_dtrs to = (to_dtrs) tbl_dtrs_ALM.get(row);
        int col = tbl_dtrs.getSelectedColumn();
        if (col == 5) {
            Window p = (Window) this;
            Dlg_dtr_edit nd = Dlg_dtr_edit.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_dtr_edit.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_dtr_edit.OutputData data) {
                    closeDialog.ok();
                    int id = to.id;
                    String employee_id = to.employee_id;
                    String employee_name = to.employee_name;
                    String department_id = to.department_id;
                    String department_name = to.department_name;
                    String dtr_date = to.dtr_date;
                    String am_arrival = data.am_arrival;
                    String am_departure = to.am_departure;
                    String pm_arrival = to.pm_arrival;
                    String pm_departure = data.pm_departure;
                    double undertime_hours = data.undertime_hours;
                    double undertime_minutes = data.undertime_minutes;
                    String date_added = to.date_added;
                    String user_id = to.user_id;
                    String user_screen_name = to.user_screen_name;
                    to_dtrs to2 = new to_dtrs(id, employee_id, employee_name, department_id, department_name, dtr_date, am_arrival, am_departure, pm_arrival, pm_departure, undertime_hours, undertime_minutes, date_added, user_id, user_screen_name);
                    Dtrs.update_data(to2);
                    data_cols();
                    Alert.set(2, user_id);
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 6) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();

                    Dtrs.delete_data(to);
                    data_cols();
                    Alert.set(3, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
}
