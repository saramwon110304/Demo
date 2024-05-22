package controller;

import view.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.QuanLyDonHang.jpanel_QuanLyDonHang;
import view.QuanLyKhachHang.jpanel_QLKH;
import view.QuanLyNhanVien.jpanel_QLNV;
import view.QuanLySanPham.jpanel_QLSP;
import view.QuanLyTaiKhoan.jpanel_QuanLyTaiKhoan;
import view.ThongKe.jpanel_ThongKe;

public class ChuyenManHinhController {
    private JPanel rootPanel;
    private JFrame mainFrame;
    private String selectedScreen = "";

    public ChuyenManHinhController(JPanel rootPanel, JFrame mainFrame) {
        this.rootPanel = rootPanel;
        this.mainFrame = mainFrame;
    }

    public void setView(JPanel panel, JLabel label, String screenName) {
        selectedScreen = screenName;
        panel.setBackground(new Color(177, 137, 101));
        label.setBackground(new Color(177, 137, 101));

        rootPanel.removeAll();
        rootPanel.setLayout(new BorderLayout());

        JPanel screenPanel = getScreenPanel(screenName);
        rootPanel.add(screenPanel, BorderLayout.CENTER);
        rootPanel.validate();
        rootPanel.repaint();
    }

    private JPanel getScreenPanel(String screenName) {
        switch (screenName) {
            case "TaiKhoan":
                return new jpanel_QuanLyTaiKhoan();
            case "NhanVien":
                return new jpanel_QLNV();
            case "SanPham":
                return new jpanel_QLSP();
            case "DonHang":
                return new jpanel_QuanLyDonHang();
            case "KhachHang":
                return new jpanel_QLKH();
            case "ThongKe":
                return new jpanel_ThongKe();
            case "Logout":
                mainFrame.dispose();
                DangNhap dangNhapFrame = new DangNhap();
                dangNhapFrame.setTitle("Đăng nhập");
                dangNhapFrame.setResizable(false);
                dangNhapFrame.setLocationRelativeTo(null);
                dangNhapFrame.setVisible(true);
                return new JPanel(); 
            default:
                return new JPanel(); 
        }
    }

    public void setEvent(JPanel[] panels, JLabel[] labels) {
        for (int i = 0; i < panels.length; i++) {
            JPanel panel = panels[i];
            JLabel label = labels[i];
            String screenName = getScreenName(label);

            panel.addMouseListener(new PanelMouseAdapter(panel, label, screenName));
        }
    }

    private String getScreenName(JLabel label) {
        if (label.getText().equals("TÀI KHOẢN")) return "TaiKhoan";
        if (label.getText().equals("NHÂN VIÊN")) return "NhanVien";
        if (label.getText().equals("SẢN PHẨM")) return "SanPham";
        if (label.getText().equals("ĐƠN HÀNG")) return "DonHang";
        if (label.getText().equals("KHÁCH HÀNG")) return "KhachHang";
        if (label.getText().equals("THỐNG KÊ")) return "ThongKe";
        if (label.getText().equals("LOGOUT")) return "Logout";
        return "";
    }

    class PanelMouseAdapter extends MouseAdapter {
        private JPanel panel;
        private JLabel label;
        private String screenName;

        public PanelMouseAdapter(JPanel panel, JLabel label, String screenName) {
            this.panel = panel;
            this.label = label;
            this.screenName = screenName;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            setView(panel, label, screenName);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(new Color(177, 137, 101));
            label.setBackground(new Color(177, 137, 101));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!screenName.equals(selectedScreen)) {
                panel.setBackground(new Color(245, 237, 224));
                label.setBackground(new Color(245, 237, 224));
            }
        }
    }
}
