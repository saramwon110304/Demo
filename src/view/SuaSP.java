/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Tran Thi Kieu Oanh
 */
public class SuaSP extends javax.swing.JFrame {

    /**
     * Creates new form SuaSP
     */
    public SuaSP() {
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
        jLabel_ten = new javax.swing.JLabel();
        jLabel_gia = new javax.swing.JLabel();
        jLabel_diachi = new javax.swing.JLabel();
        jLabel_sl = new javax.swing.JLabel();
        jTextField_ten = new javax.swing.JTextField();
        jTextField_gia = new javax.swing.JTextField();
        jTextField_diachi = new javax.swing.JTextField();
        jTextField_sl = new javax.swing.JTextField();
        jButton_update = new javax.swing.JButton();
        jButton_huy = new javax.swing.JButton();
        jLabel_chatlieu = new javax.swing.JLabel();
        jLabel_mota = new javax.swing.JLabel();
        jTextField_chatlieu = new javax.swing.JTextField();
        jTextField_mota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 237, 224));
        jPanel1.setForeground(new java.awt.Color(148, 135, 119));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_title.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_title.setText("CHỈNH SỬA THÔNG TIN SẢN PHẨM");

        jSeparator1.setForeground(new java.awt.Color(94, 42, 14));

        jPanel_noidung.setBackground(new java.awt.Color(245, 237, 224));

        jLabel_ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_ten.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_ten.setText("Tên sản phẩm");

        jLabel_gia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_gia.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_gia.setText("Giá tiền");

        jLabel_diachi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_diachi.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_diachi.setText("Địa chỉ");

        jLabel_sl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_sl.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_sl.setText("Số lượng");

        jTextField_ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_ten.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_gia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_gia.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_diachi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_diachi.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_sl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_sl.setForeground(new java.awt.Color(94, 42, 14));

        jButton_update.setBackground(new java.awt.Color(147, 94, 64));
        jButton_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_update.setText("CẬP NHẬT");

        jButton_huy.setBackground(new java.awt.Color(147, 94, 64));
        jButton_huy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_huy.setForeground(new java.awt.Color(255, 255, 255));
        jButton_huy.setText("HỦY");
        jButton_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_huyActionPerformed(evt);
            }
        });

        jLabel_chatlieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_chatlieu.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_chatlieu.setText("Chất liệu");

        jLabel_mota.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_mota.setForeground(new java.awt.Color(147, 94, 64));
        jLabel_mota.setText("Mô tả");

        jTextField_chatlieu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_chatlieu.setForeground(new java.awt.Color(94, 42, 14));

        jTextField_mota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_mota.setForeground(new java.awt.Color(94, 42, 14));

        javax.swing.GroupLayout jPanel_noidungLayout = new javax.swing.GroupLayout(jPanel_noidung);
        jPanel_noidung.setLayout(jPanel_noidungLayout);
        jPanel_noidungLayout.setHorizontalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ten, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_sl))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_gia))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_diachi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_noidungLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_huy)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_update))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_mota))
                    .addGroup(jPanel_noidungLayout.createSequentialGroup()
                        .addComponent(jLabel_chatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_chatlieu)))
                .addContainerGap())
        );
        jPanel_noidungLayout.setVerticalGroup(
            jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_noidungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_sl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_chatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_chatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_mota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_mota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel_noidungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_update)
                    .addComponent(jButton_huy))
                .addContainerGap())
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
                .addComponent(jLabel_title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_noidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(SuaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_huy;
    private javax.swing.JButton jButton_update;
    private javax.swing.JLabel jLabel_chatlieu;
    private javax.swing.JLabel jLabel_diachi;
    private javax.swing.JLabel jLabel_gia;
    private javax.swing.JLabel jLabel_mota;
    private javax.swing.JLabel jLabel_sl;
    private javax.swing.JLabel jLabel_ten;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_noidung;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_chatlieu;
    private javax.swing.JTextField jTextField_diachi;
    private javax.swing.JTextField jTextField_gia;
    private javax.swing.JTextField jTextField_mota;
    private javax.swing.JTextField jTextField_sl;
    private javax.swing.JTextField jTextField_ten;
    private view.panelBackgpround panelBackgpround1;
    // End of variables declaration//GEN-END:variables
}
