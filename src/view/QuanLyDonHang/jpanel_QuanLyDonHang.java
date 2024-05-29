package view.QuanLyDonHang;

import Model.DonHang;
import Model.TaiKhoan;
import controller.DonHangDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.QuanLyDonHang.jpanel_QuanLyDonHang;
import view.QuanLyTaiKhoan.jframe_ThemTK;
import view.QuanLyTaiKhoan.jpanel_QuanLyTaiKhoan;

/**
 *
 * @author NANG TIEN HANH
 */
public class jpanel_QuanLyDonHang extends javax.swing.JPanel {

    /**
     * Creates new form jpanel_QuanLyDonHang
     */
    private List<DonHang> donhang;
    private DefaultTableModel ModelDH;

    public jpanel_QuanLyDonHang() {
        initComponents();
        ModelDH = (DefaultTableModel) jtable_BangDH.getModel();
        showTableDH();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_DieuKhien = new javax.swing.JPanel();
        jpanel_Search = new javax.swing.JPanel();
        jtextfield_Search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jbutton_TaoDH = new javax.swing.JButton();
        jbutton_XoaDH = new javax.swing.JButton();
        jpanel_BangDH = new javax.swing.JPanel();
        jscrollpane_BangDH = new javax.swing.JScrollPane();
        jtable_BangDH = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(765, 600));

        jpanel_DieuKhien.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_DieuKhien.setOpaque(false);
        jpanel_DieuKhien.setPreferredSize(new java.awt.Dimension(765, 150));

        jpanel_Search.setOpaque(false);

        jtextfield_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfield_SearchActionPerformed(evt);
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

