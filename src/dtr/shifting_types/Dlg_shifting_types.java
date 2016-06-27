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
        jLabel1 = new javax.swing.JLabel();
        tf_shift_name = new Field.Input();
        jLabel2 = new javax.swing.JLabel();
        tf_shift_starts = new Field.Combo();
        jLabel3 = new javax.swing.JLabel();
        tf_shift_ends = new Field.Combo();
        jButton3 = new Button.Success();
        jButton2 = new Button.Default();
        jTextField13 = new Field.Combo();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField14 = new Field.Combo();

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Shift Name:");

        tf_shift_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Starts:");

        tf_shift_starts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_starts.setText("08 AM");
        tf_shift_starts.setFocusable(false);
        tf_shift_starts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_startsMouseClicked(evt);
            }
        });
        tf_shift_starts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_startsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ends:");

        tf_shift_ends.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_shift_ends.setText("05 PM");
        tf_shift_ends.setFocusable(false);
        tf_shift_ends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_shift_endsMouseClicked(evt);
            }
        });
        tf_shift_ends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_shift_endsActionPerformed(evt);
            }
        });

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

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.setText("00");
        jTextField13.setFocusable(false);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText(" :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText(" :");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.setText("00");
        jTextField14.setFocusable(false);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_name))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_shift_starts, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_shift_ends, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_starts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_shift_ends, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void tf_shift_startsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_startsMouseClicked
        init_hours(tf_shift_starts);
    }//GEN-LAST:event_tf_shift_startsMouseClicked

    private void tf_shift_startsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_startsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_startsActionPerformed

    private void tf_shift_endsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_shift_endsMouseClicked
        init_hours(tf_shift_ends);
    }//GEN-LAST:event_tf_shift_endsMouseClicked

    private void tf_shift_endsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_shift_endsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_shift_endsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        save_shifting_types();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear_shifting_types();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_shifting_typesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_shifting_typesMouseClicked
        select_shifting_types();
    }//GEN-LAST:event_tbl_shifting_typesMouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        init_minutes(jTextField13);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        init_minutes(jTextField14);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTable tbl_shifting_types;
    private javax.swing.JTextField tf_shift_ends;
    private javax.swing.JTextField tf_shift_name;
    private javax.swing.JTextField tf_shift_starts;
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
        int[] tbl_widths_shifting_types = {100, 100, 100, 40, 50, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_shifting_types.length; i < n; i++) {
            if (i == 0) {
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
            String shift_starts = tf_shift_starts.getText();
            String shift_starts1 = shift_starts.substring(0, shift_starts.length() - 3);
            String day1 = shift_starts.substring(3, shift_starts.length());
            shift_starts = shift_starts1 + ":" + jTextField13.getText() + " " + day1;
            String shift_ends = tf_shift_ends.getText();
            String shift_ends1 = shift_ends.substring(0, shift_ends.length() - 3);
            String day2 = shift_ends.substring(3, shift_ends.length());
            shift_ends = shift_ends1 + ":" + jTextField14.getText() + " " + day2;
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
            String shift_starts = tf_shift_starts.getText();
            String shift_starts1 = shift_starts.substring(0, shift_starts.length() - 3);
            String day1 = shift_starts.substring(3, shift_starts.length());
            shift_starts = shift_starts1 + ":" + jTextField13.getText() + " " + day1;
            String shift_ends = tf_shift_ends.getText();
            String shift_ends1 = shift_ends.substring(0, shift_ends.length() - 3);
            String day2 = shift_ends.substring(3, shift_ends.length());
            shift_ends = shift_ends1 + ":" + jTextField14.getText() + " " + day2;

            to_shifting_types to1 = new to_shifting_types(id, created_at, updated_at, created_by, updated_by, status, shift_name, shift_starts, shift_ends);
            Shifting_types.update_data(to1);
            ret_shifting_types();
            Alert.set(2, "");
            clear_shifting_types();
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
            String shift_starts1 = shift_starts.substring(0, 2);
            String shift_starts2 = shift_starts.substring(3, 5);
            String day1 = shift_starts.substring(6, shift_starts.length());

            tf_shift_starts.setText(shift_starts1 + " " + day1);
            jTextField13.setText(shift_starts2);

            String shift_ends = to.shift_ends;
            String shift_ends1 = shift_ends.substring(0, 2);
            String shift_ends2 = shift_ends.substring(3, 5);
            String day3 = shift_ends.substring(6, shift_ends.length());
            tf_shift_ends.setText(shift_ends1 + " " + day3);
            jTextField14.setText(shift_ends2);
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
        tf_shift_starts.setText("08 AM");
        tf_shift_ends.setText("05 PM");
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
