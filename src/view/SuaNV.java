/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Tran Thi Kieu Oanh
 */
public class SuaNV extends javax.swing.JFrame {

    /**
     * Creates new form SuaNV
     */
    public SuaNV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackgpround1 = new view.panelBackgpround();
        jPanel1 = new javax.swing.JPanel();
        jLabel_title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel_noidung = new javax.swing.JPanel();
        jLabel_manv = new javax.swing.JLabel();
        jLabel_ten = new javax.swing.JLabel();
        jLabel_sdt = new javax.swing.JLabel();
        jLabel_diachi = new javax.swing.JLabel();
        jTextField_manv = new javax.swing.JTextField();
        jTextField_ten = new javax.swing.JTextField();
        jTextField_ngsinh = new javax.swing.JTextField();
        jTextField_diachi = new javax.swing.JTextField();
        jButton_them = new javax.swing.JButton();
        jButton_huy = new javax.swing.JButton();
        jLabel_ngayvl = new javax.swing.JLabel();
        jLabel_ngsinh = new javax.swing.JLabel();
        jTextField_sdt = new javax.swing.JTextField();
        jTextField_ngvl = new javax.swing.JTextField();
        jLabel_manql = new javax.swing.JLabel();
        jTextField_manql = new javax.swing.JTextField();
        jLabel_matk = new javax.swing.JLabel();
        jTextField_matk = new javax.swing.JTextField();
        jLabel_gioitinh = new javax.swing.JLabel();
        jTextField_gioitinh = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 237, 224));
        jPanel1.setForeground(new java.awt.Color(148, 135, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("CHỈNH SỬA THÔNG TIN NHÂN VIÊN");

        jSeparator1.setForeground(new java.awt.Color(94, 42, 14));

        jPanel_noidung.setBackground(new java.awt.Color(245, 237, 224));

        jLabel_manv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_manv.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_manv.setText("Mã nhân viên");

        jLabel_ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ten.setText("Tên nhân viên");

        jLabel_sdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_sdt.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_sdt.setText("Số điện thoại");

        jLabel_diachi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_diachi.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_diachi.setText("Địa chỉ");

        jTextField_manv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_manv.setForeground(new java.awt.Color(94, 42, 14));
        jTextField_manv.setText("1");

        jTextField_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ten.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_ngsinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ngsinh.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_diachi.setForeground(new java.awt.Color(94, 42, 14));

        jButton_them.setBackground(new java.awt.Color(94, 42, 14));
        jButton_them.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_them.setForeground(new java.awt.Color(255, 255, 255));
        jButton_them.setText("THÊM");
        jButton_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_themActionPerformed(evt);
            }
        });

        jButton_huy.setBackground(new java.awt.Color(94, 42, 14));
        jButton_huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_huy.setForeground(new java.awt.Color(255, 255, 255));
        jButton_huy.setText("HỦY");

        jLabel_ngayvl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ngayvl.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ngayvl.setText("Ngày vào làm");

        jLabel_ngsinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ngsinh.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_ngsinh.setText("Ngày sinh");

        jTextField_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_sdt.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_ngvl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ngvl.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_manql.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_manql.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_manql.setText("Mã người quản lý");

        jTextField_manql.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_manql.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_matk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_matk.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_matk.setText("Mã tài khoản");

        jTextField_matk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_matk.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_gioitinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_gioitinh.setForeground(new java.awt.Color(94, 42, 14));
        jLabel_gioitinh.setText("Giới tính");

        jTextField_gioitinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_gioitinh.setForeground(new java.awt.Color(94, 42, 14));

        javax.swing.GroupLayout jPanel_noidungLayout = new javax.swing.GroupLayout(jPanel_noidung);
        jPanel_noidung.setLayout(jPanel_noidungLayout);
        jPanel_noidungLayout.setHorizontalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_manv))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_diachi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_noidungLayout.createSequentialGroup()
                        .addGap(0, 314, Short.MAX_VALUE)
                        .addComponent(jButton_huy)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_them))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_ngayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ngvl))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_sdt))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_manql, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_manql))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_matk, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_matk))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_ngsinh)
                            .addComponent(jTextField_ten)
                            .addComponent(jTextField_gioitinh))))
                .addContainerGap())
        );
        jPanel_noidungLayout.setVerticalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_manv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_manv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_manql, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_manql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_matk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_matk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ngsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ngvl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_ngayvl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_huy)
                    .addComponent(jButton_them))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(jPanel_noidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_noidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_themActionPerformed

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
            java.util.logging.Logger.getLogger(SuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huy;
    private javax.swing.JButton jButton_them;
    private javax.swing.JLabel jLabel_diachi;
    private javax.swing.JLabel jLabel_gioitinh;
    private javax.swing.JLabel jLabel_manql;
    private javax.swing.JLabel jLabel_manv;
    private javax.swing.JLabel jLabel_matk;
    private javax.swing.JLabel jLabel_ngayvl;
    private javax.swing.JLabel jLabel_ngsinh;
    private javax.swing.JLabel jLabel_sdt;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_noidung;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_diachi;
    private javax.swing.JTextField jTextField_gioitinh;
    private javax.swing.JTextField jTextField_manql;
    private javax.swing.JTextField jTextField_manv;
    private javax.swing.JTextField jTextField_matk;
    private javax.swing.JTextField jTextField_ngsinh;
    private javax.swing.JTextField jTextField_ngvl;
    private javax.swing.JTextField jTextField_sdt;
    private javax.swing.JTextField jTextField_ten;
    private view.panelBackgpround panelBackgpround1;
    // End of variables declaration//GEN-END:variables
}
