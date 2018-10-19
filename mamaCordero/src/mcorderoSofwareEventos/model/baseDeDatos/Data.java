package mcorderoSofwareEventos.model.baseDeDatos;

import java.sql.SQLException;

public class Data {
        private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
     con = new Conexion("bdSoftwareEventos");
    }
}
