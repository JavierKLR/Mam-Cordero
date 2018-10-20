package mcorderoSofwareEventos.model;

public class Evento {
    private int id;
    private int  fecha;
    private String lugar;
    private String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    private String servicio;

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

  

   
    public int getNum_asistentes() {
        return num_asistentes;
    }

    public void setNum_asistentes(int num_asistentes) {
        this.num_asistentes = num_asistentes;
    }
    private int   num_asistentes;
    
}
