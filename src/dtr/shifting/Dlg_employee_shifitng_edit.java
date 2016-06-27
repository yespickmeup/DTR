/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting;

import dtr.dtr.Dtr;
import dtr.shifting_types.Shifting_types;
import dtr.util.TableRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import synsoftech.fields.Button;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_employee_shifitng_edit extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_employee_shifitng_edot
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

        public final String mon_shift;
        public final String mon_shift_id;
        public final String tue_shift;
        public final String tue_shift_id;
        public final String wed_shift;
        public final String wed_shift_id;
        public final String thu_shift;
        public final String thu_shfit_id;
        public final String fri_shift;
        public final String fri_shift_id;
        public final String sat_shift;
        public final String sat_shift_id;
        public final String sun_shift;
        public final String sun_shift_id;

        public OutputData(String mon_shift, String mon_shift_id, String tue_shift, String tue_shift_id, String wed_shift, String wed_shift_id, String thu_shift, String thu_shfit_id, String fri_shift, String fri_shift_id, String sat_shift, String sat_shift_id, String sun_shift, String sun_shift_id) {
            this.mon_shift = mon_shift;
            this.mon_shift_id = mon_shift_id;
            this.tue_shift = tue_shift;
            this.tue_shift_id = tue_shift_id;
            this.wed_shift = wed_shift;
            this.wed_shift_id = wed_shift_id;
            this.thu_shift = thu_shift;
            this.thu_shfit_id = thu_shfit_id;
            this.fri_shift = fri_shift;
            this.fri_shift_id = fri_shift_id;
            this.sat_shift = sat_shift;
            this.sat_shift_id = sat_shift_id;
            this.sun_shift = sun_shift;
            this.sun_shift_id = sun_shift_id;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_employee_shifitng_edit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_employee_shifitng_edit(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_employee_shifitng_edit() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_employee_shifitng_edit myRef;

    private void setThisRef(Dlg_employee_shifitng_edit myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_employee_shifitng_edit> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_employee_shifitng_edit create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_employee_shifitng_edit create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_employee_shifitng_edit dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_employee_shifitng_edit((java.awt.Frame) parent, false);
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
            Dlg_employee_shifitng_edit dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_employee_shifitng_edit((java.awt.Dialog) parent, false);
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

        Dlg_employee_shifitng_edit dialog = Dlg_employee_shifitng_edit.create(new javax.swing.JFrame(), true);
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
        tf_shift_name = new Field.Input();
        jLabel2 = new javax.swing.JLabel();
        tf_shift_name1 = new Field.Input();
        jLabel3 = new javax.swing.JLabel();
        tf_shift_name2 = new Field.Combo();
        jLabel4 = new javax.swing.JLabel();
        tf_shift_name3 = new Field.Combo();
        jLabel5 = new javax.swing.JLabel();
        tf_shift_name4 = new Field.Combo();
        jLabel6 = new javax.swing.JLabel();
        tf_shift_name5 = new Field.Combo();
        tf_shift_name6 = new Field.Combo();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_shift_name7 = new Field.Combo();
        jLabel9 = new javax.swing.JLabel();
        tf_shift_name8 = new Field.Combo();
        jButton3 = new Button.Success();
        jButton2 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID:");

        tf_shift_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Employee Name:");

        tf_shift_name1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name1.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Monday:");

        tf_shift_name2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name2.setFocusable(false);
        tf_shift_name2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name2MouseClicked(evt);
            }
        });
        tf_shift_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_name2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tuesday:");

        tf_shift_name3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name3.setFocusable(false);
        tf_shift_name3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name3MouseClicked(evt);
            }
        });
        tf_shift_name3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_name3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Wednesday:");

        tf_shift_name4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name4.setFocusable(false);
        tf_shift_name4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thursday:");

        tf_shift_name5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name5.setFocusable(false);
        tf_shift_name5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name5MouseClicked(evt);
            }
        });
        tf_shift_name5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_name5ActionPerformed(evt);
            }
        });

        tf_shift_name6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name6.setFocusable(false);
        tf_shift_name6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Friday:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Saturday:");

        tf_shift_name7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name7.setFocusable(false);
        tf_shift_name7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Sunday:");

        tf_shift_name8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_shift_name8.setFocusable(false);
        tf_shift_name8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_name8MouseClicked(evt);
            }
        });

        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_shift_name6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_shift_name7)
                                    .addComponent(tf_shift_name5)
                                    .addComponent(tf_shift_name8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_shift_name, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                    .addComponent(tf_shift_name1)
                                    .addComponent(tf_shift_name2)
                                    .addComponent(tf_shift_name3)
                                    .addComponent(tf_shift_name4))))))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tf_shift_name5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_name5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_name5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ok();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_shift_name2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name2MouseClicked
        init_types(tf_shift_name2);
    }//GEN-LAST:event_tf_shift_name2MouseClicked

    private void tf_shift_name3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_name3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_name3ActionPerformed

    private void tf_shift_name3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name3MouseClicked
        init_types(tf_shift_name3);
    }//GEN-LAST:event_tf_shift_name3MouseClicked

    private void tf_shift_name4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name4MouseClicked
        init_types(tf_shift_name4);
    }//GEN-LAST:event_tf_shift_name4MouseClicked

    private void tf_shift_name5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name5MouseClicked
        init_types(tf_shift_name5);
    }//GEN-LAST:event_tf_shift_name5MouseClicked

    private void tf_shift_name6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name6MouseClicked
        init_types(tf_shift_name6);
    }//GEN-LAST:event_tf_shift_name6MouseClicked

    private void tf_shift_name7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name7MouseClicked
        init_types(tf_shift_name7);
    }//GEN-LAST:event_tf_shift_name7MouseClicked

    private void tf_shift_name8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_name8MouseClicked
        init_types(tf_shift_name8);
    }//GEN-LAST:event_tf_shift_name8MouseClicked

    private void tf_shift_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_name2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_shift_name;
    private javax.swing.JTextField tf_shift_name1;
    private javax.swing.JTextField tf_shift_name2;
    private javax.swing.JTextField tf_shift_name3;
    private javax.swing.JTextField tf_shift_name4;
    private javax.swing.JTextField tf_shift_name5;
    private javax.swing.JTextField tf_shift_name6;
    private javax.swing.JTextField tf_shift_name7;
    private javax.swing.JTextField tf_shift_name8;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        String[] noh = {"08:00 AM", "09:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 AM", "03:00 AM", "04:00 AM", "05:00 AM"};
        String[] ms = {"07:00 AM", "08:00 AM", "09:00 AM", "10:00 AM", "", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM"};
        String[] gs = {"11:00 PM", "12:00 AM", "01:00 AM", "02:00 AM", "", "03:00 AM", "04:00 AM", "05:00 AM", "06:00 AM", "07:00 AM"};
        String[] ss = {"03:00 PM", "04:00 PM", "05:00 PM", "06:00 PM", "", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM", "11:00 PM"};

        Shifting_types.shifts s_noh = new Shifting_types.shifts("NOH", noh);
        Shifting_types.shifts s_ms = new Shifting_types.shifts("MS", ms);
        Shifting_types.shifts s_gs = new Shifting_types.shifts("GS", gs);
        Shifting_types.shifts s_ss = new Shifting_types.shifts("SS", ss);
        dtr_hours.add(s_noh);
        dtr_hours.add(s_ms);
        dtr_hours.add(s_gs);
        dtr_hours.add(s_ss);

    }

    public void do_pass(Employee_shifting_schedules.to_employee_shifting_schedules to) {
        tf_shift_name.setText(to.emp_id);
        tf_shift_name1.setText(to.emp_name);

        Field.Combo mon = (Field.Combo) tf_shift_name2;
        mon.setText(to.mon_shift);
        mon.setId(to.mon_shift_id);
        Field.Combo tue = (Field.Combo) tf_shift_name3;
        tue.setText(to.tue_shift);
        tue.setId(to.tue_shift_id);
        Field.Combo wed = (Field.Combo) tf_shift_name4;
        wed.setText(to.wed_shift);
        wed.setId(to.wed_shift_id);
        Field.Combo thu = (Field.Combo) tf_shift_name5;
        thu.setText(to.thu_shift);
        thu.setId(to.thu_shfit_id);
        Field.Combo fri = (Field.Combo) tf_shift_name6;
        fri.setText(to.fri_shift);
        fri.setId(to.fri_shift_id);
        Field.Combo sat = (Field.Combo) tf_shift_name7;
        sat.setText(to.sat_shift);
        sat.setId(to.sat_shift_id);
        Field.Combo sun = (Field.Combo) tf_shift_name8;
        sun.setText(to.sun_shift);
        sun.setId(to.sun_shift_id);
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

    List<Shifting_types.shifts> dtr_hours = new ArrayList();

    private void init_types(final JTextField tf) {

        Object[][] obj = new Object[dtr_hours.size()][1];
        int i = 0;
        for (Shifting_types.shifts to : dtr_hours) {
            obj[i][0] = " " + to.name;
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
                Shifting_types.shifts to = dtr_hours.get(data.selected_row);
                combo.setText(to.name);
                combo.setId("" + Arrays.asList(to.time));
                System.out.println(Arrays.asList(to.time));

            }
        });
    }

    private void ok() {
        Field.Combo mon = (Field.Combo) tf_shift_name2;
        Field.Combo tue = (Field.Combo) tf_shift_name3;
        Field.Combo wed = (Field.Combo) tf_shift_name4;
        Field.Combo thu = (Field.Combo) tf_shift_name5;
        Field.Combo fri = (Field.Combo) tf_shift_name6;
        Field.Combo sat = (Field.Combo) tf_shift_name7;
        Field.Combo sun = (Field.Combo) tf_shift_name8;

        String mon_shift = mon.getText();
        String mon_shift_id = mon.getId();
        String tue_shift = tue.getText();
        String tue_shift_id = tue.getId();
        String wed_shift = wed.getText();
        String wed_shift_id = wed.getId();
        String thu_shift = thu.getText();
        String thu_shfit_id = thu.getId();
        String fri_shift = fri.getText();
        String fri_shift_id = fri.getId();
        String sat_shift = sat.getText();
        String sat_shift_id = sat.getId();
        String sun_shift = sun.getText();
        String sun_shift_id = sun.getId();
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id));
        }
    }
}
