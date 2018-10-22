package mcorderoSofwareEventos.model.baseDeDatos;

import java.sql.SQLException;
import mcorderoSofwareEventos.model.Local;

public class Data {
        private Conexion con;
    
    public Data() throws ClassNotFoundException, SQLException{
     con = new Conexion("bdSoftwareEventos");
    }

    public String getNombreUsuario(String run){
        return null;
    }
    
    
    public void crearLocal(Local l) throws SQLException{
        String insert = "INSERT INTO local VALUES("
                + "NULL,"
            + "'"+l.getNombre()+"',"
            + "'"+l.getUbicacion()+"',"
            + "'"+l.getCapacidad()+"',"
            + "'"+l.getCosto_arriendo()+"')";
        con.ejecutar(insert);           
    }

    public void eliminarLocal(int id)throws SQLException{
        String delete = "DELETE FROM"
                + " local "
                + "WHERE "
                + "id ='"+id+"';";
        con.ejecutar(delete);
    }
    
    
    public void setLocal (Local l) {
        String update = "UPDATE local SET"
                + "capacidad = '"+l.getCapacidad()+"',"
                + "costo_arriendo = '"+l.getCosto_arriendo()+"'";
        
    }
    
    
    













}
