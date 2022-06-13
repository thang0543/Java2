package edu.poly.thangdtph27626;

import java.awt.Color;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class employeeManager extends javax.swing.JFrame {

    
    private String date = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}";
    public employeeManager() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBirth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWage = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        erroName = new javax.swing.JLabel();
        erroBrithday = new javax.swing.JLabel();
        erroSalary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Quản lí nhân viên ");

        jLabel2.setText("họ và tên");

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        jLabel3.setText("ngày sinh");

        txtBirth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBirthMouseClicked(evt);
            }
        });

        jLabel4.setText("lương");

        txtWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWageMouseClicked(evt);
            }
        });

        btnCheck.setText("kiểm tra");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        erroName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        erroBrithday.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        erroSalary.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                    .addComponent(erroBrithday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnCheck))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(erroName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(erroSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(erroBrithday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroSalary)
                .addGap(47, 47, 47)
                .addComponent(btnCheck)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        if (checkForEmptyString()) {
            JOptionPane.showConfirmDialog(this, "thành công", "", JOptionPane.OK_OPTION);
            txtName.setBackground(Color.GREEN);
            txtBirth.setBackground(Color.GREEN);
            txtWage.setBackground(Color.GREEN);
            clear();
        }

    }//GEN-LAST:event_btnCheckActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        erroName.setText("");
        txtName.setBackground(Color.white);
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtBirthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBirthMouseClicked
        erroBrithday.setText("");
        txtBirth.setBackground(Color.white);
    }//GEN-LAST:event_txtBirthMouseClicked

    private void txtWageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWageMouseClicked
        erroSalary.setText("");
        txtWage.setBackground(Color.white);
    }//GEN-LAST:event_txtWageMouseClicked

    private boolean birthCheck() {
        try {

            Date brithDay = XDate.parse(txtBirth.getText(), "yyyy/mm/dd");
        } catch (HeadlessException | ParseException | NumberFormatException e) {
//            erroBrithday.setText("Please enter the correct format(dd/mm/yyyy)");
            JOptionPane.showMessageDialog(this, "vui long nhap dung ngay thang(dd/mm/yyyy)", "erro", JOptionPane.OK_OPTION);
            txtBirth.setBackground(Color.yellow);
            return false;
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "vui long nhap dung ngay thang(dd/mm/yyyy", "erro", JOptionPane.OK_OPTION);
            txtBirth.setBackground(Color.yellow);
            return false;
        }
        return true;
    }

    private boolean salaryCheck() {
        try {
            double wage = Double.parseDouble(txtWage.getText());
            if (wage < 0) {
//                erroSalary.setText("please input salary > 0");
                JOptionPane.showMessageDialog(this, "vui long nhap so > 0", "erro", JOptionPane.OK_OPTION);
                txtWage.setBackground(Color.yellow);
                return false;
            }
        } catch (NumberFormatException e) {
//            erroSalary.setText("please input number");
            JOptionPane.showMessageDialog(this, "vui long nhap so", "erro", JOptionPane.OK_OPTION);
            txtWage.setBackground(Color.yellow);
            return false;
        }
        return true;
    }

    private boolean checkForEmptyString() {
        StringBuilder bd = new StringBuilder();
        int count = 0;
        if (txtName.getText().isEmpty()) {
//            erroName.setText("please input name");
            bd.append("vui long nhap ten \n");
            txtName.setBackground(Color.yellow);
            count++;
        }else{
            txtName.setBackground(Color.white);
        }
        if (txtBirth.getText().isEmpty()) {
//            erroBrithday.setText("please input Birth");
            bd.append("vui long nhap ngay sinh \n");
            txtBirth.setBackground(Color.yellow);
            count++;
        } else if (!birthCheck()) {
            count++;
        }else if(!txtBirth.getText().matches(date)){
             bd.append("vui long nhap dung ngay sinh \n");
            txtBirth.setBackground(Color.yellow);
            count++;
        }else{
            txtBirth.setBackground(Color.white);
        }
        if (txtWage.getText().isEmpty()) {
//            erroSalary.setText("please input salary");
            bd.append(" vui long nhap luong \n");
            txtWage.setBackground(Color.yellow);
            count++;
        } else if (!salaryCheck()) {
            count++;
        }else{
            txtWage.setBackground(Color.white);
        }

        if (bd.length() > 0) {
            JOptionPane.showMessageDialog(this, bd.toString());
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

    public void clear() {
        erroName.setText("");
        erroBrithday.setText("");
        erroSalary.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JLabel erroBrithday;
    private javax.swing.JLabel erroName;
    private javax.swing.JLabel erroSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWage;
    // End of variables declaration//GEN-END:variables
}
