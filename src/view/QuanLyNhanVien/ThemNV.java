package view.QuanLyNhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import view.ConnectDB;

/**
 *
 * @author Tran Thi Kieu Oanh
 */
public class ThemNV extends javax.swing.JFrame {

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public ThemNV() {
        initComponents();
    }
    
    private void xoatrang() {
        jtf_manql.setText("");
        jtf_ten.setText("");
        jtf_ngsinh.setText("");
        jtf_gioitinh.setText("");
        jtf_diachi.setText("");
        jtf_sdt.setText("");
        jtf_ngvl.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgpround1 = new view.panelBackgpround();
        jPanel1 = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_noidung = new javax.swing.JPanel();
        jLabel_ten = new javax.swing.JLabel();
        jLabel_sdt = new javax.swing.JLabel();
        jLabel_diachi = new javax.swing.JLabel();
        jtf_ten = new javax.swing.JTextField();
        jtf_ngsinh = new javax.swing.JTextField();
        jtf_diachi = new javax.swing.JTextField();
        jLabel_ngayvl = new javax.swing.JLabel();
        jLabel_ngsinh = new javax.swing.JLabel();
        jtf_sdt = new javax.swing.JTextField();
        jtf_ngvl = new javax.swing.JTextField();
        jLabel_manql = new javax.swing.JLabel();
        jtf_manql = new javax.swing.JTextField();
        jLabel_gioitinh = new javax.swing.JLabel();
        jtf_gioitinh = new javax.swing.JTextField();
        jLabel_matk = new javax.swing.JLabel();
        jtf_matk = new javax.swing.JTextField();
        jButton_huy = new javax.swing.JButton();
        jButton_them = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 237, 224));
        jPanel1.setForeground(new java.awt.Color(148, 135, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("THÊM NHÂN VIÊN");

        jSeparator1.setForeground(new java.awt.Color(94, 42, 14));

        jPanel_noidung.setBackground(new java.awt.Color(245, 237, 224));

        jLabel_ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ten.setText("Tên nhân viên");

        jLabel_sdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_sdt.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_sdt.setText("Số điện thoại");

        jLabel_diachi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_diachi.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_diachi.setText("Địa chỉ");

        jtf_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_ten.setForeground(new java.awt.Color(94, 42, 14));

        jtf_ngsinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_ngsinh.setForeground(new java.awt.Color(94, 42, 14));

        jtf_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_diachi.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_ngayvl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ngayvl.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ngayvl.setText("Ngày vào làm");

        jLabel_ngsinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ngsinh.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ngsinh.setText("Ngày sinh");

        jtf_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_sdt.setForeground(new java.awt.Color(94, 42, 14));

        jtf_ngvl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_ngvl.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_manql.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_manql.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_manql.setText("Mã người quản lý");

        jtf_manql.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_manql.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_gioitinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_gioitinh.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_gioitinh.setText("Giới tính");

        jtf_gioitinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_gioitinh.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_matk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_matk.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_matk.setText("Mã tài khoản");

        jtf_matk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtf_matk.setForeground(new java.awt.Color(94, 42, 14));

        javax.swing.GroupLayout jPanel_noidungLayout = new javax.swing.GroupLayout(jPanel_noidung);
        jPanel_noidung.setLayout(jPanel_noidungLayout);
        jPanel_noidungLayout.setHorizontalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_manql, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_manql, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_ngsinh)
                            .addComponent(jtf_ten)
                            .addComponent(jtf_gioitinh)))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_ngayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_ngvl))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_sdt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_diachi, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_matk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_matk)))
                .addContainerGap())
        );
        jPanel_noidungLayout.setVerticalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_manql, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_manql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_matk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_matk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ngayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_ngvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton_huy.setBackground(new java.awt.Color(94, 42, 14));
        jButton_huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_huy.setForeground(new java.awt.Color(255, 255, 255));
        jButton_huy.setText("HỦY");
        jButton_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_huyActionPerformed(evt);
            }
        });

        jButton_them.setBackground(new java.awt.Color(94, 42, 14));
        jButton_them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_them.setText("THÊM");
        jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jPanel_noidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_huy)
                .addGap(34, 34, 34)
                .addComponent(jButton_them)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_noidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huy)
                    .addComponent(jButton_them))
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themActionPerformed
        conn = cn.getConnection();
        try {
            // Kiểm tra dữ liệu đầu vào
            if (jtf_manql.getText().isEmpty() || jtf_ten.getText().isEmpty() || jtf_ngsinh.getText().isEmpty()
                    || jtf_gioitinh.getText().isEmpty() || jtf_diachi.getText().isEmpty() || jtf_sdt.getText().isEmpty()
                    || jtf_ngvl.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bạn cần nhập đủ dữ liệu");
                return;
            }

            // Kiểm tra xem nhân viên đã tồn tại chưa
            String sql_check = "SELECT 1 FROM NHANVIEN WHERE MANQL = ? AND HOTEN = ? AND NGSINH = ? AND GIOITINH = ? AND DIACHI = ? AND SODT = ? AND NGVL = ?";
            try (PreparedStatement pstCheck = conn.prepareStatement(sql_check)) {
                pstCheck.setString(1, jtf_manql.getText());
                pstCheck.setString(2, jtf_ten.getText());
                pstCheck.setString(3, jtf_ngsinh.getText());
                pstCheck.setString(4, jtf_gioitinh.getText());
                pstCheck.setString(5, jtf_diachi.getText());
                pstCheck.setString(6, jtf_sdt.getText());
                pstCheck.setString(7, jtf_ngvl.getText());

                try (ResultSet rsCheck = pstCheck.executeQuery()) {
                    if (rsCheck.next()) {
                        JOptionPane.showMessageDialog(this, "Nhân viên này đã tồn tại");
                        return;
                    }
                }
            }

            // Kiểm tra xem quản lý có tồn tại hay không
            String sql_check_manager = "SELECT 1 FROM NHANVIEN WHERE MANV = ?";
            try (PreparedStatement pstManagerCheck = conn.prepareStatement(sql_check_manager)) {
                pstManagerCheck.setString(1, jtf_manql.getText());

                try (ResultSet rsManagerCheck = pstManagerCheck.executeQuery()) {
                    if (!rsManagerCheck.next()) {
                        JOptionPane.showMessageDialog(this, "Quản lý không tồn tại");
                        return;
                    }
                }
            }

            // Lấy MANV mới
            int newMANV;
            String sqlMaxManv = "SELECT NVL(MAX(MANV), 0) + 1 AS NEW_MANV FROM NHANVIEN";
            try (PreparedStatement pstMaxManv = conn.prepareStatement(sqlMaxManv); ResultSet rsMaxManv = pstMaxManv.executeQuery()) {
                newMANV = rsMaxManv.next() ? rsMaxManv.getInt("NEW_MANV") : 1;
            }

            // Thêm mới nhân viên vào bảng NHANVIEN mà không có MATK
            String sqlInsertNhanVien = "INSERT INTO NHANVIEN (MANV, MANQL, MATK, HOTEN, NGSINH, GIOITINH, DIACHI, SODT, NGVL) VALUES (?, ?, NULL, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstInsertNhanVien = conn.prepareStatement(sqlInsertNhanVien)) {
                pstInsertNhanVien.setInt(1, newMANV);
                pstInsertNhanVien.setString(2, jtf_manql.getText());
                pstInsertNhanVien.setString(3, jtf_ten.getText());
                pstInsertNhanVien.setString(4, jtf_ngsinh.getText());
                pstInsertNhanVien.setString(5, jtf_gioitinh.getText());
                pstInsertNhanVien.setString(6, jtf_diachi.getText());
                pstInsertNhanVien.setString(7, jtf_sdt.getText());
                pstInsertNhanVien.setString(8, jtf_ngvl.getText());

                int kq = pstInsertNhanVien.executeUpdate();
                if (kq > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm mới thành công");
                    xoatrang();
                    jpanel_QLNV panelQLNV = new jpanel_QLNV();
                    panelQLNV.showTableData();
                    this.dispose();

                    // Thêm tài khoản mới cho nhân viên
                    int newMATK;
                    String sqlMaxMatk = "SELECT NVL(MAX(MATK), 0) + 1 AS NEW_MATK FROM TAIKHOAN";
                    try (PreparedStatement pstMaxMatk = conn.prepareStatement(sqlMaxMatk); ResultSet rsMaxMatk = pstMaxMatk.executeQuery()) {
                        newMATK = rsMaxMatk.next() ? rsMaxMatk.getInt("NEW_MATK") : 1;
                    }

                    // Cập nhật MATK cho nhân viên mới thêm
                    String sqlUpdateMatk = "UPDATE NHANVIEN SET MATK = ? WHERE MANV = ?";
                    try (PreparedStatement pstUpdateMatk = conn.prepareStatement(sqlUpdateMatk)) {
                        pstUpdateMatk.setInt(1, newMATK);
                        pstUpdateMatk.setInt(2, newMANV);
                        pstUpdateMatk.executeUpdate();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm mới thất bại");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi SQL: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                System.out.println("Lỗi đóng kết nối: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_themActionPerformed

    private void jButton_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_huyActionPerformed
        // TODO add your handling code here:
        jpanel_QLNV panelQLNV = new jpanel_QLNV();
        panelQLNV.showTableData();
        // Đóng frame hiện tại
        this.dispose();
    }//GEN-LAST:event_jButton_huyActionPerformed

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
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huy;
    private javax.swing.JButton jButton_them;
    private javax.swing.JLabel jLabel_diachi;
    private javax.swing.JLabel jLabel_gioitinh;
    private javax.swing.JLabel jLabel_manql;
    private javax.swing.JLabel jLabel_matk;
    private javax.swing.JLabel jLabel_ngayvl;
    private javax.swing.JLabel jLabel_ngsinh;
    private javax.swing.JLabel jLabel_sdt;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_noidung;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtf_diachi;
    private javax.swing.JTextField jtf_gioitinh;
    private javax.swing.JTextField jtf_manql;
    private javax.swing.JTextField jtf_matk;
    private javax.swing.JTextField jtf_ngsinh;
    private javax.swing.JTextField jtf_ngvl;
    private javax.swing.JTextField jtf_sdt;
    private javax.swing.JTextField jtf_ten;
    private view.panelBackgpround panelBackgpround1;
    // End of variables declaration//GEN-END:variables
}
