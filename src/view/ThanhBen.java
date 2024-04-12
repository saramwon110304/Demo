
package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThanhBen {
    public JPanel jpanelThanhben;
    public JLabel jlabel_TaiKhoan;
    public JLabel jlabel_NhanVien;
    public JLabel jlabel_SanPham;
    public JLabel jlabel_DonHang;
    public JLabel jlabel_KhachHang;
    public JLabel jlabel_ThongKe;
    public JLabel jlabel_DangXuat;
    
    public void init(){
        jpanelThanhben = new JPanel();
        jpanelThanhben.setBackground(Color.decode("#F5EDE0"));
        jpanelThanhben.setPreferredSize(new Dimension(100,600));
        
        jpanelThanhben.setLayout( new GridLayout(8,1));
        //jpanelThanhben.setLayout(new BoxLayout(jpanelThanhben, BoxLayout.Y_AXIS));
        jlabel_TaiKhoan();
        jlabel_NhanVien();
        jlabel_SanPham();
        jlabel_DonHang();
        jlabel_KhachHang();
        jlabel_ThongKe();
        jlabel_DangXuat();
        
        jpanelThanhben.setAlignmentY(Component.CENTER_ALIGNMENT);
    }
    
    public void jlabel_TaiKhoan(){
        jlabel_TaiKhoan = new JLabel("TÀI KHOẢN");
        jlabel_TaiKhoan.setForeground(Color.decode("#7E5020"));
        jlabel_TaiKhoan.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/person_12122984.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_TaiKhoan.setIcon(newIcon);
        jlabel_TaiKhoan.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_TaiKhoan.setHorizontalTextPosition(SwingConstants.CENTER);
        
        jlabel_TaiKhoan.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpanelThanhben.add(jlabel_TaiKhoan);
    }
    
    public void jlabel_NhanVien(){
        jlabel_NhanVien = new JLabel("NHÂN VIÊN");
        jlabel_NhanVien.setForeground(Color.decode("#7E5020"));
        jlabel_NhanVien.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/staff.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_NhanVien.setIcon(newIcon);
        jlabel_NhanVien.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_NhanVien.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_NhanVien);
    }
    
    public void jlabel_SanPham(){
        jlabel_SanPham = new JLabel("SẢN PHẨM");
        jlabel_SanPham.setForeground(Color.decode("#7E5020"));
        jlabel_SanPham.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/product-icon.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_SanPham.setIcon(newIcon);
        jlabel_SanPham.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_SanPham.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_SanPham);
    }
    
    public void jlabel_DonHang(){
        jlabel_DonHang = new JLabel("ĐƠN HÀNG");
        jlabel_DonHang.setForeground(Color.decode("#7E5020"));
        jlabel_DonHang.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/donhang-icon.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_DonHang.setIcon(newIcon);
        jlabel_DonHang.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_DonHang.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_DonHang);
    }
    
    public void jlabel_KhachHang(){
        jlabel_KhachHang = new JLabel("KHÁCH HÀNG");
        jlabel_KhachHang.setForeground(Color.decode("#7E5020"));
        jlabel_DonHang.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/buyers-icon.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_KhachHang.setIcon(newIcon);
        jlabel_KhachHang.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_KhachHang.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_KhachHang);
    }
    
    public void jlabel_ThongKe(){
        jlabel_ThongKe = new JLabel("THỐNG KÊ");
        jlabel_ThongKe.setForeground(Color.decode("#7E5020"));
        jlabel_ThongKe.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/statistic-icon.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_ThongKe.setIcon(newIcon);
        jlabel_ThongKe.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_ThongKe.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_ThongKe);
    }
    
    public void jlabel_DangXuat(){
        jlabel_DangXuat = new JLabel();
        jlabel_DangXuat.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon/exit-icon.png"));
        Image image = icon.getImage().getScaledInstance(40,40,java.awt.Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(image);
        jlabel_DangXuat.setIcon(newIcon);
        jlabel_DangXuat.setVerticalTextPosition(SwingConstants.BOTTOM);
        jlabel_DangXuat.setHorizontalTextPosition(SwingConstants.CENTER);
        jpanelThanhben.add(jlabel_DangXuat);
    }
    
    
    public static void main(String[] args) {
        ThanhBen a = new ThanhBen();
        a.init();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(a.jpanelThanhben);
    frame.pack();
    frame.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
    frame.setVisible(true);
        
        
        
       
    }

   
   
    
}
