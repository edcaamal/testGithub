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


![](https://github.com/edcaamal/documentationProjects/blob/main/documentationProjects/AplicacionSwing/login.PNG?raw=true)

