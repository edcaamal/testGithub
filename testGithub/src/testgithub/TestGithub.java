package testgithub;

import java.util.ArrayList;
import models.Municipio;

public class TestGithub {
    static ArrayList<Municipio> municipios = new ArrayList<>();
    
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
        // TODO Validar que el registro exita
        municipios.remove(id-1);
    }
    
    public static void insertarMunicipio(int id, String nombre){
        // TODO Validar que el registro no exista
        municipios.add(new Municipio(id, nombre));
    }
    
    public static void main(String[] args) {
        llenarMunicipios();
        listarMunicipiosForE();
        eliminarMunicipio(3);
        listarMunicipiosForI();

    }
    
}
