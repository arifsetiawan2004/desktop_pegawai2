/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;




/**
 *
 * @author ThinkPad
 */
public class Mainpage extends javax.swing.JFrame {

    /**
     * Creates new form Mainpage
     */
    public Mainpage() {
        initComponents();
        
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        bt_refresh = new javax.swing.JButton();
        bt_edit = new javax.swing.JButton();
        bt_hapus = new javax.swing.JButton();
        bt_export = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDataPegawai = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(684, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_groups_50px_2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setText("KEPEGAWAIAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(684, 60));

        jButton1.setText("Tambah Data Baru");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bt_refresh.setText("Refresh");
        bt_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_refreshActionPerformed(evt);
            }
        });

        bt_edit.setText("Edit Data");
        bt_edit.setEnabled(false);
        bt_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editActionPerformed(evt);
            }
        });

        bt_hapus.setBackground(new java.awt.Color(255, 51, 51));
        bt_hapus.setText("Hapus Data");
        bt_hapus.setEnabled(false);
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        bt_export.setText("Export Data");
        bt_export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(bt_export, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_export, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        tabelDataPegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NIP", "NAMA PEGAWAI", "ALAMAT", "NO. HP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelDataPegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataPegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDataPegawai);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Data Pegawai", jPanel4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Riwayat", jPanel6);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(698, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TambahPegawai TP = new TambahPegawai(this, true);
        TP.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_refreshActionPerformed
        bt_edit.setEnabled(false);
        bt_hapus.setEnabled(false);
        showData();
    }//GEN-LAST:event_bt_refreshActionPerformed

    private void tabelDataPegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataPegawaiMouseClicked
        int baris = tabelDataPegawai.getSelectedRow();
        if (baris != -1){
            bt_edit.setEnabled(true);
            bt_hapus.setEnabled(true);
        }
        else {
            bt_edit.setEnabled(false);
            bt_hapus.setEnabled(false);
        }
    }//GEN-LAST:event_tabelDataPegawaiMouseClicked

    private void bt_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_editActionPerformed
       int baris = tabelDataPegawai.getSelectedRow();
        if (baris != -1){
            String id = tabelDataPegawai.getValueAt(baris, 0).toString();
            String nip = tabelDataPegawai.getValueAt(baris, 1).toString();
            String nama = tabelDataPegawai.getValueAt(baris, 2).toString();
            String alamat = tabelDataPegawai.getValueAt(baris, 3).toString();
            String hp = tabelDataPegawai.getValueAt(baris, 4).toString();
            
            EditPegawai EP = new EditPegawai(this,true);
            EP.setId(id);
            EP.setNip(nip);
            EP.setNama(nama);
            EP.setAlamat(alamat);
            EP.setHp(hp);
            EP.setVisible(true);            
        }
        else {
            bt_edit.setEnabled(false);
        }
    }//GEN-LAST:event_bt_editActionPerformed

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        int baris = tabelDataPegawai.getSelectedRow();
        if (baris != -1) {
        String id = tabelDataPegawai.getValueAt(baris, 0).toString();
        String nip = tabelDataPegawai.getValueAt(baris, 1).toString();
        String nama = tabelDataPegawai.getValueAt(baris, 2).toString();
        
        int pilihan = JOptionPane.showConfirmDialog(this, 
                "Apakah Anda yakin ingin menghapus data [" + nip + "] " + nama + "?", 
                "Konfirmasi Hapus", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        
        if (pilihan == JOptionPane.YES_OPTION) {
            deleteData(id); // Panggil metode untuk menghapus data
        }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exportActionPerformed
        try {
            // Membuka dialog JFileChooser untuk memilih lokasi penyimpanan file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Pilih Lokasi Penyimpanan");
            fileChooser.setSelectedFile(new java.io.File("DataPegawai.xlsx"));
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Excel Files", "xlsx"));

            // Menampilkan dialog dan mendapatkan status pilihan
            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection != JFileChooser.APPROVE_OPTION) {
                // Jika pengguna membatalkan atau menutup dialog
                return;
            }

            // Mendapatkan lokasi dan nama file yang dipilih pengguna
            java.io.File fileToSave = fileChooser.getSelectedFile();

            org.apache.poi.ss.usermodel.Workbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
            org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("Data Pegawai");

            // Buat header untuk kolom
            org.apache.poi.ss.usermodel.Row headerRow = sheet.createRow(0);
            String[] headers = {"NIP", "Nama Pegawai", "Alamat", "No. HP"};
            for (int i = 0; i < headers.length; i++) {
                org.apache.poi.ss.usermodel.Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Ambil data dari tabel dan isi ke file Excel
            DefaultTableModel model = (DefaultTableModel) tabelDataPegawai.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                org.apache.poi.ss.usermodel.Row dataRow = sheet.createRow(row + 1);
                for (int col = 1; col < model.getColumnCount(); col++) {
                    org.apache.poi.ss.usermodel.Cell cell = dataRow.createCell(col -1);
                    cell.setCellValue(model.getValueAt(row, col).toString());
                }
            }

            // Simpan file Excel
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream(fileToSave);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

            JOptionPane.showMessageDialog(this, "Data berhasil diexport ke file DataPegawai.xlsx!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat export: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_exportActionPerformed

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
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mainpage M = new Mainpage();
                M.setExtendedState(Frame.MAXIMIZED_BOTH);
                M.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_edit;
    private javax.swing.JButton bt_export;
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_refresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable tabelDataPegawai;
    // End of variables declaration//GEN-END:variables

    public static void showData(){
        try {
            Connection K = Koneksi.sambungDB();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM pegawai";
            ResultSet R = S.executeQuery(Q);
            DefaultTableModel M = (DefaultTableModel) tabelDataPegawai.getModel();
            if(M.getRowCount()>0){
                M.getDataVector().removeAllElements();
            }
            while (R.next()) {
                String id = R.getString("id");
                String nip = R.getString("nip");
                String nama = R.getString("nama");
                String alamat = R.getString("alamat");
                String hp = R.getString("no_hp");
                Object[] data = {id, nip, nama, alamat, hp};
                M.addRow(data);
            }
        } catch (Exception e) {
            
        }
    }

    private void deleteData(String id) {
        try {
            Connection K = Koneksi.sambungDB();
            String Q = "DELETE FROM pegawai WHERE id = ?"; // Query hapus data
            PreparedStatement PS = K.prepareStatement(Q);
            PS.setString(1, id); // Set parameter ID

            int confirm = PS.executeUpdate(); // Eksekusi query
            if (confirm > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                showData(); // Refresh tabel
            } else {
                JOptionPane.showMessageDialog(this, "Gagal menghapus data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            PS.close();
            K.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void exportDataToExcel() {
        
    }

}
