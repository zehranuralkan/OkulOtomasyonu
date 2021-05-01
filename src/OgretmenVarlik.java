
public class OgretmenVarlik {
    private int OgretmenID;
    private int TC;
    private String IsimSoyisim;
    private String Cinsiyet;
    private String Brans;
    private int Maas;

    public OgretmenVarlik() {
    }
    
    public OgretmenVarlik(int OgretmenID, int TC, String IsimSoyisim, String Cinsiyet, String Brans, int Maas) {
        this.OgretmenID = OgretmenID;
        this.TC = TC;
        this.IsimSoyisim = IsimSoyisim;
        this.Cinsiyet = Cinsiyet;
        this.Brans = Brans;
        this.Maas = Maas;
    }

 
    public int getOgretmenID() {
        return OgretmenID;
    }

    public void setOgretmenID(int OgretmenID) {
        this.OgretmenID = OgretmenID;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }

    public String getIsimSoyisim() {
        return IsimSoyisim;
    }

    public void setIsimSoyisim(String IsimSoyisim) {
        this.IsimSoyisim = IsimSoyisim;
    }

    public String getCinsiyet() {
        return Cinsiyet;
    }

    public void setCinsiyet(String Cinsiyet) {
        this.Cinsiyet = Cinsiyet;
    }

    public String getBrans() {
        return Brans;
    }

    public void setBrans(String Brans) {
        this.Brans = Brans;
    }

    public int getMaas() {
        return Maas;
    }

    public void setMaas(int Maas) {
        this.Maas = Maas;
    }

  
    
    
}
