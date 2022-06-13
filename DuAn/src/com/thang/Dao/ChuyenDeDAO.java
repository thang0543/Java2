package com.thang.Dao;

import com.thang.model.ChuyenDe;
import com.thang.swing.JdbcHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ChuyenDeDAO {

    public void insert(ChuyenDe model) {
        String sql = "INSERT INTO ChuyenDe (MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa) VALUES (?,?,?,?,?,?)";
        JdbcHelper.executeQuery(sql, model.getMaCD(), model.getTenCD(), model.getHocPhi(), model.getThoiLuong(), model.getHinh(), model.getHinh());
    }

    public void update(ChuyenDe model) {
        String sql = "UPDATE ChuyenDe SET  TenCD =?, HocPhi =?, ThoiLuong =?, Hinh =?, MoTa =? where MaCD like ?";
        JdbcHelper.executeUpdate(sql, model.getTenCD(), model.getHocPhi(), model.getThoiLuong(), model.getHinh(), model.getHinh(), model.getMaCD());
    }

    public void detele(ChuyenDe model) {
        String sql = " DELETE FROM ChuyenDe where MaCD like ?";
        JdbcHelper.executeUpdate(sql, model.getMaCD());
    }

    public List<ChuyenDe> select() {
        String sql = "SELECT * FROM ChuyenDe";
        return select(sql);
    }

    public ChuyenDe findById(String macd) {
        String sql = "SELECT * FROM ChuyenDe WHERE MaCD like ?";
        List<ChuyenDe> list = select(sql, macd);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<ChuyenDe> select(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    ChuyenDe model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private ChuyenDe readFromResultSet(ResultSet rs) throws SQLException {
        ChuyenDe model = new ChuyenDe();
        model.setMaCD(rs.getString("MaCD"));
        model.setHinh(rs.getString("TenCD"));
        model.setHocPhi(rs.getDouble("HocPhi"));
        model.setMoTa(rs.getString("ThoiLuong"));
        model.setTenCD(rs.getString("Hinh"));
        model.setThoiLuong(rs.getInt("MoTa"));
        return model;
    }
}
