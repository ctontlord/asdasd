import java.sql.*;
import javax.swing.JOptionPane;

public class EMPLOYEE extends javax.swing.JFrame {
    private static final String DATABASE_URL = "jdbc:sqlite:saved_accounts.db";
   
    public EMPLOYEE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel ELpanelbg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ELdep = new javax.swing.JButton();
        ELviewc = new javax.swing.JButton();
        ELexit = new javax.swing.JButton();
        ELreturn = new javax.swing.JButton();
        ELcreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYEE_TAB_ACCESS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("EMPLOYEE ACCESS");

        ELdep.setText("DEPARMENTS");
        ELdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELdepActionPerformed(evt);
            }
        });

        ELviewc.setText("VIEW CUSTOMERS");
        ELviewc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELviewcActionPerformed(evt);
            }
        });

        ELexit.setText("EXIT");
        ELexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELexitActionPerformed(evt);
            }
        });

        ELreturn.setText("RETURN TO LOGIN");
        ELreturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELreturnActionPerformed(evt);
            }
        });

        ELcreate.setText("CREATE NEW EMPLOYEE ACCOUNT");
        ELcreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELcreateActionPerformed(evt);
            }
        });

        jLabel2.setText("*\"PLEASE contact an admin if you want to update/ change something to your account\"*");

        javax.swing.GroupLayout ELpanelbgLayout = new javax.swing.GroupLayout(ELpanelbg);
        ELpanelbg.setLayout(ELpanelbgLayout);
        ELpanelbgLayout.setHorizontalGroup(
            ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ELpanelbgLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ELpanelbgLayout.createSequentialGroup()
                        .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ELexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ELdep, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ELviewc, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(ELreturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ELpanelbgLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19))))
            .addGroup(ELpanelbgLayout.createSequentialGroup()
                .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ELpanelbgLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(ELcreate))
                    .addGroup(ELpanelbgLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ELpanelbgLayout.setVerticalGroup(
            ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ELpanelbgLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELdep, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELviewc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ELpanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELexit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELreturn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ELcreate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELpanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ELpanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ELcreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELcreateActionPerformed
        // TODO add your handling code here:
        new REGISTER().setVisible(true);
        dispose();
    }//GEN-LAST:event_ELcreateActionPerformed

    private void ELexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ELexitActionPerformed

    private void ELreturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELreturnActionPerformed
        // TODO add your handling code here:
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_ELreturnActionPerformed

    private void ELviewcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELviewcActionPerformed
        // TODO add your handling code here:
         try (Connection conn = DriverManager.getConnection(DATABASE_URL);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS customer_count FROM saved_accounts WHERE account_type = 'CUSTOMER'")) {

        if (rs.next()) {
            int customerCount = rs.getInt("customer_count");
            JOptionPane.showMessageDialog(this, "Number of CUSTOMER accounts: " + customerCount, "Customer Count", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_ELviewcActionPerformed

    private void ELdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELdepActionPerformed
        JOptionPane.showMessageDialog(null," Departments:\n Hardware\nFood\nSecurity\nClothing" , "available departments",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ELdepActionPerformed

  
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ELcreate;
    public javax.swing.JButton ELdep;
    public javax.swing.JButton ELexit;
    public javax.swing.JButton ELreturn;
    public javax.swing.JButton ELviewc;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
