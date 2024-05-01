import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ADMINFRAME extends javax.swing.JFrame {
    
     private static final String DATABASE_URL = "jdbc:sqlite:saved_accounts.db";

    public ADMINFRAME() {
        initComponents();
        displayAccounts();
    }

     private void displayAccounts() {
     try (Connection conn = DriverManager.getConnection(DATABASE_URL);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT name, email, username, password, account_type FROM saved_accounts")) {

        DefaultTableModel model = (DefaultTableModel) ADMtableaccs.getModel();
        model.setRowCount(0); // Clear the table

        while (rs.next()) {
            String name = rs.getString("name");
            String email = rs.getString("email");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String accountType = rs.getString("account_type");
            model.addRow(new Object[]{name, email, username, password, accountType}); // Add all columns
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel ADMbgpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ADMtableaccs = new javax.swing.JTable();
        ADMexit = new javax.swing.JButton();
        ADMcreate = new javax.swing.JButton();
        ADMdelacc = new javax.swing.JButton();
        ADMreturn = new javax.swing.JButton();
        ADMupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN_TAB");
        setFocusable(false);
        setResizable(false);

        ADMtableaccs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Username", "Password", "Account Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ADMtableaccs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ADMtableaccs);
        if (ADMtableaccs.getColumnModel().getColumnCount() > 0) {
            ADMtableaccs.getColumnModel().getColumn(0).setResizable(false);
            ADMtableaccs.getColumnModel().getColumn(1).setResizable(false);
            ADMtableaccs.getColumnModel().getColumn(2).setResizable(false);
            ADMtableaccs.getColumnModel().getColumn(3).setResizable(false);
            ADMtableaccs.getColumnModel().getColumn(4).setResizable(false);
        }

        ADMexit.setText("EXIT");
        ADMexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMexitActionPerformed(evt);
            }
        });

        ADMcreate.setText("CREATE/ADD ACCOUNT");
        ADMcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMcreateActionPerformed(evt);
            }
        });

        ADMdelacc.setText("DELETE ACCOUNT");
        ADMdelacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMdelaccActionPerformed(evt);
            }
        });

        ADMreturn.setText("Return to Login");
        ADMreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMreturnActionPerformed(evt);
            }
        });

        ADMupdate.setText("UPDATE");
        ADMupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMbgpanelLayout = new javax.swing.GroupLayout(ADMbgpanel);
        ADMbgpanel.setLayout(ADMbgpanelLayout);
        ADMbgpanelLayout.setHorizontalGroup(
            ADMbgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(ADMbgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADMexit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ADMreturn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(ADMupdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ADMcreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADMdelacc)
                .addContainerGap())
        );
        ADMbgpanelLayout.setVerticalGroup(
            ADMbgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMbgpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ADMbgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADMexit)
                    .addComponent(ADMcreate)
                    .addComponent(ADMdelacc)
                    .addComponent(ADMreturn)
                    .addComponent(ADMupdate))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMbgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ADMbgpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADMcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMcreateActionPerformed
        // TODO add your handling code here:
         new REGISTER().setVisible(true);
    }//GEN-LAST:event_ADMcreateActionPerformed

    private void ADMdelaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMdelaccActionPerformed
        // TODO add your handling code here:
        int selectedRow = ADMtableaccs.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select an account to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String username = (String) ADMtableaccs.getValueAt(selectedRow, 2);
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this account?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = DriverManager.getConnection(DATABASE_URL);
                 PreparedStatement pstmt = conn.prepareStatement("DELETE FROM saved_accounts WHERE username = ?")) {
                pstmt.setString(1, username);
                int affectedRows = pstmt.executeUpdate();
                if (affectedRows > 0) {
                    JOptionPane.showMessageDialog(this, "Account deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    displayAccounts(); // Refresh the table after deletion
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ADMdelaccActionPerformed

    private void ADMexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ADMexitActionPerformed

    private void ADMreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMreturnActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
                dispose();
    }//GEN-LAST:event_ADMreturnActionPerformed

    private void ADMupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMupdateActionPerformed
        // TODO add your handling code here:
         int selectedRow = ADMtableaccs.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select an account to update.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Get the data from the selected row
    String name = (String) ADMtableaccs.getValueAt(selectedRow, 0);
    String email = (String) ADMtableaccs.getValueAt(selectedRow, 1);
    String username = (String) ADMtableaccs.getValueAt(selectedRow, 2);
    String password = (String) ADMtableaccs.getValueAt(selectedRow, 3);
    String accountType = (String) ADMtableaccs.getValueAt(selectedRow, 4);

    // Prompt user for updated information
    String newName = JOptionPane.showInputDialog(this, "Enter new name:", name);
    String newEmail = JOptionPane.showInputDialog(this, "Enter new email:", email);
    String newUsername = JOptionPane.showInputDialog(this, "Enter a new username:", username);
    String newPassword = JOptionPane.showInputDialog(this, "Enter a new password:", password);
    String newAccountType = JOptionPane.showInputDialog(this, "Enter new account type(ADMIN,EMPLOYEE,CUSTOMER):", accountType);

    int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to update this account?",
            "Confirm Update", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try (Connection conn = DriverManager.getConnection(DATABASE_URL);
             PreparedStatement pstmt = conn.prepareStatement("UPDATE saved_accounts SET name=?, email=?, username=?, password=?, account_type=? WHERE username=?")) {
            pstmt.setString(1, newName);
            pstmt.setString(2, newEmail);
            pstmt.setString(3, newUsername);
            pstmt.setString(4, newPassword);
            pstmt.setString(5, newAccountType);
            pstmt.setString(6, username); // Where clause: username of the account to update
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Account updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                displayAccounts(); // Refresh the table after update
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_ADMupdateActionPerformed

  
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADMcreate;
    private javax.swing.JButton ADMdelacc;
    private javax.swing.JButton ADMexit;
    private javax.swing.JButton ADMreturn;
    public javax.swing.JTable ADMtableaccs;
    private javax.swing.JButton ADMupdate;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
