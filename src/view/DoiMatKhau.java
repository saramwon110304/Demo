/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author QUYEN
 */
public class DoiMatKhau extends javax.swing.JFrame {

    Connection conn = null; 
    PreparedStatement pst = null; 
    ResultSet rs = null; 
    
    public DoiMatKhau() {
        initComponents();
        KetNoiData();
    }
    
    public void KetNoiData() {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";
            String uname = "c##QuanLyCuaHangTrangSuc";
            String upass = "userpass";
            conn = DriverManager.getConnection(url, uname, upass);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void DangNhap() {
        DangNhap dangnhap = new DangNhap();
        dangnhap.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        jpass1 = new javax.swing.JPasswordField();
        jpass2 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jlbtendangnhap = new javax.swing.JLabel();
        jlbmanv = new javax.swing.JLabel();
        jlbmkmoi = new javax.swing.JLabel();
        jcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 237, 224));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(52, 28, 11));
        jLabel2.setText("Tên đăng nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 28, 11));
        jLabel3.setText("Xác nhận mật khẩu");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 28, 11));
        jLabel4.setText("Mật khẩu mới");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(52, 28, 11));
        jLabel5.setText("Mã nhân viên");

        jname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jname.setForeground(new java.awt.Color(52, 28, 11));

        jpass1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpass1.setForeground(new java.awt.Color(52, 28, 11));
        jpass1.setText("matkhau");

        jpass2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jpass2.setForeground(new java.awt.Color(52, 28, 11));
        jpass2.setText("matkhau");

        jButton1.setBackground(new java.awt.Color(193, 149, 120));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(52, 28, 11));
        jButton1.setText("Đổi mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlbtendangnhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbtendangnhap.setForeground(new java.awt.Color(255, 51, 51));

        jlbmanv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbmanv.setForeground(new java.awt.Color(255, 51, 51));

        jlbmkmoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlbmkmoi.setForeground(new java.awt.Color(255, 51, 51));

        jcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcode.setForeground(new java.awt.Color(52, 28, 11));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbmkmoi, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jlbmanv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpass1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpass2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbtendangnhap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jcode))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jlbtendangnhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jlbmanv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jpass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbmkmoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String un = jname.getText();
        String code = jcode.getText();
        String ps1 = jpass1.getText();
        String ps2 = jpass2.getText();

        String sql = "SELECT * FROM TAIKHOAN WHERE TENDNHAP=' "+un+"' AND MANV=' "+code+"' ";
        String sql1 = "UPDATE TAIKHOAN SET MATKHAU=' "+ps1+"' WHERE TENDNHAP=' +"+un+"'";
        try {
            pst = conn.prepareCall(sql);
            pst.setString(1, un); //Tên đăng nhập
            pst.setString(2, code); //Mã nhân viên
            rs = pst.executeQuery();

            if (rs.next()) {
                if (rs.getString("TENDNHAP").equals(un) && rs.getString("MANV").equals(code)) {
                    jlbtendangnhap.setText("");
                    if (ps2.equals(ps1)) {
                        jlbmkmoi.setText("");
                        pst.executeUpdate(sql1);
                        JOptionPane.showMessageDialog(null, "Bạn đã đổi mật khẩu thành công");
                    }
                    else {
                        jlbmkmoi.setText("Mật khẩu xác nhận chưa trùng khớp");
                    }

                }
                else {
                    jlbtendangnhap.setText("Tên đăng nhập không tồn tại");
                    jlbmanv.setText("Mã nhân viên không tồn tại");
                }
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jcode;
    private javax.swing.JLabel jlbmanv;
    private javax.swing.JLabel jlbmkmoi;
    private javax.swing.JLabel jlbtendangnhap;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpass1;
    private javax.swing.JPasswordField jpass2;
    // End of variables declaration//GEN-END:variables
}
