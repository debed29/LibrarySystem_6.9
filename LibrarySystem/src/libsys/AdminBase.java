
package libsys;

import java.awt.Color;
import static java.awt.Color.red;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import libsys.AdminBase;

public class AdminBase extends main {
    DefaultTableModel tblDataAccounts = new DefaultTableModel();
    int x = 0;
    public int ids;

    public AdminBase() {
        initComponents();
        
        btnSave.setVisible(false);
        btnEdit.setVisible(false);
        btnDelete.setVisible(false);
        cbUserType.setSelectedIndex(-1);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new textfield.TextField();
        txtFullname = new textfield.TextField();
        txtUserId = new textfield.TextField();
        cbUserType = new combobox.Combobox();
        btnSave = new Button_Gradient.ButtonGradient();
        btnAdd = new Button_Gradient.ButtonGradient();
        btnEdit = new Button_Gradient.ButtonGradient();
        btnDelete = new Button_Gradient.ButtonGradient();
        btnLogOut = new Button_Gradient.ButtonGradient();
        btnSearch = new Button_Gradient.ButtonGradient();
        randomNumber = new Button_Gradient.ButtonGradient();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fill1 = new javax.swing.JPanel();
        fill2 = new javax.swing.JPanel();
        fill3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(32, 58, 67));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, 780, 10));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText(" USERS ACCOUNTS:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        txtPassword.setLabelText(" Password:");
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 430, 50));

        txtFullname.setLabelText(" Fullname:");
        getContentPane().add(txtFullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 430, 50));

        txtUserId.setLabelText(" Used ID:");
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 430, 50));

        cbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "READER", "LIBRARIAN", "ADMIN" }));
        cbUserType.setSelectedIndex(-1);
        cbUserType.setLabeText(" User Type:");
        getContentPane().add(cbUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 430, 50));

        btnSave.setBackground(new java.awt.Color(32, 58, 67));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save_14px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setColor1(new java.awt.Color(32, 58, 67));
        btnSave.setColor2(new java.awt.Color(32, 58, 67));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 640, -1, 40));

        btnAdd.setBackground(new java.awt.Color(32, 58, 67));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_14px.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setColor1(new java.awt.Color(32, 58, 67));
        btnAdd.setColor2(new java.awt.Color(32, 58, 67));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 80, 40));

        btnEdit.setBackground(new java.awt.Color(32, 58, 67));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_14px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setColor1(new java.awt.Color(32, 58, 67));
        btnEdit.setColor2(new java.awt.Color(32, 58, 67));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 640, 90, 40));

        btnDelete.setBackground(new java.awt.Color(32, 58, 67));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/remove_14px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setColor1(new java.awt.Color(32, 58, 67));
        btnDelete.setColor2(new java.awt.Color(32, 58, 67));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 640, 100, 40));

        btnLogOut.setBackground(new java.awt.Color(32, 58, 67));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout_14px.png"))); // NOI18N
        btnLogOut.setText("LOG OUT");
        btnLogOut.setColor1(new java.awt.Color(32, 58, 67));
        btnLogOut.setColor2(new java.awt.Color(32, 58, 67));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 110, 40));

        btnSearch.setBackground(new java.awt.Color(32, 58, 67));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search_14px.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setColor1(new java.awt.Color(32, 58, 67));
        btnSearch.setColor2(new java.awt.Color(32, 58, 67));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 640, -1, 40));

        randomNumber.setBackground(new java.awt.Color(32, 58, 67));
        randomNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/where_what_quest_14px.png"))); // NOI18N
        randomNumber.setText("Random Number");
        randomNumber.setColor1(new java.awt.Color(66, 39, 90));
        randomNumber.setColor2(new java.awt.Color(66, 39, 90));
        randomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomNumberActionPerformed(evt);
            }
        });
        getContentPane().add(randomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 475, -1, 40));

        mainTable.setModel(tblDataAccounts);
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 620, 188));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_tag_40px.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 40, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name_40px.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 40, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password_40px.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 40, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/orcid_40px.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 40, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vintage-library-49.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 700));
        getContentPane().add(fill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 430, 40));
        getContentPane().add(fill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 430, 40));
        getContentPane().add(fill3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 430, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int ids;
        
        String[] columnNames = {"User ID", "Fullname", "Password", "User Type"};
        tblDataAccounts.setColumnIdentifiers(columnNames);
        tblDataAccounts.setRowCount(0);
        
        try {
            databaseConnect("accounts");
            ids = randNumGen("accounts", "userid");
            txtUserId.setText(String.valueOf(ids));
            databaseConnect("accounts");
            while(rs.next()) {
                tblDataAccounts.addRow(new Object[] 
                {
                    rs.getInt("USERID"), 
                    rs.getString("FULLNAME"), 
                    rs.getString("PASSWORD"), 
                    rs.getString("USERTYPE")
                });
                x++;
            }
            refreshRsStmt("accounts");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void mainTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMousePressed
        ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(), 0).toString());

        btnSave.setVisible(true);
        btnEdit.setVisible(true);
        btnDelete.setVisible(true);
    }//GEN-LAST:event_mainTableMousePressed

    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked

    }//GEN-LAST:event_mainTableMouseClicked

    private void randomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomNumberActionPerformed
        int ids = randNumGen("accounts", "userid");

        txtUserId.setText(String.valueOf(ids));
    }//GEN-LAST:event_randomNumberActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String searchUserId;

        searchUserId = JOptionPane.showInputDialog(null, "Search for User ID:", "Finding the Account",
            JOptionPane.QUESTION_MESSAGE);
        if(searchUserId!=null){
            try{
                int newId = Integer.parseInt(searchUserId);
                txtFullname.setEditable(false);
                txtPassword.setEditable(false);
                txtUserId.setEditable(false);
                cbUserType.setEnabled(false);

                try {
                    ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = "
                        + searchUserId);
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "User ID: " + aUserID + "\nFullname: " + rs.getString("FULLNAME") +
                            "\nPassword: " + rs.getString("PASSWORD") + "\nUser Type: " + rs.getString("USERTYPE"), "Account Details",
                            JOptionPane.INFORMATION_MESSAGE);

                        txtFullname.setText(rs.getString("FULLNAME"));
                        txtPassword.setText(rs.getString("PASSWORD"));
                        txtUserId.setText(String.valueOf(aUserID));
                        cbUserType.setSelectedItem(rs.getString("USERTYPE"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Account not Found!");
                    }
                } catch (SQLException err) {
                    JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
                }
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter an integer value.");
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logOut();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int del;

        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACCOUNTS WHERE USERID = " + ids);
            if (rs.next()) {
                del = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
                if (del == 0)
                {
                    boolean hasBorrowedBooks = checkBorrowedBooks(ids);

                    int confirm = JOptionPane.showConfirmDialog(null, "This account has borrowed books. Do you want to proceed with deletion?",
                        "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (confirm == 0 && hasBorrowedBooks)
                    {
                        rs.deleteRow();
                        JOptionPane.showMessageDialog(null, "Account has been deleted!");
                        //int ids = randNumGen("accounts", "userid");
                        //txtUserId.setText(String.valueOf(ids));
                        updateBorrowedBooks(ids);
                        formWindowOpened(null);
                    }
                    else
                    {
                        rs.deleteRow();
                        JOptionPane.showMessageDialog(null, "Account has been deleted!");
                        //int ids = randNumGen("accounts", "userid");
                        //txtUserId.setText(String.valueOf(ids));
                        updateBorrowedBooks(ids);
                        formWindowOpened(null);
                    }
                }
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtFullname.setEditable(true);
        txtPassword.setEditable(true);
        txtUserId.setEditable(true);

        cbUserType.setEnabled(true);
        btnSave.setEnabled(true);

        randomNumber.setEnabled(true);
        refreshRsStmt("accounts");
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        aFullname = txtFullname.getText();
        aPassword = txtPassword.getText();
        aUserType = String.valueOf(cbUserType.getSelectedItem());

        try {
            if (aFullname.isEmpty() || aPassword.isEmpty() || txtUserId.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill in the blanks.");
                if (aFullname.isEmpty()) {
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                if (aPassword.isEmpty()) {
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                }
                if (txtUserId.getText().isEmpty()) {
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                }
            }
            else if(lessthanLength(10, txtFullname) || lessthanLength(8, txtPassword)) {
                if(lessthanLength(10, txtFullname)){
                    fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name less than 10 characters.");
                }
                if(lessthanLength(8,txtPassword)){
                    fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Password less than 8 characters.");
                }
                if(lessthanLength(10, txtFullname) && lessthanLength(8,txtPassword)){
                    fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                    JOptionPane.showMessageDialog(null, "Name length less than 10 characters, Password length less than 8 characters.");
                }
            }
            else {
                aUserID = Integer.parseInt(txtUserId.getText());
                rs.moveToInsertRow();
                rs.updateInt("USERID", aUserID);
                rs.updateString("FULLNAME", aFullname);
                rs.updateString("PASSWORD", aPassword);
                rs.updateString("USERTYPE", aUserType);
                rs.insertRow();
                refreshRsStmt("accounts");
                formWindowOpened(null);

                JOptionPane.showMessageDialog(null, "Account has been added!");

                int ids = randNumGen("accounts", "userid");

                txtUserId.setText(String.valueOf(ids));
                txtFullname.setText(null);
                txtPassword.setText(null);
                cbUserType.setSelectedIndex(0);

                fill1.setVisible(false);
                fill2.setVisible(false);
                fill3.setVisible(false);
            }

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int ids = Integer.parseInt(mainTable.getValueAt(mainTable.getSelectedRow(),
            0).toString());
    aFullname = txtFullname.getText();
    aPassword = txtPassword.getText();
    aUserType = String.valueOf(cbUserType.getSelectedItem());

    try {
        if (aFullname.isEmpty() || aPassword.isEmpty() || txtUserId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill in the blanks.");
            if (aFullname.isEmpty()) {
                fill1.setBorder(BorderFactory.createLineBorder(Color.red));
            }
            if (aPassword.isEmpty()) {
                fill2.setBorder(BorderFactory.createLineBorder(Color.red));
            }
            if (txtUserId.getText().isEmpty()) {
                fill3.setBorder(BorderFactory.createLineBorder(Color.red));
            }
        }
        else if(lessthanLength(10, txtFullname) || lessthanLength(8, txtPassword)) {
            if(lessthanLength(10, txtFullname)){
                fill1.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(null, "Name less than 10 characters.");
            }
            if(lessthanLength(8,txtPassword)){
                fill2.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(null, "Password less than 8 characters.");
            }
            if(lessthanLength(10, txtFullname) && lessthanLength(8,txtPassword)){
                fill3.setBorder(BorderFactory.createLineBorder(Color.red));
                JOptionPane.showMessageDialog(null, "Name length less than 10 characters, Password length less than 8 characters.");
            }
        }
        else{
            aUserID = Integer.parseInt(txtUserId.getText());
            boolean b = stmt.execute("UPDATE ACCOUNTS SET FULLNAME = '" + txtFullname.getText() + "', PASSWORD = '" + txtPassword.getText() + "'"
                + ", USERTYPE = '" + String.valueOf(cbUserType.getSelectedItem()) + "' WHERE USERID = " + ids);
            if (!b) {
                JOptionPane.showMessageDialog(null, "The account has been updated!");

                txtFullname.setText(null);
                txtPassword.setText(null);
                cbUserType.setSelectedIndex(0);

                btnAdd.setVisible(true);
                btnSave.setVisible(false);
                btnEdit.setVisible(false);
                btnDelete.setVisible(false);

                refreshRsStmt("accounts");
                formWindowOpened(null);
            }
        }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed
      
    private boolean checkBorrowedBooks(int userId) {
        try {
            databaseConnect("books");
            ResultSet rs = stmt.executeQuery("SELECT AVAILABILITY FROM BOOKS WHERE BORROWER = " + userId);
            if (rs.next()) {
                String availability = rs.getString("AVAILABILITY");
                if (availability.equals("BORROWED") || availability.equals("RETURNING")) {
                    //databaseConnect("accounts");
                    refreshRsStmt("books");
                    return true;
                }
            }
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
        refreshRsStmt("books");
        return false;
    }
    
    private void updateBorrowedBooks(int userId) {
        try {
            databaseConnect("books");
            ResultSet rs = stmt.executeQuery("SELECT AVAILABILITY, BORROWER, DUEDATE FROM BOOKS WHERE BORROWER = " + userId);
            if (rs.next()) {
                rs.updateString("AVAILABILITY", "AVAILABLE");
                rs.updateNull("BORROWER");
                rs.updateNull("DUEDATE");
                rs.updateRow();
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(AdminBase.this, err.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Button_Gradient.ButtonGradient btnAdd;
    private Button_Gradient.ButtonGradient btnDelete;
    private Button_Gradient.ButtonGradient btnEdit;
    private Button_Gradient.ButtonGradient btnLogOut;
    private Button_Gradient.ButtonGradient btnSave;
    private Button_Gradient.ButtonGradient btnSearch;
    private combobox.Combobox cbUserType;
    private javax.swing.JPanel fill1;
    private javax.swing.JPanel fill2;
    private javax.swing.JPanel fill3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable mainTable;
    private Button_Gradient.ButtonGradient randomNumber;
    private textfield.TextField txtFullname;
    private textfield.TextField txtPassword;
    private textfield.TextField txtUserId;
    // End of variables declaration//GEN-END:variables

}