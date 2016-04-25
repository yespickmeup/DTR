/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtr;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.dtrs.Dlg_edit_dtr;
import dtr.dtrs.Dtrs;
import dtr.dtrs.Dtrs.to_dtrs;
import dtr.employees.Employees;
import dtr.holidays.Holidays;
import dtr.pnl.Extract;
import static dtr.pnl.Extract.showExcelData;
import dtr.reports.Srpt_dtr;
import dtr.shifting.Shiftings;
import dtr.sick_leaves.Sick_leaves;
import dtr.util.Alert;
import dtr.util.Dlg_confirm_action;
import dtr.util.Dlg_confirm_action2;
import dtr.util.TableRenderer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField4 = new Field.Combo();
        jButton4 = new Button.Success();
        jButton5 = new Button.Primary();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dtrs = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        pnl_report = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Payroll Period:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setFocusable(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Employee:");

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("All");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/img/technology.png"))); // NOI18N
        jButton4.setText("Preview");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/img/find (5).png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setText("All");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Range:");

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("Monthly");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox4.setText("Bi-Monthly");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel9.setText("No. of rows:");

        jLabel10.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Report", jPanel3);

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
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Range:");

        buttonGroup2.add(jCheckBox5);
        jCheckBox5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox5.setSelected(true);
        jCheckBox5.setText("Monthly");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jCheckBox6);
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox6.setText("Bi-Monthly");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                        .addGap(313, 313, 313)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1)
                                        .addGap(1, 1, 1)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
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

        pnl_report.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_reportLayout = new javax.swing.GroupLayout(pnl_report);
        pnl_report.setLayout(pnl_reportLayout);
        pnl_reportLayout.setHorizontalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_reportLayout.setVerticalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(pnl_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Print Preview", jPanel2);

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
                .addComponent(jTabbedPane1))
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
        save_dtr();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        init_periods(jTextField3);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        init_periods(jTextField3);
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        init_employees2(jTextField4);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        init_employees2(jTextField4);
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        init_report();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        data_cols_dtr();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tbl_dtrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dtrsMouseClicked
        select_employee_dtr();
    }//GEN-LAST:event_tbl_dtrsMouseClicked

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        setPeriod();
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        setPeriod();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        setPeriod();
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        setPeriod();
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel pnl_report;
    private javax.swing.JTable tbl_dtrs;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();

        setPeriod();

        init_tbl_dtr(jTable1);
        init_tbl_dtrs(tbl_dtrs);
        String where = " ";
        employees1 = Employees.ret_data(where);

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
        dtr_periods.clear();
        Field.Combo combo1 = (Field.Combo) jTextField2;
        Field.Combo combo2 = (Field.Combo) jTextField3;

        String dir = System.getProperty("user.home") + "\\Desktop\\dtr.xls";
        jTextField1.setText(dir);
        int year = FitIn.toInt(DateType.y.format(new Date()));
        int day = FitIn.toInt(DateType.d.format(new Date()));
        int month = FitIn.toInt(DateType.m1.format(new Date()));
        for (int i = 0; i < 12; i++) {
            String[] date = lastDay(i, year);

            String period1 = date[0] + " " + "1" + " " + date[2] + " - " + date[0] + " " + "15" + " " + date[2];
            String period2 = date[0] + " " + "16" + " " + date[2] + " - " + date[0] + " " + date[1] + " " + date[2];
            String period3 = date[0] + " " + "1" + " " + date[2] + " - " + date[0] + " " + date[1] + " " + date[2];
            if (jCheckBox4.isSelected()) {
                Dtr.periods p1 = new Dtr.periods(period1, date[0] + " " + "1" + ", " + date[2], date[0] + " " + "15" + " " + date[2]);
                Dtr.periods p2 = new Dtr.periods(period2, date[0] + " " + "16" + ", " + date[2], date[0] + " " + "15" + " " + date[2]);

                if (i + 1 == month) {
                    if (day <= 15) {
                        combo1.setText(p1.period);
                        combo2.setText(p1.period);
                    } else {
                        combo1.setText(p1.period);
                        combo2.setText(p1.period);
                    }
                }
                dtr_periods.add(p1);
                dtr_periods.add(p2);
            } else {

                Dtr.periods p1 = new Dtr.periods(period3, date[0] + " " + "1" + ", " + date[2], date[0] + " " + date[1] + " " + date[2]);
                dtr_periods.add(p1);
                if (i + 1 == month) {
                    combo1.setText(p1.period);
                    combo2.setText(p1.period);
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

    private void data_cols_dtrs() {

    }
//</editor-fold> 

    private void search() {
        jProgressBar1.setString("Loading...Please wait...");
        jProgressBar1.setIndeterminate(true);
        jButton1.setEnabled(false);
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                String[] dtr_date = jTextField2.getText().split("-");
                String from = dtr.util.DateType.convert_dash_date3(dtr_date[0]);
                String to = dtr_date[1].substring(1, dtr_date[1].length());
                to = dtr.util.DateType.convert_dash_date3(to);

                Date d_from = new Date();
                Date d_to = new Date();
                try {
                    d_from = dtr.util.DateType.sf.parse(from);
                    d_to = dtr.util.DateType.sf.parse(to);

                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
                }

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
                        Dtr.to_dtr dtr1 = new Dtr.to_dtr(id, department, name, no, datetime, location_id, id_no, verify_code, card_no, date_added, user_id, user_screen_name);

                        try {
                            Date f_date = dtr.util.DateType.slash_w_time3.parse(f.datetime);
                            if (f_date.after(d_from) && f_date.before(d_to)) {
                                dtrs.add(dtr1);
                            }

                        } catch (ParseException ex) {
                            Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    i++;
                }
                String where = " where Date(dtr_date) between '" + from + "' and '" + to + "' ";
                List<Dtrs.to_dtrs> records = Dtrs.ret_data(where);
                if (records.isEmpty()) {
                    loadData_dtr(dtrs);
                    jButton1.setEnabled(true);
                    jButton3.setEnabled(true);
                    jLabel3.setText("" + tbl_dtr_ALM.size());
                    jProgressBar1.setString("Finished...");
                    jProgressBar1.setIndeterminate(false);
                } else {
                    System.out.println("Size to Delete: " + dtrs.size());
                    delete_dtr(where, dtrs);
                }

            }
        });
        t.start();

    }

    private void delete_dtr(final String where, final List<Dtr.to_dtr> dtrs) {
        Window p = (Window) this;
        Dlg_confirm_action2 nd = Dlg_confirm_action2.create(p, true);
        nd.setTitle("");
        nd.do_pass(jTextField2.getText());
        nd.setCallback(new Dlg_confirm_action2.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action2.OutputData data) {
                closeDialog.ok();
                Dtrs.delete_data(where);
                Alert.set(3, "");
                loadData_dtr(dtrs);
                jButton1.setEnabled(true);
                jButton3.setEnabled(true);
                jLabel3.setText("" + tbl_dtr_ALM.size());
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void init_report() {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                List<Srpt_dtr.field> datas = new ArrayList();
                List<Employees.to_employees> employees = new ArrayList();
                List<to_dtrs> dtrs = tbl_dtrs_ALM;
                List<to_dtrs> employee_dtrs = new ArrayList();
                if (jCheckBox1.isSelected()) {
                    employees = employees1;
                } else if (employee.id == 0) {
                    Alert.set(0, "Choose Employee");
                    return;
                } else {
                    employees.add(employee);
                }

                jTabbedPane1.setSelectedIndex(2);
                jProgressBar2.setString("Loading...Please wait...");
                jProgressBar2.setIndeterminate(true);

                String[] payroll_period = jTextField3.getText().split("-");
                try {
                    Date period_from = dtr.util.DateType.month_date2.parse(payroll_period[0]);
                    String pr = payroll_period[1];
                    pr = pr.substring(1, pr.length());
                    Date period_to = dtr.util.DateType.month_date2.parse(pr);

                    int payroll_from_day = FitIn.toInt(DateType.d.format(period_from));
                    int payroll_to_day = FitIn.toInt(DateType.d.format(period_to));
                    String payroll_month = "" + FitIn.toInt(DateType.m1.format(period_to));
                    String payroll_year = "" + FitIn.toInt(DateType.y.format(period_to));

                    if (payroll_month.length() == 1) {
                        payroll_month = "0" + payroll_month;
                    }

                    //<editor-fold defaultstate="collapsed" desc=" holidays ">
                    String where4 = " where Date(date_of_holiday) between '" + DateType.sf.format(period_from) + "' and '" + DateType.sf.format(period_to) + "' ";
                    List<Holidays.to_holidays> holidays = Holidays.ret_data(where4);
                    //</editor-fold>

                    for (Employees.to_employees emp : employees) {
                        String where2 = " where id='" + emp.shift_id + "' ";
                        Shiftings.to_shiftings shift = new Shiftings.to_shiftings(0, "Regular", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", 0, "", "", "", "");

                        //<editor-fold defaultstate="collapsed" desc=" retrieve leaves ">
                        String where3 = " where employee_id='" + emp.id + "' and Date(date_of_leave) between '" + DateType.sf.format(period_from) + "' and '" + DateType.sf.format(period_to) + "' ";

                        List<Sick_leaves.to_sick_leaves> leaves = Sick_leaves.ret_data(where3);
                        //</editor-fold>

                        if (!emp.shift_id.equalsIgnoreCase("0")) {
                            List<Shiftings.to_shiftings> shifts = Shiftings.ret_data(where2);
                            shift = shifts.get(0);
                        }
                        for (to_dtrs dtr : dtrs) {
                            if (dtr.employee_id.equalsIgnoreCase("" + emp.id)) {
                                employee_dtrs.add(dtr);
                            }
                        }

                        //<editor-fold defaultstate="collapsed" desc=" fields ">
                        String employee_id = "" + emp.id;
                        String employee_name = emp.lname + ", " + emp.fname + " " + emp.mi;
                        employee_name = employee_name.toUpperCase();
                        String aa1 = "";
                        String aa2 = "";
                        String aa3 = "";
                        String aa4 = "";
                        String aa5 = "";
                        String aa6 = "";
                        String aa7 = "";
                        String aa8 = "";
                        String aa9 = "";
                        String aa10 = "";
                        String aa11 = "";
                        String aa12 = "";
                        String aa13 = "";
                        String aa14 = "";
                        String aa15 = "";
                        String aa16 = "";
                        String aa17 = "";
                        String aa18 = "";
                        String aa19 = "";
                        String aa20 = "";
                        String aa21 = "";
                        String aa22 = "";
                        String aa23 = "";
                        String aa24 = "";
                        String aa25 = "";
                        String aa26 = "";
                        String aa27 = "";
                        String aa28 = "";
                        String aa29 = "";
                        String aa30 = "";
                        String aa31 = "";
                        String pd1 = "";
                        String pd2 = "";
                        String pd3 = "";
                        String pd4 = "";
                        String pd5 = "";
                        String pd6 = "";
                        String pd7 = "";
                        String pd8 = "";
                        String pd9 = "";
                        String pd10 = "";
                        String pd11 = "";
                        String pd12 = "";
                        String pd13 = "";
                        String pd14 = "";
                        String pd15 = "";
                        String pd16 = "";
                        String pd17 = "";
                        String pd18 = "";
                        String pd19 = "";
                        String pd20 = "";
                        String pd21 = "";
                        String pd22 = "";
                        String pd23 = "";
                        String pd24 = "";
                        String pd25 = "";
                        String pd26 = "";
                        String pd27 = "";
                        String pd28 = "";
                        String pd29 = "";
                        String pd30 = "";
                        String pd31 = "";
                        String ad1 = "";
                        String ad2 = "";
                        String ad3 = "";
                        String ad4 = "";
                        String ad5 = "";
                        String ad6 = "";
                        String ad7 = "";
                        String ad8 = "";
                        String ad9 = "";
                        String ad10 = "";
                        String ad11 = "";
                        String ad12 = "";
                        String ad13 = "";
                        String ad14 = "";
                        String ad15 = "";
                        String ad16 = "";
                        String ad17 = "";
                        String ad18 = "";
                        String ad19 = "";
                        String ad20 = "";
                        String ad21 = "";
                        String ad22 = "";
                        String ad23 = "";
                        String ad24 = "";
                        String ad25 = "";
                        String ad26 = "";
                        String ad27 = "";
                        String ad28 = "";
                        String ad29 = "";
                        String ad30 = "";
                        String ad31 = "";
                        String pa1 = "";
                        String pa2 = "";
                        String pa3 = "";
                        String pa4 = "";
                        String pa5 = "";
                        String pa6 = "";
                        String pa7 = "";
                        String pa8 = "";
                        String pa9 = "";
                        String pa10 = "";
                        String pa11 = "";
                        String pa12 = "";
                        String pa13 = "";
                        String pa14 = "";
                        String pa15 = "";
                        String pa16 = "";
                        String pa17 = "";
                        String pa18 = "";
                        String pa19 = "";
                        String pa20 = "";
                        String pa21 = "";
                        String pa22 = "";
                        String pa23 = "";
                        String pa24 = "";
                        String pa25 = "";
                        String pa26 = "";
                        String pa27 = "";
                        String pa28 = "";
                        String pa29 = "";
                        String pa30 = "";
                        String pa31 = "";
                        String uh1 = "";
                        String uh2 = "";
                        String uh3 = "";
                        String uh4 = "";
                        String uh5 = "";
                        String uh6 = "";
                        String uh7 = "";
                        String uh8 = "";
                        String uh9 = "";
                        String uh10 = "";
                        String uh11 = "";
                        String uh12 = "";
                        String uh13 = "";
                        String uh14 = "";
                        String uh15 = "";
                        String uh16 = "";
                        String uh17 = "";
                        String uh18 = "";
                        String uh19 = "";
                        String uh20 = "";
                        String uh21 = "";
                        String uh22 = "";
                        String uh23 = "";
                        String uh24 = "";
                        String uh25 = "";
                        String uh26 = "";
                        String uh27 = "";
                        String uh28 = "";
                        String uh29 = "";
                        String uh30 = "";
                        String uh31 = "";
                        String um1 = "";
                        String um2 = "";
                        String um3 = "";
                        String um4 = "";
                        String um5 = "";
                        String um6 = "";
                        String um7 = "";
                        String um8 = "";
                        String um9 = "";
                        String um10 = "";
                        String um11 = "";
                        String um12 = "";
                        String um13 = "";
                        String um14 = "";
                        String um15 = "";
                        String um16 = "";
                        String um17 = "";
                        String um18 = "";
                        String um19 = "";
                        String um20 = "";
                        String um21 = "";
                        String um22 = "";
                        String um23 = "";
                        String um24 = "";
                        String um25 = "";
                        String um26 = "";
                        String um27 = "";
                        String um28 = "";
                        String um29 = "";
                        String um30 = "";
                        String um31 = "";
                        //</editor-fold>

                        for (int i = payroll_from_day; i <= payroll_to_day; i++) {

                            String str_date = "" + i;
                            if (str_date.length() == 1) {
                                str_date = "0" + i;
                            }
                            str_date = payroll_year + "-" + payroll_month + "-" + str_date;
                            Date loop_date = DateType.sf.parse(str_date);
                            String what_day = DateType.day.format(loop_date);

                            to_dtrs my_dtr = new to_dtrs(0, "", "", "", "", "", "", "", "", "", "00", "00", "", "", "");
                            for (to_dtrs dtr : employee_dtrs) {
                                if (str_date.equalsIgnoreCase(dtr.dtr_date)) {
                                    my_dtr = dtr;
                                }
                            }

                            String aa = "";
                            String ad = "";
                            String pa = "";
                            String pd = "";
                            String uh = "";
                            String um = "";
                            if (my_dtr.id != 0) {
                                if (my_dtr.am_arrival != null) {
                                    aa = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.am_arrival);

                                    if (shift.id != 0) {
                                        String hh1 = aa.substring(0, 2);
                                        String hh2 = aa.substring(3, 5);
                                        String hh3 = aa.substring(6, 8);

                                        //<editor-fold defaultstate="collapsed" desc=" shift convertions ">
                                        if (hh1.equalsIgnoreCase("00") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_12;
                                        }
                                        if (hh1.equalsIgnoreCase("01") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_1;
                                        }
                                        if (hh1.equalsIgnoreCase("02") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_2;
                                        }
                                        if (hh1.equalsIgnoreCase("03") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_3;
                                        }
                                        if (hh1.equalsIgnoreCase("04") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_4;
                                        }
                                        if (hh1.equalsIgnoreCase("05") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_5;
                                        }
                                        if (hh1.equalsIgnoreCase("06") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_6;
                                        }
                                        if (hh1.equalsIgnoreCase("07") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_7;
                                        }
                                        if (hh1.equalsIgnoreCase("08") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_8;
                                        }
                                        if (hh1.equalsIgnoreCase("09") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_9;
                                        }
                                        if (hh1.equalsIgnoreCase("10") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_10;
                                        }
                                        if (hh1.equalsIgnoreCase("11") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_11;
                                        }
                                        if (hh1.equalsIgnoreCase("12") && hh3.equalsIgnoreCase("PM")) {

                                            hh1 = shift.pm_12;
                                        }
                                        if (hh1.equalsIgnoreCase("13") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_1;
                                        }
                                        if (hh1.equalsIgnoreCase("14") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_2;
                                        }
                                        if (hh1.equalsIgnoreCase("15") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_3;
                                        }
                                        if (hh1.equalsIgnoreCase("16") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm4;
                                        }
                                        if (hh1.equalsIgnoreCase("17") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_5;
                                        }
                                        if (hh1.equalsIgnoreCase("18") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_6;
                                        }
                                        if (hh1.equalsIgnoreCase("19") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_7;
                                        }
                                        if (hh1.equalsIgnoreCase("20") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_8;
                                        }
                                        if (hh1.equalsIgnoreCase("21") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_9;
                                        }
                                        if (hh1.equalsIgnoreCase("22") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_10;
                                        }
                                        if (hh1.equalsIgnoreCase("23") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_11;
                                        }
                                        //</editor-fold>
                                        int ampm = FitIn.toInt(hh1);
                                        if (ampm > 11 && ampm < 24) {
                                            hh3 = "PM";
                                        } else {
                                            hh3 = "AM";
                                        }
                                        aa = hh1 + ":" + hh2 + " " + hh3;

                                    }

                                }
                                if (my_dtr.am_departure != null) {
                                    ad = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.am_departure);
                                    if (shift.id != 0) {
                                        String hh1 = ad.substring(0, 2);
                                        String hh2 = ad.substring(3, 5);
                                        String hh3 = ad.substring(5, 8);
                                        //<editor-fold defaultstate="collapsed" desc=" shift convertions ">
                                        if (hh1.equalsIgnoreCase("00") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_12;
                                        }
                                        if (hh1.equalsIgnoreCase("01") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_1;
                                        }
                                        if (hh1.equalsIgnoreCase("02") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_2;
                                        }
                                        if (hh1.equalsIgnoreCase("03") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_3;
                                        }
                                        if (hh1.equalsIgnoreCase("04") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_4;
                                        }
                                        if (hh1.equalsIgnoreCase("05") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_5;
                                        }
                                        if (hh1.equalsIgnoreCase("06") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_6;
                                        }
                                        if (hh1.equalsIgnoreCase("07") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_7;
                                        }
                                        if (hh1.equalsIgnoreCase("08") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_8;
                                        }
                                        if (hh1.equalsIgnoreCase("09") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_9;
                                        }
                                        if (hh1.equalsIgnoreCase("10") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_10;
                                        }
                                        if (hh1.equalsIgnoreCase("11") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_11;
                                        }
                                        if (hh1.equalsIgnoreCase("12") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_12;
                                        }
                                        if (hh1.equalsIgnoreCase("13") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_1;
                                        }
                                        if (hh1.equalsIgnoreCase("14") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_2;
                                        }
                                        if (hh1.equalsIgnoreCase("15") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_3;
                                        }
                                        if (hh1.equalsIgnoreCase("16") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm4;
                                        }
                                        if (hh1.equalsIgnoreCase("17") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_5;
                                        }
                                        if (hh1.equalsIgnoreCase("18") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_6;
                                        }
                                        if (hh1.equalsIgnoreCase("19") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_7;
                                        }
                                        if (hh1.equalsIgnoreCase("20") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_8;
                                        }
                                        if (hh1.equalsIgnoreCase("21") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_9;
                                        }
                                        if (hh1.equalsIgnoreCase("22") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_10;
                                        }
                                        if (hh1.equalsIgnoreCase("23") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_11;
                                        }
                                        //</editor-fold>
                                        int ampm = FitIn.toInt(hh1);
                                        if (ampm > 11 && ampm < 24) {
                                            hh3 = "PM";
                                        } else {
                                            hh3 = "AM";
                                        }
                                        ad = hh1 + ":" + hh2 + " " + hh3;
                                    }
                                }
                                if (my_dtr.pm_arrival != null) {
                                    pa = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.pm_arrival);
                                    if (shift.id != 0) {
                                        String hh1 = pa.substring(0, 2);
                                        String hh2 = pa.substring(3, 5);
                                        String hh3 = pa.substring(5, 8);
                                        //<editor-fold defaultstate="collapsed" desc=" shift convertions ">
                                        if (hh1.equalsIgnoreCase("00") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_12;
                                        }
                                        if (hh1.equalsIgnoreCase("01") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_1;
                                        }
                                        if (hh1.equalsIgnoreCase("02") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_2;
                                        }
                                        if (hh1.equalsIgnoreCase("03") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_3;
                                        }
                                        if (hh1.equalsIgnoreCase("04") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_4;
                                        }
                                        if (hh1.equalsIgnoreCase("05") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_5;
                                        }
                                        if (hh1.equalsIgnoreCase("06") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_6;
                                        }
                                        if (hh1.equalsIgnoreCase("07") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_7;
                                        }
                                        if (hh1.equalsIgnoreCase("08") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_8;
                                        }
                                        if (hh1.equalsIgnoreCase("09") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_9;
                                        }
                                        if (hh1.equalsIgnoreCase("10") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_10;
                                        }
                                        if (hh1.equalsIgnoreCase("11") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_11;
                                        }
                                        if (hh1.equalsIgnoreCase("12") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_12;
                                        }
                                        if (hh1.equalsIgnoreCase("13") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_1;
                                        }
                                        if (hh1.equalsIgnoreCase("14") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_2;
                                        }
                                        if (hh1.equalsIgnoreCase("15") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_3;
                                        }
                                        if (hh1.equalsIgnoreCase("16") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm4;
                                        }
                                        if (hh1.equalsIgnoreCase("17") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_5;
                                        }
                                        if (hh1.equalsIgnoreCase("18") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_6;
                                        }
                                        if (hh1.equalsIgnoreCase("19") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_7;
                                        }
                                        if (hh1.equalsIgnoreCase("20") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_8;
                                        }
                                        if (hh1.equalsIgnoreCase("21") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_9;
                                        }
                                        if (hh1.equalsIgnoreCase("22") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_10;
                                        }
                                        if (hh1.equalsIgnoreCase("23") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_11;
                                        }
                                        //</editor-fold>
                                        int ampm = FitIn.toInt(hh1);
                                        if (ampm > 11 && ampm < 24) {
                                            hh3 = "PM";
                                        } else {
                                            hh3 = "AM";
                                        }
                                        pa = hh1 + ":" + hh2 + " " + hh3;
                                    }
                                }
                                if (my_dtr.pm_departure != null) {
                                    pd = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.pm_departure);
                                    if (shift.id != 0) {
                                        String hh1 = pd.substring(0, 2);
                                        String hh2 = pd.substring(3, 5);
                                        String hh3 = pd.substring(5, 8);
                                        //<editor-fold defaultstate="collapsed" desc=" shift convertions ">
                                        if (hh1.equalsIgnoreCase("00") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_12;
                                        }
                                        if (hh1.equalsIgnoreCase("01") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_1;
                                        }
                                        if (hh1.equalsIgnoreCase("02") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_2;
                                        }
                                        if (hh1.equalsIgnoreCase("03") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_3;
                                        }
                                        if (hh1.equalsIgnoreCase("04") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_4;
                                        }
                                        if (hh1.equalsIgnoreCase("05") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_5;
                                        }
                                        if (hh1.equalsIgnoreCase("06") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_6;
                                        }
                                        if (hh1.equalsIgnoreCase("07") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_7;
                                        }
                                        if (hh1.equalsIgnoreCase("08") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_8;
                                        }
                                        if (hh1.equalsIgnoreCase("09") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_9;
                                        }
                                        if (hh1.equalsIgnoreCase("10") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_10;
                                        }
                                        if (hh1.equalsIgnoreCase("11") && hh3.equalsIgnoreCase("AM")) {
                                            hh1 = shift.am_11;
                                        }
                                        if (hh1.equalsIgnoreCase("12") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_12;
                                        }
                                        if (hh1.equalsIgnoreCase("13") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_1;
                                        }
                                        if (hh1.equalsIgnoreCase("14") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_2;
                                        }
                                        if (hh1.equalsIgnoreCase("15") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_3;
                                        }
                                        if (hh1.equalsIgnoreCase("16") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm4;
                                        }
                                        if (hh1.equalsIgnoreCase("17") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_5;
                                        }
                                        if (hh1.equalsIgnoreCase("18") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_6;
                                        }
                                        if (hh1.equalsIgnoreCase("19") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_7;
                                        }
                                        if (hh1.equalsIgnoreCase("20") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_8;
                                        }
                                        if (hh1.equalsIgnoreCase("21") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_9;
                                        }
                                        if (hh1.equalsIgnoreCase("22") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_10;
                                        }
                                        if (hh1.equalsIgnoreCase("23") && hh3.equalsIgnoreCase("PM")) {
                                            hh1 = shift.pm_11;
                                        }
                                        //</editor-fold>
                                        int ampm = FitIn.toInt(hh1);
                                        if (ampm > 11 && ampm < 24) {
                                            hh3 = "PM";
                                        } else {
                                            hh3 = "AM";
                                        }
                                        pd = hh1 + ":" + hh2 + " " + hh3;
                                    }
                                }
                                if (my_dtr.undertime_hours.equalsIgnoreCase("00")) {
                                    uh = "";
                                } else {
                                    uh = FitIn.fmt_woc("" + my_dtr.undertime_hours);
                                }
                                if (my_dtr.undertime_minutes.equalsIgnoreCase("00")) {
                                    um = "";
                                } else {
                                    um = FitIn.fmt_woc("" + my_dtr.undertime_minutes);
                                }

                            }
                            for (Sick_leaves.to_sick_leaves leave : leaves) {
                                if (str_date.equalsIgnoreCase(leave.date_of_leave)) {
                                    if (leave.half_day_am == 1) {
                                        aa = "Sick Leave";
                                        ad = "Sick Leave";
                                    }
                                    if (leave.half_day_pm == 1) {
                                        pa = "Sick Leave";
                                        pd = "Sick Leave";
                                    }
                                }
                            }
                            for (Holidays.to_holidays holiday : holidays) {
                                if (str_date.equalsIgnoreCase(holiday.date_of_holiday)) {
                                    if (holiday.half_day_am == 1) {
                                        aa = "Holiday";
                                        ad = "Holiday";
                                    }
                                    if (holiday.half_day_pm == 1) {
                                        pa = "Holiday";
                                        pd = "Holiday";
                                    }
                                }
                            }
                            //<editor-fold defaultstate="collapsed" desc=" days ">
                            if (i == 1) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa1 = what_day;
                                    ad1 = what_day;
                                    pa1 = what_day;
                                    pd1 = what_day;
                                    uh1 = what_day;
                                    um1 = what_day;
                                } else {
                                    aa1 = aa;
                                    ad1 = ad;
                                    pa1 = pa;
                                    pd1 = pd;
                                    uh1 = uh;
                                    um1 = um;
                                }
                            }
                            if (i == 2) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa2 = what_day;
                                    ad2 = what_day;
                                    pa2 = what_day;
                                    pd2 = what_day;
                                    uh2 = what_day;
                                    um2 = what_day;
                                } else {
                                    aa2 = aa;
                                    ad2 = ad;
                                    pa2 = pa;
                                    pd2 = pd;
                                    uh2 = uh;
                                    um2 = um;
                                }
                            }
                            if (i == 3) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa3 = what_day;
                                    ad3 = what_day;
                                    pa3 = what_day;
                                    pd3 = what_day;
                                    uh3 = what_day;
                                    um3 = what_day;
                                } else {
                                    aa3 = aa;
                                    ad3 = ad;
                                    pa3 = pa;
                                    pd3 = pd;
                                    uh3 = uh;
                                    um3 = um;
                                }
                            }
                            if (i == 4) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa4 = what_day;
                                    ad4 = what_day;
                                    pa4 = what_day;
                                    pd4 = what_day;
                                    uh4 = what_day;
                                    um4 = what_day;
                                } else {
                                    aa4 = aa;
                                    ad4 = ad;
                                    pa4 = pa;
                                    pd4 = pd;
                                    uh4 = uh;
                                    um4 = um;
                                }
                            }
                            if (i == 5) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa5 = what_day;
                                    ad5 = what_day;
                                    pa5 = what_day;
                                    pd5 = what_day;
                                    uh5 = what_day;
                                    um5 = what_day;
                                } else {
                                    aa5 = aa;
                                    ad5 = ad;
                                    pa5 = pa;
                                    pd5 = pd;
                                    uh5 = uh;
                                    um5 = um;
                                }
                            }
                            if (i == 6) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa6 = what_day;
                                    ad6 = what_day;
                                    pa6 = what_day;
                                    pd6 = what_day;
                                    uh6 = what_day;
                                    um6 = what_day;
                                } else {
                                    aa6 = aa;
                                    ad6 = ad;
                                    pa6 = pa;
                                    pd6 = pd;
                                    uh6 = uh;
                                    um6 = um;
                                }
                            }
                            if (i == 7) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa7 = what_day;
                                    ad7 = what_day;
                                    pa7 = what_day;
                                    pd7 = what_day;
                                    uh7 = what_day;
                                    um7 = what_day;
                                } else {
                                    aa7 = aa;
                                    ad7 = ad;
                                    pa7 = pa;
                                    pd7 = pd;
                                    uh7 = uh;
                                    um7 = um;
                                }
                            }
                            if (i == 8) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa8 = what_day;
                                    ad8 = what_day;
                                    pa8 = what_day;
                                    pd8 = what_day;
                                    uh8 = what_day;
                                    um8 = what_day;
                                } else {
                                    aa8 = aa;
                                    ad8 = ad;
                                    pa8 = pa;
                                    pd8 = pd;
                                    uh8 = uh;
                                    um8 = um;
                                }
                            }
                            if (i == 9) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa9 = what_day;
                                    ad9 = what_day;
                                    pa9 = what_day;
                                    pd9 = what_day;
                                    uh9 = what_day;
                                    um9 = what_day;
                                } else {
                                    aa9 = aa;
                                    ad9 = ad;
                                    pa9 = pa;
                                    pd9 = pd;
                                    uh9 = uh;
                                    um9 = um;
                                }
                            }
                            if (i == 10) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa10 = what_day;
                                    ad10 = what_day;
                                    pa10 = what_day;
                                    pd10 = what_day;
                                    uh10 = what_day;
                                    um10 = what_day;
                                } else {
                                    aa10 = aa;
                                    ad10 = ad;
                                    pa10 = pa;
                                    pd10 = pd;
                                    uh10 = uh;
                                    um10 = um;
                                }
                            }
                            if (i == 11) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa11 = what_day;
                                    ad11 = what_day;
                                    pa11 = what_day;
                                    pd11 = what_day;
                                    uh11 = what_day;
                                    um11 = what_day;
                                } else {
                                    aa11 = aa;
                                    ad11 = ad;
                                    pa11 = pa;
                                    pd11 = pd;
                                    uh11 = uh;
                                    um11 = um;
                                }
                            }
                            if (i == 12) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa12 = what_day;
                                    ad12 = what_day;
                                    pa12 = what_day;
                                    pd12 = what_day;
                                    uh12 = what_day;
                                    um12 = what_day;
                                } else {
                                    aa12 = aa;
                                    ad12 = ad;
                                    pa12 = pa;
                                    pd12 = pd;
                                    uh12 = uh;
                                    um12 = um;
                                }
                            }
                            if (i == 13) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa13 = what_day;
                                    ad13 = what_day;
                                    pa13 = what_day;
                                    pd13 = what_day;
                                    uh13 = what_day;
                                    um13 = what_day;
                                } else {
                                    aa13 = aa;
                                    ad13 = ad;
                                    pa13 = pa;
                                    pd13 = pd;
                                    uh13 = uh;
                                    um13 = um;
                                }
                            }
                            if (i == 14) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa14 = what_day;
                                    ad14 = what_day;
                                    pa14 = what_day;
                                    pd14 = what_day;
                                    uh14 = what_day;
                                    um14 = what_day;
                                } else {
                                    aa14 = aa;
                                    ad14 = ad;
                                    pa14 = pa;
                                    pd14 = pd;
                                    uh14 = uh;
                                    um14 = um;
                                }
                            }
                            if (i == 15) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa15 = what_day;
                                    ad15 = what_day;
                                    pa15 = what_day;
                                    pd15 = what_day;
                                    uh15 = what_day;
                                    um15 = what_day;
                                } else {
                                    aa15 = aa;
                                    ad15 = ad;
                                    pa15 = pa;
                                    pd15 = pd;
                                    uh15 = uh;
                                    um15 = um;
                                }
                            }
                            if (i == 16) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa16 = what_day;
                                    ad16 = what_day;
                                    pa16 = what_day;
                                    pd16 = what_day;
                                    uh16 = what_day;
                                    um16 = what_day;
                                } else {
                                    aa16 = aa;
                                    ad16 = ad;
                                    pa16 = pa;
                                    pd16 = pd;
                                    uh16 = uh;
                                    um16 = um;
                                }
                            }
                            if (i == 17) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa17 = what_day;
                                    ad17 = what_day;
                                    pa17 = what_day;
                                    pd17 = what_day;
                                    uh17 = what_day;
                                    um17 = what_day;
                                } else {
                                    aa17 = aa;
                                    ad17 = ad;
                                    pa17 = pa;
                                    pd17 = pd;
                                    uh17 = uh;
                                    um17 = um;
                                }
                            }
                            if (i == 18) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa18 = what_day;
                                    ad18 = what_day;
                                    pa18 = what_day;
                                    pd18 = what_day;
                                    uh18 = what_day;
                                    um18 = what_day;
                                } else {
                                    aa18 = aa;
                                    ad18 = ad;
                                    pa18 = pa;
                                    pd18 = pd;
                                    uh18 = uh;
                                    um18 = um;
                                }
                            }
                            if (i == 19) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa19 = what_day;
                                    ad19 = what_day;
                                    pa19 = what_day;
                                    pd19 = what_day;
                                    uh19 = what_day;
                                    um19 = what_day;
                                } else {
                                    aa19 = aa;
                                    ad19 = ad;
                                    pa19 = pa;
                                    pd19 = pd;
                                    uh19 = uh;
                                    um19 = um;
                                }
                            }
                            if (i == 20) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa20 = what_day;
                                    ad20 = what_day;
                                    pa20 = what_day;
                                    pd20 = what_day;
                                    uh20 = what_day;
                                    um20 = what_day;
                                } else {
                                    aa20 = aa;
                                    ad20 = ad;
                                    pa20 = pa;
                                    pd20 = pd;
                                    uh20 = uh;
                                    um20 = um;
                                }
                            }
                            if (i == 21) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa21 = what_day;
                                    ad21 = what_day;
                                    pa21 = what_day;
                                    pd21 = what_day;
                                    uh21 = what_day;
                                    um21 = what_day;
                                } else {
                                    aa21 = aa;
                                    ad21 = ad;
                                    pa21 = pa;
                                    pd21 = pd;
                                    uh21 = uh;
                                    um21 = um;
                                }
                            }
                            if (i == 22) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa22 = what_day;
                                    ad22 = what_day;
                                    pa22 = what_day;
                                    pd22 = what_day;
                                    uh22 = what_day;
                                    um22 = what_day;
                                } else {
                                    aa22 = aa;
                                    ad22 = ad;
                                    pa22 = pa;
                                    pd22 = pd;
                                    uh22 = uh;
                                    um22 = um;
                                }
                            }
                            if (i == 23) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa23 = what_day;
                                    ad23 = what_day;
                                    pa23 = what_day;
                                    pd23 = what_day;
                                    uh23 = what_day;
                                    um23 = what_day;
                                } else {
                                    aa23 = aa;
                                    ad23 = ad;
                                    pa23 = pa;
                                    pd23 = pd;
                                    uh23 = uh;
                                    um23 = um;
                                }
                            }
                            if (i == 24) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa24 = what_day;
                                    ad24 = what_day;
                                    pa24 = what_day;
                                    pd24 = what_day;
                                    uh24 = what_day;
                                    um24 = what_day;
                                } else {
                                    aa24 = aa;
                                    ad24 = ad;
                                    pa24 = pa;
                                    pd24 = pd;
                                    uh24 = uh;
                                    um24 = um;
                                }
                            }
                            if (i == 25) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa25 = what_day;
                                    ad25 = what_day;
                                    pa25 = what_day;
                                    pd25 = what_day;
                                    uh25 = what_day;
                                    um25 = what_day;
                                } else {
                                    aa25 = aa;
                                    ad25 = ad;
                                    pa25 = pa;
                                    pd25 = pd;
                                    uh25 = uh;
                                    um25 = um;
                                }
                            }
                            if (i == 26) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa26 = what_day;
                                    ad26 = what_day;
                                    pa26 = what_day;
                                    pd26 = what_day;
                                    uh26 = what_day;
                                    um26 = what_day;
                                } else {
                                    aa26 = aa;
                                    ad26 = ad;
                                    pa26 = pa;
                                    pd26 = pd;
                                    uh26 = uh;
                                    um26 = um;
                                }
                            }
                            if (i == 27) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa27 = what_day;
                                    ad27 = what_day;
                                    pa27 = what_day;
                                    pd27 = what_day;
                                    uh27 = what_day;
                                    um27 = what_day;
                                } else {
                                    aa27 = aa;
                                    ad27 = ad;
                                    pa27 = pa;
                                    pd27 = pd;
                                    uh27 = uh;
                                    um27 = um;
                                }
                            }
                            if (i == 28) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa28 = what_day;
                                    ad28 = what_day;
                                    pa28 = what_day;
                                    pd28 = what_day;
                                    uh28 = what_day;
                                    um28 = what_day;
                                } else {
                                    aa28 = aa;
                                    ad28 = ad;
                                    pa28 = pa;
                                    pd28 = pd;
                                    uh28 = uh;
                                    um28 = um;
                                }
                            }
                            if (i == 29) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa29 = what_day;
                                    ad29 = what_day;
                                    pa29 = what_day;
                                    pd29 = what_day;
                                    uh29 = what_day;
                                    um29 = what_day;
                                } else {
                                    aa29 = aa;
                                    ad29 = ad;
                                    pa29 = pa;
                                    pd29 = pd;
                                    uh29 = uh;
                                    um29 = um;
                                }
                            }
                            if (i == 30) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa30 = what_day;
                                    ad30 = what_day;
                                    pa30 = what_day;
                                    pd30 = what_day;
                                    uh30 = what_day;
                                    um30 = what_day;
                                } else {
                                    aa30 = aa;
                                    ad30 = ad;
                                    pa30 = pa;
                                    pd30 = pd;
                                    uh30 = uh;
                                    um30 = um;
                                }
                            }
                            if (i == 31) {
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa31 = what_day;
                                    ad31 = what_day;
                                    pa31 = what_day;
                                    pd31 = what_day;
                                    uh31 = what_day;
                                    um31 = what_day;
                                } else {
                                    aa31 = aa;
                                    ad31 = ad;
                                    pa31 = pa;
                                    pd31 = pd;
                                    uh31 = uh;
                                    um31 = um;
                                }
                            }
                            //</editor-fold>
                        }
                        //end of day loop
                        Srpt_dtr.field field = new Srpt_dtr.field(employee_id, employee_name, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20, aa21, aa22, aa23, aa24, aa25, aa26, aa27, aa28, aa29, aa30, aa31, pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9, pd10, pd11, pd12, pd13, pd14, pd15, pd16, pd17, pd18, pd19, pd20, pd21, pd22, pd23, pd24, pd25, pd26, pd27, pd28, pd29, pd30, pd31, ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9, ad10, ad11, ad12, ad13, ad14, ad15, ad16, ad17, ad18, ad19, ad20, ad21, ad22, ad23, ad24, ad25, ad26, ad27, ad28, ad29, ad30, ad31, pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17, pa18, pa19, pa20, pa21, pa22, pa23, pa24, pa25, pa26, pa27, pa28, pa29, pa30, pa31, uh1, uh2, uh3, uh4, uh5, uh6, uh7, uh8, uh9, uh10, uh11, uh12, uh13, uh14, uh15, uh16, uh17, uh18, uh19, uh20, uh21, uh22, uh23, uh24, uh25, uh26, uh27, uh28, uh29, uh30, uh31, um1, um2, um3, um4, um5, um6, um7, um8, um9, um10, um11, um12, um13, um14, um15, um16, um17, um18, um19, um20, um21, um22, um23, um24, um25, um26, um27, um28, um29, um30, um31);
                        datas.add(field);
                        datas.add(field);
                    }

                    //end of main loop
                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
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

    List<Employees.to_employees> employees = new ArrayList();
    List<Employees.to_employees> employees1 = new ArrayList();

    Employees.to_employees employee = new Employees.to_employees(0, "", "", "", "", "", "", "", "", "", "", "", "", "");

    private void init_employees2(final JTextField tf) {
        String search = jTextField4.getText();
        String where = " where concat(lname,space(1), fname) like '%" + search + "%' "
                + " or concat(fname,space(1), lname) like '%" + search + "%'"
                + " order by lname asc ";
        employees = Employees.ret_data(where);
        Object[][] obj = new Object[employees.size()][2];
        int i = 0;
        for (Employees.to_employees to : employees) {
            obj[i][0] = " " + to.id;
            obj[i][1] = " " + to.lname + ", " + to.fname + " " + to.mi;
            i++;
        }
        JLabel[] labels = {};
        int[] tbl_widths_customers = {50, tf.getWidth() - 50};
        int width = 0;
        String[] col_names = {"", ""};
        TableRenderer tr = new TableRenderer();
        TableRenderer.setPopup(tf, obj, labels, tbl_widths_customers, col_names);
        tr.setCallback(new TableRenderer.Callback() {
            @Override
            public void ok(TableRenderer.OutputData data) {
                Field.Combo combo = (Field.Combo) tf;
                Employees.to_employees to = employees.get(data.selected_row);
                employee = to;
                combo.setText("" + to.lname + ", " + to.fname + " " + to.mi);
                combo.setId("" + to.id);
            }
        });
    }

    private void save_dtr() {
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                jProgressBar1.setString("Loading...Please wait...");
                jProgressBar1.setIndeterminate(true);
                Thread t = new Thread(new Runnable() {

                    @Override
                    public void run() {

                        String[] payroll_period = jTextField3.getText().split("-");
                        int payroll_from_day = 0;
                        int payroll_to_day = 0;
                        String payroll_month = "";
                        String payroll_year = "";
                        try {
                            Date period_from = dtr.util.DateType.month_date2.parse(payroll_period[0]);
                            String pr = payroll_period[1];
                            pr = pr.substring(1, pr.length());
                            Date period_to = dtr.util.DateType.month_date2.parse(pr);

                            payroll_from_day = FitIn.toInt(DateType.d.format(period_from));
                            payroll_to_day = FitIn.toInt(DateType.d.format(period_to));
                            payroll_month = "" + FitIn.toInt(DateType.m1.format(period_to));
                            payroll_year = "" + FitIn.toInt(DateType.y.format(period_to));

                            if (payroll_month.length() == 1) {
                                payroll_month = "0" + payroll_month;
                            }
                        } catch (ParseException ex) {
                            Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        List<Employees.to_employees> emp = employees1;

                        List<Dtr.to_dtr> dtrs = tbl_dtr_ALM;
                        List<Dtrs.to_dtrs> my_dtr = new ArrayList();

                        int year = FitIn.toInt(dtr.util.DateType.y.format(new Date()));
                        int month = FitIn.toInt(dtr.util.DateType.m1.format(new Date()));
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(Calendar.YEAR, year);
                        calendar.set(Calendar.MONTH, month);
                        int numDays = calendar.getActualMaximum(Calendar.DATE);

                        for (Employees.to_employees e : emp) {
                            List<Dtr.to_dtr> dtr_emp = new ArrayList();
                            int i = 0;
                            for (Dtr.to_dtr dtr : dtrs) {
                                if (dtr.no.equalsIgnoreCase("" + e.id)) {
                                    dtr_emp.add(dtr);
                                    i++;
                                }
                            }

                            if (i != 0) {
                                for (int a = payroll_from_day; a <= payroll_to_day; a++) {

                                    String dtr_date = "";
                                    String dtr_date2 = "";
                                    int count = 0;
                                    String j = "" + a;
                                    if (j.length() == 1) {
                                        j = "0" + j;
                                    }
                                    String payroll_to_date = payroll_year + "-" + payroll_month + "-" + j;

                                    List<String> dtr_dates = new ArrayList();
                                    for (Dtr.to_dtr d : dtr_emp) {

                                        try {
                                            Date date = dtr.util.DateType.slash_w_time3.parse(d.datetime);
                                            String day1 = DateType.d.format(date);
                                            if (day1.length() == 1) {
                                                day1 = "0" + day1;
                                            }
                                            dtr_date = dtr.util.DateType.y.format(date) + "-" + dtr.util.DateType.m1.format(date) + "-" + day1;

                                            if (payroll_to_date.equalsIgnoreCase(dtr_date)) {
                                                dtr_dates.add(d.datetime);
                                                dtr_date2 = DateType.sf.format(date);
                                                count++;
                                            }

                                        } catch (ParseException ex) {
                                            Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    String am_arrival = "";
                                    String am_departure = "";
                                    String pm_arrival = "";
                                    String pm_departure = "";

                                    int d = 0;
                                    for (String dd : dtr_dates) {
                                        if (d == 0) {
                                            am_arrival = dtr.util.DateType.convert_slash_datetime5(dd);
                                        }
                                        if (d == 1) {
                                            am_departure = dtr.util.DateType.convert_slash_datetime5(dd);
                                        }
                                        if (d == 2) {
                                            pm_arrival = dtr.util.DateType.convert_slash_datetime5(dd);
                                        }
                                        if (d == 3) {
                                            pm_departure = dtr.util.DateType.convert_slash_datetime5(dd);
                                        }
                                        d++;
                                    }
                                    if (am_arrival.isEmpty()) {
                                        am_arrival = null;
                                    }
                                    if (am_departure.isEmpty()) {
                                        am_departure = null;
                                    }
                                    if (pm_arrival.isEmpty()) {
                                        pm_arrival = null;
                                    }
                                    if (pm_departure.isEmpty()) {
                                        pm_departure = null;
                                    }
                                    int id = 0;
                                    String employee_id = "" + e.id;
                                    String employee_name = e.lname + ", " + e.fname + " " + e.mi;
                                    String department_id = e.department_id;
                                    String department_name = e.department;
                                    String undertime_hours = "00";
                                    String undertime_minutes = "00";
                                    String date_added = dtr.util.DateType.datetime.format(new Date());
                                    String user_id = "";
                                    String user_screen_name = "";
                                    if (!dtr_date2.isEmpty()) {
                                        Dtrs.to_dtrs dtrrs = new Dtrs.to_dtrs(id, employee_id, employee_name, department_id, department_name, dtr_date2, am_arrival, am_departure, pm_arrival, pm_departure, undertime_hours, undertime_minutes, date_added, user_id, user_screen_name);
                                        my_dtr.add(dtrrs);
                                    }
                                }
                            }
                        }
                        Dtrs.add_data(my_dtr);
                        Alert.set(1, "");
                        tbl_dtr_ALM.clear();
                        tbl_dtr_M.fireTableDataChanged();
                        jProgressBar1.setString("Finished...");
                        jProgressBar1.setIndeterminate(false);
                    }
                });
                t.start();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
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
        int[] tbl_widths_dtrs = {70, 50, 100, 60, 60, 60, 60, 50, 50, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_dtrs.length; i < n; i++) {
            if (i == 2) {
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
    }

    public static void loadData_dtrs(List<to_dtrs> acc) {
        tbl_dtrs_ALM.clear();
        tbl_dtrs_ALM.addAll(acc);
    }

    public static class TbldtrsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "No", "Employee", "AM-Arr", "AM-Dep", "PM-Arr", "PM-Dep", "", "", "pm_departure", "undertime_hours", "undertime_minutes", "date_added", "user_id", "user_screen_name"
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
                    return " " + dtr.util.DateType.convert_slash_datetime2(tt.dtr_date);
                case 1:
                    return " " + tt.employee_id;

                case 2:
                    return " " + tt.employee_name;
                case 3:
                    if (tt.am_arrival == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.am_arrival);
                case 4:
                    if (tt.am_departure == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.am_departure);
                case 5:
                    if (tt.pm_arrival == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.pm_arrival);
                case 6:
                    if (tt.pm_departure == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.pm_departure);
                case 7:
                    return " Update";
                case 8:
                    return " Delete";
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

    private void data_cols_dtr() {
        String[] dtr_date = jTextField3.getText().split("-");
        String from = dtr.util.DateType.convert_dash_date3(dtr_date[0]);
        String to = dtr_date[1].substring(1, dtr_date[1].length());
        to = dtr.util.DateType.convert_dash_date3(to);
        Field.Combo employee = (Field.Combo) jTextField4;
        String where = " where department_name like '%" + "" + "%'  ";

        if (!jCheckBox2.isSelected()) {
            where = where + " and Date(dtr_date) between '" + from + "' and '" + to + "'";
        }
        if (!jCheckBox1.isSelected()) {
            where = where + " and employee_id= '" + employee.getId() + "' ";
        }
        where = where + " order by Date(dtr_date),employee_id asc ";
        System.out.println(where);
        List<to_dtrs> datas = Dtrs.ret_data(where);
        loadData_dtrs(datas);
    }
//</editor-fold> 

    private void select_employee_dtr() {
        int row = tbl_dtrs.getSelectedRow();
        if (row < 0) {
            return;
        }
        int col = tbl_dtrs.getSelectedColumn();
        final to_dtrs to = (to_dtrs) tbl_dtrs_ALM.get(row);
        if (col == 7) {
            //edit
            Window p = (Window) this;
            Dlg_edit_dtr nd = Dlg_edit_dtr.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_edit_dtr.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_edit_dtr.OutputData data) {
                    closeDialog.ok();
                    Dtrs.update_data(to, data.am_arrival, data.am_departure, data.pm_arrival, data.pm_departure, data.undertime_hour, data.undertime_minute);
                    Alert.set(2, "");
                    data_cols_dtr();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 8) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Dtrs.delete_data(to);
                    Alert.set(3, "");
                    data_cols_dtr();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }
}
