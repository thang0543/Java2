
package com.thang.main;

import com.thang.model.Student;
import com.thang.model.Xfile;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    private ArrayList<Student> list = new ArrayList<>();
    private String file = ("D:\\studen.bin");
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        cboMon.setModel(new DefaultComboBoxModel<>(new String[]{"CNTT", "UD", "TKĐH", "TMĐT"}));
        fillTable();
        
    }

    

    public void show(int index){
        txtName.setText(tblStudents.getValueAt(index, 0).toString());
        cboMon.setSelectedItem(tblStudents.getValueAt(index, 1).toString());
        txtMark.setText(tblStudents.getValueAt(index, 2).toString());
    }
   private void fillTable(){
      DefaultTableModel model = new DefaultTableModel();
      model.setColumnIdentifiers(new String[]{"ten Sinh vien","bo mon","diem","ket qua"});
      for(Student st : list){
          Object[] item = {st.getName(),st.getBoMOn(),st.getMark(),st.KQ()};
          model.addRow(item);
      }
      tblStudents.setModel(model);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnWiter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMark = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboMon = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
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
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        jLabel1.setText("ten sinh vien:");

        btnAdd.setText("tai du lieu");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel2.setText("bo mon:");

        btnWiter.setText("ghi du lieu");
        btnWiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWiterActionPerformed(evt);
            }
        });

        jLabel3.setText("diem:");

        btnFind.setText("tim sinh vien");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quan li sinh vien");

        cboMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWiter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWiter)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cboMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWiterActionPerformed
        if(!check() ){
            Student check = findName(txtName.getText()); 
            if(check == null){
             Student st = new Student();
            st.setName(txtName.getText());
            st.setBoMOn(String.valueOf(cboMon.getSelectedItem()));
            st.setMark(Double.parseDouble(txtMark.getText()));
            list.add(st);
            }else{
                JOptionPane.showConfirmDialog(this, "ten sinh vien da ton tai","message",JOptionPane.OK_OPTION);
            }
            
        }
        Xfile.witerFile(list,file);
        fillTable();
    }//GEN-LAST:event_btnWiterActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
             list =  (ArrayList<Student>) Xfile.readFile(file);
       fillTable();
       show(0);
       tblStudents.addRowSelectionInterval(0, 0);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "file khong co du lieu");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        int index = tblStudents.getSelectedRow();
        show(index);
    }//GEN-LAST:event_tblStudentsMouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String name = JOptionPane.showInputDialog(this,"vui long nhap ten sinh vien");
        Student st = findName(name);
        if(st != null){
                txtName.setText(st.getName());
                cboMon.setSelectedItem(st.getBoMOn());
                txtMark.setText(String.valueOf(st.getMark()));
                
        } else{
            JOptionPane.showConfirmDialog(this, "ten sinh vien khong ton tai","message",JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnFindActionPerformed

    public Student findName(String name){
        for(Student st : list){
            if(st.getName().equalsIgnoreCase(name)){
                return st;
            }
        }
        return null;
    }
    public boolean checkNumber(){
        try {
            double number = Double.parseDouble(txtMark.getText());
            if(number < 0 || number > 10){
                JOptionPane.showMessageDialog(this, "vui long nhap so 0 - 10","erro",JOptionPane.OK_OPTION);
                return false;
            }
            return true;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "vui long nhap so","erro",JOptionPane.OK_OPTION);
             return false;
        }
    }
    public boolean check(){
        int count = 0;
        if(txtName.getText().isEmpty() || txtMark.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "vui long khong duoc de trong","erro",JOptionPane.OK_OPTION);
            count++;
        }else if(checkNumber()){
        count++;
        }
        if(count > 0){
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnWiter;
    private javax.swing.JComboBox<String> cboMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
