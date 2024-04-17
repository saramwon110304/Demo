package view.QuanLyTaiKhoan;

/**
 *
 * @author NANG TIEN HANH
 */
public class jpanel_QuanLyTaiKhoan extends javax.swing.JPanel {

    public jpanel_QuanLyTaiKhoan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel_DieuKhien = new javax.swing.JPanel();
        jpanel_Search = new javax.swing.JPanel();
        jtextfield_Search = new javax.swing.JTextField();
        jlable_Search = new javax.swing.JLabel();
        jbutton_ThemTK = new javax.swing.JButton();
        jbutton_XoaTK = new javax.swing.JButton();
        jbutton_ChinhSuaTK = new javax.swing.JButton();
        jpanel_BangTK = new javax.swing.JPanel();
        jscrollpane_BangTK = new javax.swing.JScrollPane();
        jtable_BangrTK = new javax.swing.JTable();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(765, 600));

        jpanel_DieuKhien.setBackground(new java.awt.Color(204, 255, 204));
        jpanel_DieuKhien.setOpaque(false);
        jpanel_DieuKhien.setPreferredSize(new java.awt.Dimension(765, 150));

        jpanel_Search.setOpaque(false);

        jtextfield_Search.setText("Search");
        jtextfield_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextfield_SearchActionPerformed(evt);
            }
        });

        jlable_Search.setBackground(new java.awt.Color(255, 255, 255));
        jlable_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search_FILL0_wght400_GRAD0_opsz24.png"))); // NOI18N
        jlable_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlable_Search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlable_Search.setOpaque(true);

        javax.swing.GroupLayout jpanel_SearchLayout = new javax.swing.GroupLayout(jpanel_Search);
        jpanel_Search.setLayout(jpanel_SearchLayout);
        jpanel_SearchLayout.setHorizontalGroup(
            jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SearchLayout.createSequentialGroup()
                .addComponent(jtextfield_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jlable_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jpanel_SearchLayout.setVerticalGroup(
            jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_SearchLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jpanel_SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlable_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextfield_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jbutton_ThemTK.setBackground(new java.awt.Color(94, 42, 14));
        jbutton_ThemTK.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_ThemTK.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_ThemTK.setText("Thêm tài khoản");
        jbutton_ThemTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_ThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ThemTKActionPerformed(evt);
            }
        });

        jbutton_XoaTK.setBackground(new java.awt.Color(147, 94, 64));
        jbutton_XoaTK.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_XoaTK.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_XoaTK.setText("Xóa tài khoản");
        jbutton_XoaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_XoaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_XoaTKActionPerformed(evt);
            }
        });

        jbutton_ChinhSuaTK.setBackground(new java.awt.Color(177, 137, 101));
        jbutton_ChinhSuaTK.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N
        jbutton_ChinhSuaTK.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_ChinhSuaTK.setText("Chỉnh sửa");
        jbutton_ChinhSuaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_ChinhSuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ChinhSuaTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel_DieuKhienLayout = new javax.swing.GroupLayout(jpanel_DieuKhien);
        jpanel_DieuKhien.setLayout(jpanel_DieuKhienLayout);
        jpanel_DieuKhienLayout.setHorizontalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbutton_XoaTK, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jbutton_ChinhSuaTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jbutton_ThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        jpanel_DieuKhienLayout.setVerticalGroup(
            jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jpanel_DieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanel_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanel_DieuKhienLayout.createSequentialGroup()
                        .addComponent(jbutton_ThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_XoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_ChinhSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jpanel_BangTK.setOpaque(false);
        jpanel_BangTK.setPreferredSize(new java.awt.Dimension(765, 300));

        jscrollpane_BangTK.setBackground(new java.awt.Color(255, 204, 204));
        jscrollpane_BangTK.setFont(new java.awt.Font("UTM Helve", 1, 14)); // NOI18N

        jtable_BangrTK.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jtable_BangrTK.setFont(new java.awt.Font("UTM Helve", 0, 14)); // NOI18N
        jtable_BangrTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", ""},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ TÀI KHOẢN", "MÃ NHÂN VIÊN", "TÊN ĐĂNG NHẬP", "MẬT KHẨU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtable_BangrTK.getTableHeader().setResizingAllowed(false);
        jtable_BangrTK.getTableHeader().setReorderingAllowed(false);
        jscrollpane_BangTK.setViewportView(jtable_BangrTK);
        jtable_BangrTK.getAccessibleContext().setAccessibleParent(jtable_BangrTK);

        javax.swing.GroupLayout jpanel_BangTKLayout = new javax.swing.GroupLayout(jpanel_BangTK);
        jpanel_BangTK.setLayout(jpanel_BangTKLayout);
        jpanel_BangTKLayout.setHorizontalGroup(
            jpanel_BangTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_BangTKLayout.createSequentialGroup()
                .addComponent(jscrollpane_BangTK, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanel_BangTKLayout.setVerticalGroup(
            jpanel_BangTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_BangTKLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jscrollpane_BangTK, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                    .addComponent(jpanel_BangTK, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel_DieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel_BangTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jtextfield_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextfield_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextfield_SearchActionPerformed

    private void jbutton_ThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ThemTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_ThemTKActionPerformed

    private void jbutton_XoaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_XoaTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_XoaTKActionPerformed

    private void jbutton_ChinhSuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ChinhSuaTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_ChinhSuaTKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbutton_ChinhSuaTK;
    private javax.swing.JButton jbutton_ThemTK;
    private javax.swing.JButton jbutton_XoaTK;
    private javax.swing.JLabel jlable_Search;
    private javax.swing.JPanel jpanel_BangTK;
    private javax.swing.JPanel jpanel_DieuKhien;
    private javax.swing.JPanel jpanel_Search;
    private javax.swing.JScrollPane jscrollpane_BangTK;
    private javax.swing.JTable jtable_BangrTK;
    private javax.swing.JTextField jtextfield_Search;
    // End of variables declaration//GEN-END:variables
}
