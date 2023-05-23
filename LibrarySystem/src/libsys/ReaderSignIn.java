package libsys;

import libsys.AdminBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import libsys.MainWindow;
import libsys.GuestSignUp;
import libsys.main;

public class ReaderSignIn extends main {

    public ReaderSignIn() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new Button_Gradient.ButtonGradient();
        panelTransparent1 = new test_transparent_panel.PanelTransparent();
        txtLogPass = new textfield.PasswordField();
        txtLogEmail = new textfield.TextField();
        btnCreate = new Button_Gradient.ButtonGradient();
        jLabel7 = new javax.swing.JLabel();
        btnCreateAcc = new Button_Gradient.ButtonGradient();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_20px.png"))); // NOI18N
        btnBack.setColor1(new java.awt.Color(211, 204, 227));
        btnBack.setColor2(new java.awt.Color(233, 228, 240));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        panelTransparent1.setBackground(new java.awt.Color(0, 153, 204));
        panelTransparent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogPass.setLabelText(" Enter Password:");
        txtLogPass.setShowAndHide(true);
        panelTransparent1.add(txtLogPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 245, -1));

        txtLogEmail.setLabelText(" Enter your Email:");
        txtLogEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLogEmailActionPerformed(evt);
            }
        });
        panelTransparent1.add(txtLogEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 243, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setText("LOGIN");
        btnCreate.setColor1(new java.awt.Color(0, 51, 51));
        btnCreate.setColor2(new java.awt.Color(0, 102, 102));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panelTransparent1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 246, 40));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Don't have account?");
        panelTransparent1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, 22));

        btnCreateAcc.setBackground(new java.awt.Color(255, 255, 255));
        btnCreateAcc.setText("CREATE ACCOUNT");
        btnCreateAcc.setColor1(new java.awt.Color(0, 51, 51));
        btnCreateAcc.setColor2(new java.awt.Color(0, 102, 102));
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });
        panelTransparent1.add(btnCreateAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 505, -1, 30));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Welcome Back Guest/Member");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelTransparent1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 390, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-male-user-94.png"))); // NOI18N
        panelTransparent1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 390, 110));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-email-40.png"))); // NOI18N
        panelTransparent1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 60, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-40.png"))); // NOI18N
        panelTransparent1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 60, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Log In to continue");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelTransparent1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 390, 54));

        getContentPane().add(panelTransparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 390, 570));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/199139574.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 850));

        setSize(new java.awt.Dimension(1057, 890));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
   
        try {
            databaseConnect("accounts");
            signIn("GUEST", "MEMBER", txtLogEmail, txtLogPass);
        } catch (Exception ex) {
            Logger.getLogger(ReaderSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        this.dispose();
        main.sendDisplaySignal(new GuestSignUp()); // <--- It goes to
    }//GEN-LAST:event_btnCreateAccActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.sendDisplaySignal(new MainWindow()); // <--- It goes back to
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtLogEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLogEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLogEmailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack;
    private Button_Gradient.ButtonGradient btnCreate;
    private Button_Gradient.ButtonGradient btnCreateAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private test_transparent_panel.PanelTransparent panelTransparent1;
    private textfield.TextField txtLogEmail;
    private textfield.PasswordField txtLogPass;
    // End of variables declaration//GEN-END:variables
}
