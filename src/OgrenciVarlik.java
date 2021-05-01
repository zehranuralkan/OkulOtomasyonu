public class OgrenciVarlik {
     private int OgrenciID;
    private int TC;
    private String IsimSoyisim;
    private String Cinsiyet;
    private String Kayit;

    public OgrenciVarlik() {
    }
    
    public OgrenciVarlik(int OgrenciID, int TC, String IsimSoyisim, String Cinsiyet, String Kayit) {
        this.OgrenciID = OgrenciID;
        this.TC = TC;
        this.IsimSoyisim = IsimSoyisim;
        this.Cinsiyet = Cinsiyet;
        this.Kayit = Kayit;
    }

    public int getOgrenciID() {
        return OgrenciID;
    }

    public void setOgrenciID(int OgrenciID) {
        this.OgrenciID = OgrenciID;
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

  

    public String getKayit() {
        return Kayit;
    }

    public void setKayit(String Kayit) {
        this.Kayit = Kayit;
    }
    
}
