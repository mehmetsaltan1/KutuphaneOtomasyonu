import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Mehmet Saltan
 */
public class Kitapİs {
     private Connection con = null;
    
    private Statement st = null;
    
    private PreparedStatement pr = null;
    public void KitapEkle(String kitapisim,String yazari,String turu,String sayfasay,String yayin){
        String sorgu = "Insert Into kitaplar (kitapismi,yazari,turu,sayfasayisi,yayinevi) VALUES(?,?,?,?,?)";
        
        try {
            pr = con.prepareStatement(sorgu);
            pr.setString(1, kitapisim);
            pr.setString(2, yazari);
            pr.setString(3, turu);
            pr.setString(4, sayfasay);
            pr.setString(5, yayin);
            pr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Kitapİs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void KitapGuncelle(int id, String yeni_isim ,String yeni_yazar,String yeni_tur,String yeni_sayfa,String yeni_yayin){
        String sorgula = "Update kitaplar set kitapismi = ? , yazari = ? , turu = ? , sayfasayisi = ?, yayinevi = ? where id=?";
        
        try {
            pr = con.prepareStatement(sorgula);
            pr.setString(1, yeni_isim);
            pr.setString(2, yeni_yazar);
            pr.setString(3, yeni_tur);
            pr.setString(4, yeni_sayfa);
            pr.setString(5, yeni_yayin);
           pr.setInt(6, id);
            pr.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Kitapİs.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void KitapSil(int id ){
        String sorgu = "Delete from kitaplar where id = ?";
        
        try {
            
            pr = con.prepareStatement(sorgu);
            pr.setInt(1, id);
            
            pr.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Kitapİs.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public ArrayList<Kitaplar> kitaplarigetir(){
    
    ArrayList<Kitaplar> cikti=new ArrayList<Kitaplar>();
         try {
             st =con.createStatement();
             String sorgu = "Select *From kitaplar";
             ResultSet rs=st.executeQuery(sorgu);
             while(rs.next()){
                       int id = rs.getInt("id");
                       String kitapisim = rs.getString("kitapismi");
                       String yazar = rs.getString("yazari");
                       String tur = rs.getString("turu");
                       String sayfa = rs.getString("sayfasayisi");
                       String yayin = rs.getString("yayinevi");
                       cikti.add(new Kitaplar(id, kitapisim, yazar, tur, sayfa,yayin));
                    }
                    return cikti;
         } catch (SQLException ex) {
             Logger.getLogger(Kitapİs.class.getName()).log(Level.SEVERE, null, ex);
             return null;
         }
    }
    
    public boolean Giris(String kullanici,String sifre){
     String sor = "Select * From girisbilgi where user = ? and pass = ?";
        try {
            pr= con.prepareStatement(sor);
            
            pr.setString(1, kullanici);
            pr.setString(2, sifre);
            
            
            ResultSet rs = pr.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(Kitapİs.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }
    
    }
    public Kitapİs(){
    
    String url = "jdbc:mysql://" + VeriTabani.host + ":" + VeriTabani.port + "/" + VeriTabani.veri_ismi+ "?useUnicode=true&characterEncoding=utf8";
     
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, VeriTabani.kullaniciadi, VeriTabani.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } 
        catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Kitapİs nesnesi=new Kitapİs();
    }
}
