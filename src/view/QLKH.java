/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author Tran Thi Kieu Oanh
 */

public class QLKH extends javax.swing.JPanel {
    private BufferedImage background;
    public QLKH() {
        initComponents();
        //cài nền cho panel
       try 
         {
            // Tải hình ảnh từ thư mục Icon trong project DOAN
            background = ImageIO.read(getClass().getResource("/Icon/nen.png"));
        } catch (IOException ex) {
            // Xử lý nếu không thể đọc được hình ảnh
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        thanhBen1 = new view.ThanhBen();
        thanhBen2 = new view.ThanhBen();
        panelBackgpround1 = new view.panelBackgpround();
        jTextField_Search = new javax.swing.JTextField();
        jButtonThemKH = new javax.swing.JButton();
        jButtonChinhSua = new javax.swing.JButton();
        jButtonXoa = new javax.swing.JButton();
        jPanelNenTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKH = new javax.swing.JTable();

        jTextField_Search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(94, 42, 14));
        jTextField_Search.setPreferredSize(new java.awt.Dimension(805, 75));
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });

        jButtonThemKH.setBackground(new java.awt.Color(52, 28, 11));
        jButtonThemKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonThemKH.setForeground(new java.awt.Color(255, 255, 255));
        jButtonThemKH.setText("Thêm khách hàng");

        jButtonChinhSua.setBackground(new java.awt.Color(94, 42, 14));
        jButtonChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonChinhSua.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChinhSua.setText("Chỉnh sửa");

        jButtonXoa.setBackground(new java.awt.Color(193, 149, 120));
        jButtonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonXoa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonXoa.setText("Xóa");

        jTableKH.setBackground(new java.awt.Color(245, 237, 224));
        jTableKH.setForeground(new java.awt.Color(148, 135, 119));
        jTableKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MÃ KHÁCH HÀNG", "TÊN KHÁCH HÀNG", "SỐ ĐIỆN THOẠI", "ĐỊA CHỈ", "NGÀY ĐĂNG KÝ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableKH.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableKH);

        javax.swing.GroupLayout jPanelNenTableLayout = new javax.swing.GroupLayout(jPanelNenTable);
        jPanelNenTable.setLayout(jPanelNenTableLayout);
        jPanelNenTableLayout.setHorizontalGroup(
            jPanelNenTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNenTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNenTableLayout.setVerticalGroup(
            jPanelNenTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNenTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackgpround1Layout = new javax.swing.GroupLayout(panelBackgpround1);
        panelBackgpround1.setLayout(panelBackgpround1Layout);
        panelBackgpround1Layout.setHorizontalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackgpround1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelNenTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBackgpround1Layout.createSequentialGroup()
                        .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonThemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
        );
        panelBackgpround1Layout.setVerticalGroup(
            panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackgpround1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(panelBackgpround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonThemKH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonChinhSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonXoa)
                .addGap(18, 18, 18)
                .addComponent(jPanelNenTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTextField_Search.getAccessibleContext().setAccessibleName("jTextField_Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed
public static void main(String[] args) {
        /*SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Image Background Panel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new panelBackgpround());
                frame.pack(); //tự động điều chỉnh kích thước
                frame.setVisible(true);
            }
        });*/
        //public void run() {
                JFrame frame = new JFrame("Image Background Panel");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new panelBackgpround());
                frame.pack(); //tự động điều chỉnh kích thước
                frame.setVisible(true);
          //  }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChinhSua;
    private javax.swing.JButton jButtonThemKH;
    private javax.swing.JButton jButtonXoa;
    private javax.swing.JPanel jPanelNenTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableKH;
    private javax.swing.JTextField jTextField_Search;
    private view.panelBackgpround panelBackgpround1;
    private view.ThanhBen thanhBen1;
    private view.ThanhBen thanhBen2;
    // End of variables declaration//GEN-END:variables
}
