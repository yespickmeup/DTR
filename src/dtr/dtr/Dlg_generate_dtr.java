/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtr;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.dtrs.Dlg_dtr_add;
import dtr.dtrs.Dlg_dtr_edit2;
import dtr.dtrs.Dlg_dtr_select_shift;
import dtr.dtrs.Dtrs;
import dtr.dtrs.Dtrs.to_dtrs;
import dtr.employees.Employees;
import dtr.holidays.Dlg_holidays;
import dtr.holidays.Holidays;
import dtr.pnl.Extract;
import static dtr.pnl.Extract.showExcelData;
import dtr.reports.Srpt_dtr;
import dtr.shifting_types.Shifting_types;
import dtr.sick_leaves.Dlg_sick_leaves;
import dtr.sick_leaves.Sick_leaves;
import static dtr.test.AddTime.sumTimes;
import dtr.util.Alert;
import dtr.util.DateType;
import dtr.util.Dlg_confirm_action;
import dtr.util.Dlg_confirm_action2;
import dtr.util.TableRenderer;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
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
import org.jfree.ui.Align;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

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
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jButton6 = new Button.Default();
        jButton7 = new Button.Default();
        jButton8 = new Button.Default();
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

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/icons/clock154.png"))); // NOI18N
        jMenuItem1.setText("Select Shift");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/icons/delete30.png"))); // NOI18N
        jMenuItem2.setText("Delete");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Payroll Period:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        jCheckBox2.setEnabled(false);

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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtr/icons/add186.png"))); // NOI18N
        jButton6.setText("New");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Leave");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Holidays");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 704, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_dtrsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_dtrsMouseReleased(evt);
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
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
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
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
            .addGap(0, 595, Short.MAX_VALUE)
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
                .addComponent(jTabbedPane1)
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new_dtr();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        leave();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        holdaiys();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tbl_dtrsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dtrsMousePressed
        popup(evt);
    }//GEN-LAST:event_tbl_dtrsMousePressed

    private void tbl_dtrsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dtrsMouseReleased
        popup(evt);
    }//GEN-LAST:event_tbl_dtrsMouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        multi_shift_update();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        multiple_delete();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
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
        Field.Combo emp = (Field.Combo) jTextField4;

        setPeriod();
        init_tbl_dtr(jTable1);
        init_tbl_dtrs(tbl_dtrs);
        String where = " ";
        employees1 = Employees.ret_data(where);

        //test
//        employees = Employees.ret_data(" where id=12 ");
//        employee = employees.get(0);
//        System.out.println("Emp ID: " + employee.id);
//        System.out.println("Emp Name: " + employee.lname);
//        emp.setText("RUEL V. ARANAS");
//        emp.setId("12");
//        data_cols_dtr();
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
//                String where = " where Date(dtr_date) between '" + from + "' and '" + to + "' ";
//                List<Dtrs.to_dtrs> records = Dtrs.ret_data(where);
//                if (records.isEmpty()) {
                loadData_dtr(dtrs);
                jButton1.setEnabled(true);
                jButton3.setEnabled(true);
                jLabel3.setText("" + tbl_dtr_ALM.size());
                jProgressBar1.setString("Finished...");
                jProgressBar1.setIndeterminate(false);
