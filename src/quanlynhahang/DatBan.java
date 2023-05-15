/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlynhahang;

import DAO.BanDatDAO;
import Models.BanDat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author T3D Computer
 */
public class DatBan extends javax.swing.JFrame {
    
    
    DefaultTableModel tableModel = new DefaultTableModel();
    BanDatDAO banDatDAO = new BanDatDAO();
    List<BanDat> dsBanDat = new ArrayList<>();
    String sdtCu = "";
    
    /**
     * Creates new form DatBan
     */
    public DatBan() {
        initComponents();
        tableModel = (DefaultTableModel) tblDatBan.getModel();
        try {
             dsBanDat = banDatDAO.getAll();
        } catch (Exception e) {
            System.out.println("errorr: " + e);
        } 
        hienThiThongTinBanDat();
        setLocationRelativeTo(null);
        
    }
    
    private void hienThiThongTinBanDat() {
    tableModel.setRowCount(0);
    for (BanDat banDat: dsBanDat) {
        tableModel.addRow(new Object[]{banDat.getHoKH() + " " +  banDat.getTenKH(),
       banDat.getSoDT(), banDat.getSoBan(), banDat.getGioVao(), banDat.getNgayVao(), banDat.getGhiChu()});
    }
    }
    
    String tenKH = "";
    String hoKH = "";
    private void getHoTenKH(String s) {
        
        int i = s.length() - 1;
        while (s.charAt(i) != ' ') {
            tenKH = s.charAt(i) + tenKH;
            i--;
        }
        for (int j = 0; j < i; j++) {
            hoKH = hoKH + s.charAt(j);
        }
        System.out.println("Ho: " + hoKH);
        System.out.println("Ten:  " + tenKH);
    }
 
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatBan = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnNhapMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐẶT BÀN");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Thông tin khách hàng");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Số ĐT");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Bàn số");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Thời gian");

        tblDatBan.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        tblDatBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên khách hàng", "Số điện thoại", "Bàn số", "Giờ vào", "Ngày vào", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatBan);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Ghi chú");

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/add-goods.png"))); // NOI18N
        btnNhapMoi.setText("Nhập mới");
        btnNhapMoi.setBorderPainted(false);
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderPainted(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/x-button.png"))); // NOI18N
        btnXoa.setText("Hủy bàn");
        btnXoa.setBorderPainted(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48x48/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Giờ");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Phút");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXoa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNhapMoi)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSua))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNhapMoi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        DatBanPopUp addKh = new DatBanPopUp();
        addKh.setVisible(true);
        addKh.getBtnThem().addActionListener((q) -> {
            hoKH = "";
            tenKH = "";
            getHoTenKH(addKh.getHoTen().getText());
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            String date = format1.format(addKh.getNgay().getDate());
            String gio = String.valueOf(addKh.getGio().getSelectedItem()) + ':'+ String.valueOf(addKh.getPhut().getSelectedItem()) ;
            BanDat banDaDat = new BanDat(
                    String.valueOf(addKh.getSoBn().getSelectedIndex()+1), 
                    date, 
                    gio, 
                    hoKH, 
                    tenKH, 
                    1, 
                    addKh.getSDT().getText(), 
                    addKh.getGhiChu().getText());
            System.out.println("Ban da dat: " + banDaDat.getSoDT());
            try {
                if (banDatDAO.datBan(banDaDat)) {
                    System.out.println("Thanh cong");
                    dsBanDat.add(banDaDat);
                    try {
                        System.out.println("Dang lay lai thong tin");
                        dsBanDat.clear();
                        System.out.println("Danh sach ban sau khi clear: " + dsBanDat.size());
                        dsBanDat = banDatDAO.getAll();
                        hienThiThongTinBanDat();
                        addKh.setVisible(false);
                   } catch (Exception e) {
                       System.out.println("errorr: " + e);

            } 
                }
                else {
                    System.out.println("That bai");
                }
            } catch (Exception ex) {
                Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
            }
            hoKH = "";
            tenKH = "";
        });
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
                 
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        DatBanPopUp suaDB = new DatBanPopUp();
        suaDB.setVisible(true);
        suaDB.showTen().setText("       Sửa thông tin");
        int index = tblDatBan.getSelectedRow();
        BanDat banDat = dsBanDat.get(index);
        String ten = banDat.getHoKH() + " " +  banDat.getTenKH();
        suaDB.getHoTen().setText(ten);
        suaDB.getSDT().setText(banDat.getSoDT());
        suaDB.getSoBn().setSelectedItem(banDat.getSoBan());
        try {
                Date thedate = (Date) new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(banDat.getNgayVao());
                suaDB.getNgay().setDate(thedate);
            } catch (ParseException ex) {
                Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
            }
        suaDB.getGhiChu().setText(banDat.getGhiChu());
        String gio = banDat.getGioVao().substring(0, 2);
        String phut = banDat.getGioVao().substring(3, 5);
        suaDB.getGio().setSelectedIndex(Integer.parseInt(gio) - 1);
        suaDB.getPhut().setSelectedIndex(Integer.parseInt(phut) - 1);
        suaDB.getBtnThem().addActionListener((l) -> {
            try {
            sdtCu = banDat.getSoDT();
            hoKH = "";
            tenKH = "";
            SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");
            String ngayVaoCu = banDat.getNgayVao();
            getHoTenKH(suaDB.getHoTen().getText());
            System.out.println("so dien thoai: " + banDat.getSoDT());
            System.out.println("so dien thoai man hình: " + suaDB.getSDT().getText() );
            if (!banDat.getSoDT().equals(suaDB.getSDT().getText())) {
                System.out.println("Bat dau vao day");
                System.out.println("SDT dang duoc chon: " + suaDB.getSDT().getText());
                for (BanDat banDat1: dsBanDat) {
                    if (banDat1.getSoDT().equals(suaDB.getSDT().getText())) {
                        JOptionPane.showMessageDialog(this, "Khách hàng này đã tồn tại. Không thể thay đổi");
                        suaDB.getSDT().setText(sdtCu);
                        return;
                    }
                }
            }
            banDat.setTenKH(tenKH);
            banDat.setHoKH(hoKH);
            banDat.setSoDT(suaDB.getSDT().getText());
            banDat.setSoBan(String.valueOf(suaDB.getSoBn().getSelectedItem()));
            System.out.println("So ban duoc chon: " + banDat.getSoBan());
            String date = format1.format(suaDB.getNgay().getDate());
               
            banDat.setNgayVao(date);
            banDat.setGioVao(gio + ":" +phut);
            banDat.setGhiChu(suaDB.getGhiChu().getText());
            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            if (option == 0) {
                banDatDAO.capNhatBan(banDat, sdtCu, ngayVaoCu);
                System.out.println("Cap nhat thanh cong");
                dsBanDat.clear();
                dsBanDat = banDatDAO.getAll();
                hienThiThongTinBanDat();
                System.out.println("So dien thoai cu: " + sdtCu);
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
        
        });
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tblDatBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatBanMouseClicked
//        int index = tblDatBan.getSelectedRow();
//        BanDat banDat = dsBanDat.get(index);
//        System.out.println("Ho: " + banDat.getTenKH());
//        String ten = banDat.getHoKH() + " " +  banDat.getTenKH();
//        String gio = banDat.getGioVao().substring(0, 2);
//        String phut = banDat.getGioVao().substring(3, 5);
//        System.out.println(banDat.getNgayVao());
//        try {
//            Date thedate = (Date) new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(banDat.getNgayVao());
//            dateChose.setDate(thedate);
//        } catch (ParseException ex) {
//            Logger.getLogger(DatBan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        taGhiChu.setText(banDat.getGhiChu());
//        sdtCu = txtSoDT.getText();
//        cbGio.setSelectedIndex(Integer.parseInt(gio) - 1);
//        cbPhut.setSelectedIndex(Integer.parseInt(phut) - 1);
    }//GEN-LAST:event_tblDatBanMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int index = tblDatBan.getSelectedRow();
        BanDat banDat = dsBanDat.get(index);
        int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn hủy bàn này không?");
        if (option == 0)
        {
            try {
                if (banDatDAO.huyBan(banDat)) {
                    System.out.println("Huy ban thanh cong");
                    dsBanDat.clear();
                    dsBanDat = banDatDAO.getAll();
                    hienThiThongTinBanDat();
                    //resetForm();
                }
                else {
                    System.out.println("Huy that bai");
                }
            } catch (Exception e) {
                System.out.println("error: " + e);
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatBan;
    // End of variables declaration//GEN-END:variables
}
