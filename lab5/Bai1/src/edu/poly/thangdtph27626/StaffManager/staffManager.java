package edu.poly.thangdtph27626.StaffManager;

import edu.poly.thangdtph27626.XFile.XFile;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class staffManager extends javax.swing.JFrame {

    private List<Staff> list = new ArrayList<>();
    private DefaultTableModel model = new DefaultTableModel();

    public staffManager() {
        initComponents();
        initTable();
        fillToTable();
    }

    public void initTable() {

        list.add(new Staff("Tuấn", 55555));
        list.add(new Staff("Cường", 7.55555));
        list.add(new Staff("Hạnh", 85555.5));

        model.setColumnIdentifiers(new String[]{"họ tên", "diểm"});
        tableStaff.setModel(model);
    }

    public void fillToTable() {
        model.setRowCount(0);
        for (Staff st : list) {
            model.addRow(new String[]{st.getName(), String.valueOf(st.getSalary())});
        }
        model.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPoin = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStaff = new javax.swing.JTable();
        erroName = new javax.swing.JLabel();
        erroPoin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lí nhân viên");

        jLabel2.setText("họ và tên ");

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        jLabel3.setText("điểm");

        txtPoin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPoinMouseClicked(evt);
            }
        });

        btnadd.setText("thêm ");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnSave.setText("lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRead.setText("đọc");
        btnRead.setToolTipText("");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        tableStaff.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableStaff);

        erroName.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        erroPoin.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(erroName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(erroPoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnadd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnRead)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(erroName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(erroPoin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnSave)
                    .addComponent(btnRead))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        if(checkEmpty() == true && checkSalary() == true){
            Staff nv = new Staff();
            nv.setName(txtName.getText());
            nv.setSalary(Double.valueOf(txtPoin.getText()));
            list.add(nv);
        }
     
        fillToTable();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        XFile.writeObject("C:\\Users\\LENOVO\\Desktop\\staffs.dat", list);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {
            list = (List<Staff>) XFile.readObject("C:\\Users\\LENOVO\\Desktop\\staffs.dat");
        } catch (IOException e) {
        }
        this.fillToTable();
    }//GEN-LAST:event_btnReadActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        erroName.setText("");
        txtName.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtPoinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPoinMouseClicked
        erroPoin.setText("");
        txtPoin.setBorder(new LineBorder(Color.black));
    }//GEN-LAST:event_txtPoinMouseClicked

    private boolean checkSalary() {
        try {
            double poin = Double.valueOf(txtPoin.getText());
            if (poin < 0 || poin > 10 ) {
                 erroPoin.setText("please input poin 1 -> 10");
                 txtPoin.setBorder(new LineBorder(Color.red));
                 return false;
            }
            return  true;
        } catch (NumberFormatException e) {
            erroPoin.setText("please input number");
            txtPoin.setBorder(new LineBorder(Color.red));
            return false;
        }
        
    }

    private boolean checkEmpty() {
        int count = 0;
        if (txtName.getText().equals("")) {
            erroName.setText("please input name");
            txtName.setBorder(new LineBorder(Color.red));
            count ++;
        }
       
        if (txtPoin.getText().equals("")) {
            erroPoin.setText("please input poin");
            count++;
        }
        if(count != 0){
            return false;
        }
        return  true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnadd;
    private javax.swing.JLabel erroName;
    private javax.swing.JLabel erroPoin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableStaff;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoin;
    // End of variables declaration//GEN-END:variables
}
