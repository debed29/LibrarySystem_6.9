package libsys;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import javax.swing.JTable;

public class BookLocationMan extends main {
    DefaultTableModel Table1=new DefaultTableModel();
    DefaultTableModel Table2=new DefaultTableModel();
    int shelfcount,ShelfNum1,ShelfNum2;
    
    public BookLocationMan() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransparent3 = new test_transparent_panel.PanelTransparent();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        btnUp1 = new Button_Gradient.ButtonGradient();
        btnDown1 = new Button_Gradient.ButtonGradient();
        btnNewShelf = new javax.swing.JButton();
        btnEmptyShelf = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ShowTable2 = new javax.swing.JTable();
        btnMove = new Button_Gradient.ButtonGradient();
        btnUp2 = new Button_Gradient.ButtonGradient();
        btnDown2 = new Button_Gradient.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        ComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTransparent3.setMinimumSize(new java.awt.Dimension(1280, 710));
        panelTransparent3.setPreferredSize(new java.awt.Dimension(1280, 710));
        panelTransparent3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BOOK LOCATION MANAGER");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        panelTransparent3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 90));

        ShowTable1.setModel(Table1);
        ShowTable1.setDragEnabled(true);
        ShowTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShowTable1);

        panelTransparent3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 400, 500));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Shelf Number Selector");
        panelTransparent3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 160, 30));

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNSORTED" }));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });
        panelTransparent3.add(ComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 122, 40));

        btnUp1.setBackground(new java.awt.Color(0, 0, 0));
        btnUp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-up-20.png"))); // NOI18N
        btnUp1.setText("UP");
        btnUp1.setColor1(new java.awt.Color(0, 51, 51));
        btnUp1.setColor2(new java.awt.Color(0, 102, 102));
        btnUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp1ActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 391, 120, 40));

        btnDown1.setBackground(new java.awt.Color(0, 0, 0));
        btnDown1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-down-20.png"))); // NOI18N
        btnDown1.setText("DOWN");
        btnDown1.setColor1(new java.awt.Color(0, 51, 51));
        btnDown1.setColor2(new java.awt.Color(0, 102, 102));
        btnDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown1ActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnDown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 120, -1));

        btnNewShelf.setText("Create new shelf");
        btnNewShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewShelfActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnNewShelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, 40));

        btnEmptyShelf.setText("Empty shelf");
        btnEmptyShelf.setEnabled(false);
        btnEmptyShelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyShelfActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnEmptyShelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 115, 40));

        ShowTable2.setModel(Table2);
        ShowTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ShowTable2);

        panelTransparent3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 400, 500));

        btnMove.setBackground(new java.awt.Color(0, 0, 0));
        btnMove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-move-20.png"))); // NOI18N
        btnMove.setText("MOVE");
        btnMove.setColor1(new java.awt.Color(0, 51, 51));
        btnMove.setColor2(new java.awt.Color(0, 102, 102));
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 100, 60));

        btnUp2.setBackground(new java.awt.Color(0, 0, 0));
        btnUp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-up-20.png"))); // NOI18N
        btnUp2.setText("UP");
        btnUp2.setColor1(new java.awt.Color(0, 51, 51));
        btnUp2.setColor2(new java.awt.Color(0, 102, 102));
        btnUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUp2ActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnUp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 405, 130, 40));

        btnDown2.setBackground(new java.awt.Color(0, 0, 0));
        btnDown2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-down-20.png"))); // NOI18N
        btnDown2.setText("DOWN");
        btnDown2.setColor1(new java.awt.Color(0, 51, 51));
        btnDown2.setColor2(new java.awt.Color(0, 102, 102));
        btnDown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDown2ActionPerformed(evt);
            }
        });
        panelTransparent3.add(btnDown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 465, 130, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shelf Number Selector");
        panelTransparent3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 150, 40));

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNSORTED" }));
        ComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox2ActionPerformed(evt);
            }
        });
        panelTransparent3.add(ComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 122, 40));

        getContentPane().add(panelTransparent3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 1330, 850));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2144483.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 990));

        setSize(new java.awt.Dimension(1474, 1030));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        databaseConnect("books");
        CountShelves();
        RenderComboButtons(shelfcount);
        RenderTable(Table1,0);
        RenderTable(Table2,0);
    }//GEN-LAST:event_formWindowOpened

    private void btnDown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown2ActionPerformed
        // TODO add your handling code here:
        MoveRow(ShowTable2,-1);
    }//GEN-LAST:event_btnDown2ActionPerformed

    private void btnDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDown1ActionPerformed
        // TODO add your handling code here:
        MoveRow(ShowTable1,-1);
    }//GEN-LAST:event_btnDown1ActionPerformed

    private void btnUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp1ActionPerformed
        // TODO add your handling code here:
        MoveRow(ShowTable1,1);
    }//GEN-LAST:event_btnUp1ActionPerformed

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox1ActionPerformed
        ShelfNum1=ComboBox1.getSelectedIndex();
        RenderTable(Table1,ShelfNum1);
    }//GEN-LAST:event_ComboBox1ActionPerformed

    private void ShowTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTable1MouseClicked
        ShowTable2.clearSelection();
        btnEmptyShelf.setEnabled(true);
    }//GEN-LAST:event_ShowTable1MouseClicked

    private void ShowTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTable2MouseClicked
        ShowTable1.clearSelection();
        btnEmptyShelf.setEnabled(true);
    }//GEN-LAST:event_ShowTable2MouseClicked

    private void ComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox2ActionPerformed
        ShelfNum2=ComboBox2.getSelectedIndex();
        RenderTable(Table2,ShelfNum2);
    }//GEN-LAST:event_ComboBox2ActionPerformed

    private void btnNewShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewShelfActionPerformed
        System.out.println(shelfcount);
        for(int x=1;x<=shelfcount;x++){
            ComboBox1.removeItemAt(1);
            ComboBox2.removeItemAt(1);
        }
        shelfcount=shelfcount+1;
        RenderComboButtons(shelfcount);
    }//GEN-LAST:event_btnNewShelfActionPerformed

    private void btnEmptyShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyShelfActionPerformed
        if(ShowTable1.getSelectedRow()!=-1){
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum1+"%'");
                while(rs.next()){
                    rs.updateString("LOCATION","UNSORTED");
                    rs.updateRow();
                }
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
        else{
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum2+"%'");
                while(rs.next()){
                    rs.updateString("LOCATION","UNSORTED");
                    rs.updateRow();
                }
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }//GEN-LAST:event_btnEmptyShelfActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        if(ShowTable1.getSelectedRow()!=-1){
            Object val=ShowTable1.getValueAt(ShowTable1.getSelectedRow(), 1);
            int selectedbookID=Integer.parseInt(val.toString());
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+val);
                rs.next();
                rs.updateString("LOCATION","S"+ShelfNum2+"R1");
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
        else{
            Object val=ShowTable2.getValueAt(ShowTable2.getSelectedRow(), 1);
            int selectedbookID=Integer.parseInt(val.toString());
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+val);
                rs.next();
                rs.updateString("LOCATION","S"+ShelfNum1+"R1");
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUp2ActionPerformed
        // TODO add your handling code here:
        MoveRow(ShowTable2,1);
    }//GEN-LAST:event_btnUp2ActionPerformed

    private void RenderTable(DefaultTableModel Table, int ShelfNum){
        String[] GivenColumns={"Title","Book ID","Location"};
        Table.setColumnIdentifiers(GivenColumns);
        Table.setRowCount(0);
        
        if(ShelfNum!=0){
        try{
            rs=stmt.executeQuery("SELECT TITLE, BOOKID, LOCATION FROM BOOKS WHERE LOCATION LIKE '%S"+ShelfNum+"%' ORDER BY LOCATION");
            while(rs.next()){
            Table.addRow(new Object[]{
                rs.getString("TITLE"),
                rs.getString("BOOKID"),
                rs.getString("LOCATION")
            });
            }
                refreshRsStmt("books");
                rs.close();
            }catch(SQLException err){
                System.out.print(err);
            }
        }
        else{
            try{
                rs=stmt.executeQuery("SELECT TITLE, BOOKID, LOCATION FROM BOOKS WHERE LOCATION LIKE 'UNSORTED' ORDER BY LOCATION");
                while(rs.next()){
                Table.addRow(new Object[]{
                    rs.getString("TITLE"),
                    rs.getString("BOOKID"),
                    rs.getString("LOCATION")
                    });
                }
                refreshRsStmt("books");
                rs.close();
                }catch(SQLException err){
                    System.out.print(err);
                }   
        }
    }
    
    private void CountShelves(){
        try{
            rs=stmt.executeQuery("SELECT MAX(LOCATION) AS TEMP FROM BOOKS WHERE LOCATION LIKE 'S%'");
            rs.next();
            String temp=rs.getString("TEMP");
            shelfcount=Integer.parseInt(temp.substring(1,2));
        }catch(SQLException err){
            System.out.println(err);
        }
        
    }
    
    private void RenderComboButtons(int y){
        for(int x=1;x<=y;x++){
            ComboBox1.addItem("Shelf "+x);
            ComboBox2.addItem("Shelf "+x);
        }
    }
    
    private void MoveRow(JTable Table,int MoveVal){
        Object val=Table.getValueAt(Table.getSelectedRow(),1);
        String BookID=val.toString();
        
        Object LocationVal=Table.getValueAt(Table.getSelectedRow(),2);
        String LocationCode=LocationVal.toString();
        System.out.println(LocationCode.charAt(1));
        int temp=Integer.parseInt(LocationCode.substring(3,4));
        
        if((temp==1&&MoveVal==-1)||(temp==9&&MoveVal==1)){
           JOptionPane.showMessageDialog(null,"Shelf Rows only go from a value of 1 to 9.");
        }
        else{
            temp=temp+MoveVal;
            String newLocationCode="S"+LocationCode.charAt(1)+"R"+String.valueOf(temp);
            System.out.println(newLocationCode);
            
            try{
                rs=stmt.executeQuery("SELECT LOCATION FROM BOOKS WHERE BOOKID = "+BookID);
                rs.next();
                rs.updateString("LOCATION",newLocationCode);
                rs.updateRow();
                refreshRsStmt("books");
                RenderTable(Table1,ShelfNum1);
                RenderTable(Table2,ShelfNum2);
            }catch(SQLException err){
                System.out.println(err);
            }
        }
    }
            
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
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookLocationMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookLocationMan().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JTable ShowTable1;
    private javax.swing.JTable ShowTable2;
    private Button_Gradient.ButtonGradient btnDown1;
    private Button_Gradient.ButtonGradient btnDown2;
    private javax.swing.JButton btnEmptyShelf;
    private Button_Gradient.ButtonGradient btnMove;
    private javax.swing.JButton btnNewShelf;
    private Button_Gradient.ButtonGradient btnUp1;
    private Button_Gradient.ButtonGradient btnUp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private test_transparent_panel.PanelTransparent panelTransparent3;
    // End of variables declaration//GEN-END:variables
}
