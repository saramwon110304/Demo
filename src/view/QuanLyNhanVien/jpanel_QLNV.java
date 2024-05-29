package view.QuanLyNhanVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import view.ConnectDB;
import view.MainFrame;


public class jpanel_QLNV extends javax.swing.JPanel {

    Connection conn = null;
    ConnectDB cn = new ConnectDB();
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public jpanel_QLNV() {
        initComponents();
        showTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_DieuKhien = new javax.swing.JPanel();
        jtf_search = new javax.swing.JTextField();
        jButton_Search = new javax.swing.JButton();
        jButton_Them = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Xoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_NV = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(765, 600));

        jpanel_DieuKhien.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_DieuKhien.setOpaque(false);
        jpanel_DieuKhien.setPreferredSize(new java.awt.Dimension(765, 150));

        jtf_search.setForeground(new java.awt.Color(94, 42, 14));
        jtf_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_searchActionPerformed(evt);
            }
        });

        jButton_Search.setBackground(new java.awt.Color(94, 42, 14));
        jButton_Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Search.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Search.setText("Tìm kiếm");
        jButton_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SearchActionPerformed(evt);
            }
        });

        jButton_Them.setBackground(new java.awt.Color(94, 42, 14));
        jButton_Them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Them.setText("Thêm nhân viên");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_Update.setBackground(new java.awt.Color(147, 94, 64));
        jButton_Update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Chỉnh sửa");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Xoa.setBackground(new java.awt.Color(193, 149, 120));
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
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Them)
                    .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_Search)
                        .addComponent(jtf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jButton_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Xoa)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTable_NV.setBackground(new java.awt.Color(245, 237, 224));
        jTable_NV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_NV.setForeground(new java.awt.Color(193, 149, 120));
        jTable_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NHÂN VIÊN", "MÃ NQL", "MÃ TÀI KHOẢN", "HỌ TÊN", "NGÀY SINH", "GIỚI TÍNH", "ĐỊA CHỈ", "SỐ ĐIỆN THOẠI", "NGÀY VÀO LÀM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_NV.setGridColor(new java.awt.Color(255, 255, 255));
        jTable_NV.setSelectionBackground(new java.awt.Color(193, 149, 120));
        jTable_NV.setSelectionForeground(new java.awt.Color(193, 149, 120));
        jTable_NV.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable_NV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed
        // TODO add your handling code here:
        ThemNVFrame();
    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_NV.getSelectedRow();

        if (selectedRow >= 0) {
            try {
                TableModel model = jTable_NV.getModel();
                int maNhanVien = (int) model.getValueAt(selectedRow, 0);
                int maNQL = (int) model.getValueAt(selectedRow, 1);
                int maTaiKhoan = (int) model.getValueAt(selectedRow, 2);
                String tenNhanVien = (String) model.getValueAt(selectedRow, 3);
                java.sql.Date ngaySinh = (java.sql.Date) model.getValueAt(selectedRow, 4);
                String gioiTinh = (String) model.getValueAt(selectedRow, 5);
                String diaChi = (String) model.getValueAt(selectedRow, 6);
                String soDienThoai = (String) model.getValueAt(selectedRow, 7);
                java.sql.Date ngayVaoLam = (java.sql.Date) model.getValueAt(selectedRow, 8); // Sử dụng java.sql.Date
                
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                String ngaySinhFormatted = sdf.format(ngaySinh);
                String ngayVaoLamFormatted = sdf.format(ngayVaoLam);

                SuaNV suaNVFrame = new SuaNV(maNhanVien, maNQL, maTaiKhoan, tenNhanVien, ngaySinh, gioiTinh, diaChi, soDienThoai, ngayVaoLam);
                suaNVFrame.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Lỗi: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hàng để chỉnh sửa.", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XoaActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable_NV.getSelectedRow();

        if (selectedRow >= 0) {
            TableModel model = jTable_NV.getModel();
            int maNhanVien = (int) model.getValueAt(selectedRow, 0);

            XacNhanXoaFrame(maNhanVien, (DefaultTableModel) model);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để xóa");
        }
    }//GEN-LAST:event_jButton_XoaActionPerformed

    private void jButton_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SearchActionPerformed
        // TODO add your handling code here:
        String searchText = jtf_search.getText().trim();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Thực hiện tìm kiếm trong cơ sở dữ liệu
        try {
            conn = cn.getConnection();
            // Câu truy vấn SQL tìm kiếm dựa trên các cột: mã nhân viên, tên nhân viên, số điện thoại
            String sql = "SELECT * FROM NHANVIEN WHERE MANV LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchText + "%");
            rs = pst.executeQuery();

            // Lấy mô hình bảng và xóa các dòng hiện tại
            DefaultTableModel model = (DefaultTableModel) jTable_NV.getModel();
            model.setRowCount(0);

            // Thêm các dòng kết quả tìm kiếm vào bảng
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MANV"),
                    rs.getInt("MANQL"),
                    rs.getInt("MATK"),
                    rs.getString("HOTEN"),
                    rs.getDate("NGSINH"),
                    rs.getString("GIOITINH"),
                    rs.getString("DIACHI"),
                    rs.getString("SODT"),
                    rs.getDate("NGVL")
                };
                model.addRow(rowData);
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
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
                JOptionPane.showMessageDialog(this, "Lỗi khi đóng kết nối cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_SearchActionPerformed

    private void jtf_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_searchActionPerformed
        // TODO add your handling code here:
        String searchText = jtf_search.getText().trim();

        if (searchText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập thông tin tìm kiếm", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Thực hiện tìm kiếm trong cơ sở dữ liệu
        try {
            conn = cn.getConnection();
            // Câu truy vấn SQL tìm kiếm dựa trên các cột: mã nhân viên, tên nhân viên, số điện thoại
            String sql = "SELECT * FROM NHANVIEN WHERE MANV LIKE ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + searchText + "%");
            rs = pst.executeQuery();

            // Lấy mô hình bảng và xóa các dòng hiện tại
            DefaultTableModel model = (DefaultTableModel) jTable_NV.getModel();
            model.setRowCount(0);

            // Thêm các dòng kết quả tìm kiếm vào bảng
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MANV"),
                    rs.getInt("MANQL"),
                    rs.getInt("MATK"),
                    rs.getString("HOTEN"),
                    rs.getDate("NGSINH"),
                    rs.getString("GIOITINH"),
                    rs.getString("DIACHI"),
                    rs.getString("SODT"),
                    rs.getDate("NGVL")
                };
                model.addRow(rowData);
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy kết quả nào", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } finally {
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
                JOptionPane.showMessageDialog(this, "Lỗi khi đóng kết nối cơ sở dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jtf_searchActionPerformed
    
    private void ThemNVFrame() {
        ThemNV themNV = new ThemNV();
        themNV.setVisible(true);
    }
    
    private void XacNhanXoaFrame(int maNhanVien, DefaultTableModel model) {
        XacNhanXoa xacnhanxoa = new XacNhanXoa(maNhanVien);
        xacnhanxoa.setVisible(true);

        xacnhanxoa.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                boolean confirmed = xacnhanxoa.isConfirmed();

                if (confirmed) {
                    try (Connection conn = cn.getConnection()) {
                        conn.setAutoCommit(false);

                        String sqlDeleteAccount = "DELETE FROM TAIKHOAN WHERE MANV = ?";
                        try (PreparedStatement pst = conn.prepareStatement(sqlDeleteAccount)) {
                            pst.setInt(1, maNhanVien);
                            pst.executeUpdate();
                        }

                        String sqlDeleteEmployee = "DELETE FROM NHANVIEN WHERE MANV = ?";
                        try (PreparedStatement pst = conn.prepareStatement(sqlDeleteEmployee)) {
                            pst.setInt(1, maNhanVien);
                            int rowsAffected = pst.executeUpdate();

                            if (rowsAffected > 0) {
                                conn.commit();
                                JOptionPane.showMessageDialog(null, "Xóa thành công");
                                updateMATKInTable(model);
                            } else {
                                conn.rollback();
                                JOptionPane.showMessageDialog(null, "Không có nhân viên nào được xóa");
                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Lỗi xóa nhân viên: " + e.getMessage());
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Đã hủy xóa nhân viên");
                }
            }
        });
    }

    private void updateMATKInTable(DefaultTableModel model) {
        try (Connection conn = cn.getConnection()) {
            String sql = "SELECT MANV, MATK FROM NHANVIEN";
            try (PreparedStatement pst = conn.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    int maNV = rs.getInt("MANV");
                    int maTK = rs.getInt("MATK");
                    int rowIndex = findRowIndex(model, maNV);
                    if (rowIndex != -1) {
                        model.setValueAt(maTK, rowIndex, 2);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private int findRowIndex(DefaultTableModel model, int maNV) {
        for (int i = 0; i < model.getRowCount(); i++) {
            if (Integer.parseInt(model.getValueAt(i, 0).toString()) == maNV) {
                return i;
            }
        }
        return -1;
    }

    public void showTableData() {
        try {
            conn = cn.getConnection();
            String sql = "SELECT NV.MANV, NV.MANQL, TK.MATK, NV.HOTEN, NV.NGSINH, NV.GIOITINH, NV.DIACHI, NV.SODT, NV.NGVL "
                    + "FROM NHANVIEN NV "
                    + "JOIN TAIKHOAN TK ON NV.MANV = TK.MANV";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable_NV.getModel();
            model.setRowCount(0); // Clear existing rows in the table before populating it with new data

            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("MANV"),
                    rs.getInt("MANQL"),
                    rs.getInt("MATK"),
                    rs.getString("HOTEN"), 
                    rs.getDate("NGSINH"),
                    rs.getString("GIOITINH"),
                    rs.getString("DIACHI"),
                    rs.getString("SODT"),
                    rs.getDate("NGVL")
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
            JFrame frame = new JFrame("Quản lý nhân viên");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thêm dòng này để đặt thao tác khi đóng cửa sổ
            frame.getContentPane().add(new jpanel_QLNV()); // Thêm JPanel vào JFrame
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
    private javax.swing.JTable jTable_NV;
    private javax.swing.JPanel jpanel_DieuKhien;
    private javax.swing.JTextField jtf_search;
    // End of variables declaration//GEN-END:variables
}