        javax.swing.GroupLayout jpanel_SearchLayout = new javax.swing.GroupLayout(jpanel_Search);
        jpanel_Search.setLayout(jpanel_SearchLayout);
        jpanel_SearchLayout.setHorizontalGroup(
            jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SearchLayout.createSequentialGroup()
                .addComponent(jtextfield_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_SearchLayout.setVerticalGroup(
            jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SearchLayout.createSequentialGroup()
                .addGroup(jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfield_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jbutton_TaoDH.setBackground(new java.awt.Color(94, 42, 14));
        jbutton_TaoDH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_TaoDH.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_TaoDH.setText("Tạo đơn hàng");
        jbutton_TaoDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_TaoDH.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbutton_TaoDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_TaoDHActionPerformed(evt);
            }
        });

        jbutton_XoaDH.setBackground(new java.awt.Color(236, 227, 214));
        jbutton_XoaDH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_XoaDH.setForeground(new java.awt.Color(94, 42, 14));
        jbutton_XoaDH.setText("Xóa đơn hàng");
        jbutton_XoaDH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_XoaDH.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbutton_XoaDH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_XoaDHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_DieuKhienLayout = new javax.swing.GroupLayout(jpanel_DieuKhien);
        jpanel_DieuKhien.setLayout(jpanel_DieuKhienLayout);
        jpanel_DieuKhienLayout.setHorizontalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jpanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbutton_TaoDH, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_XoaDH))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_DieuKhienLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                        .addComponent(jbutton_TaoDH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbutton_XoaDH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jpanel_BangDH.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_BangDH.setOpaque(false);
        jpanel_BangDH.setPreferredSize(new java.awt.Dimension(765, 300));

        jscrollpane_BangDH.setBackground(new java.awt.Color(255, 204, 204));
        jscrollpane_BangDH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jscrollpane_BangDH.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N

        jtable_BangDH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jtable_BangDH.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jtable_BangDH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, "", null},
                {"", "", null, "", null},
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
                "MÃ ĐƠN HÀNG", "MÃ NHÂN VIÊN", "MÃ KHÁCH HÀNG", "NGÀY ĐƠN HÀNG", "TRỊ GIÁ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtable_BangDH.getTableHeader().setResizingAllowed(false);
        jtable_BangDH.getTableHeader().setReorderingAllowed(false);
        jscrollpane_BangDH.setViewportView(jtable_BangDH);

        javax.swing.GroupLayout jpanel_BangDHLayout = new javax.swing.GroupLayout(jpanel_BangDH);
        jpanel_BangDH.setLayout(jpanel_BangDHLayout);
        jpanel_BangDHLayout.setHorizontalGroup(
            jpanel_BangDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_BangDHLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jscrollpane_BangDH, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jpanel_BangDHLayout.setVerticalGroup(
            jpanel_BangDHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_BangDHLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jscrollpane_BangDH, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_BangDH, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_BangDH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtextfield_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfield_SearchActionPerformed
        // TODO add your handling code here:
        // Lấy từ khóa tìm kiếm từ textfield
    String searchText = jtextfield_Search.getText().trim();

        // Kiểm tra xem có từ khóa không
        if (!searchText.isEmpty()) {
            try {
                int MADH = Integer.parseInt(searchText); // Chuyển đổi từ string sang int
                ArrayList<DonHang> resultList = new DonHangDAO().findByMADH(MADH);

                if (!resultList.isEmpty()) {
                    // Hiển thị kết quả tìm kiếm trên bảng
                    DefaultTableModel model = (DefaultTableModel) jtable_BangDH.getModel();
                    model.setRowCount(0); // Xóa dữ liệu cũ

                    for (DonHang dh : resultList) {
                        model.addRow(new Object[]{
                            dh.getMADH(), // Hiển thị MADH trực tiếp
                            dh.getMANV(),
                            dh.getMAKH(),
                            dh.getNGAYDH(),
                            dh.getTRIGIA()
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng với mã đơn hàng: " + MADH, "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
                    showTableDH(); // Hiển thị lại toàn bộ dữ liệu nếu không tìm thấy
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mã đơn hàng phải là số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu không có từ khóa, hiển thị toàn bộ dữ liệu
            showTableSearch();
        }
    }//GEN-LAST:event_jtextfield_SearchActionPerformed

    private void jbutton_TaoDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_TaoDHActionPerformed
        // TODO add your handling code here:
        // Hiển thị JFrame hoặc JDialog khác đã có
        jframe_ThemDonHang frame = new jframe_ThemDonHang(); // Tạo một đối tượng của JFrame mới

        // Hiển thị JFrame hoặc JDialog đã có
        frame.setVisible(true);

        // Hiển thị frame xác nhận xoá như một popup
        frame.setAlwaysOnTop(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                // Sau khi frame xác nhận xoá đóng, gọi phương thức showTable() để cập nhật lại bảng
                showTableDH();
            }
        });
    }//GEN-LAST:event_jbutton_TaoDHActionPerformed

    private void jbutton_XoaDHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_XoaDHActionPerformed
        // TODO add your handling code here:
        // Kiểm tra xem đã chọn hàng trong bảng chưa
        if (jtable_BangDH.getSelectedRow() != -1) {
            // Lấy vị trí mục hàng được chọn
            int selectedIndex = jtable_BangDH.getSelectedRow();
            // Lấy thông tin tài khoản từ danh sách taikhoan
            DonHang dh = donhang.get(selectedIndex);

            // Tạo một instance của frame Xác nhận Xóa
            // Tạo một frame xác nhận xoá và truyền dữ liệu tài khoản vào
            view.QuanLyDonHang.jframe_XacNhanXoaDH xacNhanXoaFrame = new view.QuanLyDonHang.jframe_XacNhanXoaDH();
            xacNhanXoaFrame.setDonHangToDelete(dh);

            // Hiển thị frame xác nhận xoá như một popup
            xacNhanXoaFrame.setAlwaysOnTop(true);
            xacNhanXoaFrame.setVisible(true);

            xacNhanXoaFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    // Sau khi frame xác nhận xoá đóng, gọi phương thức showTable() để cập nhật lại bảng
                    showTableDH();
                }
            });

        } else {
            JOptionPane.showMessageDialog(jpanel_QuanLyDonHang.this, "Hãy chọn một đơn hàng trong bảng");
        }
    }//GEN-LAST:event_jbutton_XoaDHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        // Lấy từ khóa tìm kiếm từ textfield
        String searchText = jtextfield_Search.getText().trim();

        // Kiểm tra xem có từ khóa không
        if (!searchText.isEmpty()) {
            try {
                int MADH = Integer.parseInt(searchText); // Chuyển đổi từ string sang int
                ArrayList<DonHang> resultList = new DonHangDAO().findByMADH(MADH);

                if (!resultList.isEmpty()) {
                    // Hiển thị kết quả tìm kiếm trên bảng
                    DefaultTableModel model = (DefaultTableModel) jtable_BangDH.getModel();
                    model.setRowCount(0); // Xóa dữ liệu cũ

                    for (DonHang dh : resultList) {
                        model.addRow(new Object[]{
                            dh.getMADH(), // Hiển thị MADH trực tiếp
                            dh.getMANV(),
                            dh.getMAKH(),
                            dh.getNGAYDH(),
                            dh.getTRIGIA()
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng với mã đơn hàng: " + MADH, "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
                    showTableDH(); // Hiển thị lại toàn bộ dữ liệu nếu không tìm thấy
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Mã đơn hàng phải là số nguyên.", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Nếu không có từ khóa, hiển thị toàn bộ dữ liệu
            showTableSearch();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main (String args[]) {
        /* Set the Nimbus look and feel */
        
        /*Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new JFrame("Quản lý đơn hàng");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Thêm dòng này để đặt thao tác khi đóng cửa sổ
            frame.getContentPane().add(new jpanel_QuanLyDonHang()); // Thêm JPanel vào JFrame
            frame.pack(); // Tự động điều chỉnh kích thước cửa sổ
            frame.setVisible(true); // Hiển thị cửa sổ
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jbutton_TaoDH;
    private javax.swing.JButton jbutton_XoaDH;
    private javax.swing.JPanel jpanel_BangDH;
    private javax.swing.JPanel jpanel_DieuKhien;
    private javax.swing.JPanel jpanel_Search;
    private javax.swing.JScrollPane jscrollpane_BangDH;
    private javax.swing.JTable jtable_BangDH;
    private javax.swing.JTextField jtextfield_Search;
    // End of variables declaration//GEN-END:variables

    private void showTableDH() {
        donhang = new DonHangDAO().getListDH();
        ModelDH.setRowCount(0);
        for (DonHang dh : donhang) {
            ModelDH.addRow(new Object[]{
                dh.getMADH(), dh.getMANV(), dh.getMAKH(), dh.getNGAYDH(), dh.getTRIGIA()
            });
        }
    }

    // Hàm hiển thị toàn bộ dữ liệu trên bảng
    private void showTableSearch() {
        ArrayList<DonHang> list = new DonHangDAO().getListDH();
        DefaultTableModel model = (DefaultTableModel) jtable_BangDH.getModel();
        model.setRowCount(0);
        for (DonHang dh : list) {
            model.addRow(new Object[]{
                dh.getMADH(), // Hiển thị MADH
                dh.getMANV(),
                dh.getMANV(),
                dh.getNGAYDH(),
                dh.getTRIGIA()
            });
        }

    }
}
