package controller;

import Model.TaiKhoan;
import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TaiKhoanDAO {

    private Connection conn;

    public TaiKhoanDAO() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String uname = "c##QuanLyCuaHangBanTrangSuc";
            String upass = "userpass";
            conn = DriverManager.getConnection(url, uname, upass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<TaiKhoan> getListTK() {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM TAIKHOAN ORDER BY MATK ASC";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taikhoan = new TaiKhoan();
                taikhoan.setMATK(rs.getInt("MATK"));
                taikhoan.setMANV(rs.getInt("MANV"));
                taikhoan.setTENDANGNHAP(rs.getString("TENDNHAP"));
                taikhoan.setMATKHAU(rs.getInt("MATKHAU"));
                list.add(taikhoan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void DeleteTK(int MATK, Component parentComponent) {
        String deleteTaiKhoanSQL = "DELETE FROM TAIKHOAN WHERE MATK = ?";
        try {
            PreparedStatement deleteTaiKhoanStmt = conn.prepareStatement(deleteTaiKhoanSQL);
            deleteTaiKhoanStmt.setInt(1, MATK);
            deleteTaiKhoanStmt.executeUpdate();
            JOptionPane.showMessageDialog(parentComponent, "Xoá thành công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parentComponent, "Đã xảy ra lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AddTK(TaiKhoan taikhoan, Component parentComponent) {
        String sql = "INSERT INTO TAIKHOAN (MATK, MANV, TENDNHAP, MATKHAU) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, taikhoan.getMATK());
            ps.setInt(2, taikhoan.getMANV());
            ps.setString(3, taikhoan.getTENDANGNHAP());
            ps.setInt(4, taikhoan.getMATKHAU());
            ps.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parentComponent, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void UpdateTK(TaiKhoan taiKhoan, Component parentComponent) {
        try {
            String updateTaiKhoanSQL = "UPDATE TAIKHOAN SET MATK = ?, MANV = ?, TENDNHAP = ?, MATKHAU = ? WHERE MATK = ?";
            PreparedStatement updateTaiKhoanStmt = conn.prepareStatement(updateTaiKhoanSQL);
            updateTaiKhoanStmt.setInt(1, taiKhoan.getMATK());
            updateTaiKhoanStmt.setInt(2, taiKhoan.getMANV());
            updateTaiKhoanStmt.setString(3, taiKhoan.getTENDANGNHAP());
            updateTaiKhoanStmt.setInt(4, taiKhoan.getMATKHAU());
            updateTaiKhoanStmt.setInt(5, taiKhoan.getMATK());

            updateTaiKhoanStmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parentComponent, "Lỗi khi cập nhật tài khoản: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<TaiKhoan> FindByMATK(int MATK) {
        ArrayList<TaiKhoan> list = new ArrayList<>();
        String sql = "SELECT * FROM TAIKHOAN WHERE MATK = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, MATK);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan taikhoan = new TaiKhoan();
                taikhoan.setMATK(rs.getInt("MATK"));
                taikhoan.setMANV(rs.getInt("MANV"));
                taikhoan.setTENDANGNHAP(rs.getString("TENDNHAP"));
                taikhoan.setMATKHAU(rs.getInt("MATKHAU"));
                list.add(taikhoan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean isTenDangNhapExists(String tenDangNhap) {
        String sql = "SELECT 1 FROM TAIKHOAN WHERE TENDNHAP = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tenDangNhap);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isMaNVExists(int maNV) {
        String sql = "SELECT 1 FROM NHANVIEN WHERE MANV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maNV);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isMaTKExists(int maTK) {
        String sql = "SELECT 1 FROM TAIKHOAN WHERE MATK = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, maTK);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public int getMaxMaTK() {
        int maxMaTK = 0;
        String query = "SELECT MAX(MATK) AS MaxMaTK FROM TAIKHOAN";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                maxMaTK = resultSet.getInt("MaxMaTK");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxMaTK;
    }

    public void updateNhanVienMATK(int maNV, int maTK) {
        String sql = "UPDATE NHANVIEN SET MATK = ? WHERE MANV = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, maTK);
            ps.setInt(2, maNV);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TaiKhoanDAO();
    }
}
