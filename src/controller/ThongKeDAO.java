package controller;

import java.sql.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ThongKeDAO {
    
    private Connection conn = null;
    public ThongKeDAO() {
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
    
    public Map<Integer, Double> getRevenueByYear(int year) {
    Map<Integer, Double> revenueData = new LinkedHashMap<>();
    String query = "SELECT EXTRACT(MONTH FROM NGAYDH) AS month, SUM(TRIGIA) AS revenue " +
                   "FROM DonHang WHERE EXTRACT(YEAR FROM NGAYDH) = ? " +
                   "GROUP BY EXTRACT(MONTH FROM NGAYDH) ORDER BY month";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, year);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int month = rs.getInt("month");
                double revenue = rs.getDouble("revenue");
                revenueData.put(month, revenue);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return revenueData;
}


    public Map<Integer, Double> getRevenueByMonth(int year, int month) {
    Map<Integer, Double> revenueData = new LinkedHashMap<>();
    String query = "SELECT EXTRACT(DAY FROM NGAYDH) AS day, SUM(TRIGIA) AS revenue " +
                   "FROM DonHang WHERE EXTRACT(YEAR FROM NGAYDH) = ? AND EXTRACT(MONTH FROM NGAYDH) = ? " +
                   "GROUP BY EXTRACT(DAY FROM NGAYDH) ORDER BY day";
    try (PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, year);
        ps.setInt(2, month);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int day = rs.getInt("day");
                double revenue = rs.getDouble("revenue");
                revenueData.put(day, revenue);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return revenueData;
}

    
    public static void main (String[] args) {
        new ThongKeDAO();
    }
    
}
