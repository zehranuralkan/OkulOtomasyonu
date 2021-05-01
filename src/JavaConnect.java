import java.sql.Connection;

import java.sql.*;
import javax.swing.JOptionPane;


public class JavaConnect {
      Connection conn;

    public static Connection ConnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\MERYEM\\Desktop\\okul2\\OkulOtomasyonu.db");
            return conn;

        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;

        }
    }
}
