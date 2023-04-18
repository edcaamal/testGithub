package testgithub;

import java.util.ArrayList;
import models.Municipio;

public class TestGithub {
    static ArrayList<Municipio> municipios = new ArrayList<>();
    
    public static void llenarMunicipios(){
        municipios.add(new Municipio(1, "Calinki"));
        municipios.add(new Municipio(2, "Campeche"));
        municipios.add(new Municipio(3, "Carmen"));
        System.out.println(municipios);
        
    }
    
    public static void main(String[] args) {
        llenarMunicipios();
/*
        Municipio calkini = new Municipio(1, "Calinki");
        System.out.println(calkini.toString());
        
        Municipio campeche = new Municipio();
        campeche.setId(2);
        campeche.setNombre("Campeche");
        System.out.println(campeche.toString());
*/

    }
    
}
