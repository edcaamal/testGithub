# Uso de JTable con Nebeans, Swing y POO

Proyecto para la Universidad Autónoma de Campeche, desarrollado en la Facultad de Ingeniería, para mostrar una de las multiples formas de utilizar el componente JTable de Swing y diseñar un modelo de captura simple de datos.


## Crear el Modelo POO Municipio

Se crea un objeto para almacenar un catalogo, denominado municipio, con una estructura básica
Añadir el constructor vacio y con todos los atributos
Añadir los Getter y Setter
Añadir el método toString

```
package models;

public class Municipio {
    private int id;
    private String Nombre;
}¨
```

## Crear Objetos  de la clase Municipio
Implicito
Explicito

```
    public static void main(String[] args) {

        Municipio calkini = new Municipio(1, "Calinki");
        System.out.println(calkini.toString());
        
        Municipio campeche = new Municipio();
        campeche.setId(2);
        campeche.setNombre("Campeche");
        System.out.println(campeche.toString());

    }

```

## Poblamos nuentro ArrayList de objetos
Se crea un método llenarMunicipio

```
    public static void llenarMunicipios(){
        municipios.add(new Municipio(1, "Calinki"));
        municipios.add(new Municipio(2, "Campeche"));
        municipios.add(new Municipio(3, "Carmen"));
        System.out.println(municipios);
        
    }
```

## Métodos para eliminar e insertar

```
    public static void eliminarMunicipio(int id){
        // TODO Validar que el registro exita
        municipios.remove(id-1);
    }
    
    public static void insertarMunicipio(int id, String nombre){
        // TODO Validar que el registro no exista
        municipios.add(new Municipio(id, nombre));
    }
```

![](https://github.com/edcaamal/documentationProjects/blob/main/documentationProjects/AplicacionSwing/login.PNG?raw=true)

