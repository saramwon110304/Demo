
package view;
import javax.swing.*;
import java.awt.*;
public class QuanLyTaiKhoan {
    public JPanel jpanel_bg;// khung bg 800x600 -> hình 
    public JPanel jpanel_QLTK; //
    public JTable jtable_TK;//bảng nhân tài khoản
    public JButton jbutton_ThemNV;//nút thêm
    public JButton jbutton_XoaNV;
    public JButton jbutton_SuaNV;
    
    public JPanel jpanel_Search;
    public JButton jbutton_Search;
    public JTextField txt_Search;
    
    public void init_panel(){
        jpanel_bg= new JPanel();
        jpanel_bg.setOpaque(true);
        jpanel_bg.setBackground(Color.pink);
        jpanel_bg.setPreferredSize(new Dimension(800,600));
        
        jpanel_QLTK = new JPanel();
        jpanel_QLTK.setOpaque(true);
        jpanel_QLTK.setBackground(Color.green);
        jpanel_QLTK.setPreferredSize(new Dimension(760,550));
        
    }
    
    public JPanel jpanel_QLTK(){
        search_bar();
        //table_TK();
        jpanel_bg.add(jpanel_QLTK);           
        return jpanel_bg;
    }
    
    public void search_bar() {
        jpanel_Search = new JPanel();
        jpanel_Search.setOpaque(true);
        jpanel_Search.setBackground(Color.red);
        jpanel_Search.setPreferredSize(new Dimension(800,70));
        jpanel_Search();
        jbutton_ThemNV();
        jpanel_QLTK.add(jpanel_Search);   
    }
    
    public void jpanel_Search(){
        txt_Search = new JTextField("Search");
        jbutton_Search = new JButton();
        jbutton_Search.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        jpanel_Search.add(txt_Search);
        jpanel_Search.add(jbutton_Search);
    }
    
    public void jbutton_ThemNV(){
        jbutton_ThemNV = new JButton();
        jbutton_ThemNV.setText("Thêm mới");
        jbutton_Search.setOpaque(true);
        //jbutton_Search.setBackground(Color.YELLOW);
        jbutton_ThemNV.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpanel_Search.add(jbutton_ThemNV);
    }
    
    public static void main(String[] args) {
        QuanLyTaiKhoan a = new QuanLyTaiKhoan();
        a.init_panel();
        a.jpanel_QLTK();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(a.jpanel_bg);
    frame.pack();
    frame.setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình
    frame.setVisible(true);
    }
}
