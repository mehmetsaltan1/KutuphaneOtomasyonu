
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Mehmet Saltan
 */
public class KutuphaneEkrani extends javax.swing.JDialog {
    DefaultTableModel modeli;
    Kitapİs nesnesi=new Kitapİs();
    public KutuphaneEkrani(java.awt.Frame parent, boolean modal) {//Constructor Method'um
        super(parent, modal);
        initComponents();
        modeli =(DefaultTableModel) kitaplar_tablosu.getModel();
        KitapGoruntule();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kitaplar_tablosu = new javax.swing.JTable();
        arama_bar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        isim_alan = new javax.swing.JTextField();
        yazar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tur_alan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sayfa_alan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        yayin_alan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        islem_cikti = new javax.swing.JLabel();
        guncelle = new javax.swing.JButton();
        sil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kitaplar_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Kitap İsmi", "Yazari", "Turu", "Sayfa Sayisi", "Yayin Evi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kitaplar_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kitaplar_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kitaplar_tablosu);
        if (kitaplar_tablosu.getColumnModel().getColumnCount() > 0) {
            kitaplar_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(2).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(3).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(4).setResizable(false);
            kitaplar_tablosu.getColumnModel().getColumn(5).setResizable(false);
        }

        arama_bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_barKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ARAMA YAP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Kitap İsmi :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Yazari :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Turu :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sayfa Sayısı :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Yayin Evi :");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Kitap Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("İşlem Çıktısı :");

        islem_cikti.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        islem_cikti.setForeground(new java.awt.Color(204, 0, 0));

        guncelle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        guncelle.setText("Kitap Güncelle");
        guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleActionPerformed(evt);
            }
        });

        sil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sil.setText("Kitap Sil");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(arama_bar))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(islem_cikti, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tur_alan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(isim_alan, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(yayin_alan, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sayfa_alan)
                    .addComponent(yazar)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(guncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(sil, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(isim_alan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(yazar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tur_alan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(sayfa_alan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(yayin_alan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(islem_cikti)
                    .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arama_bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void AramaYap(String ara){
    TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modeli);
    
    kitaplar_tablosu.setRowSorter(tr);
    
    tr.setRowFilter(RowFilter.regexFilter(ara));
}
    private void arama_barKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_barKeyReleased
         String ara = arama_bar.getText();
        
        AramaYap(ara);
    }//GEN-LAST:event_arama_barKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 islem_cikti.setText("");
       String kitapisim = isim_alan.getText();
       String yazari = yazar.getText();
       String turu = tur_alan.getText();
       String sayfasay = sayfa_alan.getText();
       String yayin=yayin_alan.getText();
       nesnesi.KitapEkle(kitapisim,yazari,turu,sayfasay,yayin);
       KitapGoruntule();
       islem_cikti.setText("Kitap Ekleme Başarılı ...");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kitaplar_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kitaplar_tablosuMouseClicked
        int secilen = kitaplar_tablosu.getSelectedRow();
        
        isim_alan.setText(modeli.getValueAt(secilen, 1).toString());
         yazar.setText(modeli.getValueAt(secilen, 2).toString());
          tur_alan.setText(modeli.getValueAt(secilen, 3).toString());
           sayfa_alan.setText(modeli.getValueAt(secilen, 4).toString());
           yayin_alan.setText(modeli.getValueAt(secilen, 5).toString());
    }//GEN-LAST:event_kitaplar_tablosuMouseClicked

    private void guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleActionPerformed
          String kitapisim = isim_alan.getText();
          String yazarin=yazar.getText();
          String tur=tur_alan.getText();
          String sayfasay=sayfa_alan.getText();
          String yayin=yayin_alan.getText();
         int sec=kitaplar_tablosu.getSelectedRow();
        if(sec== -1){
            if(modeli.getRowCount()== 0){
                islem_cikti.setText("Kitaplar tablosu şuanda boş.");
            }else{
                islem_cikti.setText("Lütfen güncellenecek kitabı seçin.");
            }
        }else{
            int id =(int)modeli.getValueAt(sec, 0);
            
            nesnesi.KitapGuncelle(id,kitapisim,yazarin,tur,sayfasay,yayin);
            KitapGoruntule();
            islem_cikti.setText("Kitap bilgisi başarıyla güncellendi.");
    }//GEN-LAST:event_guncelleActionPerformed
    }
    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
 islem_cikti.setText("");
       int selected = kitaplar_tablosu.getSelectedRow();
       if(selected == -1){
           if(modeli.getRowCount()== 0){
               islem_cikti.setText("Kitap tablosu şu anda boş.");
           }else{
               islem_cikti.setText("Lütfen bilgileri silinecek Kitap'ı seçin.");
           }
       }else{
           int id =(int) modeli.getValueAt(selected, 0);
           nesnesi.KitapSil(id);
           KitapGoruntule();
           islem_cikti.setText("Kitap başarıyla silindi.");
       }        
    }//GEN-LAST:event_silActionPerformed
    public void KitapGoruntule(){
    modeli.setRowCount(0);//Güncelleme işlemlerinde sorun çıkmasın diye her seferinde tablomu sıfırlıyorum
     ArrayList<Kitaplar> kitapgor=new ArrayList<Kitaplar>();
       kitapgor= nesnesi.kitaplarigetir();
       if(kitapgor != null){
             for(Kitaplar kitap : kitapgor){
                 Object[] eklenecek = {kitap.getId(),kitap.getKitap_ismi(),kitap.getYazar(),kitap.getTur(),kitap.getSayfa_sayisi(),kitap.getYayin_evi()
                         
                      };
                 
                 modeli.addRow(eklenecek);
             }
       }
    }
    
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
            java.util.logging.Logger.getLogger(KutuphaneEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KutuphaneEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KutuphaneEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KutuphaneEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KutuphaneEkrani dialog = new KutuphaneEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arama_bar;
    private javax.swing.JButton guncelle;
    private javax.swing.JTextField isim_alan;
    private javax.swing.JLabel islem_cikti;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kitaplar_tablosu;
    private javax.swing.JTextField sayfa_alan;
    private javax.swing.JButton sil;
    private javax.swing.JTextField tur_alan;
    private javax.swing.JTextField yayin_alan;
    private javax.swing.JTextField yazar;
    // End of variables declaration//GEN-END:variables
}
