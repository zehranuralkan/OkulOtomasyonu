
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class DersIslemleri implements IDersIslemleri1,IDersIslemleri2{
     Connection connection;
    ResultSet resultSet;
    PreparedStatement statement;

    public DersIslemleri() {
        connection=JavaConnect.ConnecrDb();
    }

    
    @Override
    public void ekle(DersVarlik dersVarlik) {
                DersIslemleri dersIslemleri = new DersIslemleri();
        String sql="insert into Ders(DersID,DersAdi,OgretmenID,Kontenjan,Gun,DersSaati) values (?,?,?,?,?,?)";
        try{
            statement=connection.prepareStatement(sql);
            statement.setInt(1,dersVarlik.getDersID());
            statement.setString(2,dersVarlik.getDersAdi());
            statement.setInt(3,dersVarlik.getOgretmenID());
            statement.setInt(4,dersVarlik.getKontenjan());
            statement.setString(5, dersVarlik.getGun());
            statement.setString(6,dersVarlik.getDersSaati());
            
            statement.execute();
            JOptionPane.showMessageDialog(null, "Yeni ders oluşturuldu.");
        }
        catch(Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void Guncelle(DersVarlik dersVarlik) {
        String sql="update Ders set "
                +"DersAdi ='"+dersVarlik.getDersAdi()+"',"
               +"OgretmenID ='"+dersVarlik.getOgretmenID()+"',"
               +"Kontenjan= '"+dersVarlik.getKontenjan()+"',"
               +"Gun='"+dersVarlik.getGun()+"',"
                +"DersSaati='"+dersVarlik.getDersSaati()+"'"
               +"where DersID = "+dersVarlik.getDersID();
       
        try {
       
         statement=connection.prepareStatement(sql);
        statement.execute();
         JOptionPane.showMessageDialog(null, "Ders güncellendi.");
         
     } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e); 
     }
    }

    @Override
    public void Listele(DersVarlik dersVarlik) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Ara(DersVarlik dersVarlik) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void Sil(DersVarlik dersVarlik) {
        DersIslemleri dersIslemleri = new DersIslemleri();
           String sql="DELETE FROM Ders WHERE DersID = ?";
       try{
            
            
          statement=connection.prepareStatement(sql);
          statement.setInt(1,dersVarlik.getDersID());
           statement.executeUpdate();
          JOptionPane.showMessageDialog(null,"Silme işlemi başarılı");
 
          
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, e); 
        }
    }

 

    
}
