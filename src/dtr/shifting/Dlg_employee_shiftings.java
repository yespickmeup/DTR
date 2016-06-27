/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.shifting;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import dtr.users.MyUser;
import dtr.util.Alert;
import dtr.util.DateType;
import dtr.util.Dlg_confirm_action;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JTable;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import mijzcx.synapse.desk.utils.CloseDialog;
import mijzcx.synapse.desk.utils.KeyMapping;
import mijzcx.synapse.desk.utils.KeyMapping.KeyAction;
import mijzcx.synapse.desk.utils.TableWidthUtilities;
import synsoftech.fields.Field;

/**
 *
 * @author Guinness
 */
public class Dlg_employee_shiftings extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_shifting2
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
    private Dlg_employee_shiftings(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_employee_shiftings(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_employee_shiftings() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_employee_shiftings myRef;

    private void setThisRef(Dlg_employee_shiftings myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_employee_shiftings> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_employee_shiftings create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_employee_shiftings create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_employee_shiftings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_employee_shiftings((java.awt.Frame) parent, false);
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
            Dlg_employee_shiftings dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_employee_shiftings((java.awt.Dialog) parent, false);
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

        Dlg_employee_shiftings dialog = Dlg_employee_shiftings.create(new javax.swing.JFrame(), true);
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
        tbl_employees = new javax.swing.JTable();
        jTextField1 = new Field.Search();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tbl_employees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_employeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_employees);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ret_employees();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        ret_employees();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_employeesMouseClicked
        select_shifting_schedule();
    }//GEN-LAST:event_tbl_employeesMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbl_employees;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        init_tbl_employees(tbl_employees);
        ret_employees();
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

    //<editor-fold defaultstate="collapsed" desc=" employees "> 
    public static ArrayListModel tbl_employees_ALM;
    public static TblemployeesModel tbl_employees_M;

    public static void init_tbl_employees(JTable tbl_employees) {
        tbl_employees_ALM = new ArrayListModel();
        tbl_employees_M = new TblemployeesModel(tbl_employees_ALM);
        tbl_employees.setModel(tbl_employees_M);
        tbl_employees.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_employees.setRowHeight(25);
        int[] tbl_widths_employees = {50, 100, 60, 60, 60, 60, 60, 60, 60, 40, 50, 0, 0, 0, 0, 0};
        for (int i = 0, n = tbl_widths_employees.length; i < n; i++) {
            if (i == 1) {
                continue;
            }
            TableWidthUtilities.setColumnWidth(tbl_employees, i, tbl_widths_employees[i]);
        }
        Dimension d = tbl_employees.getTableHeader().getPreferredSize();
        d.height = 25;
        tbl_employees.getTableHeader().setPreferredSize(d);
        tbl_employees.getTableHeader().setFont(new java.awt.Font("Arial", 0, 12));
        tbl_employees.setRowHeight(25);
        tbl_employees.setFont(new java.awt.Font("Arial", 0, 12));
    }

    public static void loadData_employees(List<Employee_shifting_schedules.to_employee_shifting_schedules> acc) {
        tbl_employees_ALM.clear();
        tbl_employees_ALM.addAll(acc);
    }

    public static class TblemployeesModel extends AbstractTableAdapter {

        public static String[] COLUMNS = {
            "ID", "Name", "Monday", "Tueday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "", "", "user_screen_name", "shift", "shift_id", "supervisor", "manager"
        };

        public TblemployeesModel(ListModel listmodel) {
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
            Employee_shifting_schedules.to_employee_shifting_schedules tt = (Employee_shifting_schedules.to_employee_shifting_schedules) getRow(row);
            switch (col) {
                case 0:
                    return " " + tt.emp_id;
                case 1:
                    return " " + tt.emp_name;
                case 2:
                    return " " + tt.mon_shift;
                case 3:
                    return " " + tt.tue_shift;
                case 4:
                    return " " + tt.wed_shift;
                case 5:
                    return " " + tt.thu_shift;
                case 6:
                    return " " + tt.fri_shift;
                case 7:
                    return " " + tt.sat_shift;
                case 8:
                    return " " + tt.sun_shift;
                case 9:
                    if (tt.id == 0) {
                        return " Add";
                    } else {
                        return " Edit";
                    }
                case 10:
                    if (tt.id == 0) {
                        return " ";
                    } else {
                        return " Delete";
                    }
                case 11:
                    return "";
                case 12:
                    return "";
                case 13:
                    return "";
                case 14:
                    return "";
                default:
                    return "";
            }
        }
    }

    private void ret_employees() {
        String search = jTextField1.getText();
        String where = " where concat(lname,space(1),fname) like '%" + search + "%' "
                + " or concat(fname,space(1),lname) like '%" + search + "%' order by lname asc";
        List<Employee_shifting_schedules.to_employee_shifting_schedules> datas = Employee_shifting_schedules.ret_data(where);
        loadData_employees(datas);
    }
//</editor-fold> 

    private void select_shifting_schedule() {
        int row = tbl_employees.getSelectedRow();
        if (row < 0) {
            return;
        }
        final Employee_shifting_schedules.to_employee_shifting_schedules to = (Employee_shifting_schedules.to_employee_shifting_schedules) tbl_employees_ALM.get(row);
        int col = tbl_employees.getSelectedColumn();
        if (col == 9) {
            Window p = (Window) this;
            Dlg_employee_shifitng_edit nd = Dlg_employee_shifitng_edit.create(p, true);
            nd.setTitle("");
            nd.do_pass(to);
            nd.setCallback(new Dlg_employee_shifitng_edit.Callback() {
                @Override
                public void ok(CloseDialog closeDialog, Dlg_employee_shifitng_edit.OutputData data) {
                    closeDialog.ok();

                    if (to.id == 0) {
                        int id = 0;
                        String created_at = DateType.now();
                        String updated_at = DateType.now();
                        String created_by = MyUser.getUser_id();
                        String updated_by = MyUser.getUser_id();
                        int status = 1;
                        String emp_id = to.emp_id;
                        String emp_name = to.emp_name;
                        String mon_shift = data.mon_shift;
                        String mon_shift_id = data.mon_shift_id;
                        String tue_shift = data.tue_shift;
                        String tue_shift_id = data.tue_shift_id;
                        String wed_shift = data.wed_shift;
                        String wed_shift_id = data.wed_shift_id;
                        String thu_shift = data.thu_shift;
                        String thu_shfit_id = data.thu_shfit_id;
                        String fri_shift = data.fri_shift;
                        String fri_shift_id = data.fri_shift_id;
                        String sat_shift = data.sat_shift;
                        String sat_shift_id = data.sat_shift_id;
                        String sun_shift = data.sun_shift;
                        String sun_shift_id = data.sun_shift_id;
                        Employee_shifting_schedules.to_employee_shifting_schedules shift = new Employee_shifting_schedules.to_employee_shifting_schedules(id, created_at, updated_at, created_by, updated_by, status, emp_id, emp_name, mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id);
                        Employee_shifting_schedules.add_data(shift);
                        ret_employees();
                        Alert.set(1, "");
                    } else {
                        int id = to.id;
                        String created_at = to.created_at;
                        String updated_at = DateType.now();
                        String created_by = to.created_by;
                        String updated_by = MyUser.getUser_id();
                        int status = 1;
                        String emp_id = to.emp_id;
                        String emp_name = to.emp_name;
                        String mon_shift = data.mon_shift;
                        String mon_shift_id = data.mon_shift_id;
                        String tue_shift = data.tue_shift;
                        String tue_shift_id = data.tue_shift_id;
                        String wed_shift = data.wed_shift;
                        String wed_shift_id = data.wed_shift_id;
                        String thu_shift = data.thu_shift;
                        String thu_shfit_id = data.thu_shfit_id;
                        String fri_shift = data.fri_shift;
                        String fri_shift_id = data.fri_shift_id;
                        String sat_shift = data.sat_shift;
                        String sat_shift_id = data.sat_shift_id;
                        String sun_shift = data.sun_shift;
                        String sun_shift_id = data.sun_shift_id;
                        Employee_shifting_schedules.to_employee_shifting_schedules shift = new Employee_shifting_schedules.to_employee_shifting_schedules(id, created_at, updated_at, created_by, updated_by, status, emp_id, emp_name, mon_shift, mon_shift_id, tue_shift, tue_shift_id, wed_shift, wed_shift_id, thu_shift, thu_shfit_id, fri_shift, fri_shift_id, sat_shift, sat_shift_id, sun_shift, sun_shift_id);
                        Employee_shifting_schedules.update_data(shift);
                        ret_employees();
                        Alert.set(2, "");
                    }

                }
            });
            nd.setLocationRelativeTo(this);
            nd.setVisible(true);
        }
        if (col == 10) {
            if (to.id > 0) {

                Window p = (Window) this;
                Dlg_confirm_action nd = Dlg_confirm_action.create(p, true);
                nd.setTitle("");

                nd.setCallback(new Dlg_confirm_action.Callback() {

                    @Override
                    public void ok(CloseDialog closeDialog, Dlg_confirm_action.OutputData data) {
                        closeDialog.ok();

                        Employee_shifting_schedules.delete_data(to);
                        ret_employees();
                        Alert.set(3, "");

                    }
                });
                nd.setLocationRelativeTo(this);
                nd.setVisible(true);
            }

        }
    }
}
