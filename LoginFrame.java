import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author XXIV
 */
   public class LoginFrame extends javax.swing.JFrame {
    private static final String DATABASE_URL = "jdbc:sqlite:saved_accounts.db";

    public LoginFrame() {
        initComponents();
         
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel panelbglogin = new javax.swing.JPanel();
        Logintab = new javax.swing.JTabbedPane();
        ADMINLOGIn = new javax.swing.JPanel();
        javax.swing.JLabel ADMlabel = new javax.swing.JLabel();
        javax.swing.JLabel unamelabelA = new javax.swing.JLabel();
        javax.swing.JLabel pwordlabelA = new javax.swing.JLabel();
        ADMuname = new javax.swing.JTextField();
        ADMpword = new javax.swing.JPasswordField();
        ADMshowpass = new javax.swing.JCheckBox();
        ADMlogin = new javax.swing.JButton();
        EMPLOYEELOGIn = new javax.swing.JPanel();
        javax.swing.JLabel ELlbl = new javax.swing.JLabel();
        javax.swing.JLabel ELunameblb = new javax.swing.JLabel();
        javax.swing.JLabel ELpwordlbl = new javax.swing.JLabel();
        ELuname = new javax.swing.JTextField();
        ELlogin = new javax.swing.JButton();
        ELpword = new javax.swing.JPasswordField();
        ELshowpass = new javax.swing.JCheckBox();
        CUSTOMERLOGIn = new javax.swing.JPanel();
        javax.swing.JLabel CLlabel = new javax.swing.JLabel();
        javax.swing.JLabel CLunamelbl = new javax.swing.JLabel();
        javax.swing.JLabel CLpwordlbl = new javax.swing.JLabel();
        CLpword = new javax.swing.JPasswordField();
        CLuname = new javax.swing.JTextField();
        CLlogin = new javax.swing.JButton();
        CLshowpass = new javax.swing.JCheckBox();
        REGISTER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN_");
        setResizable(false);

        panelbglogin.setForeground(new java.awt.Color(255, 255, 255));

        ADMINLOGIn.setForeground(new java.awt.Color(255, 255, 255));

        ADMlabel.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        ADMlabel.setText("ADMIN LOGIN");

        unamelabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unamelabelA.setText("username:");

        pwordlabelA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pwordlabelA.setText("password:");

        ADMshowpass.setText("Show Password");
        ADMshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMshowpassActionPerformed(evt);
            }
        });

        ADMlogin.setText("LOGIN");
        ADMlogin.setFocusable(false);
        ADMlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ADMINLOGInLayout = new javax.swing.GroupLayout(ADMINLOGIn);
        ADMINLOGIn.setLayout(ADMINLOGInLayout);
        ADMINLOGInLayout.setHorizontalGroup(
            ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINLOGInLayout.createSequentialGroup()
                .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ADMINLOGInLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(ADMlabel))
                    .addGroup(ADMINLOGInLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ADMshowpass)
                            .addGroup(ADMINLOGInLayout.createSequentialGroup()
                                .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pwordlabelA)
                                    .addComponent(unamelabelA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ADMuname)
                                    .addComponent(ADMpword, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))))
                    .addGroup(ADMINLOGInLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(ADMlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        ADMINLOGInLayout.setVerticalGroup(
            ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ADMINLOGInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ADMlabel)
                .addGap(37, 37, 37)
                .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamelabelA)
                    .addComponent(ADMuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ADMINLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwordlabelA)
                    .addComponent(ADMpword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ADMshowpass)
                .addGap(40, 40, 40)
                .addComponent(ADMlogin)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        Logintab.addTab("ADMIN", ADMINLOGIn);

        ELlbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        ELlbl.setText("EMPLOYEE LOGIN");

        ELunameblb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ELunameblb.setText("username:");

        ELpwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ELpwordlbl.setText("password:");

        ELlogin.setText("LOGIN");
        ELlogin.setFocusable(false);
        ELlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELloginActionPerformed(evt);
            }
        });

        ELshowpass.setText("Show Password");
        ELshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELshowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EMPLOYEELOGInLayout = new javax.swing.GroupLayout(EMPLOYEELOGIn);
        EMPLOYEELOGIn.setLayout(EMPLOYEELOGInLayout);
        EMPLOYEELOGInLayout.setHorizontalGroup(
            EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EMPLOYEELOGInLayout.createSequentialGroup()
                .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EMPLOYEELOGInLayout.createSequentialGroup()
                        .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EMPLOYEELOGInLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(ELpwordlbl))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EMPLOYEELOGInLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ELunameblb)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ELpword, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ELlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ELuname))
                            .addComponent(ELshowpass)))
                    .addGroup(EMPLOYEELOGInLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(ELlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        EMPLOYEELOGInLayout.setVerticalGroup(
            EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EMPLOYEELOGInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ELlbl)
                .addGap(36, 36, 36)
                .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ELunameblb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EMPLOYEELOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELpwordlbl)
                    .addComponent(ELpword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ELshowpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(ELlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        Logintab.addTab("EMPLOYEE", EMPLOYEELOGIn);

        CLlabel.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        CLlabel.setText("CUSTOMER LOGIN");

        CLunamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CLunamelbl.setText("username:");

        CLpwordlbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CLpwordlbl.setText("password:");

        CLlogin.setText("LOGIN");
        CLlogin.setFocusable(false);
        CLlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLloginActionPerformed(evt);
            }
        });

        CLshowpass.setText("Show Password");
        CLshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLshowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CUSTOMERLOGInLayout = new javax.swing.GroupLayout(CUSTOMERLOGIn);
        CUSTOMERLOGIn.setLayout(CUSTOMERLOGInLayout);
        CUSTOMERLOGInLayout.setHorizontalGroup(
            CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CUSTOMERLOGInLayout.createSequentialGroup()
                .addGroup(CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CUSTOMERLOGInLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(CLlabel))
                    .addGroup(CUSTOMERLOGInLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CLunamelbl)
                            .addComponent(CLpwordlbl))
                        .addGap(18, 18, 18)
                        .addGroup(CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CLshowpass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CLpword, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CLuname, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CUSTOMERLOGInLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(CLlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        CUSTOMERLOGInLayout.setVerticalGroup(
            CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CUSTOMERLOGInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CLlabel)
                .addGap(32, 32, 32)
                .addGroup(CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CLuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLunamelbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CUSTOMERLOGInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CLpwordlbl)
                    .addComponent(CLpword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLshowpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(CLlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        Logintab.addTab("CUSTOMER", CUSTOMERLOGIn);

        REGISTER.setText("RETURN TO CREATE ACCOUNT");
        REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTERActionPerformed(evt);
            }
        });
        Logintab.addTab("RETURN", REGISTER);

        javax.swing.GroupLayout panelbgloginLayout = new javax.swing.GroupLayout(panelbglogin);
        panelbglogin.setLayout(panelbgloginLayout);
        panelbgloginLayout.setHorizontalGroup(
            panelbgloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logintab)
        );
        panelbgloginLayout.setVerticalGroup(
            panelbgloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logintab)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbglogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbglogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ELshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELshowpassActionPerformed
        // TODO add your handling code here:
        if (ELshowpass.isSelected()){
            ELpword.setEchoChar((char)0);
        } else
            // for hiding the password 
           ELpword.setEchoChar('*');
    }//GEN-LAST:event_ELshowpassActionPerformed

    private void ADMshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMshowpassActionPerformed
        if (ADMshowpass.isSelected()){
            ADMpword.setEchoChar((char)0);
        } else
            // for hiding the password 
           ADMpword.setEchoChar('*');
    }//GEN-LAST:event_ADMshowpassActionPerformed

    private void CLshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLshowpassActionPerformed
        // TODO add your handling code here:
        if (CLshowpass.isSelected()){
            CLpword.setEchoChar((char)0);
        } else
            // for hiding the password 
           CLpword.setEchoChar('*');
    }//GEN-LAST:event_CLshowpassActionPerformed

    private void ADMloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMloginActionPerformed
        // TODO add your handling code here: // Retrieve the entered username and password
    // Retrieve the entered username and password
        String username = ADMuname.getText();
        String password = new String(ADMpword.getPassword());

        // Check if the username and password are correct (you need to implement this logic)
        validatecreds(username, password, "ADMIN");
         
    }//GEN-LAST:event_ADMloginActionPerformed

    private void ELloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELloginActionPerformed
        // TODO add your handling code here:
       // Retrieve the entered username and password
        String username = ELuname.getText();
        String password = new String(ELpword.getPassword());

        // Check if the username and password are correct (you need to implement this logic)
        validatecreds(username, password, "EMPLOYEE");
        
    }//GEN-LAST:event_ELloginActionPerformed

    private void CLloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLloginActionPerformed
        // TODO add your handling code here:
     // Retrieve the entered username and password
        String username = CLuname.getText();
        String password = new String(CLpword.getPassword());

        // Check if the username and password are correct (you need to implement this logic)
        validatecreds(username, password, "CUSTOMER");
    }//GEN-LAST:event_CLloginActionPerformed

    private void REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTERActionPerformed
        // TODO add your handling code here:
         new REGISTER().setVisible(true);
         dispose();
    }//GEN-LAST:event_REGISTERActionPerformed
   private void validatecreds(String username, String password, String accountType) {
      try (Connection conn = DriverManager.getConnection(DATABASE_URL);
         PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM saved_accounts WHERE username = ? AND password = ? AND account_type = ?")) {
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.setString(3, accountType);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            if (accountType.equals("ADMIN")) {
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new ADMINFRAME().setVisible(true);
                dispose(); 
            } else if (accountType.equals("CUSTOMER")) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
             new CUSTOMER().setVisible(true);
             dispose();
        } else if (accountType.equals("EMPLOYEE")) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            new EMPLOYEE().setVisible(true);
            dispose(); 
                JOptionPane.showMessageDialog(this, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}
    


   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADMINLOGIn;
    private javax.swing.JButton ADMlogin;
    private javax.swing.JPasswordField ADMpword;
    private javax.swing.JCheckBox ADMshowpass;
    private javax.swing.JTextField ADMuname;
    private javax.swing.JButton CLlogin;
    private javax.swing.JPasswordField CLpword;
    private javax.swing.JCheckBox CLshowpass;
    private javax.swing.JTextField CLuname;
    private javax.swing.JPanel CUSTOMERLOGIn;
    private javax.swing.JButton ELlogin;
    private javax.swing.JPasswordField ELpword;
    private javax.swing.JCheckBox ELshowpass;
    private javax.swing.JTextField ELuname;
    private javax.swing.JPanel EMPLOYEELOGIn;
    private javax.swing.JTabbedPane Logintab;
    private javax.swing.JButton REGISTER;
    // End of variables declaration//GEN-END:variables
}
