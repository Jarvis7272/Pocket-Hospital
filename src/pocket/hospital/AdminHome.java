/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pocket.hospital;
import javax.swing.JOptionPane;

/**
 *
 * @author aahir
 */
public class AdminHome extends javax.swing.JFrame {

    int i=0;
    /**
     * Creates new form Home
     */
    
    public AdminHome(){
        initComponents();
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
        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        logout_btn.setText("LOGOUT");
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

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1050, 740));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hos_btnActionPerformed
        
        new HospitalEntry().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_hos_btnActionPerformed

    private void doc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doc_btnActionPerformed
        
        new DoctorEntry().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_doc_btnActionPerformed

    private void med_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_btnActionPerformed

        new MedicineEntry().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_med_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout", "Select", JOptionPane.YES_NO_OPTION);
        if(a== 0){
            new LoginAs().setVisible(true);
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton doc_btn;
    private javax.swing.JButton hos_btn;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton med_btn;
    private javax.swing.JButton turn;
    // End of variables declaration//GEN-END:variables
}
