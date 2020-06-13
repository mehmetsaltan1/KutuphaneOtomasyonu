
public class Kitaplar {
    private  int id;
    private String kitap_ismi;
    private String yazar;
     private String tur;
      private String sayfa_sayisi;
      private String yayin_evi;
    public Kitaplar(int id, String kitap_ismi, String yazar, String tur, String sayfa_sayisi, String yayin_evi) {
        this.id = id;
        this.kitap_ismi = kitap_ismi;
        this.yazar = yazar;
        this.tur = tur;
        this.sayfa_sayisi = sayfa_sayisi;
        this.yayin_evi = yayin_evi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKitap_ismi() {
        return kitap_ismi;
    }

    public void setKitap_ismi(String kitap_ismi) {
        this.kitap_ismi = kitap_ismi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getSayfa_sayisi() {
        return sayfa_sayisi;
    }

    public void setSayfa_sayisi(String sayfa_sayisi) {
        this.sayfa_sayisi = sayfa_sayisi;
    }

    public String getYayin_evi() {
        return yayin_evi;
    }

    public void setYayin_evi(String yayin_evi) {
        this.yayin_evi = yayin_evi;
    }
       
}
