package edu.poly.thangdtph27626;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {

    private ArrayList<DataUser> list = new ArrayList<>();
    private DefaultTableModel model;
    private DataUser user = new DataUser();

    public User() {
        initComponents();
        dataUser();
        TableUser();
    }

    public void dataUser() {
        list.add(new DataUser("thangdt", "12345678", "user"));
        list.add(new DataUser("thangdt1", "12345678", "admin"));
        list.add(new DataUser("thangdt2", "12345678", "user"));
        list.add(new DataUser("thangdt3", "12345678", "admin"));
    }

    public void TableUser() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"User Name", "Password", "Role"});

        tableList.setModel(model);
    }

    public void fillTable() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (DataUser userAndAdmin : list) {
            model.addRow(new String[]{userAndAdmin.getUserName(), userAndAdmin.getPassword(), userAndAdmin.getRole()});
        }
        // cập nhật lại dữ liệu 
        model.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        rdoUser = new javax.swing.JRadioButton();
        rdoAdmin = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnResset = new javax.swing.JButton();
        errorUser = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();
        erroRole = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("userName");

        jLabel2.setText("password");

        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });

        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        jLabel3.setText("Role");

        buttonGroup1.add(rdoUser);
        rdoUser.setText("User");

        buttonGroup1.add(rdoAdmin);
        rdoAdmin.setText("Admin");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnResset.setText("Reset");
        btnResset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRessetActionPerformed(evt);
            }
        });

        errorUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        errorPassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        erroRole.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoUser)
                                        .addGap(33, 33, 33)
                                        .addComponent(rdoAdmin))
                                    .addComponent(errorUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(erroRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnResset)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(errorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoUser)
                    .addComponent(rdoAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate)
                    .addComponent(btnResset))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("EDITION", jPanel1);

        tableList.setModel(new javax.swing.table.DefaultTableModel(
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
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LIST", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (checkForm()) {
            user.setUserName(txtUserName.getText());
            user.setPassword(new String(txtPassword.getPassword()));
            user.setRole(rdoUser.isSelected() ? "user" : "admin");
            list.add(user);
        }
        fillTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        fillTable();
    }//GEN-LAST:event_formWindowActivated

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        for (DataUser user : list) {
            if (user.getUserName().equals(txtUserName.getText())) {
                list.remove(user);
                fillTable();
                break;
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnRessetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRessetActionPerformed
        txtUserName.setText("");
        txtPassword.setText("");
        rdoUser.setSelected(false);
        rdoAdmin.setSelected(false);
         errorUser.setText("");
        txtUserName.setBorder(new LineBorder(Color.black));
        errorPassword.setText("");
        txtPassword.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_btnRessetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        for (DataUser user : list) {
            if (user.getUserName().equals(txtUserName.getText())) {
                user.setPassword(new String(txtPassword.getPassword()));
                user.setRole(rdoAdmin.isSelected() ? "Admin" : "user");
                fillTable();
                break;
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        int select = tableList.getSelectedRow();
        if (select >= 0) {
            String userName = (String) model.getValueAt(select, 0);

            for (DataUser user : list) {
                if (user.getUserName().equals(userName)) {
                    txtUserName.setText(user.getUserName());
                    txtPassword.setText(user.getPassword());
                    if (user.getRole().equals("user")) {
                        rdoUser.setSelected(true);
                    } else {
                        rdoAdmin.setSelected(true);
                    }
                    return;
                }
            }
        }
    }//GEN-LAST:event_tableListMouseClicked

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        errorUser.setText("");
        txtUserName.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        errorPassword.setText("");
        txtPassword.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtPasswordMouseClicked

    private boolean checkForm() {
        String userName = txtUserName.getText();
        String password = String.valueOf(txtPassword.getPassword());
        int count = 0;
        if (userName.equalsIgnoreCase("")) {
            errorUser.setText("please input username ");
            txtUserName.setBorder(new LineBorder(Color.red));
            count++;
        } else if (checkUser()) {
            errorUser.setText(" username already exist");
            txtUserName.setBorder(new LineBorder(Color.red));
            count++;
        } 
        if (password.equalsIgnoreCase("")) {
            errorPassword.setText("please input password");
            txtPassword.setBorder(new LineBorder(Color.red));
            count++;
        } 
        if (!rdoAdmin.isSelected() && !rdoUser.isSelected()) {
            erroRole.setText("please choose role");
            count++;
        } else {
            erroRole.setText("");
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    private boolean checkUser() {
        for (DataUser user : list) {
            if (txtUserName.getText().equals(user.getUserName())) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnResset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel erroRole;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoUser;
    private javax.swing.JTable tableList;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
