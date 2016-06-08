/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.dtr.Dtr;
import dtr.shifting.Shiftings.to_shiftings;
import dtr.users.MyUser;
import dtr.util.Alert;
import dtr.util.DateType;
import dtr.util.Dlg_confirm_action;
import dtr.util.TableRenderer;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_shifting extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_shifting
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
    private Dlg_shifting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_shifting(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_shifting() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_shifting myRef;

    private void setThisRef(Dlg_shifting myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_shifting> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_shifting create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_shifting create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_shifting dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_shifting((java.awt.Frame) parent, false);
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
            Dlg_shifting dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_shifting((java.awt.Dialog) parent, false);
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

        Dlg_shifting dialog = Dlg_shifting.create(new javax.swing.JFrame(), true);
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
        jLabel1 = new javax.swing.JLabel();
        tf_shift = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        tf_am_6 = new Field.Combo();
        jLabel10 = new javax.swing.JLabel();
        tf_am_7 = new Field.Combo();
        tf_am_8 = new Field.Combo();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_am_9 = new Field.Combo();
        jLabel13 = new javax.swing.JLabel();
        tf_am_10 = new Field.Combo();
        jLabel14 = new javax.swing.JLabel();
        tf_am_11 = new Field.Combo();
        jLabel15 = new javax.swing.JLabel();
        tf_am_12 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        tf_am_1 = new Field.Combo();
        tf_am_2 = new Field.Combo();
        jLabel17 = new javax.swing.JLabel();
        tf_am_3 = new Field.Combo();
        jLabel18 = new javax.swing.JLabel();
        tf_am_4 = new Field.Combo();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        tf_am_5 = new Field.Combo();
        tf_pm_12 = new Field.Combo();
        jLabel21 = new javax.swing.JLabel();
        tf_pm_1 = new Field.Combo();
        tf_pm_2 = new Field.Combo();
        jLabel22 = new javax.swing.JLabel();
        tf_pm_3 = new Field.Combo();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tf_pm_6 = new Field.Combo();
        tf_pm4 = new Field.Combo();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tf_pm_7 = new Field.Combo();
        tf_pm_5 = new Field.Combo();
        tf_pm_8 = new Field.Combo();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tf_pm_9 = new Field.Combo();
        jLabel30 = new javax.swing.JLabel();
        tf_pm_10 = new Field.Combo();
        jLabel31 = new javax.swing.JLabel();
        tf_pm_11 = new Field.Combo();
        jLabel32 = new javax.swing.JLabel();
        jButton2 = new Button.Default();
        jButton3 = new Button.Primary();
        jButton4 = new Button.Info();
        jButton5 = new Button.Warning();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_shiftings = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new Field.Search();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Shift Name:");

        tf_shift.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("06 AM:");

        tf_am_6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_6.setText("06 AM");
        tf_am_6.setFocusable(false);
        tf_am_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_6MouseClicked(evt);
            }
        });
        tf_am_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("07 AM:");

        tf_am_7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_7.setText("07 AM");
        tf_am_7.setFocusable(false);
        tf_am_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_7MouseClicked(evt);
            }
        });
        tf_am_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_7ActionPerformed(evt);
            }
        });

        tf_am_8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_8.setText("08 AM");
        tf_am_8.setFocusable(false);
        tf_am_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_8MouseClicked(evt);
            }
        });
        tf_am_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_8ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("08 AM:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("09 AM:");

        tf_am_9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_9.setText("09 AM");
        tf_am_9.setFocusable(false);
        tf_am_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_9MouseClicked(evt);
            }
        });
        tf_am_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_9ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("10 AM:");

        tf_am_10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_10.setText("10 AM");
        tf_am_10.setFocusable(false);
        tf_am_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_10MouseClicked(evt);
            }
        });
        tf_am_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_10ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("11 AM:");

        tf_am_11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_11.setText("11 AM");
        tf_am_11.setFocusable(false);
        tf_am_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_11MouseClicked(evt);
            }
        });
        tf_am_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_11ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("12 AM:");

        tf_am_12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_12.setText("12 AM");
        tf_am_12.setFocusable(false);
        tf_am_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_12MouseClicked(evt);
            }
        });
        tf_am_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_12ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("01 AM:");

        tf_am_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_1.setText("01 AM");
        tf_am_1.setFocusable(false);
        tf_am_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_1MouseClicked(evt);
            }
        });
        tf_am_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_1ActionPerformed(evt);
            }
        });

        tf_am_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_2.setText("02 AM");
        tf_am_2.setFocusable(false);
        tf_am_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_2MouseClicked(evt);
            }
        });
        tf_am_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("02 AM:");

        tf_am_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_3.setText("03 AM");
        tf_am_3.setFocusable(false);
        tf_am_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_3MouseClicked(evt);
            }
        });
        tf_am_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_3ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("03 AM:");

        tf_am_4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_4.setText("04 AM");
        tf_am_4.setFocusable(false);
        tf_am_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_4MouseClicked(evt);
            }
        });
        tf_am_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_4ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("04 AM:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("05 AM:");

        tf_am_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_am_5.setText("05 AM");
        tf_am_5.setFocusable(false);
        tf_am_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_am_5MouseClicked(evt);
            }
        });
        tf_am_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_am_5ActionPerformed(evt);
            }
        });

        tf_pm_12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_12.setText("12 PM");
        tf_pm_12.setFocusable(false);
        tf_pm_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_12MouseClicked(evt);
            }
        });
        tf_pm_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_12ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("01 PM:");

        tf_pm_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_1.setText("01 PM");
        tf_pm_1.setFocusable(false);
        tf_pm_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_1MouseClicked(evt);
            }
        });
        tf_pm_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_1ActionPerformed(evt);
            }
        });

        tf_pm_2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_2.setText("02 PM");
        tf_pm_2.setFocusable(false);
        tf_pm_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_2MouseClicked(evt);
            }
        });
        tf_pm_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_2ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("02 PM:");

        tf_pm_3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_3.setText("03 PM");
        tf_pm_3.setFocusable(false);
        tf_pm_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_3MouseClicked(evt);
            }
        });
        tf_pm_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("06 PM:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("03 PM:");

        tf_pm_6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_6.setText("06 PM");
        tf_pm_6.setFocusable(false);
        tf_pm_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_6MouseClicked(evt);
            }
        });
        tf_pm_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_6ActionPerformed(evt);
            }
        });

        tf_pm4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm4.setText("04 PM");
        tf_pm4.setFocusable(false);
        tf_pm4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm4MouseClicked(evt);
            }
        });
        tf_pm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm4ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("04 PM:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("07 PM:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("05 PM:");

        tf_pm_7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_7.setText("07 PM");
        tf_pm_7.setFocusable(false);
        tf_pm_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_7MouseClicked(evt);
            }
        });
        tf_pm_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_7ActionPerformed(evt);
            }
        });

        tf_pm_5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_5.setText("05 PM");
        tf_pm_5.setFocusable(false);
        tf_pm_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_5MouseClicked(evt);
            }
        });
        tf_pm_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_5ActionPerformed(evt);
            }
        });

        tf_pm_8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_8.setText("08 PM");
        tf_pm_8.setFocusable(false);
        tf_pm_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_8MouseClicked(evt);
            }
        });
        tf_pm_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_8ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setText("08 PM:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("09 PM:");

        tf_pm_9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_9.setText("09 PM");
        tf_pm_9.setFocusable(false);
        tf_pm_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_9MouseClicked(evt);
            }
        });
        tf_pm_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_9ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("10 PM:");

        tf_pm_10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_10.setText("10 PM");
        tf_pm_10.setFocusable(false);
        tf_pm_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_10MouseClicked(evt);
            }
        });
        tf_pm_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_10ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("11 PM:");

        tf_pm_11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_pm_11.setText("11 PM");
        tf_pm_11.setFocusable(false);
        tf_pm_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pm_11MouseClicked(evt);
            }
        });
        tf_pm_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pm_11ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("12 PM:");

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tbl_shiftings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_shiftings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_shiftingsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_shiftings);

        jLabel2.setText("No. of rows:");

        jLabel3.setText("0");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jProgressBar1.setString("");
        jProgressBar1.setStringPainted(true);

        jLabel4.setText("Status:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_pm_11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_shift))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_am_11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextField2))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_am_12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_am_6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_am_11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pm_12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_pm_6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_pm_11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tf_am_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_6MouseClicked
        init_hours(tf_am_6);
    }//GEN-LAST:event_tf_am_6MouseClicked

    private void tf_am_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_6ActionPerformed

    private void tf_am_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_7MouseClicked
        init_hours(tf_am_7);
    }//GEN-LAST:event_tf_am_7MouseClicked

    private void tf_am_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_7ActionPerformed

    private void tf_am_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_8MouseClicked
        init_hours(tf_am_8);
    }//GEN-LAST:event_tf_am_8MouseClicked

    private void tf_am_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_8ActionPerformed

    private void tf_am_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_9MouseClicked
        init_hours(tf_am_9);
    }//GEN-LAST:event_tf_am_9MouseClicked

    private void tf_am_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_9ActionPerformed

    private void tf_am_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_10MouseClicked
        init_hours(tf_am_10);
    }//GEN-LAST:event_tf_am_10MouseClicked

    private void tf_am_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_10ActionPerformed

    private void tf_am_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_11MouseClicked
        init_hours(tf_am_11);
    }//GEN-LAST:event_tf_am_11MouseClicked

    private void tf_am_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_11ActionPerformed

    private void tf_am_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_12MouseClicked
        init_hours(tf_am_12);
    }//GEN-LAST:event_tf_am_12MouseClicked

    private void tf_am_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_12ActionPerformed

    private void tf_am_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_1MouseClicked
        init_hours(tf_am_1);
    }//GEN-LAST:event_tf_am_1MouseClicked

    private void tf_am_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_1ActionPerformed

    private void tf_am_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_2MouseClicked
        init_hours(tf_am_2);
    }//GEN-LAST:event_tf_am_2MouseClicked

    private void tf_am_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_2ActionPerformed

    private void tf_am_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_3MouseClicked
        init_hours(tf_am_3);
    }//GEN-LAST:event_tf_am_3MouseClicked

    private void tf_am_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_3ActionPerformed

    private void tf_am_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_4MouseClicked
        init_hours(tf_am_4);
    }//GEN-LAST:event_tf_am_4MouseClicked

    private void tf_am_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_4ActionPerformed

    private void tf_am_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_am_5MouseClicked
        init_hours(tf_am_5);
    }//GEN-LAST:event_tf_am_5MouseClicked

    private void tf_am_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_am_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_am_5ActionPerformed

    private void tf_pm_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_12MouseClicked
        init_hours(tf_pm_12);
    }//GEN-LAST:event_tf_pm_12MouseClicked

    private void tf_pm_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_12ActionPerformed

    private void tf_pm_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_1MouseClicked
        init_hours(tf_pm_1);
    }//GEN-LAST:event_tf_pm_1MouseClicked

    private void tf_pm_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_1ActionPerformed

    private void tf_pm_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_2MouseClicked
        init_hours(tf_pm_2);
    }//GEN-LAST:event_tf_pm_2MouseClicked

    private void tf_pm_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_2ActionPerformed

    private void tf_pm_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_3MouseClicked
        init_hours(tf_pm_3);
    }//GEN-LAST:event_tf_pm_3MouseClicked

    private void tf_pm_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_3ActionPerformed

    private void tf_pm_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_6MouseClicked
        init_hours(tf_pm_6);
    }//GEN-LAST:event_tf_pm_6MouseClicked

    private void tf_pm_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_6ActionPerformed

    private void tf_pm4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm4MouseClicked
        init_hours(tf_pm4);
    }//GEN-LAST:event_tf_pm4MouseClicked

    private void tf_pm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm4ActionPerformed

    private void tf_pm_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_7MouseClicked
        init_hours(tf_pm_7);
    }//GEN-LAST:event_tf_pm_7MouseClicked

    private void tf_pm_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_7ActionPerformed

    private void tf_pm_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_5MouseClicked
        init_hours(tf_pm_5);
    }//GEN-LAST:event_tf_pm_5MouseClicked

    private void tf_pm_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_5ActionPerformed

    private void tf_pm_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_8MouseClicked
        init_hours(tf_pm_8);
    }//GEN-LAST:event_tf_pm_8MouseClicked

    private void tf_pm_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_8ActionPerformed

    private void tf_pm_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_9MouseClicked
        init_hours(tf_pm_9);
    }//GEN-LAST:event_tf_pm_9MouseClicked

    private void tf_pm_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_9ActionPerformed

    private void tf_pm_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_10MouseClicked
        init_hours(tf_pm_10);
    }//GEN-LAST:event_tf_pm_10MouseClicked

    private void tf_pm_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_10ActionPerformed

    private void tf_pm_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pm_11MouseClicked
        init_hours(tf_pm_11);
    }//GEN-LAST:event_tf_pm_11MouseClicked

    private void tf_pm_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pm_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pm_11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear_shifting();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add_shiftings();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        update_shiftings();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        delete_shiftings();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        data_cols();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void tbl_shiftingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_shiftingsMouseClicked
        select_shiftings();
    }//GEN-LAST:event_tbl_shiftingsMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tbl_shiftings;
    private javax.swing.JTextField tf_am_1;
    private javax.swing.JTextField tf_am_10;
    private javax.swing.JTextField tf_am_11;
    private javax.swing.JTextField tf_am_12;
    private javax.swing.JTextField tf_am_2;
    private javax.swing.JTextField tf_am_3;
    private javax.swing.JTextField tf_am_4;
    private javax.swing.JTextField tf_am_5;
    private javax.swing.JTextField tf_am_6;
    private javax.swing.JTextField tf_am_7;
    private javax.swing.JTextField tf_am_8;
    private javax.swing.JTextField tf_am_9;
    private javax.swing.JTextField tf_pm4;
    private javax.swing.JTextField tf_pm_1;
    private javax.swing.JTextField tf_pm_10;
    private javax.swing.JTextField tf_pm_11;
    private javax.swing.JTextField tf_pm_12;
    private javax.swing.JTextField tf_pm_2;
    private javax.swing.JTextField tf_pm_3;
    private javax.swing.JTextField tf_pm_5;
    private javax.swing.JTextField tf_pm_6;
    private javax.swing.JTextField tf_pm_7;
    private javax.swing.JTextField tf_pm_8;
    private javax.swing.JTextField tf_pm_9;
    private javax.swing.JTextField tf_shift;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        dtr_hours = Dtr.hours.seed_pm();
        init_tbl_shiftings(tbl_shiftings);
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

    List<Dtr.hours> dtr_hours = new ArrayList();

    private void init_hours(final JTextField tf) {

        Object[][] obj = new Object[dtr_hours.size()][1];
        int i = 0;
        for (Dtr.hours to : dtr_hours) {
            obj[i][0] = " " + to.hour;
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
                Dtr.hours to = dtr_hours.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc=" shiftings "> 
    public static ArrayListModel tbl_shiftings_ALM;
    public static TblshiftingsModel tbl_shiftings_M;

    public static void init_tbl_shiftings(JTable tbl_shiftings) {
        tbl_shiftings_ALM = new ArrayListModel();
        tbl_shiftings_M = new TblshiftingsModel(tbl_shiftings_ALM);
        tbl_shiftings.setModel(tbl_shiftings_M);
        tbl_shiftings.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_shiftings.setRowHeight(25);
        int[] tbl_widths_shiftings = {0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_shiftings.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_shiftings, i, tbl_widths_shiftings[i]);
        }
        Dimension d = tbl_shiftings.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_shiftings.getTableHeader().setPreferredSize(d);
        tbl_shiftings.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_shiftings.setRowHeight(25);
        tbl_shiftings.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_shiftings(List<to_shiftings> acc) {
        tbl_shiftings_ALM.clear();
        tbl_shiftings_ALM.addAll(acc);
    }

    public static class TblshiftingsModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Id", "Shift", "am_12", "am_1", "am_2", "am_3", "am_4", "am_5", "am_6", "am_7", "am_8", "am_9", "am_10", "am_11", "pm_12", "pm_1", "pm_2", "pm_3", "pm4", "pm_5", "pm_6", "pm_7", "pm_8", "pm_9", "pm_10", "pm_11", "status", "created_at", "updated_at", "created_by", "updated_by"
        };

        public TblshiftingsModel(ListModel listmodel) {
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
            to_shiftings tt = (to_shiftings) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.id;
                case 1:
                    return " " + tt.shift;
                case 2:
                    return tt.am_12;
                case 3:
                    return tt.am_1;
                case 4:
                    return tt.am_2;
                case 5:
                    return tt.am_3;
                case 6:
                    return tt.am_4;
                case 7:
                    return tt.am_5;
                case 8:
                    return tt.am_6;
                case 9:
                    return tt.am_7;
                case 10:
                    return tt.am_8;
                case 11:
                    return tt.am_9;
                case 12:
                    return tt.am_10;
                case 13:
                    return tt.am_11;
                case 14:
                    return tt.pm_12;
                case 15:
                    return tt.pm_1;
                case 16:
                    return tt.pm_2;
                case 17:
                    return tt.pm_3;
                case 18:
                    return tt.pm4;
                case 19:
                    return tt.pm_5;
                case 20:
                    return tt.pm_6;
                case 21:
                    return tt.pm_7;
                case 22:
                    return tt.pm_8;
                case 23:
                    return tt.pm_9;
                case 24:
                    return tt.pm_10;
                case 25:
                    return tt.pm_11;
                case 26:
                    return tt.status;
                case 27:
                    return tt.created_at;
                case 28:
                    return tt.updated_at;
                case 29:
                    return tt.created_by;
                default:
                    return tt.updated_by;
            }
        }
    }

    private void data_cols() {
        String where = "";
        List<to_shiftings> datas = Shiftings.ret_data(where);
        loadData_shiftings(datas);
    }

