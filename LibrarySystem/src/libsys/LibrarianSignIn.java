package libsys;

import libsys.AdminBase;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LibrarianSignIn extends main {

    public LibrarianSignIn() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack1 = new Button_Gradient.ButtonGradient();
        panelTransparent1 = new test_transparent_panel.PanelTransparent();
        btnConfirm = new Button_Gradient.ButtonGradient();
        txtLogPass = new textfield.PasswordField();
        txtLogName = new textfield.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setForeground(new java.awt.Color(0, 0, 0));
        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back_20px.png"))); // NOI18N
        btnBack1.setColor1(new java.awt.Color(211, 204, 227));
        btnBack1.setColor2(new java.awt.Color(233, 228, 240));
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 30));

        panelTransparent1.setBackground(new java.awt.Color(0, 51, 204));
        panelTransparent1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConfirm.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm.setText("LOGIN");
        btnConfirm.setColor1(new java.awt.Color(0, 51, 51));
        btnConfirm.setColor2(new java.awt.Color(0, 102, 102));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        panelTransparent1.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 246, -1));

        txtLogPass.setLabelText(" Confirm Password");
        txtLogPass.setShowAndHide(true);
        panelTransparent1.add(txtLogPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 230, -1));

        txtLogName.setLabelText(" User Name");
        panelTransparent1.add(txtLogName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 230, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("LIBRARIAN LOGIN");
        panelTransparent1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 410, 70));

        jLabel2.setBackground(new java.awt.Color(0, 51, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-librarian-100 (1).png"))); // NOI18N
        panelTransparent1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 410, 110));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-50.png"))); // NOI18N
        panelTransparent1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 39, 44));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-40.png"))); // NOI18N
        panelTransparent1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 39, 44));

        getContentPane().add(panelTransparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 410, 560));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3346778.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 850));

        setSize(new java.awt.Dimension(1059, 891));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        usiFullName = txtLogName.getText();
        usiPass = String.valueOf(txtLogPass.getPassword());   
        try {
            databaseConnect("accounts");
            signIn("LIBRARIAN", txtLogName, txtLogPass);
        } catch (Exception ex) {
            Logger.getLogger(LibrarianSignIn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        this.dispose();
        main.sendDisplaySignal(new MainWindow()); // <--- It goes back to
    }//GEN-LAST:event_btnBack1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack1;
    private Button_Gradient.ButtonGradient btnConfirm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private test_transparent_panel.PanelTransparent panelTransparent1;
    private textfield.TextField txtLogName;
    private textfield.PasswordField txtLogPass;
    // End of variables declaration//GEN-END:variables
}
