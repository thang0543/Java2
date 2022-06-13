package com.thang.Dao;

import com.thang.model.NguoiHoc;
import com.thang.swing.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class NguoiHocDAO {

    public void insert(NguoiHoc model) {
        String sql = "INSERT INTO NguoiHoc (MaNH, HoTen, gioiTinh, NgaySinh, DienThoai, email, ghiChu, MaNV) VALUES (?,?,?,?,?,?,?,?,?)";
        JdbcHelper.executeUpdate(sql,
                model.getMaNH(),
                model.getHoTen(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDienThoai(),
                model.getEmail(),
                model.getGhiChu(),
                model.getMaNV()
        );
    }

    public void update(NguoiHoc model) {
        String sql = "UPDATE NguoiHoc SET  HoTen =?, gioiTinh =?, NgaySinh =?, DienThoai =?, email =?, ghiChu =?, MaNV =? where MaNH like ?";
        JdbcHelper.executeUpdate(sql,
                model.getHoTen(),
                model.isGioiTinh(),
                model.getNgaySinh(),
                model.getDienThoai(),
                model.getEmail(),
                model.getGhiChu(),
                model.getMaNV(),
                model.getMaNH()
        );
    }

    public void delete(String id) {
        String sql = "DELETE FROM NguoiHoc WHERE MaNH like ?";
        JdbcHelper.executeUpdate(sql, id);
    }

    public List<NguoiHoc> select() {
        String sql = "SELECT * FROM NguoiHoc";
        return select(sql);
    }

    public List<NguoiHoc> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ?";
        return select(sql, "%" + keyword + "%");
    }

    public List<NguoiHoc> selectByCourse(Integer makh) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return select(sql, makh);
    }

    public NguoiHoc findById(String manh) {
        String sql = "SELECT * FROM NguoiHoc WHERE MaNH=?";
        List<NguoiHoc> list = select(sql, manh);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NguoiHoc> select(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NguoiHoc model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NguoiHoc readFromResultSet(ResultSet rs) throws SQLException {
        NguoiHoc model = new NguoiHoc();
        model.setMaNH(rs.getString("MaNH"));
        model.setHoTen(rs.getString("HoTen"));
        model.setNgaySinh(rs.getDate("NgaySinh"));
        model.setGioiTinh(rs.getBoolean("gioiTinh"));
        model.setDienThoai(rs.getString("DienThoai"));
        model.setEmail(rs.getString("email"));
        model.setGhiChu(rs.getString("ghiChu"));
        model.setMaNV(rs.getString("MaNV"));
//        model.setNgayDK(rs.getDate("NgayDK"));
        return model;
    }
}
