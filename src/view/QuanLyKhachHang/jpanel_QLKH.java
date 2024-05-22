package view.QuanLyKhachHang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.ConnectDB;

public class jpanel_QLKH extends javax.swing.JPanel {

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    ResultSet rs = null;
    PreparedStatement pst = null;  
    
    public jpanel_QLKH() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_DieuKhien = new javax.swing.JPanel();
        jTextField_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonThemKH = new javax.swing.JButton();
        jButtonChinhSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jPanel_bangKH = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_KH = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(765, 600));

        jpanel_DieuKhien.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_DieuKhien.setOpaque(false);
        jpanel_DieuKhien.setPreferredSize(new java.awt.Dimension(765, 150));

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(94, 42, 14));
        jTextField_Search.setPreferredSize(new java.awt.Dimension(805, 75));
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(52, 28, 11));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonThemKH.setBackground(new java.awt.Color(52, 28, 11));
        jButtonThemKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThemKH.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemKH.setText("Thêm khách hàng");
        jButtonThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThemKHActionPerformed(evt);
            }
        });

        jButtonChinhSua.setBackground(new java.awt.Color(94, 42, 14));
        jButtonChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChinhSua.setText("Chỉnh sửa");
        jButtonChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChinhSuaActionPerformed(evt);
            }
        });

        jButtonXoa.setBackground(new java.awt.Color(193, 149, 120));
        jButtonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setText("Xóa");
        jButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_DieuKhienLayout = new javax.swing.GroupLayout(jpanel_DieuKhien);
        jpanel_DieuKhien.setLayout(jpanel_DieuKhienLayout);
        jpanel_DieuKhienLayout.setHorizontalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_DieuKhienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonThemKH)
                    .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jButtonChinhSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButtonXoa)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(245, 237, 224));

        jTable_KH.setBackground(new java.awt.Color(245, 237, 224));
        jTable_KH.setForeground(new java.awt.Color(148, 135, 119));
        jTable_KH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "NGÀY ĐĂNG KÝ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_KH.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_KH.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable_KH);

        javax.swing.GroupLayout jPanel_bangKHLayout = new javax.swing.GroupLayout(jPanel_bangKH);
        jPanel_bangKH.setLayout(jPanel_bangKHLayout);
        jPanel_bangKHLayout.setHorizontalGroup(
            jPanel_bangKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_bangKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
        );
        jPanel_bangKHLayout.setVerticalGroup(
            jPanel_bangKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_bangKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_bangKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_bangKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
        String searchTerm = jTextField_Search.getText().trim();
        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int makh = Integer.parseInt(searchTerm); // Validate if the input is an integer

            try (Connection conn = cn.getConnection()) {
                String sql = "SELECT * FROM KHACHHANG WHERE MAKH LIKE ?";
                try (PreparedStatement pst = conn.prepareStatement(sql)) {
                    String queryParam = "%" + searchTerm + "%";
                    pst.setString(1, queryParam);
                    try (ResultSet rs = pst.executeQuery()) {
                        DefaultTableModel model = (DefaultTableModel) jTable_KH.getModel();
                        model.setRowCount(0); // Clear existing rows in the table before populating it with new data

                        while (rs.next()) {
                            Object[] rowData = {
                                rs.getInt("MAKH"),
                                rs.getString("HOTEN"),
                                rs.getString("DIACHI"),
                                rs.getString("SODT"),
                                rs.getDate("NGDK")
                            };
                            model.addRow(rowData);
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "MAKH phải là số nguyên.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButtonThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThemKHActionPerformed
        // TODO add your handling code here:
        ThemKHFrame();
    }//GEN-LAST:event_jButtonThemKHActionPerformed

    private void jButtonChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChinhSuaActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_KH.getSelectedRow();

        if (selectedRow >= 0) {
            try {
                TableModel model = jTable_KH.getModel();
                int maKhachHang = (int) model.getValueAt(selectedRow, 0);
                String tenKhachHang = (String) model.getValueAt(selectedRow, 1);
                String diaChi = (String) model.getValueAt(selectedRow, 2);
                String soDienThoai = (String) model.getValueAt(selectedRow, 3);
                java.sql.Date ngayDangKy = (java.sql.Date) model.getValueAt(selectedRow, 4); // Sử dụng java.sql.Date

                // Tạo và hiển thị frame SuaKH với thông tin khách hàng
                SuaKH suaKHFrame = new SuaKH(maKhachHang, tenKhachHang, diaChi, soDienThoai, ngayDangKy);
                suaKHFrame.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để chỉnh sửa.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonChinhSuaActionPerformed

    private void jButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_KH.getSelectedRow();

        if (selectedRow >= 0) {
            TableModel model = jTable_KH.getModel();
            int maKhachHang = (int) model.getValueAt(selectedRow, 0);

            // Call XacNhanXoaFrame and pass the maKhachHang
            XacNhanXoaFrame(maKhachHang);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để xóa");
        }
    }//GEN-LAST:event_jButtonXoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String searchTerm = jTextField_Search.getText().trim();
        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int makh = Integer.parseInt(searchTerm); // Validate if the input is an integer

            try (Connection conn = cn.getConnection()) {
                String sql = "SELECT * FROM KHACHHANG WHERE MAKH LIKE ?";
                try (PreparedStatement pst = conn.prepareStatement(sql)) {
                    String queryParam = "%" + searchTerm + "%";
                    pst.setString(1, queryParam);
                    try (ResultSet rs = pst.executeQuery()) {
                        DefaultTableModel model = (DefaultTableModel) jTable_KH.getModel();
                        model.setRowCount(0); // Clear existing rows in the table before populating it with new data

                        while (rs.next()) {
                            Object[] rowData = {
                                rs.getInt("MAKH"),
                                rs.getString("HOTEN"),
                                rs.getString("DIACHI"),
                                rs.getString("SODT"),
                                rs.getDate("NGDK")
                            };
                            model.addRow(rowData);
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "MAKH phải là số nguyên.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void ThemKHFrame() {
        ThemKH themKH = new ThemKH();
        themKH.setVisible(true);
    }
        
    private void XacNhanXoaFrame(int maKhachHang) {
        // Initialize XacNhanXoa frame with maKhachHang
        XacNhanXoa xacnhanxoa = new XacNhanXoa(maKhachHang);

        // Show the XacNhanXoa frame
        xacnhanxoa.setVisible(true);

        // Add a window listener to handle frame closure
        xacnhanxoa.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Retrieve the confirmation status from the XacNhanXoa frame
                boolean confirmed = xacnhanxoa.isConfirmed();

                if (confirmed) {
                    // Proceed with deletion
                    try (Connection conn = cn.getConnection()) {
                        String sql = "DELETE FROM KHACHHANG WHERE MAKH = ?";
                        try (PreparedStatement pst = conn.prepareStatement(sql)) {
                            pst.setInt(1, maKhachHang);

                            int rowsAffected = pst.executeUpdate();

                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Xóa thành công");
                                // Refresh or update your table here if needed
                            } else {
                                JOptionPane.showMessageDialog(null, "Không có khách hàng nào được xóa");
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi xóa khách hàng: " + e.getMessage());
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Đã hủy xóa khách hàng");
                }
            }
        });
    }
    
    public void showTableData() {
        try {
            conn = cn.getConnection();
            String sql = "SELECT * FROM KHACHHANG";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_KH.getModel();
            model.setRowCount(0); // Clear existing rows in the table before populating it with new data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MAKH"), 
                    rs.getString("HOTEN"), // Lấy chuỗi từ cột HOTEN
                    rs.getString("DIACHI"), // Lấy chuỗi từ cột SODT
                    rs.getString("SODT"), // Lấy chuỗi từ cột DIACHI
                    rs.getDate("NGDK")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching data from database: " + e.getMessage());
        } finally {
            // Close resources in reverse order to avoid resource leaks
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing database resources: " + e.getMessage());
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(jpanel_qlkh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jpanel_qlkh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jpanel_qlkh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jpanel_qlkh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>

    /* Create and display the form */
     java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new JFrame("Quản lý khách hàng");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.getContentPane().add(new jpanel_QLKH()); 
            frame.pack(); 
            frame.setVisible(true); 
        }
    });
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonChinhSua;
    private javax.swing.JButton jButtonThemKH;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JPanel jPanel_bangKH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_KH;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JPanel jpanel_DieuKhien;
    // End of variables declaration//GEN-END:variables
}
