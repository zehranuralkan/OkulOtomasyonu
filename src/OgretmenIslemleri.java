
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class OgretmenIslemleri implements IOgretmenIslemleri1, IOgretmenIslemleri2 {

    Connection connection;
    ResultSet resultSet;
    PreparedStatement statement;

    public OgretmenIslemleri() {
        connection=JavaConnect.ConnecrDb();
    }

    
    @Override
    public void ekle(OgretmenVarlik ogretmenVarlik) {
                OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
        String sql="insert into Ogretmen(OgretmenID,TC,IsimSoyisim,Cinsiyet,Brans,Maas) values (?,?,?,?,?,?)";
        try{
            statement=connection.prepareStatement(sql);
            statement.setInt(1,ogretmenVarlik.getOgretmenID());
            statement.setInt(2,ogretmenVarlik.getTC());
            statement.setString(3,ogretmenVarlik.getIsimSoyisim());
            statement.setString(4, ogretmenVarlik.getCinsiyet());
            statement.setString(5,ogretmenVarlik.getBrans());
            statement.setInt(6,ogretmenVarlik.getMaas());
            statement.execute();
            JOptionPane.showMessageDialog(null, "Yeni öğretmen oluşturuldu.");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void Guncelle(OgretmenVarlik ogretmenVarlik) {
         OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
         String sql="update Ogretmen set "
                +"TC ='"+ogretmenVarlik.getTC()+"',"
               +"IsimSoyisim ='"+ogretmenVarlik.getIsimSoyisim()+"',"
               +"Cinsiyet= '"+ogretmenVarlik.getCinsiyet()+"',"
               +"Brans='"+ogretmenVarlik.getBrans()+"',"
               +"Maas = '"+ogretmenVarlik.getMaas()+"'"
               +"where OgretmenID = "+ogretmenVarlik.getOgretmenID();
       
        try {
       
         statement=connection.prepareStatement(sql);
        statement.execute();
         JOptionPane.showMessageDialog(null, "Öğretmen güncellendi.");
         
     } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e); 
     }
    }

    @Override
    public void Sil(OgretmenVarlik ogretmenVarlik) {
       OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
           String sql="DELETE FROM Ogretmen WHERE OgretmenID = ?";
       try{
            
            
          statement=connection.prepareStatement(sql);
          statement.setInt(1,ogretmenVarlik.getOgretmenID());
           statement.executeUpdate();
          JOptionPane.showMessageDialog(null,"Silme işlemi başarılı");
 
          
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }

    @Override
    public void Listele(OgretmenVarlik ogretmenVarlik) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Ara(OgretmenVarlik ogretmenVarlik) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    
}
