package models;

public class Municipio {
    private int id;
    private String Nombre;

    public Municipio() {
    }

    public Municipio(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Municipio{" + "id=" + id + ", Nombre=" + Nombre + '}';
    }
    
    
    
}
