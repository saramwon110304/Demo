package controller;

import Model.TaiKhoan;
import java.sql.*;
import java.util.ArrayList;

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

    public void DeleteTK(int MATK) {
        try {
            String deleteTaiKhoanSQL = "DELETE FROM TAIKHOAN WHERE MATK = ?";
            PreparedStatement deleteTaiKhoanStmt = conn.prepareStatement(deleteTaiKhoanSQL);
            deleteTaiKhoanStmt.setInt(1, MATK);
            deleteTaiKhoanStmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void AddTK(TaiKhoan taikhoan) {
        try {
            String sql = "INSERT INTO TAIKHOAN (MATK, MANV, TENDNHAP, MATKHAU) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, taikhoan.getMATK());
            ps.setInt(2, taikhoan.getMANV());
            ps.setString(3, taikhoan.getTENDANGNHAP());
            ps.setInt(4, taikhoan.getMATKHAU());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateTK(TaiKhoan taiKhoan) {
        try {
            String updateTaiKhoanSQL = "UPDATE TAIKHOAN SET MANV = ?, TENDNHAP = ?, MATKHAU = ? WHERE MATK = ?";
            PreparedStatement updateTaiKhoanStmt = conn.prepareStatement(updateTaiKhoanSQL);
            updateTaiKhoanStmt.setInt(1, taiKhoan.getMANV());
            updateTaiKhoanStmt.setString(2, taiKhoan.getTENDANGNHAP());
            updateTaiKhoanStmt.setInt(3, taiKhoan.getMATKHAU());
            updateTaiKhoanStmt.setInt(4, taiKhoan.getMATK());
            updateTaiKhoanStmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
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
        String sql = "SELECT * FROM TAIKHOAN WHERE TENDNHAP = ?";
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
        String sql = "SELECT * FROM TAIKHOAN WHERE MANV = ?";
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
        String sql = "SELECT * FROM TAIKHOAN WHERE MATK = ?";
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

    public int getNextMaTK() {
        int nextMaTK = 0;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MAX(MATK) AS maxMATK FROM TAIKHOAN";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                nextMaTK = rs.getInt("maxMATK") + 1;
            } else {
                nextMaTK = 1; // Start with 1 if there are no accounts
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return nextMaTK;
    }

    public static void main(String[] args) {
        new TaiKhoanDAO();
    }
}
