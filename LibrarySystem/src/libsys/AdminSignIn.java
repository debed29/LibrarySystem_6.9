package libsys;

import libsys.AdminBase;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminSignIn extends main {

    public AdminSignIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new Button_Gradient.ButtonGradient();
        panelTransparent2 = new test_transparent_panel.PanelTransparent();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogName = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        txtLogPass = new textfield.PasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnConfirm = new Button_Gradient.ButtonGradient();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_20px.png"))); // NOI18N
        btnBack.setColor1(new java.awt.Color(211, 204, 227));
        btnBack.setColor2(new java.awt.Color(233, 228, 240));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        panelTransparent2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-94.png"))); // NOI18N
        panelTransparent2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 74, 390, 113));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMIN LOGIN");
        panelTransparent2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 193, 390, 50));

        txtLogName.setLabelText("User Name");
        panelTransparent2.add(txtLogName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 230, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-50.png"))); // NOI18N
        panelTransparent2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 44));

        txtLogPass.setLabelText("Confirm Password");
        txtLogPass.setShowAndHide(true);
        panelTransparent2.add(txtLogPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-40.png"))); // NOI18N
        panelTransparent2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 50, -1));

        btnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("LOGIN");
        btnConfirm.setColor1(new java.awt.Color(0, 51, 51));
        btnConfirm.setColor2(new java.awt.Color(0, 102, 102));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        panelTransparent2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 246, -1));

        getContentPane().add(panelTransparent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 370, 580));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3346778.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 850));

        setSize(new java.awt.Dimension(1056, 891));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.sendDisplaySignal(new MainWindow()); // <--- It goes back to
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        usiFullName = txtLogName.getText();
        usiPass = String.valueOf(txtLogPass.getPassword());
        try {
            databaseConnect("accounts");
            signIn("ADMIN", txtLogName, txtLogPass);
        } catch (Exception ex) {
            Logger.getLogger(AdminSignIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack;
    private Button_Gradient.ButtonGradient btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private test_transparent_panel.PanelTransparent panelTransparent2;
    private textfield.TextField txtLogName;
    private textfield.PasswordField txtLogPass;
    // End of variables declaration//GEN-END:variables
}
