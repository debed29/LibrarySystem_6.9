
package libsys;

import com.raven.datechooser.EventDateChooser;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static libsys.main.currFullName;
import static libsys.main.currUserID;
import static libsys.main.currUserType;


public class MemberSignUp extends main{

    public MemberSignUp() {
        initComponents();
        getContentPane().setBackground(new Color(240, 240, 240));
        datechooser.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    datechooser.hidePopup();
                }
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datechooser = new com.raven.datechooser.DateChooser();
        panelRound1 = new Panel_Gradient.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfEmail = new textfield.TextField();
        pfPass = new textfield.PasswordField();
        tfFirst = new textfield.TextField();
        tfMiddle = new textfield.TextField();
        tfLast = new textfield.TextField();
        tfContact = new textfield.TextField();
        tfBirth = new textfield.TextField();
        tfAddress = new textfield.TextField();
        cbSex = new combobox.Combobox();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new Button_Gradient.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();

        datechooser.setForeground(new java.awt.Color(0, 51, 204));
        datechooser.setTextRefernce(tfBirth);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Valid ID:");
        panelRound1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.gif"))); // NOI18N
        panelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 370, 280));

        tfEmail.setLabelText(" Email:");
        panelRound1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 260, -1));

        pfPass.setLabelText(" Password:");
        pfPass.setShowAndHide(true);
        panelRound1.add(pfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 260, -1));

        tfFirst.setLabelText(" First Name:");
        panelRound1.add(tfFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 260, -1));

        tfMiddle.setLabelText(" Middle Name:");
        panelRound1.add(tfMiddle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 260, -1));

        tfLast.setLabelText(" Last Name:");
        panelRound1.add(tfLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 260, -1));

        tfContact.setLabelText(" Contact Number:");
        panelRound1.add(tfContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 260, -1));

        tfBirth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBirth.setLabelText(" Birthdate: (DD/MM/YYYY)");
        panelRound1.add(tfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 260, -1));

        tfAddress.setLabelText(" Home Address:");
        panelRound1.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 260, -1));

        cbSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        cbSex.setSelectedIndex(-1);
        cbSex.setLabeText(" Sex:");
        panelRound1.add(cbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 260, -1));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEMBER SIGN UP");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 160));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setText("CREATE ACCOUNT");
        btnCreate.setColor1(new java.awt.Color(0, 51, 51));
        btnCreate.setColor2(new java.awt.Color(0, 102, 102));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        panelRound1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 250, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 960, 580));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\paper-cut-luxury-gold-background-with-metal-texture-3d-abstract-for-gift-card-poster-on-wall-poster-template-landing-page-ui-ux-cover-book-banner-free-vector.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 720));

        setBounds(0, 0, 1154, 751);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tfEmail.setText(currEmail);
        pfPass.setText(currPass);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String theFullName = String.valueOf(tfFirst.getText().trim()) + " " +
        String.valueOf(tfMiddle.getText().trim()) + " " +
        String.valueOf(tfLast.getText().trim());
        int theContact = Integer.parseInt(tfContact.getText().trim());
        String theAddress = tfAddress.getText().trim();
        String birthDateString = tfBirth.getText().trim();
        String theSex = String.valueOf(cbSex.getSelectedItem());

        if (tfFirst.getText().isEmpty() || tfMiddle.getText().isEmpty() ||
            tfLast.getText().isEmpty() || tfContact.getText().isEmpty() ||
            tfAddress.getText().isEmpty() || tfBirth.getText().isEmpty() ||
            cbSex.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(null, "Must satisfy all fields");
        }
        // add check parameters
        else
        {
            try
            {
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                java.util.Date birthDate = dateFormat.parse(birthDateString);
                java.sql.Date sqlBirthDate = new java.sql.Date(birthDate.getTime());

                databaseConnect("accounts");
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " + currUserID);

                if (rs.next())
                {
                    rs.updateString("FULLNAME", theFullName);
                    rs.updateString("USERTYPE", "MEMBER");
                    rs.updateInt("CONTACTNUMBER", theContact);
                    rs.updateString("ADDRESS", theAddress);
                    rs.updateNull("VALIDID"); /// <--- enter valid ID here
                    rs.updateDate("BIRTHDATE", sqlBirthDate);
                    rs.updateString("SEX", theSex);
                    rs.updateRow();
                    refreshRsStmt("accounts");

                    JOptionPane.showMessageDialog(null, "Registration Complete!");
                    this.dispose();

                    databaseConnect("accounts");
                    getCurrProp();
                    refreshRsStmt("accounts");

                    toUsertypeBases("MEMBER");
                    databaseConnect("accounts");
                    refreshRsStmt("accounts");
                    JOptionPane.showMessageDialog(null, "You've successfully upgraded to Member!");
                }
            }
            catch (SQLException err)
            {
                System.out.println(err.getMessage());
            }
            catch (ParseException err)
            {
                JOptionPane.showMessageDialog(null, "Invalid birthdate format");
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

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
            java.util.logging.Logger.getLogger(MemberSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnCreate;
    private combobox.Combobox cbSex;
    private com.raven.datechooser.DateChooser datechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private Panel_Gradient.PanelRound panelRound1;
    private textfield.PasswordField pfPass;
    private textfield.TextField tfAddress;
    private textfield.TextField tfBirth;
    private textfield.TextField tfContact;
    private textfield.TextField tfEmail;
    private textfield.TextField tfFirst;
    private textfield.TextField tfLast;
    private textfield.TextField tfMiddle;
    // End of variables declaration//GEN-END:variables
}