//                } else {
//                    System.out.println("Size to Delete: " + dtrs.size());
//                    delete_dtr(where, dtrs);
//                }

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

        List<Shifting_types.to_shifting_types> shift_types = Shifting_types.ret_data("");
        final List<Shifting_types.shifts> dtr_hours = new ArrayList();
        String[] noh = {"08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 AM", "03:00 AM", "04:00 AM", "05:00 AM"};
        Shifting_types.shifts s_noh = new Shifting_types.shifts("ROH", noh);
        dtr_hours.add(s_noh);
        for (Shifting_types.to_shifting_types to : shift_types) {
            if (to.shift_starts.equalsIgnoreCase("\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"")) {
                String[] shift = {""};
                Shifting_types.shifts s_ms = new Shifting_types.shifts(to.shift_name, shift);
                dtr_hours.add(s_ms);
            } else {
                String[] shift = {to.shift_starts};
                Shifting_types.shifts s_ms = new Shifting_types.shifts(to.shift_name, shift);
                dtr_hours.add(s_ms);
            }
        }

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

                String pay_month = "";
                String pay_year = "";
                try {
                    Date period_from = dtr.util.DateType.month_date2.parse(payroll_period[0]);

                    String pr = payroll_period[1];
                    pr = pr.substring(1, pr.length());

                    Date period_to = dtr.util.DateType.month_date2.parse(pr);

                    int payroll_from_day = FitIn.toInt(DateType.d.format(period_from));
                    int payroll_to_day = 31;//FitIn.toInt(DateType.d.format(period_to));

                    String payroll_month = "" + FitIn.toInt(DateType.m1.format(period_to));
                    String payroll_year = "" + FitIn.toInt(DateType.y.format(period_to));
                    pay_month = payroll_month;
                    pay_year = payroll_year;
                    if (payroll_month.length() == 1) {
                        payroll_month = "0" + payroll_month;
                    }

                    //<editor-fold defaultstate="collapsed" desc=" holidays ">
                    String where4 = " where Date(date_of_holiday) between '" + DateType.sf.format(period_from) + "' and '" + DateType.sf.format(period_to) + "' ";
                    List<Holidays.to_holidays> holidays = Holidays.ret_data(where4);
                    //</editor-fold>

                    for (Employees.to_employees emp : employees) {
                        String where2 = " where id='" + emp.shift_id + "' ";

                        //<editor-fold defaultstate="collapsed" desc=" retrieve leaves ">
                        String where3 = " where employee_id='" + emp.id + "' and Date(date_of_leave) between '" + DateType.sf.format(period_from) + "' and '" + DateType.sf.format(period_to) + "' ";

                        List<Sick_leaves.to_sick_leaves> leaves = Sick_leaves.ret_data(where3);
                        //</editor-fold>
                        String where5 = " where emp_id='" + emp.id + "' ";

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
                        String uh66 = "";
                        //</editor-fold>

                        List<String> times = new ArrayList();
                        for (int i = payroll_from_day; i <= payroll_to_day; i++) {

                            String str_date = "" + i;
                            if (str_date.length() == 1) {
                                str_date = "0" + i;
                            }
                            str_date = payroll_year + "-" + payroll_month + "-" + str_date;
                            Date loop_date = DateType.sf.parse(str_date);
                            String what_day = DateType.day.format(loop_date);

                            to_dtrs my_dtr = new to_dtrs(0, "", "", "", "", "", "", "", "", "", "00", "00", "", "", "", false, "");

                            for (to_dtrs dtr : employee_dtrs) {

                                if (str_date.equalsIgnoreCase(dtr.dtr_date)) {
                                    my_dtr = dtr;
                                    break;
                                }
                            }

                            String aa = "";
                            String ad = "";
                            String pa = "";
                            String pd = "";
                            String uh = "";
                            String um = "";

                            if (my_dtr.id != 0) {
                                double hh = FitIn.toInt(my_dtr.undertime_hours);
                                double mm = FitIn.toInt(my_dtr.undertime_minutes);

                                String hhh = "" + FitIn.fmt_woc(hh);
                                if (hhh.length() == 1) {
                                    hhh = "0" + hhh;
                                }

                                String mmm = "" + FitIn.fmt_woc(mm);
                                if (mmm.length() == 1) {
                                    mmm = "0" + mmm;
                                }

                                times.add(hhh + ":" + mmm + ":00");
                                if (my_dtr.am_arrival != null) {
                                    aa = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.am_arrival);

                                    String daily = dtr.util.DateType.convert_datetime_to_daily(my_dtr.dtr_date);
                                    String hh1 = aa.substring(0, 2);
                                    String hh2 = aa.substring(3, 5);
                                    String hh3 = aa.substring(6, 8);
                                    aa = hh1 + ":" + hh2 + " " + hh3;

//                                    if (!my_dtr.user_screen_name.equalsIgnoreCase("ROH")) {
//                                        aa = MyShifts.getNOH(aa, my_dtr.user_screen_name, dtr_hours);
//                                    }
                                    if (my_dtr.user_screen_name.equalsIgnoreCase("OFF") || my_dtr.user_screen_name.equalsIgnoreCase("OB")) {
                                        aa = "OFF";
                                        ad = "OFF";
                                        pa = "OFF";
                                        pd = "OFF";
                                    }
                                }

                                if (my_dtr.am_departure != null) {
                                    ad = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.am_departure);
                                    String daily = dtr.util.DateType.convert_datetime_to_daily(my_dtr.dtr_date);

                                    String hh1 = ad.substring(0, 2);
                                    String hh2 = ad.substring(3, 5);
                                    String hh3 = ad.substring(5, 8);

                                    ad = hh1 + ":" + hh2 + "" + hh3;

//                                    if (!my_dtr.user_screen_name.equalsIgnoreCase("ROH")) {
//                                        ad = MyShifts.getNOH(ad, my_dtr.user_screen_name, dtr_hours);
//                                    }
                                    if (my_dtr.user_screen_name.equalsIgnoreCase("OFF") || my_dtr.user_screen_name.equalsIgnoreCase("OB")) {
                                        aa = "OFF";
                                        ad = "OFF";
                                        pa = "OFF";
                                        pd = "OFF";
                                    }
                                }
                                if (my_dtr.pm_arrival != null) {
                                    pa = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.pm_arrival);
                                    String daily = dtr.util.DateType.convert_datetime_to_daily(my_dtr.dtr_date);

                                    String hh1 = pa.substring(0, 2);
                                    String hh2 = pa.substring(3, 5);
                                    String hh3 = pa.substring(5, 8);

                                    pa = hh1 + ":" + hh2 + "" + hh3;
//                                    if (!my_dtr.user_screen_name.equalsIgnoreCase("ROH")) {
//                                        pa = MyShifts.getNOH(pa, my_dtr.user_screen_name, dtr_hours);
//                                    }
                                    if (my_dtr.user_screen_name.equalsIgnoreCase("OFF") || my_dtr.user_screen_name.equalsIgnoreCase("OB")) {
                                        aa = "OFF";
                                        ad = "OFF";
                                        pa = "OFF";
                                        pd = "OFF";
                                    }

                                }
                                if (my_dtr.pm_departure != null) {
                                    pd = dtr.util.DateType.convert_datetime_to_hour_minute(my_dtr.pm_departure);
                                    String daily = dtr.util.DateType.convert_datetime_to_daily(my_dtr.dtr_date);

                                    String hh1 = pd.substring(0, 2);
                                    String hh2 = pd.substring(3, 5);
                                    String hh3 = pd.substring(5, 8);

                                    pd = hh1 + ":" + hh2 + "" + hh3;
//                                    if (!my_dtr.user_screen_name.equalsIgnoreCase("ROH")) {
//                                        pd = MyShifts.getNOH(pd, my_dtr.user_screen_name, dtr_hours);
//                                    }
                                    if (my_dtr.user_screen_name.equalsIgnoreCase("OFF") || my_dtr.user_screen_name.equalsIgnoreCase("OB")) {
                                        aa = "OFF";
                                        ad = "OFF";
                                        pa = "OFF";
                                        pd = "OFF";
                                    }
                                }
                                if (my_dtr.undertime_hours.equalsIgnoreCase("00") || my_dtr.undertime_hours.isEmpty() || my_dtr.undertime_hours.equalsIgnoreCase("0")) {
                                    uh = "";
                                } else {
                                    uh = FitIn.fmt_woc("" + my_dtr.undertime_hours);
                                }
                                if (my_dtr.undertime_minutes.equalsIgnoreCase("00") || my_dtr.undertime_minutes.isEmpty() || my_dtr.undertime_minutes.equalsIgnoreCase("0")) {
                                    um = "";
                                } else {
                                    um = FitIn.fmt_woc("" + my_dtr.undertime_minutes);
                                }
                            }

                            for (Sick_leaves.to_sick_leaves leave : leaves) {
                                if (str_date.equalsIgnoreCase(leave.date_of_leave)) {
                                    if (leave.half_day_am == 1) {
                                        aa = leave.reason;
                                        ad = "";
                                    }
                                    if (leave.half_day_pm == 1) {
                                        pa = "";
                                        pd = "";
                                    }
                                }
                            }

                            for (Holidays.to_holidays holiday : holidays) {
                                if (str_date.equalsIgnoreCase(holiday.date_of_holiday)) {
                                    if (holiday.half_day_am == 1) {
                                        aa = holiday.holiday;
                                        ad = holiday.holiday;
                                    }
                                    if (holiday.half_day_pm == 1) {
                                        pa = holiday.holiday;
                                        pd = holiday.holiday;
                                    }
                                }
                            }

                            //<editor-fold defaultstate="collapsed" desc=" days ">
                            if (i == 1) {
                                //<editor-fold defaultstate="collapsed" desc=" 1 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {

                                    aa1 = day(aa, what_day);
                                    ad1 = day(ad, what_day);
                                    pa1 = day(pa, what_day);
                                    pd1 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa1 = aa;
                                        ad1 = ad;
                                        pa1 = pa;
                                        pd1 = pd;
                                        uh1 = uh;
                                        um1 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa1 = what_day;
                                        ad1 = "";
                                        pa1 = "";
                                        pd1 = "";
                                        uh1 = "";
                                        um1 = "";
                                    }

                                } else {
                                    aa1 = aa;
                                    ad1 = ad;
                                    pa1 = pa;
                                    pd1 = pd;
                                    uh1 = uh;
                                    um1 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 2) {
                                //<editor-fold defaultstate="collapsed" desc=" 2 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa2 = day(aa, what_day);
                                    ad2 = day(ad, what_day);
                                    pa2 = day(pa, what_day);
                                    pd2 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa2 = aa;
                                        ad2 = ad;
                                        pa2 = pa;
                                        pd2 = pd;
                                        uh2 = uh;
                                        um2 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa2 = what_day;
                                        ad2 = "";
                                        pa2 = "";
                                        pd2 = "";
                                        uh2 = "";
                                        um2 = "";
                                    }
                                } else {
                                    aa2 = aa;
                                    ad2 = ad;
                                    pa2 = pa;
                                    pd2 = pd;
                                    uh2 = uh;
                                    um2 = um;
                                }
                                //</editor-fold>
                            }
                            if (i == 3) {
                                //<editor-fold defaultstate="collapsed" desc=" 3 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa3 = day(aa, what_day);
                                    ad3 = day(ad, what_day);
                                    pa3 = day(pa, what_day);
                                    pd3 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa3 = aa;
                                        ad3 = ad;
                                        pa3 = pa;
                                        pd3 = pd;
                                        uh3 = uh;
                                        um3 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa3 = what_day;
                                        ad3 = "";
                                        pa3 = "";
                                        pd3 = "";
                                        uh3 = "";
                                        um13 = "";
                                    }

                                } else {
                                    aa3 = aa;
                                    ad3 = ad;
                                    pa3 = pa;
                                    pd3 = pd;
                                    uh3 = uh;
                                    um3 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 4) {
                                //<editor-fold defaultstate="collapsed" desc=" 4 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa4 = day(aa, what_day);
                                    ad4 = day(ad, what_day);
                                    pa4 = day(pa, what_day);
                                    pd4 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa4 = aa;
                                        ad4 = ad;
                                        pa4 = pa;
                                        pd4 = pd;
                                        uh4 = uh;
                                        um4 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa4 = what_day;
                                        ad4 = "";
                                        pa4 = "";
                                        pd4 = "";
                                        uh4 = "";
                                        um4 = "";
                                    }

                                } else {
                                    aa4 = aa;
                                    ad4 = ad;
                                    pa4 = pa;
                                    pd4 = pd;
                                    uh4 = uh;
                                    um4 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 5) {
                                //<editor-fold defaultstate="collapsed" desc=" 5 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa5 = day(aa, what_day);
                                    ad5 = day(ad, what_day);
                                    pa5 = day(pa, what_day);
                                    pd5 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa5 = aa;
                                        ad5 = ad;
                                        pa5 = pa;
                                        pd5 = pd;
                                        uh5 = uh;
                                        um5 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa5 = what_day;
                                        ad5 = "";
                                        pa5 = "";
                                        pd5 = "";
                                        uh5 = "";
                                        um5 = "";
                                    }
                                } else {
                                    aa5 = aa;
                                    ad5 = ad;
                                    pa5 = pa;
                                    pd5 = pd;
                                    uh5 = uh;
                                    um5 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 6) {
                                //<editor-fold defaultstate="collapsed" desc=" 6 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa6 = day(aa, what_day);
                                    ad6 = day(ad, what_day);
                                    pa6 = day(pa, what_day);
                                    pd6 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa6 = aa;
                                        ad6 = ad;
                                        pa6 = pa;
                                        pd6 = pd;
                                        uh6 = uh;
                                        um6 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa6 = what_day;
                                        ad6 = "";
                                        pa6 = "";
                                        pd6 = "";
                                        uh6 = "";
                                        um6 = "";
                                    }
                                    uh6 = uh;

                                } else {
                                    aa6 = aa;
                                    ad6 = ad;
                                    pa6 = pa;
                                    pd6 = pd;
                                    uh6 = uh;
                                    um6 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 7) {
                                //<editor-fold defaultstate="collapsed" desc=" 7 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa7 = day(aa, what_day);
                                    ad7 = day(ad, what_day);
                                    pa7 = day(pa, what_day);
                                    pd7 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa7 = aa;
                                        ad7 = ad;
                                        pa7 = pa;
                                        pd7 = pd;
                                        uh7 = uh;
                                        um7 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa7 = what_day;
                                        ad7 = "";
                                        pa7 = "";
                                        pd7 = "";
                                        uh7 = "";
                                        um7 = "";
                                    }
                                } else {
                                    aa7 = aa;
                                    ad7 = ad;
                                    pa7 = pa;
                                    pd7 = pd;
                                    uh7 = uh;
                                    um7 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 8) {
                                //<editor-fold defaultstate="collapsed" desc=" 8 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa8 = day(aa, what_day);
                                    ad8 = day(ad, what_day);
                                    pa8 = day(pa, what_day);
                                    pd8 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa8 = aa;
                                        ad8 = ad;
                                        pa8 = pa;
                                        pd8 = pd;
                                        uh8 = uh;
                                        um8 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa8 = what_day;
                                        ad8 = "";
                                        pa8 = "";
                                        pd8 = "";
                                        uh8 = "";
                                        um8 = "";
                                    }
                                } else {
                                    aa8 = aa;
                                    ad8 = ad;
                                    pa8 = pa;
                                    pd8 = pd;
                                    uh8 = uh;
                                    um8 = um;
                                }

                                //</editor-fold>
                            }
                            if (i == 9) {
                                //<editor-fold defaultstate="collapsed" desc=" 9 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa9 = day(aa, what_day);

                                    ad9 = day(ad, what_day);
                                    pa9 = day(pa, what_day);
                                    pd9 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa9 = aa;
                                        ad9 = ad;
                                        pa9 = pa;
                                        pd9 = pd;
                                        uh9 = uh;
                                        um9 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa9 = what_day;
                                        ad9 = "";
                                        pa9 = "";
                                        pd9 = "";
                                        uh9 = "";
                                        um9 = "";
                                    }
                                } else {
                                    aa9 = aa;
                                    ad9 = ad;
                                    pa9 = pa;
                                    pd9 = pd;
                                    uh9 = uh;
                                    um9 = um;

                                }

                                //</editor-fold>
                            }
                            if (i == 10) {
                                //<editor-fold defaultstate="collapsed" desc=" 10 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa10 = day(aa, what_day);
                                    ad10 = day(ad, what_day);
                                    pa10 = day(pa, what_day);
                                    pd10 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa10 = aa;
                                        ad10 = ad;
                                        pa10 = pa;
                                        pd10 = pd;
                                        uh10 = uh;
                                        um10 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa10 = what_day;
                                        ad10 = "";
                                        pa10 = "";
                                        pd10 = "";
                                        uh10 = "";
                                        um10 = "";
                                    }
                                } else {
                                    aa10 = aa;
                                    ad10 = ad;
                                    pa10 = pa;
                                    pd10 = pd;
                                    uh10 = uh;
                                    um10 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 11) {
                                //<editor-fold defaultstate="collapsed" desc=" 11 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa11 = day(aa, what_day);
                                    ad11 = day(ad, what_day);
                                    pa11 = day(pa, what_day);
                                    pd11 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa11 = aa;
                                        ad11 = ad;
                                        pa11 = pa;
                                        pd11 = pd;
                                        uh11 = uh;
                                        um11 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa11 = what_day;
                                        ad11 = "";
                                        pa11 = "";
                                        pd11 = "";
                                        uh11 = "";
                                        um11 = "";
                                    }
                                } else {
                                    aa11 = aa;
                                    ad11 = ad;
                                    pa11 = pa;
                                    pd11 = pd;
                                    uh11 = uh;
                                    um11 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 12) {
                                //<editor-fold defaultstate="collapsed" desc=" 12 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa12 = day(aa, what_day);
                                    ad12 = day(ad, what_day);
                                    pa12 = day(pa, what_day);
                                    pd12 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa12 = aa;
                                        ad12 = ad;
                                        pa12 = pa;
                                        pd12 = pd;
                                        uh12 = uh;
                                        um12 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa12 = what_day;
                                        ad12 = "";
                                        pa12 = "";
                                        pd12 = "";
                                        uh12 = "";
                                        um12 = "";
                                    }
                                } else {
                                    aa12 = aa;
                                    ad12 = ad;
                                    pa12 = pa;
                                    pd12 = pd;
                                    uh12 = uh;
                                    um12 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 13) {
                                //<editor-fold defaultstate="collapsed" desc=" 13 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa13 = day(aa, what_day);
                                    ad13 = day(ad, what_day);
                                    pa13 = day(pa, what_day);
                                    pd13 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa13 = aa;
                                        ad13 = ad;
                                        pa13 = pa;
                                        pd13 = pd;
                                        uh13 = uh;
                                        um13 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa13 = what_day;
                                        ad13 = "";
                                        pa13 = "";
                                        pd13 = "";
                                        uh13 = "";
                                        um13 = "";
                                    }
                                } else {
                                    aa13 = aa;
                                    ad13 = ad;
                                    pa13 = pa;
                                    pd13 = pd;
                                    uh13 = uh;
                                    um13 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 14) {
                                //<editor-fold defaultstate="collapsed" desc=" 14 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa14 = day(aa, what_day);
                                    ad14 = day(ad, what_day);
                                    pa14 = day(pa, what_day);
                                    pd14 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa14 = aa;
                                        ad14 = ad;
                                        pa14 = pa;
                                        pd14 = pd;
                                        uh14 = uh;
                                        um14 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa14 = what_day;
                                        ad14 = "";
                                        pa14 = "";
                                        pd14 = "";
                                        uh14 = "";
                                        um14 = "";
                                    }
                                } else {
                                    aa14 = aa;
                                    ad14 = ad;
                                    pa14 = pa;
                                    pd14 = pd;
                                    uh14 = uh;
                                    um14 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 15) {
                                //<editor-fold defaultstate="collapsed" desc=" 15 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa15 = day(aa, what_day);
                                    ad15 = day(ad, what_day);
                                    pa15 = day(pa, what_day);
                                    pd15 = day(pd, what_day);

                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa15 = aa;
                                        ad15 = ad;
                                        pa15 = pa;
                                        pd15 = pd;
                                        uh15 = uh;
                                        um15 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa15 = what_day;
                                        ad15 = "";
                                        pa15 = "";
                                        pd15 = "";
                                        uh15 = "";
                                        um15 = "";
                                    }
                                } else {
                                    aa15 = aa;
                                    ad15 = ad;
                                    pa15 = pa;
                                    pd15 = pd;
                                    uh15 = uh;
                                    um15 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 16) {
                                //<editor-fold defaultstate="collapsed" desc=" 16 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa16 = day(aa, what_day);
                                    ad16 = day(ad, what_day);
                                    pa16 = day(pa, what_day);
                                    pd16 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa16 = aa;
                                        ad16 = ad;
                                        pa16 = pa;
                                        pd16 = pd;
                                        uh16 = uh;
                                        um16 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa16 = what_day;
                                        ad16 = "";
                                        pa16 = "";
                                        pd16 = "";
                                        uh16 = "";
                                        um16 = "";
                                    }
                                } else {
                                    aa16 = aa;
                                    ad16 = ad;
                                    pa16 = pa;
                                    pd16 = pd;
                                    uh16 = uh;
                                    um16 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 17) {
                                //<editor-fold defaultstate="collapsed" desc=" 17 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa17 = day(aa, what_day);
                                    ad17 = day(ad, what_day);
                                    pa17 = day(pa, what_day);
                                    pd17 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa17 = aa;
                                        ad17 = ad;
                                        pa17 = pa;
                                        pd17 = pd;
                                        uh17 = uh;
                                        um17 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa17 = what_day;
                                        ad17 = "";
                                        pa17 = "";
                                        pd17 = "";
                                        uh17 = "";
                                        um17 = "";
                                    }
                                } else {
                                    aa17 = aa;
                                    ad17 = ad;
                                    pa17 = pa;
                                    pd17 = pd;
                                    uh17 = uh;
                                    um17 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 18) {
                                //<editor-fold defaultstate="collapsed" desc=" 18 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa18 = day(aa, what_day);
                                    ad18 = day(ad, what_day);
                                    pa18 = day(pa, what_day);
                                    pd18 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa18 = aa;
                                        ad18 = ad;
                                        pa18 = pa;
                                        pd18 = pd;
                                        uh18 = uh;
                                        um18 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa18 = what_day;
                                        ad18 = "";
                                        pa18 = "";
                                        pd18 = "";
                                        uh18 = "";
                                        um18 = "";
                                    }
                                } else {
                                    aa18 = aa;
                                    ad18 = ad;
                                    pa18 = pa;
                                    pd18 = pd;
                                    uh18 = uh;
                                    um18 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 19) {
                                //<editor-fold defaultstate="collapsed" desc=" 19 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa19 = day(aa, what_day);
                                    ad19 = day(ad, what_day);
                                    pa19 = day(pa, what_day);
                                    pd19 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa19 = aa;
                                        ad19 = ad;
                                        pa19 = pa;
                                        pd19 = pd;
                                        uh19 = uh;
                                        um19 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa19 = what_day;
                                        ad19 = "";
                                        pa19 = "";
                                        pd19 = "";
                                        uh19 = "";
                                        um19 = "";
                                    }
                                } else {
                                    aa19 = aa;
                                    ad19 = ad;
                                    pa19 = pa;
                                    pd19 = pd;
                                    uh19 = uh;
                                    um19 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 20) {
                                //<editor-fold defaultstate="collapsed" desc=" 20 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa20 = day(aa, what_day);
                                    ad20 = day(ad, what_day);
                                    pa20 = day(pa, what_day);
                                    pd20 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa20 = aa;
                                        ad20 = ad;
                                        pa20 = pa;
                                        pd20 = pd;
                                        uh20 = uh;
                                        um20 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa20 = what_day;
                                        ad20 = "";
                                        pa20 = "";
                                        pd20 = "";
                                        uh20 = "";
                                        um20 = "";
                                    }
                                } else {
                                    aa20 = aa;
                                    ad20 = ad;
                                    pa20 = pa;
                                    pd20 = pd;
                                    uh20 = uh;
                                    um20 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 21) {
                                //<editor-fold defaultstate="collapsed" desc=" 21 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa21 = day(aa, what_day);
                                    ad21 = day(ad, what_day);
                                    pa21 = day(pa, what_day);
                                    pd21 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa21 = aa;
                                        ad21 = ad;
                                        pa21 = pa;
                                        pd21 = pd;
                                        uh21 = uh;
                                        um21 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa21 = what_day;
                                        ad21 = "";
                                        pa21 = "";
                                        pd21 = "";
                                        uh21 = "";
                                        um21 = "";
                                    }
                                } else {
                                    aa21 = aa;
                                    ad21 = ad;
                                    pa21 = pa;
                                    pd21 = pd;
                                    uh21 = uh;
                                    um21 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 22) {
                                //<editor-fold defaultstate="collapsed" desc=" 22 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa22 = day(aa, what_day);
                                    ad22 = day(ad, what_day);
                                    pa22 = day(pa, what_day);
                                    pd22 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa22 = aa;
                                        ad22 = ad;
                                        pa22 = pa;
                                        pd22 = pd;
                                        uh22 = uh;
                                        um22 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa22 = what_day;
                                        ad22 = "";
                                        pa22 = "";
                                        pd22 = "";
                                        uh22 = "";
                                        um22 = "";
                                    }
                                } else {
                                    aa22 = aa;
                                    ad22 = ad;
                                    pa22 = pa;
                                    pd22 = pd;
                                    uh22 = uh;
                                    um22 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 23) {
                                //<editor-fold defaultstate="collapsed" desc=" 23 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa23 = day(aa, what_day);
                                    ad23 = day(ad, what_day);
                                    pa23 = day(pa, what_day);
                                    pd23 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa23 = aa;
                                        ad23 = ad;
                                        pa23 = pa;
                                        pd23 = pd;
                                        uh23 = uh;
                                        um23 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa23 = what_day;
                                        ad23 = "";
                                        pa23 = "";
                                        pd23 = "";
                                        uh23 = "";
                                        um23 = "";
                                    }
                                } else {
                                    aa23 = aa;
                                    ad23 = ad;
                                    pa23 = pa;
                                    pd23 = pd;
                                    uh23 = uh;
                                    um23 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 24) {
                                //<editor-fold defaultstate="collapsed" desc=" 24 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa24 = day(aa, what_day);
                                    ad24 = day(ad, what_day);
                                    pa24 = day(pa, what_day);
                                    pd24 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa24 = aa;
                                        ad24 = ad;
                                        pa24 = pa;
                                        pd24 = pd;
                                        uh24 = uh;
                                        um24 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa24 = what_day;
                                        ad24 = "";
                                        pa24 = "";
                                        pd24 = "";
                                        uh24 = "";
                                        um24 = "";
                                    }
                                } else {
                                    aa24 = aa;
                                    ad24 = ad;
                                    pa24 = pa;
                                    pd24 = pd;
                                    uh24 = uh;
                                    um24 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 25) {
                                //<editor-fold defaultstate="collapsed" desc=" 25 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa25 = day(aa, what_day);
                                    ad25 = day(ad, what_day);
                                    pa25 = day(pa, what_day);
                                    pd25 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa25 = aa;
                                        ad25 = ad;
                                        pa25 = pa;
                                        pd25 = pd;
                                        uh25 = uh;
                                        um25 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa25 = what_day;
                                        ad25 = "";
                                        pa25 = "";
                                        pd25 = "";
                                        uh25 = "";
                                        um25 = "";
                                    }
                                } else {
                                    aa25 = aa;
                                    ad25 = ad;
                                    pa25 = pa;
                                    pd25 = pd;
                                    uh25 = uh;
                                    um25 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 26) {
                                //<editor-fold defaultstate="collapsed" desc=" 26 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa26 = day(aa, what_day);
                                    ad26 = day(ad, what_day);
                                    pa26 = day(pa, what_day);
                                    pd26 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa26 = aa;
                                        ad26 = ad;
                                        pa26 = pa;
                                        pd26 = pd;
                                        uh26 = uh;
                                        um26 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa26 = what_day;
                                        ad26 = "";
                                        pa26 = "";
                                        pd26 = "";
                                        uh26 = "";
                                        um26 = "";
                                    }
                                } else {
                                    aa26 = aa;
                                    ad26 = ad;
                                    pa26 = pa;
                                    pd26 = pd;
                                    uh26 = uh;
                                    um26 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 27) {
                                //<editor-fold defaultstate="collapsed" desc=" 27 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa27 = day(aa, what_day);
                                    ad27 = day(ad, what_day);
                                    pa27 = day(pa, what_day);
                                    pd27 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa27 = aa;
                                        ad27 = ad;
                                        pa27 = pa;
                                        pd27 = pd;
                                        uh27 = uh;
                                        um27 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa27 = what_day;
                                        ad27 = "";
                                        pa27 = "";
                                        pd27 = "";
                                        uh27 = "";
                                        um27 = "";
                                    }
                                } else {
                                    aa27 = aa;
                                    ad27 = ad;
                                    pa27 = pa;
                                    pd27 = pd;
                                    uh27 = uh;
                                    um27 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 28) {
                                //<editor-fold defaultstate="collapsed" desc=" 28 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa28 = day(aa, what_day);
                                    ad28 = day(ad, what_day);
                                    pa28 = day(pa, what_day);
                                    pd28 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa28 = aa;
                                        ad28 = ad;
                                        pa28 = pa;
                                        pd28 = pd;
                                        uh28 = uh;
                                        um28 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa28 = what_day;
                                        ad28 = "";
                                        pa28 = "";
                                        pd28 = "";
                                        uh28 = "";
                                        um28 = "";
                                    }
                                } else {
                                    aa28 = aa;
                                    ad28 = ad;
                                    pa28 = pa;
                                    pd28 = pd;
                                    uh28 = uh;
                                    um28 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 29) {
                                //<editor-fold defaultstate="collapsed" desc=" 29 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa29 = day(aa, what_day);
                                    ad29 = day(ad, what_day);
                                    pa29 = day(pa, what_day);
                                    pd29 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa29 = aa;
                                        ad29 = ad;
                                        pa29 = pa;
                                        pd29 = pd;
                                        uh29 = uh;
                                        um29 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa29 = what_day;
                                        ad29 = "";
                                        pa29 = "";
                                        pd29 = "";
                                        uh29 = "";
                                        um29 = "";
                                    }
                                } else {
                                    aa29 = aa;
                                    ad29 = ad;
                                    pa29 = pa;
                                    pd29 = pd;
                                    uh29 = uh;
                                    um29 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 30) {
                                //<editor-fold defaultstate="collapsed" desc=" 30 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa30 = day(aa, what_day);
                                    ad30 = day(ad, what_day);
                                    pa30 = day(pa, what_day);
                                    pd30 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa30 = aa;
                                        ad30 = ad;
                                        pa30 = pa;
                                        pd30 = pd;
                                        uh30 = uh;
                                        um30 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa30 = what_day;
                                        ad30 = "";
                                        pa30 = "";
                                        pd30 = "";
                                        uh30 = "";
                                        um30 = "";
                                    }
                                } else {
                                    aa30 = aa;
                                    ad30 = ad;
                                    pa30 = pa;
                                    pd30 = pd;
                                    uh30 = uh;
                                    um30 = um;
                                }
                                //</editor-fold>

                            }
                            if (i == 31) {
                                //<editor-fold defaultstate="collapsed" desc=" 31 ">
                                if (what_day.equalsIgnoreCase("Saturday") || what_day.equalsIgnoreCase("Sunday")) {
                                    aa31 = day(aa, what_day);
                                    ad31 = day(ad, what_day);
                                    pa31 = day(pa, what_day);
                                    pd31 = day(pd, what_day);
                                    if (!aa.isEmpty() || !ad.isEmpty() || !pa.isEmpty() || !pd.isEmpty()) {
                                        aa31 = aa;
                                        ad31 = ad;
                                        pa31 = pa;
                                        pd31 = pd;
                                        uh31 = uh;
                                        um31 = um;
                                    }
                                    if (aa.isEmpty() && ad.isEmpty() && pa.isEmpty() && pd.isEmpty()) {
                                        aa31 = what_day;
                                        ad31 = "";
                                        pa31 = "";
                                        pd31 = "";
                                        uh31 = "";
                                        um31 = "";
                                    }
                                } else {
                                    aa31 = aa;
                                    ad31 = ad;
                                    pa31 = pa;
                                    pd31 = pd;
                                    uh31 = uh;
                                    um31 = um;
                                }
                                //</editor-fold>

                            }
                            //</editor-fold>
                        }
                        //end of day loop
                      
                        String[] total = sumTimes(times).split(":");
                        Srpt_dtr.field field = new Srpt_dtr.field(employee_id, employee_name, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9, aa10, aa11, aa12, aa13, aa14, aa15, aa16, aa17, aa18, aa19, aa20, aa21, aa22, aa23, aa24, aa25, aa26, aa27, aa28, aa29, aa30, aa31, pd1, pd2, pd3, pd4, pd5, pd6, pd7, pd8, pd9, pd10, pd11, pd12, pd13, pd14, pd15, pd16, pd17, pd18, pd19, pd20, pd21, pd22, pd23, pd24, pd25, pd26, pd27, pd28, pd29, pd30, pd31, ad1, ad2, ad3, ad4, ad5, ad6, ad7, ad8, ad9, ad10, ad11, ad12, ad13, ad14, ad15, ad16, ad17, ad18, ad19, ad20, ad21, ad22, ad23, ad24, ad25, ad26, ad27, ad28, ad29, ad30, ad31, pa1, pa2, pa3, pa4, pa5, pa6, pa7, pa8, pa9, pa10, pa11, pa12, pa13, pa14, pa15, pa16, pa17, pa18, pa19, pa20, pa21, pa22, pa23, pa24, pa25, pa26, pa27, pa28, pa29, pa30, pa31, uh1, uh2, uh3, uh4, uh5, uh6, uh7, uh8, uh9, uh10, uh11, uh12, uh13, uh14, uh15, uh16, uh17, uh18, uh19, uh20, uh21, uh22, uh23, uh24, uh25, uh26, uh27, uh28, uh29, uh30, uh31, um1, um2, um3, um4, um5, um6, um7, um8, um9, um10, um11, um12, um13, um14, um15, um16, um17, um18, um19, um20, um21, um22, um23, um24, um25, um26, um27, um28, um29, um30, um31, emp.supervisor, total[0], total[1], uh66);
                        datas.add(field);
                        datas.add(field);
                    }

                    //end of main loop
                } catch (ParseException ex) {
                    Logger.getLogger(Dlg_generate_dtr.class.getName()).log(Level.SEVERE, null, ex);
                }

                String business_name = System.getProperty("business_name", "");
                String date = DateType.month_date.format(new Date());
                String printed_by = "Administrator";
                pay_month = DateType.toMonth((FitIn.toInt(pay_month) - 1));
                String dtr_date = pay_month + " " + pay_year;
                String date_printed = DateType.slash_w_time.format(new Date());
                String regular_day_am = "8:00";
                String regular_day_pm = "5:00";

