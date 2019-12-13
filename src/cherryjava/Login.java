/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cherryjava;

import controllers.*;

/**
 *
 * @author herrerach_sd2022
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        LoginText = new javax.swing.JLabel();
        PasswordLog = new javax.swing.JLabel();
        UsernameLog1 = new javax.swing.JLabel();
        LogUsernameTF = new javax.swing.JTextField();
        LoginButtonLog = new javax.swing.JButton();
        RegisterButtonLog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordLog = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 138, 247));

        LoginText.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        LoginText.setText("Login");

        PasswordLog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        PasswordLog.setText("Password :");

        UsernameLog1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        UsernameLog1.setText("Username :");

        LoginButtonLog.setBackground(new java.awt.Color(122, 170, 245));
        LoginButtonLog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        LoginButtonLog.setText("Login");
        LoginButtonLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.blue, null, java.awt.Color.white));
        LoginButtonLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonLogMouseClicked(evt);
            }
        });
        LoginButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonLogActionPerformed(evt);
            }
        });

        RegisterButtonLog.setBackground(new java.awt.Color(122, 170, 245));
        RegisterButtonLog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        RegisterButtonLog.setText("Register");
        RegisterButtonLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.blue, null, java.awt.Color.white));
        RegisterButtonLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RegisterButtonLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterButtonLogMouseClicked(evt);
            }
        });
        RegisterButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonLogActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Not Registered?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameLog1)
                                    .addComponent(PasswordLog))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LogUsernameTF)
                                    .addComponent(jPasswordLog, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                            .addComponent(RegisterButtonLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButtonLog, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(LoginText)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(LoginText)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogUsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLog1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PasswordLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordLog))
                .addGap(53, 53, 53)
                .addComponent(LoginButtonLog)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterButtonLog)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonLogMouseClicked
        usersController user = new usersController();
        user.login(LogUsernameTF.getText(), jPasswordLog.getText());
    }//GEN-LAST:event_LoginButtonLogMouseClicked

    private void LoginButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonLogActionPerformed

    }//GEN-LAST:event_LoginButtonLogActionPerformed

    private void RegisterButtonLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterButtonLogMouseClicked
        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterButtonLogMouseClicked

    private void RegisterButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonLogActionPerformed

    }//GEN-LAST:event_RegisterButtonLogActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LogUsernameTF;
    private javax.swing.JButton LoginButtonLog;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel PasswordLog;
    private javax.swing.JButton RegisterButtonLog;
    private javax.swing.JLabel UsernameLog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordLog;
    // End of variables declaration//GEN-END:variables
}
