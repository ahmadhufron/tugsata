package penjualanbusanamuslim;
import com.sun.glass.events.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Stack;


public class Frame_penjualan_busana_muslim extends javax.swing.JFrame {
    Stack result = new Stack();
    int harga, jumlahBeli, cash ,diskon, Subtotal, totalBayar, bayar, cash1, sisa;
    int data,store;
    String sisa1;
    
    public Frame_penjualan_busana_muslim() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNamaPogram = new javax.swing.JLabel();
        jPilihan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtJumlah = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_tempat_gambar = new javax.swing.JEditorPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSisa = new javax.swing.JTextField();
        btnBayar = new javax.swing.JButton();
        jProgressBar4 = new javax.swing.JProgressBar();
        btnExit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jProgressBar5 = new javax.swing.JProgressBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        stack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jNamaPogram.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jNamaPogram.setForeground(new java.awt.Color(153, 0, 153));
        jNamaPogram.setText("Program Penjualan Busana Muslim Family");
        getContentPane().add(jNamaPogram, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 362, -1));

        jPilihan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPilihan.setText("Pilihan Busana Muslim :");
        getContentPane().add(jPilihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 80, -1, 26));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel5.setText("Harga Satuan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 104, -1));

        txtSatuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuanActionPerformed(evt);
            }
        });
        getContentPane().add(txtSatuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 166, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel6.setText("Nama Busana");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        txtNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 166, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel7.setText("Jumlah Pembelian");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtJumlah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        txtJumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtJumlahKeyTyped(evt);
            }
        });
        getContentPane().add(txtJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 73, -1));

        btnHitung.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        btnCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel9.setText("Diskon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 104, -1));

        txtDiskon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 168, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel3.setText("Total Bayar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 104, -1));

        txtBayar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 168, -1));

        panel_tempat_gambar.setBorder(null);
        jScrollPane1.setViewportView(panel_tempat_gambar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 527, 543));

        jProgressBar1.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 50, 353, 4));

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 300, 2));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel4.setText("Pembayaran Cash");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        txtCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });
        txtCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashKeyTyped(evt);
            }
        });
        getContentPane().add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 168, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jLabel10.setText("Sisa / Kembalian");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 538, -1, -1));

        txtSisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtSisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 536, 168, -1));

        btnBayar.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jProgressBar4.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 295, 2));

        btnExit.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Display Busana");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, 26));

        jProgressBar5.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jProgressBar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 295, 2));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----->PILIH<-----", "Deep Green", "Brown Choco", "Choco Black", "Choco Yellow", "Blue Yellow", "Dusty White", "Elegant Blue", "Global Retro", "Pink Fanta", "Silver Saleem", "Blue Moon" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jProgressBar3.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 0));

        jProgressBar6.setBackground(new java.awt.Color(0, 0, 0));
        jProgressBar6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jProgressBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 310, 0));

        stack.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        stack.setText("Beli Lagi");
        stack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stackActionPerformed(evt);
            }
        });
        getContentPane().add(stack, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
public int hitungd(){
        harga = Integer.parseInt(txtSatuan.getText());
        jumlahBeli = Integer.parseInt(txtJumlah.getText());
        Subtotal = harga * jumlahBeli;
         if(jumlahBeli>=3){
            return diskon = Subtotal*1/10;
            }else{
            return diskon=0;
            }
}
    private void txtSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuanActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        try {
            txtDiskon.setText(" "+hitungd());
            if (result.isEmpty()) {
                totalBayar = Subtotal - hitungd();
            } else {
                totalBayar = Subtotal - hitungd();
                store = (int) result.pop();//save nilai di store tipe data integer
                totalBayar = totalBayar + store;
            }
            
            txtBayar.setText(""+totalBayar);

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Isikan data dengan benar");
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtJumlah.setText("");
        txtSatuan.setText("");
        txtBayar.setText("");
        txtDiskon.setText("");
        txtCash.setText("");
        txtSisa.setText("");
        jComboBox1.setSelectedIndex(0);
        panel_tempat_gambar.repaint();
        
        
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        try{
        bayar = Integer.parseInt(txtBayar.getText());
        cash1 = Integer.parseInt(txtCash.getText());
        if(bayar > cash1){
            JOptionPane.showMessageDialog(null, "Maaf,Nominal yang anda masukkan kurang");
        }
        else
        {
        sisa = cash1 - bayar;
        sisa1 =Integer.toString(sisa);
                txtSisa.setText("Rp. "+sisa1);
        }
  }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Masukan nilai dengan benar");
        }
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah transaksi anda sudah selesai?","EXIT",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "Terima Kasih Atas Kunjungan Anda");
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiskonActionPerformed

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashActionPerformed

    private void txtJumlahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJumlahKeyTyped
        // TODO add your handling code here:
        /*if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!=KeyEvent.VK_BACKSPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Masukkan hanya boleh angka!!!");
        }
    */    
    }//GEN-LAST:event_txtJumlahKeyTyped

    private void txtCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashKeyTyped
         /*if (!Character.isDigit(evt.getKeyChar())&& evt.getKeyChar()!=KeyEvent.VK_BACKSPACE){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Masukkan hanya boleh angka!!!");
        }*/  
    }//GEN-LAST:event_txtCashKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String warna;
        warna =(String) jComboBox1.getSelectedItem();
        panel_tempat_gambar.removeAll();
        if(warna=="Choco Black"){
        txtSatuan.setText("1500000"); 
        txtNama.setText("Choco Black");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Choco Black.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if (warna == "Silver Saleem"){
         txtSatuan.setText("1400000");
        txtNama.setText("Siver Saleem");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Silver.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if(warna == "Deep Green"){
        txtSatuan.setText("1000000");
        txtNama.setText("Deep Green");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Deep Green.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
            
        }
           else if ( warna =="Brown Choco"){
                    txtSatuan.setText("1550000");
        txtNama.setText("Brown Choco");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Brown Choco.png"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if(warna == "Choco Yellow"){
             txtSatuan.setText("1250000");
        txtNama.setText("Choco Yellow");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Choco Yellow.png"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
    }                                   
        else if (warna == "Blue Yellow"){
                    txtSatuan.setText("1500000");
        txtNama.setText("Blue Yellow");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/yellow.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if(warna=="Dusty White"){
                txtSatuan.setText("1500000");
        txtNama.setText("Dusty White");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Dusty White.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(1, 1, 1, 1);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
    }                                     
        else if(warna=="Elegant Blue"){
        txtSatuan.setText("1300000");
        txtNama.setText("Elegant Blue");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Elegant Blue.png"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if(warna == "Global Retro"){
                    txtSatuan.setText("1600000");
        txtNama.setText("Global Retro");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Global Retro.png"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if(warna == "Pink Fanta"){
             txtSatuan.setText("1400000");
        txtNama.setText("Pink Fanta");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/pink.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
        else if (warna == "Blue Moon"){
         txtSatuan.setText("1000000");
        txtNama.setText("Blue Moon");
        JLabel label_gambar = new JLabel(new ImageIcon("src/gambar/Blue Moon.jpg"));

        //x,y,lebar, tinggi
        label_gambar.setBounds(2, 2, 2, 2);
        label_gambar.setSize(620, 620);
        panel_tempat_gambar.add(label_gambar);
        panel_tempat_gambar.repaint();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void stackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stackActionPerformed
        txtNama.setText("");
        txtJumlah.setText("");
        txtSatuan.setText("");
        txtBayar.setText("");
        txtDiskon.setText("");
        txtCash.setText("");
        txtSisa.setText("");
        jComboBox1.setSelectedIndex(0);
        panel_tempat_gambar.repaint();
        result.push(totalBayar);//ngepush total bayar berapa
    }//GEN-LAST:event_stackActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_penjualan_busana_muslim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_busana_muslim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_busana_muslim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_penjualan_busana_muslim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_penjualan_busana_muslim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNamaPogram;
    private javax.swing.JLabel jPilihan;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane panel_tempat_gambar;
    private javax.swing.JButton stack;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JTextField txtSisa;
    // End of variables declaration//GEN-END:variables
}
