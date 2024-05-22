package view.QuanLySanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.ConnectDB;

public class jpanel_QLSP extends javax.swing.JPanel {

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    ResultSet rs = null;
    PreparedStatement pst = null;

    public jpanel_QLSP() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_DieuKhien = new javax.swing.JPanel();
        jTextField_Search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jButton_Them = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_SP = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(765, 600));

        jpanel_DieuKhien.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_DieuKhien.setOpaque(false);
        jpanel_DieuKhien.setPreferredSize(new java.awt.Dimension(765, 150));

        jTextField_Search.setForeground(new java.awt.Color(94, 42, 14));
        jTextField_Search.setPreferredSize(new java.awt.Dimension(805, 75));
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButton_Search.setBackground(new java.awt.Color(94, 42, 14));
        jButton_Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Search.setText("Tìm kiếm");
        jButton_Search.setPreferredSize(new java.awt.Dimension(94, 27));
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jButton_Them.setBackground(new java.awt.Color(94, 42, 14));
        jButton_Them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Them.setText("Thêm sản phẩm");
        jButton_Them.setPreferredSize(new java.awt.Dimension(94, 27));
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Update.setBackground(new java.awt.Color(112, 71, 47));
        jButton_Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Chỉnh sửa");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Xoa.setBackground(new java.awt.Color(147, 94, 64));
        jButton_Xoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Xoa.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Xoa.setText("Xóa");
        jButton_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_DieuKhienLayout = new javax.swing.GroupLayout(jpanel_DieuKhien);
        jpanel_DieuKhien.setLayout(jpanel_DieuKhienLayout);
        jpanel_DieuKhienLayout.setHorizontalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_DieuKhienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                        .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Update))
                    .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Xoa)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTable_SP.setBackground(new java.awt.Color(245, 237, 224));
        jTable_SP.setForeground(new java.awt.Color(193, 149, 120));
        jTable_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ SẢN PHẨM", "MÃ LOẠI", "TÊN SẢN PHẨM", "ĐƠN VỊ TÍNH", "GIÁ NHẬP", "GIÁ BÁN", "SỐ LƯỢNG", "MÔ TẢ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_SP.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_SP.setSelectionBackground(new java.awt.Color(193, 149, 120));
        jTable_SP.setSelectionForeground(new java.awt.Color(193, 149, 120));
        jScrollPane1.setViewportView(jTable_SP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
        String searchTerm = jTextField_Search.getText();

        try {
            conn = cn.getConnection();
            String sql = "SELECT * FROM SANPHAM WHERE MASP LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchTerm + "%");
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_SP.getModel();
            model.setRowCount(0); // Clear existing rows in the table before populating it with new data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MASP"),
                    rs.getInt("MALOAI"),
                    rs.getString("TENSP"),
                    rs.getString("DVT"),
                    rs.getDouble("GIANHAP"),
                    rs.getDouble("GIABAN"),
                    rs.getInt("SOLUONG"),
                    rs.getString("MOTA")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage());
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
                JOptionPane.showMessageDialog(this, "Error closing database resources: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        ThemSPFrame();
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_SP.getSelectedRow();
       
        if (selectedRow >= 0) {
            TableModel model = jTable_SP.getModel();
            int maSanPham = (int) model.getValueAt(selectedRow, 0);
            int maLoai = (int) model.getValueAt(selectedRow, 1);
            String tenSanPham = (String) model.getValueAt(selectedRow, 2);
            String dvt = (String) model.getValueAt(selectedRow, 3);
            double giaNhap = (double) model.getValueAt(selectedRow, 4);
            double giaBan = (double) model.getValueAt(selectedRow, 5);
            int soLuong = (int) model.getValueAt(selectedRow, 6);
            String moTa = (String) model.getValueAt(selectedRow, 7);
            
            // Tạo instance của SuaSP với thông tin sản phẩm và hiển thị
            SuaSP suaSPFrame = new SuaSP(maSanPham, maLoai, tenSanPham, dvt, giaNhap, giaBan, soLuong, moTa);
            suaSPFrame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để chỉnh sửa.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_SP.getSelectedRow();

        if (selectedRow >= 0) {
            TableModel model = jTable_SP.getModel();
            int maSanPham = (int) model.getValueAt(selectedRow, 0);

            // Call XacNhanXoaFrame and pass the maKhachHang
            XacNhanXoaFrame(maSanPham);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một sản phẩm để xóa");
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        String searchTerm = jTextField_Search.getText();

        try {
            conn = cn.getConnection();
            String sql = "SELECT * FROM SANPHAM WHERE MASP LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchTerm + "%");
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_SP.getModel();
            model.setRowCount(0); // Clear existing rows in the table before populating it with new data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MASP"),
                    rs.getInt("MALOAI"),
                    rs.getString("TENSP"),
                    rs.getString("DVT"),
                    rs.getDouble("GIANHAP"),
                    rs.getDouble("GIABAN"),
                    rs.getInt("SOLUONG"),
                    rs.getString("MOTA")
                };
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching data from database: " + e.getMessage());
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
                JOptionPane.showMessageDialog(this, "Error closing database resources: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed
    
    private void ThemSPFrame() {
        ThemSP themSP = new ThemSP();
        themSP.setVisible(true);
    }

    private void XacNhanXoaFrame(int maSanPham) {
        // Initialize XacNhanXoa frame with maKhachHang
        XacNhanXoa xacnhanxoa = new XacNhanXoa(maSanPham);

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
                        String sql = "DELETE FROM SANPHAM WHERE MASP = ?";
                        try (PreparedStatement pst = conn.prepareStatement(sql)) {
                            pst.setInt(1, maSanPham);

                            int rowsAffected = pst.executeUpdate();

                            if (rowsAffected > 0) {
                                JOptionPane.showMessageDialog(null, "Xóa thành công");
                                // Refresh or update your table here if needed
                            } else {
                                JOptionPane.showMessageDialog(null, "Không có sản phẩm nào được xóa");
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi xóa sản phẩm: " + e.getMessage());
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Đã hủy xóa sản phẩm");
                }
            }
        });
    }
    
    public void showTableData() {
        try {
            conn = cn.getConnection();
            String sql = "SELECT * FROM SANPHAM";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_SP.getModel();
            model.setRowCount(0); // Clear existing rows in the table before populating it with new data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MASP"), 
                    rs.getInt("MALOAI"),
                    rs.getString("TENSP"), // Lấy chuỗi từ cột HOTEN
                    rs.getString("DVT"),
                    rs.getDouble("GIANHAP"),
                    rs.getDouble("GIABAN"),
                    rs.getInt("SOLUONG"),
                    rs.getString("MOTA")
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
                JFrame frame = new JFrame("Quản lý sản phẩm");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thêm dòng này để đặt thao tác khi đóng cửa sổ
                frame.getContentPane().add(new jpanel_QLSP()); // Thêm JPanel vào JFrame
                frame.pack(); // Tự động điều chỉnh kích thước cửa sổ
                frame.setVisible(true); // Hiển thị cửa sổ
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Search;
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JButton jButton_Xoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_SP;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JPanel jpanel_DieuKhien;
    // End of variables declaration//GEN-END:variables
}
