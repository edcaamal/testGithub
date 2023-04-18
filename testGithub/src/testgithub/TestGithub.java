package testgithub;

import models.Municipio;

public class TestGithub {

    public static void main(String[] args) {

        Municipio calkini = new Municipio(1, "Calinki");
        System.out.println(calkini.toString());
        
        Municipio campeche = new Municipio();
        campeche.setId(2);
        campeche.setNombre("Campeche");
        System.out.println(campeche.toString());

    }
    
}
