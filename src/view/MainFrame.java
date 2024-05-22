package view;

import controller.ChuyenManHinhController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        ChuyenManHinhController controller = new ChuyenManHinhController(jpanel_View, this);

        controller.setEvent(
                new JPanel[]{jpanel_TaiKhoan, jpanel_NhanVien, jpanel_SanPham, jpanel_DonHang, jpanel_KhachHang, jpanel_ThongKe, jpanel_Logout},
                new JLabel[]{jlabel_TaiKhoan, jlabel_NhanVien, jlabel_SanPham, jlabel_DonHang, jlabel_KhachHang, jlabel_ThongKe, jlabel_Logout}
        );

        // Add logout functionality
        jpanel_Logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose(); // Close the current window
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_Root = new view.panelBackgpround();
        jpanel_Menu = new javax.swing.JPanel();
        jpanel_TaiKhoan = new javax.swing.JPanel();
        jlabel_TaiKhoan = new javax.swing.JLabel();
        jpanel_NhanVien = new javax.swing.JPanel();
        jlabel_NhanVien = new javax.swing.JLabel();
        jpanel_SanPham = new javax.swing.JPanel();
        jlabel_SanPham = new javax.swing.JLabel();
        jpanel_DonHang = new javax.swing.JPanel();
        jlabel_DonHang = new javax.swing.JLabel();
        jpanel_KhachHang = new javax.swing.JPanel();
        jlabel_KhachHang = new javax.swing.JLabel();
        jpanel_ThongKe = new javax.swing.JPanel();
        jlabel_ThongKe = new javax.swing.JLabel();
        jpanel_Logout = new javax.swing.JPanel();
        jlabel_Logout = new javax.swing.JLabel();
        jpanel_View = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpanel_Menu.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_Menu.setPreferredSize(new java.awt.Dimension(120, 600));

        jpanel_TaiKhoan.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_TaiKhoan.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_TaiKhoan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_TaiKhoan.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_TaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_TaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/account.png"))); // NOI18N
        jlabel_TaiKhoan.setText("TÀI KHOẢN");
        jlabel_TaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_TaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_TaiKhoan.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_TaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_TaiKhoanLayout = new javax.swing.GroupLayout(jpanel_TaiKhoan);
        jpanel_TaiKhoan.setLayout(jpanel_TaiKhoanLayout);
        jpanel_TaiKhoanLayout.setHorizontalGroup(
            jpanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_TaiKhoanLayout.setVerticalGroup(
            jpanel_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_TaiKhoanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanel_NhanVien.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_NhanVien.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_NhanVien.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_NhanVien.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_NhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_NhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        jlabel_NhanVien.setText("NHÂN VIÊN");
        jlabel_NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabel_NhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_NhanVien.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_NhanVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_NhanVienLayout = new javax.swing.GroupLayout(jpanel_NhanVien);
        jpanel_NhanVien.setLayout(jpanel_NhanVienLayout);
        jpanel_NhanVienLayout.setHorizontalGroup(
            jpanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_NhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_NhanVienLayout.setVerticalGroup(
            jpanel_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_NhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_SanPham.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_SanPham.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_SanPham.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_SanPham.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_SanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_SanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/item.png"))); // NOI18N
        jlabel_SanPham.setText("SẢN PHẨM");
        jlabel_SanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_SanPham.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_SanPham.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_SanPhamLayout = new javax.swing.GroupLayout(jpanel_SanPham);
        jpanel_SanPham.setLayout(jpanel_SanPhamLayout);
        jpanel_SanPhamLayout.setHorizontalGroup(
            jpanel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_SanPhamLayout.setVerticalGroup(
            jpanel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_SanPhamLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlabel_SanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
        );

        jpanel_DonHang.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_DonHang.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_DonHang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_DonHang.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_DonHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_DonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/don-hang.png"))); // NOI18N
        jlabel_DonHang.setText("ĐƠN HÀNG");
        jlabel_DonHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_DonHang.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_DonHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_DonHangLayout = new javax.swing.GroupLayout(jpanel_DonHang);
        jpanel_DonHang.setLayout(jpanel_DonHangLayout);
        jpanel_DonHangLayout.setHorizontalGroup(
            jpanel_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DonHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_DonHangLayout.setVerticalGroup(
            jpanel_DonHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_DonHang, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_KhachHang.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_KhachHang.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_KhachHang.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_KhachHang.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_KhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_KhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/customer.png"))); // NOI18N
        jlabel_KhachHang.setText("KHÁCH HÀNG");
        jlabel_KhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_KhachHang.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_KhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_KhachHangLayout = new javax.swing.GroupLayout(jpanel_KhachHang);
        jpanel_KhachHang.setLayout(jpanel_KhachHangLayout);
        jpanel_KhachHangLayout.setHorizontalGroup(
            jpanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_KhachHangLayout.setVerticalGroup(
            jpanel_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_KhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_ThongKe.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_ThongKe.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_ThongKe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_ThongKe.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_ThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thong-ke.png"))); // NOI18N
        jlabel_ThongKe.setText("THỐNG KÊ");
        jlabel_ThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_ThongKe.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_ThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_ThongKeLayout = new javax.swing.GroupLayout(jpanel_ThongKe);
        jpanel_ThongKe.setLayout(jpanel_ThongKeLayout);
        jpanel_ThongKeLayout.setHorizontalGroup(
            jpanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_ThongKeLayout.setVerticalGroup(
            jpanel_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_ThongKe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jpanel_Logout.setBackground(new java.awt.Color(245, 237, 224));
        jpanel_Logout.setPreferredSize(new java.awt.Dimension(120, 100));

        jlabel_Logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlabel_Logout.setForeground(new java.awt.Color(126, 80, 32));
        jlabel_Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        jlabel_Logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlabel_Logout.setPreferredSize(new java.awt.Dimension(90, 90));
        jlabel_Logout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jpanel_LogoutLayout = new javax.swing.GroupLayout(jpanel_Logout);
        jpanel_Logout.setLayout(jpanel_LogoutLayout);
        jpanel_LogoutLayout.setHorizontalGroup(
            jpanel_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_LogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanel_LogoutLayout.setVerticalGroup(
            jpanel_LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanel_MenuLayout = new javax.swing.GroupLayout(jpanel_Menu);
        jpanel_Menu.setLayout(jpanel_MenuLayout);
        jpanel_MenuLayout.setHorizontalGroup(
            jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_MenuLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_MenuLayout.createSequentialGroup()
                        .addComponent(jpanel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jpanel_TaiKhoan, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jpanel_NhanVien, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jpanel_SanPham, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jpanel_DonHang, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jpanel_KhachHang, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jpanel_ThongKe, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
        );
        jpanel_MenuLayout.setVerticalGroup(
            jpanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_MenuLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jpanel_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_DonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanel_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpanel_View.setFocusable(false);
        jpanel_View.setOpaque(false);
        jpanel_View.setPreferredSize(new java.awt.Dimension(765, 600));

        javax.swing.GroupLayout jpanel_ViewLayout = new javax.swing.GroupLayout(jpanel_View);
        jpanel_View.setLayout(jpanel_ViewLayout);
        jpanel_ViewLayout.setHorizontalGroup(
            jpanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jpanel_ViewLayout.setVerticalGroup(
            jpanel_ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpanel_RootLayout = new javax.swing.GroupLayout(jpanel_Root);
        jpanel_Root.setLayout(jpanel_RootLayout);
        jpanel_RootLayout.setHorizontalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_RootLayout.createSequentialGroup()
                .addComponent(jpanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE))
        );
        jpanel_RootLayout.setVerticalGroup(
            jpanel_RootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
            .addComponent(jpanel_View, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        jpanel_View.getAccessibleContext().setAccessibleName("770");
        jpanel_View.getAccessibleContext().setAccessibleDescription("600");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpanel_Root, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlabel_DonHang;
    private javax.swing.JLabel jlabel_KhachHang;
    private javax.swing.JLabel jlabel_Logout;
    private javax.swing.JLabel jlabel_NhanVien;
    private javax.swing.JLabel jlabel_SanPham;
    private javax.swing.JLabel jlabel_TaiKhoan;
    private javax.swing.JLabel jlabel_ThongKe;
    private javax.swing.JPanel jpanel_DonHang;
    private javax.swing.JPanel jpanel_KhachHang;
    private javax.swing.JPanel jpanel_Logout;
    private javax.swing.JPanel jpanel_Menu;
    private javax.swing.JPanel jpanel_NhanVien;
    private view.panelBackgpround jpanel_Root;
    private javax.swing.JPanel jpanel_SanPham;
    private javax.swing.JPanel jpanel_TaiKhoan;
    private javax.swing.JPanel jpanel_ThongKe;
    private javax.swing.JPanel jpanel_View;
    // End of variables declaration//GEN-END:variables
}
