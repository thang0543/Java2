package com.thang.main;

import com.thang.model.Employee;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class EmployeeManager extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ListEmpolee list = new ListEmpolee();
    private boolean isEditModel;
    private String regexEmail = "\\w+@\\w+\\.\\w{1,3}";

    public EmployeeManager() {
        initComponents();
        initTable();
        initTableData();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        initClock();
        txtRecord.setText(list.getPositionElement());
    }

    private void initClock() {
        clock ck = new clock(txtClock);
        ck.start();

    }

    public void initTable() {

        model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"id", "họ và tên", "tuổi", "email", "Lương"});
        model.fireTableDataChanged();
        tablStaff.setModel(model);
    }

    public void initTableData() {
        list.addEmployee(new Employee("ph27626", "Dương Tu Thắng", 19, "thang2768@gmail.com", 112000000));
        list.addEmployee(new Employee("ph27627", "Lê Hải Đăng", 20, "Danglh27@gmail.com", 112000000));
        list.addEmployee(new Employee("ph27628", "Lê Thị Minh Phương", 21, "Phuonglmt87@gmail.com", 112500000));
        list.addEmployee(new Employee("ph27629", "Đào Văn anh", 22, "Anhdv8758@gmail.com", 21200000));
        list.addEmployee(new Employee("ph27630", "Lê Duy Tùng", 18, "Tungld877@gmail.com", 1532134900));
        list.initTable(model);
    }

    private void fillTable(Employee em) {
        isEditModel = true;
        txtID.setText(em.getId());
        txtName.setText(em.getFullName());
        txtAge.setText(String.valueOf(em.getAge()));
        txtEmail.setText(em.getEmail());
        txtWage.setText(String.valueOf(em.getWage()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWage = new javax.swing.JTextField();
        txtClock = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablStaff = new javax.swing.JTable();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtRecord = new javax.swing.JLabel();
        errorID = new javax.swing.JLabel();
        errorName = new javax.swing.JLabel();
        errorAge = new javax.swing.JLabel();
        errorEmail = new javax.swing.JLabel();
        errorSlary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lí Nhân Viên");

        jLabel2.setText("Mã Nhân Viên: ");

        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });

        jLabel3.setText("Họ Tên: ");

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        jLabel4.setText("Tuổi:");

        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgeMouseClicked(evt);
            }
        });

        jLabel5.setText("email:");

        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });

        jLabel6.setText("lương:");

        txtWage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtWageMouseClicked(evt);
            }
        });

        txtClock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtClock.setForeground(new java.awt.Color(255, 0, 0));
        txtClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtClock.setText("hh:pp:ss");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.gray));

        btnNew.setText("new");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tablStaff.setModel(new javax.swing.table.DefaultTableModel(
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
        tablStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablStaff);
        if (tablStaff.getColumnModel().getColumnCount() > 0) {
            tablStaff.getColumnModel().getColumn(0).setMaxWidth(10);
        }

        btnFirst.setText("|<");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("<<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtRecord.setText("record: 1 of 10");

        errorID.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        errorName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        errorAge.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        errorEmail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        errorSlary.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                    .addComponent(errorID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(errorSlary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtClock, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClock, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(errorName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorAge)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorEmail)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorSlary))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast)
                    .addComponent(txtRecord))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        list.next();
        Employee em = list.getEmployee();
        txtRecord.setText(list.getPositionElement());
        tablStaff.setRowSelectionInterval(list.getIndex(), list.getIndex());
        fillTable(em);
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        clear();
       
            if (checkForm() == true) {
            Employee em = new Employee();
            em.setId(txtID.getText());
            em.setFullName(txtName.getText());
            em.setAge(Integer.valueOf(txtAge.getText()));
            em.setEmail(txtEmail.getText());
            em.setWage(Double.valueOf(txtWage.getText()));
                System.out.println(em.getFullName());
            if (list.findEmployeeByID(em.getId()) == null) {
                JOptionPane.showMessageDialog(this, "thêm thàng công");
                list.addEmployee(em);
                list.saveFile();
                list.initTable(model);
            }
            else {
                int choose = JOptionPane.showConfirmDialog(this, "có cập nhập id: " + txtID.getText(), "id đã tồn tại", JOptionPane.YES_NO_OPTION);
                if (choose == JOptionPane.OK_OPTION) {
                    list.updateEmpoly(em);
                }
                list.initTable(model);

            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clear();
        txtAge.setText("");
        txtEmail.setText("");
        txtID.setText("");
        txtName.setText("");
        txtWage.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        clear();
        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "vui long nhap id", "erro", JOptionPane.OK_OPTION);
        } else {
            try {
                boolean isCheck = list.deleteEmployeeID(txtID.getText());
                if (isCheck) {
                    JOptionPane.showMessageDialog(this, "xoa thanh cong", "success", JOptionPane.OK_OPTION);
                    list.initTable(model);
                } else {
                    JOptionPane.showMessageDialog(this, "xoa that bai", "erro", JOptionPane.OK_OPTION);
                }
            } catch (HeadlessException e) {
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        clear();
        if (txtID.getText().isEmpty()) {
            String id = JOptionPane.showInputDialog(this, "vui long nhap ma nhan vien: ");
            Employee em = list.findEmployeeByID(id);
            if (em != null) {
                fillTable(em);
            } else {
                JOptionPane.showMessageDialog(this, "khong tim thay", "erro", JOptionPane.OK_OPTION);
            }
        } else {
            Employee em = list.findEmployeeByID(txtID.getText());

            if (em != null) {
                fillTable(em);
            } else {
                JOptionPane.showMessageDialog(this, "khong tim thay", "erro", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        list.saveFile();
        int choose = JOptionPane.showConfirmDialog(this, "bạn có muốn thoát", "info", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choose == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        list.first();
        Employee em = list.getEmployee();
        txtRecord.setText(list.getPositionElement());
        tablStaff.setRowSelectionInterval(list.getIndex(), list.getIndex());
        fillTable(em);
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        list.previous();
        Employee em = list.getEmployee();
        txtRecord.setText(list.getPositionElement());
        tablStaff.setRowSelectionInterval(list.getIndex(), list.getIndex());
        fillTable(em);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        list.last();
        Employee em = list.getEmployee();
        txtRecord.setText(list.getPositionElement());
        tablStaff.setRowSelectionInterval(list.getIndex(), list.getIndex());
        fillTable(em);
    }//GEN-LAST:event_btnLastActionPerformed

    private void tablStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablStaffMouseClicked
        int row = tablStaff.getSelectedRow();

        if (row >= 0) {
            String empolyeeId = (String) tablStaff.getValueAt(row, 0);
            Employee em = list.findEmployeeByID(empolyeeId);
            txtRecord.setText(list.getPositionElement());
            if (em != null) {
                fillTable(em);
            }
        }
    }//GEN-LAST:event_tablStaffMouseClicked

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        clear();
        try {
            list.loadFile();
            list.initTable(model);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        errorID.setText("");
        txtID.setBorder(new LineBorder(Color.decode("#ccc")));
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        errorName.setText("");
        txtName.setBorder(new LineBorder(Color.decode("#ccc")));
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseClicked
        errorAge.setText("");
        txtAge.setBorder(new LineBorder(Color.decode("#ccc")));
    }//GEN-LAST:event_txtAgeMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        errorEmail.setText("");
        txtEmail.setBorder(new LineBorder(Color.decode("#ccc")));
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtWageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWageMouseClicked
        errorSlary.setText("");
        txtWage.setBorder(new LineBorder(Color.decode("#ccc")));
    }//GEN-LAST:event_txtWageMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        list.saveFile();
    }//GEN-LAST:event_formWindowClosed

    public boolean checkForm() {
        int count = 0;
        if (txtID.getText().isEmpty()) {
            errorID.setText("vui lòng nhập id");
            txtID.setBorder(new LineBorder(Color.red));
            count++;
        }
        if (txtName.getText().isEmpty()) {
            errorName.setText("vui lòng nhập tên");
            txtName.setBorder(new LineBorder(Color.red));
            count++;
        }
        if (txtAge.getText().isEmpty()) {
            errorAge.setText("vui lòng nhập tuổi");
            txtAge.setBorder(new LineBorder(Color.red));
            count++;
        } else if (!checkAge()) {
            count++;
        }
        if (txtEmail.getText().isEmpty()) {
            errorEmail.setText("vui lòng nhập email");
            txtEmail.setBorder(new LineBorder(Color.red));
            count++;
        } else if (!txtEmail.getText().matches(regexEmail)) {
            errorEmail.setText("vui lòng nhập đúng email");
            txtEmail.setBorder(new LineBorder(Color.red));
            count++;
        }
        if (txtWage.getText().isEmpty()) {
            errorSlary.setText("vui lòng nhập lương");
            txtWage.setBorder(new LineBorder(Color.red));
            count++;
        } else if (!checkSlary()) {
            errorSlary.setText("vui lòng nhập số");
            txtWage.setBorder(new LineBorder(Color.red));
            count++;

        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    public boolean checkAge() {
        try {
            int number = Integer.parseInt(txtAge.getText());
            if (number < 15 || number > 56) {
                errorAge.setText("vui lòng nhập tuổi từ 16 -> 55");
                txtAge.setBorder(new LineBorder(Color.red));
                return false;
            }
        } catch (Exception e) {
            errorAge.setText("vui lòng nhập số");
            txtAge.setBorder(new LineBorder(Color.red));
            return false;

        }
        return true;
    }

    public boolean checkSlary() {
        try {
            double number = Double.parseDouble(txtWage.getText());
            if (Double.valueOf(txtWage.getText()) < 5000000) {
                errorSlary.setText("vui lòng nhập lương >= 5000000 ");
                txtWage.setBorder(new LineBorder(Color.red));
                return false;
            }
        } catch (Exception e) {

            return false;
        }
        return true;
    }

    private void clear() {
        errorID.setText("");
        txtID.setBorder(new LineBorder(Color.decode("#ccc")));
        errorName.setText("");
        txtName.setBorder(new LineBorder(Color.decode("#ccc")));
        errorAge.setText("");
        txtAge.setBorder(new LineBorder(Color.decode("#ccc")));
        errorEmail.setText("");
        txtEmail.setBorder(new LineBorder(Color.decode("#ccc")));
        errorSlary.setText("");
        txtWage.setBorder(new LineBorder(Color.decode("#ccc")));
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel errorAge;
    private javax.swing.JLabel errorEmail;
    private javax.swing.JLabel errorID;
    private javax.swing.JLabel errorName;
    private javax.swing.JLabel errorSlary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablStaff;
    private javax.swing.JTextField txtAge;
    private javax.swing.JLabel txtClock;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtRecord;
    private javax.swing.JTextField txtWage;
    // End of variables declaration//GEN-END:variables
}
