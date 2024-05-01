import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author XXIV
 */
public class REGISTER extends javax.swing.JFrame {
    // Connection string for SQLite database
    private static final String DATABASE_URL = "jdbc:sqlite:saved_accounts.db";
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS saved_accounts (" +
                                                     "name TEXT," +
                                                     "username TEXT PRIMARY KEY," +
                                                     "password TEXT," +
                                                     "email TEXT," +
                                                     "account_type TEXT)";
   
    public REGISTER() {
        initComponents();
       // Register the JDBC driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "SQLite JDBC driver not found!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Create the table if it doesn't exist
        try (Connection conn = DriverManager.getConnection(DATABASE_URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(CREATE_TABLE_SQL);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to create table: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }  
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel userreglbl = new javax.swing.JLabel();
        javax.swing.JLabel namelbl = new javax.swing.JLabel();
        javax.swing.JLabel URunamelbl = new javax.swing.JLabel();
        javax.swing.JLabel URpwordlbl = new javax.swing.JLabel();
        URname = new javax.swing.JTextField();
        URuname = new javax.swing.JTextField();
        URpword = new javax.swing.JPasswordField();
        URshowpass = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        URacctype = new javax.swing.JList<>();
        javax.swing.JLabel URacctypelbl = new javax.swing.JLabel();
        URcreateAcc = new javax.swing.JButton();
        URproceed = new javax.swing.JButton();
        URexit = new javax.swing.JButton();
        javax.swing.JLabel URemaillbl = new javax.swing.JLabel();
        URemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTER_AN_ACCOUNT");

        userreglbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userreglbl.setText("USER REGISTRATION");

        namelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        namelbl.setText("Name:");

        URunamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        URunamelbl.setText("Username:");

        URpwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        URpwordlbl.setText("Password:");

        URshowpass.setText("Reveal Password");
        URshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URshowpassActionPerformed(evt);
            }
        });

        URacctype.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "EMPLOYEE", "CUSTOMER", "ADMIN" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(URacctype);

        URacctypelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        URacctypelbl.setText("ACCOUNT TYPE:");

        URcreateAcc.setText("CREATE ACCOUNT");
        URcreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URcreateAccActionPerformed(evt);
            }
        });

        URproceed.setText("Proceed to LOGIN");
        URproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URproceedActionPerformed(evt);
            }
        });

        URexit.setText("Cancel/Exit");
        URexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URexitActionPerformed(evt);
            }
        });

        URemaillbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        URemaillbl.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(userreglbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(URshowpass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(URacctypelbl)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(URunamelbl)
                                    .addComponent(namelbl)
                                    .addComponent(URemaillbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(URname)
                                    .addComponent(URuname, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(URemail))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(URpwordlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(URpword)))))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(URcreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(URproceed))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(URexit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userreglbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namelbl))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(URemaillbl)
                    .addComponent(URemail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(URunamelbl)
                    .addComponent(URuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(URpwordlbl)
                    .addComponent(URpword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(URshowpass)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(URacctypelbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(URcreateAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(URproceed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(URexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void URshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URshowpassActionPerformed
        // TODO add your handling code here:
        if (URshowpass.isSelected()){
            URpword.setEchoChar((char)0);
        } else
            // for hiding the password 
           URpword.setEchoChar('*');
    }//GEN-LAST:event_URshowpassActionPerformed

    private void URexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_URexitActionPerformed

    private void URproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URproceedActionPerformed
        int userhaveaccount = JOptionPane.showConfirmDialog(this, "Do you already have an account?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(userhaveaccount == JOptionPane.YES_OPTION){
        int finalconfirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to proceed?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(finalconfirmation == JOptionPane.YES_OPTION){
              new LoginFrame().setVisible(true);
                dispose();    
        }
        } else {
            JOptionPane.showMessageDialog(null, "please proceed to creating atleast one account.", "Create one first!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_URproceedActionPerformed
    
    private void URcreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URcreateAccActionPerformed
        String Uname = URname.getText();
        String Uusername = URuname.getText();
        String Upassword = new String(URpword.getPassword());
        String Uemail = URemail.getText();
        String Uacctype = URacctype.getSelectedValue();

        int confirm = JOptionPane.showConfirmDialog(this,
            "Are the inputted credentials correct?\nName: " + Uname + "\nUsername: " + Uusername +
                    "\nPassword: (cannot be shown here)\nAccount type: " + Uacctype,
            "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Insert user account into the database
            try (Connection conn = DriverManager.getConnection(DATABASE_URL);
                 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO saved_accounts (name, username, password, email, account_type) VALUES (?, ?, ?, ?, ?)")) {
                pstmt.setString(1, Uname); // Set the name
                pstmt.setString(2, Uusername);
                pstmt.setString(3, Upassword);
                pstmt.setString(4, Uemail);
                pstmt.setString(5, Uacctype);
                pstmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Account created successfully!", "Congrats!", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Failed to create account: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Account creation cancelled.", "Cancelled", JOptionPane.INFORMATION_MESSAGE);
        }
                                               
    }//GEN-LAST:event_URcreateAccActionPerformed
    
  
    

 
    public static void main(String args[]) {
       
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList<String> URacctype;
    private javax.swing.JButton URcreateAcc;
    public javax.swing.JTextField URemail;
    private javax.swing.JButton URexit;
    public javax.swing.JTextField URname;
    private javax.swing.JButton URproceed;
    public javax.swing.JPasswordField URpword;
    private javax.swing.JCheckBox URshowpass;
    public javax.swing.JTextField URuname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}