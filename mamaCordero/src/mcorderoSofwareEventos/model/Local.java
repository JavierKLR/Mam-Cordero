package mcorderoSofwareEventos.model;

public class Local {
    private int id;
    private String nombre;
    private String ubicacion;
    private int capacidad;
    private int costo_arriendo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCosto_arriendo() {
        return costo_arriendo;
    }

    public void setCosto_arriendo(int costo_arriendo) {
        this.costo_arriendo = costo_arriendo;
    }

    public Local(String nombre, String ubicacion, int capacidad, int costo_arriendo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.costo_arriendo = costo_arriendo;
    }

    public Local() {
    }
    
}
