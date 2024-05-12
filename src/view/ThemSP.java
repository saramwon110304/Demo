/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Tran Thi Kieu Oanh
 */
public class ThemSP extends javax.swing.JFrame {

    /**
     * Creates new form ThemSP
     */
    public ThemSP() {
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
        jLabel_masp = new javax.swing.JLabel();
        jLabel_dvt = new javax.swing.JLabel();
        jLabel_gianhap = new javax.swing.JLabel();
        jLabel_giaban = new javax.swing.JLabel();
        jTextField_masp = new javax.swing.JTextField();
        jTextField_dvt = new javax.swing.JTextField();
        jTextField_gianhap = new javax.swing.JTextField();
        jTextField_giaban = new javax.swing.JTextField();
        jButton_update = new javax.swing.JButton();
        jButton_huy = new javax.swing.JButton();
        jLabel_sl = new javax.swing.JLabel();
        jLabel_mota = new javax.swing.JLabel();
        jTextField_sl = new javax.swing.JTextField();
        jTextField_mota = new javax.swing.JTextField();
        jLabel_maloai = new javax.swing.JLabel();
        jTextField_maloai = new javax.swing.JTextField();
        jLabel_ten = new javax.swing.JLabel();
        jTextField_ten = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 237, 224));
        jPanel1.setForeground(new java.awt.Color(148, 135, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("THÊM SẢN PHẨM");

        jSeparator1.setForeground(new java.awt.Color(94, 42, 14));

        jPanel_noidung.setBackground(new java.awt.Color(245, 237, 224));

        jLabel_masp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_masp.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_masp.setText("Mã sản phẩm");

        jLabel_dvt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_dvt.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_dvt.setText("Đơn vị tính");

        jLabel_gianhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_gianhap.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_gianhap.setText("Giá nhập");

        jLabel_giaban.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_giaban.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_giaban.setText("Giá bán");

        jTextField_masp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_masp.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_dvt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_dvt.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_gianhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_gianhap.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_giaban.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_giaban.setForeground(new java.awt.Color(94, 42, 14));

        jButton_update.setBackground(new java.awt.Color(147, 94, 64));
        jButton_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("THÊM");

        jButton_huy.setBackground(new java.awt.Color(147, 94, 64));
        jButton_huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_huy.setForeground(new java.awt.Color(255, 255, 255));
        jButton_huy.setText("HỦY");
        jButton_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_huyActionPerformed(evt);
            }
        });

        jLabel_sl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_sl.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_sl.setText("Số lượng");

        jLabel_mota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_mota.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_mota.setText("Mô tả");

        jTextField_sl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_sl.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_mota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_mota.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_maloai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_maloai.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_maloai.setText("Mã loại");

        jTextField_maloai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_maloai.setForeground(new java.awt.Color(94, 42, 14));

        jLabel_ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_ten.setText("Tên sản phẩm");

        jTextField_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ten.setForeground(new java.awt.Color(94, 42, 14));

        javax.swing.GroupLayout jPanel_noidungLayout = new javax.swing.GroupLayout(jPanel_noidung);
        jPanel_noidung.setLayout(jPanel_noidungLayout);
        jPanel_noidungLayout.setHorizontalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_masp, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_giaban))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_dvt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_dvt))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_gianhap))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_mota))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_sl))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_maloai))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ten))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_noidungLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_huy)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update)))
                .addContainerGap())
        );
        jPanel_noidungLayout.setVerticalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_masp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_masp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_maloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_dvt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_dvt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_gianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_huy)
                    .addComponent(jButton_update))
                .addGap(16, 16, 16))
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
                    .addComponent(jPanel_noidung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_noidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBackgpround1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_huyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_huyActionPerformed

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
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huy;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel_dvt;
    private javax.swing.JLabel jLabel_giaban;
    private javax.swing.JLabel jLabel_gianhap;
    private javax.swing.JLabel jLabel_maloai;
    private javax.swing.JLabel jLabel_masp;
    private javax.swing.JLabel jLabel_mota;
    private javax.swing.JLabel jLabel_sl;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_noidung;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_dvt;
    private javax.swing.JTextField jTextField_giaban;
    private javax.swing.JTextField jTextField_gianhap;
    private javax.swing.JTextField jTextField_maloai;
    private javax.swing.JTextField jTextField_masp;
    private javax.swing.JTextField jTextField_mota;
    private javax.swing.JTextField jTextField_sl;
    private javax.swing.JTextField jTextField_ten;
    private view.panelBackgpround panelBackgpround1;
    // End of variables declaration//GEN-END:variables
}
