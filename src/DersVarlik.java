
public class DersVarlik {
    private int DersID;
    private String DersAdi;
    private int OgretmenID;
    private int Kontenjan;
    private String Gun;
    private String DersSaati;

    public DersVarlik() {
    }
    
    public DersVarlik(int DersID,String DersAdi, int OgretmenID, int Kontenjan, String Gun,String DersSaati) {
        this.DersID=DersID;
        this.DersAdi=DersAdi;
        this.OgretmenID=OgretmenID;
        this.Kontenjan=Kontenjan;
        this.Gun=Gun;
        this.DersSaati=DersSaati;
    }

    public int getDersID() {
        return DersID;
    }

    public void setDersID(int DersID) {
        this.DersID = DersID;
    }

    public String getDersAdi() {
            return DersAdi ;   
    }

    public void setDersAdi(String DersAdi) {
        this.DersAdi=DersAdi;
    }

    public int getOgretmenID() {
        return OgretmenID;
    }

    public void setOgretmenID(int OgretmenID) {
        this.OgretmenID = OgretmenID;
    }

    public int getKontenjan() {
        return Kontenjan;
    }

    public void  setKontenjan(int Kontenjan) {
        this.Kontenjan = Kontenjan;
    }

  

    public String getGun() {
        return Gun;
    }

    public void  setGun(String Gun) {
        this.Gun = Gun;
    }
        public String getDersSaati() {
        return DersSaati;
    }

    public void  setDersSaati(String DersSaati) {
        this.DersSaati =DersSaati;
    }
}
