package conexionsql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private String bd  = "viviendas";
    private String url = "jdbc:mysql://localhost:3306/"+bd;
    private String user = "root";
    

    Connection conec = null;

    public Connection Conecta(){ // Establece la conexión a la base de datos
        
        try {
            conec = DriverManager.getConnection(url, user, pass);
            //System.out.println("Conexión OK");
        } catch (Exception e) {
            System.out.println("Error en la conexión\n"+e);
        }
        
        return conec;
    }












    




    private String pass = "Maduraresparafrutas0";

}
