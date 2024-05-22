/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author QUYEN
 */
public class ConnectDB {
    public Connection getConnection() {
        Connection conn = null; 
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String uname = "c##QuanLyCuaHangBanTrangSuc";
            String upass = "userpass";
            conn = DriverManager.getConnection(url, uname, upass); 
            if (conn != null)
                System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
    
}