//              
                double total_hours = 0;
                double total_minutes = 0;

                String two_nine = "29";
                String thirty = "30";
                String thirty_one = "31";
                String verified_by = "";
                String in_charge = "";

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

    private String day(String aa, String what_day) {
        if (aa.isEmpty()) {
            return what_day;
        } else {
            return aa;
        }
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

    Employees.to_employees employee = new Employees.to_employees(0, "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");

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
                                    if (d == 2) {
                                        pm_departure = am_departure;
                                        am_departure = "";
                                        pm_arrival = "";

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
                                        Dtrs.to_dtrs dtrrs = new Dtrs.to_dtrs(id, employee_id, employee_name, department_id, department_name, dtr_date2, am_arrival, am_departure, pm_arrival, pm_departure, undertime_hours, undertime_minutes, date_added, user_id, user_screen_name, false, "");
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

    public void init_tbl_dtrs(JTable tbl_dtrs) {
        tbl_dtrs_ALM = new ArrayListModel();
        tbl_dtrs_M = new TbldtrsModel(tbl_dtrs_ALM);
        tbl_dtrs.setModel(tbl_dtrs_M);
        tbl_dtrs.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_dtrs.setRowHeight(25);
        int[] tbl_widths_dtrs = {70, 50, 80, 70, 70, 60, 60, 60, 60, 50, 50, 50, 50, 40, 0};
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

        TableColumn tc = tbl_dtrs.getColumnModel().getColumn(13);
        tc.setCellEditor(tbl_dtrs.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(tbl_dtrs.getDefaultRenderer(Boolean.class));
        tc.setHeaderRenderer(new CheckBoxHeader(new MyItemListener()));
    }

    public class MyItemListener implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getSource();
            if (source instanceof AbstractButton == false) {
                return;
            }
            boolean checked = e.getStateChange() == ItemEvent.SELECTED;
            for (int x = 0, y = tbl_dtrs.getRowCount(); x < y; x++) {
                tbl_dtrs.setValueAt(checked, x, 0);
            }
        }
    }

    class CheckBoxHeader extends JCheckBox
            implements TableCellRenderer, MouseListener {

        protected CheckBoxHeader rendererComponent;
        protected int column;
        protected boolean mousePressed = false;

        public CheckBoxHeader(ItemListener itemListener) {
            rendererComponent = this;
            rendererComponent.addItemListener(itemListener);
        }

        @Override
        public Component getTableCellRendererComponent(
                JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (table != null) {
                JTableHeader header = table.getTableHeader();
                if (header != null) {
                    rendererComponent.setForeground(header.getForeground());
                    rendererComponent.setBackground(new java.awt.Color(204, 204, 204));
                    rendererComponent.setHorizontalAlignment(Align.CENTER);
                    rendererComponent.setOpaque(true);
                    header.addMouseListener(rendererComponent);
                }
            }
            setColumn(column);
            rendererComponent.setText("");
            setBorder(UIManager.getBorder("TableHeader.cellBorder"));
            return rendererComponent;
        }

        protected void setColumn(int column) {
            this.column = column;
        }

        public int getColumn() {
            return column;
        }

        protected void handleClickEvent(MouseEvent e) {
            if (mousePressed) {
                mousePressed = false;
                JTableHeader header = (JTableHeader) (e.getSource());
                JTable tableView = header.getTable();
                TableColumnModel columnModel = tableView.getColumnModel();
                int viewColumn = columnModel.getColumnIndexAtX(e.getX());
                int column1 = tableView.convertColumnIndexToModel(viewColumn);
                if (viewColumn == this.column && e.getClickCount() == 1 && column1 != -1) {
                    doClick();
                }
            }
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            handleClickEvent(e);
            ((JTableHeader) e.getSource()).repaint();
            List<to_dtrs> datas = tbl_dtrs_ALM;
            boolean selected = false;
            if (this.isSelected()) {
                selected = true;
            }
            for (to_dtrs to : datas) {
                to.setSelected(selected);
            }
            e.consume();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            mousePressed = true;
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    public static void loadData_dtrs(List<to_dtrs> acc) {
        tbl_dtrs_ALM.clear();
        tbl_dtrs_ALM.addAll(acc);
    }

    public static class TbldtrsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Date", "No", "Employee", "Leave", "Shift", "AM-Arr", "AM-Dep", "PM-Arr", "PM-Dep", "U-Hour", "U-Min.", "", "", "", "user_screen_name"
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
            if (col == 13) {
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
                    return " " + tt.user_id;
                case 4:
                    return " " + tt.shift;
                case 5:
                    if (tt.am_arrival == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.am_arrival);
                case 6:
                    if (tt.am_departure == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.am_departure);
                case 7:
                    if (tt.pm_arrival == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.pm_arrival);
                case 8:
                    if (tt.pm_departure == null) {
                        return "";
                    }
                    return " " + dtr.util.DateType.convert_datetime_to_hour_minute(tt.pm_departure);
                case 9:
                    if (FitIn.toDouble(tt.undertime_hours) == 0) {
                        return " ";
                    } else {
                        return " " + FitIn.fmt_woc(tt.undertime_hours);
                    }
                case 10:
                    if (FitIn.toDouble(tt.undertime_minutes) == 0) {
                        return " ";
                    } else {
                        return " " + FitIn.fmt_woc(tt.undertime_minutes);
                    }
                case 11:
                    return " Update";
                case 12:
                    return " Delete";
                case 13:
                    return tt.selected;
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
        Field.Combo employee1 = (Field.Combo) jTextField4;
        String where = " where id<>0  ";

        if (!jCheckBox2.isSelected()) {
            where = where + " and Date(dtr_date) between '" + from + "' and '" + to + "'";
        }
        if (!jCheckBox1.isSelected()) {
            where = where + " and employee_id= '" + employee1.getId() + "' ";
        }
        where = where + " order by Date(dtr_date),employee_id asc ";

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
        if (col == 4) {
            Window p = (Window) this;
            Dlg_dtr_select_shift nd = Dlg_dtr_select_shift.create(p, true);
            nd.setTitle("");
            nd.do_pass(to.shift);
            nd.setCallback(new Dlg_dtr_select_shift.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_dtr_select_shift.OutputData data) {
                    closeDialog.ok();

                    int adjustment_selected = 0;
                    int index = 0;
                    List<String> indexes = new ArrayList();
                    for (String s : data.adjustment) {
                        if (s.equals("1")) {
                            adjustment_selected++;
                            indexes.add("" + index);
                        }
                        index++;
                    }
                    if (adjustment_selected != 0) {
                        List<String> logs = new ArrayList();
                        if (to.am_arrival != null) {
                            logs.add(to.am_arrival);
                        }
                        if (to.am_departure != null) {
                            logs.add(to.am_departure);
                        }
                        if (to.pm_arrival != null) {
                            logs.add(to.pm_arrival);
                        }
                        if (to.pm_departure != null) {
                            logs.add(to.pm_departure);
                        }

                        if (adjustment_selected == logs.size()) {
                            String[] ex = {null, null, null, null};

                            for (String s : indexes) {

                                int i = 0;
                                for (String log : logs) {
                                    ex[FitIn.toInt(s)] = log;
                                    logs.remove(i);
                                    i++;
                                    break;
                                }
                            }

                            Dtrs.update_data5("" + to.id, ex[0], ex[1], ex[2], ex[3], data.shift);
                            data_cols_dtr();
                            Alert.set(2, "");
                        }

                    } else {
                        Dtrs.update_shift("" + to.id, data.shift);
                        data_cols_dtr();
                        Alert.set(2, "");
                    }

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 11) {
            //edit
            Window p = (Window) this;
            Dlg_dtr_edit2 nd = Dlg_dtr_edit2.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_dtr_edit2.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_dtr_edit2.OutputData data) {
                    data_cols_dtr();
//                    Dtrs.update_data(to, data.am_arrival, data.am_departure, data.pm_arrival, data.pm_departure, data.undertime_hour, data.undertime_minute);
//                    Alert.set(2, "");
//                    data_cols_dtr();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 12) {
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
        if (col == 13) {
            if (to.selected) {
                to.setSelected(false);
            } else {
                to.setSelected(true);
            }
            tbl_dtrs_M.fireTableDataChanged();
        }
    }

    private void new_dtr() {
        Field.Combo field = (Field.Combo) jTextField4;
        final String emp_id = field.getId();
        final String emp_name = field.getText();

        if (emp_id == null || emp_id.isEmpty() || emp_name.isEmpty()) {
            Alert.set(0, "Please select employee!");
            return;
        }
        Window p = (Window) this;
        Dlg_dtr_add nd = Dlg_dtr_add.create(p, true);
        nd.setTitle("");
        nd.do_pass(emp_id, emp_name);
        nd.setCallback(new Dlg_dtr_add.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_dtr_add.OutputData data) {
                closeDialog.ok();

                Alert.set(1, "");
                data_cols_dtr();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void leave() {
        Window p = (Window) this;
        Dlg_sick_leaves nd = Dlg_sick_leaves.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_sick_leaves.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_sick_leaves.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void holdaiys() {
        Window p = (Window) this;
        Dlg_holidays nd = Dlg_holidays.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_holidays.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_holidays.OutputData data) {
                closeDialog.ok();

            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);
    }

    private void multi_shift_update() {

        List<to_dtrs> dtrs = tbl_dtrs_ALM;
        final List<to_dtrs> selected = new ArrayList();
        for (to_dtrs to : dtrs) {
            if (to.selected) {
                selected.add(to);
            }
        }
        if (!selected.isEmpty()) {
            Window p = (Window) this;
            Dlg_dtr_select_shift nd = Dlg_dtr_select_shift.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_dtr_select_shift.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_dtr_select_shift.OutputData data) {
                    closeDialog.ok();
                    int adjustment_selected = 0;
                    int index = 0;
                    List<String> indexes = new ArrayList();
                    for (String s : data.adjustment) {
                        if (s.equals("1")) {
                            adjustment_selected++;
                            indexes.add("" + index);
                        }
                        index++;
                    }
                    System.out.println("adjustment_selected: " + adjustment_selected);
                    for (to_dtrs to : selected) {

                        if (adjustment_selected != 0) {
                            List<String> logs = new ArrayList();
                            if (to.am_arrival != null) {
                                logs.add(to.am_arrival);
                            }
                            if (to.am_departure != null) {
                                logs.add(to.am_departure);
                            }
                            if (to.pm_arrival != null) {
                                logs.add(to.pm_arrival);
                            }
                            if (to.pm_departure != null) {
                                logs.add(to.pm_departure);
                            }

                            if (adjustment_selected == logs.size()) {
                                String[] ex = {null, null, null, null};

                                for (String s : indexes) {

                                    int i = 0;
                                    for (String log : logs) {
                                        ex[FitIn.toInt(s)] = log;
                                        logs.remove(i);
                                        i++;
                                        break;
                                    }
                                }

                                Dtrs.update_data5("" + to.id, ex[0], ex[1], ex[2], ex[3], data.shift);

                            }

                        } else {
                            Dtrs.update_shift("" + to.id, data.shift);

                        }
                    }
                    data_cols_dtr();
                    Alert.set(2, "");
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void multi_log_update() {

        List<to_dtrs> dtrs = tbl_dtrs_ALM;
        final List<to_dtrs> selected = new ArrayList();
        for (to_dtrs to : dtrs) {
            if (to.selected) {
                selected.add(to);
            }
        }
        if (!selected.isEmpty()) {
            Window p = (Window) this;
            Dlg_dtr_select_shift nd = Dlg_dtr_select_shift.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_dtr_select_shift.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_dtr_select_shift.OutputData data) {
                    closeDialog.ok();

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void multiple_delete() {
        List<to_dtrs> dtrs = tbl_dtrs_ALM;
        final List<to_dtrs> selected = new ArrayList();
        for (to_dtrs to : dtrs) {
            if (to.selected) {
                selected.add(to);
            }
        }
        if (!selected.isEmpty()) {

            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    for (to_dtrs to : selected) {
                        Dtrs.delete_data(to);
                    }
                    Alert.set(3, "");
                    data_cols_dtr();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }

    }

    private void popup(MouseEvent evt) {
        if (evt.isPopupTrigger()) {
            jPopupMenu1.show(jScrollPane2, evt.getX(), evt.getY());
        }
    }
}
