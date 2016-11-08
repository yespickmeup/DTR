/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting_types;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.dtr.Dtr;
import dtr.shifting_types.Shifting_types.to_shifting_types;
import dtr.users.MyUser;
import dtr.util.Alert;
import dtr.util.DateType;
import dtr.util.Dlg_confirm_action;
import dtr.util.TableRenderer;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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
public class Dlg_shifting_types extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_shifting_types
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
    private Dlg_shifting_types(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_shifting_types(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_shifting_types() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_shifting_types myRef;

    private void setThisRef(Dlg_shifting_types myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_shifting_types> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_shifting_types create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_shifting_types create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_shifting_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_shifting_types((java.awt.Frame) parent, false);
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
            Dlg_shifting_types dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_shifting_types((java.awt.Dialog) parent, false);
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

        Dlg_shifting_types dialog = Dlg_shifting_types.create(new javax.swing.JFrame(), true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_shifting_types = new javax.swing.JTable();
        jButton3 = new Button.Success();
        jButton2 = new Button.Default();
        jLabel6 = new javax.swing.JLabel();
        tf_shift_starts1 = new Field.Input();
        jLabel7 = new javax.swing.JLabel();
        tf_shift_starts2 = new Field.Input();
        tf_shift_starts3 = new Field.Input();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_shift_starts4 = new Field.Input();
        jLabel10 = new javax.swing.JLabel();
        tf_shift_starts5 = new Field.Input();
        jLabel11 = new javax.swing.JLabel();
        tf_shift_starts6 = new Field.Input();
        jLabel12 = new javax.swing.JLabel();
        tf_shift_starts7 = new Field.Input();
        jLabel13 = new javax.swing.JLabel();
        tf_shift_starts8 = new Field.Input();
        jLabel14 = new javax.swing.JLabel();
        tf_shift_starts9 = new Field.Input();
        jLabel15 = new javax.swing.JLabel();
        tf_shift_starts10 = new Field.Input();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_shift_name = new Field.Input();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_shifting_types.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_shifting_types.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_shifting_typesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_shifting_types);

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("08:00 AM");

        tf_shift_starts1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts1MouseClicked(evt);
            }
        });
        tf_shift_starts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("09:00 AM");

        tf_shift_starts2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts2MouseClicked(evt);
            }
        });
        tf_shift_starts2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts2ActionPerformed(evt);
            }
        });

        tf_shift_starts3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts3MouseClicked(evt);
            }
        });
        tf_shift_starts3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("10:00 AM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("11:00 AM");

        tf_shift_starts4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts4MouseClicked(evt);
            }
        });
        tf_shift_starts4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("12:00 PM");

        tf_shift_starts5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts5MouseClicked(evt);
            }
        });
        tf_shift_starts5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts5ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("01:00 PM");

        tf_shift_starts6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts6MouseClicked(evt);
            }
        });
        tf_shift_starts6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("02:00 PM");

        tf_shift_starts7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts7MouseClicked(evt);
            }
        });
        tf_shift_starts7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts7ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("03:00 PM");

        tf_shift_starts8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts8MouseClicked(evt);
            }
        });
        tf_shift_starts8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts8ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("04:00 PM");

        tf_shift_starts9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts9MouseClicked(evt);
            }
        });
        tf_shift_starts9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts9ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("05:00 PM");

        tf_shift_starts10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_starts10MouseClicked(evt);
            }
        });
        tf_shift_starts10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_starts10ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Regular:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Shift:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Name:");

        tf_shift_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_nameMouseClicked(evt);
            }
        });
        tf_shift_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_shift_starts10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(tf_shift_name, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_shift_starts1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_shifting_types();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear_shifting_types();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_shifting_typesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_shifting_typesMouseClicked
        select_shifting_types();
    }//GEN-LAST:event_tbl_shifting_typesMouseClicked

    private void tf_shift_starts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts1MouseClicked

    private void tf_shift_starts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts1ActionPerformed

    private void tf_shift_starts2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts2MouseClicked

    private void tf_shift_starts2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts2ActionPerformed

    private void tf_shift_starts3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts3MouseClicked

    private void tf_shift_starts3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts3ActionPerformed

    private void tf_shift_starts4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts4MouseClicked

    private void tf_shift_starts4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts4ActionPerformed

    private void tf_shift_starts5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts5MouseClicked

    private void tf_shift_starts5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts5ActionPerformed

    private void tf_shift_starts6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts6MouseClicked

    private void tf_shift_starts6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts6ActionPerformed

    private void tf_shift_starts7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts7MouseClicked

    private void tf_shift_starts7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts7ActionPerformed

    private void tf_shift_starts8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts8MouseClicked

    private void tf_shift_starts8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts8ActionPerformed

    private void tf_shift_starts9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts9MouseClicked

    private void tf_shift_starts9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts9ActionPerformed

    private void tf_shift_starts10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_starts10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts10MouseClicked

    private void tf_shift_starts10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_starts10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_starts10ActionPerformed

    private void tf_shift_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_nameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_nameMouseClicked

    private void tf_shift_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_nameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_shifting_types;
    private javax.swing.JTextField tf_shift_name;
    private javax.swing.JTextField tf_shift_starts1;
    private javax.swing.JTextField tf_shift_starts10;
    private javax.swing.JTextField tf_shift_starts2;
    private javax.swing.JTextField tf_shift_starts3;
    private javax.swing.JTextField tf_shift_starts4;
    private javax.swing.JTextField tf_shift_starts5;
    private javax.swing.JTextField tf_shift_starts6;
    private javax.swing.JTextField tf_shift_starts7;
    private javax.swing.JTextField tf_shift_starts8;
    private javax.swing.JTextField tf_shift_starts9;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        dtr_hours = Dtr.hours.seed_pm2();
        dtr_minutes = Dtr.minutes.seed();
        init_tbl_shifting_types(tbl_shifting_types);
        ret_shifting_types();
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

    //<editor-fold defaultstate="collapsed" desc=" shifting_types "> 
    public static ArrayListModel tbl_shifting_types_ALM;
    public static Tblshifting_typesModel tbl_shifting_types_M;

    public static void init_tbl_shifting_types(JTable tbl_shifting_types) {
        tbl_shifting_types_ALM = new ArrayListModel();
        tbl_shifting_types_M = new Tblshifting_typesModel(tbl_shifting_types_ALM);
        tbl_shifting_types.setModel(tbl_shifting_types_M);
        tbl_shifting_types.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_shifting_types.setRowHeight(25);
        int[] tbl_widths_shifting_types = {80, 100, 0, 40, 50, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_shifting_types.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_shifting_types, i, tbl_widths_shifting_types[i]);
        }
        Dimension d = tbl_shifting_types.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_shifting_types.getTableHeader().setPreferredSize(d);
        tbl_shifting_types.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_shifting_types.setRowHeight(25);
        tbl_shifting_types.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_shifting_types(List<to_shifting_types> acc) {
        tbl_shifting_types_ALM.clear();
        tbl_shifting_types_ALM.addAll(acc);
    }

    public static class Tblshifting_typesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "Shift", "Starts", "Ends", "", "", "status", "shift_name", "shift_starts", "shift_ends"
        };

        public Tblshifting_typesModel(ListModel listmodel) {
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
            to_shifting_types tt = (to_shifting_types) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.shift_name;
                case 1:
                    return " " + tt.shift_starts;
                case 2:
                    return " " + tt.shift_ends;
                case 3:
                    return " Edit";
                case 4:
                    return " Delete";
                case 5:
                    return tt.status;
                case 6:
                    return tt.shift_name;
                case 7:
                    return tt.shift_starts;
                default:
                    return tt.shift_ends;
            }
        }
    }

    private void ret_shifting_types() {
        String where = "";
        List<to_shifting_types> datas = Shifting_types.ret_data(where);
        loadData_shifting_types(datas);
    }

    private void save_shifting_types() {
        int row = tbl_shifting_types.getSelectedRow();
        if (row < 0) {
            int id = 0;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 1;
            String shift_name = tf_shift_name.getText();
            String shift_starts = "\"" + tf_shift_starts1.getText() + "\","
                    + "\"" + tf_shift_starts2.getText() + "\","
                    + "\"" + tf_shift_starts3.getText() + "\","
                    + "\"" + tf_shift_starts4.getText() + "\","
                    + "\"" + tf_shift_starts5.getText() + "\","
                    + "\"" + tf_shift_starts6.getText() + "\","
                    + "\"" + tf_shift_starts7.getText() + "\","
                    + "\"" + tf_shift_starts8.getText() + "\","
                    + "\"" + tf_shift_starts9.getText() + "\","
                    + "\"" + tf_shift_starts10.getText() + "\"";

            String shift_ends = "";
            JTextField[] tfs = {tf_shift_starts1, tf_shift_starts2, tf_shift_starts3, tf_shift_starts4, tf_shift_starts5, tf_shift_starts6, tf_shift_starts7, tf_shift_starts8, tf_shift_starts9, tf_shift_starts10};
            for (JTextField tf : tfs) {
                if (check_format(tf) == 0) {
                    Alert.set(0, "Check Format");
                    tf.grabFocus();
                    return;
                }
            }

            to_shifting_types to = new to_shifting_types(id, created_at, updated_at, created_by, updated_by, status, shift_name, shift_starts, shift_ends);
            Shifting_types.add_data(to);
            ret_shifting_types();
            Alert.set(1, "");
            clear_shifting_types();
        } else {
            to_shifting_types to = (to_shifting_types) tbl_shifting_types_ALM.get(row);
            int id = to.id;
            String created_at = DateType.now();
            String updated_at = DateType.now();
            String created_by = MyUser.getUser_id();
            String updated_by = MyUser.getUser_id();
            int status = 1;
            String shift_name = tf_shift_name.getText();
            String shift_starts = "\"" + tf_shift_starts1.getText() + "\","
                    + "\"" + tf_shift_starts2.getText() + "\","
                    + "\"" + tf_shift_starts3.getText() + "\","
                    + "\"" + tf_shift_starts4.getText() + "\","
                    + "\"" + tf_shift_starts5.getText() + "\","
                    + "\"" + tf_shift_starts6.getText() + "\","
                    + "\"" + tf_shift_starts7.getText() + "\","
                    + "\"" + tf_shift_starts8.getText() + "\","
                    + "\"" + tf_shift_starts9.getText() + "\","
                    + "\"" + tf_shift_starts10.getText() + "\"";

            String shift_ends = "";

            JTextField[] tfs = {tf_shift_starts1, tf_shift_starts2, tf_shift_starts3, tf_shift_starts4, tf_shift_starts5, tf_shift_starts6, tf_shift_starts7, tf_shift_starts8, tf_shift_starts9, tf_shift_starts10};
            for (JTextField tf : tfs) {
                if (check_format(tf) == 0) {
                    Alert.set(0, "Check Format");
                    tf.grabFocus();
                    return;
                }
            }
            to_shifting_types to1 = new to_shifting_types(id, created_at, updated_at, created_by, updated_by, status, shift_name, shift_starts, shift_ends);
            Shifting_types.update_data(to1);
            ret_shifting_types();
            Alert.set(2, "");
            clear_shifting_types();
        }
    }

    private int check_format(JTextField tf) {
        int ret = 0;
        try {
            if (!tf.getText().isEmpty()) {
                String now = DateType.sf.format(new Date());
                String text = tf.getText();
                text = text.replace(" PM", ":00 PM");
                text = text.replace(" AM", ":00 AM");
                now = now + " " + text;
                Date arival = DateType.datetime.parse(now);
                ret = 1;
            } else {
                ret = 1;
            }
            return ret;
        } catch (ParseException ex) {
            System.out.println(ex);
            return 0;
        }
    }

    private void select_shifting_types() {
        int row = tbl_shifting_types.getSelectedRow();
        if (row < 0) {
            return;
        }
        final to_shifting_types to = (to_shifting_types) tbl_shifting_types_ALM.get(row);
        int col = tbl_shifting_types.getSelectedColumn();
        if (col == 3) {
            tf_shift_name.setText(to.shift_name);
            String shift_starts = to.shift_starts;
            String replaceAll = shift_starts.replaceAll("\"", "");
            String[] data = replaceAll.split(",");
            tf_shift_starts1.setText(data[0]);
            tf_shift_starts2.setText(data[1]);
            tf_shift_starts3.setText(data[2]);
            tf_shift_starts4.setText(data[3]);
            tf_shift_starts5.setText(data[4]);

            tf_shift_starts6.setText(data[5]);
            tf_shift_starts7.setText(data[6]);
            tf_shift_starts8.setText(data[7]);
            tf_shift_starts9.setText(data[8]);
            tf_shift_starts10.setText(data[9]);
        }
        if (col == 4) {
            Window p = (Window) this;
            Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
            nd.setTitle("");
            nd.setCallback(new Dlg_confirm_action.Callback() {

                @Override
                public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                    closeDialog.ok();
                    Shifting_types.delete_data(to);
                    ret_shifting_types();
                    Alert.set(3, "");
                    clear_shifting_types();
                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
    }

    private void clear_shifting_types() {
        tf_shift_name.setText("");
        tf_shift_starts1.setText("");
        tf_shift_starts2.setText("");
        tf_shift_starts3.setText("");
        tf_shift_starts4.setText("");
        tf_shift_starts5.setText("");
        tf_shift_starts6.setText("");
        tf_shift_starts7.setText("");
        tf_shift_starts8.setText("");
        tf_shift_starts9.setText("");
        tf_shift_starts10.setText("");
        tbl_shifting_types.clearSelection();
        tf_shift_name.grabFocus();

    }
//</editor-fold> 

    List<Dtr.minutes> dtr_minutes = new ArrayList();

    private void init_minutes(final JTextField tf) {

        Object[][] obj = new Object[dtr_minutes.size()][1];
        int i = 0;
        for (Dtr.minutes to : dtr_minutes) {
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
                Dtr.minutes to = dtr_minutes.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }
}
