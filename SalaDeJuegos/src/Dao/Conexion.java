package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    String jdbc_driver="com.mysql.jdbc.Driver";
    String jdbc_url="jdbc:mysql://localhost:3306/saladejuegos";
    String jdbc_user="root";
    String jdbc_pass="";
    
    private static Connection  UnaConeccion;

    public Conexion() throws ClassNotFoundException, SQLException {
        
        try {
            Class.forName(jdbc_driver);
             UnaConeccion = DriverManager.getConnection(jdbc_url, jdbc_user, jdbc_pass);
            
          
           // conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  Connection RetornarConeccion ()
    {
        
        return UnaConeccion;
    }

}
    

