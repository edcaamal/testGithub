package models;

import java.util.ArrayList;

public class Municipio {
    public static ArrayList<Municipio> municipios = new ArrayList<>();

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
    
    public static void llenarMunicipios(){
        municipios.add(new Municipio(1, "Calinki")); //0
        municipios.add(new Municipio(2, "Campeche")); //1
        municipios.add(new Municipio(3, "Carmen"));   //2
        municipios.add(new Municipio(7, "Palizada"));  //3
        System.out.println(municipios);
        
    }
    
    public static void listarMunicipiosForE(){
        System.out.println("For E");
        for (Municipio municipio : municipios) {
            System.out.println(municipio);
        }
    } 
    
    public static void listarMunicipiosForI(){
        System.out.println("For I");
        for (int i = 0; i < municipios.size(); i++) {
            System.out.println(municipios.get(i).toString());
        }
    }
    
    public static void eliminarMunicipio(int id){
        municipios.remove(id);
    }
    
    public static void insertarMunicipio(int id, String nombre){
        // TODO Validar que el registro no exista
        municipios.add(new Municipio(id, nombre));
    }
    
   public static void actualizarMunicipio(int recNo, int id, String nombre){
        municipios.get(recNo).setId(id);
        municipios.get(recNo).setNombre(nombre);
    }     
    
    
    
}
