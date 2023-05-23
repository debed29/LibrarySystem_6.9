package libsys;

import java.awt.Window;
import java.sql.Date;
import libsys.AdminBase;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import static libsys.main.currUserID;

public class ReaderBase extends main {

    public ReaderBase() 
    {
        initComponents();
        setGuiBase();
        setPersonalization();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private DefaultTableModel bookTableModel;
    private final String[] DEFAULT_COLUMNS = {"TITLE", "AUTHOR", "GENRE", "DATE", "BOOKID"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        bgCategories = new javax.swing.ButtonGroup();
        btnShowBorrowed = new Button_Gradient.ButtonGradient();
        btnMember = new Button_Gradient.ButtonGradient();
        searchField = new javax.swing.JTextField();
        lblGreetName = new javax.swing.JLabel();
        cbGenre = new javax.swing.JComboBox<>();
        cbAvail = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        cbCending = new javax.swing.JComboBox<>();
        rbAuthor = new radio_button.RadioButtonCustom();
        rbTitle = new radio_button.RadioButtonCustom();
        rbDate = new radio_button.RadioButtonCustom();
        btnSearch = new Button_Gradient.ButtonGradient();
        btnViewBook = new Button_Gradient.ButtonGradient();
        btnLogOut = new Button_Gradient.ButtonGradient();
        btnCreate = new Button_Gradient.ButtonGradient();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnShowBorrowed.setBackground(new java.awt.Color(32, 58, 67));
        btnShowBorrowed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-show-25.png"))); // NOI18N
        btnShowBorrowed.setText("Show Borrowed Book");
        btnShowBorrowed.setColor1(new java.awt.Color(0, 51, 51));
        btnShowBorrowed.setColor2(new java.awt.Color(0, 102, 102));
        btnShowBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowBorrowedActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowBorrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 190, 50));

