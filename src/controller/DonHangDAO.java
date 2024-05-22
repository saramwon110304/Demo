package controller;

import Model.DonHang;
import Model.SanPham;
import Model.TaiKhoan;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class DonHangDAO {
    private Connection conn = null;
    
    public DonHangDAO() {
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
    
    public ArrayList<DonHang> getListDH() {
    ArrayList<DonHang> list = new ArrayList<>();
    String sql = "SELECT * FROM DONHANG ORDER BY MADH ASC";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DonHang donhang = new DonHang();
            donhang.setMADH(rs.getInt("MADH"));
            donhang.setMANV(rs.getInt("MANV"));
            donhang.setMAKH(rs.getInt("MAKH"));
            donhang.setNGAYDH(rs.getDate("NGAYDH"));
            donhang.setTRIGIA(rs.getInt("TRIGIA"));
            list.add(donhang);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;
}
    
    public ArrayList<DonHang> FindByMADH(int MADH) {
    ArrayList<DonHang> list = new ArrayList<>();
    String sql = "SELECT * FROM DONHANG WHERE MADH = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, MADH);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DonHang donhang = new DonHang();
            donhang.setMADH(rs.getInt("MADH"));
            donhang.setMANV(rs.getInt("MANV"));
            donhang.setMAKH(rs.getInt("MAKH"));
            donhang.setNGAYDH(rs.getDate("NGAYDH"));
            donhang.setTRIGIA(rs.getInt("TRIGIA"));
            list.add(donhang);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return list;
}
    
    public boolean isMaDHExists(int maDH) {
    String sql = "SELECT * FROM DONHANG WHERE MADH = ?";
    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, maDH);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    
    public void addDonHang(DonHang donHang) throws SQLException {
        String query = "INSERT INTO DONHANG (MADH, MANV, MAKH, NGAYDH) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, donHang.getMADH());
            stmt.setInt(2, donHang.getMANV());
            stmt.setInt(3, donHang.getMAKH());
            stmt.setDate(4,donHang.getNGAYDH());
            stmt.executeUpdate();
        }
    }
    
    public void deleteDonHang(int MADH) throws SQLException {
        String query = "DELETE FROM DONHANG WHERE MADH = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, MADH);
            stmt.executeUpdate();
        }
    }
    
    public void deleteDonHangAndDetails(int maDH) throws SQLException {
    PreparedStatement psCTDH = null;
    PreparedStatement psDonHang = null;
    try {
        conn.setAutoCommit(false); // Tắt tự động commit để có thể thực hiện giao dịch
        
        // Xoá các chi tiết đơn hàng liên quan
        String deleteCTDHQuery = "DELETE FROM CTDH WHERE MADH = ?";
        psCTDH = conn.prepareStatement(deleteCTDHQuery);
        psCTDH.setInt(1, maDH);
        psCTDH.executeUpdate();
        
        // Xoá đơn hàng
        String deleteDonHangQuery = "DELETE FROM DONHANG WHERE MADH = ?";
        psDonHang = conn.prepareStatement(deleteDonHangQuery);
        psDonHang.setInt(1, maDH);
        psDonHang.executeUpdate();
        
        conn.commit(); // Commit giao dịch nếu thành công
    } catch (SQLException e) {
        if (conn != null) {
            conn.rollback(); // Rollback giao dịch nếu có lỗi
        }
        throw e; // Ném lại ngoại lệ để xử lý ở lớp gọi
    } finally {
        // Đóng tài nguyên PreparedStatement
        if (psCTDH != null) {
            psCTDH.close();
        }
        if (psDonHang != null) {
            psDonHang.close();
        }
        // Đóng kết nối
        if (conn != null) {
            conn.setAutoCommit(true); // Mở lại tự động commit trước khi đóng kết nối
            conn.close();
        }
    }
}


    

    public static void main (String[] args) {
        new DonHangDAO();
    }
}