//</editor-fold> 
    private void add_shiftings() {

        int id = 0;
        String shift = tf_shift.getText();
        String am_12 = tf_am_12.getText();
        String am_1 = tf_am_1.getText();
        String am_2 = tf_am_2.getText();
        String am_3 = tf_am_3.getText();
        String am_4 = tf_am_4.getText();
        String am_5 = tf_am_5.getText();
        String am_6 = tf_am_6.getText();
        String am_7 = tf_am_7.getText();
        String am_8 = tf_am_8.getText();
        String am_9 = tf_am_9.getText();
        String am_10 = tf_am_10.getText();
        String am_11 = tf_am_11.getText();
        String pm_12 = tf_pm_12.getText();
        String pm_1 = tf_pm_1.getText();
        String pm_2 = tf_pm_2.getText();
        String pm_3 = tf_pm_3.getText();
        String pm4 = tf_pm4.getText();
        String pm_5 = tf_pm_5.getText();
        String pm_6 = tf_pm_6.getText();
        String pm_7 = tf_pm_7.getText();
        String pm_8 = tf_pm_8.getText();
        String pm_9 = tf_pm_9.getText();
        String pm_10 = tf_pm_10.getText();
        String pm_11 = tf_pm_11.getText();
        int status = 1;
        String created_at = DateType.now();
        String updated_at = DateType.now();
        String created_by = MyUser.getUser_id();
        String updated_by = MyUser.getUser_id();

        to_shiftings to = new to_shiftings(id, shift, am_12, am_1, am_2, am_3, am_4, am_5, am_6, am_7, am_8, am_9, am_10, am_11, pm_12, pm_1, pm_2, pm_3, pm4, pm_5, pm_6, pm_7, pm_8, pm_9, pm_10, pm_11, status, created_at, updated_at, created_by, updated_by);
        Shiftings.add_data(to);
        Alert.set(1, "");
        data_cols();
    }

    private void select_shiftings() {

        int row = tbl_shiftings.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_shiftings to = (to_shiftings) tbl_shiftings_ALM.get(row);
        tf_shift.setText(to.shift);
        tf_am_12.setText(to.am_12);
        tf_am_1.setText(to.am_1);
        tf_am_2.setText(to.am_2);
        tf_am_3.setText(to.am_3);
        tf_am_4.setText(to.am_4);
        tf_am_5.setText(to.am_5);
        tf_am_6.setText(to.am_6);
        tf_am_7.setText(to.am_7);
        tf_am_8.setText(to.am_8);
        tf_am_9.setText(to.am_9);
        tf_am_10.setText(to.am_10);
        tf_am_11.setText(to.am_11);
        tf_pm_12.setText(to.pm_12);
        tf_pm_1.setText(to.pm_1);
        tf_pm_2.setText(to.pm_2);
        tf_pm_3.setText(to.pm_3);
        tf_pm4.setText(to.pm4);
        tf_pm_5.setText(to.pm_5);
        tf_pm_6.setText(to.pm_6);
        tf_pm_7.setText(to.pm_7);
        tf_pm_8.setText(to.pm_8);
        tf_pm_9.setText(to.pm_9);
        tf_pm_10.setText(to.pm_10);
        tf_pm_11.setText(to.pm_11);

    }

    private void update_shiftings() {

        int row = tbl_shiftings.getSelectedRow();
        if (row < 0) {
            return;
        }
        to_shiftings to = (to_shiftings) tbl_shiftings_ALM.get(row);
        int id = to.id;
        String shift = tf_shift.getText();
        String am_12 = tf_am_12.getText();
        String am_1 = tf_am_1.getText();
        String am_2 = tf_am_2.getText();
        String am_3 = tf_am_3.getText();
        String am_4 = tf_am_4.getText();
        String am_5 = tf_am_5.getText();
        String am_6 = tf_am_6.getText();
        String am_7 = tf_am_7.getText();
        String am_8 = tf_am_8.getText();
        String am_9 = tf_am_9.getText();
        String am_10 = tf_am_10.getText();
        String am_11 = tf_am_11.getText();
        String pm_12 = tf_pm_12.getText();
        String pm_1 = tf_pm_1.getText();
        String pm_2 = tf_pm_2.getText();
        String pm_3 = tf_pm_3.getText();
        String pm4 = tf_pm4.getText();
        String pm_5 = tf_pm_5.getText();
        String pm_6 = tf_pm_6.getText();
        String pm_7 = tf_pm_7.getText();
        String pm_8 = tf_pm_8.getText();
        String pm_9 = tf_pm_9.getText();
        String pm_10 = tf_pm_10.getText();
        String pm_11 = tf_pm_11.getText();
        int status = 1;
        String created_at = to.created_at;
        String updated_at = DateType.now();
        String created_by = to.created_by;
        String updated_by = MyUser.getUser_id();

        to_shiftings to1 = new to_shiftings(id, shift, am_12, am_1, am_2, am_3, am_4, am_5, am_6, am_7, am_8, am_9, am_10, am_11, pm_12, pm_1, pm_2, pm_3, pm4, pm_5, pm_6, pm_7, pm_8, pm_9, pm_10, pm_11, status, created_at, updated_at, created_by, updated_by);
        Shiftings.update_data(to1);
        Alert.set(2, "");
        data_cols();
    }

    private void delete_shiftings() {

        final int row = tbl_shiftings.getSelectedRow();
        if (row < 0) {
            return;
        }
        Window p = (Window) this;
        Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
        nd.setTitle("");

        nd.setCallback(new Dlg_confirm_action.Callback() {

            @Override
            public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                closeDialog.ok();
                to_shiftings to = (to_shiftings) tbl_shiftings_ALM.get(row);
                Shiftings.delete_data(to);
                Alert.set(3, "");
                data_cols();
            }
        });
        nd.setLocationRelativeTo(this);
        nd.setVisible(true);

    }

    private void clear_shifting() {
        tf_shift.setText("");
        tf_am_12.setText("12 AM");
        tf_am_1.setText("01 AM");
        tf_am_2.setText("02 AM");
        tf_am_3.setText("03 AM");
        tf_am_4.setText("04 AM");
        tf_am_5.setText("05 AM");
        tf_am_6.setText("06 AM");
        tf_am_7.setText("07 AM");
        tf_am_8.setText("08 AM");
        tf_am_9.setText("09 AM");
        tf_am_10.setText("10 AM");
        tf_am_11.setText("11 AM");
        tf_pm_12.setText("12 PM");
        tf_pm_1.setText("01 PM");
        tf_pm_2.setText("02 PM");
        tf_pm_3.setText("03 PM");
        tf_pm4.setText("04 PM");
        tf_pm_5.setText("05 PM");
        tf_pm_6.setText("06 PM");
        tf_pm_7.setText("07 PM");
        tf_pm_8.setText("08 PM");
        tf_pm_9.setText("09 PM");
        tf_pm_10.setText("10 PM");
        tf_pm_11.setText("11 PM");
        tbl_shiftings.clearSelection();
        tf_shift.grabFocus();
    }
}
