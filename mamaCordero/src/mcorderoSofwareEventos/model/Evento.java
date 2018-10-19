package mcorderoSofwareEventos.model;

public class Evento {
    private int id;
    private int  fecha;
    private int lugar_id_fk;
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

    public int getLugar_id_fk() {
        return lugar_id_fk;
    }

    public void setLugar_id_fk(int lugar_id_fk) {
        this.lugar_id_fk = lugar_id_fk;
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
