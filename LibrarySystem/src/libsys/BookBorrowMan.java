package libsys;

import java.awt.event.ItemEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BookBorrowMan extends main {

    public BookBorrowMan() {
        initComponents();
        borrowTable.setDefaultEditor(Object.class, null);
        borrowedTable.setDefaultEditor(Object.class, null);
        bgBorrower.add(rbBorrowing);
        bgBorrower.add(rbReturning);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private DefaultTableModel borrowTableModel;
    private DefaultTableModel borrowedTableModel;
    public static int borrBookID;
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgBorrower = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        borrowedTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        borrowTable = new javax.swing.JTable();
        rbBorrowing = new radio_button.RadioButtonCustom();
        rbReturning = new radio_button.RadioButtonCustom();
        btnAcceptBorrow = new Button_Gradient.ButtonGradient();
        btnDeny = new Button_Gradient.ButtonGradient();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrowedTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrowedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(borrowedTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 262, 512, 663));

        borrowTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        borrowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        borrowTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(borrowTable);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 262, 505, 663));

        rbBorrowing.setBackground(new java.awt.Color(51, 51, 255));
        rbBorrowing.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        rbBorrowing.setForeground(new java.awt.Color(255, 255, 255));
        rbBorrowing.setText("Borrowing");
        rbBorrowing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbBorrowingItemStateChanged(evt);
            }
        });
        getContentPane().add(rbBorrowing, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 422, 90, -1));

        rbReturning.setBackground(new java.awt.Color(51, 51, 255));
        rbReturning.setForeground(new java.awt.Color(255, 255, 255));
        rbReturning.setText("Returning");
        rbReturning.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbReturningItemStateChanged(evt);
            }
        });
        getContentPane().add(rbReturning, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 462, 90, -1));

        btnAcceptBorrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-approval-20.png"))); // NOI18N
        btnAcceptBorrow.setText("ACCEPT");
        btnAcceptBorrow.setColor1(new java.awt.Color(0, 51, 51));
        btnAcceptBorrow.setColor2(new java.awt.Color(0, 102, 102));
        btnAcceptBorrow.setSizeSpeed(0.5F);
        btnAcceptBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptBorrowActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceptBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 312, 110, 60));

        btnDeny.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-cancel-20.png"))); // NOI18N
        btnDeny.setText("DENY");
        btnDeny.setColor1(new java.awt.Color(0, 51, 51));
        btnDeny.setColor2(new java.awt.Color(0, 102, 102));
        btnDeny.setSizeSpeed(0.5F);
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeny, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 542, 110, 60));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edb8b3da20cdc65f496b6b4dc3fe463d.gif"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 690, 190));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edb8b3da20cdc65f496b6b4dc3fe463d.gif"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 22, 650, 190));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6345384_3263344.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1380, 960));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6345384_3263344.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1380, 960));

        setSize(new java.awt.Dimension(1391, 1003));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String[] columnNames1 = {"BorrowerID", "Title", "BookID", "Availability"};
        borrowTableModel = new DefaultTableModel(columnNames1, 0);
        borrowTable.setModel(borrowTableModel);

        
        try {
            databaseConnect("books");
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY FROM BOOKS WHERE AVAILABILITY = 'BORROWING' OR AVAILABILITY = 'RETURNING'");
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
        
        String[] columnNames2 = {"BorrowerID", "Title", "BookID", "Duedate"};
        borrowedTableModel = new DefaultTableModel(columnNames2, 0);
        borrowedTable.setModel(borrowedTableModel);

        try {
            databaseConnect("books");
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, DUEDATE FROM BOOKS WHERE AVAILABILITY = 'BORROWED'");
            while (rs.next()) {
                borrowedTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getDate("DUEDATE")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void borrowTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowTableMouseClicked
        Object val = borrowTable.getValueAt(borrowTable.getSelectedRow(), 2);
        borrBookID = Integer.parseInt(val.toString());
    }//GEN-LAST:event_borrowTableMouseClicked

    private void rbBorrowingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbBorrowingItemStateChanged
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            databaseConnect("books");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY FROM BOOKS WHERE AVAILABILITY = 'BORROWING'");
            borrowTableModel.setRowCount(0);
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_rbBorrowingItemStateChanged

    private void rbReturningItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbReturningItemStateChanged
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            databaseConnect("books");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery("SELECT BORROWER, TITLE, BOOKID, AVAILABILITY, DUEDATE FROM BOOKS WHERE AVAILABILITY = 'RETURNING'");
            borrowTableModel.setRowCount(0);
            while (rs.next()) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getString("AVAILABILITY")
                });
            }
            refreshRsStmt("books");
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_rbReturningItemStateChanged

    private void btnAcceptBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptBorrowActionPerformed
        if (borrowTable.getSelectedRow() != -1) {
            try {
                int selectedRow = borrowTable.getSelectedRow();
                Object val = borrowTable.getValueAt(selectedRow, 2);
                borrBookID = Integer.parseInt(val.toString());

                String availability = null;
                Statement updateStmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet updateRs = updateStmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + borrBookID);

                if (updateRs.next()) {
                    Date localNow = Date.valueOf(LocalDate.now());
                    Date bookDue = updateRs.getDate("DUEDATE");
                    long diff_of_dates = dateDiff(bookDue, localNow);
                    availability = updateRs.getString("AVAILABILITY");

                    if (availability.equals("BORROWING")) {
                        availability = "BORROWED";
                    } else if (availability.equals("RETURNING") && (diff_of_dates >= 0)) {
                        availability = "AVAILABLE";
                        updateRs.updateNull("BORROWER");
                        updateRs.updateNull("DUEDATE");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book Overdue. Please handle the case for overdue books.");
                    }

                    updateRs.updateString("AVAILABILITY", availability);
                    updateRs.updateRow();
                }

                // Store data from ResultSet in a separate data structure
                List<Object[]> resultSetData = new ArrayList<>();
                while (updateRs.next()) {
                    availability = updateRs.getString("AVAILABILITY");
                    if (availability.equals("RETURNING") || availability.equals("BORROWING")) {
                        resultSetData.add(new Object[]{
                            updateRs.getString("BORROWER"),
                            updateRs.getString("TITLE"),
                            updateRs.getInt("BOOKID"),
                            availability
                        });
                    }
                }

                // Use the stored data for subsequent iteration
                borrowTableModel.setRowCount(0);
                for (Object[] rowData : resultSetData) {
                    borrowTableModel.addRow(rowData);
                }

                bgBorrower.clearSelection();

                // Close ResultSet and Statement
                updateRs.close();
                updateStmt.close();

                refreshRsStmt("books");
                updateBorrowedTable();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage());
            }
        }
    }//GEN-LAST:event_btnAcceptBorrowActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        if (borrowTable.getSelectedRow() != -1) {
            try {
                int selectedRow = borrowTable.getSelectedRow();
                Object val = borrowTable.getValueAt(selectedRow, 2);
                borrBookID = Integer.parseInt(val.toString());

                String availability = null;
                Statement updateStmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet updateRs = updateStmt.executeQuery("SELECT * FROM BOOKS WHERE BOOKID = " + borrBookID);

                while (updateRs.next()) {
                    availability = updateRs.getString("AVAILABILITY");
                    if (availability.equals("BORROWING")) {
                        availability = "AVAILABLE";
                    } else if (availability.equals("RETURNING")) {
                        availability = "BORROWED";
                    } else {
                        JOptionPane.showMessageDialog(null, "Book Overdue. Please handle the case for overdue books.");
                    }

                    updateRs.updateString("AVAILABILITY", availability);
                    updateRs.updateRow();
                }

                updateRs.close();
                updateStmt.close();
                refreshRsStmt("books");
                updateBorrowedTable();
                borrowTableModel.setRowCount(0);

                Statement selectStmt = con.createStatement();
                ResultSet selectRs = selectStmt.executeQuery("SELECT * FROM BOOKS");

                while (selectRs.next()) {
                    availability = selectRs.getString("AVAILABILITY");
                    if (availability.equals("RETURNING") || availability.equals("BORROWING")) {
                        borrowTableModel.addRow(new Object[]{
                            selectRs.getString("BORROWER"),
                            selectRs.getString("TITLE"),
                            selectRs.getInt("BOOKID"),
                            availability
                        });
                    }
                }

                selectRs.close();
                selectStmt.close();
                bgBorrower.clearSelection();
            } catch (SQLException err) {
                JOptionPane.showMessageDialog(null, "Error: " + err.getMessage());
            }
        }
    }//GEN-LAST:event_btnDenyActionPerformed

    public void updateBorrowedTable() throws SQLException {
        borrowedTableModel.setRowCount(0);
        rs.beforeFirst(); 
        rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE AVAILABILITY = 'BORROWED'");
        while (rs.next()) {
            String bookAvailability = rs.getString("AVAILABILITY");
            if (bookAvailability.equals("BORROWED")) {
                borrowedTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    rs.getDate("DUEDATE")
                });
            }
        }
        refreshRsStmt("books");
    }

    public void updateBorrowTable() throws SQLException {
        borrowTableModel.setRowCount(0);
        rs.beforeFirst(); 
        rs = stmt.executeQuery("SELECT * FROM BOOKS WHERE AVAILABILITY = 'BORROWING' AND AVAILABILITY = 'BORROWING'");
        while (rs.next()) {
            String bookAvailability = rs.getString("AVAILABILITY");
            if (bookAvailability.equals("BORROWING") || bookAvailability.equals("RETURNING")) {
                borrowTableModel.addRow(new Object[]{
                    rs.getString("BORROWER"),
                    rs.getString("TITLE"),
                    rs.getInt("BOOKID"),
                    bookAvailability
                });
            }
        }
        refreshRsStmt("books");
    }
    
    public long dateDiff(Date duedate, Date currentdate){
        long millDiff = duedate.getTime() - currentdate.getTime();
        long daysDiff = millDiff/(1000 * 60 * 60 * 24);
        return daysDiff;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBorrower;
    private javax.swing.JTable borrowTable;
    private javax.swing.JTable borrowedTable;
    private Button_Gradient.ButtonGradient btnAcceptBorrow;
    private Button_Gradient.ButtonGradient btnDeny;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private radio_button.RadioButtonCustom rbBorrowing;
    private radio_button.RadioButtonCustom rbReturning;
    // End of variables declaration//GEN-END:variables
}
