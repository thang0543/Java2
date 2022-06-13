
import edu.poly.thangdtph27626.XFile.XFile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class readAndWiriteFile extends javax.swing.JFrame {

    public readAndWiriteFile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcontent = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        erroLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("tên file");

        txtFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFileMouseClicked(evt);
            }
        });

        jLabel2.setText("nội dung");

        txtcontent.setColumns(20);
        txtcontent.setRows(5);
        jScrollPane1.setViewportView(txtcontent);

        btnAdd.setText("lưu ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRead.setText("đọc");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        erroLink.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(erroLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFile, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnAdd)
                        .addGap(76, 76, 76)
                        .addComponent(btnRead)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(erroLink)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRead))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

//        if (check() == false) {
//            try {
//                XFile.writeBufferedWrite(txtFile.getText(), txtcontent.getText());
//                JOptionPane.showMessageDialog(this, "them thanh cong", "", JOptionPane.OK_OPTION);
//            } catch (IOException ex) {
//                JOptionPane.showMessageDialog(this, "them that bai", "", JOptionPane.OK_OPTION);
//                Logger.getLogger(readAndWiriteFile.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
        try {
            FileWriter writer = new FileWriter(txtFile.getText());
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write(txtcontent.getText());

            buffer.close();
            JOptionPane.showMessageDialog(this, "Ghi file thành công");
//            txt_NoiDung.setText("");
//            txt_TenFile.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi ghi file");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        check();
        try {
            XFile.readBufferedWrite(txtFile.getText(), txtcontent);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ex) {
            Logger.getLogger(readAndWiriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void txtFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFileMouseClicked
        erroLink.setText("");
        txtFile.setBorder(new LineBorder(Color.BLACK));
    }//GEN-LAST:event_txtFileMouseClicked

    private boolean check() {
        if (txtFile.getText().equals("")) {
            erroLink.setText("vui long nhap duong dan");
            txtFile.setBorder(new LineBorder(Color.red));
            return false;
        }
        return true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new readAndWiriteFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRead;
    private javax.swing.JLabel erroLink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextArea txtcontent;
    // End of variables declaration//GEN-END:variables
}
