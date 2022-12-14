/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pocket.hospital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author aahir
 */
public class Home extends javax.swing.JFrame {
    public int i = 0;

    /**
     * Creates new form Home
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs =null;
    
    public Home(){
        initComponents();
        conn =  DbCon.ConnecrDb();
        updateMedTable();
        updateDocTable();
        updateHosTable();
    }
    
    private void updateMedTable(){
        String sql = "Select * from medicine";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            med_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void updateDocTable(){
        String sql = "Select * from doctor";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            doc_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void updateHosTable(){
        String sql = "Select * from hospital";
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            hos_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hos_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        doc_btn = new javax.swing.JButton();
        med_btn = new javax.swing.JButton();
        turn = new javax.swing.JButton();
        multiFrame = new javax.swing.JTabbedPane();
        medFrame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        med_table = new javax.swing.JTable();
        head1 = new javax.swing.JLabel();
        illness = new javax.swing.JComboBox<>();
        bgpanel = new javax.swing.JLabel();
        docFrame = new javax.swing.JPanel();
        head2 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        doc_table = new javax.swing.JTable();
        bgpanel1 = new javax.swing.JLabel();
        hosFrame = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hos_table = new javax.swing.JTable();
        STATE = new javax.swing.JComboBox<>();
        head3 = new javax.swing.JLabel();
        bgpanel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hos_btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hospital.png"))); // NOI18N
        hos_btn.setText("HOSPITAL");
        hos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hos_btnActionPerformed(evt);
            }
        });
        getContentPane().add(hos_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 420, 160, 35));

        logout_btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logout_btn.setText("SWITCH USER");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        getContentPane().add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 520, 160, 35));

        doc_btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        doc_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor.png"))); // NOI18N
        doc_btn.setText("DOCTORS");
        doc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doc_btnActionPerformed(evt);
            }
        });
        getContentPane().add(doc_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 320, 160, 35));

        med_btn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        med_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medicine.png"))); // NOI18N
        med_btn.setText("MEDICINE");
        med_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med_btnActionPerformed(evt);
            }
        });
        getContentPane().add(med_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 220, 160, 35));

        turn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/two arrow.png"))); // NOI18N
        turn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnActionPerformed(evt);
            }
        });
        getContentPane().add(turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        multiFrame.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        multiFrame.setToolTipText("");
        multiFrame.setEnabled(false);
        multiFrame.setFocusable(false);
        multiFrame.setVerifyInputWhenFocusTarget(false);

        medFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        med_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        med_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MEDICINE", "DOSE", "LABEL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        med_table.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(med_table);
        if (med_table.getColumnModel().getColumnCount() > 0) {
            med_table.getColumnModel().getColumn(0).setResizable(false);
            med_table.getColumnModel().getColumn(1).setResizable(false);
            med_table.getColumnModel().getColumn(2).setResizable(false);
            med_table.getColumnModel().getColumn(3).setResizable(false);
        }

        medFrame.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 560, 290));

        head1.setFont(new java.awt.Font("MS Mincho", 1, 24)); // NOI18N
        head1.setText("Find Your Medicine");
        medFrame.add(head1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 240, 40));

        illness.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        illness.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Cough", "Body-Pain", "Headache", "Stomache", "Cut", "Burn", "Vitamins", "Calcium" }));
        illness.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                illnessItemStateChanged(evt);
            }
        });
        medFrame.add(illness, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 110, 30));

        bgpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panelbg.jpg"))); // NOI18N
        bgpanel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        medFrame.add(bgpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, 520));

        multiFrame.addTab("", medFrame);

        docFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head2.setFont(new java.awt.Font("MS Mincho", 1, 24)); // NOI18N
        head2.setText("Find Your Doctor");
        docFrame.add(head2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 240, 40));

        state.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa\t", "Gujarat\t", "Haryana\t", "Himachal Pradesh\t", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "West Bengal" }));
        state.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stateItemStateChanged(evt);
            }
        });
        docFrame.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 160, 30));

        doc_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        doc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DOCTOR", "SPECIFICATION", "STATE", "DISTRICT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doc_table.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(doc_table);

        docFrame.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 640, 290));

        bgpanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panelbg.jpg"))); // NOI18N
        docFrame.add(bgpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 410));

        multiFrame.addTab("", docFrame);

        hosFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hos_table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        hos_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DOCTOR", "SPECIFICATION", "STATE", "DISTRICT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hos_table.setRowSelectionAllowed(false);
        jScrollPane3.setViewportView(hos_table);

        hosFrame.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 640, 290));

        STATE.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        STATE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa\t", "Gujarat\t", "Haryana\t", "Himachal Pradesh\t", "Jharkhand\t", "Karnataka\t", "Kerala\t", "Madhya Pradesh\t", "Maharashtra\t", "Manipur\t", "Meghalaya\t", "Mizoram\t", "Nagaland", "Odisha\t", "Punjab\t", "Rajasthan\t", "Sikkim\t", "Tamil Nadu\t", "Telangana\t", "Tripura\t", "Uttar Pradesh\t", "West Bengal" }));
        STATE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                STATEItemStateChanged(evt);
            }
        });
        hosFrame.add(STATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 160, 30));

        head3.setFont(new java.awt.Font("MS Mincho", 1, 24)); // NOI18N
        head3.setText("Find Your Hospital");
        hosFrame.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 240, 40));

        bgpanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panelbg.jpg"))); // NOI18N
        bgpanel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hosFrame.add(bgpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 520));

        multiFrame.addTab("", hosFrame);

        getContentPane().add(multiFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 700, 410));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hos_btnActionPerformed
        
        multiFrame.setSelectedIndex(2);
    }//GEN-LAST:event_hos_btnActionPerformed

    private void doc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_btnActionPerformed
        
        multiFrame.setSelectedIndex(1);
    }//GEN-LAST:event_doc_btnActionPerformed

    private void med_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_btnActionPerformed

        multiFrame.setSelectedIndex(0);
    }//GEN-LAST:event_med_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        
        new LoginAs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void turnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnActionPerformed
        
        if(i==0){
            med_btn.setLocation(250, 100);
            doc_btn.setLocation(450, 100);
            hos_btn.setLocation(650, 100);
            logout_btn.setLocation(850, 100);
            i = 1;
        }
        else{
            med_btn.setLocation(95, 220);
            doc_btn.setLocation(95, 320);
            hos_btn.setLocation(95, 420);
            logout_btn.setLocation(95, 520);
            i = 0;
        }
    }//GEN-LAST:event_turnActionPerformed

    private void illnessItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_illnessItemStateChanged

        String s = illness.getSelectedItem().toString();
        String sql = "Select * from medicine Where label = '" +s+ "'";

        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                med_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicineEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_illnessItemStateChanged

    private void stateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stateItemStateChanged
        
        String s = state.getSelectedItem().toString();
        String sql = "Select * from doctor Where State = '" +s+ "'";

        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                doc_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicineEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stateItemStateChanged

    private void STATEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_STATEItemStateChanged
        
        String s = state.getSelectedItem().toString();
        String sql = "Select * from hospital Where STATE = '" +s+ "'";

        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                hos_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MedicineEntry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_STATEItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> STATE;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bgpanel;
    private javax.swing.JLabel bgpanel1;
    private javax.swing.JLabel bgpanel2;
    private javax.swing.JPanel docFrame;
    private javax.swing.JButton doc_btn;
    private javax.swing.JTable doc_table;
    private javax.swing.JLabel head1;
    private javax.swing.JLabel head2;
    private javax.swing.JLabel head3;
    private javax.swing.JPanel hosFrame;
    private javax.swing.JButton hos_btn;
    private javax.swing.JTable hos_table;
    private javax.swing.JComboBox<String> illness;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logout_btn;
    private javax.swing.JPanel medFrame;
    private javax.swing.JButton med_btn;
    private javax.swing.JTable med_table;
    private javax.swing.JTabbedPane multiFrame;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JButton turn;
    // End of variables declaration//GEN-END:variables
}
