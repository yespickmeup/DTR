/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtr.dtrs;

import dtr.dtr.Dtr;
import dtr.util.DateType;
import dtr.util.TableRenderer;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Dlg_edit_dtr extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_edit_dtr
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

        public final String am_arrival;
        public final String am_departure;
        public final String pm_arrival;
        public final String pm_departure;
        public final String undertime_hour;
        public final String undertime_minute;

        public OutputData(String am_arrival, String am_departure, String pm_arrival, String pm_departure, String undertime_hour, String undertime_minute) {
            this.am_arrival = am_arrival;
            this.am_departure = am_departure;
            this.pm_arrival = pm_arrival;
            this.pm_departure = pm_departure;
            this.undertime_hour = undertime_hour;
            this.undertime_minute = undertime_minute;
        }

    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructors ">
    private Dlg_edit_dtr(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    private Dlg_edit_dtr(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        myInit();
    }

    public Dlg_edit_dtr() {
        super();
        setUndecorated(true);
        initComponents();
        myInit();

    }
    private Dlg_edit_dtr myRef;

    private void setThisRef(Dlg_edit_dtr myRef) {
        this.myRef = myRef;
    }
    private static java.util.Map<Object, Dlg_edit_dtr> dialogContainer = new java.util.HashMap();

    public static void clearUpFirst(java.awt.Window parent) {
        if (dialogContainer.containsKey(parent)) {
            dialogContainer.remove(parent);
        }
    }

    public static Dlg_edit_dtr create(java.awt.Window parent, boolean modal) {

        if (modal) {
            return create(parent, ModalityType.APPLICATION_MODAL);
        }

        return create(parent, ModalityType.MODELESS);

    }

    public static Dlg_edit_dtr create(java.awt.Window parent, java.awt.Dialog.ModalityType modalType) {

        if (parent instanceof java.awt.Frame) {

            Dlg_edit_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_edit_dtr((java.awt.Frame) parent, false);
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
            Dlg_edit_dtr dialog = dialogContainer.get(parent);

            if (dialog == null) {
                dialog = new Dlg_edit_dtr((java.awt.Dialog) parent, false);
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

        Dlg_edit_dtr dialog = Dlg_edit_dtr.create(new javax.swing.JFrame(), true);
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
        jTextField1 = new Field.Input();
        jTextField2 = new Field.Input();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new Field.Combo();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new Field.Input();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new Field.Combo();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new Field.Combo();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new Field.Combo();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new Field.Combo();
        jTextField4 = new Field.Combo();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField5 = new Field.Combo();
        jLabel16 = new javax.swing.JLabel();
        jTextField13 = new Field.Combo();
        jLabel17 = new javax.swing.JLabel();
        jTextField14 = new Field.Combo();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new Field.Combo();
        jLabel19 = new javax.swing.JLabel();
        jTextField15 = new Field.Combo();
        jLabel20 = new javax.swing.JLabel();
        jTextField16 = new Field.Combo();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new Field.Combo();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField17 = new Field.Combo();
        jButton1 = new Button.Success();
        jButton2 = new Button.Default();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Employee Id:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setFocusable(false);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Employee Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("AM Arrival:");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("AM Departure:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Date:");

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("Hour:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("Minute:");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setText("00");
        jTextField9.setFocusable(false);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("Seconds:");

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setText("00");
        jTextField10.setFocusable(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setText("Hour:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel13.setText("Minute:");

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setText("00");
        jTextField11.setFocusable(false);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel14.setText("Seconds:");

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.setText("00");
        jTextField12.setFocusable(false);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setFocusable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("PM Arrival:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel15.setText("Hour:");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setFocusable(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel16.setText("Minute:");

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.setText("00");
        jTextField13.setFocusable(false);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel17.setText("Seconds:");

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.setText("00");
        jTextField14.setFocusable(false);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PM Departure:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel18.setText("Hour:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setFocusable(false);
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel19.setText("Minute:");

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setText("00");
        jTextField15.setFocusable(false);
        jTextField15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField15MouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Seconds:");

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField16.setText("00");
        jTextField16.setFocusable(false);
        jTextField16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField16MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Undertime:");

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.setFocusable(false);
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel22.setText("Hour:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel23.setText("Minute:");

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField17.setText("00");
        jTextField17.setFocusable(false);
        jTextField17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField17MouseClicked(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2)
                                .addComponent(jTextField1)
                                .addComponent(jTextField7)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        disposed();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        init_hours_am(jTextField3);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        init_hours_am(jTextField4);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        init_hours_pm(jTextField5);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        init_hours_pm(jTextField6);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
        init_undertime(jTextField8);
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        init_minutes(jTextField9);
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        init_minutes(jTextField11);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        init_minutes(jTextField13);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField15MouseClicked
        init_minutes(jTextField15);
    }//GEN-LAST:event_jTextField15MouseClicked

    private void jTextField17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField17MouseClicked
        init_minutes(jTextField17);
    }//GEN-LAST:event_jTextField17MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        init_seconds(jTextField10);
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        init_seconds(jTextField12);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        init_seconds(jTextField14);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField16MouseClicked
        init_seconds(jTextField16);
    }//GEN-LAST:event_jTextField16MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ok();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    private void myInit() {
        init_key();
        dtr_hours_am = Dtr.hours.seed_am();
        dtr_hours_pm = Dtr.hours.seed_pm();
        dtr_hours_all = Dtr.hours.seed_all();
        dtr_undertime = Dtr.hours.seed_undertime();
        dtr_minutes = Dtr.minutes.seed();
        dtr_seconds = Dtr.seconds.seed();
    }

    public void do_pass(Dtrs.to_dtrs to) {
        jTextField1.setText(to.employee_id);
        jTextField2.setText(to.employee_name);
        jTextField7.setText(DateType.convert_jan_1_2013_sf(to.dtr_date));
        jTextField8.setText(to.undertime_hours);
        jTextField17.setText(to.undertime_minutes);
        try {
            if (to.am_arrival != null) {
                Date am_arrival = DateType.datetime.parse(to.am_arrival);
                String hour = Dtr.convert_to_ampm(DateType.hour.format(am_arrival));
                String minute = DateType.minute.format(am_arrival);
                String second = DateType.second.format(am_arrival);
                jTextField3.setText(hour);
                jTextField9.setText(minute);
                jTextField10.setText(second);
            }
            if (to.am_departure != null) {
                Date am_arrival = DateType.datetime.parse(to.am_departure);
                String hour = Dtr.convert_to_ampm(DateType.hour.format(am_arrival));
                String minute = DateType.minute.format(am_arrival);
                String second = DateType.second.format(am_arrival);
                jTextField4.setText(hour);
                jTextField11.setText(minute);
                jTextField12.setText(second);
            }
            if (to.pm_arrival != null) {
                Date am_arrival = DateType.datetime.parse(to.pm_arrival);
                String hour = Dtr.convert_to_ampm(DateType.hour.format(am_arrival));
                String minute = DateType.minute.format(am_arrival);
                String second = DateType.second.format(am_arrival);
                jTextField5.setText(hour);
                jTextField13.setText(minute);
                jTextField14.setText(second);
            }
            if (to.pm_departure != null) {
                Date am_arrival = DateType.datetime.parse(to.pm_departure);
                String hour = Dtr.convert_to_ampm(DateType.hour.format(am_arrival));
                String minute = DateType.minute.format(am_arrival);
                String second = DateType.second.format(am_arrival);
                jTextField6.setText(hour);
                jTextField15.setText(minute);
                jTextField16.setText(second);
            }
        } catch (ParseException ex) {
            Logger.getLogger(Dlg_edit_dtr.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    List<Dtr.hours> dtr_hours_am = new ArrayList();

    private void init_hours_am(final JTextField tf) {

        Object[][] obj = new Object[dtr_hours_am.size()][1];
        int i = 0;
        for (Dtr.hours to : dtr_hours_am) {
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
                Dtr.hours to = dtr_hours_am.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }
    List<Dtr.hours> dtr_hours_pm = new ArrayList();

    private void init_hours_pm(final JTextField tf) {

        Object[][] obj = new Object[dtr_hours_pm.size()][1];
        int i = 0;
        for (Dtr.hours to : dtr_hours_pm) {
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
                Dtr.hours to = dtr_hours_pm.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }

    List<Dtr.hours> dtr_hours_all = new ArrayList();

    private void init_hours_all(final JTextField tf) {

        Object[][] obj = new Object[dtr_hours_all.size()][1];
        int i = 0;
        for (Dtr.hours to : dtr_hours_all) {
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
                Dtr.hours to = dtr_hours_all.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }

    List<Dtr.hours> dtr_undertime = new ArrayList();

    private void init_undertime(final JTextField tf) {

        Object[][] obj = new Object[dtr_undertime.size()][1];
        int i = 0;
        for (Dtr.hours to : dtr_undertime) {
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
                Dtr.hours to = dtr_undertime.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }

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
    List<Dtr.seconds> dtr_seconds = new ArrayList();

    private void init_seconds(final JTextField tf) {

        Object[][] obj = new Object[dtr_seconds.size()][1];
        int i = 0;
        for (Dtr.seconds to : dtr_seconds) {
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
                Dtr.seconds to = dtr_seconds.get(data.selected_row);
                combo.setText(to.hour);
            }
        });
    }

    private void ok() {
        String aah = Dtr.convert_to_00(jTextField3.getText());
        String adh = Dtr.convert_to_00(jTextField4.getText());
        String pah = Dtr.convert_to_00(jTextField5.getText());
        String pdh = Dtr.convert_to_00(jTextField6.getText());
        String uh = jTextField8.getText();

        String am_arrival = aah + ":" + jTextField9.getText() + ":" + jTextField10.getText();
        if (jTextField3.getText().isEmpty()) {
            am_arrival = null;
        }
        String am_departure = adh + ":" + jTextField11.getText() + ":" + jTextField12.getText();
        if (jTextField4.getText().isEmpty()) {
            am_departure = null;
        }
        String pm_arrival = pah + ":" + jTextField13.getText() + ":" + jTextField14.getText();
        if (jTextField5.getText().isEmpty()) {
            pm_arrival = null;
        }
        String pm_departure = pdh + ":" + jTextField15.getText() + ":" + jTextField16.getText();
        if (jTextField6.getText().isEmpty()) {
            pm_departure = null;
        }
        String undertime_hour = uh;
        String undertime_minute = jTextField17.getText();
        System.out.println("am_arrival: " + am_arrival);
        System.out.println("am_departure: " + am_departure);
        System.out.println("pm_arrival: " + pm_arrival);
        System.out.println("pm_departure: " + pm_departure);
        if (callback != null) {
            callback.ok(new CloseDialog(this), new OutputData(am_arrival, am_departure, pm_arrival, pm_departure, undertime_hour, undertime_minute));
        }
    }
}
