package mcorderoSofwareEventos.model;

public class Evento {
    private int id;
    private int  fecha;
    private String lugar;
    private int cliente_id_fk ;
    private int servicio_id_fk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

  

    public int getCliente_id_fk() {
        return cliente_id_fk;
    }

    public void setCliente_id_fk(int cliente_id_fk) {
        this.cliente_id_fk = cliente_id_fk;
    }

    public int getServicio_id_fk() {
        return servicio_id_fk;
    }

    public void setServicio_id_fk(int servicio_id_fk) {
        this.servicio_id_fk = servicio_id_fk;
    }

    public int getNum_asistentes() {
        return num_asistentes;
    }

    public void setNum_asistentes(int num_asistentes) {
        this.num_asistentes = num_asistentes;
    }
    private int   num_asistentes;
    
}
