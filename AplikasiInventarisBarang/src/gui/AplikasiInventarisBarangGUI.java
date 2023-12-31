/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author acer
 */
public class AplikasiInventarisBarangGUI extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiInventarisBarangGUI
     */
    public AplikasiInventarisBarangGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        tfMerek = new javax.swing.JTextField();
        tfJumlah = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Data = new javax.swing.JTable();
        btTambah = new javax.swing.JButton();
        btBersih = new javax.swing.JButton();
        btKeluar = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btSimpan = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jcTop = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jcTipe = new javax.swing.JComboBox<>();
        btnEkspor = new javax.swing.JButton();
        btnImpor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Inventaris Barang", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 10))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 24)); // NOI18N
        jLabel1.setText("WARMINDO");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLabel4.setText("\"Warung Makan Indomie\"");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(362, 362, 362))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("No");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Merek");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Toping");

        tfNo.setBackground(new java.awt.Color(204, 204, 255));
        tfNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoActionPerformed(evt);
            }
        });
        tfNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNoKeyReleased(evt);
            }
        });

        tfMerek.setBackground(new java.awt.Color(204, 204, 255));
        tfMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMerekActionPerformed(evt);
            }
        });

        tfJumlah.setBackground(new java.awt.Color(204, 204, 255));

        Data.setBackground(new java.awt.Color(204, 204, 204));
        Data.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Merek", "Tipe", "Toping", "Jumlah"
            }
        ));
        jScrollPane1.setViewportView(Data);

        btTambah.setBackground(new java.awt.Color(102, 255, 102));
        btTambah.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btBersih.setBackground(new java.awt.Color(255, 0, 0));
        btBersih.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btBersih.setText("Bersihkan");
        btBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBersihActionPerformed(evt);
            }
        });

        btKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btKeluar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btKeluar.setText("Keluar");
        btKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKeluarActionPerformed(evt);
            }
        });

        btUbah.setBackground(new java.awt.Color(255, 255, 102));
        btUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btSimpan.setBackground(new java.awt.Color(153, 255, 102));
        btSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btSimpan.setText("Simpan");
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(255, 51, 51));
        btHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        jcTop.setBackground(new java.awt.Color(204, 204, 255));
        jcTop.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcTop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Telur Dadar", "Telur Rebus", "Kerupuk", "Sosis", "Sayur" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Jumlah");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipe");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Cari");

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jcTipe.setBackground(new java.awt.Color(204, 204, 255));
        jcTipe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcTipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kuah", "Goreng" }));

        btnEkspor.setBackground(new java.awt.Color(102, 204, 255));
        btnEkspor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEkspor.setText("Ekspor");
        btnEkspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEksporActionPerformed(evt);
            }
        });

        btnImpor.setBackground(new java.awt.Color(102, 102, 255));
        btnImpor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImpor.setText("Impor");
        btnImpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btKeluar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(btTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBersih))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcTop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jcTipe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNo, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                            .addComponent(tfMerek))))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5)
                                .addGap(30, 30, 30)
                                .addComponent(btUbah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btHapus))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnEkspor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnImpor)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEkspor)
                    .addComponent(btnImpor))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcTipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btTambah)
                            .addComponent(btBersih))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btUbah)
                    .addComponent(btSimpan)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btKeluar)
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMerekActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        //Mendapatkan model tabel dari JTable "Data"
        DefaultTableModel model  = (DefaultTableModel) Data.getModel();
        //Mengisi Kolom Input
        if (tfNo.getText().trim().equals("") || tfMerek.getText().trim().equals("") || tfJumlah.getText().trim().equals("")){
            //Menampilkan Pesan Kesalahan jika ada Kolom input yang yang kosong
            JOptionPane.showMessageDialog(null, "Data yang anda isi belum lengkap \n SIlahkan Lengkapi");
        } else {
            //Menambah baris baru ke tabel dengan data dari kolom input
            model.addRow(new Object[]{tfNo.getText(),tfMerek.getText(),jcTipe.getSelectedItem(),jcTop.getSelectedItem(), tfJumlah.getText()});
            //Tampilan pesan berhasil jika data berhasil ditambahkan
            JOptionPane.showMessageDialog(null, "Data anda berhasil di input");
        }
        //Mengosongkan kolom input setelah data ditambahkan
        tfNo.setText("");
        tfMerek.setText("");
        jcTipe.setSelectedItem("Kuah");
        jcTop.setSelectedItem("Telur Dadar");
        tfJumlah.setText("");
        
        //Mengatifkan beberapa tombol setelah data ditambahkan
        btnEkspor.setEnabled(true);
        btnImpor.setEnabled(true);
        btUbah.setEnabled(true);
        btSimpan.setEnabled(true);
        btHapus.setEnabled(true);
    }//GEN-LAST:event_btTambahActionPerformed

    private void btBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBersihActionPerformed
        //Mengosongkan kolom input
        tfNo.setText("");
        tfMerek.setText("");
        jcTipe.setSelectedItem("");
        jcTop.setSelectedItem("");
        tfJumlah.setText("");
        //Menetapkan fokus kembali pada kolom "tfNo" setelah membersihkan input
        tfNo.requestFocus();
    }//GEN-LAST:event_btBersihActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        //Mendapatkan model tabel dari JTable "Data"
        DefaultTableModel model = (DefaultTableModel) Data.getModel();
        if (Data.getSelectedRow()==-1) {
            //Menampilkan pesan kesalahan jika tidak ada baris yang dipilih
            if (Data.getSelectedRow()==0) {
                JOptionPane.showMessageDialog(null, "Anda belum memilih data");
            }else{
                JOptionPane.showMessageDialog(null, "Silahkan Pilih Data");
            }
        }else{
            
         //Mengisi kolom input dengan nlai dari baris yang dipilih dalam tabel
         tfNo.setText(model.getValueAt(Data.getSelectedRow(), 0).toString());
         tfMerek.setText(model.getValueAt(Data.getSelectedRow(), 1).toString());
         jcTipe.setSelectedItem(model.getValueAt(Data.getSelectedRow(), 2).toString());
         jcTop.setSelectedItem(model.getValueAt(Data.getSelectedRow(), 3).toString());
         tfJumlah.setText(model.getValueAt(Data.getSelectedRow(), 4).toString());
         //Menonaktifkan tombol tambah Data
         btTambah.setEnabled(false);
        }
    }//GEN-LAST:event_btUbahActionPerformed

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed

        DefaultTableModel model = (DefaultTableModel) Data.getModel();
        if (Data.getSelectedRow()==-1) {
            // Menampilkan pesan kesalahan jika tidak ada baris yang dipilih
            if (Data.getRowCount()==0) {
                JOptionPane.showMessageDialog(null, "Anda Belum Memilih Data");
            }else{
                JOptionPane.showMessageDialog(null, "Silahkan Pilih ");
            }
        }else{
            // Mengupdate nilai pada baris didalam tabel
            model.setValueAt(tfNo.getText(), Data.getSelectedRow(), 0);
            model.setValueAt(tfMerek.getText(), Data.getSelectedRow(), 1);
            model.setValueAt(jcTipe.getSelectedItem(), Data.getSelectedRow(), 2);
            model.setValueAt(jcTop.getSelectedItem(), Data.getSelectedRow(), 3);
            model.setValueAt(tfJumlah.getText(), Data.getSelectedRow(), 4);
            // Mengatifkan kembali tombol tambah data
            btTambah.setEnabled(true);
            // Menampilkan pesan berhasil
            JOptionPane.showMessageDialog((null),"Data Telah di ubah");
            // Mengosongkan kolom input setelah data disimpan
            tfNo.setText("");
            tfMerek.setText("");
            jcTipe.setSelectedItem("Kuah");
            jcTop.setSelectedItem("Telur Dadar");
            tfJumlah.setText("");
            tfNo.requestFocus();
        }
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKeluarActionPerformed
        // Menampilkan dialog konfirmasi dengan opsi Yes/No
        int a=JOptionPane.showConfirmDialog(null,"Apakah yakin ingin keluar", "select", JOptionPane.YES_NO_OPTION);
        // Memeriksa hasil dari dialog konfirmasi
        if (a==0)
        // Jika pengguna memilih "Yes" (kode 0), maka keluar dari aplikasi
        {
         System.exit(0);
        }
    }//GEN-LAST:event_btKeluarActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        //Mendapatkan model tabel dari JTable "Data"
        DefaultTableModel model = (DefaultTableModel) Data.getModel();
        if (Data.getSelectedRow()==-1) {
            if (Data.getSelectedRow()==0) {
                JOptionPane.showMessageDialog(null, "Anda  belum memilih Data");
            }else{
                JOptionPane.showMessageDialog(null, "Silahkan Pilih Data");
            }
        }else{
            // Menghapus baris yang dipilih dari tabel
            model.removeRow(Data.getSelectedRow());
            // Menampilkan pesan berhasil
            JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj=(DefaultTableModel) Data.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        Data.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter((jTextField5.getText())));
    }//GEN-LAST:event_jTextField5KeyReleased

    private void btnEksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEksporActionPerformed

        try {
            // Membuat objek BufferedWriter untuk menulis ke file "ExportData.txt"
            BufferedWriter bw = new BufferedWriter(new FileWriter("ExportData.txt"));
            
            for(int i = 0; i < Data.getRowCount(); i++) { //membaca baris table
                for(int j = 0; j < Data.getColumnCount(); j++) { //membaca Kolom table
                    // Menulis nilai dari sel tabel ke file dengan spasi sebagai pemisah
                    bw.write(Data.getValueAt(i, j).toString()+" ");
                }
                // Pindah kebaris baru setelah menulis satu baris data
                bw.newLine();
            }
           // Menampilkan pesan berhasil jika ekspor data berhasil
           JOptionPane.showMessageDialog(null, "Data Berhasil Export");
           bw.close();
        } catch (Exception e) {
            // Manampilkan Peringatan "Error" jika mencetak kesalahan pesan 
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEksporActionPerformed

    private void btnImporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporActionPerformed
        // TODO add your handling code here:
        try {
            // Agar objek BufferedReader membaca file "ImportData.txt"
            BufferedReader br = new BufferedReader(new FileReader("ImportData.txt"));
            // Model tabel dari JTable "Data"
            DefaultTableModel model = (DefaultTableModel) Data.getModel();
            // Membaca setiap baris dari file
            Object[] lines = br.lines().toArray();
            
            // Menambahkan data ke tabel berdasarkan baris yang dibaca
            for (int i = 0; i < lines.length; i++) {
                // Memisahkan nilai pada satu baris dengan spasi
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
                // Menampilkan pesan berhasil jika import data berhasil
                JOptionPane.showMessageDialog(null, "Data Berhasil Import");
            }
           
        } catch (Exception e) {
            // Manampilkan Peringatan "Error" jika mencetak kesalahan pesan
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnImporActionPerformed

    private void tfNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoActionPerformed

    private void tfNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNoKeyReleased
        // TODO add your handling code here:
        if(tfNo.getText().length()>0){
            btnEkspor.setEnabled(false);
            btnImpor.setEnabled(false);
            btUbah.setEnabled(false);
            btSimpan.setEnabled(false);
            btHapus.setEnabled(false);
        }else{
            btnEkspor.setEnabled(true);
            btnImpor.setEnabled(true);
            btUbah.setEnabled(true);
            btSimpan.setEnabled(true);
            btHapus.setEnabled(true);
        }
    }//GEN-LAST:event_tfNoKeyReleased

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
            java.util.logging.Logger.getLogger(AplikasiInventarisBarangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiInventarisBarangGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiInventarisBarangGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Data;
    private javax.swing.JButton btBersih;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btKeluar;
    private javax.swing.JButton btSimpan;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JButton btnEkspor;
    private javax.swing.JButton btnImpor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> jcTipe;
    private javax.swing.JComboBox<String> jcTop;
    private javax.swing.JTextField tfJumlah;
    private javax.swing.JTextField tfMerek;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}