        btnMember.setBackground(new java.awt.Color(32, 58, 67));
        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-join-25.png"))); // NOI18N
        btnMember.setText("Become a member");
        btnMember.setColor1(new java.awt.Color(0, 51, 51));
        btnMember.setColor2(new java.awt.Color(0, 102, 102));
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        getContentPane().add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 190, 50));
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 850, 40));

        lblGreetName.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        lblGreetName.setForeground(new java.awt.Color(255, 255, 255));
        lblGreetName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGreetName.setText("WELCOME!!!");
        lblGreetName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblGreetName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 279, 40));

        cbGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Genre", " " }));
        getContentPane().add(cbGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 112, 102, 40));

        cbAvail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable / Available", "" }));
        getContentPane().add(cbAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 51, -1, 40));

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        mainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mainTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 850, 360));

        cbCending.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", " " }));
        getContentPane().add(cbCending, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 52, 120, 40));

        rbAuthor.setBackground(new java.awt.Color(255, 51, 51));
        rbAuthor.setForeground(new java.awt.Color(255, 255, 255));
        rbAuthor.setText("Author");
        getContentPane().add(rbAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 80, -1));

        rbTitle.setBackground(new java.awt.Color(255, 51, 51));
        rbTitle.setForeground(new java.awt.Color(255, 255, 255));
        rbTitle.setText("Title");
        getContentPane().add(rbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        rbDate.setBackground(new java.awt.Color(255, 51, 51));
        rbDate.setForeground(new java.awt.Color(255, 255, 255));
        rbDate.setText("Publication Date");
        getContentPane().add(rbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 180, 30));

        btnSearch.setBackground(new java.awt.Color(32, 58, 67));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-search-25.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setColor1(new java.awt.Color(0, 51, 51));
        btnSearch.setColor2(new java.awt.Color(0, 102, 102));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, 40));

        btnViewBook.setBackground(new java.awt.Color(32, 58, 67));
        btnViewBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-view-25.png"))); // NOI18N
        btnViewBook.setText("View");
        btnViewBook.setColor1(new java.awt.Color(0, 51, 51));
        btnViewBook.setColor2(new java.awt.Color(0, 102, 102));
        btnViewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 130, 40));

        btnLogOut.setBackground(new java.awt.Color(32, 58, 67));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Logout Rounded_25px.png"))); // NOI18N
        btnLogOut.setText("Logout");
        btnLogOut.setColor1(new java.awt.Color(0, 51, 51));
        btnLogOut.setColor2(new java.awt.Color(0, 102, 102));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 140, 40));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setText("LOGIN");
        btnCreate.setColor1(new java.awt.Color(0, 51, 51));
        btnCreate.setColor2(new java.awt.Color(0, 102, 102));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 246, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3346778.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1140, 690));

        setSize(new java.awt.Dimension(1158, 691));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void mainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainTableMouseClicked
        int selectedRow = mainTable.getSelectedRow();
        if (selectedRow != -1) {
            Object val = mainTable.getValueAt(selectedRow, 4);
            currBookID = Integer.parseInt(val.toString());
        }
    }//GEN-LAST:event_mainTableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        bookFinder();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookActionPerformed
        BookViewer viewer = new BookViewer();
        if (mainTable.getSelectedRow() != -1)  
            try {
                databaseConnect("accounts");    
                rs = stmt.executeQuery("SELECT USERTYPE FROM ACCOUNTS WHERE USERID=" + currUserID);
                if (rs.next()) {
                    if (rs.getString("USERTYPE").equals("MEMBER")) {
                        sendCloseSignal(viewer);
                        viewer.setVisible(true);
                        BookViewer.hideEdit().setVisible(false);
                    } else if (rs.getString("USERTYPE").equals("LIBRARIAN")) {
                        sendCloseSignal(viewer);
                        viewer.setVisible(true);
                        BookViewer.hideBorrow().setVisible(false);
                    } else if (rs.getString("USERTYPE").equals("GUEST")) {
                        sendCloseSignal(viewer);
                        viewer.setVisible(true);
                        BookViewer.hideBorrow().setVisible(false);
                        BookViewer.hideEdit().setVisible(false);
                    }
                }
                refreshRsStmt("accounts");
            } catch (SQLException err) {
                System.out.println(err.getMessage());
        }
    }//GEN-LAST:event_btnViewBookActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        logOut();
        sendCloseSignal(new BookViewer());
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        try {
            databaseConnect("books");
            List<String> test = new ArrayList();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM BOOKS");
            while (rs.next()) {
                String genreValue = rs.getString("GENRE");
                if (!test.contains(genreValue))
                    test.add(genreValue);
            }

            cbGenre.removeAllItems();
            cbGenre.addItem("All Genres");

            for (String value: test) {
                cbGenre.addItem(value);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        initialSearch();

    }//GEN-LAST:event_formWindowOpened

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        sendDisplaySignal(new MemberSignUp());
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        sendDisplaySignal(new MemberSignUp());
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnShowBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowBorrowedActionPerformed
        String n = "";
        String title;
        try {
            databaseConnect("books");
            rs = stmt.executeQuery("SELECT BORROWER FROM BOOKS WHERE BORROWER=" + currUserID);
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "You are currently not borrowing any book", "Book Details",
                    JOptionPane.INFORMATION_MESSAGE);
            } else{
                rs = stmt.executeQuery("SELECT TITLE, DUEDATE, AVAILABILITY FROM BOOKS WHERE BORROWER=" + currUserID);
                if(rs.next()){
                    title = rs.getString("TITLE");
                    switch(rs.getString("AVAILABILITY")){
                        case "BORROWING":
                        n = "\nYou have sent a request to the Librarian to borrow a book.";
                        break;
                        case "RETURNING":
                        n = "\nYou have decided to return the book. Please wait for the Librarian to acknowledge your request.";
                        break;
                        case "BORROWED":
                        n = "\nYou can now borrow the book.";
                        break;
                    }

                    Date localNow = Date.valueOf(LocalDate.now());
                    Date bookDue = rs.getDate("DUEDATE");
                    boolean isOverDue = isOverDue(bookDue, localNow);
                    if(!isOverDue){
                        JOptionPane.showMessageDialog(null, "You are currently borrowing: " + title + "\nThe book is due: " + rs.getDate("DUEDATE") + n, "Book Details",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else{
                        JOptionPane.showMessageDialog(null, "You are currently borrowing: " + title + "\nThe book is due: " + rs.getDate("DUEDATE") +"\nYour book is overdue.", "Book Details",
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        } catch (NullPointerException err){
            try {
                JOptionPane.showMessageDialog(null, "You are currently attempting to borrow: " + rs.getString("TITLE") + n, "Book Details",
                    JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnShowBorrowedActionPerformed

    public void allAddBook(String[] bookData) throws Exception 
    {
        if (bookTableModel == null) 
        {
            bookTableModel = new DefaultTableModel(DEFAULT_COLUMNS, 0);
            mainTable.setModel(bookTableModel);
        }

        String selectedGenre = (String) cbGenre.getSelectedItem();
        if (!selectedGenre.equals("All Genres") && !selectedGenre.equals(bookData[2])) 
            return;
        
        Vector<String> reorderedData = new Vector<>();
        for (String column : DEFAULT_COLUMNS) {
            switch (column) {
                case "TITLE":
                    reorderedData.add(bookData[0]);
                    break;
                case "AUTHOR":
                    reorderedData.add(bookData[1]);
                    break;
                case "GENRE":
                    reorderedData.add(bookData[2]);
                    break;
                case "DATE":
                    reorderedData.add(bookData[3]);
                    break;
                case "BOOKID":
                    reorderedData.add(bookData[4]);
                    break;
            }
        }
        bookTableModel.addRow(reorderedData);
    }
    
    public void allClear() 
    {
        bookTableModel.setRowCount(0);
    }
    
    public void allSetModel() 
    {
        String[] columnNames = {"Title", "Author", "Genre", "Date", "BookID"};
        bookTableModel = new DefaultTableModel(columnNames, 0);
        bookTableModel.setColumnIdentifiers(DEFAULT_COLUMNS);
        mainTable.setModel(bookTableModel);
    }

    public void bookFinder() {
        try {
            databaseConnect("books");
            allSetModel();
            allClear();
            sortBy(decideCat(), decideAvail());
            refreshRsStmt("books");
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   public String decideCat() 
    {
        if (rbTitle.isSelected()) 
            return "TITLE";
        if (rbAuthor.isSelected()) 
            return "AUTHOR";
        if (rbDate.isSelected()) 
            return "DATE";
        return "ERROR";
    }

    public String decideAvail() 
    {
        String item = (String) cbAvail.getSelectedItem();;
        return item;
    }
    
    public void initialSearch() 
    {
        rbTitle.setSelected(true);
        cbAvail.setSelectedIndex(0);
        cbGenre.setSelectedIndex(0);
        try {
            databaseConnect("books");
            allSetModel();
            allClear();
            sortBy(decideCat(), decideAvail());
            refreshRsStmt("books");
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void queryNull(String category) throws SQLException 
    {
        String query = "SELECT * FROM BOOKS";
        PreparedStatement stmt = con.prepareStatement(query);
        rs = stmt.executeQuery();
    }

    public void queryNullAvail(String category) throws SQLException 
    {
        String selectedAvail = (String) cbAvail.getSelectedItem();
        String query = "SELECT * FROM BOOKS WHERE AVAILABILITY ='" + selectedAvail.toUpperCase() + "'";
        PreparedStatement stmt = con.prepareStatement(query);
        rs = stmt.executeQuery();
    }

    public void queryTermAll(String category) throws SQLException 
    {
        String query = "SELECT * FROM BOOKS WHERE " + category + " IS NOT NULL";
        PreparedStatement stmt = con.prepareStatement(query);
        rs = stmt.executeQuery();
    }

    public void queryTermAvail(String category) throws SQLException 
    {
        String selectedAvail = (String) cbAvail.getSelectedItem();
        String query = "SELECT * FROM BOOKS WHERE AVAILABILITY = ? AND " + category + " IS NOT NULL"; // why?
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, selectedAvail.toUpperCase());
        rs = stmt.executeQuery();
    }

    public void setGuiBase() 
    {          
        cbAvail.removeAllItems();
        cbAvail.addItem("Unavailable/Available");
        cbAvail.addItem("Available");
        cbAvail.addItem("Unavailable");
        
        cbCending.removeAllItems();
        cbCending.addItem("Ascending");
        cbCending.addItem("Descending");

        bgCategories.add(rbTitle);
        bgCategories.add(rbAuthor);
        bgCategories.add(rbDate);
        
        mainTable.setDefaultEditor(Object.class, null);
    }
    
    public void setPersonalization() 
    {
        ReaderBase.currFullName = currFullName;
        lblGreetName.setText("Welcome, " + currFullName + ".");
    }

    public void sortBy(String category, String avail) 
    {
        try 
        {
            List<String[]> tempData1 = new ArrayList<>();

            if (searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 0)) 
                queryNull(category);
            else if (searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 1 || cbAvail.getSelectedIndex() == 2)) 
                queryNullAvail(category);
            else if (!searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 0)) 
                queryTermAll(category);
            else if (!searchField.getText().isEmpty() && (cbAvail.getSelectedIndex() == 1 || cbAvail.getSelectedIndex() == 2)) 
                queryTermAvail(category);

            if (bookTableModel != null) 
                bookTableModel.setRowCount(0);

            while (rs.next()) 
            {
                String[] bookData = null;
                for (String column : DEFAULT_COLUMNS)
                {
                    if (category.equals(column)) 
                    {
                        bookData = new String[]{
                            rs.getString("TITLE"),
                            rs.getString("AUTHOR"),
                            rs.getString("GENRE"),
                            rs.getString("DATE"),
                            rs.getString("BOOKID")
                        };
                        break;
                    } 
                }
                if (bookData != null) {
                    tempData1.add(bookData);
                }
            }

            int sortColumn = Arrays.asList(DEFAULT_COLUMNS).indexOf(category);

            if (!searchField.getText().isEmpty()) {
                String searchTerm = searchField.getText().toLowerCase();
                List<String[]> tempData2 = new ArrayList<>();
                for (String[] data : tempData1) {
                    if (data[sortColumn].toLowerCase().startsWith(searchTerm)) {
                        tempData2.add(data);
                    }
                }

                if (cbCending.getSelectedIndex() == 0) {
                    sortAscending(tempData2, sortColumn);
                } else {
                    sortDescending(tempData2, sortColumn);
                }

                for (String[] bookData : tempData2) {
                    allAddBook(bookData);
                }
            } else {
                if (cbCending.getSelectedIndex() == 0) {
                    sortAscending(tempData1, sortColumn);
                } else {
                    sortDescending(tempData1, sortColumn);
                }

                for (String[] bookData : tempData1) {
                    allAddBook(bookData);
                }
            }
            refreshRsStmt("books");
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ReaderBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sortAscending(List<String[]> data, int sortColumn) {     
        Collections.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[sortColumn].compareToIgnoreCase(o2[sortColumn]);
            }
        });
    }

    public void sortDescending(List<String[]> data, int sortColumn) {     
        Collections.sort(data, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o2[sortColumn].compareToIgnoreCase(o1[sortColumn]);
            }
        });
    }

    public static List<JFrame> getOpenJFrames() {
        List<JFrame> openJFrames = new ArrayList<>();

        for (Window window : Window.getWindows()) {
            if (window instanceof JFrame) {
                JFrame frame = (JFrame) window;
                if (frame.isVisible()) {
                    openJFrames.add(frame);
                }
            }
        }

        return openJFrames;
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCategories;
    private Button_Gradient.ButtonGradient btnCreate;
    public Button_Gradient.ButtonGradient btnLogOut;
    public Button_Gradient.ButtonGradient btnMember;
    private Button_Gradient.ButtonGradient btnSearch;
    public Button_Gradient.ButtonGradient btnShowBorrowed;
    private Button_Gradient.ButtonGradient btnViewBook;
    private javax.swing.JComboBox<String> cbAvail;
    private javax.swing.JComboBox<String> cbCending;
    private javax.swing.JComboBox<String> cbGenre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblGreetName;
    private javax.swing.JTable mainTable;
    private radio_button.RadioButtonCustom rbAuthor;
    private radio_button.RadioButtonCustom rbDate;
    private radio_button.RadioButtonCustom rbTitle;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
