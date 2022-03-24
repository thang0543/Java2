
package edu.poly.thangdtph27626;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ButtonModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class studentManagement extends javax.swing.JFrame {

    private ArrayList<Student> List = new ArrayList<>();
    private DefaultTableModel mode;
    public studentManagement() {
        initComponents();
        dataStudent();
        initTable();
        filltoTable();
        initCombox();
    }

    public void filltoTable(){
        while(mode.getRowCount() > 0){
            mode.removeRow(0);
        }
        
        for(Student sudent : List){
            mode.addRow(new String[]{sudent.getFullName(),""+sudent.getPoin(),sudent.getMajors(),sudent.getGrade(),""+sudent.bonus()});
        }
        mode.fireTableDataChanged();
    }
    public void initTable(){
        mode = new DefaultTableModel();
        mode.setColumnIdentifiers(new String[]{"họ tên","điểm","ngành","học lực","thưởng"});
        tableStudent.setModel(mode);
    }
     public void initCombox(){
        String[] majors =new String[]{"công nghệ thông tin","thiết kế ","marketing","Điện tử","tự động hóa"};
         DefaultComboBoxModel<String> cbModel = new DefaultComboBoxModel(majors);
         cboMajors.setModel(cbModel);
     }
    public void dataStudent(){
        List.add(new Student("Dương Tu Thắng",10,"công nghệ thông tin"));
        List.add(new Student("lê văn Sơn",10,"công nghệ thông tin"));
        List.add(new Student("Nguyễn Văn Hùng",10,"công nghệ thông tin"));
        List.add(new Student("Trần Thị Phương",10,"công nghệ thông tin"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPoin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboMajors = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        sortName = new javax.swing.JButton();
        sortPoin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
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
        tableStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudent);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản LÍ Sinh viên");

        jLabel2.setText("họ tên ");

        jLabel3.setText("điểm");

        jLabel4.setText("ngành học");

        cboMajors.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("học lực");

        checkBox.setText("có thưởng");

        btnAdd.setText("thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setText("thêm mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        sortName.setText("sắp xếp theo tên ");
        sortName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortNameActionPerformed(evt);
            }
        });

        sortPoin.setText("sắp xếp theo điểm ");
        sortPoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortPoinActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sortName)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                                                .addComponent(txtPoin)
                                                .addComponent(cboMajors, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtGender))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAdd)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnUpdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNew))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(sortPoin)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cboMajors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGender)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortName)
                    .addComponent(sortPoin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       txtName.setText("");
       txtPoin.setText("");
       checkBox.setSelected(false);
       txtGender.setText("");
       
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       StringBuilder sb = new StringBuilder();
        if(txtName.getText().equals("")){
           sb.append("please input name\n");
       }
        if(txtPoin.getText().equals("")){
           sb.append("please input poin");
       }
        if(sb.length() > 0){
            JOptionPane.showMessageDialog(this, sb.toString(),"error",JOptionPane.OK_OPTION);
        }
        
        Student sd = new Student();
        sd.setFullName(txtName.getText());
        sd.setPoin(Double.parseDouble(txtPoin.getText()));
        sd.setMajors((String) cboMajors.getSelectedItem());
        
        List.add(sd);
        txtGender.setText(sd.getGrade());
        checkBox.setSelected(sd.bonus());
        filltoTable();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tableStudent.getSelectedRow();
        Student sd = List.remove(index);
        
        filltoTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tableStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentMouseClicked
       int index = tableStudent.getSelectedRow();
       Student sd = List.get(index);
       
       txtName.setText(sd.getFullName());
       txtPoin.setText(String.valueOf(sd.getPoin()));
       cboMajors.setSelectedItem(sd.getMajors());
       txtGender.setText(sd.getGrade());
       checkBox.setSelected(sd.bonus());
    }//GEN-LAST:event_tableStudentMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int index = tableStudent.getSelectedRow();
       Student sd = List.get(index);
       
       sd.setFullName(txtName.getText());
       sd.setPoin(Double.parseDouble(txtPoin.getText()));
       sd.setMajors((String)cboMajors.getSelectedItem());
       txtGender.setText(sd.getGrade());
       checkBox.setSelected(sd.bonus());
       filltoTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void sortNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortNameActionPerformed
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
            
        };
        Collections.sort(List,com);
        filltoTable();
    }//GEN-LAST:event_sortNameActionPerformed

    private void sortPoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortPoinActionPerformed
        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
               Double poin1 = o1.getPoin();
               Double poin2 = o2.getPoin();
               return  poin1.compareTo(poin2);
            }
        };
        Collections.sort(List,com);
        filltoTable();
    }//GEN-LAST:event_sortPoinActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboMajors;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sortName;
    private javax.swing.JButton sortPoin;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoin;
    // End of variables declaration//GEN-END:variables
}
