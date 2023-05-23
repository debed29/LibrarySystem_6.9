package libsys;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static libsys.main.currFullName;

public class GuestSignUp extends main {
    public GuestSignUp() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new Button_Gradient.ButtonGradient();
        panelTransparent1 = new test_transparent_panel.PanelTransparent();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNewEmail = new textfield.TextField();
        txtNewPass = new textfield.PasswordField();
        txtNewPassConf = new textfield.PasswordField();
        btnConfirm1 = new Button_Gradient.ButtonGradient();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(153, 153, 255));
        btnBack.setForeground(new java.awt.Color(51, 51, 255));
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

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-user-male-100.png"))); // NOI18N
        panelTransparent1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 120));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Create account");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelTransparent1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 399, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Register a account");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelTransparent1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 399, 27));

        txtNewEmail.setLabelText("Enter your full name\n");
        panelTransparent1.add(txtNewEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 250, -1));

        txtNewPass.setLabelText("Create Password\n");
        txtNewPass.setShowAndHide(true);
        txtNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewPassActionPerformed(evt);
            }
        });
        panelTransparent1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 250, -1));

        txtNewPassConf.setLabelText("Confirm Password");
        txtNewPassConf.setShowAndHide(true);
        panelTransparent1.add(txtNewPassConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 250, -1));

        btnConfirm1.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirm1.setText("CREATE ACCOUNT");
        btnConfirm1.setColor1(new java.awt.Color(0, 51, 51));
        btnConfirm1.setColor2(new java.awt.Color(0, 102, 102));
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });
        panelTransparent1.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 250, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-50.png"))); // NOI18N
        panelTransparent1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 60, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-password-40.png"))); // NOI18N
        panelTransparent1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 50, 44));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-forgot-password-40.png"))); // NOI18N
        panelTransparent1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 70, 44));

        getContentPane().add(panelTransparent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 400, 620));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/199139574.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
   
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        main.sendDisplaySignal(new ReaderSignIn()); // <--- It goes to
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed

        
        usiEmail = txtNewEmail.getText();
        if (emailTaken(usiEmail))
        {
            JOptionPane.showMessageDialog(null, "Email already taken");
            return;
        }
        
        usiPass = String.valueOf(txtNewPass.getPassword());
        
        if ( usiPass.isEmpty() || usiEmail.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Must satisfy all fields");
        }
        else if (lessthanLength(6, txtNewPass)) {
            JOptionPane.showMessageDialog(null, "Password must be greater than or equal to 6 characters");
        }
        else if (lessthanLength(4, txtNewEmail)) {
            JOptionPane.showMessageDialog(null, "Email must be greater than or equal to 4 characters");
        }                
        else 
        {
            if (!String.valueOf(txtNewPass.getPassword()).equals(String.valueOf(txtNewPassConf.getPassword()))) 
            {
                JOptionPane.showMessageDialog(null, "Password not aligned. Try again.");
            } 
            else 
            {
                try
                {
                    databaseConnect("accounts");
                    int randID = randNumGen("accounts", "userid");
                    databaseConnect("accounts");
                    rs.moveToInsertRow();
                    rs.updateInt("USERID", randID); 
                    rs.updateNull("FULLNAME");
                    rs.updateString("PASSWORD", usiPass);
                    rs.updateString("USERTYPE", "GUEST");
                    rs.updateString("EMAIL", usiEmail);
                    rs.updateNull("CONTACTNUMBER");
                    rs.updateNull("ADDRESS");
                    rs.updateNull("VALIDID");
                    rs.updateNull("BIRTHDATE");
                    rs.updateNull("SEX");
                    rs.insertRow();
                    refreshRsStmt("accounts");

                    JOptionPane.showMessageDialog(null, "Registration Complete!");
                    this.dispose();
                    
                    databaseConnect("accounts");
                    getCurrProp();
                    refreshRsStmt("accounts");
                    
                    toUsertypeBases("GUEST");
                    databaseConnect("accounts"); 
                    refreshRsStmt("accounts");
                }  
                catch (SQLException err) 
                {
                System.out.println(err.getMessage());
                } 
                catch (Exception ex) 
                {
                    Logger.getLogger(GuestSignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void txtNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewPassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnBack;
    private Button_Gradient.ButtonGradient btnConfirm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private test_transparent_panel.PanelTransparent panelTransparent1;
    private textfield.TextField txtNewEmail;
    private textfield.PasswordField txtNewPass;
    private textfield.PasswordField txtNewPassConf;
    // End of variables declaration//GEN-END:variables

}
