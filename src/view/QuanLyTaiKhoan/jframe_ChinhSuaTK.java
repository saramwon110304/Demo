
package view.QuanLyTaiKhoan;
/**
 *
 * @author NANG TIEN HANH
 */
public class jframe_ChinhSuaTK extends javax.swing.JFrame {

    
    public jframe_ChinhSuaTK() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_ChinhSuaTK = new javax.swing.JPanel();
        jpanel_ThongTinChinhSua = new javax.swing.JPanel();
        jlabel_MaTK = new javax.swing.JLabel();
        jlabel_MatKhau = new javax.swing.JLabel();
        jlabel_XacNhanMK = new javax.swing.JLabel();
        jlabel_TenDangNhap = new javax.swing.JLabel();
        jtxt_TenDangNhap = new javax.swing.JTextField();
        jtxt_MatKhau = new javax.swing.JTextField();
        jtxt_MaTK = new javax.swing.JTextField();
        jtxt_XacNhanMK = new javax.swing.JTextField();
        jbtn_Huy = new javax.swing.JButton();
        jbtn_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpanel_ChinhSuaTK.setBackground(new java.awt.Color(255, 255, 255));

        jpanel_ThongTinChinhSua.setBackground(new java.awt.Color(255, 255, 255));

        jlabel_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MaTK.setText("Mã tài khoản");

        jlabel_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_MatKhau.setText("Mật khẩu");

        jlabel_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_XacNhanMK.setText("Xác nhận mật khẩu");

        jlabel_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlabel_TenDangNhap.setText("Tên đăng nhập");

        jtxt_TenDangNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_MaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jtxt_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpanel_ThongTinChinhSuaLayout = new javax.swing.GroupLayout(jpanel_ThongTinChinhSua);
        jpanel_ThongTinChinhSua.setLayout(jpanel_ThongTinChinhSuaLayout);
        jpanel_ThongTinChinhSuaLayout.setHorizontalGroup(
            jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinChinhSuaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabel_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanel_ThongTinChinhSuaLayout.setVerticalGroup(
            jpanel_ThongTinChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ThongTinChinhSuaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlabel_MaTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_MaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jlabel_TenDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlabel_MatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jlabel_XacNhanMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbtn_Huy.setBackground(new java.awt.Color(236, 227, 214));
        jbtn_Huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_Huy.setForeground(new java.awt.Color(94, 42, 14));
        jbtn_Huy.setText("Hủy");

        jbtn_XacNhan.setBackground(new java.awt.Color(94, 42, 14));
        jbtn_XacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtn_XacNhan.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_XacNhan.setText("Xác nhận");

        javax.swing.GroupLayout jpanel_ChinhSuaTKLayout = new javax.swing.GroupLayout(jpanel_ChinhSuaTK);
        jpanel_ChinhSuaTK.setLayout(jpanel_ChinhSuaTKLayout);
        jpanel_ChinhSuaTKLayout.setHorizontalGroup(
            jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jpanel_ThongTinChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addGroup(jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jbtn_Huy)
                .addGap(34, 34, 34)
                .addComponent(jbtn_XacNhan)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jpanel_ChinhSuaTKLayout.setVerticalGroup(
            jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ChinhSuaTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_ThongTinChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanel_ChinhSuaTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Huy)
                    .addComponent(jbtn_XacNhan))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel_ChinhSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_ChinhSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(jframe_ChinhSuaTK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new jframe_ChinhSuaTK().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_Huy;
    private javax.swing.JButton jbtn_XacNhan;
    private javax.swing.JLabel jlabel_MaTK;
    private javax.swing.JLabel jlabel_MatKhau;
    private javax.swing.JLabel jlabel_TenDangNhap;
    private javax.swing.JLabel jlabel_XacNhanMK;
    private javax.swing.JPanel jpanel_ChinhSuaTK;
    private javax.swing.JPanel jpanel_ThongTinChinhSua;
    private javax.swing.JTextField jtxt_MaTK;
    private javax.swing.JTextField jtxt_MatKhau;
    private javax.swing.JTextField jtxt_TenDangNhap;
    private javax.swing.JTextField jtxt_XacNhanMK;
    // End of variables declaration//GEN-END:variables
}
