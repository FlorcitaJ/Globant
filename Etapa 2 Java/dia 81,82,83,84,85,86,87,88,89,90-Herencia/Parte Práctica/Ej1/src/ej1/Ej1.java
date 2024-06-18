/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ej1;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

public class Ej1 {

    public static void main(String[] args) {
        Animal perro1=new Perro("Stich", "Carne", 15, "Doberman");
        perro1.deQueSeAlimenta();
        
        Animal perro2=new Perro("Teddy", "Croquetas",10, "Chihuahua");
        perro2.deQueSeAlimenta();
        
        Animal gato1=new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.deQueSeAlimenta();
        
        Animal caballo1=new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.deQueSeAlimenta();
    }
    
}
