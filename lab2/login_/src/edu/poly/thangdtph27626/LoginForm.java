package edu.poly.thangdtph27626;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        txtPassword = new javax.swing.JPasswordField();
        errorUser = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("userName");

        jLabel2.setText("password");

        txtUserName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUserNameCaretUpdate(evt);
            }
        });
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login Form");
        jLabel3.setToolTipText("");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jButton2.setText("reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        check.setText("Remenber me?");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        txtPassword.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPasswordCaretUpdate(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        errorUser.setBackground(new java.awt.Color(255, 255, 51));
        errorUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        errorUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        errorPassword.setBackground(new java.awt.Color(255, 255, 51));
        errorPassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        errorPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(errorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(check)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnLogin)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(errorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPassword)
                .addGap(9, 9, 9)
                .addComponent(check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(jButton2))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(checkForm()){
            JOptionPane.showConfirmDialog(this, "sussces", "đăng  nhập thành công", JOptionPane.OK_OPTION);
        }
       
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtPassword.setText("");
        txtUserName.setText("");
        errorUser.setText("");
        txtUserName.setBorder(new LineBorder(Color.black));
        errorPassword.setText("");
        txtPassword.setBorder(new LineBorder(Color.black));
        check.setSelected(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        checkForm();

        if (check.isSelected()) {
            JOptionPane.showConfirmDialog(this, "Tài khoản của bạn đã được ghi nhớ", "success", JOptionPane.YES_OPTION);
        }

        if (txtUserName.getText().equals("fpt") && String.valueOf(txtPassword.getPassword()).equals("polytechnic")) {
            JOptionPane.showConfirmDialog(this, "bạn đã đăng nhập thành công", "success", JOptionPane.YES_OPTION);
        }

    }//GEN-LAST:event_checkActionPerformed

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        errorUser.setText("");
        txtUserName.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        errorPassword.setText("");
        txtPassword.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtUserNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUserNameCaretUpdate
        errorUser.setText("");
        txtUserName.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtUserNameCaretUpdate

    private void txtPasswordCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPasswordCaretUpdate
        errorPassword.setText("");
        txtPassword.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtPasswordCaretUpdate

    private boolean checkForm() {
        String userName = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
        int count = 0;

        if (userName.equalsIgnoreCase("")) {
            errorUser.setText("please input username ");
            txtUserName.setBorder(new LineBorder(Color.red));
            count++;
        } 
        if (password.equalsIgnoreCase("")) {
            errorPassword.setText("please input password");
            txtPassword.setBorder(new LineBorder(Color.red));
            count++;
        } 
        if(count != 0){
            return false;
        }
        return true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorUser;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
