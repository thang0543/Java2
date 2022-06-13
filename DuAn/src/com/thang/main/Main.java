package com.thang.main;

import com.thang.swing.ShareHelper;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;



public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        init();
    }

    void init() {
        setSize(1000, 600);
//        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);
        new Timer(1000, new ActionListener() {
            SimpleDateFormat date = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblDongHo.setText(date.format(new Date()));
            }
        }).start();
//        this.openWelcome();
//        this.openLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        lblNoiDung = new javax.swing.JLabel();
        pnlTrangThai = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mniDangNhap = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniKetThuc = new javax.swing.JMenuItem();
        mnuManager = new javax.swing.JMenu();
        mniQLNguoiHoc = new javax.swing.JMenuItem();
        mniQLNhanVien = new javax.swing.JMenuItem();
        mniQLKhoaHoc = new javax.swing.JMenuItem();
        mniQLChuyenDe = new javax.swing.JMenuItem();
        mnuStatistical = new javax.swing.JMenu();
        mniTKNguoiHoc = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniTKBangDem = new javax.swing.JMenuItem();
        mniTKKhoaHoc = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniTKDoanhThu = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);

        btnDangXuat.setText("Đăng nhập");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        toolBar.add(btnDangXuat);

        btnKetThuc.setText("kết thúc ");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        toolBar.add(btnKetThuc);
        toolBar.add(jSeparator5);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Lists.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Conference.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnKhoaHoc);
        toolBar.add(jSeparator6);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnHuongDan);

        lblNoiDung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/logo.png"))); // NOI18N

        pnlTrangThai.setLayout(new java.awt.BorderLayout());

        lblTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Info.png"))); // NOI18N
        lblTrangThai.setText("Hệ quản lý đào tạo");
        pnlTrangThai.add(lblTrangThai, java.awt.BorderLayout.CENTER);

        lblDongHo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Alarm.png"))); // NOI18N
        lblDongHo.setText("10:55 PM");
        pnlTrangThai.add(lblDongHo, java.awt.BorderLayout.PAGE_START);

        mnuSystem.setText("Hệ Thống ");

        mniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Key.png"))); // NOI18N
        mniDangNhap.setText("Đăng nhập");
        mnuSystem.add(mniDangNhap);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Log out.png"))); // NOI18N
        mniDangXuat.setText("jMenuItem3");
        mnuSystem.add(mniDangXuat);
        mnuSystem.add(jSeparator1);

        mniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Refresh.png"))); // NOI18N
        mniDoiMatKhau.setText("Đổi mật khẩu");
        mnuSystem.add(mniDoiMatKhau);
        mnuSystem.add(jSeparator2);

        mniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Stop.png"))); // NOI18N
        mniKetThuc.setText("Kết Thúc ");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        mnuSystem.add(mniKetThuc);

        jMenuBar1.add(mnuSystem);

        mnuManager.setText("Quản Lí ");

        mniQLNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Conference.png"))); // NOI18N
        mniQLNguoiHoc.setText("Người học");
        mnuManager.add(mniQLNguoiHoc);

        mniQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Lists.png"))); // NOI18N
        mniQLNhanVien.setText("Nhân viên");
        mnuManager.add(mniQLNhanVien);

        mniQLKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Certificate.png"))); // NOI18N
        mniQLKhoaHoc.setText("khóa học");
        mnuManager.add(mniQLKhoaHoc);

        mniQLChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/User group.png"))); // NOI18N
        mniQLChuyenDe.setText("Chuyên Đề");
        mnuManager.add(mniQLChuyenDe);

        jMenuBar1.add(mnuManager);

        mnuStatistical.setText("Thống kê");

        mniTKNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Clien list.png"))); // NOI18N
        mniTKNguoiHoc.setText("Người học từng năm");
        mnuStatistical.add(mniTKNguoiHoc);
        mnuStatistical.add(jSeparator3);

        mniTKBangDem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Card file.png"))); // NOI18N
        mniTKBangDem.setText("Bảng điểm");
        mnuStatistical.add(mniTKBangDem);

        mniTKKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Bar chart.png"))); // NOI18N
        mniTKKhoaHoc.setText("Điểm Từng khóa");
        mnuStatistical.add(mniTKKhoaHoc);
        mnuStatistical.add(jSeparator4);

        mniTKDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Dollar.png"))); // NOI18N
        mniTKDoanhThu.setText("Doanh Thu từng chuyên đề");
        mniTKDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTKDoanhThuActionPerformed(evt);
            }
        });
        mnuStatistical.add(mniTKDoanhThu);

        jMenuBar1.add(mnuStatistical);

        mnuHelp.setText("Trợ giúp ");

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Globe.png"))); // NOI18N
        mniHuongDan.setText("Hướng Dẫn Sử dụng");
        mnuHelp.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com.thang.images/Brick house.png"))); // NOI18N
        mniGioiThieu.setText("Giới Thiệu Sản Phẩm");
        mnuHelp.add(mniGioiThieu);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblNoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
            .addComponent(pnlTrangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniTKDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTKDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTKDoanhThuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
       dispose();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
       dispose();
    }//GEN-LAST:event_mniKetThucActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblNoiDung;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuItem mniDangNhap;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JMenuItem mniQLChuyenDe;
    private javax.swing.JMenuItem mniQLKhoaHoc;
    private javax.swing.JMenuItem mniQLNguoiHoc;
    private javax.swing.JMenuItem mniQLNhanVien;
    private javax.swing.JMenuItem mniTKBangDem;
    private javax.swing.JMenuItem mniTKDoanhThu;
    private javax.swing.JMenuItem mniTKKhoaHoc;
    private javax.swing.JMenuItem mniTKNguoiHoc;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuManager;
    private javax.swing.JMenu mnuStatistical;
    private javax.swing.JMenu mnuSystem;
    private javax.swing.JPanel pnlTrangThai;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
